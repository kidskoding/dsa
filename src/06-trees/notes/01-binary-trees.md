# Binary Trees

## What Problem Binary Trees Solve
*Why branch a structure two ways instead of laying data out linearly — what does hierarchy buy you over an array or list?*

## Structure and the Node Invariant
*Each node has at most two children labeled left and right — why is the left/right labeling meaningful even before any sort rule is imposed?*

## Anatomy: Root, Leaves, Internal Nodes
### Naming the Parts
*Name every part — root, parent, child, sibling, leaf, internal node — what exactly makes a node a leaf?*
### Degree and Edges
*What is the degree of a node, and why does a tree with \( n \) nodes always have exactly \( n-1 \) edges?*

## Depth, Height, and Levels
*How do depth (measured top-down) and height (measured bottom-up) differ, and how many nodes can live at level \( d \)?*

## Tree Shapes and Why They Matter
### Full, Complete, and Perfect
*Sketch one of each — what exact condition defines each, and which one packs into a flat array with no gaps?*
### Balanced vs Degenerate
*What makes one tree "bushy" and another a "stick," and why does this single distinction dominate every cost downstream?*

## Representations
### Linked Nodes with Child References
*How does a node object hold its two children, and where do the null links sit?*
### Implicit Array Layout
*For index \( i \), where do its children and parent live, and which tree shapes waste no slots?*

## Traversals
### Depth-First: Pre / In / Post Order
*Trace each on the same tree — what changes is only WHEN you visit the node relative to its two recursive calls?*
### Level Order (Breadth-First)
*Which structure feeds the visit order here, and what makes it fundamentally different from the DFS family?*

## Recursive vs Iterative Walks
*When does the call stack betray you on a deep tree, and how does an explicit stack (DFS) or queue (BFS) replace it?*

## Building and Reconstructing Trees
*Given two traversals, why can you rebuild the tree from pre+in but not from pre+post alone?*

## Time Complexity
### Traversal Cost
*Why is every full traversal \( \Theta(n) \) — what is each node charged for exactly once, and why can't you do better when you must visit all nodes?*
### Single-Path Descent
*Why does following one root-to-leaf path cost \( O(h) \), and what is \( h \) for a balanced vs a degenerate tree?*
### Search Without an Ordering
*With no sort rule to prune branches, why does finding an arbitrary key still cost \( O(n) \) in the worst case?*

## Space Complexity
### Node Storage
*Why is the structure itself \( \Theta(n) \), and what per-node overhead do the two child pointers add?*
### Recursion Call Stack
*Why does a recursive walk hold \( O(h) \) frames at peak — and why is that \( O(n) \) for a stick but \( O(\log n) \) when balanced?*
### Iterative Auxiliary Structures
*How much extra memory does the explicit DFS stack or BFS queue hold at its widest point?*

## Implementation Walkthrough
### Node Layout
*What fields does a node need, and how do you represent an absent child?*
### Traversal Routines
*For each DFS order, where does the visit statement sit relative to the two recursive calls — and how do you rewrite one with an explicit stack?*
### Level-Order with a Queue
*How do you enqueue children as you dequeue a parent, and how do you detect where one level ends and the next begins?*
### Reconstruction
*How do you locate the root in one traversal and use it to split the other into left and right subtrees?*

## Common Pitfalls
*What goes wrong when you forget the null check, mutate during traversal, or confuse height with depth?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
