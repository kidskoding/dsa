# Linked Lists: Problem Set

Work top to bottom. Coding problems are implemented against the stubs in
`problemset/`. Conceptual problems are proofs and derivations — write them in
LaTeX in your notes, with no code. Challenge problems are harder problems
implemented against the stubs in `problemset/`. No solutions are provided.

## Coding

- [ ] **Problem 01: Reverse a singly linked list.** Given the head of a singly
  linked list, return the head of the reversed list. Do it iteratively in
  \\( O(n) \\) time and \\( O(1) \\) extra space.
- [ ] **Problem 02: Find the middle node.** Return the middle node of a singly
  linked list. For even length, return the second of the two middle nodes. Use
  a single pass.
- [ ] **Problem 03: Detect a cycle.** Return whether the linked list contains a
  cycle, using \\( O(1) \\) extra space.
- [ ] **Problem 04: Merge two sorted lists.** Given two ascending sorted lists,
  splice their nodes into one ascending sorted list and return its head.
- [ ] **Problem 05: Remove the N-th node from the end.** Remove the N-th node
  from the end of the list in a single pass and return the new head.
- [ ] **Problem 06: Remove duplicates from a sorted list.** Given a sorted list,
  delete all nodes with duplicate values so each value appears once.

## Conceptual

- [ ] **Problem 07.** Prove that reversing a singly linked list with the
  iterative three-pointer method runs in \\( \Theta(n) \\) time and uses
  \\( O(1) \\) auxiliary space. State a loop invariant and prove it preserved.
- [ ] **Problem 08.** Prove Floyd's tortoise-and-hare cycle detection terminates
  and is correct: if a cycle of length \\( \lambda \\) exists with tail length
  \\( \mu \\), show the pointers meet, and bound the number of steps until they do.
- [ ] **Problem 09.** Derive the expected search cost of a skip list with
  promotion probability \\( p \\). Show the expected number of levels is
  \\( \Theta(\log_{1/p} n) \\) and the expected work per level is \\( O(1/(1-p)) \\),
  yielding expected \\( O(\log n) \\) search.
- [ ] **Problem 10.** For a skip list with \\( n \\) elements and \\( p = 1/2 \\),
  derive the expected total space \\( \mathbb{E}[\text{pointers}] \\) and show it is
  \\( \Theta(n) \\).
- [ ] **Problem 11.** Compare amortized cost of \\( k \\) front-insertions in a
  dynamic array vs. a singly linked list. Derive both bounds and state when each
  structure is preferable.

## Challenge

- [ ] **Problem 12: Reverse nodes in k-group.** Reverse the nodes of the list
  \\( k \\) at a time and return the modified list. Nodes left over (fewer than
  \\( k \\)) stay as-is. Use \\( O(1) \\) extra space beyond the call structure.
- [ ] **Problem 13: Copy a list with random pointers.** Each node has a `Next`
  and a `Random` pointer to any node (or null). Return a deep copy. Aim for
  \\( O(n) \\) time and \\( O(1) \\) extra space.
- [ ] **Problem 14: LRU cache.** Implement an LRU cache with \\( O(1) \\) `Get`
  and `Put` using a doubly linked list plus a hash map.
- [ ] **Problem 15: Merge k sorted lists.** Merge \\( k \\) ascending sorted lists
  into one. Target \\( O(N \log k) \\) time where \\( N \\) is the total node count.
- [ ] **Problem 16: Sort a linked list.** Sort a singly linked list in
  \\( O(n \log n) \\) time and \\( O(1) \\) auxiliary space (bottom-up merge sort).
