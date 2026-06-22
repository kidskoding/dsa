# Spatial Trees: Problem Set

These problems extend the trees material to k-d trees and quadtrees. Three
sections: Coding problems are implemented against the stubs; Conceptual problems
are proofs/derivations written in LaTeX (no code); Challenge problems are harder
problems implemented against the stubs.

## Coding

- [ ] **Problem 01: Squared Euclidean distance.** Given two points in the plane, return the squared Euclidean distance between them (avoid the square root so the result stays exact for nearest-neighbor comparisons).
- [ ] **Problem 02: Point inside a rectangle.** Given a point and an axis-aligned rectangle described by its inclusive bounds, decide whether the point lies inside the rectangle.
- [ ] **Problem 03: Rectangles intersect.** Given two axis-aligned rectangles, decide whether they overlap (share any area or boundary point).
- [ ] **Problem 04: Quadrant of a point.** Given a square region's center and a point known to lie inside it, return which of the four quadrants (NW, NE, SW, SE) contains the point.
- [ ] **Problem 05: Brute-force range query.** Given a list of points and an axis-aligned query rectangle, return all points inside it by scanning linearly.

## Conceptual

- [ ] **Problem 06: k-d tree build height.** Prove that building a 2-D k-d tree on \\( n \\) points by always splitting at the median gives height \\( O(\log n) \\), and derive the \\( O(n \log n) \\) build-time recurrence.
- [ ] **Problem 07: k-d tree range-query bound.** Prove that an orthogonal range query on a balanced 2-D k-d tree visits \\( O(\sqrt n + k) \\) nodes, where \\( k \\) is the number of reported points. Identify how many cells a query line can cross.
- [ ] **Problem 08: Nearest-neighbor pruning correctness.** Prove that the branch-and-bound nearest-neighbor search on a k-d tree is correct: show that any subtree pruned because its splitting-plane distance exceeds the current best radius cannot contain a closer point.
- [ ] **Problem 09: Quadtree depth vs. separation.** Let the minimum pairwise distance among \\( n \\) points be \\( d \\) and the bounding square have side \\( s \\). Derive an upper bound on the depth of a point-region quadtree in terms of \\( \lg(s / d) \\), and conclude when the tree can be unbalanced.
- [ ] **Problem 10: Quadtree space complexity.** Derive the worst-case number of nodes in a point-region quadtree storing \\( n \\) points and explain why it is not bounded by \\( O(n) \\) in general, unlike a k-d tree.

## Challenge

> **Note:** Problem 12 uses a bounded max-heap, covered in [Heaps](../07-heaps/binary-heap.md). If you're working through the modules in order and haven't reached heaps yet, skip it and come back: the rest of this set stands on its own.

- [ ] **Problem 11: Balanced k-d tree from a point set.** Given an array of points, build a balanced 2-D k-d tree by recursively selecting the median along the alternating split axis, and return its root.
- [ ] **Problem 12: k nearest neighbors.** Given a set of points and a query point, return the \\( k \\) stored points closest to the query, using a bounded max-heap during a branch-and-bound k-d tree descent.
- [ ] **Problem 13: Closest pair via spatial subdivision.** Given a set of points, return the pair with the smallest Euclidean distance between them, faster than the \\( O(n^2) \\) brute force.
- [ ] **Problem 14: Count points in range.** Given a static set of points, preprocess them so that the number of points inside any axis-aligned query rectangle can be reported efficiently, and answer a batch of such queries.
