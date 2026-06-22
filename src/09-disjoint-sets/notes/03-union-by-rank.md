# Union by Rank

## What It Is & Why It Matters
*What does union by rank decide at each merge, and why does that single choice keep trees short enough to make `find` fast?*

## The Problem It Fixes
*Without a linking rule, how can `union` accidentally stack a tall tree onto a short one and grow height needlessly, and why is height the enemy?*

## Rank As A Stand-In For Height
*What does a node's rank represent, and why is it only an upper bound on the true height — especially once path compression starts flattening trees behind rank's back?*

### Why We Don't Track Exact Height
*Why is it acceptable (and cheaper) to let rank drift above the real height after compression, rather than recomputing exact heights?*

## The Linking Rule
*When merging two roots, why attach the smaller-rank root under the larger-rank root, and what does that do to the combined tree's height?*

### Tie-Breaking & Rank Increments
*When two roots have equal rank, why does one absorb the other and the survivor's rank tick up by exactly one — and why is that the only situation in which any rank ever changes?*

## Storing Rank Alongside Parents
*How do you keep a parallel `rank[]` array initialized to zero, and why does only a root's rank entry ever matter for decisions?*

## Coding `union` With Rank
*How does the merge read both roots' ranks, branch on the comparison, link accordingly, and bump the rank only on a tie — and why does this stay \\( O(1) \\) on top of the two finds?*

## Logarithmic Height Guarantee
*Intuitively, why does rank-based linking keep any tree's height at \\( O(\log n) \\) even before path compression — what relationship between a root's rank and the number of nodes beneath it forces this?*

### Why Rank r Implies At Least 2^r Nodes
*Conceptually, why must a root of rank \\( r \\) have at least \\( 2^r \\) descendants, and why does that cap rank — and therefore height — at about \\( \log_2 n \\)?*

## Union By Size As An Alternative
*How does tracking subtree size (attach the smaller-count root under the larger) compare to rank, why does it give the same \\( O(\log n) \\) height guarantee, and why is it often simpler to reason about?*

## Time Complexity
*Why does union by rank turn the structure's per-operation cost from \\( O(n) \\) into something logarithmic, even with no compression?*

### find — With Rank Only
*Why does bounding height at \\( O(\log n) \\) directly bound a `find` traversal at \\( O(\log n) \\)?*

### union — With Rank Only
*Why is `union` still two finds plus \\( O(1) \\), so it inherits the \\( O(\log n) \\) bound from `find`?*

### What Changes When You Add Compression
*Why does combining rank with path compression push the amortized per-op cost below logarithmic toward near-constant — with the precise bound covered in the inverse-Ackermann note?*

## Space Complexity
*Why does union by rank add exactly one length-\\( n \\) array (the ranks) on top of `parent[]`, keeping total space at \\( O(n) \\), and why is rank a small integer rather than a large counter?*

## Trade-offs
*Why choose rank vs. size — does either ever beat the other in practice, and why do many libraries just pick one and move on?*

## Pitfalls
*Where do bugs creep in — comparing ranks of non-roots, forgetting to bump rank on ties, bumping rank when ranks differ, or mixing up the rank-update vs. size-update rules?*

## Implementation Walkthrough
*Before writing code, plan the pieces below — each prompt tells you what to work out, not the answer.*

### The `rank[]` Array
*How do you allocate and initialize ranks, and what starting value does every singleton get?*

### Comparing Roots And Linking
*How does `union` branch on the three cases — left rank smaller, right rank smaller, equal — and what does each branch do?*

### The Single Rank Increment
*In which branch, and by how much, does a rank change, and why never anywhere else?*

### Swapping To Union By Size
*What would you change to track sizes instead of ranks, and which array and update rule replaces the rank logic?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
