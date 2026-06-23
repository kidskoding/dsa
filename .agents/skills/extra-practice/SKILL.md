---
name: extra-practice
description: Use when the student wants more practice problems on a topic or module: "give me more problems on X", "extra practice on hash tables", "more reps", or "$extra-practice X". Generates fresh problems, stubs, and failing tests in the workbook format. Problems only; never solutions.
---

# Extra Practice — Problem Generator

Generate fresh practice problems for a module in the workbook format. You
produce the problem, the code stub, and the failing test. The student implements
the stub until the test goes green.

Never fill the stub body and never write a solution.

## File Layout

Put everything under the target module:

```text
src/<NN-module>/extra-practice/
  PROBLEMS.md
  Extra<N>.java
  tests/
    Extra<N>Test.java
```

## Protocol

1. Resolve the student's topic to `src/<NN-module>/`. Ask if ambiguous.
2. Continue numbering from existing `Extra<N>.java`; start at `Extra1` if none
   exist.
3. Append each problem to `PROBLEMS.md` using the module's `PROBLEM_SET.md`
   style.
4. Only include a `**LeetCode:**` line for a real LeetCode problem.
5. Create a package-private `Extra<N>.java` stub with Javadoc, a short TODO
   hint, and `throw new UnsupportedOperationException`.
6. Create `tests/Extra<N>Test.java` with JUnit 5 tests for the worked examples.
7. Run `./gradlew test_<NN-module>` and confirm the new tests compile and fail
   because the stub is unimplemented.
8. Hand off to the student: they implement `Extra<N>` until the tests pass.

## Problem Format

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

### Constraints

- <bounds>

---
```

Omit the LeetCode line when there is no real link.

## Stop Conditions

- Do not write a working method body into `Extra<N>.java`.
- Do not emit an empty or fake LeetCode link.
- Do not reuse an existing `Extra<N>` number.
- Do not skip the compile-and-fail verification.
