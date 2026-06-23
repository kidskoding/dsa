# Counting Sort

## What It Is & When to Use It
*How does counting sort break the \\( n \log n \\) barrier, and what must be true about the keys to use it?*

## The Key-Range Assumption
*Why must keys be small integers in \\( [0, k) \\), and what breaks if the range is huge or unbounded?*

### Why It's Not a Comparison Sort
*Why does counting sort never compare two elements, and how does that let it dodge the \\( n \log n \\) lower bound?*

## Building the Tally Histogram
*How does a first pass count how many times each key value appears?*

## Prefix-Sum Placement
*How do cumulative counts convert each key into its exact output position?*

### From Counts to Positions
*Why does turning the count array into a running total tell you where each value's block ends in the output?*

### Counting Form vs Output Form
*When can you just write counts back (no satellite data) versus needing the full stable placement pass?*

## Stable Placement
*Why must you iterate the input in reverse during placement to keep equal keys in original order?*

## Stability & Why It Matters Here
*Why is stability essential when counting sort is used as a digit pass inside radix sort?*

## Time Complexity
*Why does the cost come out as two scans of \\( n \\) plus one scan of \\( k \\) — walk each phase.*

### Why Best, Average, and Worst Are All \\( \Theta(n + k) \\)
*Why does input order never change the running time of counting sort?*

### When \\( k \\) Dominates
*At what point does a large key range \\( k \\) make the \\( k \\) term, not \\( n \\), the bottleneck?*

## Space Complexity
*Why does counting sort need \\( O(n + k) \\) extra memory — the count array plus the output array — and why is it not in-place?*

### The Cost of a Sparse Range
*Why does a wide-but-sparse key range waste huge amounts of count-array space?*

## Trade-offs vs Comparison Sorts
*When is counting sort a clear win, and when does its memory cost make it the wrong call?*

## Common Bugs & Edge Cases
*Where do off-by-one count-array sizing, forgotten prefix sums, or negative keys break it?*

## Real-World Uses
*Where do bounded small-integer keys (ages, grades, byte values, digit passes) make counting sort ideal?*

## Implementation Walkthrough
*Break the algorithm into the parts you must get right before you write a line.*

### Setup & Sizing the Count Array
*How big must the count array be, and how do you discover \\( k \\) from the input?*

### The Counting Pass
*How does the first scan fill the histogram?*

### The Prefix-Sum & Placement Pass
*How do you turn counts into positions, then scan the input (in which direction?) to drop each element into place?*

### Returning the Output
*How does the filled output array get returned or copied back, and why can't you sort fully in place?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
