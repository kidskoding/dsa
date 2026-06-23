# Open Addressing

## What It Is & When To Use It
*How does open addressing store every entry directly in the table array (no external lists), and why is its cache-friendliness attractive when load stays moderate?*

## Storing Everything In The Table
*Contrast with chaining: when a slot is taken, where does the colliding key go, and why does this design cap the table at \\( \alpha \le 1 \\)?*

## Probe Sequences: The Core Idea
*Why does each key define a sequence of slots to try in order, and why must `lookup` follow the exact same sequence `insert` used or risk missing a present key?*

### The Three Slot States
*Why do you need to distinguish empty, occupied, and deleted slots, and how does each state steer a probe differently?*

## Linear Probing
*Write the probe formula that steps one slot at a time — what makes it simple and cache-friendly, and what clustering problem does it invite?*

## Quadratic Probing
*Write the probe formula with a quadratic offset — how does it scatter probes farther apart, and why must table size and constants be chosen so it can visit enough slots?*

## Double Hashing
*Show the probe formula using a second hash for the step size — why does giving each key its own stride spread probes best of the three schemes?*

### Why The Second Hash Must Be Nonzero And Coprime
*Why does a step size of zero or one sharing a factor with \\( m \\) fail to cover the table, and how do you guarantee the stride is safe?*

## Primary & Secondary Clustering
*Describe primary clustering (long contiguous runs from linear probing) versus secondary clustering (keys with the same start sharing a probe path), and which scheme causes each?*

## Coding Insert, Lookup & The Empty Marker
*How does insert walk the probe sequence to the first usable slot, how does lookup stop only at a truly empty slot, and why does that empty marker decide correctness of the whole search?*

## Tombstones On Delete
*Why can't you just blank a slot on delete (it would sever probe chains and hide later keys), and how does a "deleted" tombstone let lookups keep probing while inserts may reuse the slot?*

### Why Tombstones Accumulate And Hurt
*Why do tombstones count as "occupied" for search length even though they hold no key, and why does that force periodic rehashing?*

## Time Complexity
*Why does open addressing's cost hinge entirely on the expected number of probes, and why does that number depend so sharply on \\( \alpha \\)?*

### insert / lookup / delete — Expected Probes
*Why does expected probe count rise roughly like \\( \frac{1}{1-\alpha} \\) (state it, don't derive), so all three operations stay \\( O(1) \\) at moderate load but balloon near full?*

### Worst Case
*Why can a single operation degrade to \\( O(n) \\) when clustering or a near-full table forces a probe of most of the array?*

### How Tombstones Inflate Effective Load
*Why does a table littered with tombstones behave like a fuller table for timing purposes, lengthening every probe?*

## Space Complexity
*Why is open addressing's space just the single array of \\( m \\) slots — \\( O(m) \\), with no per-entry pointers — and why does that compactness improve cache behavior over chaining?*

### Why \\( \alpha \le 1 \\) Bounds Storage
*Why can the number of entries never exceed the slot count, and how does that ceiling shape your resize policy?*

## Trade-offs vs. Chaining
*Why does open addressing win on memory and cache locality but lose on tolerance for high load, deletes, and clustering?*

## Pitfalls
*Where do bugs live — stopping a lookup at a tombstone instead of an empty, forgetting tombstones inflate effective load, a quadratic step that never reaches some slots, or a zero-stride double hash?*

## Implementation Walkthrough
*Before writing code, plan the pieces below — each prompt tells you what to work out, not the answer.*

### The Slot Array And State Tracking
*How do you represent occupied, empty, and deleted in parallel arrays or a small enum per slot?*

### The Probe Loop
*How does one loop generate successive indices from your chosen scheme and stop at the right state for insert vs. lookup?*

### Insert Reusing Tombstones
*How does insert remember the first tombstone it passed so it can place the key there if the key isn't found later?*

### Delete By Tombstoning
*How does delete find the key, then mark its slot deleted rather than empty?*

### Resize And Drop Tombstones
*How does rehashing into a fresh array naturally discard all tombstones and reset effective load?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
