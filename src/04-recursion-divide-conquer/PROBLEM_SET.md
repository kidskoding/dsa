# Recursion & Divide and Conquer: Problem Set

Statements only. No solutions. Coding problems are implemented against the stubs
in `problemset/` (and a failing test). Conceptual problems are proofs and
derivations — write them in LaTeX in your notes, with no code. Challenge problems
are harder problems implemented against the stubs in `problemset/`.

Use `\\( \\)` / `\\[ \\]` for any math (MathJax is enabled in the book).

## Coding

- [ ] **Problem 01: Sum of digits.** Given a non-negative integer `n`, return
  the sum of its base-10 digits using recursion (no loops).
- [ ] **Problem 02: Recursive power.** Compute \\( b^e \\) for a non-negative
  integer exponent `e` using exponentiation by squaring.
- [ ] **Problem 03: Reverse a string.** Return the reverse of a string using
  recursion, treating the empty string as its own reverse.
- [ ] **Problem 04: Binary search.** Return the index of a `target` in a sorted
  array using a recursive divide-and-conquer search, or `-1` if absent.
- [ ] **Problem 05: Greatest common divisor.** Compute \\( \gcd(a, b) \\) with the
  recursive Euclidean algorithm.
- [ ] **Problem 06: Power of two.** Decide whether a positive integer is a power
  of two using a recursive halving check.

## Conceptual

- [ ] **Problem 07.** Solve \\( T(n) = 2T(n/2) + \Theta(n) \\) with the
  recursion-tree method and verify it by substitution.
- [ ] **Problem 08.** Prove that Karatsuba's recurrence
  \\( T(n) = 3T(n/2) + \Theta(n) \\) solves to \\( \Theta(n^{\log_2 3}) \\).
- [ ] **Problem 09.** Prove that the closest-pair strip step needs to compare
  each point to at most a constant number of following points (the classic
  "7 (or 8) neighbours" argument).
- [ ] **Problem 10.** Prove by induction that exponentiation by squaring computes
  \\( b^e \\) using \\( \Theta(\log e) \\) multiplications.
- [ ] **Problem 11.** Show that the naive Fibonacci recursion makes
  \\( \Theta(\varphi^n) \\) calls, where \\( \varphi \\) is the golden ratio.
- [ ] **Problem 12.** State and apply the Master Theorem to classify
  \\( T(n) = 4T(n/2) + \Theta(n^2) \\), and explain which case applies and why.

## Challenge

- [ ] **Problem 13: Tower of Hanoi.** Return the minimum number of moves to
  transfer `n` disks between pegs, and confirm it equals \\( 2^n - 1 \\).
- [ ] **Problem 14: Count inversions.** Return the number of inversions in an
  array in \\( O(n \log n) \\) using a merge-sort variant.
- [ ] **Problem 15: Maximum subarray (divide & conquer).** Return the maximum
  sum of any contiguous non-empty subarray using the cross-boundary recurrence.
- [ ] **Problem 16: Quickselect.** Return the `k`-th smallest element of an
  unsorted array in expected linear time using divide-and-conquer partitioning.
