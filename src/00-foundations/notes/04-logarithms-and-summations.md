# Logarithms And Summations

## Logarithms as "How Many Times Can I Halve?"
*Give the intuition that \\( \log_2 n \\) counts halvings (or doublings) — connect it to a number's digit/bit count before any formula.*

## The Identities You Actually Use
*List the product, quotient, power, and change-of-base rules, and flag the two or three that come up constantly — which one lets you swap bases freely?*

### Change of Base in Practice
*Show how \\( \log_b n = \log_k n / \log_k b \\) turns any base into another times a constant — why does that constant disappear in Big-O?*

## Why the Log Base Doesn't Matter in Big-O
*Explain why \\( \log_2 n \\), \\( \log_{10} n \\), and \\( \ln n \\) are all \\( \Theta(\log n) \\) — what swallows the conversion constant, and when DOES the base matter (inside an exponent)?*

## Where Logs Come From in Code
*Identify the two classic sources of a log factor: repeatedly halving the input, and tree height in a balanced structure — what do they share?*

### Logs in Divide and Conquer
*Connect halving the problem size to \\( \log_2 n \\) levels of recursion — why is that the height of the recursion tree?*

### Logs from Balanced Tree Height
*Reason about why a balanced binary tree on \\( n \\) nodes has height \\( \Theta(\log n) \\) — and why an unbalanced one degrades to \\( \Theta(n) \\).*

## Summations Show Up Whenever You Loop
*Explain why analyzing a loop with varying per-iteration cost becomes a summation — give the translation from a `for` loop to \\( \sum \\).*

## Arithmetic Series
*Recall the closed form for \\( \sum_{i=1}^{n} i \\) and describe where the \\( n^2 \\) in a nested loop secretly comes from this sum.*

## Geometric Series
*Give the closed form for \\( \sum_{i=0}^{n} r^i \\) and the key insight: when \\( r \neq 1 \\), the sum is \\( \Theta \\) of its largest term — why does that make doubling/halving sums easy?*

### Increasing vs Decreasing Geometric
*Contrast a sum dominated by its last term (growing) vs its first term (shrinking) — how does this explain why "last level dominates" in some recursion trees?*

## The Harmonic Series
*Explain why \\( \sum_{i=1}^{n} 1/i \approx \ln n \\), and name an analysis (the cost of building something incrementally, or quicksort's average case) where this \\( \log \\) sneaks in.*

## Bounding Sums With Integrals
*Describe the picture: a monotone sum sandwiched between two integrals — how does this give a quick \\( \Theta \\) when no closed form is handy?*

## Telescoping Sums
*Explain when consecutive terms cancel and only the endpoints survive — try spotting it in a sum that came from a recurrence.*

## Time Complexity
*Explain why summations ARE the time-complexity calculation for loop-based code — what does \\( \sum \\) of per-iteration costs literally measure?*

### From Loop Shape to Summation
*For a nested loop where the inner bound depends on the outer index, write the summation that counts inner-body executions — what closed form does it reduce to?*

### Why a Geometric Loop Is Often \\( \Theta(n) \\), Not \\( \Theta(n\log n) \\)
*Reason about a loop whose work halves each round: why does the geometric sum collapse to a constant times the first term, keeping total work linear?*

### Why a Log Factor Appears
*Take a loop that runs \\( \log n \\) times with \\( O(n) \\) work each (or \\( n \\) times with \\( O(\log n) \\) work) — explain how the product gives \\( n\log n \\).*

## Space Complexity
*Connect logs and sums to memory: when does a structure need \\( O(\log n) \\) space and when \\( O(n) \\)?*

### Logarithmic Space from Recursion Depth
*Explain why a balanced recursive routine holds \\( O(\log n) \\) frames on the stack — tie it back to the tree-height argument.*

### Summing Allocations Across a Build
*Reason about the total memory when a structure grows in stages (e.g. doubling): why does the SUM of allocation sizes stay \\( \Theta(n) \\) rather than \\( \Theta(n\log n) \\)?*

## Putting It Together in Analysis
*Take a doubly-nested loop where the inner bound depends on the outer index, set up the summation, and describe how you'd reduce it to a clean Big-O.*

## Implementation Walkthrough
*Plan code that computes a series (e.g. partial sums of harmonic or geometric) and lets you observe its growth — sketch the parts first.*

### Setup and State
*Decide what accumulator(s) you keep and what \\( n \\) you iterate to — what type avoids overflow or precision loss?*

### The Accumulation Loop
*Work out the loop that adds each term — for a geometric series, how do you update the running term without recomputing a power each step?*

### Handling Edge Cases
*Figure out the degenerate cases (\\( r = 1 \\), \\( n = 0 \\), the harmonic divide) and why each needs special thought.*

### Verifying Against the Closed Form
*Decide how you'd compare the loop's result to the closed-form formula to confirm your derivation.*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
