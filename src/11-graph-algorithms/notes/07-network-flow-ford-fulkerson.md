# Ford-Fulkerson Maximum Flow

## What It Solves & When
*Push as much "stuff" from source to sink as the edge capacities allow — what real problems reduce to maximum flow?*

## Flow Networks & Capacity Constraints
*Define capacity, flow on an edge, conservation at intermediate nodes, and the value of a flow. What makes a flow feasible?*

### Skew Symmetry & Conservation
*Why is flow on `(u,v)` the negative of flow on `(v,u)`, and why must inflow equal outflow at every non-terminal node?*

## Core Idea: Augmenting Paths
*Find a source-to-sink path with spare capacity, push flow along it, repeat. How much can each path carry?*

### The Bottleneck
*Why does each augmenting path increase total flow by exactly its minimum residual capacity?*

## The Residual Graph
*What is residual capacity, and how is it built from current flow and original capacity?*

### Why Back Edges Matter
*Back edges let later paths "undo" earlier flow. Why is this cancellation essential to reaching the true maximum, not just a local optimum?*

### Updating Residuals on Augment
*When you push `b` units along a path, what happens to the forward residual and the reverse residual of each edge?*

## Finding Paths: DFS and the Generic Method
*Ford-Fulkerson leaves path choice open. What does a plain DFS search give you, and what does it risk?*

## Max-Flow Min-Cut Theorem
*State it. Why does "no augmenting path remains" mean the flow is maximum?*

### The Three Equivalent Conditions
*Max flow, no augmenting path, and flow value equal to some cut capacity — why are these three statements equivalent?*

## Termination & Irrational Capacities
*Why can poor path choices run forever (or extremely long) with irrational/large capacities? What does integral capacity guarantee?*

## Variants
*Different path-selection rules turn it into Edmonds-Karp (BFS) or capacity-scaling. How does the choice change behavior?*

## vs Edmonds-Karp
*Generic Ford-Fulkerson's runtime depends on the flow value; Edmonds-Karp fixes the path rule. What's the trade-off?*

## Time Complexity
*Each augmentation adds at least one unit of flow with integral capacities. How does that connect runtime to the flow value `|f*|`?*

### Why It Depends on the Flow Value
*Each augmenting-path search costs `O(E)`. Multiply by the number of augmentations — why can that number be as large as `|f*|`, and why is that a weakness?*

## Space Complexity
*What do you store — the residual capacities (forward and reverse), the adjacency structure, and the per-search visited/parent arrays? Size each in terms of `V` and `E`.*

### Representing Residuals
*Why is pairing each edge with its reverse (and indexing one from the other) a compact way to hold the residual graph?*

## Implementation Walkthrough
*Plan the code before writing it.*

### Graph & Residual Setup
*How do you store each directed edge alongside its reverse edge so updates touch both? What are the initial residual capacities?*

### The Augmenting Loop
*Sketch: search for an `s`-`t` path with positive residual, find its bottleneck, augment, repeat until none exists.*

### The Key Step: Augmenting Along a Path
*Given a found path, how do you compute the bottleneck and then update forward and reverse residuals edge by edge?*

### Reading Off the Max Flow
*Where does the final flow value come from — the bottlenecks summed, or the saturated edges out of the source?*

## Real Uses
*Bipartite matching, project selection, network reliability, image segmentation — how do these become flow problems?*

## Pitfalls
*Forgetting to add reverse edges; not updating both directions on augment; choosing pathological paths; non-integer capacities causing non-termination — what fails?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
