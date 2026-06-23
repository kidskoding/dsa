# Depth-First Search

## What It Is & When to Use It
*What problems — connectivity, ordering, cycle detection — does going deep first naturally solve?*

## The Key Idea: Go Deep, Then Backtrack
*Why does committing fully to one branch before exploring siblings reveal structure a level-order sweep hides?*

## Recursive vs. Explicit-Stack
*How does the call stack mirror an explicit stack, and when must you switch to the iterative form?*

### What the Call Stack Holds
*At any moment mid-recursion, what does each frame on the stack represent about the active path?*

## Visited Tracking & States
*Why do many DFS variants need three states (unvisited / in-progress / done) rather than a single visited flag?*

### Why "In-Progress" Matters
*What does a vertex still on the active path tell you that a plain visited bit cannot?*

## How the Traversal Unfolds
*Walk one branch to its dead end and back — what does "explore, recurse, backtrack" look like step by step?*

## Discovery & Finish Times
*What do the two timestamps per vertex tell you about the structure of the search tree?*

### The Parenthesis Structure
*Why do discovery/finish intervals nest like balanced parentheses, and what does nesting reveal about ancestry?*

## Edge Classification
*Distinguish tree, back, forward, and cross edges — what signal reveals each one?*

### Using Timestamps to Classify
*How do the relative discovery and finish times of two endpoints tell you which edge type you're on?*

## Cycle Detection
*Which edge type signals a cycle, and how does the answer differ for directed vs. undirected graphs?*

## Directed vs. Undirected
*How do edge types and the cycle rule change when edges have direction?*

## Connectivity & Components
*How does looping DFS over every unvisited vertex enumerate connected components?*

## Time Complexity
*Reason about why DFS is `O(V + E)`, not by memorizing it.*

### Each Vertex Visited Once
*What guarantees the visited check fires the recursive call exactly once per vertex, totaling `O(V)`?*

### Each Edge Examined Once (or Twice)
*Why does scanning adjacency lists total `O(E)`, and why is an undirected edge seen from both ends?*

### How Representation Changes the Bound
*Why does a matrix push DFS to `O(V^2)` while a list keeps it at `O(V + E)`?*

## Space Complexity
*Account for every structure DFS keeps in memory.*

### The Call-Stack / Explicit-Stack Depth
*In the worst case, how deep can recursion go, and what graph shape forces `O(V)` stack frames?*

### Visited Arrays & Timestamp Bookkeeping
*Why do the visited, discovery, and finish arrays each cost `O(V)`?*

## Common Pitfalls
*Stack overflow on deep graphs, forgetting disconnected vertices, mishandling the parent edge — where do these strike?*

## Implementation Walkthrough
*Break the algorithm into parts before coding — what does each part own?*

### Choosing Recursive vs. Iterative
*Which form will you write, and what changes in how you push/pop or recurse?*

### Marking and the Visited Check
*Where exactly do you set a vertex visited, and where do you test it to avoid reprocessing?*

### Per-Edge Work & Recursion
*Inside the neighbor loop, what do you do for an unvisited neighbor vs. an already-visited one?*

### Capturing Timestamps or Ordering
*If you need discovery/finish times, where do you stamp them relative to the recursive calls?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
