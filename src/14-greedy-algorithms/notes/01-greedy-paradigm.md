# The Greedy Paradigm

## What Greedy Is & When to Reach for It
*What kind of optimization problem makes "grab the best-looking option now" a viable strategy?*

## The Greedy Template
*What are the recurring steps — sort/prioritize, iterate, commit irrevocably — shared by every greedy algorithm?*

### Irrevocable Commitment
*Why does a greedy algorithm never reconsider a choice once made, and what does that rule out?*

## The Greedy-Choice Property
*Why must there exist an optimal solution that contains the first greedy choice for the method to work?*

### Safe Moves
*What makes a choice "safe" — provably extendable to an optimum — rather than merely attractive?*

## Optimal Substructure
*After committing one greedy choice, why must the leftover subproblem be solved the same greedy way?*

### Reducing to a Smaller Subproblem
*How does each greedy step shrink the problem to a strictly smaller instance of itself?*

## Choosing the Right Greedy Criterion
*Given several plausible "best" choices (smallest, largest, ratio, earliest), how do you tell which one is correct?*

### Testing a Criterion Against Counterexamples
*How do you stress a candidate rule with small adversarial inputs before trusting it?*

## Greedy vs. Dynamic Programming
*When does committing early throw away information that DP would have kept by exploring all options?*

## When Greedy Fails
*Sketch an instance (e.g. coin change with odd denominations) where the locally best move blocks the global optimum.*

## Proof Strategies at a Glance
*What do "exchange argument" and "greedy stays ahead" each try to show about an optimal solution?*

## Time Complexity
*Across greedy algorithms, where does the running time actually go?*

### The Sort Step Usually Dominates
*Why does an initial sort make the typical greedy \\( O(n \log n) \\), and when can a heap or counting sort change that?*

### Cost of the Greedy Pass
*Why is the commit-as-you-go scan often a single \\( O(n) \\) sweep, and what pushes it higher (e.g. a per-step heap pop)?*

### Best vs. Worst Case
*Why does greedy's runtime usually not vary with input shape the way search or DP does?*

## Space Complexity
*What does a greedy algorithm need to keep in memory beyond the input?*

### Auxiliary Structures
*When does greedy need only \\( O(1) \\) running state, and when does it carry a heap or result list of size \\( O(n) \\)?*

### In-Place vs. Extra Output
*How does choosing to mutate the input versus build a separate answer change the space bound?*

## Trade-offs vs. Alternatives
*What do you gain in speed and simplicity, and what guarantee do you give up compared to exhaustive or DP search?*

## Real Uses
*Where do greedy choices show up in scheduling, compression, routing, and resource allocation?*

## Pitfalls
*Why is "it passed my examples" never enough to trust a greedy algorithm?*

## Implementation Walkthrough
*How would you structure a generic greedy solution before writing a specific one?*

### Setup & Data Structures
*What do you sort or load into a priority queue first, and what running state do you initialize?*

### The Main Greedy Loop
*What is the single decision made each iteration, and how is feasibility checked before committing?*

### Termination
*When does the loop stop, and how do you assemble the final answer from committed choices?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
