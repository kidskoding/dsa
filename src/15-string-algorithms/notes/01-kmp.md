# KMP

## The Naive-Match Problem
*Why does brute-force matching re-scan the text and degrade to \\( O(nm) \\)?*

### The Wasted Work
*After a mismatch deep in the pattern, what information does brute force throw away that KMP keeps?*

## Prefixes, Suffixes & Borders
*What is a border of a string, and why do borders capture self-overlap of the pattern?*

### Proper vs. Improper
*Why does the failure function care only about proper prefixes and suffixes?*

## The Failure / LPS Function
*What does the longest-proper-prefix-that-is-also-a-suffix value at each position encode?*

## Building the Prefix Table
*How is the \\( \pi \\) array computed in one pass over the pattern in \\( O(m) \\)?*

### Reusing Previous Values
*Why does a mismatch while building the table fall back through earlier \\( \pi \\) values?*

### The Two-Pointer Build
*How do a "length-of-current-border" pointer and a scan pointer cooperate to fill the array?*

## Matching Without Backtracking
*Why does the text pointer never move backward during the scan?*

### Shifting the Pattern on Mismatch
*How does the failure function tell you how far to slide the pattern instead of restarting?*

## Borders & Periodicity
*How do the pattern's borders reveal its smallest repeating period?*

## KMP vs. Other String Search
*How does KMP compare to Rabin–Karp, Z-algorithm, and Boyer–Moore in idea and guarantees?*

## Time Complexity
*Where does the linear bound come from across both phases?*

### Building the Table
*Why is the \\( \pi \\)-array construction \\( O(m) \\) despite the inner fallback loop?*

### Matching Phase & the Amortized Argument
*Why does an amortized argument on the text pointer bound matching at \\( O(n) \\), giving \\( O(n+m) \\) overall?*

### Why There Is No Bad Case
*Why does KMP have no input-dependent worst case unlike naive or Rabin–Karp?*

## Space Complexity
*What extra memory does KMP need beyond the strings?*

### The Prefix Table
*Why is the only auxiliary structure the \\( O(m) \\) failure array, with \\( O(1) \\) running pointers?*

## Real Uses
*Where does exact substring search show up — grep, intrusion detection, DNA motif search?*

## Pitfalls
*Why are off-by-one errors in the \\( \pi \\) array and confusing "proper" prefixes the classic bugs?*

## Implementation Walkthrough
*How do the two phases translate into code?*

### Setup & Data Structures
*What array do you allocate, and what two indices do you maintain during the build?*

### Computing the Failure Function
*How does the build loop extend the current border or fall back through \\( \pi \\) on mismatch?*

### The Matching Loop
*How does the scan advance the text pointer, use \\( \pi \\) on mismatch, and report a match at full overlap?*

### After a Full Match
*Why do you reset the pattern pointer via \\( \pi \\) instead of zero to keep finding overlapping matches?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
