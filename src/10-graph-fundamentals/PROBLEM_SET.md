# Graph Fundamentals: Problem Set

Three sections: Coding problems are implemented against the stubs in
`problemset/`; Conceptual problems are proofs/derivations written in LaTeX (no
code); Challenge problems are harder problems implemented against the stubs.

## Coding

- [ ] **Problem 01.** Given an undirected graph as an edge list and a vertex
  count, build the shared `Graph` and return the degree of every vertex.

- [ ] **Problem 02.** Count the number of connected components in an undirected
  graph.

- [ ] **Problem 03.** Given an unweighted graph and a source, return the set of
  vertices reachable within exactly `k` BFS levels.

- [ ] **Problem 04.** Detect whether an undirected graph contains a cycle.

- [ ] **Problem 05.** Given a directed graph, return a valid topological order
  or report that none exists (the graph has a cycle).

- [ ] **Problem 06.** Determine whether a given graph is bipartite and, if so,
  return the two color classes.

## Conceptual

- [ ] **Problem 07.** Prove that BFS from a source `s` computes shortest-path
  distances in an unweighted graph. State and justify the loop invariant in
  LaTeX, e.g. \\( \delta(s, v) \\).

- [ ] **Problem 08.** Prove the white-path theorem for DFS: vertex `v` is a
  descendant of `u` in the DFS forest iff at time `d[u]` there is a path from
  `u` to `v` consisting entirely of white vertices.

- [ ] **Problem 09.** Prove that a directed graph has a topological ordering iff
  it is acyclic. Argue both directions.

- [ ] **Problem 10.** Derive the \\( O(V + E) \\) running time of Kosaraju's
  strongly-connected-components algorithm and explain why the transpose pass
  preserves component membership.

- [ ] **Problem 11.** Prove that a connected undirected graph has an Euler
  circuit iff every vertex has even degree.

- [ ] **Problem 12.** Prove that an undirected edge `(u, v)` discovered as a
  tree edge in DFS is a bridge iff `low[v] > disc[u]`.

## Challenge

- [ ] **Problem 13.** Compute, for every edge of an undirected graph, whether it
  is a bridge, in a single DFS pass (output the bridge set).

- [ ] **Problem 14.** Build the condensation (DAG of strongly connected
  components) of a directed graph: return a component-id per vertex plus the
  edge set between distinct components.

- [ ] **Problem 15.** Given a DAG with edge weights (possibly negative), compute
  the longest path length starting from a given source using topological-order
  relaxation.

- [ ] **Problem 16.** Construct an Euler circuit (the actual vertex sequence) of
  an undirected graph using Hierholzer's algorithm, or report that none exists.

- [ ] **Problem 17.** Decide whether an undirected graph has a Hamiltonian path
  using a bitmask dynamic program over vertex subsets.
