# Compressed Tries (Radix Trees)

## The Problem with Plain Tries
*Why do long chains of single-child nodes waste memory and pointer-chasing in a standard trie?*

## Path Compression
*Why merge each chain of single-child nodes into one edge carrying a whole substring?*

## Edge Labels as Substrings
*How does storing strings on edges instead of single characters shrink the node count?*

### Node Layout
*What does a radix node hold once edges carry substrings, and how are children keyed?*

## Searching with Substring Edges
*How does a lookup match a query against edge labels chunk by chunk?*

### Partial Edge Matches
*Why is a query that matches only part of an edge label a "not found", and how do you detect it?*

## Splitting on Insert
*Why must an edge sometimes be split into two when a new key diverges partway along it?*

### The Split Step Walked Through
*What new internal node appears, and how are the old and new suffixes reattached?*

## Deletion & Re-Merging
*Why might removing a key let you merge an edge back to keep the tree compressed?*

## Patricia Tries vs. Suffix Trees
*How do radix-tree variants relate to suffix trees and bitwise Patricia tries?*

## Time Complexity
*How does compression change the cost of operations versus a plain trie?*

### Lookup by Key Length
*Why is search still \\( O(L) \\) in key length, now counting matched characters across edges?*

### Insert with Splitting
*Why does a split add only constant extra work on top of the \\( O(L) \\) descent?*

## Space Complexity
*Why is the compressed form more memory-efficient?*

### Bounding Internal Nodes
*Why does compression cap the number of internal nodes at roughly the number of keys?*

### Edge-Label Storage
*Why does storing substrings (or start/length references into the original text) keep total space linear in the input?*

## Real Uses
*Where do radix trees run in production — IP routing (longest-prefix match), key-value stores, in-memory indexes?*

## Pitfalls
*Why are the split and merge cases the bug-prone heart of the structure, and how do partial edge matches trip you up?*

## Implementation Walkthrough
*How do compressed edges and the split case become code?*

### Setup: Edge-Labeled Nodes
*How do you represent an edge label — a string or a (start, length) slice — and key children?*

### The Search Descent
*How does the lookup consume the query against each edge label and decide match, partial, or miss?*

### The Insert & Split Case
*How does insert walk shared prefixes, and when a divergence is found, create the new branching node and reattach suffixes?*

### Delete & Merge-Back
*How does deletion remove a key and, where a node drops to one child, merge the edges to re-compress?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
