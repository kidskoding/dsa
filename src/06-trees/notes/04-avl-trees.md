# AVL Trees

## Why Self-Balancing
*What failure mode of a plain BST does AVL exist to prevent, and what price does it pay for the guarantee?*

## Balance Factor Invariant
### Defining the Balance Factor
*Define \\( bf = h_{left} - h_{right} \\) — which values are legal at every node?*
### Why ±1 Is Enough
*Why does capping every node's imbalance at one keep the whole tree's height close to \\( \log n \\) — argue from how much two near-equal subtrees can differ?*

## Search (Same as BST)
*Why does lookup borrow the BST algorithm unchanged, and what does the maintained balance buy the search?*

## Insert then Rebalance
*Walking back up from the inserted leaf, when does the first violated ancestor trigger a fix, and why does fixing that one node suffice for insertion?*

## Delete then Rebalance
*Why might a single deletion force rotations at multiple levels, unlike insertion where one rotation ends it?*

## The Four Rotation Cases
### LL and RR (Single Rotations)
*When the imbalance is "straight" (heavy outer grandchild), why does one rotation in the opposite direction fix it?*
### LR and RL (Double Rotations)
*When the imbalance is "bent" (heavy inner grandchild), why must you first straighten the child before the outer rotation?*
### Recognizing the Case
*From the balance factors of the unbalanced node and its taller child, how do you read off which of the four cases you're in?*

## Rotation Mechanics
*Walk the pointer surgery of a single rotation — which three links move, who becomes the new subtree root, and how does the parent get reattached?*

## Tracking Heights Without Recomputing
*How do you keep stored heights correct after a rotation in \\( O(1) \\) using only the children's heights?*

## How Balance Is Maintained
*Why does fixing the lowest unbalanced node restore the balance factor for the whole path above it on insert?*

## Time Complexity
### Search / Insert / Delete
*Why are all three \\( O(\log n) \\) in the worst case — what does the maintained balance guarantee about \\( h \\) that a plain BST cannot?*
### Cost of Rebalancing
*Why is each rotation \\( O(1) \\), and why does insert do at most one rotation while delete may do up to \\( O(\log n) \\)?*
### Why Height Stays Logarithmic (Intuition)
*Given the ±1 rule, why can't an AVL tree of height \\( h \\) be "sparse" — intuitively, why does each extra level force a near-doubling of nodes?*

## Space Complexity
### Node Storage and the Height Field
*Why is the tree \\( \Theta(n) \\), and what does the per-node stored height (or balance factor) add?*
### Recursion Call Stack
*Why does recursive insert/delete use \\( O(\log n) \\) stack space, and why is that bounded here when it isn't for a plain BST?*

## Implementation Walkthrough
### Node Layout
*What fields beyond key and children does an AVL node need, and how do you compute height from null-safe child heights?*
### Search
*Why is this identical to BST search, and where do you NOT touch heights?*
### Insert and Rebalance
*After the recursive insert returns, how do you update height, compute the balance factor, and dispatch to the correct rotation?*
### Delete and Rebalance
*Why must you keep checking balance at every ancestor on the way up after a delete, not stop at the first fix?*
### The Rotation Helpers
*How do you write a single left/right rotation so that height updates and parent relinking happen in the right order?*

## vs Red-Black Trees
*AVL is more rigidly balanced — when does that help read-heavy workloads and when does it cost you on write-heavy ones?*

## Common Bugs
*Where do people slip — stale heights, the wrong rotation case, or forgetting to reattach the parent link?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
