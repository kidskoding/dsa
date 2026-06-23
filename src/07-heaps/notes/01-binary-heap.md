# Binary Heap

## What a Heap Is & When to Use It
*What problem does a heap solve that a sorted array or BST doesn't — when do you only ever need fast access to the single smallest (or largest) element rather than full ordering?*

## Heap-Order Property
*What local rule must hold between every parent and its children, and why is "parent beats its kids" strictly weaker than "the whole array is sorted"?*

### Partial vs. Total Order
*Why can two siblings sit in any relative order, and what cheaper maintenance does that freedom buy you?*

### The Shape (Completeness) Invariant
*Why must a heap also be a COMPLETE tree — every level full except possibly the last, filled left to right — and what would break if you allowed holes?*

## Array-Backed Complete Tree
*Why does the completeness invariant let you store the whole tree in a contiguous array with zero pointers and zero wasted slots?*

### Index Math: Parent & Children
*Given a node at index `i`, how do you compute parent, left child, and right child — and how does every formula shift between 0-based and 1-based arrays?*

### Where the Next Slot Goes
*Why is "append at the end of the array" always the unique spot that preserves completeness on insert?*

## Sift-Up (Insert)
*After appending the new value at the tail, which direction does it travel and exactly what condition halts the climb?*

### The Climb Loop
*At each step which two elements do you compare, and when do you stop — element reaches the root, or its parent already dominates it?*

## Sift-Down (Extract / Remove)
*Why do you overwrite the root with the last leaf and shrink the array FIRST, before doing any swapping?*

### Picking the Right Child
*With two candidate children, how do you choose which one to swap toward so you don't violate the order on the other branch?*

### Why You Swap Toward the Dominant Child
*In a max-heap, what goes wrong if you swap with the smaller child instead of the larger one?*

## Peek vs. Poll
*Why is reading the top \\( O(1) \\) while removing it forces \\( O(\log n) \\) — what structural repair does removal trigger that a read never does?*

## Min-Heap vs. Max-Heap
*What is the single thing you change to flip one into the other, and where in code does that decision actually live — the comparator?*

## decrease-key / increase-key
*If you change a key already inside the heap, why must you re-sift, and how do you decide whether to sift up or down from that position?*

## Time Complexity
*Tie every operation's cost to the tree's height, which is about \\( \log_2 n \\) precisely because the tree is complete.*

### Peek
*Why is reading min/max always \\( O(1) \\) no matter the size — what does it actually touch?*

### Insert (Sift-Up)
*Worst case the new element climbs the full height — what bound is that? What's the best case when it stops at its parent, and why is the average closer to \\( O(1) \\) given most nodes live near the bottom?*

### Extract (Sift-Down)
*Why is the worst case the full height again, and why can't you rely on an early stop the way insert sometimes can?*

### Building From n Inserts
*If you build by inserting one at a time, why does that land at \\( O(n\log n) \\) — and how is that different from the bottom-up build in the build-heap note?*

## Space Complexity
*Why does the array-backed heap need only \\( O(n) \\) total and \\( O(1) \\) auxiliary space — no node objects, no child pointers?*

### Iterative vs. Recursive Sifting
*If you code sift-down recursively, what call-stack depth do you pay, and how does rewriting it as a loop drop that back to \\( O(1) \\)?*

### Dynamic Array Resizing
*When the backing array grows, what amortized cost does doubling add, and does it change the asymptotic space?*

## Priority-Queue Uses
*Where does a heap show up — task scheduling, Dijkstra, top-k selection, k-way merge of sorted streams — and why is it the natural fit each time?*

## Pitfalls
*What breaks with off-by-one index math, forgetting to shrink the array on poll, mutating a key in place without re-sifting, or storing comparables that don't define a total order?*

## Implementation Walkthrough
*Plan the code in parts before you write it — each sub-section tells you what to work out, not the answer.*

### Layout & Index Helpers
*What backing storage and size counter do you need, and which tiny helpers (`parent`, `left`, `right`) should everything call so the index math lives in exactly one place?*

### The Sift-Up Routine
*What loop condition climbs from a given index, what do you swap, and how do you stop cleanly at the root?*

### The Sift-Down Routine
*Starting at an index, how do you select the dominant child, decide whether a swap is needed, and continue until the node settles?*

### Insert & Extract Wired Together
*How does insert append-then-sift-up, and how does extract save-the-top, move-last-to-root, shrink, then sift-down? Which edge cases (empty heap, single element) must each guard?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
