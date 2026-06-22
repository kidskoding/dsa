# Autocomplete

## The Problem & When to Use a Trie
*What does autocomplete need beyond plain prefix search to feel useful?*

## From Prefix Node to Candidates
*How does locating the prefix node set up the search for completions to suggest?*

## Ranking by Frequency or Weight
*How do you decide which completions matter most when many share the prefix?*

### Storing Weights in the Trie
*Where do popularity scores live, and how are they updated as usage changes?*

## Top-k Retrieval
*How does a bounded heap surface the best \( k \) completions without sorting everything?*

### Heap vs. Full Sort
*Why is a size-\( k \) heap over candidates cheaper than collecting and sorting them all?*

## Precomputation vs. On-Demand
*When should each node cache its top suggestions versus computing them per query?*

### Caching Top Suggestions Per Node
*What's the memory-versus-latency tradeoff of storing precomputed top-k at every node?*

## Handling Typos & Fuzzy Matches
*How might edit-distance tolerance extend strict prefix matching, and what does it cost?*

## Latency & Scale Trade-offs
*What constraints — keystroke latency, dataset size, freshness — shape a production system?*

## Time Complexity
*Where does a single autocomplete query spend its time?*

### Descent Plus Candidate Gathering
*Why is reaching the prefix node \( O(L) \), and what makes gathering candidates depend on subtree size?*

### Top-k Selection
*Why does maintaining a size-\( k \) heap add a \( \log k \) factor per candidate, and how does caching drop this to \( O(k) \)?*

## Space Complexity
*What memory does ranked autocomplete cost?*

### Weights and the Trie
*Why does storing a weight per node add only a constant per node over a plain trie?*

### Precomputed Top-k Caches
*Why does caching \( k \) suggestions at every node multiply space by \( k \), and when is that worth it?*

## Real Uses
*Where do you see this — search bars, IDEs, messaging apps, command palettes?*

## Pitfalls
*Why do stale caches, ignoring frequency, and unbounded result sets degrade the experience?*

## Implementation Walkthrough
*How do ranking and retrieval fit together in code?*

### Setup: Weighted Nodes
*How do you extend the trie node to carry a frequency or score, updated on insert?*

### Gathering Candidates Below the Prefix
*How does the traversal collect (word, weight) pairs from the prefix subtree?*

### Selecting the Top k
*How does a min-heap of size \( k \) keep only the best completions as you stream candidates?*

### Optional: Reading a Cached Top-k
*How would a per-node cache let you skip the subtree walk entirely?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
