# Bubble Sort

## What It Is & When to Use It
*What is the one idea behind bubble sort, and is it ever the right tool outside teaching?*

## How Bubbling Works
*How does each pass of adjacent swaps push the largest remaining element to its final slot?*

### Watching One Element Bubble
*If you track a single large value, why does it rise to the top in one pass while small values drift only one step?*

## The Pass Invariant
*What is guaranteed about the last \\( k \\) elements after \\( k \\) completed passes, and why does that prove correctness?*

## Iterative Coding
*How do the outer pass loop and inner adjacent-comparison loop fit together?*

### The Adjacent Compare-and-Swap
*What exactly do you compare, and under what condition do you swap?*

## The Early-Exit Flag
*How can a "no swaps this pass" check turn the best case into \\( O(n) \\)?*

### Shrinking the Inner Bound Each Pass
*Why can you stop the inner loop one element earlier after every completed pass?*

## Stability & In-Place
*Why does swapping only on strict inequality preserve the order of equal keys, and why is no extra array needed?*

## Time Complexity
*How do you count total comparisons and swaps across all passes, and how do they relate to the number of inversions?*

### Best Case
*Which input lets the early-exit flag finish in a single \\( O(n) \\) pass?*

### Average Case
*Why does a random permutation cost \\( \Theta(n^2) \\), and roughly how many swaps is that?*

### Worst Case
*Which input (think reverse-sorted) forces the maximum swaps, and why does each element travel the full distance?*

## Space Complexity
*Why is bubble sort \\( O(1) \\) auxiliary space with no recursion, and how does that compare to merge sort?*

## Trade-offs vs Insertion & Selection Sort
*Among the quadratic sorts, why is bubble sort usually the slowest in practice despite matching big-O?*

## Common Bugs & Edge Cases
*Where do off-by-one inner bounds, a forgotten swap-flag reset, or single-element arrays trip you up?*

## Real-World Uses
*Where does bubble sort genuinely appear — tiny inputs, nearly-sorted data, or pure pedagogy?*

## Implementation Walkthrough
*Break the algorithm into the parts you must get right before you write a line.*

### Setup
*What outer-loop bound and what swap-tracking flag do you initialize?*

### The Nested Passes
*How does the inner loop walk adjacent pairs, and how does the shrinking bound feed off the outer loop counter?*

### Early Termination & Return
*How does the flag let you break early, and why does the array need no explicit return?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
