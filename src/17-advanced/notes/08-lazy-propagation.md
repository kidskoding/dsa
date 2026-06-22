# Lazy Propagation

## The Deferred-Update Idea
*Why postpone applying a range update instead of touching every leaf?*

## Lazy Tags at Nodes
*What does a pending tag store, and what invariant must hold about an unpushed node's value?*

## Push-Down on Descent
*Trace how a tag flows to children before you recurse past a node.*

## Composing Multiple Pending Updates
*How do two stacked updates merge into one tag? When is order significant?*

## Range Assign vs Range Add
*Contrast tag semantics and composition rules for assignment versus increment.*

## Why Amortized \\( O(\log n) \\) Holds
*Argue the cost stays logarithmic despite deferred work.*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
