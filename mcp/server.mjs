#!/usr/bin/env node
// DSA Workbook MCP server.
//
// Exposes the workbook's teaching + practice protocols as MCP tools so they work
// in ANY MCP-capable agent (Claude Code, Cursor, Windsurf, Copilot agent mode,
// Codex, Gemini CLI) — not just Claude Code skills.
//
// The server only RESOLVES and COMPUTES (reads notes headings, scans for the next
// problem number) and returns a guard-bound protocol for the agent to follow. It
// never writes solutions, notes, or implementations — the agent writes files, so
// the repo's tutor guard still applies everywhere.

import { McpServer } from "@modelcontextprotocol/sdk/server/mcp.js";
import { StdioServerTransport } from "@modelcontextprotocol/sdk/server/stdio.js";
import { z } from "zod";
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

// --- helpers ---------------------------------------------------------------

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
    const hits = q.split(/\s+/).filter((w) => w && hay.includes(w)).length;
    return hits;
  };
  return all.map((t) => ({ t, s: score(t) })).sort((a, b) => b.s - a.s)[0]?.s > 0
    ? all.map((t) => ({ t, s: score(t) })).sort((a, b) => b.s - a.s)[0].t
    : null;
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

const text = (s) => ({ content: [{ type: "text", text: s }] });

// --- server ----------------------------------------------------------------

const server = new McpServer({ name: "dsa-workbook", version: "1.0.0" });

server.tool(
  "list_curriculum",
  "List every module and topic in the DSA workbook. Use to see what can be taught or drilled.",
  {},
  async () => {
    const lines = [];
    for (const m of moduleDirs()) {
      const nd = join(SRC, m, "notes");
      const topics = existsSync(nd)
        ? readdirSync(nd).filter((f) => f.endsWith(".md")).map((f) => topTitle(join(nd, f)))
        : [];
      lines.push(`${m}: ${topics.join(", ")}`);
    }
    return text(lines.join("\n") || "No modules found.");
  }
);

server.tool(
  "teach_topic",
  "Begin a section-gated lecture on a DSA topic. Resolves the topic to its notes page, returns its real section list, and the protocol to teach one section at a time with a human-in-the-loop gate.",
  { topic: z.string().describe('Topic or module to teach, e.g. "stacks", "dijkstra", "03".') },
  async ({ topic }) => {
    const t = resolveTopic(topic);
    if (!t) return text(`No topic matched "${topic}". Call list_curriculum to see options.`);
    const secs = sections(t.file);
    const list = secs.map((s, i) => `  ${i + 1}. ${s}`).join("\n");
    return text(
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
  }
);

server.tool(
  "generate_extra_practice",
  "Set up fresh practice problems for a module. Computes the next Extra<N> number and returns the exact file layout + format the agent must create (markdown problem + stub + failing test). Problems and tests only — never solutions.",
  {
    module: z.string().describe('Module to drill, e.g. "arrays", "03", "graph-algorithms".'),
    count: z.number().int().min(1).max(20).optional().describe("How many problems (default 3)."),
  },
  async ({ module, count }) => {
    const dir = resolveModule(module);
    if (!dir) return text(`No module matched "${module}". Call list_curriculum to see options.`);
    const start = nextExtraIndex(dir);
    const n = count ?? 3;
    const idxs = Array.from({ length: n }, (_, i) => start + i);
    const base = `src/${dir}/extra-practice`;
    return text(
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
  }
);

await server.connect(new StdioServerTransport());
