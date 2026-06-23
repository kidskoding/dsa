# Rod Cutting

## The Problem Setup
*Given a price-per-length table, what are you maximizing when cutting a rod of length \\( n \\) into pieces?*

## Recognizing the DP
*What about "cut a whole into pieces to maximize total value, pieces reusable" signals unbounded-knapsack-style DP?*

## Optimal Substructure
*Why is the best revenue for length \\( n \\) built from best revenue of a shorter remainder? Reason about the first piece cut off.*

## Overlapping Subproblems
*Which remaining-length subproblems recur across different first cuts? Why does the distinct-length count bound the work?*

## State Definition
*What does \\( r(n) \\) mean? Why is one axis (remaining length) enough here, unlike a 2D knapsack table?*

## First-Cut Recurrence
*Write \\( r(n) \\) as a max over the length \\( i \\) of the first piece: price of that piece plus best for the rest. Walk the choices.*

### Base Cases
*What is \\( r(0) \\), and why does that anchor the whole recursion?*

## Naive Recursion Blowup
*Why does the unmemoized recursion explode, and roughly how fast? What is the branching factor at length \\( n \\)?*

## Memoized (Top-Down) Version
*How do you cache on remaining length so each subproblem is solved once? What does a cache hit save?*

## Bottom-Up Tabulation
*In what order do you fill \\( r(0..n) \\), and why does an increasing-length sweep guarantee dependencies are ready?*

## Recovering the Cuts
*What auxiliary "first cut length" table lets you print the actual sequence of piece lengths?*

## Time Complexity
*Apply cost = states × transition. There are \\( n+1 \\) length-states; why is the per-state work \\( O(n) \\), giving \\( O(n^2) \\)?*

### From Exponential to Quadratic
*The naive tree is exponential — show yourself how memoizing on length alone collapses it to \\( O(n^2) \\).*

## Space Complexity
*Why is the revenue table \\( O(n) \\), plus \\( O(n) \\) for the cut-choice table? What is the top-down recursion-stack depth, and does it change the order of growth?*

## Variants & Related Problems
*How do "minimize cuts", cutting with a per-cut cost, and the integer-knapsack reduction relate to this?*

## Pitfalls
*Where do people slip — off-by-one on price indexing, forgetting the "no cut" option, confusing length with count?*

## Implementation Walkthrough
*Plan the code in parts before writing it.*

### Revenue Array & Length-0 Base
*What size is the revenue array, and what does \\( r(0) \\) hold to seed the sweep?*

### The First-Cut Max Loop
*For each length, how does the inner loop try every first-piece length and keep the best total?*

### Top-Down Memo vs Bottom-Up
*How does the same first-cut max read as a cached recursion on length vs an outer-to-inner table fill?*

### Reconstruction Pass
*Using the stored first-cut length per total length, how do you peel off pieces until the rod is consumed?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
