# Edit Distance

## What the Problem Asks
*What does it mean to transform one string into another, and what are we minimizing?*

## The Three Operations
*Name insert, delete, and replace. What cost does the standard (Levenshtein) version assign each?*

## Recognizing the DP
*What about "cheapest way to align/transform two sequences" signals the same two-prefix grid as LCS?*

## Optimal Substructure
*Why is the cheapest transform of two full strings built from cheapest transforms of their prefixes? Reason about the last operation.*

## Overlapping Subproblems
*In the recursion over prefix pairs, which \\( (i, j) \\) states recur? How many distinct ones are there?*

## DP State on Two Prefixes
*What does \\( D(i, j) \\) mean over the first \\( i \\) chars of the source and first \\( j \\) of the target?*

### Base Cases
*What is \\( D(i, 0) \\) and \\( D(0, j) \\) — transforming to/from an empty string? Why are these pure insert/delete counts?*

## The Recurrence
*Write \\( D(i,j) \\) as a min over the three edits, plus the free "match" case when characters are equal. Walk each branch.*

### Which Neighbor Is Which Edit
*Map each of up / left / diagonal in the grid to insert / delete / replace. Why is that mapping easy to flip by accident?*

## Top-Down vs Bottom-Up
*How do you cache on \\( (i,j) \\) top-down, and in what order do you fill the grid bottom-up?*

## Reconstructing the Edit Script
*How do you trace the table back into an actual alignment or sequence of operations?*

## Space Optimization
*How do you reduce to two rows (or one) for the cost, and what does that cost you for reconstruction?*

## Time Complexity
*Apply cost = states × transition. How many \\( (i, j) \\) states, and why is each transition O(1) (a min of three)?*

### Why It Beats Naive Recursion
*Unmemoized, the three-way branching is exponential — how does the prefix grid collapse it to \\( O(mn) \\)?*

## Space Complexity
*The full grid is \\( O(mn) \\). Why can the cost-only version drop to \\( O(\min(m,n)) \\), and what does that prevent? Add the top-down stack cost.*

## Variants & Weighted Costs
*How does the recurrence change under unequal operation costs, or when transpositions are allowed (Damerau)?*

## Pitfalls
*Where do people slip — base-case initialization, mixing up which index means insert vs delete, equal-char off-by-one?*

## Implementation Walkthrough
*Plan the code in parts before writing it.*

### Grid Setup & Base Row/Column
*What are the dimensions, and why do the first row and column count up from zero?*

### The Min-of-Three Fill Loop
*Inside the loops, how does each cell take the cheaper of replace/insert/delete, with the diagonal handled specially on a match?*

### Top-Down Memo vs Bottom-Up
*How does the same min-of-three logic read as a cached recursion vs an iterative double loop?*

### Reconstruction Pass
*From the bottom-right cell, how does the move you take (diagonal/up/left) tell you which edit was applied?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
