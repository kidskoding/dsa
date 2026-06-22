# Order-Statistics Trees

## What It's For
*What two queries — "find the k-th smallest" and "what's the rank of x" — does a plain balanced BST fail to answer fast, and why does scanning or counting in-order defeat the purpose?*

## The Core Idea: Size-Augmented Nodes
*What single extra field on each node turns an ordinary balanced BST into one that can count its own elements?*

### Choosing the Base Tree
*Why does this augmentation ride on top of a self-balancing tree (red-black or AVL) rather than a raw BST, and what would degrade without that?*

### What the Size Field Counts
*Does a node's size include itself? Express it in terms of its two children's sizes — what's the one-line recurrence?*

## The Invariant You Must Preserve
*State the size invariant precisely: at every node, size equals 1 plus left size plus right size. Why must this hold after every mutation, not just at the end?*

## Select: Finding the k-th Element
*Trace how the left subtree's size tells you whether the answer is in the left subtree, is the current node, or is the \\( (k - \text{leftSize} - 1) \\)-th element of the right subtree.*

### Off-by-One in Select
*Where does the choice of 0-based vs 1-based rank change the comparison, and how do you keep it consistent end to end?*

## Rank: Position of a Key
*How do you accumulate left-subtree sizes as you descend right, so that when you land on the key you've summed everything smaller?*

## Insert and Delete with Sizes
*Which nodes' size fields change on the path of an insert or delete, and why is it exactly the nodes on the root-to-target path?*

## Maintaining Size Under Rotations
*Why does a rotation only need to recompute the sizes of the two nodes it swaps — and in what order must you recompute them?*

### Why Augmentation Survives Rebalancing
*What property must an augmented field have so it can be recomputed from a node's own value plus its children's fields — and why does that property let rotations stay cheap?*

## Beyond Size: Other Augmentations
*What else can you hang on a node by the same recipe (subtree sum, min, count-of-key) and what changes in select/rank when you do?*

## Time Complexity
*Reason about each operation's cost in terms of tree height.*

### Search, Select, Rank
*Each follows a single root-to-leaf path. Why is that path length the height, and why does balancing pin the height at \\( O(\log n) \\)?*

### Insert and Delete
*Beyond the descent, what bounds the number of rotations and size-fixups per update, and why does that not change the asymptotic cost?*

## Space Complexity
*What does the tree cost in memory, and what does the augmentation add?*

### The Augmentation Overhead
*One integer per node — what's the total extra space, and why is it only a constant factor on top of the base tree?*

### Recursion / Stack Depth
*If select and rank recurse, how deep does the call stack get, and how would an iterative version change that?*

## Real Uses
*Where do order statistics show up — running medians, "count of elements less than x," percentile and leaderboard queries, inversion counting?*

## Pitfalls
*What breaks if you forget a size fixup after a rotation, mismatch 0- vs 1-based rank, or update size before performing the structural change?*

## Implementation Walkthrough
*Plan the code in parts before writing it.*

### Node Representation
*What fields does a node hold — key, children, parent/color/height, and size — and where does size live relative to the balancing metadata?*

### The size() Helper and Recompute Rule
*How do you handle a null child's size, and what is the single line that recomputes a node's size from its children?*

### Augmented Rotations
*After you splice pointers in a rotation, which two nodes need their size recomputed and in which order?*

### Select and Rank Routines
*Sketch the branching logic for select (compare k against left size) and rank (accumulate left sizes) without writing the answer.*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
