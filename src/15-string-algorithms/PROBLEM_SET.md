# String Algorithms: Problem Set

Work through these in order. Coding problems are implemented against the stubs
in `problemset/`, Conceptual problems are proofs and derivations written in
LaTeX (no code), and Challenge problems are harder implementations against the
stubs.

## Coding

- `[ ]` **Problem 01: Naive Matcher.** Return every start index where a pattern
  occurs in a text using the brute-force \\( O(nm) \\) scan. Establishes the
  baseline KMP and Z improve on.
- `[ ]` **Problem 02: Prefix Function.** Compute the KMP prefix (failure)
  function of a pattern: entry `i` is the length of the longest proper prefix of
  `pattern[0..i]` that is also a suffix.
- `[ ]` **Problem 03: Z-Array.** Compute the Z-array of a string in \\( O(n) \\):
  entry `i` is the length of the longest common prefix of the string and its
  suffix starting at `i`.
- `[ ]` **Problem 04: Count Occurrences.** Return the number of (possibly
  overlapping) occurrences of a pattern in a text using any linear-time matcher.
- `[ ]` **Problem 05: Rolling Hash.** Compute the polynomial rolling hash of a
  string under a given base (radix) and modulus, in Horner form.

## Conceptual

- `[ ]` **Problem 06.** Prove that KMP runs in \\( \Theta(n + m) \\) time. Use an
  amortized/potential argument over the number of times the match pointer can
  advance versus retreat via the prefix function.
- `[ ]` **Problem 07.** Prove the prefix-function recurrence is correct: that the
  candidate borders examined are exactly the proper borders of the current
  prefix, in strictly decreasing length, and that no border is skipped.
- `[ ]` **Problem 08.** Show the Z-algorithm maintains its rightmost Z-box
  invariant \\( [l, r] \\) and that each character of the input is charged \\( O(1) \\)
  comparisons, yielding \\( \Theta(n) \\) total.
- `[ ]` **Problem 09.** Analyze Rabin–Karp: derive the expected number of spurious
  hash collisions for a random prime modulus \\( q \\), and show expected running
  time is \\( O(n + m) \\) while the worst case is \\( \Theta(nm) \\).

## Challenge

- `[ ]` **Problem 10: Shortest Period.** Given a string, return the length of its
  shortest period (smallest `p` such that the string is a prefix of an infinite
  repetition of its first `p` characters), using the prefix function.
- `[ ]` **Problem 11: Longest Prefix–Suffix Palindrome Border.** Given a string,
  return the longest proper border (prefix that is also a suffix) using the prefix
  function, without re-scanning.
- `[ ]` **Problem 12: Pattern in Cyclic Rotations.** Decide whether a pattern
  occurs in any rotation of a text in \\( O(n + m) \\), by matching the pattern
  against the text concatenated with itself.
