# Trees: Problem Set

Implementation tasks for querying binary trees. Every problem is solved by filling in a stub in `problemset/` and making its test in `tests/problemset/` pass. Problems operate on the shared `TreeNode<Integer>` type, where each node carries a value plus `left` and `right` children. The theme runs through tree queries: traversals (preorder/inorder/level-order), structural measures (height, diameter, balance), BST operations (search, validation, k-th smallest, range), aggregate queries (subtree sums, path sums), and ancestry (lowest common ancestor). Work the Foundational problems first to lock in traversal mechanics, then the Applied problems, which weave easier LeetCode-style queries through harder contest-style ones.

**Foundational**

## Problem 1: Height of a Binary Tree

### Description
Given the root of a binary tree, compute its **height**: the number of edges on the longest root-to-leaf path. An empty tree (null root) has height `-1`, and a single node has height `0`. Solve it with one post-order recursion that combines the heights of the two subtrees.

### Examples
**Example 1:**
```
Input:  root = []
Output: -1
```
The empty tree has height -1 by convention.

**Example 2:**
```
Input:  root = [1]
Output: 0
```
A single node has no edges below it.

**Example 3:**
```
Input:  root = [1,2,null,3]
Output: 2
```
The chain 1 -> 2 -> 3 has two edges.

### Constraints
- The number of nodes is in the range `[0, 10^4]`.
- `-10^4 <= Node.value <= 10^4`.

---

## Problem 2: Count Nodes

### Description
Given the root of a binary tree, return the total **number of nodes** in it. An empty tree has `0` nodes. This is the simplest aggregate query: every node contributes `1`, plus the counts of its two subtrees.

### Examples
**Example 1:**
```
Input:  root = []
Output: 0
```

**Example 2:**
```
Input:  root = [1,2,3]
Output: 3
```

**Example 3:**
```
Input:  root = [1,2,3,4,null,null,5]
Output: 5
```
Nodes are 1, 2, 3, 4, and 5.

### Constraints
- The number of nodes is in the range `[0, 10^4]`.

---

## Problem 3: Preorder Traversal

**LeetCode:** [144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)

### Description
Given the root of a binary tree, return its node values in **preorder**: visit the current node first, then recurse left, then recurse right. An empty tree produces an empty list.

### Examples
**Example 1:**
```
Input:  root = [1,null,2,3]
Output: [1,2,3]
```
Visit 1, then go right to 2, then 2's left child 3.

**Example 2:**
```
Input:  root = []
Output: []
```

**Example 3:**
```
Input:  root = [1,2,3]
Output: [1,2,3]
```
Root 1, then left subtree (2), then right subtree (3).

### Constraints
- The number of nodes is in the range `[0, 100]`.
- `-100 <= Node.value <= 100`.

---

## Problem 4: Inorder Traversal

**LeetCode:** [94. Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)

### Description
Given the root of a binary tree, return its node values in **inorder**: recurse left, visit the current node, then recurse right. For a binary search tree this yields the values in sorted order.

### Examples
**Example 1:**
```
Input:  root = [1,null,2,3]
Output: [1,3,2]
```

**Example 2:**
```
Input:  root = []
Output: []
```

**Example 3:**
```
Input:  root = [2,1,3]
Output: [1,2,3]
```
A BST's inorder traversal is sorted.

### Constraints
- The number of nodes is in the range `[0, 100]`.
- `-100 <= Node.value <= 100`.

---

## Problem 5: Validate a BST

**LeetCode:** [98. Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/)

### Description
Given the root of a binary tree, determine whether it is a valid **binary search tree**. A valid BST requires that every node's value is strictly greater than all values in its left subtree and strictly less than all values in its right subtree. Pass down an open interval `(lo, hi)` to each node and check membership.

### Examples
**Example 1:**
```
Input:  root = [2,1,3]
Output: true
```

**Example 2:**
```
Input:  root = [5,1,4,null,null,3,6]
Output: false
```
The node 3 lies in the right subtree of 5 but is less than 5.

**Example 3:**
```
Input:  root = [1]
Output: true
```

