# Longest Common Subsequence

## Subsequence vs Substring
*Pin down the difference. Why does dropping the contiguity requirement change which DP applies?*

## Recognizing the DP
*What about "align two sequences and maximize shared order-preserving elements" signals a two-prefix DP?*

## Optimal Substructure
*Why is the LCS of two full strings built from the LCS of their prefixes? Reason about the last character of each.*

## Overlapping Subproblems
*In the recursion over prefixes, which \( (i, j) \) pairs get revisited? How many distinct pairs are there at most?*

## DP State on Two Prefixes
*What does \( LCS(i, j) \) measure over the first \( i \) chars of one string and first \( j \) of the other?*

## The Match vs Mismatch Recurrence
*Write the two cases: when the current characters are equal vs not equal. What choice does mismatch force?*

### Base Cases
*What is the LCS when either prefix is empty?*

## Top-Down Memoization
*How do you cache on \( (i, j) \)? What does each recursive call return, and where do the two recursive branches go?*

## Bottom-Up Table & Fill Order
*In what direction do you fill the grid so each cell depends only on already-filled neighbors (up, left, diagonal)?*

## Backtracking the Subsequence
*How do you walk the table from the bottom-right to recover an actual common subsequence (not just its length)?*

## Space-Reduced Variants
*How do you get just the length in \( O(\min(m,n)) \) space, and what do you lose for reconstruction? (Hirschberg hints.)*

## Time Complexity
*Apply cost = states × transition. How many \( (i, j) \) states fill the grid, and why is the work per cell O(1)?*

### Why It Beats Brute Force
*Enumerating subsequences is exponential — how does the prefix grid collapse that to \( O(mn) \)?*

## Space Complexity
*The full grid is \( O(mn) \). Why can the length-only version drop to two rows (or one), and what breaks reconstruction when you do?*

### Stack vs Table in Top-Down
*How deep can the memoized recursion go, and how does that stack cost compare to the table itself?*

## Variants & Related Problems
*How do edit distance, longest common substring, shortest common supersequence, and diff relate to this template?*

## Pitfalls
*Where do people slip — confusing substring/subsequence, off-by-one on prefix indexing, losing reconstruction after space-saving?*

## Implementation Walkthrough
*Plan the code in parts before writing it.*

### Grid Setup & Empty-Prefix Base Row/Column
*What are the table dimensions, and what values fill the row and column for empty prefixes?*

### The Fill Loop: Match vs Mismatch
*How does each inner-loop cell branch on character equality into a diagonal+1 vs a max of up/left?*

### Top-Down Memo vs Bottom-Up
*How does the same match/mismatch logic look as a cached recursion vs an iterative double loop?*

### Reconstruction Pass
*From the bottom-right cell, what move (diagonal vs up vs left) do you take at each step, and when do you emit a character?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
