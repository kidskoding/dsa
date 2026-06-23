#!/usr/bin/env node
// DSA Workbook MCP server — ZERO dependencies.
//
// Exposes the workbook's teaching + practice protocols as MCP tools so they work
// in ANY stdio-MCP agent (Claude Code, Cursor, Windsurf, Copilot agent mode,
// Codex, Gemini CLI) — not just Claude Code skills.
//
// MCP over stdio is just newline-delimited JSON-RPC 2.0, so this hand-implements
// the handshake with Node built-ins only. No npm install: fork -> clone -> the
// agent runs `node mcp/server.mjs` directly and it works.
//
// The server only RESOLVES and COMPUTES (reads notes headings, scans for the next
// problem number) and returns a guard-bound protocol for the agent to follow. It
// never writes solutions, notes, or implementations — the agent writes files, so
// the repo's tutor guard still applies everywhere.

import { readdirSync, readFileSync, existsSync, statSync } from "node:fs";
import { fileURLToPath } from "node:url";
import { dirname, join, relative } from "node:path";

// Workbook root = the dir that contains src/. The server lives in <root>/mcp/.
const ROOT = process.env.DSA_WORKBOOK_ROOT || dirname(dirname(fileURLToPath(import.meta.url)));
const SRC = join(ROOT, "src");

const GUARD = [
  "GUARD (always): This is a fill-it-yourself workbook. Never write into notes/,",
  "code/, or problemset/. Never implement a stub, fill a note, write a solution, or",
  "edit tests to pass. You coach, quiz, hint, and grade — the student produces every",
  "answer. Decline hand-overs even if asked directly.",
].join("\n");

// --- workbook helpers ------------------------------------------------------

const moduleDirs = () =>
  existsSync(SRC)
    ? readdirSync(SRC).filter((d) => statSync(join(SRC, d)).isDirectory()).sort()
    : [];

function resolveModule(query) {
  const q = String(query).toLowerCase().trim();
  const dirs = moduleDirs();
  return (
    dirs.find((d) => d.toLowerCase() === q) ||
    dirs.find((d) => d.toLowerCase().startsWith(q.padStart(2, "0") + "-")) ||
    dirs.find((d) => d.toLowerCase().includes(q)) ||
    null
  );
}

function topicFiles() {
  const out = [];
  for (const m of moduleDirs()) {
    const nd = join(SRC, m, "notes");
    if (!existsSync(nd)) continue;
    for (const f of readdirSync(nd).filter((f) => f.endsWith(".md"))) {
      out.push({ module: m, file: join(nd, f), rel: relative(ROOT, join(nd, f)) });
    }
  }
  return out;
}

function topTitle(path) {
  for (const ln of readFileSync(path, "utf8").split("\n")) {
    if (ln.startsWith("# ")) return ln.slice(2).trim();
  }
  return "";
}

function sections(path) {
  // Main sections = top-level "## " headings (skip "### " subheadings).
  return readFileSync(path, "utf8")
    .split("\n")
    .filter((ln) => ln.startsWith("## "))
    .map((ln) => ln.slice(3).trim())
    .filter((h) => h.toLowerCase() !== "my notes" && h.toLowerCase() !== "implementation");
}

function resolveTopic(query) {
  const q = String(query).toLowerCase().trim();
  const all = topicFiles().map((t) => ({ ...t, title: topTitle(t.file) }));
  const score = (t) => {
    const hay = (t.rel + " " + t.title).toLowerCase();
    if (t.title.toLowerCase() === q) return 100;
    if (hay.includes(q)) return 50 + (t.title.toLowerCase().includes(q) ? 10 : 0);
    return q.split(/\s+/).filter((w) => w && hay.includes(w)).length;
  };
  const ranked = all.map((t) => ({ t, s: score(t) })).sort((a, b) => b.s - a.s)[0];
  return ranked && ranked.s > 0 ? ranked.t : null;
}