### Constraints
- The number of nodes is in the range `[1, 10^4]`.
- `-2^31 <= Node.value <= 2^31 - 1`.

---

## Problem 6: Level-Order Traversal

**LeetCode:** [102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)

### Description
Given the root of a binary tree, return its values grouped **level by level** from the root downward, left to right within each level. Use a breadth-first queue, processing one full level per outer iteration. An empty tree returns an empty list.

### Examples
**Example 1:**
```
Input:  root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
```

**Example 2:**
```
Input:  root = [1]
Output: [[1]]
```

**Example 3:**
```
Input:  root = []
Output: []
```

### Constraints
- The number of nodes is in the range `[0, 2000]`.
- `-1000 <= Node.value <= 1000`.

---

**Applied Problems**

## Problem 7: Maximum Depth of a Binary Tree

**LeetCode:** [104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

### Description
Given the root of a binary tree, return its **maximum depth**: the number of nodes along the longest path from the root down to the farthest leaf. An empty tree has depth `0`.

### Examples
**Example 1:**
```
Input:  root = [3,9,20,null,null,15,7]
Output: 3
```
The path 3 -> 20 -> 15 has three nodes.

**Example 2:**
```
Input:  root = [1,null,2]
Output: 2
```

**Example 3:**
```
Input:  root = []
Output: 0
```

### Constraints
- The number of nodes is in the range `[0, 10^4]`.
- `-100 <= Node.value <= 100`.

---

## Problem 8: Invert a Binary Tree

**LeetCode:** [226. Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)

### Description
Given the root of a binary tree, **invert** it: swap the left and right child of every node, and return the new root. The mirror image of the original tree is produced.

### Examples
**Example 1:**
```
Input:  root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
```

**Example 2:**
```
Input:  root = [2,1,3]
Output: [2,3,1]
```

**Example 3:**
```
Input:  root = []
Output: []
```

### Constraints
- The number of nodes is in the range `[0, 100]`.
- `-100 <= Node.value <= 100`.

---

## Problem 9: Same Tree

**LeetCode:** [100. Same Tree](https://leetcode.com/problems/same-tree/)

### Description
Given the roots of two binary trees `p` and `q`, return `true` if they are **structurally identical** and every corresponding pair of nodes holds the same value. Two empty trees are considered equal.

### Examples
**Example 1:**
```
Input:  p = [1,2,3], q = [1,2,3]
Output: true
```

**Example 2:**
```
Input:  p = [1,2], q = [1,null,2]
Output: false
```
Same values but different structure.

**Example 3:**
```
Input:  p = [], q = []
Output: true
```

### Constraints
- The number of nodes in each tree is in the range `[0, 100]`.
- `-10^4 <= Node.value <= 10^4`.

---

## Problem 10: Symmetric Tree

**LeetCode:** [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)

### Description
Given the root of a binary tree, return `true` if it is a **mirror of itself** about its center — that is, the left subtree is the mirror reflection of the right subtree. Compare the two subtrees in opposite order: left-of-one against right-of-other.

### Examples
**Example 1:**
```
Input:  root = [1,2,2,3,4,4,3]
Output: true
```

**Example 2:**
```
Input:  root = [1,2,2,null,3,null,3]
Output: false
```

**Example 3:**
```
Input:  root = [1]
Output: true
```

### Constraints
- The number of nodes is in the range `[1, 1000]`.
- `-100 <= Node.value <= 100`.

---

## Problem 11: Diameter of a Binary Tree

**LeetCode:** [543. Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/)

### Description
Given the root of a binary tree, return the length in **edges** of the longest path between any two nodes. This path may or may not pass through the root. At each node, the longest path through it equals the sum of the heights of its two subtrees; track the maximum while computing heights bottom-up.

### Examples
**Example 1:**
```
Input:  root = [1,2,3,4,5]
Output: 3
```
The path 4 -> 2 -> 1 -> 3 (or 5 -> 2 -> 1 -> 3) has three edges.

**Example 2:**
```
Input:  root = [1,2]
Output: 1
```

**Example 3:**
```
Input:  root = [1]
Output: 0
```

### Constraints
- The number of nodes is in the range `[1, 10^4]`.
- `-100 <= Node.value <= 100`.

---

## Problem 12: Balanced Binary Tree

**LeetCode:** [110. Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/)

### Description
Given the root of a binary tree, determine whether it is **height-balanced**: for every node, the heights of its two subtrees differ by at most one. A single post-order pass that returns subtree heights (and short-circuits on imbalance) runs in linear time.

### Examples
**Example 1:**
```
Input:  root = [3,9,20,null,null,15,7]
Output: true
```

**Example 2:**
```
Input:  root = [1,2,2,3,3,null,null,4,4]
Output: false
```

**Example 3:**
```
Input:  root = []
Output: true
```

### Constraints
- The number of nodes is in the range `[0, 5000]`.
- `-10^4 <= Node.value <= 10^4`.

---

## Problem 13: Path Sum

**LeetCode:** [112. Path Sum](https://leetcode.com/problems/path-sum/)

### Description
Given the root of a binary tree and an integer `target`, return `true` if the tree has a **root-to-leaf path** whose node values add up exactly to `target`. A leaf is a node with no children. An empty tree has no such path.

### Examples
**Example 1:**
```
Input:  root = [5,4,8,11,null,13,4,7,2], target = 22
Output: true
```
The path 5 -> 4 -> 11 -> 2 sums to 22.

**Example 2:**
```
Input:  root = [1,2,3], target = 5
Output: false
```

**Example 3:**
```
Input:  root = [], target = 0
Output: false
```

### Constraints
- The number of nodes is in the range `[0, 5000]`.
- `-1000 <= Node.value <= 1000`.

---

## Problem 14: Minimum Depth of a Binary Tree

**LeetCode:** [111. Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)

### Description
Given the root of a binary tree, return its **minimum depth**: the number of nodes along the shortest path from the root to the nearest **leaf**. A leaf has no children. Beware the trap: a node with one child is not a leaf, so you must not take the missing child's depth of zero.

### Examples
**Example 1:**
```
Input:  root = [3,9,20,null,null,15,7]
Output: 2
```
The nearest leaf is 9.

**Example 2:**
```
Input:  root = [2,null,3,null,4]
Output: 3
```
The only leaf is at depth 3; single-child nodes do not count as leaves.

**Example 3:**
```
Input:  root = []
Output: 0
```

### Constraints
- The number of nodes is in the range `[0, 10^5]`.
- `-1000 <= Node.value <= 1000`.

---

## Problem 15: Sum of Left Leaves

**LeetCode:** [404. Sum of Left Leaves](https://leetcode.com/problems/sum-of-left-leaves/)

### Description
Given the root of a binary tree, return the **sum of all left leaves**. A left leaf is a node that is the left child of its parent and itself has no children. Traverse the tree carrying a flag of whether the current node is a left child.

### Examples
**Example 1:**
```
Input:  root = [3,9,20,null,null,15,7]
Output: 24
```
The left leaves are 9 and 15, summing to 24.

**Example 2:**
```
Input:  root = [1]
Output: 0
```
The root is not a left child, so there are no left leaves.

**Example 3:**
```
Input:  root = [1,2,3,4,5]
Output: 4
```
Only 4 is a left leaf.

### Constraints
- The number of nodes is in the range `[1, 1000]`.
- `-1000 <= Node.value <= 1000`.

---

## Problem 16: Search in a BST

**LeetCode:** [700. Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/)

### Description
Given the root of a **binary search tree** and a target value, return the subtree rooted at the node whose value equals the target, or `null` if it is absent. Exploit the BST ordering: go left when the target is smaller, right when it is larger — `O(h)` time.

### Examples
**Example 1:**
```
Input:  root = [4,2,7,1,3], target = 2
Output: [2,1,3]
```

**Example 2:**
```
Input:  root = [4,2,7,1,3], target = 5
Output: []
```
5 is not present.

**Example 3:**
```
Input:  root = [8,3,10], target = 10
Output: [10]
```

### Constraints
- The number of nodes is in the range `[1, 5000]`.
- All values are unique.

---

## Problem 17: Range Sum of a BST

**LeetCode:** [938. Range Sum of BST](https://leetcode.com/problems/range-sum-of-bst/)

### Description
Given the root of a **binary search tree** and an inclusive range `[lo, hi]`, return the **sum of values** of all nodes whose value lies within `[lo, hi]`. Prune entire subtrees that cannot contribute (when the current value is below `lo`, skip the left subtree; above `hi`, skip the right) so work stays proportional to the relevant region.

### Examples
**Example 1:**
```
Input:  root = [10,5,15,3,7,null,18], lo = 7, hi = 15
Output: 32
```
The in-range values are 7, 10, and 15.

**Example 2:**
```
Input:  root = [10,5,15,3,7,13,18,1,null,6], lo = 6, hi = 10
Output: 23
```
The in-range values are 6, 7, and 10.

**Example 3:**
```
Input:  root = [5], lo = 1, hi = 4
Output: 0
```

### Constraints
- The number of nodes is in the range `[1, 2 * 10^4]`.
- `1 <= lo <= hi <= 10^5`.

---

## Problem 18: Lowest Common Ancestor of a BST

**LeetCode:** [235. Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)

### Description
Given the root of a **binary search tree** and two values `p` and `q` both present in it, return the value of their **lowest common ancestor**. Use the ordering property: descend left while both targets are smaller, right while both are larger; the first node that splits them (or equals one of them) is the LCA, found in `O(h)` time.

### Examples
**Example 1:**
```
Input:  root = [6,2,8,0,4,7,9], p = 2, q = 8
Output: 6
```

**Example 2:**
```
Input:  root = [6,2,8,0,4,7,9], p = 2, q = 4
Output: 2
```
A node can be a descendant of itself.

**Example 3:**
```
Input:  root = [2,1], p = 2, q = 1
Output: 2
```

### Constraints
- The number of nodes is in the range `[2, 10^5]`.
- All values are unique, and `p != q`.

---

## Problem 19: Kth Smallest Element in a BST

**LeetCode:** [230. Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)

### Description
Given the root of a **binary search tree** and an integer `k`, return the `k`-th smallest value (1-indexed). An inorder traversal visits values in sorted order; stop as soon as the `k`-th value is reached rather than materializing the entire order.

### Examples
**Example 1:**
```
Input:  root = [3,1,4,null,2], k = 1
Output: 1
```

**Example 2:**
```
Input:  root = [5,3,6,2,4,null,null,1], k = 3
Output: 3
```

**Example 3:**
```
Input:  root = [2,1,3], k = 3
Output: 3
```

### Constraints
- The number of nodes is `n`, with `1 <= k <= n <= 10^4`.
- `0 <= Node.value <= 10^4`.

---

## Problem 20: Right Side View

**LeetCode:** [199. Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/)

### Description
Given the root of a binary tree, imagine standing on its right side and return the values of the nodes you can see, **ordered top to bottom**. These are the rightmost node of each level. A level-order traversal that records the last node of every level solves it directly.

### Examples
**Example 1:**
```
Input:  root = [1,2,3,null,5,null,4]
Output: [1,3,4]
```

**Example 2:**
```
Input:  root = [1,null,3]
Output: [1,3]
```

**Example 3:**
```
Input:  root = []
Output: []
```

### Constraints
- The number of nodes is in the range `[0, 100]`.
- `-100 <= Node.value <= 100`.

---

## Problem 21: Zigzag Level-Order Traversal

**LeetCode:** [103. Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)

### Description
Given the root of a binary tree, return its values in **zigzag level order**: level 0 left-to-right, level 1 right-to-left, alternating each level downward. Run a normal level-order traversal but reverse the collected values on odd levels.

### Examples
**Example 1:**
```
Input:  root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
```

**Example 2:**
```
Input:  root = [1]
Output: [[1]]
```

**Example 3:**
```
Input:  root = []
Output: []
```

### Constraints
- The number of nodes is in the range `[0, 2000]`.
- `-100 <= Node.value <= 100`.

---

## Problem 22: Count Complete Tree Nodes

**LeetCode:** [222. Count Complete Tree Nodes](https://leetcode.com/problems/count-complete-tree-nodes/)

### Description
Given the root of a **complete** binary tree, return the number of nodes. Every level except possibly the last is full, and the last level is filled left to right. A plain traversal counts in `O(n)`; using left-spine and right-spine heights to detect perfect subtrees achieves `O(log^2 n)`.

### Examples
**Example 1:**
```
Input:  root = [1,2,3,4,5,6]
Output: 6
```

**Example 2:**
```
Input:  root = []
Output: 0
```

**Example 3:**
```
Input:  root = [1]
Output: 1
```

### Constraints
- The number of nodes is in the range `[0, 5 * 10^4]`.
- The tree is guaranteed to be complete.

---

## Problem 23: Construct Tree from Preorder and Inorder

**LeetCode:** [105. Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/)

### Description
Given two integer arrays `preorder` and `inorder` representing the preorder and inorder traversals of a binary tree with **distinct values**, reconstruct and return the tree. The first preorder element is the root; its position in `inorder` splits the values into left and right subtrees, which you build recursively.

### Examples
**Example 1:**
```
Input:  preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
```

**Example 2:**
```
Input:  preorder = [-1], inorder = [-1]
Output: [-1]
```

**Example 3:**
```
Input:  preorder = [1,2,3], inorder = [3,2,1]
Output: [1,2,null,3]
```
A left-leaning chain.

### Constraints
- `1 <= preorder.length <= 3000`.
- The values are unique, and the two arrays describe the same tree.

---

## Problem 24: Subtree of Another Tree

**LeetCode:** [572. Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/)

### Description
Given the roots of two binary trees `root` and `subRoot`, return `true` if there is a node in `root` such that the **subtree** rooted there is structurally identical (same values, same shape) to `subRoot`. The whole tree counts as a subtree of itself.

### Examples
**Example 1:**
```
Input:  root = [3,4,5,1,2], subRoot = [4,1,2]
Output: true
```

**Example 2:**
```
Input:  root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
Output: false
```
The candidate subtree has an extra node 0.

**Example 3:**
```
Input:  root = [1,1], subRoot = [1]
Output: true
```

### Constraints
- The number of nodes in `root` is in the range `[1, 2000]`.
- The number of nodes in `subRoot` is in the range `[1, 1000]`.

---

## Problem 25: Path Sum II

**LeetCode:** [113. Path Sum II](https://leetcode.com/problems/path-sum-ii/)

### Description
Given the root of a binary tree and an integer `target`, return **all root-to-leaf paths** whose node values sum to `target`. Each path is returned as the list of values from root to leaf. Backtrack: append a node on the way down and remove it on the way back up, recording paths that reach a leaf with the exact remaining sum.

### Examples
**Example 1:**
```
Input:  root = [5,4,8,11,null,13,4,7,2,null,null,5,1], target = 22
Output: [[5,4,11,2],[5,8,4,5]]
```

**Example 2:**
```
Input:  root = [1,2,3], target = 5
Output: []
```

**Example 3:**
```
Input:  root = [1,2], target = 0
Output: []
```

### Constraints
- The number of nodes is in the range `[0, 5000]`.
- `-1000 <= Node.value <= 1000`.

---

## Problem 26: Lowest Common Ancestor of a Binary Tree

**LeetCode:** [236. Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)

### Description
Given the root of a binary tree (**not** a BST) and two values `p` and `q` both present, return the value of their **lowest common ancestor** — the deepest node that has both as descendants (a node is a descendant of itself). Without ordering to exploit, recurse: a node whose two subtrees each contain one target, or which is itself a target with the other below, is the LCA.

### Examples
**Example 1:**
```
Input:  root = [3,5,1,6,2,0,8], p = 5, q = 1
Output: 3
```

**Example 2:**
```
Input:  root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
```
4 lies under 5, so 5 is its own ancestor and the LCA.

**Example 3:**
```
Input:  root = [1,2], p = 1, q = 2
Output: 1
```

### Constraints
- The number of nodes is in the range `[2, 10^5]`.
- All values are unique, and `p != q`.

---

## Problem 27: Maximum Path Sum

**LeetCode:** [124. Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/)

### Description
Given the root of a binary tree whose nodes carry values (possibly negative), return the **maximum path sum** over all paths. A path is any sequence of nodes connected by parent-child edges; it need not pass through the root, and must contain at least one node. At each node, the best path through it is its value plus the best downward gains (clamped at zero) of its two subtrees; track the global maximum while returning the single best downward branch. Accumulate the answer as a `long`.

### Examples
**Example 1:**
```
Input:  root = [1,2,3]
Output: 6
```
The path 2 -> 1 -> 3 sums to 6.

**Example 2:**
```
Input:  root = [-10,9,20,null,null,15,7]
Output: 42
```
The path 15 -> 20 -> 7 sums to 42.

**Example 3:**
```
Input:  root = [-3]
Output: -3
```
A single negative node must still be its own path.

### Constraints
- The number of nodes is in the range `[1, 3 * 10^4]`.
- `-1000 <= Node.value <= 1000`.

---

## Problem 28: Goblin Treasure Subtree Sums

### Description
In the "Goblin Caves" map, each chamber is a node of a binary tree holding the gold stored there (possibly negative). For every chamber, the total loot of its subtree is the sum of gold over all chambers in that subtree. Return the **maximum subtree total** over all chambers. An empty tree gives `0`. There are up to `10^5` chambers; values fit a 32-bit int, but accumulate the answer as a `long`.

### Examples
**Example 1:**
```
Input:  root = [1,2,3]
Output: 6
```
The whole-tree subtree at the root sums to 6, the largest.

**Example 2:**
```
Input:  root = [-5,4,-8]
Output: 4
```
The single-node subtree at 4 beats the whole tree (-9) and the subtree at -8.

**Example 3:**
```
Input:  root = []
Output: 0
```

### Constraints
- The number of nodes is in the range `[0, 10^5]`.
- `-2^31 <= Node.value <= 2^31 - 1`.

---

## Problem 29: Archivist's BST Range Tally

### Description
Scroll IDs are stored in a **binary search tree**. Given the root and an inclusive window `[lo, hi]`, return the **sum of all stored IDs** that fall inside the window. Prune subtrees that cannot contribute so the work is proportional to the visited region. An empty tree or empty window gives `0`. There are up to `10^5` keys; accumulate the sum as a `long`.

### Examples
**Example 1:**
```
Input:  root = [10,5,15,3,7,null,18], lo = 7, hi = 15
Output: 32
```
The in-window IDs are 7, 10, and 15.

**Example 2:**
```
Input:  root = [10,5,15], lo = 20, hi = 30
Output: 0
```
No keys fall in the window.

**Example 3:**
```
Input:  root = [], lo = 1, hi = 100
Output: 0
```

### Constraints
- The number of nodes is in the range `[0, 10^5]`.
- `-10^9 <= lo <= hi <= 10^9`.

---

## Problem 30: Wizard Tower Boundary Patrol

### Description
A wizard patrols a binary tree of tower floors, walking its **boundary** counterclockwise and reporting each floor once. The boundary is: the root, then the **left boundary** (top-down, excluding leaves), then all **leaves** left to right, then the **right boundary** (bottom-up, excluding leaves). The root is included once even if it is also a boundary endpoint; no node appears twice. An empty tree gives an empty list, and a single node gives just that node.

### Examples
**Example 1:**
```
Input:  root = [1,2,3,4,5,6,7]
Output: [1,2,4,5,6,7,3]
```
Root 1, left boundary 2, leaves 4,5,6,7, right boundary 3.

**Example 2:**
```
Input:  root = [1,null,2,3,4]
Output: [1,3,4,2]
```
Root 1, no left boundary, leaves 3,4, right boundary 2.

**Example 3:**
```
Input:  root = [1]
Output: [1]
```

### Constraints
- The number of nodes is in the range `[0, 10^4]`.
- `-1000 <= Node.value <= 1000`.

---
