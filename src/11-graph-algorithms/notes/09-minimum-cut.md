# Minimum Cut

## What It Solves & When
*Find the cheapest set of edges whose removal disconnects source from sink (or splits the graph) — what does "cheapest to break" model in practice?*

## Defining an s-t Cut
*Which vertex partitions count as a valid `s-t` cut, and how do you measure a cut's capacity?*

### Only Forward Edges Count
*Why does cut capacity sum only edges crossing from the source side to the sink side, not back edges?*

## Max-Flow Min-Cut Duality
*Why does the maximum flow value equal the minimum cut capacity? What's the intuition linking them?*

### Why Any Flow Bounds Any Cut
*Every flow value is at most every cut capacity. Why does that "weak duality" make a matching flow/cut pair a certificate of optimality for both?*

## Recovering the Cut from a Max Flow
*After computing max flow, run a reachability search in the residual graph. How does the set of reachable vertices give you the partition?*

### Which Edges Are Cut
*Given the partition, how do you list the actual cut edges, and why are they all saturated by the max flow?*

## Global Min-Cut vs s-t Min-Cut
*The `s-t` version fixes two terminals; the global version minimizes over all splits. How do the problems and algorithms differ?*

## Stoer-Wagner for Global Cuts
*When there's no fixed `s` and `t`, what does Stoer-Wagner do instead of max flow — and what is a "maximum adjacency" ordering?*

## Variants
*Weighted vs unweighted; node cuts via node-splitting; multi-terminal cuts — how do you reduce these to the basic form?*

## Time Complexity
*The `s-t` min cut costs exactly one max-flow computation. What does that make its runtime, given your chosen max-flow algorithm?*

### s-t via Max Flow vs Global via Stoer-Wagner
*Why does the global min cut not need to fix terminals, and what does Stoer-Wagner's repeated-merging cost come to in terms of `V` and `E`?*

## Space Complexity
*What do you store — the flow network/residual graph, plus the reachability search's visited set for cut recovery? Size each in terms of `V` and `E`.*

## Implementation Walkthrough
*Plan the code before writing it.*

### Reusing the Max-Flow Machinery
*How does the min-cut routine build directly on a completed max-flow run rather than starting fresh?*

### The Key Step: Residual Reachability
*From the source, BFS/DFS over edges with positive residual capacity. What does the reached set become?*

### Extracting the Cut Edges
*Scan original edges for those going from a reached vertex to an unreached one. Why are exactly these the min cut, and how do you sum their capacity?*

## Real Uses
*Image segmentation (foreground/background), network reliability, community detection, bipartite vertex cover — sketch one reduction.*

## Pitfalls
*Counting back edges in capacity; confusing global vs `s-t`; assuming the min cut is unique; reading reachability from the original graph instead of the residual — what mistakes follow?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
