# Breadth-First Search

## What It Is & When to Use It
*What problem shape — shortest hops, level order, nearest target — makes BFS the right tool?*

## Representation It Needs
*What does BFS expect from your graph, and how do you iterate a vertex's neighbors cheaply?*

## The Key Idea: Expanding Outward in Rings
*Why does processing the closest vertices first guarantee you reach everything in nondecreasing distance order?*

## How the Traversal Works
*Walk one expansion: dequeue a vertex, scan its edges, enqueue the new ones — what happens each step?*

## Queue-Based Frontier
*Why a FIFO queue, and what does the frontier represent at any moment?*

### Why FIFO and Not LIFO
*What would swapping the queue for a stack do to the order vertices come out, and why does that break BFS?*

## Visited Set & Marking Timing
*Why mark a vertex visited when you enqueue it, not when you dequeue it?*

### The Double-Enqueue Bug
*What goes wrong if two neighbors both push the same unvisited vertex before either is processed?*

## Layered Levels & Distances
*How do vertices partition into distance layers from the source, and how do you record each level?*

### Tracking the Current Level Size
*How does snapshotting the queue size at the start of a level let you process one ring at a time?*

## Shortest Paths in Unweighted Graphs
*Why does first-discovery give the minimum hop count, and where does this break with weights?*

## Parent Tracking & Path Reconstruction
*How does a parent array let you rebuild the actual path after the search ends?*

## Multi-Source & Variant Forms
*How does seeding the queue with many starts, or running 0-1 BFS, extend the basic algorithm?*

## Time Complexity
*Reason about why BFS is `O(V + E)`, not by memorizing it.*

### Why Each Vertex Is Processed Once
*What guarantees a vertex is dequeued exactly once, contributing `O(V)` across the whole run?*

### Why Each Edge Is Scanned a Bounded Number of Times
*How many times is an edge examined across the traversal, and how does that total to `O(E)`?*

### How Representation Changes the Bound
*Why does an adjacency list give `O(V + E)` while a matrix forces `O(V^2)` regardless of edge count?*

## Space Complexity
*Account for every structure BFS keeps in memory.*

### Visited Set & Distance/Parent Arrays
*Why do these auxiliary arrays each cost `O(V)`?*

### Peak Queue Size
*In the worst case, how large can the frontier grow, and what graph shape causes it?*

## Trade-offs vs. DFS
*When does BFS's level-by-level shape beat DFS, and what does its frontier cost you in memory?*

## Common Pitfalls
*Disconnected graphs, re-enqueuing duplicates, marking too late — where do these bite?*

## Implementation Walkthrough
*Break the algorithm into parts before coding — what does each part own?*

### Setting Up the Graph & Auxiliary Arrays
*What do you initialize for visited, distance, and parent before the loop starts?*

### Seeding & Draining the Queue
*How do you push the source(s) and structure the main dequeue loop?*

### Per-Neighbor Work
*Inside the loop, what do you check and update for each neighbor before enqueuing it?*

### Reconstructing a Path from Parents
*After the search, how do you walk the parent array back from a target to the source?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
