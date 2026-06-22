# Sparse Tables

## What It's For
*What problem does a sparse table nail — answering range queries in constant time on a static array — and what's the catch about updates?*

## The Core Idea: Precompute Power-of-Two Blocks
*How is \\( \text{table}[k][i] \\) defined as the answer over the block of length \\( 2^k \\) starting at \\( i \\)?*

## Idempotent Operations Only
*Why does \\( O(1) \\) querying require an overlap-tolerant operation \\( f(x,x)=x \\), and which operations qualify — min, max, gcd — and which don't?*

### What "Idempotent" Buys You
*Why does double-counting the overlap of two blocks change nothing for min/max but corrupt a sum? Connect that to the \\( O(1) \\) query.*

## Building the Table
*Trace the doubling recurrence that fills row \\( k \\) from two half-length blocks in row \\( k-1 \\).*

## The O(1) Overlapping Query
*Show how two overlapping blocks of length \\( 2^k \\) exactly cover any range \\( [l, r] \\), and why overlap is harmless here but not for sums.*

### Choosing the Right k
*For a range of length \\( \text{len} \\), why do you pick \\( k = \lfloor \log_2 \text{len} \rfloor \\), and why are two blocks of length \\( 2^k \\) always enough to cover it?*

## The Log Lookup Trick
*Why precompute the floor of \\( \log_2 \\) for each length, and how does that table make every query branch-free and constant time?*

## Sums and Non-Idempotent Ops
*If the operation isn't idempotent (like sum), why must you fall back to disjoint blocks and accept \\( O(\log n) \\) per query, or use a different structure?*

## Limits: No Updates
*Why is a sparse table fundamentally static, and what breaks the moment an array element changes?*

## Time Complexity
*Reason about preprocessing and query separately.*

### Why Preprocessing Is O(n log n)
*There are \\( \log n \\) rows of \\( n \\) entries, each filled in \\( O(1) \\) from the row below. Why does that multiply to \\( O(n \log n) \\)?*

### Why Query Is O(1)
*A query reads exactly two precomputed entries and merges them. Why does that hold regardless of the range length, and what role does the precomputed log table play?*

### Why Updates Are Effectively O(n log n)
*If one element changes, how many table entries could depend on it, and why does that force a near-total rebuild?*

## Space Complexity
*Account for the table dimensions.*

### Why O(n log n) Memory
*Why does storing one answer per (power, start) pair give an \\( n \times \log n \\) table, and how does that compare to a segment tree's \\( O(n) \\)?*

### The Log Table Itself
*How much extra space does the precomputed \\( \lfloor \log_2 \rfloor \\) array cost, and why is it negligible?*

## Sparse Table vs Segment Tree vs Fenwick
*When does the \\( O(1) \\) query and simple code win, and when do you need a segment tree or BIT instead?*

## Real Uses
*Where do static idempotent range queries appear — range minimum for LCA, range gcd, and as a building block in offline algorithms?*

## Pitfalls
*What goes wrong using a sparse table for sums, getting the log floor off by one, or under-sizing the \\( k \\) dimension?*

## Implementation Walkthrough
*Plan the two-dimensional table before writing it.*

### Sizing the Table
*How many rows (powers of two) do you need for length \\( n \\), and how do you size the second dimension? Prompts only.*

### Precomputing Logs
*How do you fill the \\( \lfloor \log_2 \rfloor \\) array in one linear pass so each query can look it up?*

### Filling Rows by Doubling
*What's the recurrence that combines two length-\\( 2^{k-1} \\) blocks into a length-\\( 2^k \\) block, and what bounds the start index in each row?*

### The Two-Block Query
*Given \\( l, r \\), how do you compute \\( k \\), pick the two overlapping blocks, and merge them — as a prompt, not code?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
