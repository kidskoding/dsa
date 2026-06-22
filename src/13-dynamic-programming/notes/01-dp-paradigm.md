# The Dynamic Programming Paradigm

## What DP Is & When to Reach for It
*What kind of problems (optimize / count / decide feasibility) make you suspect DP rather than greedy or plain divide-and-conquer?*

## Recognizing the DP: The Telltale Signs
*Which clues — "max/min/number of ways", a small set of repeating choices at each step, an exponential brute force — flag a DP?*

### The "Last Decision" Lens
*If you focus only on the final choice in an optimal solution, what smaller problem remains? Why is that the seed of a recurrence?*

## Optimal Substructure
*How would you argue informally that an optimal whole is composed of optimal pieces? Sketch a "cut-and-paste" exchange argument in your head.*

### When Optimal Substructure Fails
*Give yourself a problem where a locally optimal piece does NOT extend to a global optimum. What property is missing?*

## Overlapping Subproblems
*What in the recursion tree tells you the same subproblem is recomputed, and how is that different from independent subproblems?*

### Counting Distinct Subproblems
*How do you bound how many genuinely different subproblems exist? Why does that number cap the useful work?*

## Defining the State
*How do you choose which variables index a subproblem so the rest of the work falls out cleanly? What makes a state "sufficient"?*

### Minimal vs Redundant State
*What happens if your state carries too much information? Too little? How do you test whether a state is exactly right?*

## Writing the Recurrence
*How do you turn "the last decision" into a transition between states? Walk every choice for one tiny worked example by hand.*

### Base Cases
*Which smallest subproblems do you answer directly, and how do you ensure they are never recomputed or mis-indexed?*

## Top-Down Memoization
*How do you take a plain recursive solution and bolt a cache onto it? What is the cache keyed by, and when do you read vs write it?*

## Bottom-Up Tabulation & Fill Order
*How do you decide the order to fill the table so every dependency is ready before you need it? What is the dependency graph here?*

### Memo vs Tabulation Trade-offs
*When is recursion-with-cache cleaner, and when does an explicit loop win on stack depth, constant factors, or space tricks?*

## Time Complexity
*State the master identity: total time = (number of distinct states) × (work per transition). Why does memoization make this an upper bound, not the naive tree size?*

### Counting States and Transition Cost
*For a generic DP, how do you read the state count off the state variables' ranges, and how do you count the work inside one transition?*

### Why It Beats Naive Recursion
*The unmemoized recursion is often exponential — where do the repeated branches come from, and how does caching collapse them to polynomial?*

## Space Complexity
*What does the full table cost in the worst case, and how does that compare to the time bound? When are they equal and when not?*

### Table Space vs Recursion-Stack Space
*Top-down adds a call stack; bottom-up does not. How deep can the stack get, and how does that add on top of table space?*

### Rolling Arrays & Dropping Dimensions
*When a state depends only on the previous "layer", how can you drop a whole dimension (2D→1D) and shrink space — and what do you give up?*

## Reconstructing the Solution
*Once you have the optimal value, how do you recover the actual choices — storing back-pointers vs replaying the recurrence over the table?*

## Common Pitfalls
*Where do DP attempts go wrong — insufficient state, missed base case, wrong fill order, off-by-one, overwriting cells still needed?*

## Implementation Walkthrough
*Plan the code in parts before writing it — what does each part have to accomplish?*

### State, Table Setup & Base Cases
*What shape is your table, what sentinel marks "unsolved/unreachable", and which cells get hard-coded base values first?*

### The Transition Loop & Fill Order
*Which loops iterate the state variables, in what order, so dependencies are always already filled when read?*

### Top-Down Memo vs Bottom-Up Form
*How would the same recurrence look as a cached recursive function vs an iterative table fill? What changes, what stays?*

### Reconstruction Pass
*After the values are computed, what second pass (or stored choices) lets you emit the actual optimal solution?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
