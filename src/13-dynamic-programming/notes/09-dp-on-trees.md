# Dynamic Programming on Trees

## What Makes Tree DP Different
*How does the subproblem structure of a tree (subtrees) differ from the grids and intervals of array DP?*

## Recognizing the DP
*What about "compute something for every subtree, parent depends on children" signals tree DP?*

## Rooting the Tree
*Why fix an arbitrary root, and how does that orient every subproblem toward "the subtree hanging below a node"?*

## Optimal Substructure on Subtrees
*Why is a node's answer built from its children's subtree answers, and what makes those child answers independent of each other?*

## Overlapping Subproblems (or Not)
*Each subtree is solved once in a plain tree DP — so where is the "overlap"? Contrast with rerooting, where reuse genuinely matters.*

## State Per Subtree
*What does \\( dp[v] \\) summarize about the subtree rooted at \\( v \\)? How do you pick what to store so the parent can combine it?*

## Combining Children
*How do you fold each child's answer into the parent's accumulator? Why must all children be finished first?*

## Include/Exclude States
*Many tree DPs track two values per node (e.g. max independent set, house robber on a tree). Sketch when one number per node isn't enough.*

### How the Two States Interact at the Parent
*If \\( v \\) is "included", what does that force about each child's allowed state? If "excluded"?*

## Post-Order Traversal & Fill Order
*Why does a single post-order DFS guarantee children are computed before parents?*

## Reconstructing the Choice
*How do you walk back down from the root, carrying the parent's decision, to recover which nodes/edges were actually chosen?*

## The Rerooting Technique
*When you need the answer with every node as root, how do you reuse work instead of re-running DFS \\( n \\) times?*

### Down-pass and Up-pass
*What does each of the two passes compute, and how do they combine into a per-node answer?*

## Time Complexity
*Apply cost = states × transition. Why does summing the work over all nodes (each child visited once) give \\( O(n) \\) for a single-root DP?*

### Why Rerooting Stays Linear
*Naively re-rooting is \\( O(n^2) \\) — how does precomputing partial sums / "answer excluding one child" keep the rerooted version \\( O(n) \\)?*

## Space Complexity
*What is the per-node DP storage, and what dominates the rest: the recursion stack. How deep can it get on a degenerate (path-like) tree, and how do you avoid overflow?*

## Variants & Related Problems
*How do subtree size, tree diameter, max weighted independent set, and tree-coloring DPs fit this template?*

## Pitfalls
*Where do people slip — recursion depth / stack overflow on deep trees, revisiting the parent in DFS, wrong base case at leaves?*

## Implementation Walkthrough
*Plan the code in parts before writing it.*

### Adjacency, Rooting & DFS Skeleton
*How is the tree stored, how do you pass the parent to avoid going back up, and where does the post-order work happen?*

### Per-Node State & Leaf Base Case
*What does a leaf's \\( dp \\) value hold, and how is that the base case the recursion bottoms out on?*

### Combining Children Into the Parent
*After recursing into each child, how do you merge their returned values (including the include/exclude pair) into the node's answer?*

### Reconstruction or Rerooting Pass
*For reconstruction, how do you re-descend carrying the chosen decision? For rerooting, what second DFS spreads the parent's contribution down?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
