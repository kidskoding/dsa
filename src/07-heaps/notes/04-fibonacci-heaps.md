# Fibonacci Heaps

## What It's For & Why It Exists
*Which operation does a Fibonacci heap make dramatically cheaper (amortized) than a binary heap, and which classic algorithm — Dijkstra, Prim — cares about that?*

## Forest of Heap-Ordered Trees
*Why is the structure a loose collection of trees in a circular root list instead of one rigid complete tree, and what flexibility does that looseness enable?*

### The Min Pointer
*Why keep a single pointer to the minimum root, and how does that alone make find-min \( O(1) \)?*

## Pointers & Node Layout
*What links does each node carry — parent, one child, left/right siblings, degree, mark — and why does a circular doubly linked sibling list make splicing \( O(1) \)?*

## Lazy Insert & Union
*Why can insert and union be \( O(1) \) — what work is deliberately postponed instead of done immediately?*

### Insert as a Trivial Union
*Why is inserting one element just merging a one-node heap into the root list, and why does that avoid any sifting?*

## Extract-Min: Paying the Bill
*When you finally remove the min, how does promoting all its children to the root list and then scanning trigger the deferred cleanup?*

### Consolidation
*How does repeatedly linking trees of equal degree collapse a long root list into at most one tree per degree, and what temporary array indexes "by degree"?*

## Decrease-Key & Cascading Cuts
*Why does cutting a node loose from its parent — when its key drops below the parent's — sometimes set off a chain of cuts marching up the tree?*

### The Mark Bit
*What does marking a node mean, why does a node lose its mark when it becomes a root, and why does losing a SECOND child force a cut?*

### Why Cuts Keep Trees Bushy
*How does the "lose at most one child before you're cut" rule stop trees from degenerating into long thin paths?*

## The Fibonacci Bound (Intuition)
*Why do subtree sizes grow at least like Fibonacci numbers \( F_k \), and why does that cap the maximum degree at \( O(\log n) \)? Reason about it, don't prove it.*

## Time Complexity
*Separate amortized bounds from worst-case single-operation cost — this is the whole point of the structure.*

### Amortized vs. Worst-Case
*What does "amortized" mean here — why can one extract-min be slow yet the average over a sequence stay \( O(\log n) \)? Give the potential-function intuition (roots + marks as stored-up work) without formal algebra.*

### O(1) Operations
*Why are insert, find-min, union, and decrease-key all \( O(1) \) amortized — what cost did each defer, and onto which later operation?*

### O(log n) Operations
*Why do extract-min and delete cost \( O(\log n) \) amortized, and what single quantity (max degree) bounds the consolidation work?*

## Space Complexity
*Why is the heap \( O(n) \) in nodes, but with a much larger per-node constant than a binary heap — how many pointers and flags per node?*

### Consolidation Scratch Space
*Why does consolidation need an auxiliary array sized to the maximum degree, \( O(\log n) \), and why is that the only notable extra allocation?*

## Trade-offs: Theory vs. Practice
*Why do real systems often still pick a binary or d-ary heap despite the better Big-O — what hidden constants, pointer-chasing, and cache misses bite in practice?*

## Pitfalls
*What goes wrong if you forget to clear mark bits on promotion, mishandle circular-list splicing, update the min pointer wrong after consolidation, or trust the worst-case bound for a single operation?*

## Implementation Walkthrough
*Plan the code in parts before you write it — each sub-section tells you what to work out, not the answer.*

### Node & Circular List Plumbing
*What fields does a node need, and what helper does "splice a node (and its ring) into a circular doubly linked list" so insert/cut reuse it?*

### Insert, Union & the Min Pointer
*How do insert and union just merge root lists and then compare against the current min — what is the ONLY comparison each does?*

### Extract-Min & Consolidate
*How do you move children up, remove the min, then walk the root list linking equal-degree trees via a degree-indexed array, rebuilding the min pointer at the end?*

### Decrease-Key, Cut & Cascading-Cut
*How does decrease-key check the heap order, cut to the root list if violated, and recursively cascade up while parents are already marked?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
