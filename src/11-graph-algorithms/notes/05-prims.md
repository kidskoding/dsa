# Prim's Minimum Spanning Tree

## What It Solves & When
*Build a minimum spanning tree by growing one connected tree — what problem is an MST, and when does Prim's shape fit best?*

## Growing a Single Tree
*The vertex set splits into "in tree" and "not yet." How does the tree expand exactly one vertex per step?*

## The Cut Property
*State the cut property. Why does it justify always grabbing the cheapest edge crossing the in/out boundary?*

### Why the Greedy Edge Is Always Safe
*Take any cut separating tree from non-tree. Why must the minimum crossing edge belong to some MST?*

## Priority Queue of Crossing Edges
*Each non-tree vertex holds a key = cheapest known edge to the tree. When is that key decreased?*

### Lazy vs Eager Implementation
*Lazy pushes stale `(weight, vertex)` entries and skips them on pop; eager uses decrease-key keyed by vertex. What's the trade-off in memory and code complexity?*

### Detecting Stale Pops
*In the lazy version, how do you recognize and discard an entry for a vertex already in the tree?*

## Tracking the Tree
*What arrays do you maintain — `key[]`, `inMST[]`, `parent[]` — and what does each contribute?*

## Reconstructing the MST Edges
*How does `parent[]` give you the actual tree edges and total weight, not just a number?*

## Variants
*Adjacency-matrix Prim's (no heap) for dense graphs; Fibonacci-heap Prim's — when does each win?*

## vs Kruskal's
*Prim's grows one tree with a heap; Kruskal's sorts all edges with union-find. Dense vs sparse — which do you reach for?*

## Time Complexity
*Every vertex is extracted once and every edge can trigger a key update. How do those map to heap operations?*

### Binary Heap vs Matrix vs Fibonacci Heap
*Compare the three: binary-heap Prim's in terms of `E` and `V`, the simple `O(V^2)` adjacency-matrix version, and the Fibonacci-heap bound. Why does the matrix version win on dense graphs where `E` nears `V^2`?*

## Space Complexity
*What do `key[]`, `inMST[]`, `parent[]`, the heap, and the graph representation cost in terms of `V` and `E`?*

### Heap Size Under Lazy Deletion
*How large can the priority queue grow when you push duplicates instead of decreasing keys?*

## Implementation Walkthrough
*Plan the code before writing it.*

### Graph & Structures Setup
*What adjacency representation, and how do you initialize `key[]` (to `INF`), `inMST[]`, `parent[]`, and seed the start vertex?*

### The Main Loop
*Sketch the extract-min → mark-in-tree → scan-neighbors cycle. When does the loop end?*

### The Key Step: Updating Crossing Edges
*For each neighbor of the newly added vertex, what comparison decides whether to update its key and parent and push it?*

### Reconstruction
*How do you read `parent[]` into a list of MST edges and accumulate the total weight?*

## Real Uses
*Network/cable layout, clustering, approximation kernels — where does a single growing tree fit naturally?*

## Pitfalls
*Forgetting to skip already-in-tree pops; not decreasing keys; assuming it works on directed graphs; starting with `key[]` not set to infinity — what goes wrong?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
