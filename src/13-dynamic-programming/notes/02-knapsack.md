# 0/1 Knapsack

## 0/1 vs Unbounded vs Fractional
*How do the allowed item counts change the problem, and which variant is greedy (not DP) and which need DP?*

## Recognizing the DP
*What about "pick a subset under a capacity to maximize value" signals knapsack-style DP rather than greedy?*

### Why Greedy by Value-Density Fails Here
*For fractional knapsack greedy works — what breaks when items are indivisible? Construct a tiny counterexample in your head.*

## Optimal Substructure
*Why is the best packing of the first \\( i \\) items under capacity \\( w \\) built from best packings of fewer items?*

## Overlapping Subproblems
*In the take/leave recursion tree, which \\( (i, w) \\) pairs reappear? Why does the count of distinct pairs stay small?*

## State Definition
*What does \\( OPT(i, w) \\) mean? Name the two axes and exactly what each index ranges over.*

## The Take-or-Leave Recurrence
*Write the choice for item \\( i \\): skip it vs take it (paying weight, gaining value). What max do you take, and what guards "take"?*

### Base Cases
*What are the values when there are no items left, or when capacity is zero?*

## Top-Down Memoization
*How do you cache on the pair \\( (i, w) \\)? What does the recursion return at the leaves, and when do you hit the cache?*

## Bottom-Up Table & Fill Order
*In what order do you fill the \\( (i, w) \\) grid so each cell's dependencies (the row above) are already computed?*

## Reconstructing Which Items
*Walking the filled table backward from \\( OPT(n, W) \\), how do you tell whether item \\( i \\) was taken?*

## 1D Space Optimization
*How do you collapse to a single row, and why must the capacity loop run backward for 0/1 (but forward for unbounded)?*

## Time Complexity
*Apply cost = states × transition. How many \\( (i, w) \\) states are there, and what is the O(1) work per state?*

### Pseudo-Polynomial Explained
*Why is \\( O(nW) \\) NOT polynomial in the input size? Tie it to how \\( W \\) is encoded in bits.*

### Beating Brute Force
*The subset brute force is \\( O(2^n) \\) — how does indexing by \\( (i, w) \\) collapse that to \\( O(nW) \\)?*

## Space Complexity
*The full table is \\( O(nW) \\). After the 1D trick it is \\( O(W) \\) — what dependency makes one row enough? And the recursion-stack cost top-down?*

## Variants & Related Problems
*How do subset-sum, partition-equal-subset, and bounded knapsack reduce to or extend this template?*

## Pitfalls
*Where do people slip — wrong loop direction in 1D, treating it as fractional, non-integer weights, capacity off-by-one?*

## Implementation Walkthrough
*Plan the code in parts before writing it.*

### Table Setup & Base Row
*What dimensions does the table have, and what does the zero-items (or zero-capacity) row/column hold?*

### The Capacity Loop & Take/Leave Fill
*Inside the item loop, how does each capacity cell choose between the value above it and value + best-with-remaining-capacity?*

### Top-Down Memo vs Bottom-Up
*How does the same take/leave choice read as a cached recursion vs an iterative fill? Which is easier to space-optimize?*

### Reconstruction Pass
*Starting at the final cell, what comparison tells you an item was included, and how do you step to the previous state?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
