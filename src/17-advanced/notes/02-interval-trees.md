# Interval Trees

## What It's For
*What query — "which stored intervals overlap a given interval or point?" — motivates this structure, and why is a plain sorted list slow at it?*

## The Core Idea: BST Keyed on Low Endpoints
*Why do we order nodes by their interval's left endpoint, and what does that ordering alone fail to give us about overlaps?*

## The Augmentation: Max Endpoint in Subtree
*What single extra field per node records the largest right endpoint anywhere in that subtree, and how is it computed from the node and its children?*

### Why Max, Not Min
*How does knowing the subtree's maximum right endpoint let you prune an entire subtree from an overlap search? What would min fail to tell you?*

### The Augmentation Invariant
*State precisely what max must equal at every node, and why it must be restored after every insert, delete, and rotation.*

## The Overlap Test
*What is the condition for two intervals to overlap, written cleanly — and how does the touching-endpoints (closed vs half-open) convention change it?*

## Overlap Search for a Single Interval
*Trace the decision at each node: when do you go left, when right, and how exactly does the left child's max field justify skipping the left subtree?*

### Why the Search Never Misses an Overlap
*Argue the correctness claim: if an overlapping interval exists, why does the descent rule always steer toward at least one of them?*

## Finding All Overlaps
*How do you extend the single-overlap search to report every overlapping interval, and why does the cost now depend on the number of matches?*

## Building the Tree
*How do you insert intervals one at a time, and at which points along the insertion path is the max field updated?*

## Maintaining Max Under Rotations
*Why can the max field be recomputed locally from a node's own right endpoint and its two children's max after a rotation — and in what order?*

## Time Complexity
*Reason about each query and update in terms of height and output size.*

### Single-Overlap Query
*Why is one overlap found along an \\( O(\log n) \\) path, given the pruning rule? What stops you from descending both subtrees?*

### All-Overlaps Query
*Why is reporting all \\( k \\) matches \\( O(k \log n) \\) (or \\( O(k + \log n) \\) with care)? Where does the output term enter the bound?*

### Insert, Delete, Rotations
*Why does maintaining max add only constant extra work per node on the update path, leaving the operations \\( O(\log n) \\)?*

## Space Complexity
*What does the tree plus augmentation cost?*

### Per-Node Storage
*Each node stores an interval plus one max value — what's the total, and why is it linear in the number of intervals?*

### Recursion Depth
*How deep can the recursive overlap search go, and how does that relate to the tree height?*

## Interval Trees vs Segment Trees vs Sweep Lines
*When is a dynamic interval tree the right tool versus a static coordinate segment tree or a one-pass offline sweep?*

## Real Uses
*Where do overlap queries appear — calendar conflicts, genomic ranges, network packet rules, collision broad-phase?*

## Pitfalls
*What goes wrong if you forget to update max on insert, mishandle equal left endpoints, or confuse inclusive vs exclusive endpoints in the overlap test?*

## Implementation Walkthrough
*Plan the code before writing it.*

### Node and Max Field
*What does each node store, and how do you treat a null child's max so the recompute rule stays uniform?*

### The Overlap Predicate
*Write down (as a prompt) the boolean test you'll reuse everywhere — what two comparisons does it combine?*

### Augmented Insert and Rotations
*Where on the insertion path do you bump max, and which nodes get recomputed after a rotation?*

### Search Routines
*Sketch the branching for single-overlap (use child max to prune) and all-overlaps (recurse into both viable subtrees) without giving the answer.*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
