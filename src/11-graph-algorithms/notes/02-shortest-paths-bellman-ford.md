# Bellman-Ford Shortest Paths

## What It Solves & When
*Single-source shortest paths that tolerate negative edges — when do you need this instead of Dijkstra?*

## Core Idea: Relax Every Edge, Repeatedly
*Why does relaxing all edges `V-1` times guarantee correct distances? What does each pass "settle"?*

### One Pass = One Edge of Path Length
*After pass `k`, which shortest paths are guaranteed correct? Think in terms of hop count.*

### Why V-1 Passes Suffice
*A simple shortest path has at most `V-1` edges. How does that fact cap the number of passes you need?*

## The Dynamic-Programming View
*Frame `dist` as "cheapest path using at most `k` edges." What's the recurrence relating the `k`-edge answer to the `(k-1)`-edge answer?*

## The Relaxation Loop
*What's the exact structure — repeated passes over the full edge list — and how does `dist[]` evolve pass to pass?*

### Order of Edge Processing
*Why can a lucky edge order finalize distances faster, yet the worst case still needs all `V-1` passes?*

## Detecting Negative Cycles
*What happens on a `V`-th pass if any edge still relaxes? Why does that prove a negative cycle is reachable from the source?*

### Reporting the Cycle
*How do you recover the actual vertices on the negative cycle, not just a yes/no? What does following predecessors give you?*

## Early Termination
*If a full pass makes no updates, what can you conclude and stop?*

## Why It Doesn't Need a Priority Queue
*Dijkstra needs ordering; Bellman-Ford brute-forces edges. What does it trade away to gain negative-edge support?*

## Variants
*SPFA (queue-based relaxation); use as a subroutine inside Johnson's; DAG shortest paths via topological order in one pass — how do these relate?*

## vs Dijkstra
*Generality vs speed. Which to pick when all weights are non-negative, and why?*

## Time Complexity
*Each pass scans all `E` edges, and there are up to `V-1` passes. How does that product give the bound, and how does early termination affect the best case?*

### Where the V·E Comes From
*Walk the two nested loops — passes over vertices, edges within each pass. Why is each factor exactly what it is?*

## Space Complexity
*What do you store beyond the edge list — `dist[]`, `prev[]`? How does using an edge list rather than adjacency lists affect the space picture?*

## Implementation Walkthrough
*Plan the code before writing it.*

### Graph & Structures Setup
*Why is a flat edge list `(u, v, w)` convenient here? How do you initialize `dist[]` and `prev[]`?*

### The Relaxation Passes
*Sketch the outer `V-1` loop wrapping an inner sweep over every edge. What does a single relaxation update?*

### The Negative-Cycle Check
*What extra pass do you run after the main loop, and what does any successful relaxation in it signal?*

### Reconstruction
*How do you rebuild a path from `prev[]`, and how do you report "unreachable" vs "affected by a negative cycle"?*

## Real Uses
*Currency arbitrage detection, distance-vector routing protocols — why do negative weights show up there?*

## Pitfalls
*Stopping at `V` passes instead of `V-1`; mishandling unreachable vertices; integer overflow on `INF + weight` — how do you guard each?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
