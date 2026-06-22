# Searching & Sorting: Problem Set

Work these in order. Coding problems are implemented against the stubs in
`problemset/`. Conceptual problems are proofs and derivations — write them in
LaTeX in your notes, with no code. Challenge problems are harder problems
implemented against the stubs in `problemset/`.

---

## Coding

- [ ] **Problem 01: Find first and last position.** Given a sorted array and a target,
  return the `(first, last)` index pair of the target's run, or `(-1, -1)` if absent.
  Use binary search; do not scan linearly.

- [ ] **Problem 02: Count inversions via merge sort.** Return the number of pairs
  `(i, j)` with `i < j` and `a[i] > a[j]`. Piggyback on the merge step.

- [ ] **Problem 03: Kth smallest element.** Given an array and `k` (1-indexed),
  return the kth smallest value. Aim for average linear time (quickselect-style).

- [ ] **Problem 04: Sort a {0,1,2} array (Dutch national flag).** Sort an array
  containing only the values 0, 1, 2 in a single pass with O(1) extra space.

- [ ] **Problem 05: Merge two sorted arrays.** Given two sorted arrays, return one
  merged sorted array. No calls to a library sort.

---

## Conceptual

- [ ] **Problem 06.** Prove the loop invariant for insertion sort and use it to argue
  correctness: state the invariant, show initialization, maintenance, and termination.

- [ ] **Problem 07.** Solve the merge sort recurrence \\( T(n) = 2T(n/2) + \Theta(n) \\)
  three ways: the recursion-tree method, substitution, and the master theorem. Show all
  steps.

- [ ] **Problem 08.** Prove the \\( \Omega(n\log n) \\) comparison lower bound using the
  decision-tree model. Justify why a tree sorting \\( n \\) elements has at least \\( n! \\)
  leaves and why its height is \\( \Omega(n\log n) \\).

- [ ] **Problem 09.** Show that counting sort is stable and explain precisely where
  stability is used to make radix sort correct. What breaks if the digit sort is unstable?

- [ ] **Problem 10.** Derive the expected running time of randomized quicksort. Set up the
  indicator-variable sum over pairs and evaluate \\( E[X] = \sum_{i<j} \Pr[\text{compare}(i,j)] \\).

- [ ] **Problem 11.** Prove that building a binary max-heap with bottom-up `Max-Heapify`
  runs in \\( O(n) \\), not \\( O(n\log n) \\). Bound the work by level.

---

## Challenge

- [ ] **Problem 12: Search in a rotated sorted array.** A sorted array is rotated at an
  unknown pivot. Find a target's index in \\( O(\log n) \\) without first finding the pivot
  separately.

- [ ] **Problem 13: Median of two sorted arrays.** Given two sorted arrays, return the
  median of their union in \\( O(\log(\min(m, n))) \\) time.

- [ ] **Problem 14: External / k-way merge.** Merge `k` sorted streams into one sorted
  output using a heap, in \\( O(N \log k) \\) total comparisons where `N` is the element count.

- [ ] **Problem 15: Maximum gap.** Given an unsorted array, find the largest difference
  between successive elements in its sorted form, in \\( O(n) \\) time and space (bucketing).

- [ ] **Problem 16: Wiggle sort.** Reorder an array so that
  `a[0] < a[1] > a[2] < a[3] ...`. Aim for O(n) average time using selection plus a
  three-way partition.
