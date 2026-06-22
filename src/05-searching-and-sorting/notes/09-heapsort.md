# Heapsort

## What It Is & When to Use It
*What does heapsort guarantee that quicksort doesn't, and why is it the in-place worst-case-safe choice?*

## The Array-Backed Binary Heap
*How do parent and child indices map onto a flat array with no pointers?*

### The Heap Property
*What must hold between every parent and its children in a max-heap, and why does that put the max at the root?*

### Index Arithmetic
*For node at index \\( i \\), what are the formulas for its parent and two children, and where do internal nodes end?*

## Sift-Down (Heapify)
*How does pushing an out-of-place element downward restore the heap property?*

### Sift-Down vs Sift-Up
*Why does heapsort build and shrink the heap using sift-down rather than sift-up?*

### Picking the Larger Child
*Why must sift-down swap with the larger of the two children, not just any child?*

## Building the Heap
*How does heapifying from the last internal node up to the root turn an arbitrary array into a heap?*

### Why Build-Heap Is Linear
*Conceptually, why is bottom-up build \\( O(n) \\) and not \\( O(n \log n) \\) — where do most nodes sit, and how far can they sift? (intuition only)*

## Extract-Max into the Suffix
*How does repeatedly swapping the root to the end and re-heapifying grow a sorted suffix in place?*

## The Two-Phase Algorithm
*How do the build phase and the repeated-extract phase combine into the full sort, and what shrinks each round?*

## In-Place but Unstable
*Why does heapsort need only \\( O(1) \\) extra space, and why does swapping the root away lose stability?*

## Time Complexity
*Why is the total cost the build plus \\( n \\) extractions — reason out each piece.*

### Build Phase Cost
*Why does the build phase total \\( O(n) \\) despite touching every node?*

### Extraction Phase Cost
*Why does each of the \\( n \\) extractions cost \\( O(\log n) \\) sift-down work, giving \\( O(n \log n) \\) overall?*

### Why There's No Best Case
*Why does heapsort stay \\( \Theta(n \log n) \\) even on sorted or all-equal input?*

### Constant Factors
*Why is heapsort usually slower than quicksort in practice despite matching big-O — think cache behavior?*

## Space Complexity
*Why is heapsort \\( O(1) \\) auxiliary space, and why does the iterative sift-down avoid a recursion stack?*

## Trade-offs vs Quicksort & Merge Sort
*When do you choose heapsort's worst-case guarantee and \\( O(1) \\) space over quicksort's speed or merge sort's stability?*

## Common Bugs & Edge Cases
*Where do wrong child-index formulas, an unshrunk heap bound, or a missed final element go wrong?*

## Real-World Uses
*Where does the underlying heap shine — priority queues, top-k, and scheduling — even when heapsort itself isn't picked?*

## Implementation Walkthrough
*Break the algorithm into the parts you must get right before you write a line.*

### The Sift-Down Sub-Step
*Given an index and a heap-size bound, how do you compare against the larger child and swap downward until settled?*

### The Build-Heap Phase
*From which index do you start, in which direction do you loop, and why?*

### The Extraction Loop
*How do you swap root to the current end, shrink the heap bound, and re-sift the root?*

### Termination & Return
*When does the extraction loop stop, and why is the array sorted in place with no explicit return?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
