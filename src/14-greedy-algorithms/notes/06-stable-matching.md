# Stable Matching

## The Problem & When to Use It
*Given two groups with ranked preferences, what does a "matching" pair up and why do we want stability?*

## What "Stable" Means
*What is a blocking pair, and why does its absence define a stable matching?*

## The Gale–Shapley Algorithm
*How do rounds of proposals and tentative acceptances move the matching toward stability?*

### Proposals and Tentative Engagements
*Why does a proposer go down their list in order, and when does a receiver trade up?*

### Why Receivers Only Improve
*Why can a receiver's tentative partner only get better (never worse) over time?*

## Why It Always Terminates
*Why can the proposal process never loop forever, and how many proposals can happen?*

## Why a Stable Matching Always Exists
*Why does the algorithm always end with everyone matched and no blocking pair?*

### No Blocking Pair Survives
*As a prompt — why can't a higher-preferred partner have been skipped without a proposal?*

## Proposer-Optimality
*Why does the proposing side end up with the best partner achievable in any stable matching?*

## Receiver-Pessimality
*Why is the receiving side simultaneously stuck with their worst stable partner?*

## Time Complexity
*Where does the running time go across all the proposal rounds?*

### Bounding Total Proposals
*Why can each proposer propose at most \\( n \\) times, capping proposals at \\( O(n^2) \\)?*

### Constant-Time Per Step
*What precomputed ranking tables let a receiver compare two suitors in \\( O(1) \\)?*

## Space Complexity
*What memory does the algorithm need to run efficiently?*

### Preference Lists and Rank Lookup
*Why do the preference lists cost \\( O(n^2) \\), and what inverse-rank table buys constant-time comparisons?*

### Tracking Engagements and Next-Proposal Pointers
*Why are the current-partner and next-to-propose arrays only \\( O(n) \\)?*

## Real Uses
*Where is this deployed — residency matching, school choice, organ exchange, ad allocation?*

## Pitfalls
*How do ties, incomplete preference lists, or choosing the wrong proposing side change the outcome?*

## Implementation Walkthrough
*How do the data structures and loop realize Gale–Shapley?*

### Setup: Preference Tables & Free List
*How do you store rankings, the inverse-rank lookup, and a queue of unengaged proposers?*

### The Proposal Loop
*How does each iteration pick a free proposer, propose to the next on their list, and resolve acceptance or rejection?*

### Resolving a Contested Receiver
*How does the receiver use rank lookup to keep one suitor and free the other?*

### Termination
*When is the free list empty, and how do you read off the final matching?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
