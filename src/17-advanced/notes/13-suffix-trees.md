# Suffix Trees

## What It's For
*What does a suffix tree make instant — substring search, repeated/common substrings — that scanning the text repeatedly can't?*

## Starting Point: Trie of All Suffixes
*If you inserted every suffix into a trie, what would each root-to-leaf path spell, and why is that trie too big?*

## Path Compression into a Tree
*Why collapse every non-branching chain into a single edge, and how does that bound the node count to \( O(n) \)?*

### Why O(n) Nodes After Compression
*A compressed tree has at most \( n \) leaves and every internal node branches. Why does branching cap the internal node count below the leaf count?*

## Edge Labels as (start, end)
*How do you label each edge with a pair of indices into the original text instead of copying substrings, achieving \( O(n) \) space?*

## The Sentinel Character
*Why append a unique terminator that appears nowhere else, and what does it guarantee about every suffix ending at a distinct leaf?*

## Ukkonen's Linear Construction
*Sketch the online build — extending one character at a time, with the active point and suffix links keeping it linear.*

### Suffix Links
*What does a suffix link connect, and why does following it let the build skip redundant re-descents from the root?*

### The Extension Rules and Tricks
*What are the three extension cases, and how do "once a leaf, always a leaf" plus the global end pointer save work?*

### The Active Point
*What three values (active node, active edge, active length) track where the next extension happens, and why does maintaining them avoid restarting from the root each step?*

## Queries It Unlocks
*How do you read off substring membership, longest repeated substring, longest common substring (generalized tree), and pattern counting?*

## Time Complexity
*Reason about why the online build is linear despite looking quadratic.*

### Why Ukkonen Is O(n)
*Naively, each of \( n \) phases could do \( n \) extensions. What do suffix links, the global end pointer, and the active-point skip-count do to amortize all extensions down to \( O(n) \) total?*

### Query Costs
*Why is substring search \( O(m) \) for a pattern of length \( m \), and how do you answer longest-repeated / longest-common in time proportional to the tree size?*

## Space Complexity
*Account for nodes, edges, and links.*

### Why O(n) — and the Big Constant
*With \( O(n) \) nodes, index-pair edge labels, child maps, and suffix links, why is the total still \( O(n) \)? Why is the hidden constant factor large compared to a suffix array?*

### Child Storage Trade-off
*How does the choice between an array-per-node (fast, fat) and a hash/map-per-node (compact, slower) change the space and the alphabet dependence?*

## Suffix Tree vs Suffix Array
*Why do suffix arrays often win on memory and cache, and when is the explicit tree structure worth its heavier footprint?*

## Pitfalls
*What goes wrong forgetting the sentinel, mismanaging the active point, or storing literal substrings on edges instead of index pairs?*

## Implementation Walkthrough
*Plan Ukkonen's algorithm before writing it — it is famously tricky.*

### Node and Edge Representation
*What does a node store (children map, suffix link, edge start, and an end that may be a shared global pointer)? Prompts only.*

### The Global End and Leaf Edges
*Why do leaf edges share one "end" variable that you just increment each phase, and how does that implement "once a leaf, always a leaf"?*

### The Active Point and Skip/Count
*How do you advance the active point and use the skip/count trick to walk down long edges in \( O(1) \) amortized per character?*

### Adding Suffix Links
*When you split an edge and create an internal node, where do you point the suffix link from the previously created internal node?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
