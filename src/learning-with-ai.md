# Learning This Workbook with AI

This workbook is meant to be worked *with* an AI coding agent — Claude Code,
Cursor, Copilot, Codex, Gemini CLI, Windsurf, Aider — but in a very specific way.
Used right, the AI is the fastest tutor you have ever had. Used wrong, it is the
fastest way to learn nothing.

**The one rule: the AI never gives you the answer.** You write every note,
implement every skeleton, and solve every problem yourself. The AI *teaches* the
concepts, *checks* your work, and *drills* you — it never fills anything in.

> This repo ships guard files that put any cooperating agent into *tutor mode* by
> default. Ask one to fill a note, implement a stub, or solve a problem and it
> will decline and coach you instead. The guard is for your benefit — **don't
> fight it.**

Why so strict? Reading a handed-over solution feels like progress and produces
almost none. Mastery comes from **retrieval** — pulling the answer out of your
own head — and from **practice**. The AI's job is to make retrieval and practice
faster, not to skip them.

## Setup — any agent works

1. **Get your own copy** — use "Use this template" (or fork/clone) so you have a repo to fill in.
2. **Open it in your agent** — the guard and teaching protocol load automatically. Every agent reads its own instructions file (`CLAUDE.md`, `AGENTS.md`, `.cursor/rules/`, `GEMINI.md`, …), all of which point at the canonical `AGENTS.md`. Zero setup.
3. **(Optional) Turn on the tool layer** — the repo ships a zero-dependency MCP server in `mcp/`. If your agent supports MCP, approve the `dsa-workbook` server when prompted (no install, nothing to run). It adds push-button `teach_topic` and `generate_extra_practice` tools. See `mcp/README.md`.

The same workflow reaches you three ways — you don't choose, they just work:

- **Instruction files** — zero setup, every agent, plain English ("teach me stacks").
- **MCP tools** — approve once, deterministic (real section lists, problem numbering).
- **Claude Code skills** — `/teach`, `/extra-practice` slash commands (Claude Code only).

## The loop — repeat for every topic

### 1. Learn it — section by section

Ask your agent to teach the topic:

- Claude Code: `/teach stacks`
- Any other agent: "teach me stacks" — it follows the same protocol.

You get a **gated lecture**: the agent teaches one section, then **stops** — you
explain it back *and* fill that section's `notes/` prompts in your own words
before it continues. It grades what you wrote; it never writes it for you. That
repeats, section by section, until the topic is done.

### 2. Write your notes

This happens *inside* the gate above. Each `notes/` page is a list of italic
questions; you answer them in your own words as you are taught. Don't move on
until a section's notes hold up under the agent's grading.

### 3. Implement the code

Read your own notes, fill the `code/` skeleton, and run the module's tests until
they pass:

```
./gradlew test_03-stacks-queues
```

Skeletons throw `UnsupportedOperationException` until you implement them — red is
the starting line, green is the goal.

### 4. Get your code reviewed

> "Tests pass on my Stack — review it for edge cases and complexity I missed.
> Point them out, don't fix them."

Green tests are necessary, not sufficient.

### 5. Drill the problem set

Work the module's `PROBLEM_SET.md`: **Foundational** problems cold (write them
with no help), then **Applied**. They self-grade via tests, and LeetCode ones
link out.

### 6. Get more reps

When you want extra practice — or you're back for spaced review:

- Claude Code: `/extra-practice stacks`
- Any agent: "give me more problems on stacks"

It generates fresh problems into `src/03-stacks-queues/extra-practice/` — markdown
problems, stubs, and failing tests in the same format as the shipped set. Solve
them until `./gradlew test_03-stacks-queues` is green again.

### 7. Space it out

A few days later: "quiz me on what I struggled with last week." Spaced
repetition is what makes earlier topics stick.

> One line: **`/teach` (gated) → write notes → implement → review → drill →
> `/extra-practice` → space it out.**

## What the AI *is* for

Tutor mode is not "no help." Lean on it for:

- Explaining concepts, complexity, and worked examples *other than* the assigned problem.
- Debugging **your** code — pointing at the bug, not rewriting it.
- Setup, Gradle, tooling, and navigating the repo.
- Generating extra practice on your weak spots.

## Prompts worth keeping

| Goal | Prompt |
|---|---|
| Learn a topic | "Teach me `<topic>`" (or `/teach <topic>`) |
| Warm up | "Quiz me on `<topic>`, 5 questions, answers hidden." |
| Grade recall | "Grade my filled-in note. Mark the gaps. Don't rewrite it." |
| Unstick | "I'm stuck on `<problem>`. Give the next step only — not the solution." |
| Code review | "Tests pass. Review for edge cases and complexity. Don't fix it." |
| More reps | "More problems on `<pattern>`, harder." (or `/extra-practice <module>`) |
| Spaced review | "Quiz me on what I struggled with last week." |

## The trap

The moment you type *"just write it for me,"* you have stopped learning. If you
are tempted, that is exactly the rep that matters — ask for a hint, not the
answer. The guard will nudge you back anyway.
