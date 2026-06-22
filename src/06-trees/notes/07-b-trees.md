# B-Trees

## Why Disk and Block Storage
*How does a large branching factor minimize the number of expensive disk-block reads, and why is the cost model here "block transfers," not comparisons?*

## Order / Minimum Degree \( t \)
### Defining t
*Define \( t \) — how many keys and children may a node hold, and what is special about the root's lower bound?*
### Why Half-Full
*Why does the "at least half-full" floor exist, and what would go wrong if nodes could get arbitrarily sparse?*

## Keys and Children Layout
*With \( k \) keys, why are there exactly \( k+1 \) child pointers, and how do the keys partition the value range so each pointer covers one interval?*

## The B-Tree Invariants
*All leaves at the same depth, every non-root at least half-full, keys sorted within a node — what do these rules guarantee together about balance and node utilization?*

## Search Within and Across Nodes
*How does a key scan (linear or binary) inside one fat node combine with descending a single child pointer to reach the next block?*

## Split-on-Full Insert
### The Proactive Split
*Why split any full node you encounter on the way DOWN, before you ever need to — what problem does proactive splitting avoid on the way back up?*
### Promotion
*When a full node splits, which median key is promoted to the parent, and how do the remaining keys divide into two nodes?*

## Deletion: Borrow and Merge
### Borrowing from a Sibling
*When a node underflows but an adjacent sibling has spare keys, how does a key rotate up through the parent and another down?*
### Merging Two Nodes
*When neither sibling can spare a key, how do you fuse two nodes and pull the separator key down — and how can this shrink the height?*

## How Balance Is Maintained
*Why does growing only by splitting the root and shrinking only by merging at the root keep every leaf on exactly the same level?*

## Time Complexity
### Search
*Why is search \( O(\log_t n) \) block reads with \( O(t) \) work per node — and why do we care far more about the block-read count than the in-node scan?*
### Insert
*Why does proactive split-on-the-way-down keep insert to a single root-to-leaf pass of \( O(\log_t n) \) blocks?*
### Delete
*Why does borrow/merge also stay within \( O(\log_t n) \) blocks, even when a merge cascades upward?*
### Why a High Branching Factor Flattens the Tree (Intuition)
*If each node fans out to \( t \) children, why does height grow like \( \log_t n \) — and why does a large \( t \) make that height tiny in practice?*

## Space Complexity
### Node Storage and Fill Factor
*Why is total storage \( \Theta(n) \), and how does the half-full floor bound wasted space inside under-occupied nodes?*
### Recursion / Path Buffering
*Why does a top-down insert or delete only need \( O(\log_t n) \) nodes "in flight," and why does that matter when nodes are disk blocks?*

## Implementation Walkthrough
### Node Layout
*How do you model a node's sorted key array, child-pointer array, and key count, and how do you mark a leaf?*
### Search
*How does the in-node scan find the first key \( \ge \) the target and pick the child pointer to follow?*
### Insert with Proactive Split
*How do you split a full child before descending into it, and how do you promote the median into the current node?*
### Delete with Borrow and Merge
*How do you ensure a child has at least \( t \) keys before recursing into it, choosing borrow or merge as needed?*

## B-Tree vs B+ Tree
*Why do databases store values only in leaves and chain the leaves together — what range and scan queries does that speed up?*

## When to Use It / Common Pitfalls
*When does a B-tree beat an in-memory balanced BST, and where do node-full edge cases, the half-full rule, and off-by-one key/child counts trip you up?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
