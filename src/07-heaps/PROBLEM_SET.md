# Heaps & Priority Queues: Problem Set

Three sections: Coding problems are implemented against the stubs; Conceptual
problems are proofs/derivations written in LaTeX (no code); Challenge problems
are harder problems implemented against the stubs.

## Coding

- [ ] **Problem 01: Heapify down.** Given an integer array, a heap size, and an index whose two child subtrees already satisfy the max-heap property, sift the element at that index down so the whole subtree is a valid max-heap.
- [ ] **Problem 02: Is it a min-heap?** Given an integer array using the standard array-as-complete-binary-tree layout, decide whether it satisfies the min-heap property.
- [ ] **Problem 03: Heapsort.** Given an integer array, sort it ascending in place using heapsort (build a max-heap, then repeatedly extract the maximum).
- [ ] **Problem 04: k smallest elements.** Given an integer array and an integer \\( k \\), return the \\( k \\) smallest values in ascending order using a heap.
- [ ] **Problem 05: Parent / child index arithmetic.** For a 0-indexed d-ary heap with branching factor \\( d \\), return the parent index of a given node index, and the index of its \\( j \\)-th child.

## Conceptual

- [ ] **Problem 06: Build-heap is linear.** Prove that the bottom-up build-heap procedure runs in \\( \Theta(n) \\) time. Set up the cost sum \\( \sum_{h=0}^{\lfloor \lg n \rfloor} \lceil n / 2^{h+1} \rceil \, O(h) \\) and bound it using \\( \sum_{h=0}^{\infty} h / 2^h = 2 \\).
- [ ] **Problem 07: Heap height.** Prove that a binary heap on \\( n \\) elements has height \\( \lfloor \lg n \rfloor \\), and that it has at most \\( \lceil n / 2^{h+1} \rceil \\) nodes of height \\( h \\).
- [ ] **Problem 08: d-ary trade-off.** Derive the running times of insert and extract-min for a d-ary heap as functions of \\( d \\) and \\( n \\), and find the value of \\( d \\) that minimizes the total cost of Dijkstra's algorithm in terms of edges and vertices.
- [ ] **Problem 09: Fibonacci-heap potential.** Using the potential \\( \Phi = t(H) + 2 m(H) \\) (trees plus twice marked nodes), prove that insert and decrease-key have amortized cost \\( O(1) \\) and that extract-min has amortized cost \\( O(\log n) \\).
- [ ] **Problem 10: Max degree bound.** Prove that the maximum degree of any node in an \\( n \\)-node Fibonacci heap is \\( O(\log n) \\), by showing a node of degree \\( k \\) roots a subtree of at least \\( F_{k+2} \\) nodes (the Fibonacci-number bound).

## Challenge

- [ ] **Problem 11: Merge k sorted lists.** Given \\( k \\) sorted integer lists, merge them into one sorted list in \\( O(N \log k) \\) time using a min-heap, where \\( N \\) is the total number of elements.
- [ ] **Problem 12: Running median.** Process a stream of integers and, after each value, report the median of all values seen so far, using two heaps.
- [ ] **Problem 13: Heap-based meeting rooms.** Given a list of half-open meeting intervals, return the minimum number of rooms required so that no two overlapping meetings share a room, using a min-heap of end times.
- [ ] **Problem 14: Sort a nearly sorted array.** Given an array in which every element is at most \\( k \\) positions away from its sorted position, sort it in \\( O(n \log k) \\) time using a bounded-size heap.
- [ ] **Problem 15: Sliding-window maximum.** Given an integer array and a window size \\( w \\), return the maximum of each contiguous window of size \\( w \\).
