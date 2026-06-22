# Floyd-Warshall All-Pairs Shortest Paths

## What It Solves & When
*Shortest paths between every pair of vertices in one shot — when is all-pairs the right framing instead of running a single-source algorithm `V` times?*

## Core Idea: DP Over Intermediate Vertices
*What does "allow vertex `k` as an intermediate" mean, and how does adding one more allowed waypoint extend the solution?*

### The Recurrence
*`dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])` — what does each term represent?*

### Why It Builds Up Correctly
*By the time you consider intermediate `k`, paths through `1..k-1` are already optimal. Why does that make the update safe?*

## The Triple Loop & Why k Is Outermost
*Why must the intermediate vertex `k` be the outer loop? What breaks if `i` or `j` is outermost?*

### In-Place Update Without a Third Dimension
*The textbook DP has a `k` superscript, but the code uses one 2-D matrix. Why is overwriting in place still correct?*

## The Distance Matrix
*How do you initialize the matrix from the adjacency representation — self-distance, direct edges, missing edges?*

## Path Reconstruction with a Next Matrix
*How does a `next[i][j]` (or predecessor) matrix let you rebuild the actual route between any pair? When do you update it?*

## Handling Negative Edges & Cycles
*Negative edges are fine — but how do you detect a negative cycle? What does a negative diagonal entry `dist[i][i] < 0` mean?*

## Variants
*Transitive closure (reachability) via boolean AND/OR; min-max / widest-path by swapping the operators — what stays the same?*

## vs Johnson's & Repeated Dijkstra
*Dense vs sparse graphs: when does the simple matrix approach beat `V` runs of a single-source algorithm?*

## Time Complexity
*Three nested loops over all vertices. Why does that give a cubic bound independent of edge count?*

### Why Dense Graphs Favor It
*On a dense graph where `E` approaches `V^2`, how does the cubic time compare to running Dijkstra from every vertex? What makes the small constant factor matter?*

## Space Complexity
*The distance matrix alone — what's its size in terms of `V`? What extra cost does the `next`/predecessor matrix add?*

### In-Place Savings
*Why does overwriting one matrix avoid an extra `V`-factor of space that a naive layered DP would need?*

## Implementation Walkthrough
*Plan the code before writing it.*

### Matrix Setup
*How do you fill the initial `V x V` matrix — diagonal zeros, edge weights, `INF` elsewhere — and initialize `next[][]`?*

### The Triple Loop
*Sketch `k` outer, then `i`, then `j`. What single comparison-and-update sits in the innermost body?*

### The Key Step: Considering Vertex k
*For each `(i,j)`, what does routing through `k` test, and when do you commit the shorter route and update `next`?*

### Reconstruction & Cycle Check
*How do you walk `next[][]` to list a path, and how do you scan the diagonal for negative cycles?*

## Real Uses
*Routing tables, reachability in small graphs, kernel of more complex DP — where does dense all-pairs come up?*

## Pitfalls
*Wrong loop order; overflow when summing two `INF` sentinels; mishandling `i==j` — what symptoms appear?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
