# Arrays: Problem Set

Work through these in order. Coding problems are implemented against the stubs in
`problemset/`. Conceptual problems are proofs and derivations — prove or derive
them in LaTeX in your notes, with no code. Challenge problems are harder problems
implemented against the stubs in `problemset/`.

## Coding

- `[ ]` **Problem 01: Reverse In Place.** Reverse an `int[]` in place using
  \\( O(1) \\) extra space. Return the same array reference.
- `[ ]` **Problem 02: Rotate Left by K.** Rotate an array left by `k`
  positions in place (`k` may exceed the length).
- `[ ]` **Problem 03: Two Sum (Sorted).** Given a sorted `int[]` and a target,
  return the two indices whose values sum to the target, or `(-1, -1)` if none.
- `[ ]` **Problem 04: Merge Two Sorted Arrays.** Merge two sorted `int[]`
  inputs into one sorted array.
- `[ ]` **Problem 05: Max Subarray Sum.** Return the maximum sum of any
  contiguous non-empty subarray (Kadane's setup).
- `[ ]` **Problem 06: Remove Duplicates From Sorted.** Compact a sorted array
  so each value appears once; return the new logical length.

## Conceptual

- `[ ]` **Problem 07.** Prove that `n` appends to a dynamic array that doubles
  capacity on overflow run in \\( \Theta(n) \\) total time, i.e. \\( \Theta(1) \\)
  amortized per append. Give both an aggregate and an accounting argument.
- `[ ]` **Problem 08.** Show that a growth factor of \\( g > 1 \\) keeps appends
  amortized \\( \Theta(1) \\), and derive how the constant depends on \\( g \\).
  Explain why \\( g = 1 \\) (grow-by-one) degrades to \\( \Theta(n) \\) amortized.
- `[ ]` **Problem 09.** Derive the row-major address formula for a
  \\( d \\)-dimensional array with extents \\( n_1, \dots, n_d \\), and prove that
  element access is \\( \Theta(d) \\) index arithmetic (\\( \Theta(1) \\) for fixed
  \\( d \\)).
- `[ ]` **Problem 10.** Argue why a contiguous array gives \\( \Theta(1) \\)
  random access but \\( \Theta(n) \\) worst-case insertion, using the word-RAM
  cost model. Contrast with a linked list.

## Challenge

- `[ ]` **Problem 11: Product Except Self.** Return an array where each
  position holds the product of all other elements, without using division and
  in \\( O(n) \\) time.
- `[ ]` **Problem 12: Spiral Order Traversal.** Given an `r x c` matrix stored
  row-major, return its elements in clockwise spiral order.
- `[ ]` **Problem 13: Rotate Matrix 90°.** Rotate an `n x n` matrix 90°
  clockwise in place.
- `[ ]` **Problem 14: Trapping Rain Water.** Given heights, compute the total
  trapped water in \\( O(n) \\) time and \\( O(1) \\) extra space.
- `[ ]` **Problem 15: Sliding Window Maximum.** Return the maximum of each
  contiguous window of size `k` in \\( O(n) \\) total time.
