# Fenwick vs Segment Tree

## What This Comparison Decides
*When you need range queries with updates, what factors push you toward a Binary Indexed Tree versus a segment tree?*

## What Each Computes Natively
*Which queries come "for free" on a BIT (prefix-reducible, invertible) versus a segment tree (any associative merge)?*

## The Invertibility Requirement
*Why does a BIT's range query need an inverse operation, and what does that exclude — why can't a plain BIT do range min or max?*

### Prefix-Reducible vs Canonical-Segment Decomposition
*A BIT answers ranges by subtracting prefixes; a segment tree by unioning canonical segments. Why does the first need inverses and the second doesn't?*

## Generality of the Merge Operation
*Why can a segment tree handle min, max, gcd, assignment, or custom merges that a BIT can't, and what does that buy you?*

## Range Updates: Where Each Bends
*How far can a BIT stretch with the two-tree range-update trick, and at what point does a lazy segment tree clearly win?*

## A Quick Decision Rule
*Build a checklist: invertible + prefix-reducible + just sums → BIT; needs min/max/assign/range-update/custom merge → segment tree.*

## Worked Scenarios
*For "point update + range sum," "range add + range min," and "range assign + range sum," which structure fits and why?*

## Time Complexity Compared
*Both are \( O(\log n) \) asymptotically — dig into why one is faster in practice.*

### Same Big-O, Different Constants
*If both query and update are \( O(\log n) \), why does the BIT typically run several times faster? Think about the number of array touches and branches per operation.*

### Build Costs
*Both build in \( O(n) \) — but how does the work per element differ between pushing low bits and recursively merging children?*

### Where the Segment Tree Pays More
*Which operations carry extra overhead on a segment tree (recursion, two child reads, lazy push-downs) that the BIT's tight loops avoid?*

## Space Complexity Compared
*Quantify the memory gap and its consequences.*

### n vs 2n–4n
*Why is the BIT exactly one array of size \( n \) while the segment tree needs \( 2n \)–\( 4n \) (plus a lazy array)? Where does each extra factor come from?*

### Cache Behavior
*Why does the BIT's smaller, more contiguous footprint translate into better cache performance, reinforcing the constant-factor win?*

## Implementation Effort
*Why is a BIT a handful of lines while a segment tree (especially with lazy propagation) is much longer and more error-prone?*

## Pitfalls of Choosing Wrong
*What pain do you hit forcing a BIT to do min, or reaching for a heavy lazy segment tree when a two-line BIT would do?*

## Implementation Walkthrough
*Plan a side-by-side so the trade-off is concrete.*

### Mapping a Query to Each Structure
*Take "range sum with point update" and sketch how the BIT (two prefix calls) and the segment tree (canonical-segment recursion) each answer it. Prompts only.*

### Where Invertibility Forces Your Hand
*Take "range min" and sketch why the BIT approach stalls while the segment tree proceeds — what's the missing ingredient?*

### Picking the Lighter Tool
*Given a problem statement, what questions do you ask (op invertible? range update? custom merge?) to choose before writing any code?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
