# Cache-Oblivious Algorithms

## What It's For
*What problem do these solve — getting good memory-hierarchy performance without hard-coding the cache size or block size into the algorithm?*

## Oblivious vs Cache-Aware
*What's the difference between an algorithm tuned to a known \( B \) and \( M \) and one that performs well without ever naming them?*

## The Ideal-Cache Model
*What are the model's assumptions: two memory levels, automatic block transfers, and an optimal replacement policy?*

### Why Tuning-Free Is Powerful
*Why does being optimal in this model imply good behavior across every level of a real multi-level hierarchy at once?*

### The Tall-Cache Assumption
*What does \( M = \Omega(B^2) \) assume about the cache's shape, and why do several optimal bounds quietly depend on it?*

## Recursive Divide-and-Conquer for Locality
*Why does repeatedly halving a problem until subproblems fit in cache yield good locality "for free," with no knowledge of cache size?*

### The "Free Blocking" Argument
*At some recursion level a subproblem just fits in \( M \) (and below that, in \( B \)). Why does the algorithm reach that level automatically without being told where it is?*

## The van Emde Boas Memory Layout
*How does laying out a search tree recursively (top half, then each bottom subtree contiguously) cut search I/Os, and why is the naive array-order (BFS) layout worse?*

## Cache-Oblivious Matrix Multiply
*How does recursively blocking a matrix product by quartering each matrix achieve a strong I/O bound without choosing a tile size?*

## Cache-Oblivious Sorting (Funnelsort)
*What is the high-level idea of merging through recursively built "funnels" to match the external sorting bound?*

## Time Complexity (Work)
*Separate ordinary running time from I/O cost.*

### Why Work Stays Asymptotically Normal
*Why does the recursive blocking not change the classic operation count (e.g. matrix multiply is still \( \Theta(n^3) \) work, sorting \( \Theta(n\log n) \))?*

## Cache Complexity (I/O Cost)
*This is the whole point of the model — reason about block transfers.*

### Scanning and Search Bounds
*Why is a linear scan \( O(n/B) \) I/Os, and why does the vEB-laid-out tree search cost \( O(\log_B n) \) like a B-tree despite being binary?*

### Matrix Multiply and Sorting Bounds
*State the cache-oblivious matrix-multiply I/O bound and the sorting bound, and point to where the tall-cache assumption is used.*

## Space Complexity
*Account for the recursion and any auxiliary layout.*

### Layout and Recursion Overhead
*Does the vEB layout need extra space beyond the data? How deep does the divide-and-conquer recursion stack get?*

## Trade-offs vs Cache-Aware Code
*What do you pay for portability — constant factors, recursion overhead — versus a hand-tiled cache-aware kernel?*

## Real Uses
*Where does this matter — portable numeric libraries, B-tree alternatives, code that must run well across unknown hardware?*

## Pitfalls
*Why can recursion overhead and the tall-cache assumption bite, and where does the model diverge from real caches (associativity, prefetch)?*

## Implementation Walkthrough
*Plan one concrete example — say recursive blocked matrix multiply — before writing it.*

### Choosing the Recursive Split
*How do you decide which dimension to halve at each step, and what's the base case where you switch to a direct loop?*

### Memory Layout Decisions
*For a vEB tree layout, how do you compute where each recursive sub-tree's nodes live in the flat array? Prompts only.*

### Base Case Tuning
*Why does a tiny base case hurt constant factors, and how do you pick a cutoff without making the algorithm cache-aware?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
