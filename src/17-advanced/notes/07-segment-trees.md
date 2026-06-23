# Segment Trees

## What It's For
*What pair of operations — range queries and point/range updates on an array — does this structure make logarithmic when a prefix array can't handle updates?*

## The Core Idea: Recursive Node Ranges
*How does each node own an interval \\( [lo, hi] \\), with children splitting it at the midpoint down to single-element leaves?*

### Array Layout vs Pointer Layout
*When do you store the tree flat in an array (node \\( i \\) → children \\( 2i, 2i{+}1 \\)) versus with explicit node objects, and why?*

### Canonical Segments
*What are the \\( O(n) \\) "canonical" intervals a segment tree can represent, and why is every query range a union of \\( O(\log n) \\) of them?*

## Building the Tree
*How does build recurse to the leaves and combine children bottom-up, and why is it linear time?*

## Range Query Decomposition
*Trace the three cases at each node — no overlap, full overlap, partial overlap — and how a query splits into canonical segments.*

### Why a Query Touches Only O(log n) Nodes
*At each tree level, why can at most two nodes be "partially" overlapped by the query range, so the descent fans out by at most a constant per level?*

## Point Update
*How do you change one leaf and re-merge its ancestors on the way back up?*

## Range Update
*Why does a naive per-leaf range update cost too much, and what does this motivate (see lazy propagation)?*

## The Associative Merge Function
*What property must the combine operation have, and which operations qualify — sum, min, max, gcd, and what about non-associative ones?*

### Identity Elements
*Why does each merge need an identity value for the "no overlap" case, and what is it for sum vs min?*

## Time Complexity
*Reason about why each operation is logarithmic, not just that it is.*

### Build
*Why is building bottom-up \\( O(n) \\) — how many internal nodes are there, and how much work does each merge do?*

### Query
*Tie the cost to the "at most two partial nodes per level" argument: why does that make a range query \\( O(\log n) \\) merges?*

### Point and Range Update
*Why does a point update walk a single root-to-leaf path (\\( O(\log n) \\)), and why does a naive range update degrade to \\( O(n) \\) without lazy tags?*

## Space Complexity
*Account for the array or node storage and the recursion.*

### Why the Array Needs ~2n to 4n Slots
*For a flat array layout, why must you size it to the next power of two (or \\( 4n \\) to be safe), and where does the wasted space come from?*

### Recursion Stack
*How deep does the recursive query/update go, and how does that relate to tree height?*

## Segment Tree vs Fenwick Tree vs Sparse Table
*When does the segment tree's generality earn its larger code and memory over a Fenwick tree or a static sparse table?*

## Real Uses
*Where do range queries with updates show up — range sums/mins, range coloring, counting, and 2D variants?*

## Pitfalls
*What goes wrong with off-by-one ranges, forgetting the identity, integer overflow on sums, or under-sizing the backing array?*

## Implementation Walkthrough
*Plan the code in parts before writing it.*

### Tree Representation and Sizing
*Will you use a flat array or nodes? How big must the array be, and how do children/parent indices relate?*

### Recursive Build
*What are the parameters of the build recursion (node index, lo, hi), the leaf base case, and the post-recursion merge step? Prompts only.*

### Query Decomposition
*Sketch the three-case branch (disjoint → identity, contained → return node, else recurse and merge) without writing it out.*

### Point Update and Re-Merge
*Which path do you descend, and at which point on the way back up do you recombine children?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn.*
