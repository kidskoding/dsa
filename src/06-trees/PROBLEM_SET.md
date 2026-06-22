# Trees: Problem Set

Three sections: Coding problems are implemented against the stubs; Conceptual
problems are proofs/derivations written in LaTeX (no code); Challenge problems
are harder problems implemented against the stubs.

## Coding

- [ ] **Problem 01: Height of a binary tree.** Given the root of a binary tree, compute its height (number of edges on the longest root-to-leaf path; an empty tree has height -1).
- [ ] **Problem 02: Count nodes.** Given the root of a binary tree, count the total number of nodes.
- [ ] **Problem 03: Validate a BST.** Given the root of a binary tree, decide whether it satisfies the binary-search-tree ordering property.
- [ ] **Problem 04: Inorder successor in a BST.** Given the root of a BST and a target value present in the tree, return the next-larger value (its inorder successor), or report that none exists.
- [ ] **Problem 05: Level-order traversal.** Given the root of a binary tree, return its values grouped level by level from the root downward.

## Conceptual

- [ ] **Problem 06: AVL height bound.** Prove that an AVL tree on \\( n \\) nodes has height \\( h = O(\log n) \\). Derive the minimum number of nodes \\( N(h) \\) in an AVL tree of height \\( h \\) and connect it to the Fibonacci numbers.
- [ ] **Problem 07: Red-black height bound.** Prove that a red-black tree with \\( n \\) internal nodes has height at most \\( 2\lg(n + 1) \\). State and use the black-height lemma.
- [ ] **Problem 08: 2-3 / B-tree height.** Derive upper and lower bounds on the height of a B-tree of minimum degree \\( t \\) holding \\( n \\) keys, and specialize the result to 2-3 trees.
- [ ] **Problem 09: Splay amortization.** Using the potential method with potential \\( \Phi = \sum_x \lg(\text{size}(x)) \\), prove that the amortized cost of a splay operation is \\( O(\log n) \\). State the access lemma you rely on.
- [ ] **Problem 10: BST rotations preserve order.** Prove that a single left or right rotation preserves the BST inorder sequence, and show that rotations are inverses of each other.

## Challenge

- [ ] **Problem 11: Lowest common ancestor in a BST.** Given the root of a BST and two values both present in it, return their lowest common ancestor using the ordering property in \\( O(h) \\) time.
- [ ] **Problem 12: Reconstruct a tree from traversals.** Given the preorder and inorder traversals of a binary tree with distinct values, reconstruct and return the tree.
- [ ] **Problem 13: Kth smallest element in a BST.** Given the root of a BST and an integer \\( k \\), return the \\( k \\)-th smallest value (1-indexed) without materializing the full sorted order.
- [ ] **Problem 14: Serialize and deserialize a binary tree.** Implement a round-trip encoding of an arbitrary binary tree to a string and back.
- [ ] **Problem 15: Range count in a BST.** Given the root of a BST and an inclusive range \\([lo, hi]\\), count the number of stored keys that fall within the range efficiently.

