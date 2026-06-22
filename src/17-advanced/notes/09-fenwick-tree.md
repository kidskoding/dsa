# Fenwick Tree (Binary Indexed Tree)

## Low-Bit Trick \\( i \mathbin{\&} -i \\)
*Sketch what the lowest set bit isolates and which range of elements an index is responsible for.*

## Prefix Sum Query
*Trace how you walk down by stripping the low bit to accumulate \\( \text{sum}(1..i) \\).*

## Point Update
*Trace how you walk up by adding the low bit to touch every responsible node.*

## Range Query via Prefix Differences
*How do you turn \\( \text{sum}(l..r) \\) into two prefix queries? When does this fail?*

## 1-Indexing Convention
*Why is the tree built 1-indexed, and what goes wrong at index 0?*

## Why \\( O(\log n) \\)
*Argue how many bits flip per traversal and bound the path length.*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
