# Articulation Points & Bridges

## What They Are & Why They Matter
*What does a cut vertex or cut edge represent, and which problems — network reliability, single points of failure — care?*

## The Key Idea: Can a Subtree Escape Without Its Parent?
*Why does the whole question reduce to whether a child's subtree has any back-edge bypassing the parent?*

## The DFS Tree & Back Edges
*How does running DFS turn the graph into a tree of tree-edges plus back-edges, and why does that structure matter?*

### Why Undirected DFS Has No Cross Edges
*Why can every non-tree edge in an undirected DFS only point back to an ancestor, never sideways?*

## Discovery & Low Values
*What do `disc[v]` and `low[v]` measure, and how is `low[v]` updated from children and back-edges?*

### Computing low[v] Step by Step
*From a vertex's own discovery time, its children's low values, and its back-edges, how do you fold these into `low[v]`?*

## Articulation-Point Condition
*For a non-root vertex, when does a child's low-value prove that removing the vertex disconnects the graph?*

## Bridge Condition
*What strict inequality on a child's low-value marks the connecting tree edge as a bridge?*

### Why the Inequality Is Strict for Bridges but Not Cut Vertices
*Why does `low[child] > disc[v]` mean a bridge while `low[child] >= disc[v]` means a cut vertex?*

## Root Special Case
*Why does the DFS root need its own rule based on how many DFS children it has?*

## Biconnected Components
*How do articulation points partition the graph into biconnected pieces, and how does an edge stack collect them?*

## Single-Pass Computation
*How do you find all articulation points and bridges in one DFS instead of testing each vertex by removal?*

### Why Removal-Testing Is Wasteful
*What is the cost of deleting each vertex and rerunning connectivity, and how does low-link avoid it?*

## Directed vs. Undirected Scope
*Why are these defined for undirected graphs, and what's the directed analog?*

## Time Complexity
*Reason about why the DFS-based approach is `O(V + E)`.*

### One DFS, Constant Work per Edge
*Why does computing disc/low during a single traversal add only constant work per edge, keeping it linear?*

### Contrast with Naive Removal Testing
*Why does the remove-and-recheck approach blow up to `O(V * (V + E))`, and why is that so much worse?*

## Space Complexity
*Account for every structure the algorithm keeps.*

### disc / low / visited Arrays
*Why do these per-vertex arrays each cost `O(V)`?*

### Recursion Stack & Optional Edge Stack
*Why does the DFS recursion cost `O(V)`, and what does the biconnected-component edge stack add?*

## Pitfalls & Edge Cases
*Parallel edges, the parent-edge exception, disconnected graphs, the root rule — where do these trip you?*

## Implementation Walkthrough
*Break the algorithm into parts before coding — what does each part own?*

### Initializing Timers and Arrays
*What counters and per-vertex arrays do you set up before the DFS?*

### The Recursive DFS with low Updates
*Inside the recursion, in what order do you stamp `disc`, recurse into children, and fold results into `low`?*

### Distinguishing the Parent Edge from a Real Back-Edge
*How do you avoid mistaking the edge back to your DFS parent for a genuine back-edge?*

### Emitting Cut Vertices, Bridges, or Components
*Where in the recursion do you apply each condition and record the result?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
