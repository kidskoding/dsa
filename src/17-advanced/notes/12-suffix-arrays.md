# Suffix Arrays

## What It's For
*What problem does a suffix array solve — fast substring search and string analysis — with far less memory than a suffix tree?*

## The Core Idea: Sorted Suffix Indices
*What does \( \text{SA}[i] \) hold, and how is the array just the starting positions of all suffixes sorted lexicographically?*

## Naive Construction
*Why does sorting all suffixes directly cost so much, and where does the \( O(n^2 \log n) \) come from in the comparisons?*

## Prefix-Doubling Construction
*Trace how sorting by the first \( 2k \) characters reuses the ranks from sorting by the first \( k \), doubling the compared length each round.*

### Rank Arrays and Radix Sort
*How do (rank, next-rank) pairs let each round sort in linear time with a radix/counting sort instead of a comparison sort?*

### Why Doubling Terminates Fast
*Why are \( \lceil \log_2 n \rceil \) rounds enough for every suffix to be fully distinguished?*

## The LCP Array
*What does the longest-common-prefix array store between adjacent suffixes in SA, and why does it unlock most string queries?*

### Kasai's Linear LCP
*What's the key observation — that LCP drops by at most one as you move from the suffix at position \( p \) to position \( p+1 \) — that makes LCP construction \( O(n) \)?*

## Pattern Search via Binary Search
*Trace locating all occurrences of a pattern of length \( m \) by binary searching the sorted suffixes in \( O(m \log n) \).*

## Applications via SA + LCP
*How do you get longest repeated substring, longest common substring, distinct substring count, and range-minimum-on-LCP from these arrays?*

## Time Complexity
*Separate construction from query, and compare construction methods.*

### Construction: Naive vs Doubling vs Linear
*Why is naive \( O(n^2 \log n) \), doubling \( O(n \log n) \) (or \( O(n \log^2 n) \) with comparison sort), and what do DC3/SA-IS achieve? Name the bottleneck each method removes.*

### LCP Construction
*Why is Kasai's algorithm \( O(n) \) despite seeming to recompute prefixes — what does the "drop by at most one" invariant save?*

### Pattern Search
*Why is binary-search pattern matching \( O(m \log n) \), and how does adding LCP information cut it toward \( O(m + \log n) \)?*

## Space Complexity
*Account for every array you keep.*

### The Core Arrays
*SA, rank, and LCP are each one integer per character. Why is that \( O(n) \) total, and why is it far smaller (constant factor) than a suffix tree?*

### Construction Scratch Space
*What temporary arrays does prefix doubling or a linear constructor need, and why are they still \( O(n) \)?*

## Suffix Array vs Suffix Tree
*Why is a suffix array usually preferred in practice — memory, cache, simplicity — and what does a suffix tree still do more directly?*

## Pitfalls
*What goes wrong without a sentinel, with off-by-one in the doubling ranks, or assuming SA alone (no LCP) answers everything?*

## Implementation Walkthrough
*Plan prefix-doubling construction before writing it.*

### Initial Ranks from Characters
*How do you seed the rank array from the raw characters for \( k = 1 \)? Prompts only.*

### One Doubling Round
*What sort key (current rank, rank \( k \) ahead) do you build, how do you sort it (radix/counting), and how do you reassign ranks afterward — handling ties?*

### Building LCP with Kasai
*What order do you process suffixes in, and how do you carry the previous LCP value forward minus one? Sketch as a prompt.*

### Pattern Search Routine
*How do you binary-search SA comparing the pattern against a suffix prefix, and how do you find the full range of matches?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
