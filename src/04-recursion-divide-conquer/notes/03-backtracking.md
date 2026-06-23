# Backtracking

## What It's For & Why It Matters
*Why systematically build candidate solutions one choice at a time and abandon ("backtrack") a partial solution the moment it can't possibly work — instead of generating every combination blindly?*

## The Core Idea
*How does backtracking turn "search all configurations" into "grow a partial solution, and retreat the instant it becomes hopeless," and why is retreating the whole point?*

### The Mental Model
*How do you picture the search as walking down into a choice, exploring everything reachable from it, then stepping back up to try the next choice — like exploring a maze with a piece of chalk?*

## Choose / Explore / Un-choose
*What are the three steps of the backtracking skeleton, and why is the "un-choose" (undo the last choice before returning) the part people forget?*

### Why Un-choose Restores State
*Why must the partial solution look exactly as it did before a choice was made once that branch returns, and what breaks downstream if the undo is skipped?*

## The State-Space Tree
*Why does every backtracking problem correspond to a DFS over a tree of partial choices, what does each node represent, and what do the leaves represent?*

### Branching Factor & Depth
*At a given node, how many children does it have (the branching factor), and how deep can a root-to-leaf path get — and why do those two numbers govern everything about the cost?*

## Pruning
*How does rejecting an invalid partial solution early (a "constraint check") cut off an entire subtree of work, and why is that where the real speedup comes from even though it doesn't change the worst-case Big-O?*

### Where to Place the Check
*Why test feasibility as early as possible — at the moment of choosing rather than only at a complete leaf — and how much work does an early prune save versus a late one?*

## Recursion Structure
*What is the base case (a complete candidate or a dead end), what is the recursive case (loop over choices, recurse, undo), and how do those map onto a single function?*

### Recording Solutions
*When you reach a valid leaf, why must you usually copy the current partial solution into the results rather than store a reference to the mutable working state?*

## Classic Examples
*How do subsets, permutations, combinations, and N-queens each instantiate the same skeleton with a different choice set and constraint?*

### Subsets vs Permutations
*How do the choice sets differ — at each step include-or-skip the current element (subsets) vs. pick an unused element (permutations) — and why does that change the tree's shape and leaf count?*

### N-Queens
*Why is N-queens the canonical backtracking problem — how do column and diagonal constraints let you prune most placements before the board is ever full?*

## Time Complexity
*How do you reason about the running time in terms of the state-space tree without solving a formula?*

### Counting the Nodes
*Why is the cost proportional to the number of nodes the search actually visits, and how does that relate to branching factor raised to the depth in the unpruned worst case?*

### Work Per Node
*Beyond the recursion itself, why does each node cost the time of its constraint check and the work to record a solution at a leaf, and why can that add a factor on top of the node count?*

### Why Pruning Helps in Practice
*Why is the worst case typically exponential, yet aggressive pruning can make a problem like N-queens solve in well under the unpruned bound, even though the Big-O is unchanged?*

## Space Complexity
*Where does backtracking spend memory beyond the input?*

### Recursion-Stack Depth
*Why is the call stack bounded by the depth of the state-space tree (the longest partial solution), not by the total number of nodes explored?*

### The Working State
*Why does the in-progress candidate (the board, the chosen-so-far list, the used-markers) cost space proportional to the depth, and why is reusing one mutable buffer cheaper than copying at every step?*

## Common Bugs & Edge Cases
*What breaks if you forget to undo a choice, mutate shared state without restoring it, copy the result list at the wrong time, check constraints too late, or mishandle the empty-input base case?*

## Connections
*How does backtracking relate to plain recursion, to DFS, to dynamic programming (when overlapping subproblems exist), and to branch-and-bound (when you also carry a bound to prune)?*

## Real-World & Interview Uses
*Where do constraint solvers, Sudoku and crossword fillers, parsing, regex matching, and combinatorial generation rely on backtracking?*

## Implementation Walkthrough
*Before writing code, decide each part.*

### Setup & The Result Container
*What state do you carry into the recursion (the working candidate, any used-markers, the start index), and where does the list that collects finished solutions live?*

### The Base Case Branch
*How do you detect a complete candidate or a dead end, and what do you do — record a copy, or simply return?*

### The Main Loop Over Choices
*How do you iterate the available choices at this node, apply the constraint check to skip infeasible ones, and make a choice before recursing?*

### The Un-choose Step
*Right after the recursive call returns, how do you undo the choice so the next iteration starts from a clean state?*

### Termination & Return
*How does the whole search finish once the root's loop is exhausted, and what does the top-level call hand back?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
