# Binary Search

## What It Is & When to Use It
*What precondition must the data satisfy, and what makes binary search worth the setup cost?*

## How Halving the Search Space Works
*How does each comparison let you discard half the remaining range?*

### The Mental Model of a Shrinking Window
*How do you picture `[lo, hi]` closing in, and what does it mean when it becomes empty?*

## The Three-Way Decision
*At each midpoint, what are the three outcomes (less, equal, greater) and how does each reshape the window?*

## Iterative Coding with lo/hi
*How do you maintain the `lo` and `hi` bounds and update them after each midpoint check?*

### Computing the Midpoint Safely
*Why is `lo + (hi - lo) / 2` preferred over `(lo + hi) / 2`?*

## Recursive Coding
*How do you express the same logic as a recursive call on a shrinking subrange?*

## The Loop Invariant & Termination
*What stays true about `lo` and `hi` every iteration, and how do you guarantee the loop ends?*

### Choosing `<` vs `<=` and the Interval Convention
*Which loop condition matches a closed `[lo, hi]` versus a half-open `[lo, hi)` range, and why must they agree?*

### Why the Window Must Always Shrink
*What update mistake leaves `lo` and `hi` unchanged, and why does that cause an infinite loop?*

## Variants: Lower Bound & Upper Bound
*How do you find the first element \\( \ge \\) the target, or the insertion point, instead of just any match?*

### Leftmost vs Rightmost Match
*With duplicates present, how do you bias the search to return the first or last equal element?*

## Time Complexity
*How many times can you halve \\( n \\) before the window is empty, and why does that count the comparisons?*

### Best Case
*What lets binary search return in \\( O(1) \\), and how likely is that?*

### Worst & Average Case
*Why are both worst and average \\( \Theta(\log n) \\), and how few steps is that for a million elements?*

### Constant Factors vs Linear Search
*Why might linear search still win for very small arrays despite \\( O(\log n) \\)?*

## Space Complexity
*Why is the iterative version \\( O(1) \\) while the recursive version costs \\( O(\log n) \\) call-stack space?*

## Trade-offs vs Linear Search & Hashing
*When does the cost of keeping data sorted outweigh the lookup speedup, and when does hashing beat both?*

## Common Bugs & Edge Cases
*Where do infinite loops, off-by-one bounds, and overflow creep in, and how do empty or single-element arrays behave?*

## Real-World Uses
*Where do you see binary search beyond arrays — answer-space search, rotated arrays, library APIs?*

## Implementation Walkthrough
*Break the algorithm into the parts you must get right before you write a line.*

### Setup
*What two bounds do you initialize, and to what values for your chosen interval convention?*

### The Search Loop
*What is the loop condition, how do you compute the midpoint, and how does each comparison branch move a bound?*

### Termination & Return
*How does the loop signal "found" versus "absent," and what does each case return?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
