# Edmonds-Karp Maximum Flow

## What It Solves & When
*The same max-flow problem as Ford-Fulkerson, but with a concrete, predictable path rule — why does pinning the path choice matter?*

## Core Idea: BFS for the Shortest Augmenting Path
*Pick the augmenting path with the fewest edges each iteration. Why shortest-by-hops rather than highest-capacity?*

### Why "Shortest" Means Fewest Edges, Not Cheapest
*There are no edge weights here — only capacities. What does BFS distance measure in the residual graph?*

## The Residual Graph, Same as Ford-Fulkerson
*BFS runs over residual capacities. What does Edmonds-Karp inherit unchanged — residuals, back edges, augmenting?*

## How One Iteration Works
*BFS from source to sink, record the parent path, find the bottleneck, augment forward and reverse. Walk through one round.*

### Recording the Path via Parent Pointers
*How does BFS leave behind a `parent[]` trail you can walk backward to extract the augmenting path and its bottleneck?*

## Why Path Lengths Never Decrease
*The shortest source-sink distance in the residual graph is monotonically non-decreasing across iterations. Why does augmenting never create a shorter path?*

## Bounding the Number of Augmentations
*Each edge becomes a saturated bottleneck only `O(V)` times. Why does that, combined with `E` edges, cap total augmentations at `O(VE)`?*

### Critical Edges
*What makes an edge "critical" on an augmentation, and why must its BFS distance strictly increase before it can be critical again?*

## Variants & Relatives
*Dinic's algorithm builds on the same shortest-path idea with level graphs and blocking flows — how does it go further?*

## vs Ford-Fulkerson
*Generic Ford-Fulkerson's runtime scales with the flow value; Edmonds-Karp's does not. What exactly did fixing BFS buy you?*

## Time Complexity
*Combine the two independent counts: how many augmentations, and how much does each BFS cost?*

### Why It's Flow-Value Independent
*The `O(VE)` augmentation bound comes from the critical-edge argument, not from `|f*|`. With each BFS costing `O(E)`, how do you reach the overall bound? Why is independence from the flow value the whole point?*

## Space Complexity
*What does Edmonds-Karp store beyond the residual graph — the BFS queue, `visited[]`, `parent[]`? Size each in terms of `V` and `E`.*

### Residual Graph Footprint
*Why is the dominant space cost the residual capacities over forward and reverse edges, i.e. `O(V + E)`?*

## Implementation Walkthrough
*Plan the code before writing it.*

### Graph & Residual Setup
*Same paired forward/reverse edge structure as Ford-Fulkerson — how do you initialize residual capacities?*

### The BFS Augmenting-Path Search
*Sketch a BFS from source that fills `parent[]` and stops when it reaches the sink. What residual condition lets an edge be traversed?*

### The Key Step: Augment Along the BFS Path
*Walk `parent[]` back from sink to source to find the bottleneck, then update forward and reverse residuals. How do you fold this into the loop?*

### Termination & Result
*When does the outer loop stop, and how do you total the flow that was pushed?*

## Real Uses
*Anywhere max flow is needed with capacities that could be huge, where flow-value-dependent runtime is unacceptable. Examples?*

## Pitfalls
*Using DFS by mistake and losing the guarantee; rebuilding the graph each BFS; forgetting reverse-edge updates; re-running BFS without resetting `visited`/`parent` — what regresses?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
