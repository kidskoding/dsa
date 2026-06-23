# Union-Find

## What It Is & When To Use It
*What does a structure that maintains a partition of \\( n \\) elements into non-overlapping groups let you answer, and which problems (dynamic connectivity, cycle detection in Kruskal's MST, percolation, image-blob labeling, account-merging) reach for it?*

## The Core Idea: Tracking Membership, Not Contents
*Why is "which group is this element in?" the only question union-find answers well, and why doesn't it support listing a set's members, ordering them, or splitting sets apart afterward?*

### The Two Operations That Define It
*Why do `find` (which group?) and `union` (merge two groups) form a complete interface, and how does `connected` reduce to two `find`s?*

## Representative Elements
*How does each set pick one canonical member to stand for the whole group, and why does "same representative" become the test for "same set"?*

### Equivalence As Same-Root
*Why is `connected(a, b)` exactly `find(a) == find(b)`, and what makes that correct regardless of how the trees underneath are shaped?*

## The Parent-Pointer Forest
*How is the whole structure encoded as a single `parent[]` array where each entry points at a parent, and what value marks a node as a root?*

### Why A Forest, Not A Single Tree
*Why does each disjoint set become its own tree, and why is the collection of trees (a forest) the natural picture for a partition?*

### Initialization: Every Element Its Own Set
*Why does `makeSet` start each element pointing at itself as a singleton root, and what partition does that initial state represent?*

## Invariants That Must Always Hold
*What properties must stay true after every operation — every node reaches exactly one root, roots self-reference, no cycles ever form — and why does `union` linking roots (not arbitrary nodes) preserve all three?*

## Coding `find`
*How do you walk parent pointers up until a node that points at itself, and why is that self-pointer the loop's stopping condition rather than a null check?*

## Coding `union`
*Why must you first `find` both roots, and why is linking one root under the other (rather than linking the two input nodes directly) the only move that keeps the forest valid?*

### The No-Op Union
*What should happen when both elements already share a root, and why must you skip the link entirely instead of creating a self-loop?*

## Naive Cost Without Optimizations
*How can repeatedly unioning in an adversarial order build a single long chain, and why does that make `find` walk a path of length proportional to \\( n \\)?*

## Time Complexity
*Why does every operation's cost reduce to "how far is this node from its root?", making tree height the single quantity that controls everything?*

### find — Best, Average, Worst
*Why is `find` \\( O(1) \\) when a node sits just under its root, but \\( O(n) \\) in a degenerate chain — and what determines where on that spectrum you land?*

### union — Cost Dominated By find
*Why is `union` itself just two `find`s plus \\( O(1) \\) of pointer rewiring, so its asymptotic cost equals that of `find`?*

### Why Plain Union-Find Isn't Good Enough
*Why does the \\( O(n) \\) worst case motivate path compression and union by rank, and what target per-operation bound do they together aim for?*

## Space Complexity
*Why is the whole structure just one `parent[]` array of \\( n \\) integers — \\( O(n) \\) total — and why is there no per-operation extra allocation in the basic version?*

### Cost Of Adding Rank Or Size
*Why does layering on union by rank or size add only one more length-\\( n \\) array, leaving the asymptotic space at \\( O(n) \\)?*

## Trade-offs & What It Can't Do
*What do you give up — ordered iteration, deletion, set enumeration, un-union — in exchange for near-constant connectivity queries, and when does that make union-find the wrong tool?*

## Pitfalls
*Where do bugs hide — calling `union` on raw nodes instead of their roots, forgetting the self-parent base case, assuming you can undo a union, or off-by-one errors on element indices?*

## Implementation Walkthrough
*Before writing code, plan the pieces below — each prompt tells you what to work out, not the answer.*

### The `parent[]` Array
*How will you size and initialize the backing array so every element begins as its own root, and what sentinel marks a root?*

### `find` By Pointer-Walking
*What loop walks from a node to its root, and how do you know you've arrived?*

### `union` By Linking Roots
*How do you resolve both roots, detect the already-connected case, and link one under the other?*

### `connected` As A Thin Wrapper
*How does this method reuse `find` without duplicating any traversal logic?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
