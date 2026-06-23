# DSA Workbook MCP Server

Makes the workbook's **teach** and **extra-practice** workflows work in *any*
MCP-capable agent — not just Claude Code skills. Same tutor guard, same
section-gated teaching, same problem format, one implementation.

**Zero dependencies, zero install.** It's a single Node file using only built-ins.
Fork → clone → your agent runs `node mcp/server.mjs` for you. Nothing to
`npm install`, nothing to host.

It only **resolves and computes** (reads a topic's real section headings, scans
for the next `Extra<N>` number) and hands back a guard-bound protocol for the
agent to follow. It never writes solutions, notes, or implementations — the agent
writes files, so the repo's "never hand over the answer" guard still applies.

## Tools

| Tool | What it does |
|---|---|
| `list_curriculum` | Lists every module and topic. |
| `teach_topic(topic)` | Resolves the topic to its notes page, returns its real section list + the section-gated lecture protocol (teach one section, gate on understanding + notes, repeat). |
| `generate_extra_practice(module, count?)` | Computes the next `Extra<N>` index and returns the exact files + format to create (markdown problem + stub + failing test). Problems and tests only. |

## Prompts / Skill Equivalents

The server also exposes MCP prompts for clients that surface prompts in a
command palette:

| Prompt | Equivalent |
|---|---|
| `teach(topic)` | Claude Code `/teach <topic>`; Codex `$teach <topic>` |
| `extra-practice(module, count?)` | Claude Code `/extra-practice <module>`; Codex `$extra-practice <module>` |

Literal command syntax is client-specific. The portable MCP version is the
prompt/tool surface above; clients that support MCP prompts can show these as
command-like entries.

## Setup

None. Requires Node 18+ (almost certainly already installed). The config files
below point your agent at `mcp/server.mjs`; the agent spawns it on demand and
shuts it down with the session.

## Per-agent configuration

Repo-scoped configs are already shipped for four agents — just approve the
server when the tool prompts:

- **Claude Code** → `.mcp.json` (run `/mcp` to approve, then the `dsa-workbook` tools).
- **Cursor** → `.cursor/mcp.json` (Settings → MCP → enable).
- **VS Code / Copilot agent mode** → `.vscode/mcp.json` (Start the server from the MCP view).
- **Zed** → `.zed/settings.json` (`context_servers`; Agent Panel shows a green dot when active).

For agents that use a global config, add this block:

```json
{
  "mcpServers": {
    "dsa-workbook": {
      "command": "node",
      "args": ["mcp/server.mjs"]
    }
  }
}
```

- **Windsurf** → `~/.codeium/windsurf/mcp_config.json`.
- **Gemini CLI** → `.gemini/settings.json` (repo) or `~/.gemini/settings.json` (global).
- **Codex** → `~/.codex/config.toml`:
  ```toml
  [mcp_servers.dsa-workbook]
  command = "node"
  args = ["mcp/server.mjs"]
  ```

> Run agents from the repo root so `mcp/server.mjs` resolves. The server figures
> out the workbook root itself; override with `DSA_WORKBOOK_ROOT` if needed.

## No MCP? You're still covered

Every agent also auto-loads the same protocol from its instruction file
(`CLAUDE.md`, `AGENTS.md`, `.cursor/rules/`, `.github/copilot-instructions.md`,
`.windsurfrules`, `GEMINI.md`, `CONVENTIONS.md`). MCP just adds the push-button,
deterministic version on top.
