# Disjoint Sets: Problem Set

Statements only. No solutions. Three sections: Coding problems are implemented
against the stubs in `problemset/`; Conceptual problems are proofs/derivations
written in LaTeX in your notes (no code); Challenge problems are harder problems
implemented against the stubs.

Use `\\( \\)` / `\\[ \\]` for any math (MathJax is enabled in the book).

## Coding

- [ ] **Problem 01: Count connected components.** Given the number of nodes `n`
  and a list of undirected edges, return the number of connected components by
  building a union-find and counting distinct representatives.
- [ ] **Problem 02: Detect a cycle in an undirected graph.** Given `n` nodes and
  a list of edges, return `true` if adding the edges to a union-find ever unions
  two already-connected endpoints (i.e. the graph contains a cycle).
- [ ] **Problem 03: Redundant connection.** Given a list of edges that forms a
  tree plus exactly one extra edge, return the last edge (in input order) whose
  endpoints are already connected.
- [ ] **Problem 04: Largest set size.** Given `n` elements and a sequence of
  union operations, return the size of the largest resulting set.
- [ ] **Problem 05: Are all elements connected?** After applying a list of
  unions over `n` elements, return `true` if every element ends up in a single
  set.

## Conceptual

- [ ] **Problem 06.** Prove that with union by rank, a tree whose root has rank
  \\( r \\) contains at least \\( 2^r \\) nodes. Conclude that the rank of any node
  is at most \\( \lfloor \log_2 n \rfloor \\).
- [ ] **Problem 07.** Prove that, without any balancing, a sequence of \\( n-1 \\)
  unions can build a single chain of height \\( n-1 \\), making a `Find` cost
  \\( \Theta(n) \\) in the worst case.
- [ ] **Problem 08.** Using the aggregate method, prove that union by rank alone
  (no path compression) gives \\( O(\log n) \\) per operation. State the invariant
  you rely on.
- [ ] **Problem 09.** Define the Ackermann function \\( A(m, n) \\) and its inverse
  \\( \alpha(n) \\). Prove that \\( \alpha(n) \le 4 \\) for every \\( n \\) below a
  bound far exceeding the number of atoms in the observable universe.
- [ ] **Problem 10.** Prove that union by rank combined with path compression
  yields \\( O(m\,\alpha(n)) \\) total time for \\( m \\) operations, sketching the
  potential / accounting argument over rank blocks.

## Challenge

- [ ] **Problem 11: Accounts merge.** Given a list of accounts where each account
  is a name followed by emails, merge accounts that share any email and return
  the merged groups. Use union-find keyed by email.
- [ ] **Problem 12: Number of islands.** Given a binary grid, return the number
  of connected regions of `1`s (4-directional adjacency) using union-find over
  cell indices.
- [ ] **Problem 13: Kruskal's MST weight.** Given a weighted undirected graph,
  return the total weight of a minimum spanning tree by sorting edges and using
  union-find to reject cycle-forming edges.
- [ ] **Problem 14: Union-find with rollback.** Support a stack of union
  operations with an `Undo` that reverts the most recent union, returning the
  set count after a mixed sequence of unions and undos (no path compression so
  that operations are reversible).
