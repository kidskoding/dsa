# Topological Sort

## What It Is & When to Use It
*What does a linear order respecting all "must come before" edges buy you — scheduling, build order, dependency resolution?*

## DAG Precondition
*Why must the graph be acyclic, and what does a cycle mean for the ordering?*

## The Key Idea: Respect Every Dependency
*Why does "every edge points forward in the final list" capture exactly what a valid order means?*

## Representation & Indegree Setup
*What do you precompute (adjacency list, indegree counts) before either algorithm can run?*

## Kahn's Algorithm (Indegree Peeling)
*How does repeatedly removing zero-indegree nodes build a valid order?*

### The Zero-Indegree Queue
*What data structure holds the "ready" nodes, and when does a node become ready?*

### Decrementing Indegrees as You Remove
*When you output a node, which neighbors' indegrees drop, and what makes one newly eligible?*

## DFS Finish-Time Ordering
*Why does pushing each vertex on finish and reversing produce a valid topological order?*

### Why Reverse Finish Order Works
*Why is a vertex always finished after every vertex it depends on, making the reversal valid?*

## Cycle Detection as a Byproduct
*How does Kahn's leftover count, or DFS's back edge, surface a cycle when ordering fails?*

## Non-Uniqueness of Orderings
*When does a DAG admit many valid orders, and what controls which one you get?*

## Lexicographically Smallest Order
*How does swapping the queue for a priority queue in Kahn's pick a deterministic order?*

## Real Uses
*Where does this show up — task schedulers, spreadsheet recalc, course prerequisites, package managers?*

## Time Complexity
*Reason about why both approaches are `O(V + E)`.*

### Kahn's: Each Node Enqueued Once, Each Edge Relaxed Once
*Why does every vertex enter the queue exactly once and every edge trigger exactly one indegree decrement?*

### DFS Variant: Standard Traversal Cost
*Why does the finish-time approach inherit DFS's `O(V + E)` with only a stack push added per vertex?*

### Priority-Queue Variant Cost
*What `log V` factor does the lexicographically-smallest version add, and where does it come from?*

## Space Complexity
*Account for every structure these algorithms keep.*

### Indegree Array & the Queue
*Why is the indegree array `O(V)`, and how large can the ready-queue get?*

### Recursion Stack & Output List
*Why do the DFS stack and the result list each cost `O(V)`?*

## Pitfalls & Edge Cases
*Disconnected DAGs, self-loops, forgetting to seed all zero-indegree nodes — where do these trip you?*

## Implementation Walkthrough
*Break the algorithm into parts before coding — what does each part own?*

### Computing Indegrees (Kahn) or Visited States (DFS)
*What do you precompute in a first pass before the main loop begins?*

### The Main Removal / Recursion Loop
*How is the core loop structured, and what does it emit on each step?*

### Detecting the Cycle Case
*Where in the code do you notice that no valid order exists, and how do you report it?*

### Producing the Final Order
*How do you assemble and (for the DFS variant) reverse the output sequence?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
