# Amortized Resizing

## What It Is & Why It Matters
*Why must a hash table change its slot count as it fills and empties, and how does occasional expensive resizing keep every operation cheap on average?*

## Why Tables Must Grow
*What goes wrong as the load factor \\( \alpha \\) drifts too high — longer chains or more probes — and why does that erode the \\( O(1) \\) promise?*

## Why Tables Sometimes Shrink
*Why is a mostly-empty table wasteful of memory, and when is it worth halving capacity to reclaim space?*

## Table Doubling
*State the rule: when \\( \alpha \\) crosses a threshold, double the slot count — and why does multiplying capacity (not adding a fixed amount) matter for the amortized argument?*

### Why Growing By A Constant Fails
*Why does adding a fixed number of slots each time lead to \\( O(n) \\) amortized insertion, and how does geometric growth fix it?*

## The Cost Of One Resize
*Why does a single resize cost \\( O(n) \\) — you must allocate a new array and rehash every existing entry into it — and why can't old indices simply be copied over?*

## Why Rehashing Is Unavoidable
*Since the slot index depends on the table size, why does every key need a freshly computed index in the larger table rather than a position-preserving copy?*

## Time Complexity
*Why must you reason about resizing over a whole sequence of operations, since any single insert that triggers a resize looks \\( O(n) \\) in isolation?*

### A Single Insert — Worst Case
*Why does the one insert that crosses the threshold pay the full \\( O(n) \\) rehash, and why is that spike unavoidable?*

### Amortized \\( O(1) \\) Insert (Intuition Only)
*Why does an \\( O(n) \\) resize that happens only after about \\( n \\) cheap inserts spread out to a tiny constant per insert — and why does that make the average, not the spike, the right cost to quote?*

### The Pre-Paying / Credit Picture
*Imagine each insert sets aside a little extra "credit" that later funds the next doubling — why does this bookkeeping idea explain the constant average without a formal proof?*

### Amortized-Analysis Lenses
*How would the aggregate, accounting, and potential methods each frame this same result, and why do all three land on the same constant average?*

## Space Complexity
*Why does the table use \\( O(m) \\) space that stays within a constant factor of \\( n \\) under doubling/halving, and why does a resize briefly need both old and new arrays at once — a transient \\( O(n) \\) spike?*

### Wasted Space Between Resizes
*Why does geometric growth mean the table is at most a constant factor larger than the live entries, bounding wasted space?*

## Avoiding Thrashing
*Why should the shrink threshold sit well below the grow threshold (not symmetric), and what repeated grow-shrink-grow disaster does that hysteresis gap prevent?*

## Trade-offs
*Why pick a larger growth factor (fewer resizes, more wasted space) versus a smaller one (tighter memory, more frequent rehashes), and what governs the choice?*

## Pitfalls
*Where do mistakes happen — growing by a constant instead of a factor, symmetric grow/shrink thresholds that thrash, forgetting tombstones count toward load in open addressing, or rehashing into stale indices?*

## Implementation Walkthrough
*Before writing code, plan the pieces below — each prompt tells you what to work out, not the answer.*

### The Load-Factor Check
*Where in `insert` (and `delete`) do you compute \\( \alpha \\) and decide whether to resize?*

### Allocating The New Table
*How do you choose the new capacity and create the fresh backing array?*

### Rehashing Every Entry
*How do you walk the old table and re-insert each live entry into the new one using the new size?*

### The Hysteresis Thresholds
*What two different thresholds do you pick for growing vs. shrinking, and why the gap?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
