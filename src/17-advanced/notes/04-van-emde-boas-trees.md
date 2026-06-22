# van Emde Boas Trees

## What It's For
*What does a vEB tree do that a balanced BST can't — predecessor, successor, insert, delete all faster than \( O(\log n) \)?*

### The Catch: Integer Keys Only
*Why does this speed only apply to keys drawn from a bounded universe \( \{0, \dots, u-1\} \), not arbitrary comparables?*

## The Universe and Why u Drives Cost
*How does the cost depend on the size of the key space \( u \) rather than the number of stored elements \( n \)?*

## Splitting a Key: High and Low Bits
*How does a key split into a "cluster" index (high bits) and a "position within cluster" (low bits) using \( \sqrt{u} \)?*

### high(x), low(x), and index(c, i)
*Write the three helper definitions as prompts: which bits go to the cluster number, which to the offset, and how do you reassemble a key?*

## Recursive Structure of Clusters
*What does each node hold: an array of \( \sqrt{u} \) child vEB clusters, each over a universe of size \( \sqrt{u} \)?*

## The Summary Structure
*What does the summary vEB track, and how does it let you jump straight to the next non-empty cluster without scanning?*

## Min and Max Stored Explicitly
*Why does caching the min and max at each node — and keeping min outside the recursion — eliminate a recursive call and make the recurrence work?*

### The Min-Lazy Trick
*Why is the minimum NOT stored recursively in any cluster, and how does that single design choice cap the number of recursive calls per operation at one?*

## Successor and Predecessor
*Trace how a successor query makes at most one recursive call: stay within the current cluster, or hop via the summary to the next non-empty one.*

## Insert and Delete
*How do insert and delete keep min/max and the summary consistent while still bottoming out in one recursive branch?*

### Why Insert Recurses Only Once
*When a cluster becomes newly non-empty, why does inserting into it cost \( O(1) \) so the only "real" recursion is the summary update (or vice versa)?*

## Time Complexity
*Reason carefully about the recurrence — this is the heart of the topic.*

### The Recurrence T(u) = T(√u) + O(1)
*Why does each operation make at most one recursive call on a universe of size \( \sqrt{u} \) plus constant work? Set up the recurrence — do not solve the algebra, just state what it unrolls toward.*

### Why It Lands at O(log log u)
*Intuitively, why does repeatedly taking square roots of \( u \) reach a constant in \( \log\log u \) steps? Connect that to the number of bits in a key.*

### Per-Operation Bounds
*State successor, predecessor, insert, delete, and member costs, and note which is \( O(1) \) (member? min? max?).*

## Space Complexity
*This is the structure's main weakness — reason about it.*

### Why Space Is O(u)
*Each node allocates \( \sqrt{u} \) cluster slots plus a summary. Why does the total swell toward \( O(u) \) regardless of how few keys \( n \) you store?*

### Shrinking It: Hashing the Clusters
*How does replacing the dense cluster array with a hash table give \( O(n) \) space, and what does that turn the vEB into conceptually?*

## vEB vs Balanced BST vs y-fast Trie
*When is the \( O(\log\log u) \) speed worth the space, and what does a y-fast trie offer to fix the space blowup?*

## Pitfalls
*What goes wrong with the empty-tree base case, the min-stored-outside trick during delete, or a non-power-of-two universe?*

## Implementation Walkthrough
*Plan the recursive structure before writing it.*

### Node Layout and Base Case
*What does a vEB node store (u, min, max, summary, clusters), and what is the base case at \( u = 2 \) where there's no recursion?*

### The Bit-Split Helpers
*Sketch high/low/index in terms of \( \sqrt{u} \) (upper and lower square roots) — what's the prompt for handling odd bit counts?*

### Successor/Predecessor Branching
*Lay out the decision tree: check min/max shortcuts first, then "is there a successor in this cluster?", else "hop summary to next cluster." Prompts only.*

### Insert/Delete and the Empty Transitions
*What special handling does an empty subtree (insert) or a subtree dropping to one element (delete) need to keep min/max and summary correct?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
