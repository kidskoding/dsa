# d-ary Heaps

## What a d-ary Heap Is & Why Tune d
*Why would you give each node \\( d \\) children instead of 2 — what single knob are you turning and what does it buy you?*

## Layout: Still an Array, Wider Nodes
*How does the same flat-array trick extend when every node has \\( d \\) children packed contiguously, and why is there still no pointer overhead?*

### The Completeness Invariant Still Holds
*Why does a d-ary heap remain a complete tree, and why does that keep the array gap-free?*

## Index Math for d Children
*Given index `i`, how do you compute its parent and the contiguous block of its \\( d \\) children — and how does each formula generalize the binary `2i+1 / 2i+2` case?*

### Off-by-One Across Bases
*How does the child-block formula shift between 0-based and 1-based arrays, and why is this the easiest place to introduce a bug?*

## Shorter, Bushier Tree
*Why does raising \\( d \\) shrink the height to roughly \\( \log_d n \\), and what gets more expensive lower down as a direct consequence?*

## Sift-Up (Insert / decrease-key)
*Why do insert and decrease-key speed up as \\( d \\) grows — what work do they NOT have to do that sift-down does?*

## Sift-Down (Extract-Min)
*Why must extract-min scan all \\( d \\) children at each level to find the smallest, and how does that scanning cost fight against the shorter height?*

### Finding the Min Child
*With \\( d \\) candidates instead of 2, how do you code the inner loop that picks the swap target, and how do you handle the last node having fewer than \\( d \\) children?*

## Choosing d for a Workload
*If your algorithm fires far more decrease-keys than extract-mins (think Dijkstra on a dense graph), should \\( d \\) go up or down — and what does that do to the two operations?*

## Time Complexity
*Express every operation in terms of \\( d \\): the height is \\( \log_d n \\), but each sift-down level now costs \\( d \\) comparisons.*

### Insert & decrease-key (Sift-Up)
*Why is the bound \\( O(\log_d n) \\), and why does it shrink as \\( d \\) grows — what does sift-up never pay that sift-down does?*

### Extract-Min (Sift-Down)
*Why is the bound \\( O(d\log_d n) \\), and which factor grows with \\( d \\) while the other shrinks? Where does the sweet-spot \\( d \\) come from intuitively?*

### Peek & Build
*Why is peek still \\( O(1) \\), and does bottom-up build stay linear for a d-ary heap?*

## Space Complexity
*Why is a d-ary heap still \\( O(n) \\) total and \\( O(1) \\) auxiliary, and does a larger \\( d \\) change the storage at all?*

### Recursion vs. Iteration
*If sift-down recurses, what stack depth (\\( \log_d n \\)) do you pay, and how does iterating remove it?*

## Trade-offs vs. Binary Heap
*When is a binary heap simply the right default, and what concrete cache-friendliness or operation-mix win justifies the extra index bookkeeping of a d-ary heap?*

## Pitfalls
*What breaks if you mis-index the child block, forget the last node may have fewer than \\( d \\) children, scan past the array end, or pick \\( d \\) without measuring the real workload?*

## Implementation Walkthrough
*Plan the code in parts before you write it — each sub-section tells you what to work out, not the answer.*

### Parameterizing d & the Index Helpers
*How do you make `d` a field and write `parent(i)` and `kthChild(i, k)` so the rest of the code never hardcodes 2?*

### The Min-Child Scan
*Inside sift-down, how do you loop over the up-to-\\( d \\) children, clamp at the array boundary, and track the dominant one?*

### Sift-Up vs. Sift-Down Symmetry
*Why does sift-up stay almost identical to the binary case while sift-down gains the inner scan — what's the structural reason?*

### Insert & Extract Wired Together
*How do append-then-sift-up and move-last-to-root-then-sift-down carry over unchanged except for the helpers they call?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
