# Dynamic Programming: Problem Set

Work these after studying the topic notes. Coding problems are implemented
against the stubs in `problemset/`, Conceptual problems are proofs and
derivations written in LaTeX (no code), and Challenge problems are harder
implementations against the stubs.

---

## Coding

### Problem 01: Maximum Subarray Sum
Given an integer array, compute the maximum sum of any non-empty contiguous
subarray (Kadane's algorithm framed as a DP). Return the maximum sum.

### Problem 02: Climbing Stairs
You can climb 1 or 2 steps at a time. Given `n` stairs, count the number of
distinct ways to reach the top.

### Problem 03: House Robber
Given an array of non-negative house values along a street, compute the maximum
total you can take without ever taking two adjacent houses.

### Problem 04: Unique Grid Paths
On an `m x n` grid, moving only right or down, count the number of distinct paths
from the top-left to the bottom-right cell.

### Problem 05: Subset Sum Feasibility
Given an array of positive integers and a target `t`, decide whether some subset
sums exactly to `t`.

### Problem 06: Minimum Falling Path Sum
Given a square matrix, find the minimum sum of a path from the top row to the
bottom row, moving each step to the cell directly below or diagonally below.

---

## Conceptual

### Problem 07: Optimal Substructure of LCS
Prove that the longest common subsequence problem exhibits optimal substructure.
Formally: if \\( z \\) is an LCS of \\( x \\) and \\( y \\), state and prove the case
analysis on whether \\( x_m = y_n \\), and justify the recurrence
\\[ c[i,j] = \begin{cases} 0 & i=0 \text{ or } j=0 \\ c[i-1,j-1]+1 & x_i = y_j \\ \max(c[i-1,j],\, c[i,j-1]) & x_i \neq y_j \end{cases}. \\]

### Problem 08: Correctness of the Coin-Change Counting Order
Explain why, when counting the number of combinations that sum to an amount, the
coin loop must be the outer loop and the amount loop the inner loop. Prove that
swapping the loop order counts ordered sequences (permutations) instead of
combinations.

### Problem 09: Pseudo-Polynomiality of Knapsack
Prove that the \\( O(nW) \\) knapsack DP is pseudo-polynomial, not polynomial, by
analyzing its running time relative to the bit-length of the input. State precisely
why this does not contradict the NP-hardness of 0/1 knapsack.

### Problem 10: Why Greedy Fails for 0/1 Knapsack
Construct an instance where choosing items in decreasing value-to-weight ratio is
suboptimal for 0/1 knapsack, and prove that the exchange argument that works for
fractional knapsack breaks for the 0/1 variant.

### Problem 11: LIS Lower Bound via Patience Sorting
Prove that the patience-sorting algorithm computes the LIS length, and argue that
the \\( O(n \log n) \\) bound is achieved by maintaining the array of pile tails.

---

## Challenge

### Problem 12: Longest Palindromic Subsequence
Given a string, compute the length of its longest palindromic subsequence.

### Problem 13: Word Break
Given a string and a dictionary of words, decide whether the string can be
segmented into a sequence of one or more dictionary words.

### Problem 14: Edit Distance with Transpositions (Damerau)
Compute the minimum edit distance allowing insertions, deletions, substitutions,
and transpositions of two adjacent characters.

### Problem 15: Best Time to Buy and Sell Stock with K Transactions
Given daily prices and an integer `k`, compute the maximum profit using at most
`k` non-overlapping buy/sell transactions.

### Problem 16: Maximum Weight Independent Set on a Tree
Given a rooted tree with node weights, compute the maximum-weight set of nodes
such that no two chosen nodes are adjacent (parent/child).
