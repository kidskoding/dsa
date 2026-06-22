# Treaps

## What It's For
*What problem does a treap solve — keeping a BST balanced without the bookkeeping of red-black colors or AVL heights?*

## The Core Idea: Tree + Heap
*What are the two simultaneous orderings: keys arranged as a BST, priorities arranged as a heap?*

### Why Both Invariants Pin Down the Shape
*Given a fixed set of (key, priority) pairs, why is the treap's structure uniquely determined?*

### The Two Invariants Stated Precisely
*Write the BST condition on keys and the (max- or min-) heap condition on priorities. Which one would a rotation never be allowed to violate?*

## Randomized Priorities
*Where do priorities come from, and why does choosing them at random make the tree behave like a randomly built BST?*

### Why Random Equals Balanced in Expectation
*What is the connection between a random priority assignment and the expected depth of a node in a randomly inserted BST?*

## Insert by Key, Fix by Priority
*Trace inserting a node as a normal BST leaf, then rotating it upward until the heap order is restored.*

## Delete by Rotating Down
*How do you remove a node by rotating it down toward a leaf, always pulling up the higher-priority child?*

## Rotations as the Only Repair Tool
*Why is a single rotation enough to move one node up or down one level while preserving the BST key order?*

## Split and Merge
*What do split-by-key and merge-two-treaps do, and what operations (range ops, k-th element, persistence) do they unlock?*

### Implicit Treaps
*How does keying on subtree size instead of value turn a treap into an array supporting insert/erase/range ops at any position?*

## Time Complexity
*Reason about why the bounds are expected rather than worst-case.*

### Search, Insert, Delete
*Each cost is proportional to the depth of a node. Why is the expected depth \\( O(\log n) \\), and what input could still produce an \\( O(n) \\) chain?*

### Split and Merge
*Why do split and merge also run in expected \\( O(\log n) \\), and how do insert/delete reduce to them?*

### Where the Randomness Lives
*Is the \\( O(\log n) \\) over random priorities or over random inputs — and why does that distinction matter for an adversary?*

## Space Complexity
*Account for everything a node carries.*

### Per-Node Overhead
*Key, priority, two child pointers, and any augmentation (size) — what's the total, and how does it compare to a red-black node's color bit?*

### Recursion Stack in Split/Merge
*How deep do recursive split and merge go, and how does that relate to expected height?*

## Treaps vs Red-Black / AVL / Skip Lists
*Why pick a treap — simpler code, easy split/merge — and what do you give up versus a deterministic balanced tree?*

## Pitfalls
*What breaks with duplicate priorities, a weak RNG, or forgetting to update augmented fields after a rotation?*

## Implementation Walkthrough
*Plan the code before writing it.*

### Node and Priority Source
*What fields does a node need, and how/when do you assign each node its random priority?*

### Rotation Primitives
*Sketch left and right rotation as pointer surgery — which links change, and which augmented fields must be refreshed?*

### Insert and Delete Logic
*Describe the BST descent plus the rotate-up (insert) or rotate-down (delete) loop you'll write, as prompts only.*

### Split and Merge Recursion
*What's the recursive structure of split-by-key and merge, and what base case stops each?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
