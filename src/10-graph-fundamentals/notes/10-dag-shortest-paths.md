# DAG Shortest Paths

## What It Is & When to Use It
*Why does a DAG let you find shortest paths faster than Dijkstra or Bellman-Ford?*

## Topological Order Prerequisite
*Why must vertices be processed in topological order, and how do you get that order first?*

## The Key Idea: Settle Vertices in Dependency Order
*Why does processing vertices so all incoming edges are relaxed before you "leave" a vertex finalize its distance?*

## Edge Relaxation Recap
*What does relaxing an edge mean, and when does it improve a stored distance?*

## Single-Pass Relaxation
*How does one sweep over the topological order settle every vertex's final distance?*

### Why One Pass Suffices
*Why is a vertex's distance final by the time you process it in topological order?*

### Relaxing Outgoing Edges
*When you reach a vertex, which edges do you relax, and why are its own incoming relaxations already done?*

## Negative Weights Without Cycles
*Why are negative edges safe here but dangerous for Dijkstra?*

## Longest Path & Critical Path
*How does negating weights (or flipping the relaxation) turn this into a longest-path solver?*

### Critical Path Method
*How does longest path in a task DAG give the minimum project completion time?*

## Path Reconstruction
*How does a predecessor array let you recover the actual shortest path, not just its length?*

## Trade-offs vs. Dijkstra & Bellman-Ford
*When does the DAG restriction pay off, and what do you lose if the graph has cycles?*

## Time Complexity
*Reason about why this is `O(V + E)` and why it beats the alternatives.*

### Topological Sort + One Relaxation Sweep
*Why does the `O(V + E)` topological sort plus a single linear relaxation pass total `O(V + E)`?*

### Why It Beats Dijkstra and Bellman-Ford
*Why is there no `log V` heap factor and no `V` repeated passes here, unlike those two algorithms?*

## Space Complexity
*Account for every structure the algorithm keeps.*

### Distance & Predecessor Arrays
*Why do the `dist` and `pred` arrays each cost `O(V)`?*

### The Topological Order & Adjacency Storage
*Why does holding the order plus the adjacency list cost `O(V + E)`?*

## Pitfalls & Edge Cases
*Unreachable vertices left at infinity, a hidden cycle breaking the order, wrong relaxation direction — where do these trip you?*

## Implementation Walkthrough
*Break the algorithm into parts before coding — what does each part own?*

### Producing the Topological Order
*Which topological-sort method do you call first, and what does it hand back?*

### Initializing Distances
*How do you set the source to zero and everything else to infinity before relaxing?*

### The Relaxation Sweep
*As you walk the order, how do you relax each vertex's outgoing edges and update predecessors?*

### Recovering Paths & Handling Unreachable Vertices
*How do you follow predecessors to rebuild a path, and how do you report vertices still at infinity?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
