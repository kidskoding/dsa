# Selection Sort

## What It Is & When to Use It
*What is the find-the-minimum idea, and what unusual property makes it occasionally useful?*

## How Find-Min, Swap-to-Front Works
*How does each iteration scan the unsorted suffix for its minimum and place it at the front?*

### Why Each Placement Is Final
*Once you place the smallest remaining element, why will you never have to move it again?*

## The Sorted-Prefix Invariant
*Why is the prefix both sorted and final the moment an element is placed there, and how does that prove correctness?*

## Iterative Coding
*How do the outer placement loop and the inner min-tracking loop interact, and what index do you track?*

### Tracking the Min Index, Not the Value
*Why hold onto the position of the smallest element rather than its value during the scan?*

## Minimal Writes: Exactly \\( n-1 \\) Swaps
*Why does selection sort perform the fewest writes of the quadratic sorts, and when does write-cost matter?*

## Stability & In-Place
*Why is the classic version unstable, and how can a shift-based variant restore stability?*

### A Tiny Unstable Example
*What small input shows the long-distance swap reordering two equal keys?*

## Time Complexity
*Why does the comparison count come out the same regardless of input order — count the inner-loop work across all passes.*

### Why There's No Best Case
*Why does even an already-sorted array still cost \\( \Theta(n^2) \\) comparisons?*

### Average & Worst Case
*Why are average and worst case identical at \\( \Theta(n^2) \\), unlike most other sorts?*

### Comparisons vs Swaps
*Why is the swap count only \\( O(n) \\) while comparisons stay \\( \Theta(n^2) \\), and when does that asymmetry matter?*

## Space Complexity
*Why is selection sort \\( O(1) \\) auxiliary space with no recursion stack?*

## Trade-offs vs Bubble & Insertion Sort
*When does the low swap count win out, and when do the other quadratic sorts beat it?*

## Common Bugs & Edge Cases
*Where do you forget to reset the min index, swap with the wrong slot, or mishandle a single element?*

## Real-World Uses
*Where do minimal writes (e.g. flash memory, costly swaps) actually justify selection sort?*

## Implementation Walkthrough
*Break the algorithm into the parts you must get right before you write a line.*

### Setup
*What does the outer loop range over, and what does index \\( i \\) mean each iteration?*

### The Min-Finding Inner Loop
*How do you scan the suffix and remember where the minimum sits?*

### The Swap & Return
*When do you perform the swap (and can you skip it), and why is no explicit return needed?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
