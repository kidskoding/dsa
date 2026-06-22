# Path Compression

## What It Is & Why It Matters
*What does path compression do to the tree during a `find`, and why does flattening structure pay off on every future query rather than just the current one?*

## The Problem It Fixes
*How do long parent-pointer chains form, and why does walking them repeatedly make `find` the bottleneck of the whole structure?*

## Core Idea: Re-Point Nodes To The Root
*After a `find` discovers the root, why does it help to make every node you touched point straight at that root, and why is this safe — does re-pointing ever change which set a node belongs to?*

### The Invariant It Preserves
*Why does compression change tree shape but never tree membership, so `find` still returns the same root for every node?*

## Full Compression (Two-Pass)
*How does the classic version first walk up to find the root, then walk the path a second time rewiring each node to it — and what does that double traversal cost in code?*

## Recursive One-Liner
*How does the recursive `find` compress the path on the way back up, and what is the trade-off in stack usage for very deep trees?*

### Why Recursion Reaches The Root First
*Why must the recursive call return the root before any reassignment happens, and how does the unwinding stack do the rewiring for free?*

## Path Splitting & Path Halving
*How do these cheaper one-pass variants flatten the tree partially by re-pointing each node to its grandparent, and why are they often preferred in practice over full compression?*

### Halving vs. Splitting
*What is the difference between updating every node to its grandparent (halving) versus alternate nodes (splitting), and why do both still shorten future paths?*

## How It Reshapes The Forest
*Why do trees get dramatically flatter over a run of operations, so most nodes end up just one hop from the root, and why does that mean early expensive finds make later ones cheap?*

## Time Complexity
*Why can't you judge compression by a single operation, and why must you reason over a whole sequence of finds to see its real benefit?*

### A Single find — Worst Case
*Why can one individual `find` still cost \\( O(n) \\) the first time it traverses a long chain, even though it shortens that chain afterward?*

### Amortized Over Many Finds (Intuition Only)
*Why does each costly traversal permanently destroy the long path it walked, so the total work over many finds is far below "worst case times count" — with the precise near-constant bound deferred to the inverse-Ackermann note?*

### Compression Alone vs. With Union By Rank
*Why does compression by itself already give a strong amortized improvement, but the celebrated near-constant per-op bound needs it paired with rank/size linking?*

## Space Complexity
*Why does compression add no extra storage at all — it only rewrites existing `parent[]` entries — so space stays \\( O(n) \\)? What hidden space does the recursive variant use that the iterative one avoids?*

## Trade-offs
*Why might you pick path halving over full compression despite slightly less flattening, and when does the recursive form's call-stack depth become a real risk?*

## Pitfalls
*Where do mistakes happen — forgetting the second pass in the iterative version, accidentally compressing toward a non-root, mutating during traversal incorrectly, or stack overflow on adversarial chains?*

## Implementation Walkthrough
*Before writing code, plan the pieces below — each prompt tells you what to work out, not the answer.*

### Iterative `find` With Two Passes
*How do you find the root in one loop, then re-point every node on the path in a second loop?*

### Recursive `find` With Compression
*How does a recursive call let you both find the root and rewire each node as the stack unwinds, in a single tidy method?*

### Path-Halving One-Pass `find`
*How can a single loop re-point each node to its grandparent while still climbing to the root?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
