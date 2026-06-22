# Binary Search Trees

## Why Order the Tree
*What does enforcing a sort rule on a binary tree let you do that a plain binary tree cannot?*

## The BST Ordering Invariant
### Stating the Rule
*State the left-\( < \)-node-\( < \)-right rule — does it hold only between a node and its direct children, or for entire subtrees?*
### Why It Enables Pruning
*Why does one comparison at each node let you discard a whole subtree, and what would break if the rule were only local?*

## Search
*Walk a key down the tree — at each node, what single comparison tells you to go left, go right, or stop?*

## Insert
*Why does an insert always land as a new leaf, and how do you find the parent it attaches to without breaking the invariant?*

## Delete
### Leaf and One-Child Cases
*Why are these the easy cases — what do you splice out and what do you reconnect?*
### Deleting a Node with Two Children
*Find the in-order successor — why does swapping with it preserve the invariant, and why is the successor guaranteed to have at most one child?*

## In-Order Traversal Yields Sorted Output
*Why does visiting left-node-right print keys in ascending order, and what does that imply about how a BST relates to a sorted array?*

## Successor, Predecessor, and Range Queries
*Without sorting anything, how do you find the next-larger key or list every key in \( [lo, hi] \) by pruning out-of-range subtrees?*

## Height Drives Everything
*Why does the cost of every operation ride on \( h \), and what makes \( h \) the single number that decides if a BST is fast or slow?*

## Degeneration into a Linked List
*What insertion order turns a BST into a stick, and why is that the worst case for both height and every operation?*

## Why Balance Matters
*What promise does a BST fail to keep on its own, and what do AVL/red-black trees add to rescue it?*

## Time Complexity
### Search / Insert / Delete
*Why is each one \( O(h) \), and what makes \( h \) range from \( \Theta(\log n) \) when balanced to \( \Theta(n) \) when degenerate?*
### Why Balanced Height Is Logarithmic (Intuition)
*If each level roughly doubles the node count, why does a balanced tree of \( n \) nodes only need about \( \log_2 n \) levels — no formal proof, just the doubling intuition?*
### Traversal and Range Queries
*Why is a full in-order walk \( \Theta(n) \), and why does a range query cost \( O(h + k) \) for \( k \) reported keys?*

## Space Complexity
### Node Storage
*Why is the tree \( \Theta(n) \), and what do the two child pointers (and optional parent pointer) cost per node?*
### Recursion Call Stack
*Why do recursive search/insert/delete use \( O(h) \) stack space — and why does that collapse to \( O(\log n) \) only when the tree stays balanced?*

## Implementation Walkthrough
### Node Layout
*What fields does a node hold, and do you store a parent pointer — what does each choice make easier or harder?*
### Search
*How does the comparison at each node decide the next link to follow, and where does the loop terminate?*
### Insert
*How do you descend to the correct null link and attach the new leaf there without losing the parent reference?*
### Delete and the Two-Child Case
*How do you detect which of the three delete cases applies, and how do you locate and splice the in-order successor?*

## Common Pitfalls
*Where do duplicate keys, the two-child delete, and a stale parent pointer trip people up?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
