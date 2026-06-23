# 2-3 Trees

## Why Allow Bigger Nodes
*What problem with plain BSTs does a node that can hold two keys and grow from the leaves up actually fix?*

## 2-Nodes and 3-Nodes
### Key and Child Counts
*How many keys and children can each node type hold, and how are the keys ordered within a 3-node?*
### Why Variable-Width Nodes
*Why does letting a node flex between one and two keys give the tree room to stay perfectly balanced?*

## Perfect Balance Invariant
*Every leaf sits at the same depth — what structural rule keeps all root-to-leaf paths exactly equal length, no matter the insertion order?*

## Searching Across Multiple Keys
*At a 3-node with two keys, how do the keys carve the value range into three intervals, and which subtree do you descend into for a given key?*

## Insertion by Splitting Up
### Absorbing into a 2-Node
*Why is the lucky case just growing a 2-node into a 3-node with no structural change?*
### Overflow and Promotion
*A node temporarily overflows to four keys (a "4-node") — which key is pushed up to the parent, and what happens to the two leftover key groups?*

## Splits Propagating to the Root
*When does a split cascade all the way up, and why is splitting the root the ONLY way the tree ever gains height?*

## Deletion and Underflow
### Borrowing from a Sibling
*When a leaf drops below one key, how does a key rotate down from the parent and up from a sibling to refill it?*
### Merging Siblings
*When no sibling can spare a key, how do you fuse two nodes and pull a separator down — and how can this shrink the tree's height?*

## Why It Grows From the Top, Not the Bottom
*Contrast with a BST — why must a perfectly balanced tree add height at the root rather than dangling new depth off a leaf?*

## Time Complexity
### Search
*Why is search \\( O(\log n) \\), and how does scanning one or two keys per node add only a constant factor over a binary descent?*
### Insert and the Cost of Splits
*Why is a single insert \\( O(\log n) \\) even when a split cascades — how many nodes can a cascade touch at most?*
### Delete and the Cost of Merges
*Why does a borrow-or-merge chain on delete also stay within \\( O(\log n) \\) levels?*
### Why Height Stays Logarithmic (Intuition)
*With every leaf at the same depth and each node branching 2 or 3 ways, why must the height sit between \\( \log_3 n \\) and \\( \log_2 n \\) — argue from branching, not a derivation?*

## Space Complexity
### Node Storage
*Why is total storage \\( \Theta(n) \\), and what extra slack do nodes carry by reserving room for a possible second key and third child?*
### Recursion and the Promotion Path
*Why does insert/delete recursion use \\( O(\log n) \\) stack depth, and what does the promoted/merged key need carried back up?*

## Implementation Walkthrough
### Node Layout
*How do you model a node that may hold one or two keys and two or three children — fixed arrays with a count, or distinct node types?*
### Search
*How does the per-node key scan pick among the two or three child links?*
### Insert with Split and Promotion
*How do you return a promoted key and a new sibling up the recursion so the parent can absorb or split in turn?*
### Delete with Borrow and Merge
*How do you detect underflow after removal and decide between borrowing from a sibling and merging?*

## Relationship to Red-Black Trees
*How is a red-black tree just a 2-3 (or 2-3-4) tree wearing a binary disguise, with 3-nodes encoded as a red child?*

## Common Pitfalls
*Where do people botch the split — losing the promoted key, mishandling the cascade, or breaking the equal-depth rule?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
