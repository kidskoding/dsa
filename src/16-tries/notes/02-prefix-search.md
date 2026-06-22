# Prefix Search

## What Prefix Search Solves
*Why is "all keys starting with these characters" the natural query a trie is built for?*

## Walking to the Prefix Node
*How do you descend the trie to the node where a query prefix ends, and when does it fail early?*

### Early Termination
*Why can you stop and return "no matches" the moment a prefix character is missing?*

## startsWith vs. Exact Match
*Why is checking prefix existence cheaper and simpler than confirming a full stored key?*

## Subtree Enumeration
*How do you collect every key sharing a prefix by traversing the subtree below the prefix node?*

### Rebuilding Keys During Traversal
*How do you carry the accumulated characters down so each leaf yields a full word?*

### DFS vs. BFS Collection
*How does the traversal order affect the order in which completions come out?*

## Counting Keys with a Prefix
*How can a per-node passing-count answer "how many keys have this prefix" in \\( O(L) \\)?*

### Maintaining Counters on Insert/Delete
*Why must each insertion and deletion update counts all along the path?*

## Ordering the Results
*How does a trie naturally yield prefix matches in lexicographic order?*

## Time Complexity
*Why does a prefix query split into a cheap descent and an output-dependent collection?*

### Descent Cost
*Why is reaching the prefix node \\( O(L) \\) in the prefix length?*

### Output-Sensitive Enumeration
*Why does collecting matches cost in proportion to the number and length of results, not the whole trie?*

### Counting in Constant Extra Time
*Why does a stored per-node count answer "how many" in \\( O(L) \\) with no subtree walk?*

## Space Complexity
*What memory does answering a prefix query require?*

### Recursion and Result Buffer
*Why is the traversal stack \\( O(\text{depth}) \\) and the result list sized by the number of matches?*

### Cost of Per-Node Counters
*Why does adding a count field cost only a constant per node?*

## Real Uses
*Where does prefix search power features — search suggestions, command completion, contact lookup?*

## Pitfalls
*Why do an unmarked prefix node, missing counters, or huge result sets cause subtle errors?*

## Implementation Walkthrough
*How do descent, enumeration, and counting combine in code?*

### Setup: Reusing the Descent
*How do you write one helper that returns the node at the end of a prefix (or null)?*

### Collecting the Subtree
*How does a recursive collector append characters and emit a word at every end-of-word node?*

### Counting Without Enumerating
*How does returning a node's stored count short-circuit the full subtree walk?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
