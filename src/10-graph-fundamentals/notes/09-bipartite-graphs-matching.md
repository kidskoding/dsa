# Bipartite Graphs & Matching

## What They Are & When to Use Them
*What does splitting vertices into two sides model — job assignment, scheduling, resource allocation?*

## Two-Coloring Test
*How does a BFS/DFS that colors neighbors oppositely decide if a graph is bipartite?*

### Propagating Colors Along Edges
*As you traverse, why must each neighbor take the opposite color, and what does a conflict mean?*

## Odd Cycle Characterization
*Why does any odd-length cycle make two-coloring impossible?*

## What a Matching Is
*What makes a set of edges a matching, and what distinguishes maximal from maximum?*

## The Key Idea: Grow the Matching via Alternating Paths
*Why does flipping the edges along an alternating path that starts and ends free increase the matching by exactly one?*

## Augmenting Paths
*What makes an alternating path "augmenting," and what does flipping its edges do to the matching size?*

### Why No Augmenting Path Means Maximum
*Why does the absence of any augmenting path certify that the current matching is already maximum?*

## Hungarian-Style Augmentation (Kuhn's)
*How does repeatedly searching for an augmenting path from each free vertex grow the matching to maximum?*

### The Try-Each-Left-Vertex Loop
*How does attempting to match every left vertex in turn, reusing a DFS, build up the maximum?*

## Maximum Matching & Kőnig's Theorem
*How does maximum matching size relate to minimum vertex cover in a bipartite graph?*

## Hopcroft–Karp Speedup
*How does finding many shortest augmenting paths per phase improve over one-at-a-time augmentation?*

### BFS Layering + DFS Augmenting
*How does a BFS to build layers, followed by DFS to find disjoint shortest augmenting paths, define one phase?*

## Weighted Matching
*How does the problem change when edges carry costs, and what's the goal then?*

## Real Uses
*Where does bipartite matching appear — assigning workers to tasks, students to schools, ad slots to bidders?*

## Time Complexity
*Reason about the cost of each method.*

### Two-Coloring: A Single Traversal
*Why is the bipartite check just `O(V + E)`, the cost of one BFS/DFS?*

### Kuhn's `O(V \cdot E)`
*Why does running one augmenting-path search per left vertex, each scanning up to `E` edges, give this bound?*

### Hopcroft–Karp's `O(E \sqrt{V})`
*Why does batching shortest augmenting paths cut the number of phases to about `\sqrt{V}`?*

## Space Complexity
*Account for every structure these algorithms keep.*

### Color / Match Arrays
*Why do the coloring array and the two-sided match arrays each cost `O(V)`?*

### Visited Markers & Layer/Queue Storage
*Why does the per-search visited set, plus Hopcroft–Karp's layers and queue, cost `O(V)`?*

## Pitfalls & Edge Cases
*Disconnected components, forgetting to color all parts, free vs. matched vertices, directed vs. undirected — where do these bite?*

## Implementation Walkthrough
*Break the algorithm into parts before coding — what does each part own?*

### Building the Bipartition
*How do you split vertices into the two sides, or run the coloring that produces them?*

### The Match Arrays
*What do you store for each left and right vertex to record current pairings, and what marks "unmatched"?*

### The Augmenting-Path Search
*Inside the per-vertex search, how do you try a neighbor, recurse to re-match its partner, and commit on success?*

### Counting and Reporting the Matching
*How do you tally matched pairs and, if needed, output the actual assignment?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
