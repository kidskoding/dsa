# Graph Representations

## What a Graph Is & What We Store
*What are the raw pieces — vertices, edges, weights, direction — that any representation must encode?*

## The Core Question: What Operations Must Be Fast?
*Before choosing a structure, which operations dominate your algorithm — neighbor iteration, edge lookup, or edge insertion?*

## Adjacency Matrix
*When is a `V x V` grid the right call, and what does each cell encode?*

### Cell Semantics
*What does `M[u][v]` hold for an unweighted graph vs. a weighted one, and what marks "no edge"?*

### Symmetry for Undirected Graphs
*Why is the matrix symmetric when edges have no direction, and what does that duplication cost?*

## Adjacency List
*How does a list-of-lists trade space for traversal speed, and what's its footprint?*

### Choosing the Inner Container
*Array, linked list, or hash set per vertex — what does each buy you for lookup vs. iteration?*

### Iterating Neighbors
*How does walking one vertex's list give you exactly its degree's worth of work?*

## Edge List
*What problems want edges as a flat collection rather than per-vertex grouping?*

## Directed vs. Undirected
*How do you store an undirected edge so both endpoints see it, and what changes when direction matters?*

## Encoding Weights & Multi-Edges
*Where do weights live in each representation, and how do you handle parallel edges or self-loops?*

## Core Operations Compared
*For "is there an edge u-v?", "list neighbors of u", and "add an edge" — which representation wins each?*

## Sparse vs. Dense Trade-offs
*Sketch when `|E| ~ |V|` vs. `|E| ~ |V|^2` should steer your choice of structure.*

## Mapping Vertices to Indices
*How do you turn arbitrary labels (strings, objects) into the integer ids your structure expects?*

## Time Complexity
*State the cost of each core operation per representation, and reason about why.*

### Edge Lookup vs. Neighbor Scan
*Why is `M[u][v]` an `O(1)` check but listing neighbors `O(V)` in a matrix, while a list flips both costs?*

### Building the Structure
*How long does ingesting all `E` edges take in each representation, and what dominates?*

### Iterating the Whole Graph
*Why does scanning every adjacency list total `O(V + E)`, while scanning the matrix is always `O(V^2)`?*

## Space Complexity
*Compare the memory footprints and reason about when each is wasteful.*

### Matrix `O(V^2)` vs. List `O(V + E)`
*Why does the matrix pay for absent edges while the list pays only for present ones?*

### The Cost of Per-Vertex Containers
*What fixed overhead does each adjacency list's container header add on top of the raw edge data?*

## Pitfalls & Edge Cases
*Where do self-loops, duplicate edges, and out-of-range vertex ids quietly break your code?*

## Implementation Walkthrough
*Plan the structure before you write it — what does each piece need to do?*

### Storing the Vertex Set
*How will you size and index your vertices, and what id range do you assume?*

### The Edge-Adding Routine
*What does `addEdge(u, v)` touch, and how does it differ for directed vs. undirected, weighted vs. not?*

### Neighbor Iteration API
*What method exposes a vertex's neighbors, and what shape does it return for clean traversal code downstream?*

### Guarding Against Bad Input
*Where do you validate vertex ids and decide how to treat duplicate or self edges?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
