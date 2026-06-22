# Johnson's Algorithm

## The Reweighting Problem
*Why do we want all-pairs shortest paths with Dijkstra, and what stops us?*

## Potential Function \\( h(v) \\)
*How is the potential defined, and why does \\( w'(u,v) = w(u,v) + h(u) - h(v) \\) stay nonnegative?*

## Bellman-Ford on the Augmented Graph
*What is the virtual source vertex for, and what does it compute?*

## Why Reweighting Preserves Shortest Paths
*Show that the path-cost shift is telescoping and independent of the path.*

## Running Dijkstra From Each Vertex
*How are the true distances recovered after reweighting?*

## Complexity \\( O(VE + V^2\log V) \\)
*Break the bound into the Bellman-Ford and per-vertex Dijkstra phases.*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