function nextExtraIndex(moduleDir) {
  const ep = join(SRC, moduleDir, "extra-practice");
  if (!existsSync(ep)) return 1;
  let max = 0;
  for (const f of readdirSync(ep)) {
    const m = /^Extra(\d+)\.java$/.exec(f);
    if (m) max = Math.max(max, Number(m[1]));
  }
  return max + 1;
}

// --- tool implementations --------------------------------------------------

const ok = (s) => ({ content: [{ type: "text", text: s }] });
const fail = (s) => ({ content: [{ type: "text", text: s }], isError: true });

const tools = {
  list_curriculum: {
    description:
      "List every module and topic in the DSA workbook. Use to see what can be taught or drilled.",
    inputSchema: { type: "object", properties: {}, additionalProperties: false },
    run() {
      const lines = [];
      for (const m of moduleDirs()) {
        const nd = join(SRC, m, "notes");
        const topics = existsSync(nd)
          ? readdirSync(nd).filter((f) => f.endsWith(".md")).map((f) => topTitle(join(nd, f)))
          : [];
        lines.push(`${m}: ${topics.join(", ")}`);
      }
      return ok(lines.join("\n") || "No modules found.");
    },
  },

  teach_topic: {
    description:
      "Begin a section-gated lecture on a DSA topic. Resolves the topic to its notes page, returns its real section list, and the protocol to teach one section at a time with a human-in-the-loop gate.",
    inputSchema: {
      type: "object",
      properties: {
        topic: { type: "string", description: 'Topic or module to teach, e.g. "stacks", "dijkstra", "03".' },
      },
      required: ["topic"],
      additionalProperties: false,
    },
    run(args) {
      if (!args || typeof args.topic !== "string") return fail("teach_topic requires a string 'topic'.");
      const t = resolveTopic(args.topic);
      if (!t) return fail(`No topic matched "${args.topic}". Call list_curriculum to see options.`);
      const secs = sections(t.file);
      const list = secs.map((s, i) => `  ${i + 1}. ${s}`).join("\n");
      return ok(
        [
          GUARD,
          "",
          `TEACH: ${t.title}`,
          `Source notes page: ${t.rel}`,
          "",
          "Main sections (teach these IN ORDER, one at a time):",
          list,
          "",
          "PROTOCOL — section-gated lecture:",
          "1. Tell the student the section list above so they know the shape.",
          "2. Teach ONE section deeply: intuition -> mental model -> mechanics ->",
          "   complexity. Use analogies and a worked example on a DIFFERENT instance",
          "   than the notes prompt names. Never speak the exact sentence a prompt or",
          "   its ## Summary is asking for.",
          "3. GATE (do not skip): after the section, STOP. (a) Ask them to explain it",
          "   back; if wrong/thin, re-teach differently. (b) Have them fill that",
          "   section's notes prompts in their own words and show you; grade what they",
          "   wrote — mark wrong/thin/missing, never rewrite it.",
          "4. Only when they understand AND have written their notes, move to the next",
          "   section. Repeat for all sections.",
          "5. When done, archive the lecture to docs/lectures/<module>/<topic>.md",
          "   (re-teaching replaces that file).",
        ].join("\n")
      );
    },
  },

  generate_extra_practice: {
    description:
      "Set up fresh practice problems for a module. Computes the next Extra<N> number and returns the exact file layout + format the agent must create (markdown problem + stub + failing test). Problems and tests only — never solutions.",
    inputSchema: {
      type: "object",
      properties: {
        module: { type: "string", description: 'Module to drill, e.g. "arrays", "03", "graph-algorithms".' },
        count: { type: "integer", minimum: 1, maximum: 20, description: "How many problems (default 3)." },
      },
      required: ["module"],
      additionalProperties: false,
    },
    run(args) {
      if (!args || typeof args.module !== "string") return fail("generate_extra_practice requires a string 'module'.");
      const dir = resolveModule(args.module);
      if (!dir) return fail(`No module matched "${args.module}". Call list_curriculum to see options.`);
      const start = nextExtraIndex(dir);
      const n = Number.isInteger(args.count) ? Math.min(Math.max(args.count, 1), 20) : 3;
      const idxs = Array.from({ length: n }, (_, i) => start + i);
      const base = `src/${dir}/extra-practice`;
      return ok(
        [
          GUARD,
          "",
          `EXTRA PRACTICE for module: ${dir}`,
          `Create ${n} problem(s), numbered Extra${idxs[0]}..Extra${idxs[idxs.length - 1]}`,
          `(continuing from existing — next free index is ${start}).`,
          "",
          "Create these files:",
          `  ${base}/PROBLEMS.md            (append; same format as the module's PROBLEM_SET.md)`,
          ...idxs.map((i) => `  ${base}/Extra${i}.java          (package-private stub, throws UnsupportedOperationException)`),
          ...idxs.map((i) => `  ${base}/tests/Extra${i}Test.java  (JUnit 5, one @Test per worked example, fails until solved)`),
          "",
          "PROBLEMS.md format per problem (exactly):",
          "  ## Problem <N>: <Title>",
          "  **LeetCode:** [<num>. <name>](https://leetcode.com/problems/<slug>/)   <- only if real LeetCode; else omit this line",
          "  ### Description  <prose>",
          "  ### Examples     <2-3 worked Input/Output blocks>",
          "  ### Constraints  <bounds>",
          "  ---",
          "",
          "Rules:",
          "- Map Problem <N> in the markdown to class Extra<N>.",
          "- Mix difficulty easy -> hard; vary patterns; don't clone the shipped set.",
          "- Write the problem and the TEST (the spec) only. NEVER the solution — leave",
          "  the stub throwing. The student implements Extra<N> until the test passes.",
          `- Verify with: ./gradlew test_${dir}  (the new Extra*Test should compile and FAIL).`,
        ].join("\n")
      );
    },
  },
};

