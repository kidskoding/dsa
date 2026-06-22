# Foundations: Problem Set

Statements only. No solutions. Coding problems are implemented against the stubs
in `problemset/`. Conceptual problems are proofs and derivations — write them in
LaTeX in your notes, with no code. Challenge problems are harder problems
implemented against the stubs in `problemset/`.

Use `\\( \\)` / `\\[ \\]` for any math (MathJax is enabled in the book).

## Coding

- [ ] **Problem 01: Count basic operations.** Given an integer `n`, return the
  exact number of times the innermost statement runs in a doubly nested loop
  where the inner loop runs from the outer index to `n`. Confirm your closed
  form against the simulated count.
- [ ] **Problem 02: Geometric sum.** Compute \\( \sum_{i=0}^{k-1} a r^i \\) for a
  given first term, ratio, and number of terms, handling the `r = 1` case.
- [ ] **Problem 03: Floor log base 2.** Return \\( \lfloor \log_2 n \rfloor \\)
  for an integer `n ≥ 1` using only integer operations (no floating point).
- [ ] **Problem 04: Harmonic number.** Return the `n`-th harmonic number
  \\( H_n = \sum_{i=1}^{n} 1/i \\), with `H_0 = 0`.
- [ ] **Problem 05: Dynamic array push cost.** Simulate `n` appends into a
  doubling array and return the total number of element copies performed.

## Conceptual

- [ ] **Problem 06.** Prove from the definition that \\( 5n^2 + 3n + 7 = \Theta(n^2) \\).
  Give explicit constants \\( c_1, c_2, n_0 \\).
- [ ] **Problem 07.** Prove by induction that \\( \sum_{i=1}^{n} i = \frac{n(n+1)}{2} \\).
- [ ] **Problem 08.** Prove that \\( \log(n!) = \Theta(n \log n) \\).
- [ ] **Problem 09.** Solve \\( T(n) = 2T(n/2) + \Theta(n) \\) with the
  recursion-tree method and verify it by substitution.
- [ ] **Problem 10.** Using the potential method, prove that table doubling gives
  \\( O(1) \\) amortized cost per append. State your potential function.
- [ ] **Problem 11.** Prove by contradiction that \\( \sqrt{2} \\) is irrational,
  then explain which proof technique each step uses.
- [ ] **Problem 12.** Show that \\( 2^n \\) is not \\( O(n^k) \\) for any fixed
  constant \\( k \\).

## Challenge

- [ ] **Problem 13: Master Theorem classifier.** Given `a`, `b`, and the
  exponent `d` of the additive term \\( \Theta(n^d) \\), return the exponent of
  `n` in the closed-form solution to \\( T(n) = aT(n/b) + \Theta(n^d) \\),
  signalling when a logarithmic factor appears.
- [ ] **Problem 14: Binary counter increments.** Starting from zero, perform `k`
  increments on a binary counter and return the total number of bit flips.
  Verify the amortized cost approaches 2 per increment.
- [ ] **Problem 15: Multipop stack work.** Given a sequence of `push` and
  `multipop(j)` operations encoded as integers (positive = push, negative =
  multipop count), return the total number of stack mutations performed, and
  confirm it is linear in the number of operations.
