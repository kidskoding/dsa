# Hamiltonian Paths & Cycles

## What They Are & When to Use Them
*What does visiting every vertex exactly once model — TSP, sequencing, puzzle solving?*

## Visit-Every-Vertex-Once Constraint
*What exactly distinguishes a Hamiltonian path from an Euler path, vertices vs. edges?*

## The Key Idea: Why No Local Rule Decides It
*Why does the absence of a simple degree-style condition force you into search rather than a quick test?*

## Why It's Hard (NP-Completeness)
*Why is deciding existence believed to have no polynomial algorithm, and what does that mean practically?*

## Backtracking Search
*How does a depth-first search over candidate orderings extend, test, and undo a partial path?*

### The Recursion State
*What does each level of the backtracking recursion carry — current vertex, visited set, path so far?*

### Pruning the Search
*What checks — degree limits, dead-end detection, connectivity — cut branches early?*

## Bitmask DP (Held-Karp)
*How does a state over (visited set, current vertex) beat naive permutation enumeration?*

### Encoding the Visited Set
*How does an integer bitmask represent which vertices are used, and how do you transition states?*

### Filling the DP Table
*In what order over subsets do you compute states so each depends only on already-solved ones?*

## Sufficient Conditions (Ore / Dirac)
*Which degree thresholds guarantee a Hamiltonian cycle exists without searching for one?*

## Path vs. Cycle Variants
*How does requiring a return to the start change the search and the existence conditions?*

## Trade-offs & When to Pick Each
*Tiny `n` with Held-Karp, moderate `n` with pruned backtracking, heuristics for large `n` — how do you choose?*

## Time Complexity
*Reason about why every exact method is exponential.*

### Brute Force Over Permutations
*Why does trying every ordering cost `O(n! \cdot n)`, and how fast does that explode?*

### Backtracking's Pruned but Still Exponential Cost
*Why does pruning help in practice yet leave the worst case exponential?*

### Held-Karp's `O(2^n \cdot n^2)`
*Why does the bitmask DP's `2^n` subsets times `n^2` transitions beat `n!` while staying exponential?*

## Space Complexity
*Account for every structure each method keeps.*

### Backtracking: Path + Visited + Recursion Stack
*Why is backtracking's memory only `O(n)` despite its exponential time?*

### Held-Karp's `O(2^n \cdot n)` Table
*Why does storing a value for every (subset, endpoint) pair dominate the DP's memory?*

## Real Uses & Pitfalls
*Where it appears (routing, scheduling) and what trips you — exponential blowup, forgetting the cycle-close edge, weak pruning.*

## Implementation Walkthrough
*Break the algorithm into parts before coding — what does each part own?*

### Representing the Partial Path & Visited Set
*What structures track which vertices are used and the order chosen so far?*

### The Extend / Recurse / Undo Cycle
*How does each step try a next vertex, recurse, and then roll back its choice on failure?*

### Pruning Hooks
*Where in the recursion do you insert early-exit checks to cut dead branches?*

### The DP Alternative: Iterating Subsets and Endpoints
*If you build Held-Karp instead, how do you loop over masks and current vertices to fill the table?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
