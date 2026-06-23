---
name: extra-practice
description: Use when the student wants MORE practice problems on a topic/module — "give me more problems on X", "extra practice on hash tables", "more reps", "/extra-practice X". Generates fresh problems (markdown + code stub + failing tests) in the workbook format. Problems only — never solutions.
---

# Extra Practice — Problem Generator

## Overview

Generate **fresh practice problems** for a module in the exact workbook format,
so the student can drill a topic or revisit it later for spaced repetition. You
produce the problem, the code stub, and the failing test (the test is a *spec*,
not a solution). The **student** implements the stub until the test goes green.

**Hard rule:** never fill the stub body, never write a solution. Problems and
tests only. (See the repo guard.)

## Where files go

Everything lands in an `extra-practice/` folder inside the target module —
isolated from the shipped `problemset/`:

```
src/<NN-module>/extra-practice/
  PROBLEMS.md                 # the problems, in the same format as PROBLEM_SET.md
  Extra<N>.java               # package-private stub — throws UnsupportedOperationException
  tests/
    Extra<N>Test.java         # JUnit 5, asserts the worked examples — fails until solved
```

The build wires `extra-practice/tests/` into the module's test source set
automatically, so `./gradlew test_<NN-module>` runs them.

## Protocol

1. **Resolve the module.** Map the student's topic to its `src/<NN-module>/`
    folder. Ask which module if it's ambiguous.

2. **Continue the numbering.** List `src/<NN-module>/extra-practice/` for existing
    `Extra<N>.java`. New problems start at the next free `N` (start at 1 if the
    folder doesn't exist yet). Never reuse a number — class names must stay unique
    within the module's source set (they share the package with `Problem1..N`).

3. **Write each problem to `PROBLEMS.md`** in the workbook format, exactly:

    ```markdown
    ## Problem <N>: <Title>

    **LeetCode:** [<num>. <name>](https://leetcode.com/problems/<slug>/)

    ### Description

    <clear prose statement>

    ### Examples

    **Example 1:**
    ```
    Input:  <...>
    Output: <...>
    ```
    <one-line why, optional>

    **Example 2:** ...  (give 2–3 worked examples)

    ### Constraints

    - <bounds, e.g. `1 <= n <= 10^5`>

    ---
    ```

    - The map class line maps Problem `<N>` → class `Extra<N>`.
    - **Only include the `**LeetCode:**` line if it's a real LeetCode problem.**
      No empty stubs — if there's no LeetCode link, omit that line entirely.
    - Mix difficulty roughly easy → hard. Vary the patterns; don't clone the
      shipped set.

4. **Write the stub `Extra<N>.java`** — package-private class, Javadoc describing
    the method, a `// TODO:` hint, and `throw new UnsupportedOperationException`.
    Mirror the style of the shipped `problemset/Problem*.java`. **No solution.**

5. **Write the failing test `tests/Extra<N>Test.java`** — JUnit 5, one `@Test`
    per worked example from the markdown, asserting the expected output. Mirror the
    style of `tests/problemset/Problem*Test.java`. The test encodes the spec; it
    must fail against the unimplemented stub.

6. **Verify it compiles and fails as intended.** Run `./gradlew test_<NN-module>`
    — the new `Extra<N>Test` should compile and FAIL (UnsupportedOperationException),
    confirming it's a real, runnable problem the student now implements.

7. **Hand off.** Point the student at `extra-practice/PROBLEMS.md` and tell them to
    implement each `Extra<N>` until its test passes. Offer to grade or review their
    attempt — never to implement it.

## Red flags — STOP

- About to write a working method body into `Extra<N>.java` → don't. Stub only.
- Emitting a `**LeetCode:**` line with no real link → remove the line.
- Reusing an existing `Extra<N>` number → bump to the next free one.
- Skipping the `./gradlew test_<NN-module>` check → not done; a problem that
  doesn't compile or doesn't fail isn't a valid drill.
