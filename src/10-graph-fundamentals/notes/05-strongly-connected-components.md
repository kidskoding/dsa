# Strongly Connected Components

## What They Are & When to Use Them
*What does an SCC capture, and which problems — deadlock detection, 2-SAT, condensing cyclic dependencies — need them?*

## Mutual Reachability
*What does it mean for two vertices to reach each other, and why does that make an equivalence class?*

## The Key Idea: Cycles Collapse Together
*Why do all vertices on a common cycle belong to one SCC, and how does that shape the partition?*

## Representation & the Transpose Graph
*What is the reversed graph, and how do you build it from the original adjacency list?*

## Kosaraju Two-Pass
*Why does a DFS on the graph, then a DFS on its transpose in finish-time order, isolate each component?*

### Finish-Time Stack
*How does the first pass's finish order tell the second pass which component to peel first?*

### Why the Transpose Traps Each Component
*Why does a second DFS on reversed edges, started from the latest-finishing vertex, stay inside one SCC?*

## Tarjan Lowlink
*How does a single DFS with discovery and low-link values pop components off a stack?*

### Discovery & Low-Link Values
*What do `disc[v]` and `low[v]` measure, and when does `low[v] == disc[v]` mark a component root?*

### On-Stack Tracking
*Why must you check whether a neighbor is still on the stack before updating low-link?*

### Popping a Component
*When a root is found, how do you pop exactly its members off the stack and no others?*

## Condensation DAG
*How does collapsing each SCC to a single node yield an acyclic meta-graph, and why is that useful?*

## Kosaraju vs. Tarjan Trade-offs
*Two passes and a transpose vs. one pass with bookkeeping — when do you reach for each?*

## Real Uses
*Where do SCCs appear — 2-SAT solving, web link analysis, cycle collapsing in dependency graphs?*

## Time Complexity
*Reason about why both algorithms stay linear despite multiple traversals.*

### Kosaraju's Two DFS Passes Plus Transpose Build
*Why do two full `O(V + E)` traversals plus building the reversed graph still total `O(V + E)`?*

### Tarjan's Single Pass
*Why does one DFS with constant extra work per vertex and edge keep Tarjan at `O(V + E)`?*

## Space Complexity
*Account for every structure these algorithms keep.*

### Kosaraju: Storing the Transpose + Finish Stack
*Why does holding a second copy of the edges and a finish-order stack cost `O(V + E)`?*

### Tarjan: disc / low / on-stack Arrays + the Stack
*Why do the per-vertex arrays and the explicit vertex stack each cost `O(V)`?*

## Pitfalls & Edge Cases
*Single-vertex components, self-loops, recursion depth, mixing up the transpose direction — where do these bite?*

## Implementation Walkthrough
*Break the algorithm into parts before coding — what does each part own?*

### Building Forward and (for Kosaraju) Reverse Adjacency
*What two structures do you populate, and how do you reverse each edge?*

### The First DFS: Ordering by Finish (or Assigning disc/low)
*What does the first traversal compute and store for the second phase or the root test?*

### The Second Phase: Collecting Components
*How do you walk vertices in the right order and group each traversal's reach into one SCC?*

### Labeling Vertices with Component Ids
*How do you record which SCC each vertex landed in for downstream use?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
