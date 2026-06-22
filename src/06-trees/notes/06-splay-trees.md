# Splay Trees

## Why Self-Adjusting
*What does a splay tree optimize for that a balanced BST ignores — and why give up a strict height bound to get it?*

## Splaying: Move-to-Root
*What does it mean to splay a node, and why bring the most-recently-touched key all the way to the top?*

## Zig, Zig-Zig, and Zig-Zag
### Zig (Node Is a Child of the Root)
*Why is this the base case, and when is it the very last step of a splay?*
### Zig-Zig (Same-Side Grandchild)
*Why rotate the grandparent first — what makes this different from two plain zigs, and why does it shorten the access path more aggressively?*
### Zig-Zag (Opposite-Side Grandchild)
*Why does this collapse like an AVL double rotation instead?*

## Why Splaying Rebalances (Intuition)
*Why does pulling a deep node to the root roughly halve the depth of everything along its access path — what does that do to a long, skinny branch over repeated accesses?*

## Splay on Every Access
*Why do search, insert, and delete all end by splaying — even a plain lookup, and even a failed one?*

## Insert and Delete via Splaying
*How does splaying a key to the root turn insert into a split and delete into a join of the two resulting subtrees?*

## Amortized Analysis
### What the Amortized Claim Promises
*State what "amortized \( O(\log n) \)" guarantees — why is the average over a sequence good even when one operation isn't?*
### The Potential Idea (Intuition)
*Without grinding the algebra, why does an expensive deep access "pay" by flattening the tree and lowering future costs?*

## No Strict Height Bound
*A single operation can be \( O(n) \) on a degenerate shape — why is that acceptable here, and when is it NOT acceptable?*

## Self-Adjusting and Locality
*How does splaying exploit temporal locality and the working-set of recently accessed keys, and why can it beat a balanced tree on skewed access patterns?*

## Time Complexity
### Per-Operation Worst Case
*Why can a single search/insert/delete cost \( O(n) \), and what shape causes it?*
### Amortized Cost
*Why is every operation \( O(\log n) \) amortized over a sequence, so \( m \) operations cost \( O(m \log n) \)?*
### Access-Pattern Sensitivity
*Why does a tree accessed with strong locality beat the \( \log n \) average, approaching \( O(1) \) for a tiny working set?*

## Space Complexity
### Node Storage
*Why is the tree \( \Theta(n) \), and why does a splay tree need NO stored height, balance factor, or color?*
### Recursion / Stack Depth
*Why can recursive splaying use \( O(n) \) stack space in the worst case, and how does an iterative bottom-up or top-down splay avoid that?*

## Implementation Walkthrough
### Node Layout
*What minimal fields does a splay node need, and what metadata can you deliberately leave out?*
### The Splay Routine
*How do you detect zig vs zig-zig vs zig-zag from the node, its parent, and grandparent, and apply the right rotation pair?*
### Search via Splay
*Why does search descend to the node (or its last-touched ancestor on a miss) and then splay it to the root?*
### Insert and Delete via Split / Join
*How do you splay to expose the root, then split off or join the subtrees to finish the operation?*

## vs AVL and Red-Black Trees
*No stored heights or colors and no worst-case guarantee — when does that simplicity and adaptivity win, and when does it lose?*

## Common Pitfalls
*Where do people stumble — choosing the wrong zig case, forgetting to splay on a failed search, or blowing the recursion depth?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
