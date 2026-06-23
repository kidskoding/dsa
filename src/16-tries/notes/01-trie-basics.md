# Trie Basics

## What a Trie Is & When to Use It
*What kind of keys make a character-by-character tree beat a hash map or balanced BST?*

## Node & Edge Structure
*How do characters label edges, and what does a single node actually represent?*

### Node Layout
*What does each node hold — children references, an end-of-word flag, maybe a counter?*

### The Root and Empty String
*Why does the root correspond to the empty prefix, and what does a path from it spell?*

## End-of-Word Markers
*Why is a boolean flag needed to tell a stored key apart from a mere prefix of one?*

## Insert
*How does inserting a key walk down, creating missing child nodes along the path in \\( O(L) \\)?*

### Creating Nodes Lazily
*Why do you only allocate a child the first time a character is seen on that path?*

## Search
*How does exact lookup differ from just reaching the last character's node?*

## Delete
*Why is deletion the tricky operation, and when can you prune nodes versus only clearing a flag?*

### Pruning Safely
*Why can a node only be removed when it has no children and isn't another key's endpoint?*

## Alphabet & Fan-Out Choices
*How does fixed-size array children trade speed for space against a hash-map of children?*

## Space vs. Hash Tables
*How does shared-prefix storage save or waste memory compared to a flat dictionary?*

## Time Complexity
*Why are the core operations independent of how many keys are stored?*

### Insert, Search, Delete by Key Length
*Why are all three \\( O(L) \\) in the key's length, not \\( O(\log n) \\) in the number of keys?*

### The Alphabet Constant
*Why does an array-of-children give \\( O(1) \\) child access while a map adds a hashing constant?*

## Space Complexity
*Where does a trie's memory actually go?*

### Node Count vs. Total Characters
*Why is the worst-case node count proportional to the total length of all inserted keys?*

### Array vs. Map Children
*Why does a fixed array of size \\( \Sigma \\) per node blow up space on sparse alphabets, and how does a map fix it?*

## Real Uses
*Where do tries appear — spell-checkers, IP routing tables, autocomplete, dictionary lookups?*

## Pitfalls
*Why do forgetting the end-of-word flag, sparse-array memory blowup, and unicode alphabets bite you?*

## Implementation Walkthrough
*How do the operations become code around one node type?*

### Setup: The Node Type
*What fields does your node class need, and how is the root initialized?*

### The Insert Loop
*How does the loop walk character by character, creating children, and mark the end?*

### Search and startsWith
*How do the two lookups share the descent code but differ at the final node?*

### Recursive Delete
*How does a recursive delete clear the flag at the leaf and prune empty nodes on the way back up?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
