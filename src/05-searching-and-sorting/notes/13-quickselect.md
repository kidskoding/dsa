# Quickselect

## What It Is & When to Use It
*Why find the \( k \)-th smallest element in expected \( O(n) \) instead of fully sorting in \( O(n\log n) \) when you only need ONE order statistic, and what problems (median, top-k boundary, percentile) does that buy you?*

## Selection vs. Sorting
*Sorting computes the position of every element; selection asks for only one — why is answering the smaller question fundamentally cheaper, and what work does quickselect skip that quicksort cannot?*

### The Mental Model of Narrowing on One Side
*How do you picture each partition as throwing away a chunk you have proven cannot contain the \( k \)-th element, so the live region keeps shrinking toward the answer?*

## Partition: the Shared Engine
*How does the same partition step that powers quicksort place one pivot in its final sorted position and split the rest into a "smaller" group and a "larger" group, and why is the pivot's landing index the key fact you read off?*

### Why You Recurse Into Only One Side
*After partitioning, the pivot's final index \( p \) is compared to \( k \) — why does that tell you which side holds the target, and why can you discard the other half entirely, unlike quicksort which must recurse on both?*

### Iterative vs. Recursive Formulation
*Since there is only ever one recursive call (tail position), how can you rewrite quickselect as a loop that updates `lo` and `hi` instead of recursing, and what does that save?*

## Pivot Choice
*Why does a fixed pivot (always first or last) degrade on sorted or reverse-sorted input, and how does a random pivot — or median-of-three — restore good expected behavior?*

## Median of Medians
*How does choosing the pivot as the "median of group-of-five medians" guarantee a constant-fraction split and a worst-case \( O(n) \) bound — and why is it usually slower in practice despite the stronger guarantee, so randomized quickselect is preferred?*

## Trade-offs vs. Sorting & Heaps
*When is a heap-based "top-k" or a full sort actually the right tool instead of quickselect — repeated queries, streaming data, or needing the elements in order rather than just the boundary?*

## Time Complexity
*Why does recursing on one shrinking side give a different total cost than quicksort's two-sided recursion?*

### Best Case
*What pivot luck lets the target sit at the first partition's pivot index, returning in a single \( O(n) \) pass?*

### Average Case
*With random pivots the work shrinks geometrically — why does the recurrence \( T(n) = T(n/2) + O(n) \) sum to \( O(n) \) rather than \( O(n\log n) \), since \( n + n/2 + n/4 + \dots = 2n \)?*

### Worst Case
*Why is the worst case \( O(n^2) \) with adversarial pivots that peel off one element at a time, and why does randomization make hitting that astronomically unlikely?*

## Space Complexity
*Why is partitioning in-place \( O(1) \) extra, and what is the recursion-depth cost — \( O(\log n) \) expected versus \( O(n) \) worst-case stack, and why does the iterative form drop it to \( O(1) \)?*

## Common Bugs & Edge Cases
*Where do bugs hide — 0- vs 1-indexed \( k \), duplicate pivots clustering on one side, off-by-one bounds in partition, or arrays of size zero or one?*

## Implementation Walkthrough
*Break the algorithm into the parts you must get right before you write a line.*

### Setup
*What bounds (`lo`, `hi`) and target rank do you initialize, and how do you translate the requested \( k \)-th smallest into a 0-indexed target position?*

### Partition & the Recurse-One-Side Step
*How does partition return the pivot index, and how do you compare it to the target to decide whether to keep the left side, the right side, or stop because the pivot IS the answer?*

### The Tricky Step
*How do you keep partition balanced against duplicates and sorted input — random pivot selection, swapping the pivot into place — without corrupting the bounds you pass onward?*

### Termination & Return
*What condition signals "found" (pivot index equals target), and what value do you return when the live region narrows to a single element?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
