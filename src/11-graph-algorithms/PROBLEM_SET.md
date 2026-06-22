# Graph Algorithms: Problem Set

Three sections: Coding problems are implemented against the stubs in
`problemset/`; Conceptual problems are proofs/derivations written in LaTeX (e.g.
\\( O((V+E)\log V) \\), no code); Challenge problems are harder problems
implemented against the stubs.

---

## Coding

### Problem 01: Path Weight Validator
Given a `WeightedGraph` and an ordered list of vertices, compute the total weight
of traversing that exact sequence of vertices, or report that the walk is invalid
because some consecutive pair has no connecting edge.

### Problem 02: Reachable Set Under Budget
Given a source vertex and a non-negative distance budget \\( B \\), return every
vertex whose shortest-path distance from the source is at most \\( B \\).

### Problem 03: Lightest Edge Across a Cut
Given a `WeightedGraph` and a subset \\( S \\) of vertices, find the minimum-weight
edge with exactly one endpoint in \\( S \\) (the cheapest edge crossing the cut), or
report that no such edge exists.

### Problem 04: Count Connected Components
Treating the graph as undirected, count the number of connected components.

### Problem 05: Tree Edge Sum
Given a list of edges claimed to form a spanning tree, verify it spans every
vertex without forming a cycle and return its total weight, or report that it is
not a valid spanning tree.

### Problem 06: Bottleneck Of A Path
Given a source, a sink, and a single fixed path between them, return the minimum
edge capacity along that path (its bottleneck).

---

## Conceptual

### Problem 07: Correctness Of The Greedy Cut Rule
Prove the cut property: for any cut of a connected weighted graph with distinct
edge weights, the unique lightest edge crossing the cut belongs to every minimum
spanning tree. State precisely where distinctness is used.

### Problem 08: Why Dijkstra Fails On Negative Edges
Exhibit a graph with a single negative edge on which Dijkstra returns an incorrect
distance, and prove that the failure stems from violating the algorithm's
monotonic-extraction invariant.

### Problem 09: Johnson Reweighting Preserves Shortest Paths
Let \\( h \\) be a potential function. Prove that reweighting each edge \\( (u,v) \\)
to \\( w(u,v) + h(u) - h(v) \\) leaves the set of shortest paths between any pair
unchanged, and that the reweighted path length differs from the original by a term
depending only on the endpoints.

### Problem 10: Edmonds-Karp Polynomial Bound
Prove that Edmonds-Karp performs \\( O(VE) \\) augmentations, and conclude the
overall \\( O(VE^2) \\) running time. Use the fact that BFS distances from the
source to any vertex are non-decreasing across augmentations.

### Problem 11: Max-Flow Min-Cut Theorem
Prove that the value of a maximum \\( s\text{-}t \\) flow equals the capacity of a
minimum \\( s\text{-}t \\) cut. Cover both inequalities.

### Problem 12: Bellman-Ford Convergence
Prove that after \\( k \\) relaxation passes, Bellman-Ford has computed correct
distances to every vertex whose shortest path uses at most \\( k \\) edges, and use
this to justify the \\( V-1 \\) pass bound and the negative-cycle detection pass.

---

## Challenge

### Problem 13: Second-Best Minimum Spanning Tree
Compute the weight of the second-best spanning tree: the minimum weight over all
spanning trees that differ from the MST in at least one edge.

### Problem 14: Shortest Path With Exactly K Edges
Given a source, a sink, and an integer \\( k \\), compute the minimum-weight walk
from source to sink that uses exactly \\( k \\) edges (repeated vertices allowed),
or report that none exists.

### Problem 15: Minimum-Cost Maximum Flow Value
Given capacities and per-unit edge costs (encoded as a second `WeightedGraph`),
compute the minimum total cost among all flows that achieve the maximum flow
value from source to sink.

### Problem 16: Vertex-Capacitated Max Flow
Given per-vertex capacities in addition to edge capacities, compute the maximum
flow that respects both. (Hint: split each vertex.)
