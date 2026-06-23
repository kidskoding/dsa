# Build-Heap

## What Build-Heap Is For
*When you already hold an unordered array, why heapify it in place instead of inserting elements one at a time into an empty heap?*

## Top-Down (Insert-by-Insert) Baseline
*If you insert all \\( n \\) elements one at a time, what's the total cost and why is repeatedly sifting up the slower approach?*

## Bottom-Up Heapify
*Why start from the last internal node and walk backward toward index 0 instead of going front to back?*

### The Subtree Invariant
*When you arrive at a node, why are both of its subtrees already valid heaps, so a single sift-down on that node fully fixes it?*

### What Holds When You Reach Index 0
*By the time the loop processes the root, what is guaranteed about every node beneath it?*

## Leaves Need No Work
*Why can you skip the entire second half of the array, and exactly which index marks the first leaf?*

## Why It's O(n), Not O(n log n)
*Most nodes sit near the bottom and sift down only a step or two; only the rare high nodes travel far. Give the intuition for why those costs sum to a constant times \\( n \\) — no summation, just the "cheap nodes are common, expensive nodes are rare" argument.*

### Where the Insert-by-Insert Version Loses
*The top-down build pays the most for the LAST elements (deepest) and there are many of them — why does that flip the cost to \\( O(n\log n) \\)?*

## In-Place Heapify
*How does bottom-up build rearrange the original array directly, and why does that matter for memory-tight code?*

## Heapsort Connection
*Once the array is a max-heap, how do repeated extract-max steps sort it ascending, and what's the total running time?*

### Sorting In the Same Array
*Where does each extracted max go so heapsort stays \\( O(1) \\) extra space — what shrinking boundary separates "heap" from "sorted tail"?*

## Time Complexity
*Separate the linear build phase from anything built on top of it.*

### Build Phase
*Why is bottom-up build \\( O(n) \\) best, average, AND worst — what about the structure makes the input order irrelevant to the bound?*

### Heapsort Phase
*Why does the extraction phase cost \\( O(n\log n) \\) — \\( n \\) extractions each sifting down up to the full height?*

### Best/Worst Triggers
*Does heapsort have a meaningfully better best case, or is it \\( O(n\log n) \\) regardless of input order? Why?*

## Space Complexity
*Why is bottom-up build \\( O(1) \\) auxiliary, and what would push it higher?*

### Recursion Depth of Sift-Down
*If sift-down is recursive, what stack depth does the build incur, and how does an iterative sift-down keep the whole build \\( O(1) \\) space?*

## Pitfalls
*What breaks if you sift up instead of down during build, start the loop at the wrong index, iterate forward instead of backward, or assume build-heap leaves the array fully sorted?*

## Implementation Walkthrough
*Plan the code in parts before you write it — each sub-section tells you what to figure out, not the answer.*

### The First-Internal-Node Index
*How do you compute the index of the last node that has a child, so your loop starts there and skips all leaves?*

### The Backward Loop
*Why does the loop count down to and include index 0, and what single call does it make at each node?*

### Reusing Sift-Down
*Why can build-heap delegate entirely to the same sift-down routine the heap already has — what must that routine accept as a starting index?*

### Layering Heapsort On Top
*After build, how does the extract-and-place-at-the-shrinking-end loop turn the heap into a sorted array without new memory?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
