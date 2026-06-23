# Longest Increasing Subsequence

## What the Problem Asks
*What exactly counts as "increasing", and is the subsequence required to be contiguous? Why does that matter?*

## Recognizing the DP
*What about "longest chain of elements respecting order and a comparison" signals an ending-index DP?*

## Optimal Substructure
*Why does the best subsequence ending at \\( i \\) build on the best subsequences ending at earlier valid indices?*

## Overlapping Subproblems
*When you recurse on "best ending at \\( j \\)" for many \\( i \\), which subproblems repeat? Why does caching by index help?*

## Defining the Subproblem
*Let \\( L(i) \\) be the LIS length ending at index \\( i \\). Why anchor it at the end rather than "first \\( i \\) elements"?*

### Why a Suffix-Free State Works
*Why is "ending at \\( i \\)" enough information, with no need to remember the whole chosen prefix?*

## The \\( O(n^2) \\) Recurrence
*Write \\( L(i) \\) in terms of all earlier indices \\( j \\) with a smaller value. What do you take the max over?*

### Base Cases
*What is \\( L(i) \\) for the very first element, or any element with no valid predecessor?*

## Tabulation & Reading the Answer
*After filling \\( L \\), where is the final answer — is it \\( L(n-1) \\), or the max over all \\( L(i) \\)?*

## Patience Sorting Intuition
*How does the card-pile / "tails" metaphor model the problem and hint at a faster method?*

## The \\( O(n \log n) \\) Refinement
*Sketch the tails array: what does each entry mean, and where does binary search replace the inner loop?*

## Recovering the Subsequence
*What predecessor links (or pile indices) let you rebuild an actual LIS, in either the \\( O(n^2) \\) or \\( O(n\log n) \\) version?*

## Time Complexity
*Apply cost = states × transition. For the basic version, how many states (one per index) and how much work per state?*

### Where the Log Comes From
*In the refined version the per-state inner scan becomes a binary search — why does that turn \\( O(n^2) \\) into \\( O(n \log n) \\)?*

### Beating Exponential Brute Force
*Checking all subsequences is \\( O(2^n) \\) — how does indexing by "ending position" collapse it to polynomial?*

## Space Complexity
*Both versions use \\( O(n) \\) for the DP/tails plus predecessor links. What exactly lives in each array, and is there any rolling-array saving?*

## Variants & Related Problems
*How do longest non-decreasing, longest bitonic, box-stacking, and Russian-doll envelopes extend this?*

## Pitfalls
*Where do people slip — strict vs non-strict comparison, what the tails array does/doesn't store, broken reconstruction in the fast version?*

## Implementation Walkthrough
*Plan the code in parts before writing it.*

### State Array & Predecessor Setup
*What does each entry of the length array start at, and what does the predecessor array record?*

### The Inner Scan (or Binary Search)
*In the \\( O(n^2) \\) form, what does the inner loop compare? In the \\( O(n\log n) \\) form, what value are you searching for in tails?*

### Reading the Answer & Reconstruction
*How do you find where the optimum ends, then follow predecessor links backward to emit the subsequence?*

### Why the Fast Version's tails Isn't the Answer Itself
*The tails array length gives the LIS length but its contents are not necessarily a valid LIS — what extra bookkeeping fixes reconstruction?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
