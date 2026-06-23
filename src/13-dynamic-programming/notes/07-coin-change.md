# Coin Change

## The Two Questions
*Distinguish "fewest coins to make an amount" from "how many distinct ways to make it". Why do they need different recurrences?*

## Why Greedy Fails
*Give the flavor of a denomination set where always picking the largest coin first gives a wrong or non-optimal answer.*

## Recognizing the DP
*What about "reach a target using unlimited copies of given pieces" signals an unbounded-knapsack-style DP?*

## Optimal Substructure
*Why is the answer for amount \\( a \\) built from answers for smaller amounts \\( a - c \\)? Reason about the last coin placed.*

## Overlapping Subproblems
*Which amounts get recomputed across different coin choices? Why does the distinct-amount count bound the work?*

## State Definition
*What does the DP entry mean — indexed by amount alone, or by (coin index, amount)? When do you actually need the coin axis?*

## The Min-Coins Recurrence
*Write the min over each coin \\( c \\): one coin plus the best for amount \\( a - c \\). What's the base case at amount 0, and how do you mark "impossible"?*

## The Counting-Ways Recurrence
*Write the sum over coins for the number of ways. Why does this version need to avoid double-counting permutations?*

## Order of Loops Matters
*For counting ways, why does coin-outer / amount-inner count combinations, while amount-outer / coin-inner counts permutations?*

### A Concrete Mental Trace
*Pick coins {1,2} and amount 3. Trace both loop orders by hand — which one double-counts 1+2 vs 2+1?*

## Reconstructing the Coin Set
*What auxiliary "last coin used" table lets you recover which coins achieve the optimum?*

## Time Complexity
*Apply cost = states × transition. How many amount-states, and why is the per-amount work proportional to the number of coins?*

### Why It Beats Brute Force
*Enumerating coin multisets is exponential — how does indexing by amount collapse it to \\( O(n \cdot \text{amount}) \\)?*

## Space Complexity
*The 2D (coin × amount) table is \\( O(n \cdot \text{amount}) \\); the 1D form is \\( O(\text{amount}) \\). What dependency lets you drop the coin dimension, and which loop order keeps it correct?*

## Variants & Related Problems
*How do bounded coins, combination sum, and "minimum perfect squares" map onto this template?*

## Pitfalls
*Where do people slip — loop order swap, wrong "impossible" sentinel, integer overflow in counts, base case at amount 0?*

## Implementation Walkthrough
*Plan the code in parts before writing it.*

### Array Setup & The Amount-0 Base Case
*What size is the DP array, what sentinel marks unreachable amounts (min version), and what is the value at amount 0 for each question?*

### The Fill Loop & Loop Order Choice
*Which loop is outer and which inner, and how does that choice encode combinations vs permutations for the counting question?*

### Top-Down Memo vs Bottom-Up
*How does the same "try each coin" choice read as a cached recursion on amount vs an iterative sweep?*

### Reconstruction Pass
*Using a "last coin" record, how do you walk from the target down to zero emitting coins?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
