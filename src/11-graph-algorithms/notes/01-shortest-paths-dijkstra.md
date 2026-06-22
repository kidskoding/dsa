# Dijkstra's Shortest Paths

## What It Solves & When
*Single-source shortest paths on non-negative weights — what exact problem is this, and what graph property must hold before you reach for it?*

## The Shortest-Path Tree
*The output is more than distances — it's a tree rooted at the source. What does each tree edge mean, and why is there exactly one path to each vertex in it?*

## Greedy Relaxation Idea
*Why can the closest unsettled vertex be finalized immediately? What invariant makes the greedy choice safe?*

### The Settled-Set Invariant
*Once a vertex is "settled," its distance never changes. Why does non-negativity guarantee no future path can do better?*

### The Relaxation Step
*What does relaxing an edge `(u,v)` actually compute and compare, and what condition triggers an update to `dist[v]`?*

## The Frontier Grows Outward
*Picture settled vertices as a wavefront expanding from the source. Why does Dijkstra always finalize vertices in non-decreasing distance order?*

## The Priority Queue
*Which operations (push, pop-min, decrease-key) drive the loop, and why is a min-heap the natural fit for "pick the closest unsettled vertex"?*

### Lazy Deletion vs Decrease-Key
*Two ways to handle a vertex whose distance improves — push a duplicate and skip stale pops, or decrease-key in place. What does each cost in code complexity and heap size?*

### Detecting Stale Entries
*With lazy deletion the heap holds outdated `(dist, v)` pairs. What check lets you discard one on pop?*

## Building the Distance Array
*How is `dist[]` initialized, when is a vertex marked settled, and how does the source bootstrap the whole process?*

## Predecessors & Path Reconstruction
*How does a `prev[]` array let you walk back from target to source? What do you store on each successful relaxation, and which direction do you build the path in?*

## Why It Fails on Negative Edges
*Sketch a tiny graph where a settled vertex later gains a shorter path. Why does finalizing-on-pop break the moment an edge is negative?*

## Variants
*Early-exit when the target pops; multi-source by seeding several starts at distance 0; Dial's algorithm with bucket queues for small integer weights — when is each worth it?*

## vs Bellman-Ford
*Speed vs generality: which handles negatives, which is asymptotically faster, and what makes you accept the slower one?*

## Time Complexity
*Every vertex is popped once and every edge relaxed once. How do those two counts map onto heap operations?*

### Binary Heap vs Fibonacci Heap
*With a binary heap, what does each pop-min and each decrease-key cost, and how does that give the standard bound in terms of `V` and `E`? How does a Fibonacci heap change the decrease-key cost, and why is the improved bound rarely realized in practice?*

### Why the Bound Holds Intuitively
*Tie the total to "one pop per vertex, one relaxation per edge, each touching the heap." Why does the `\\( \log V \\)` factor attach to those operations?*

## Space Complexity
*What must you store for `dist[]`, `prev[]`, the settled markers, and the adjacency representation, each in terms of `V` and `E`?*

### Heap Size Under Lazy Deletion
*With duplicate pushes, how large can the priority queue grow relative to `E`, and how does that compare to a decrease-key implementation?*

## Implementation Walkthrough
*Plan the code before writing it — what are the moving parts?*

### Graph & Structures Setup
*What representation holds the weighted edges, and which arrays (`dist[]`, `prev[]`, visited) and what priority-queue element type do you initialize, and to what values?*

### The Main Loop
*Sketch the pop-min → skip-if-stale → relax-neighbors cycle. What is the loop's termination condition?*

### The Key Step: Relaxing Neighbors
*For the popped vertex, what do you do per outgoing edge — the comparison, the `dist[]` update, the `prev[]` update, and the push?*

### Reconstruction
*How do you turn `prev[]` into an ordered source-to-target path, and how do you signal "unreachable"?*

## Real Uses
*Routing, network latency, game-map pathfinding — where do non-negative weights occur naturally?*

## Pitfalls
*Forgetting to skip stale entries; assuming negative edges are fine; re-processing settled vertices; mixing up insertion vs decrease-key — what bug does each cause?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
