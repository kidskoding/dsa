# Fenwick Tree (Binary Indexed Tree)

## What It's For
*What problem does a BIT solve — prefix sums that stay correct under point updates — and why is a plain prefix-sum array bad at updates?*

## The Core Idea: Each Index Owns a Range
*How does each tree index become responsible for a contiguous block of the original array, sized by its lowest set bit?*

### Picturing the Coverage
*For a small array, sketch which range each index \\( i \\) covers. Why do some indices cover one element and others cover a long span?*

## The Low-Bit Trick i & -i
*What does \\( i \mathbin{\&} -i \\) isolate, and how does the lowest set bit decide the span each index covers?*

### Why Two's Complement Makes It Work
*Why does \\( -i \\) (two's complement) flip all bits above the lowest set bit, so the AND leaves exactly that one bit? Reason through a small example.*

## 1-Indexing Convention
*Why is the tree built 1-indexed, and what goes wrong at index 0?*

## Prefix-Sum Query
*Trace how you walk down by stripping the low bit (\\( i \mathrel{-}{=} i \mathbin{\&} -i \\)) to accumulate the sum of \\( 1..i \\).*

## Point Update
*Trace how you walk up by adding the low bit (\\( i \mathrel{+}{=} i \mathbin{\&} -i \\)) to touch every index responsible for position \\( i \\).*

## Range Query via Prefix Differences
*How do you turn the sum over \\( l..r \\) into two prefix queries, and why does this trick require an invertible operation?*

## Building in O(n)
*How do you construct the tree in linear time by pushing each value to its immediate parent, instead of \\( n \\) separate updates?*

## Variants
*How do you extend a BIT to range-update + point-query (difference trick), range-update + range-query (two BITs), or 2D grids?*

## Time Complexity
*Reason about why every operation is logarithmic via the bit pattern.*

### Why Query and Update Are O(log n)
*Each step of query strips, and each step of update adds, the lowest set bit. Why does that change at most one bit position per step, so the loop runs at most \\( \log n \\) times?*

### Why Build Is O(n)
*Compare \\( n \\) separate \\( O(\log n) \\) updates against the push-to-parent method. Why does the linear build touch each node only a constant number of times?*

### 2D and Range-Update Variants
*What does adding a dimension or a second tree do to the per-operation cost (\\( O(\log^2 n) \\), constant-factor doubling), and why?*

## Space Complexity
*Account for the storage.*

### Why Just One Array of Size n
*Why does a BIT need only a single array the size of the input (plus 1 for 1-indexing), with no parent pointers or tree nodes?*

### Why It Beats a Segment Tree on Memory
*Where does the segment tree's \\( 2n \\)–\\( 4n \\) come from, and why does the BIT avoid it entirely?*

## Fenwick vs Segment Tree
*Why pick a BIT — tiny code, low constant factor, half the memory — and what does its invertibility requirement rule out (e.g. range min)?*

## Pitfalls
*What goes wrong with 0-indexing, range queries on a non-invertible op, integer overflow, or mixing up the strip-low-bit and add-low-bit directions?*

## Implementation Walkthrough
*Plan the few lines before writing them.*

### The Array and 1-Indexing
*How big is the backing array, and how do you map external 0-based positions to internal 1-based indices? Prompts only.*

### The lowBit Helper
*What single expression isolates the low bit, and why will you reuse it in both loops?*

### Update Loop (Walk Up)
*Which direction does the index move, and what's the loop bound? Sketch as a prompt, not code.*

### Query Loop (Walk Down) and Range via Difference
*Which direction does the index move for a prefix query, and how do two prefix calls combine into a range answer?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
