# Bloom Filters

## What It Is & When To Use It
*What question does a Bloom filter answer — probabilistic set membership in tiny space — and when is trading certainty for memory the right call?*

## Probabilistic Membership
*Why does a Bloom filter only ever say "definitely not present" or "possibly present," and why does it store no keys at all, only bits?*

## Representation: Bit Array + \\( k \\) Hashes
*How is the whole structure just a bit array of \\( m \\) bits plus \\( k \\) independent hash functions, and why does that make it so compact compared to a real set?*

### Why \\( k \\) Independent Hashes
*Why does each key get mapped to \\( k \\) different bit positions instead of just one, and what does that buy versus a single hash?*

## Coding `insert`
*How does adding a key set the \\( k \\) bits at its hashed positions, and why are bits only ever turned on, never off?*

## Coding `query`
*How does a membership test check whether all \\( k \\) bits are set — why does one clear bit prove absence, while all-set bits only suggest presence?*

## False Positives, Never False Negatives
*Explain why "possibly present" can lie (other inserted keys' bits happened to cover all \\( k \\) positions) but "absent" can never be wrong — and why that asymmetry defines the structure?*

### Why The False-Positive Rate Climbs As You Fill It
*Why does each insert that sets more bits raise the chance that a never-inserted key finds all its bits already on, and why does an over-full filter approach uselessness?*

## Why Deletion Doesn't Work
*Why can't you clear bits to remove a key (you'd corrupt other keys that share those bits), and how do counting Bloom filters work around it?*

## Tuning \\( m \\), \\( k \\), And \\( n \\)
*How do the bit-array size \\( m \\), number of hashes \\( k \\), and expected element count \\( n \\) trade off, and why is there an optimal \\( k \\) that minimizes false positives for a given size budget?*

### Too Few vs. Too Many Hashes
*Why does using too few hashes under-use the available bits while too many fills the array too fast — both raising the false-positive rate?*

## Time Complexity
*Why is a Bloom filter's speed governed entirely by \\( k \\), the number of hashes, and not by how many elements it already holds?*

### insert / query — Cost In Terms Of \\( k \\)
*Why are both insert and query \\( O(k) \\) — independent of \\( n \\) — and why does that make a Bloom filter's timing flat as it fills?*

### Why There's No Resizing Story
*Why can't a standard Bloom filter grow and rehash like a hash table, and what must you do instead if you under-sized it?*

## Space Complexity
*Why does a Bloom filter use only \\( O(m) \\) bits — often a handful of bits per element — and why is that dramatically smaller than storing the keys themselves?*

### Bits Per Element, Not Bytes Per Key
*Why is the space budget naturally expressed as bits-per-element, and how does that beat any structure that must retain the actual keys?*

## Real Uses & Trade-offs
*Where do Bloom filters shine — a cheap in-memory pre-check before an expensive disk or network lookup (databases, caches, web crawlers, CDNs) — and what certainty do you give up for the space saving?*

## Pitfalls
*Where do people go wrong — attempting deletion on a plain filter, undersizing \\( m \\) for the real element count, reusing correlated hashes, or treating "possibly present" as a definite yes?*

## Implementation Walkthrough
*Before writing code, plan the pieces below — each prompt tells you what to work out, not the answer.*

### The Bit Array
*How do you store \\( m \\) bits compactly (e.g. a long array with bit indexing) and set/test an individual bit?*

### Deriving \\( k \\) Positions From A Key
*How can you generate \\( k \\) distinct bit positions per key, perhaps by combining two base hashes instead of maintaining \\( k \\) separate functions?*

### Insert: Set All \\( k \\) Bits
*How does insert loop over the \\( k \\) positions turning each bit on?*

### Query: Test All \\( k \\) Bits
*How does query short-circuit to "absent" the moment it finds one clear bit?*

### Sizing From A Target False-Positive Rate
*Given an expected \\( n \\) and a desired error rate, how would you back out reasonable \\( m \\) and \\( k \\) at construction?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
