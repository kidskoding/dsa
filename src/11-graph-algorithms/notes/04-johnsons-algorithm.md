# Johnson's Algorithm

## What It Solves & When
*All-pairs shortest paths on a sparse graph that may have negative edges — why is this the sweet spot Johnson's targets?*

## The Core Trick: Reweight, Then Dijkstra
*We want to run fast Dijkstra `V` times, but negatives block it. What's the high-level plan to make every edge non-negative first?*

## The Potential Function
*Each vertex gets a potential `h(v)`. The reweighted edge is `w'(u,v) = w(u,v) + h(u) - h(v)` — what role does the potential play?*

### Why Reweighting Keeps Edges Non-Negative
*Given how `h` is computed, why is every `w'(u,v) >= 0`? What inequality on shortest-path distances guarantees it?*

### Why the Shift Is Path-Independent
*Summing `w'` along any path telescopes to `w(path) + h(start) - h(end)`. Why does that mean the cheapest path between two vertices is unchanged?*

## Adding a Virtual Source
*A new vertex connects to all others with weight-0 edges. What is it for, and what does running Bellman-Ford from it produce?*

## The Bellman-Ford Phase
*What does this phase compute (the `h` values), and what does it catch before any Dijkstra runs?*

### Detecting Negative Cycles Early
*If Bellman-Ford finds a negative cycle here, what do you do, and why is it pointless to continue?*

## The Dijkstra Phase
*Run Dijkstra from every vertex on the reweighted graph. Why is each run now valid?*

## Recovering True Distances
*Dijkstra returns reweighted distances `d'(u,v)`. How do you undo the shift with `h(u)` and `h(v)` to get the real distance?*

## vs Floyd-Warshall
*Sparse vs dense: when does Johnson's beat the simple cubic matrix, and when is it overkill?*

## Time Complexity
*Add up the phases: one Bellman-Ford plus `V` Dijkstra runs. How do these combine?*

### Which Phase Dominates
*On a sparse graph, is the bottleneck the single `O(VE)` Bellman-Ford or the `V` heap-based Dijkstra runs? How does graph density shift the answer?*

## Space Complexity
*What do you store — the augmented graph, the `h[]` potentials, the per-source distance arrays, the reweighted edge weights? Size each in terms of `V` and `E`.*

### The Output Matrix
*All-pairs results are `V` distance arrays. Why is the `V^2` output unavoidable regardless of how fast you compute it?*

## Implementation Walkthrough
*Plan the code before writing it.*

### Building the Augmented Graph
*How do you add the virtual source and its zero-weight edges without disturbing the original vertices?*

### Computing Potentials with Bellman-Ford
*Run from the virtual source — what does the resulting distance array become, and how do you bail on a negative cycle?*

### Reweighting Every Edge
*Apply `w'(u,v) = w(u,v) + h(u) - h(v)` across the edge set. What invariant should you sanity-check afterward?*

### Per-Source Dijkstra & Un-Shifting
*Loop Dijkstra over every source on the reweighted graph, then convert each reweighted distance back. What's the un-shift formula?*

## Real Uses
*All-pairs distances in large sparse networks with some negative weights — where does this combination occur?*

## Pitfalls
*Forgetting to remove the virtual source before Dijkstra; applying the un-shift wrong; mixing up `h(u)` and `h(v)`; reusing original weights by mistake — what breaks?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
