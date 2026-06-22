# Red-Black Trees

## Why Approximate Balance
*Why settle for "roughly balanced" instead of AVL's strictness — what does looser balance buy on inserts and deletes?*

## The Five Properties
### Listing the Rules
*List all five color rules — which one bans two reds in a row and which one fixes the path lengths?*
### What Each Rule Is For
*Map each property to the harm it prevents — which keep the tree from leaning, and which anchor the root and leaves?*

## Black-Height
*Define the black-height of a node — why must it be the same down every path, and how is it the quantity that actually controls balance?*

## Why the Tree Stays Balanced (Intuition)
*With equal black-heights on every path and no two reds in a row, why can the longest root-to-leaf path be at most twice the shortest — argue from the rules, no formal bound?*

## Search (Color-Blind)
*Why does lookup ignore colors entirely and run exactly like a BST search?*

## Recoloring vs Rotation
*When does flipping colors suffice to restore the rules, and when must you actually restructure the tree with a rotation?*

## Insertion Fix-Up Cases
### Why Insert Red
*Why is a new node always colored red, and which single property is the only one a red insert can violate?*
### Red Uncle (Recolor and Recurse)
*Why does a red uncle let you just repaint and push the problem up two levels?*
### Black Uncle (Rotate and Recolor)
*Why do the triangle (zig-zag) and line (zig-zig) sub-cases each need a rotation to settle the double-red?*

## Deletion and the Double-Black
### Where the Extra Black Comes From
*When you remove a black node, why does a "double-black" token appear, and what rule is it standing in for?*
### Pushing It Away
*What are the sibling-color cases, and how does each one either borrow a black, recolor, or rotate the double-black out of existence?*

## How Balance Is Maintained
*Why does keeping black-heights equal while limiting reds keep the structure within the 2x path bound through every insert and delete?*

## Time Complexity
### Search / Insert / Delete
*Why are all three \( O(\log n) \) given the bounded height, and why does the 2x-path bound still leave height logarithmic?*
### Cost of Fix-Up
*Why does insert do at most two rotations and delete at most three, regardless of \( n \) — and why is the recoloring chain still \( O(\log n) \) but cheap?*
### vs AVL Rebalancing
*Why does red-black's looser balance mean fewer rotations per update, and where does that matter?*

## Space Complexity
### Node Storage and the Color Bit
*Why is the tree \( \Theta(n) \), and why is the per-node color just a single bit?*
### Recursion / Parent Pointers and the Sentinel
*Why do iterative implementations keep parent pointers, and how does the single shared nil sentinel save space and simplify the cases?*

## Implementation Walkthrough
### Node Layout and the Nil Sentinel
*What fields does a node need, and how does one shared black nil node remove special-casing for null children?*
### Search
*Why is this plain BST search, ignoring color entirely?*
### Insert and Fix-Up
*After a BST-style red insert, how does the fix-up loop classify by the uncle's color and apply recolor-or-rotate until the root?*
### Delete and Fix-Up
*How do you track the replacing node's original color and run the double-black resolution loop when a black node leaves?*
### Rotation Helpers
*How do left/right rotations update parent links and the sentinel correctly so the fix-up cases compose cleanly?*

## vs AVL and 2-3-4 Trees
*Why do libraries (TreeMap, std::map) favor red-black over AVL — and how does it mirror a 2-3-4 tree node-for-node?*

## Common Pitfalls
*Where do the sentinel nil node, the root-stays-black rule, and case mislabeling cause bugs?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
