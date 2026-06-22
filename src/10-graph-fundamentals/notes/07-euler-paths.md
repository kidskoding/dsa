# Euler Paths & Circuits

## What They Are & When to Use Them
*What does traversing every edge exactly once solve — route planning, DNA fragment assembly, drawing without lifting the pen?*

## Path vs. Circuit
*What distinguishes an Euler path (open) from an Euler circuit (closed), and when does each exist?*

## The Key Idea: Every Entry Needs an Exit
*Why does "each visit to a vertex uses two edges" lead directly to the even-degree requirement?*

## Degree Conditions (Undirected)
*What parity rules on vertex degrees decide existence — zero or two odd-degree vertices?*

### Why Exactly Zero or Two Odd Vertices
*Why can't a graph with one, three, or four odd-degree vertices have an Euler path?*

## Connectivity Requirement
*Why must all edges live in one connected component, and how do you ignore isolated vertices?*

## Directed Graph Variant
*How do in-degree vs. out-degree balances replace the parity test for digraphs?*

## Hierholzer's Algorithm
*How does following edges until stuck, then splicing in detours, stitch cycles into one full traversal?*

### Edge-Tracking & the Stack
*What data structures mark edges used and hold the partial route, and how do you avoid reusing an edge?*

### Splicing Sub-Cycles Together
*When you return to a vertex with unused edges, how does the stack let you weave that detour into the route?*

## Picking a Valid Start Vertex
*Given the degree conditions, which vertex must you begin from for a path vs. a circuit?*

## Euler vs. Hamilton Contrast
*Why is edge-traversal solvable in linear time while vertex-traversal is intractable?*

## Real Uses
*Where does this appear — genome assembly with de Bruijn graphs, street-sweeping routes, circuit board drilling?*

## Time Complexity
*Reason about why Hierholzer's runs in `O(E)`.*

### Each Edge Traversed Once
*Why does marking an edge used and never revisiting it bound the work at `O(E)`?*

### The Cost of the Degree/Connectivity Pre-Check
*Why does verifying the existence conditions up front add only `O(V + E)`?*

## Space Complexity
*Account for every structure the algorithm keeps.*

### Used-Edge Marks & the Route Stack
*Why does tracking which edges are spent, plus the current path stack, cost `O(E)`?*

### Pointers into Each Adjacency List
*Why does keeping a "next unused edge" cursor per vertex cost `O(V)` and avoid rescanning?*

## Pitfalls & Edge Cases
*Disconnected edge sets, multigraphs, self-loops, choosing the wrong start, re-walking an edge — where do these bite?*

## Implementation Walkthrough
*Break the algorithm into parts before coding — what does each part own?*

### Verifying Existence Conditions First
*What degree and connectivity checks gate the algorithm, and what do you return if they fail?*

### Tracking Unused Edges Efficiently
*How do you mark an edge consumed and advance a per-vertex cursor so you never re-scan spent edges?*

### The Stack-Driven Traversal Loop
*How does the main loop push when it can advance and pop-to-output when it gets stuck?*

### Emitting the Route in Correct Order
*Why might the path come out reversed, and how do you produce the final ordering?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
