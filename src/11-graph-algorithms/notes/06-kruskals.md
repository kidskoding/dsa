# Kruskal's Minimum Spanning Tree

## What It Solves & When
*Build a minimum spanning tree by adding cheapest safe edges globally — when does this edge-centric view beat growing a tree?*

## Core Idea: Sort Edges, Add If Safe
*Process edges in non-decreasing weight. Why is the cheapest edge that doesn't form a cycle always safe to add?*

### Why Sorted Order Makes Greedy Work
*Tie this to the cut property: when you pick the next-cheapest non-cycling edge, which cut is it the minimum crosser of?*

## Union-Find as the Engine
*How does a disjoint-set structure answer "are these two endpoints already connected?" in near-constant time?*

### Find with Path Compression
*What does `find` return, and how does compression flatten the tree on the way up to the root?*

### Union by Rank / Size
*Why attach the smaller tree under the larger? What worst-case tree height does this prevent?*

## The Cut & Cycle Properties
*Which property justifies including a light crossing edge, and which justifies rejecting an edge inside a component?*

## Detecting Cycles Without Searching
*Why does "both endpoints share a root" mean adding the edge would create a cycle?*

## Stopping Early
*How many edges does a spanning tree on `V` vertices have, and how does that let you halt before exhausting the sorted list?*

## Variants
*Pre-sorted or radix-sorted edges; filter-Kruskal; building a spanning forest on disconnected graphs — what changes?*

## vs Prim's
*Kruskal's loves sparse graphs and pre-sorted edges; Prim's loves dense ones. What drives the choice?*

## Time Complexity
*Two phases: sorting the edges, then a near-linear sweep with union-find. Which dominates?*

### Why the Sort Dominates
*State the sort cost in terms of `E`, and explain why the union-find work over all edges is effectively linear (the inverse-Ackermann factor). Why is `\\( \log E \\)` interchangeable with `\\( \log V \\)` here?*

## Space Complexity
*What do the edge array and the union-find `parent[]`/`rank[]` arrays cost in terms of `V` and `E`?*

### Union-Find Footprint
*Why is the disjoint-set overhead only linear in `V`, regardless of edge count?*

## Implementation Walkthrough
*Plan the code before writing it.*

### Edge List & Union-Find Setup
*How do you build the sortable edge list, and initialize `parent[]` and `rank[]` so each vertex starts in its own set?*

### Sorting & The Main Sweep
*After sorting by weight, sketch the loop: for each edge, decide include-or-skip. What is the accept condition?*

### The Key Step: Union on Accept
*When endpoints have different roots, what two things happen — record the edge, and merge the sets how?*

### Building the Result
*How do you accumulate MST edges and total weight, and detect that the graph was disconnected?*

## Real Uses
*Clustering (cut the `k-1` heaviest MST edges), circuit/road design, image segmentation — where does the global edge view help?*

## Pitfalls
*Skipping path compression/union-by-rank and getting slow finds; not handling disconnected graphs; unstable tie handling — what bites you?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
