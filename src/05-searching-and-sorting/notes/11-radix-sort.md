# Radix Sort

## What It Is & When to Use It
*How does sorting by digits avoid comparisons entirely, and what kinds of keys does it suit?*

## How Digit-by-Digit Sorting Works
*How does stably sorting one digit position at a time eventually produce a fully sorted array?*

### Why Stability Carries Earlier Work Forward
*Why must each digit pass preserve the order established by previous passes for the final result to be correct?*

## LSD vs MSD
*Why does least-significant-digit-first need a stable subroutine, and when is most-significant-digit-first better?*

### LSD Radix Sort
*Why does starting from the rightmost digit let earlier passes survive later ones?*

### MSD Radix Sort
*How does starting from the leftmost digit recurse into buckets, and where does it shine for strings?*

## The Stable Subroutine Requirement
*What goes wrong if the per-digit sort (usually counting sort) isn't stable?*

## Choosing the Radix \\( r \\)
*How does picking the base trade the number of passes against the work per pass?*

### Bits-per-Pass Tuning
*How does grouping several bits into one "digit" change the pass count and the count-array size?*

## Handling Different Key Types
*How do you adapt radix sort to fixed-width integers, negative numbers, and variable-length strings?*

## Time Complexity
*Why is the cost the number of digits times the per-digit pass cost — break it into its factors.*

### The \\( O(d \cdot (n + r)) \\) Bound
*Where do the \\( d \\), the \\( n \\), and the \\( r \\) each come from in the total cost?*

### Why It Can Beat \\( n \log n \\)
*Under what relationship between \\( d \\), \\( r \\), and \\( n \\) does radix sort beat comparison sorts, and when does it not?*

### Best, Average, Worst
*Why is radix sort's running time essentially insensitive to input order?*

## Space Complexity
*Why does each counting-sort pass need \\( O(n + r) \\) auxiliary space, and why is radix sort not in-place?*

## Trade-offs vs Comparison Sorts & Counting Sort
*When does the digit count \\( d \\) or memory overhead make radix sort lose to a plain comparison sort or plain counting sort?*

## Common Bugs & Edge Cases
*Where do digit-extraction errors, an unstable inner sort, or mixed-length keys break correctness?*

## Real-World Uses
*Where do fixed-width keys — IDs, IP addresses, fixed-length strings — make radix sort a strong pick?*

## Implementation Walkthrough
*Break the algorithm into the parts you must get right before you write a line.*

### Setup & Digit Count
*How do you determine how many digit passes \\( d \\) you need from the maximum key?*

### Extracting One Digit
*How do you pull out the digit at position \\( p \\) in base \\( r \\) using division and modulo?*

### The Stable Per-Digit Pass
*How does the counting-sort subroutine run on a single digit, and where does its output go?*

### Looping Over Digits & Return
*In which order do you process digit positions, and how does the array end up fully sorted?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
