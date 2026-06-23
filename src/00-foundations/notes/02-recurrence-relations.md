# Recurrence Relations

## What a Recurrence Is and Why Recursion Needs One
*Explain why you can't just "look at" a recursive function's runtime the way you do a loop — what role does the recurrence play in describing the call structure?*

## Turning Code Into \\( T(n) \\)
*Take a recursive routine and identify the three pieces: number of subcalls, subproblem size, and the non-recursive work — how does each map into the recurrence equation?*

### Reading the Three Parameters Off Code
*For a given function, locate where \\( a \\) (branch factor), \\( b \\) (shrink factor), and \\( f(n) \\) (combine/split work) each live in the source — which is easiest to miscount?*

### Don't Forget the Base Case
*Explain why the base case matters for correctness even though it usually costs \\( O(1) \\) — when can a bad base case change the asymptotic answer?*

## The Recursion-Tree Method
*Draw the tree for \\( T(n) = 2T(n/2) + n \\): label per-node cost, count nodes per level, and describe how summing levels gives the total.*

### Per-Level Cost and Tree Height
*Reason about the two quantities that drive the total: how much work per level, and how many levels until the base case — what sets the height?*

### Where the Work Lives
*Compare a tree with constant work per level, one dominated by the root, and one dominated by the leaves — how does the "shape of the work" predict the answer?*

## The Substitution Method
*Describe the guess-then-verify-by-induction loop — what is the guess based on, and how do you check it holds for all \\( n \\)?*

### Why You Subtract a Lower-Order Term
*Explain the classic trap where an off-by-a-constant guess fails the induction, and how strengthening the hypothesis (subtracting a term) fixes it.*

## The Master Theorem: The Cheat Sheet
*State the comparison between \\( n^{\log_b a} \\) and \\( f(n) \\), and describe the three cases in words — which side "wins" in each?*

### Applying It Mechanically
*Walk through extracting \\( a \\), \\( b \\), and \\( f(n) \\), then picking the case — what's the most common extraction mistake?*

### When the Master Theorem Does NOT Apply
*List what it can't handle (non-polynomial gap, unequal subproblems, non-constant \\( a \\)) — how do you recognize each from the recurrence?*

## Common Divide-and-Conquer Recurrences
*Match \\( T(n)=2T(n/2)+n \\), \\( T(n)=2T(n/2)+1 \\), and \\( T(n)=T(n/2)+1 \\) to algorithms and answers — what does each shape "feel" like?*

## Subtract-and-Conquer Recurrences
*Contrast \\( T(n)=T(n-1)+n \\) with the divide-style ones — why does shrinking by a constant instead of a fraction blow up the cost?*

## Changing Variables to Tame a Recurrence
*Show how a substitution like \\( m = \log n \\) can turn an awkward recurrence into a familiar linear one — what's the signal this trick will help?*

## Time Complexity
*Explain how solving the recurrence yields the time bound — why is the closed form of \\( T(n) \\) exactly the time complexity you quote?*

### Reading Time Off the Tree
*Given the recursion tree, describe how total work = (work per level) × (number of levels) in the balanced case, and when that shortcut fails.*

### Best vs Worst Case via Different Recurrences
*Show how the SAME algorithm can have two recurrences (e.g. quicksort's balanced \\( T(n/2) \\) split vs degenerate \\( T(n-1) \\) split) — what input drives each?*

### Why the Bound Holds (Intuition)
*For \\( 2T(n/2)+n \\), argue informally why the \\( n \\) work repeated over \\( \log n \\) levels gives \\( n\log n \\) — no formal induction required.*

## Space Complexity
*Explain why a recurrence describes time, but the recursion ALSO costs memory — what determines that cost?*

### Call-Stack Depth
*Reason about peak stack depth from the recurrence: for \\( T(n/2) \\)-style splits the depth is \\( O(\log n) \\), for \\( T(n-1) \\) it's \\( O(n) \\) — why does the shrink factor set the depth?*

### Auxiliary Space Beyond the Stack
*Separate stack space from arrays/buffers a divide-and-conquer routine allocates per call (e.g. mergesort's merge buffer) — how do these combine into the total?*

## From Recurrence Back to Big-O
*Explain how the closed form becomes the Big-O you quote — and why mergesort's \\( \Theta(n\log n) \\) is "obvious" once you have the recurrence.*

## Implementation Walkthrough
*Plan a recursive routine (e.g. mergesort) whose runtime you can analyze with a recurrence — sketch its parts before coding.*

### Setup and State
*Decide the function signature and what bounds it receives — what's the smallest input the recursion should stop on?*

### The Base Case
*Work out the termination condition and why it must be reached on every path — what happens to \\( T(n) \\) if it's wrong?*

### The Divide and Recurse Step
*Figure out how the input is split into subproblems and how many recursive calls fire — this is the \\( a \\) and \\( b \\) of your recurrence.*

### The Combine Step
*Determine the non-recursive work done per call (the \\( f(n) \\)) and where it happens relative to the recursion — does it dominate or get dominated?*

### Tracing the Recurrence to a Bound
*Decide how you'd instrument the code (count calls, measure depth) to confirm the recurrence and bound you predicted.*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
