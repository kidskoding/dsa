# Lazy Propagation

## What It's For
*What problem does lazy propagation fix — making range updates on a segment tree logarithmic instead of touching every covered leaf?*

## The Core Idea: Defer the Work
*Why mark a node "this whole range has a pending change" and stop, rather than pushing the change all the way down right away?*

## Lazy Tags at Nodes
*What does a pending tag store, and what invariant must hold — is a node's stored aggregate already correct while its children's are not?*

### The Lazy Invariant Stated Precisely
*Write the contract: a node's aggregate reflects all updates applied to it, but a pending tag means its children have NOT yet been told. Why is this exactly what makes deferral safe?*

## Applying a Tag to a Node
*How do you fold a pending update into a node's aggregate value, and why must this account for the node's range length (e.g. range-add to a sum)?*

## Push-Down on Descent
*Trace how, before recursing past a node, you flush its tag to both children and clear it.*

### Why Push Before You Recurse
*What stale read happens if you descend into a child while a tag still sits unpushed at the parent?*

## Composing Stacked Updates
*How do two pending updates on the same node merge into one tag, and when does the order of composition matter?*

### Range Assign vs Range Add
*Contrast the tag semantics and composition rules for "set this range to v" versus "add v to this range" — why does assign overwrite while add accumulates?*

## Query Under Lazy Tags
*Why must a query also push down tags as it descends, and what happens to correctness if it reads a stale node?*

## Combining Multiple Tag Types
*How do you carry both an assign tag and an add tag at once, and what's the rule for an add arriving on top of a pending assign?*

## Time Complexity
*Reason about why deferral keeps things logarithmic.*

### Why Range Update Becomes O(log n)
*With lazy tags, a range update stops at \( O(\log n) \) canonical nodes instead of \( O(\text{range size}) \) leaves. Tie this to the same "two partial nodes per level" argument as plain queries.*

### Why Query Stays O(log n) Despite Push-Downs
*Each visited node does \( O(1) \) push-down work. Why doesn't pushing down add more than a constant factor to the \( O(\log n) \) nodes a query already visits?*

### Amortized vs Worst Case
*Is each individual operation worst-case \( O(\log n) \) here, or amortized? Why is it actually worst-case for standard add/assign tags?*

## Space Complexity
*Account for the extra per-node bookkeeping.*

### The Lazy Array
*Why does lazy propagation add a second array (one tag per node) of the same size as the tree, and what's the total relative to \( n \)?*

### Multiple Tag Types
*If you carry both assign and add tags, how does that change the per-node storage, and why is it still \( O(n) \)?*

## Real Uses
*Where do range updates appear — range increment/assign with range sum/min/max, interval painting, scheduling, difference-array-style problems?*

## Pitfalls
*What breaks if you forget to push down before recursing, mis-order tag composition, ignore range length when applying, or leave a tag uncleared after pushing?*

## Implementation Walkthrough
*Plan the lazy machinery before writing it.*

### Tag Storage and Identity
*What does the lazy array hold, and what tag value means "no pending update"? Why does the identity tag matter?*

### apply(node, tag): Folding a Tag In
*Sketch the routine that updates a node's aggregate and merges the tag into its own pending tag — what does range length feed into here? Prompts only.*

### pushDown(node): Flushing to Children
*What sequence applies the parent's tag to each child and then clears the parent's tag? Where exactly do you call this in query and update?*

### Range Update and Query with Tags
*Where in the recursion do you stop early (full cover → apply tag and return) versus push down and recurse?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
