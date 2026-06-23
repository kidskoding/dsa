# The Exchange Argument

## What an Exchange Argument Proves
*What claim about a greedy solution are you actually trying to establish with this technique?*

## The Core Idea: Transform Without Losing
*Why does nudging an optimal solution toward the greedy choice never make it worse?*

## Setting Up the Two Solutions
*How do you name the greedy solution and an arbitrary optimal one so you can compare them step by step?*

### Why "Arbitrary Optimal" Matters
*Why must the optimal you start from be unconstrained rather than a convenient special case?*

## Finding the First Difference
*Where do you locate the earliest place the optimal solution diverges from greedy, and why there?*

### Ordering the Choices
*Why does the argument depend on a consistent order (by finish time, ratio, weight) to define "first"?*

## The Swap Step
*How does exchanging the optimal's choice for the greedy's choice at that point preserve feasibility?*

### Showing the Swap Doesn't Hurt the Objective
*Why is the cost/value after the swap no worse than before?*

### Preserving Feasibility After the Swap
*Why must you re-check that the swapped-in element still satisfies every constraint?*

## Inductively Converting Optimal Into Greedy
*How do repeated swaps turn any optimal solution into the greedy one without losing optimality?*

### Why the Process Terminates
*Why does each swap reduce the number of differences, forcing the argument to end?*

## Exchange vs. Greedy-Stays-Ahead
*When is it easier to argue a running invariant than to argue a swap, and vice versa?*

## Worked Intuition: Why Earliest-Finish Wins
*As a prompt — how would a swap show that picking the earliest-finishing activity is safe?*

## Worked Intuition: Why Highest-Ratio Wins
*As a prompt — how would a swap move weight from a low-ratio item to a high-ratio one without losing value?*

## Common Mistakes in Exchange Proofs
*Why does forgetting to check feasibility after the swap, or assuming a unique optimum, break the argument?*

## Cost of an Argument vs. Cost of the Algorithm
*Why is the exchange argument about correctness rather than runtime, and how does it still dictate what the code must compute?*

## Pitfalls
*What goes wrong if the "first difference" you pick isn't well-defined or the swap changes the rest of the solution?*

## Implementation Walkthrough
*How would you turn an exchange-justified greedy into code that mirrors the proof's ordering?*

### Encoding the Ordering as a Comparator
*How does the sort key you choose correspond directly to the "first difference" in the proof?*

### The Commit Loop the Proof Justifies
*Why does each loop iteration correspond to one safe choice the exchange argument blessed?*

### Verifying on Small Cases
*How do you use tiny inputs to sanity-check that your comparator matches the proven safe move?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