// --- minimal JSON-RPC 2.0 over newline-delimited stdio ---------------------

const PROTOCOL_VERSION = "2025-06-18";
const send = (obj) => process.stdout.write(JSON.stringify(obj) + "\n");

function dispatch(method, params) {
  switch (method) {
    case "initialize":
      return {
        protocolVersion: params?.protocolVersion || PROTOCOL_VERSION,
        capabilities: { tools: {} },
        serverInfo: { name: "dsa-workbook", version: "1.0.0" },
      };
    case "ping":
      return {};
    case "tools/list":
      return {
        tools: Object.entries(tools).map(([name, t]) => ({
          name,
          description: t.description,
          inputSchema: t.inputSchema,
        })),
      };
    case "resources/list":
      return { resources: [] };
    case "prompts/list":
      return { prompts: [] };
    case "tools/call": {
      const t = tools[params?.name];
      if (!t) return { content: [{ type: "text", text: `Unknown tool: ${params?.name}` }], isError: true };
      return t.run(params?.arguments || {});
    }
    default: {
      const e = new Error(`Method not found: ${method}`);
      e.code = -32601;
      throw e;
    }
  }
}

function onMessage(line) {
  let msg;
  try {
    msg = JSON.parse(line);
  } catch {
    return; // ignore unparseable lines
  }
  const { id, method, params } = msg;
  // Notifications (no id) get no response.
  if (id === undefined || id === null) return;
  try {
    send({ jsonrpc: "2.0", id, result: dispatch(method, params) });
  } catch (err) {
    send({ jsonrpc: "2.0", id, error: { code: err.code || -32603, message: String(err.message || err) } });
  }
}

let buf = "";
process.stdin.setEncoding("utf8");
process.stdin.on("data", (chunk) => {
  buf += chunk;
  let i;
  while ((i = buf.indexOf("\n")) >= 0) {
    const line = buf.slice(0, i).trim();
    buf = buf.slice(i + 1);
    if (line) onMessage(line);
  }
});
process.stdin.on("end", () => process.exit(0));
