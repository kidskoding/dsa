# Learning This Workbook with AI

This workbook is built to be worked *with* an AI coding agent (Claude Code,
Cursor, Codex, etc.), but in a very specific way. When used right, the AI is the fastest tutor
you have ever had. However, using it wrong is the fastest way to learn nothing.

**The whole goal for AI / a coding agent is to never give you the answer. Instead, you work through the
problem sets and build the notes yourself. Instead, the AI focuses on teaching you the concepts and helping you learn when you have questions!**

> **NOTE**: This repo ships guard files that put coding agents into *tutor mode* by default: asking one to fill notes in for you or do the problem sets / coding exercises will decline and coach you instead. This guard is implemented for your benefit. **PLEASE DO NOT FIGHT IT**

Why so strict? Reading a handed-over solution feels like progress and produces
almost none. Mastery comes from **retrieval** (not pulling the answer out of your
own head) and from **practice** with lots of problem sets. The AI's job is to make retrieval
and practice faster, not to skip them.

## The loop, per topic

1. **Quiz cold — before you read.**
    > "Quiz me on hash tables — 5 questions, don't show the answers yet."

    Feeling the gap first makes everything after it stick harder.

2. **Read the note, then fill the blank prompts from memory.**
    Each heading in a `notes/` page is an italic question. Close the reference,
    answer them in your own words in the page.

3. **Have the AI grade your answers — not rewrite them.**
    > "Here's my filled-in `01-memory-model.md`. Grade each answer. Mark what's
    > wrong, thin, or missing. Don't rewrite it for me."

    This is the highest-value move in the whole workbook. Instant feedback on
    *your* recall is something no textbook can give you.

4. **Implement the `code/` skeleton until the JUnit tests go green.**
    Run the module's tests (see the root `README.md` for the Gradle commands).

5. **Have the AI review your passing code.**
    > "Tests pass on my `DynamicArray`. Review it for edge cases and complexity
    > I missed — point them out, don't fix them for me."

    Green tests are necessary, not sufficient.

6. **Drill the problem set.** Foundational problems cold (write them with no
    help), then Applied. When you want more reps:
    > "Give me 3 more problems on monotonic stack, increasing difficulty. I solve,
    > you check."

7. **Space it out.** Once a week:
    > "What did I struggle with last week? Quiz me on those topics."

## What the AI *is* allowed to do

Tutor mode is not "no help." Lean on it for:

- Explaining a concept, a complexity bound, or a worked example that **isn't**
  the assigned problem.
- Debugging **your** code — having it point to the bug, not rewrite it.
- Setup, Gradle, tooling, environment, and navigating the repo.
- Generating **extra** practice problems (problems only) on your weak spots.

## Prompts worth keeping

| Goal | Prompt |
|---|---|
| Warm up | "Quiz me on `<topic>`, 5 questions, answers hidden." |
| Grade recall | "Grade my filled-in note. Mark gaps. Don't rewrite it." |
| Unstick | "I'm stuck on `<problem>`. Give me the next step only — not the solution." |
| Code review | "Tests pass. Review for edge cases and complexity. Don't fix it." |
| More reps | "3 more problems on `<pattern>`, increasing difficulty. I solve, you check." |
| Spaced review | "Quiz me on what I struggled with last week." |

## The trap

The moment you type *"just write it for me,"* you have stopped learning. If you
are tempted, you are exactly where the growth is — that is the rep that matters.
Ask for a hint, not the answer.

> Fast loop, one line: **quiz cold → fill from memory → AI grades → code it →
> AI reviews → drill weak spots → space it out.**
