# Quicksort

## What It Is & When to Use It
*Why is quicksort the default in-memory sort despite a bad worst case?*

## How Partitioning Works
*How does choosing a pivot and rearranging elements around it divide the problem?*

### Why the Pivot Lands in Its Final Spot
*After a partition, why is the pivot already in its correct sorted position forever?*

### The Two Recursive Subproblems
*Why do you recurse on the left and right partitions but never on the pivot itself?*

## Lomuto vs Hoare Partition Schemes
*How does each scheme rearrange around the pivot, and how do their swap counts and pivot placement differ?*

### Lomuto Partition
*How does a single forward scan with one boundary index place the pivot?*

### Hoare Partition
*How do two pointers closing inward reduce swaps, and what does the returned split point mean?*

## Pivot Selection
*Why does first-element pivoting hurt on sorted input, and how do median-of-three or randomization fix it?*

## Recursion & Tail-Call Optimization
*How do you recurse on the smaller side and loop on the larger to cap stack depth?*

## 3-Way Partition for Duplicates
*How does Dutch-national-flag partitioning into less/equal/greater regions speed up arrays with many repeats?*

## In-Place but Unstable
*Why is quicksort in-place, and why does long-distance swapping lose stability?*

## Time Complexity
*Why does the cost depend entirely on how balanced each partition is — reason from the partition quality (no recurrence solving).*

### Best Case
*What pivot quality gives even splits, and why does that yield \\( \Theta(n \log n) \\)?*

### Average Case
*Why does a random or median-of-three pivot make balanced-enough splits the norm, keeping the expected cost \\( O(n \log n) \\)?*

### Worst Case
*What input plus pivot choice produces maximally unbalanced splits and \\( \Theta(n^2) \\), and why?*

### Constant Factors
*Why does quicksort's cache-friendly, low-overhead inner loop beat heapsort and merge sort in practice?*

## Space Complexity
*Why is quicksort \\( O(1) \\) for data movement but \\( O(\log n) \\) — or \\( O(n) \\) — for the recursion stack?*

### Where the Stack Depth Comes From
*How does recursing on the smaller partition first bound the stack at \\( O(\log n) \\) even in the worst case?*

## Trade-offs vs Merge Sort & Heapsort
*When do you give up quicksort's speed for merge sort's stability or heapsort's worst-case guarantee?*

## Common Bugs & Edge Cases
*Where do infinite recursion, wrong partition bounds, and all-equal inputs break a naive implementation?*

## Where It's Used
*Why do many standard libraries ship an introsort hybrid built on quicksort?*

## Implementation Walkthrough
*Break the algorithm into the parts you must get right before you write a line.*

### Setup & Recursion Frame
*What subrange does each call own, and what range size ends the recursion?*

### The Partition Sub-Step
*How do you pick the pivot, scan, swap, and return the final pivot index?*

### Recursing on the Two Sides
*How do you split the range around the returned pivot index and recurse?*

### Base Case & Termination
*What stops the recursion, and why must the subproblems strictly shrink?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
