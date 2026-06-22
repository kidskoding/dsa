# Asymptotic Analysis

## Why We Measure Growth, Not Wall-Clock Time
*Argue why "this loop took 3ms on my laptop" is a useless way to compare algorithms — what variables (CPU, language, input) does wall-clock confound that asymptotics removes?*

## What "Input Size" Actually Means
*Pin down \\( n \\) for different problems: array length, number of bits in an integer, vertices vs edges in a graph — how can choosing the wrong \\( n \\) make an analysis silently wrong?*

## Counting the Operations That Matter
*Pick the dominant operation in a function and explain why you count it instead of every machine instruction — what gets folded into the constant factor, and why is that safe asymptotically?*

### The Cost Model You're Assuming
*Spell out the unit-cost (RAM) model: which operations you treat as \\( O(1) \\) — arithmetic, array indexing, comparisons — and where that assumption breaks (big integers, string compares, hashing).*

## Big-O as an Upper Bound
*Describe Big-O as a "no worse than, up to a constant, for large enough \\( n \\)" promise, then connect that intuition to the \\( \exists c, n_0 \\) definition without proving anything.*

### Reading Big-O Off Real Code
*Given nested loops and sequential blocks, walk through how you'd eyeball the Big-O — what do you do with constants, lower-order terms, and a loop that runs a fixed number of times?*

### The Role of \\( c \\) and \\( n_0 \\)
*Explain what the witness constant \\( c \\) and threshold \\( n_0 \\) are doing — why is it fine that a "slower" Big-O algorithm wins for small \\( n \\)?*

## Omega and Theta: Lower and Tight Bounds
*Explain what \\( \Omega \\) promises and what makes \\( \Theta \\) a "the growth is exactly this" statement — when can you NOT give a single \\( \Theta \\) for an algorithm?*

## Little-o and Little-omega
*Contrast the strict \\( o \\) and \\( \omega \\) with \\( O \\) and \\( \Omega \\) using "strictly grows slower/faster" — how does the quantifier flip from "exists \\( c \\)" to "for all \\( c \\)"?*

## The Growth-Class Ladder
*Order \\( 1, \log n, n, n\log n, n^2, n^3, 2^n, n! \\) and describe, for each rung, what code structure lands you there.*

### How One Class Dominates the Next
*For an adjacent pair (say \\( n\log n \\) vs \\( n^2 \\)), describe the intuition for why the gap grows without bound — and roughly where the crossover sits in practice.*

## How Constants and Lower-Order Terms Vanish
*Justify why \\( 3n^2 + 100n + 7 \\) collapses to \\( n^2 \\) — at what size does the \\( n^2 \\) term dominate, and why don't we care about that crossover?*

## Combining Bounds: Sequential vs Nested Code
*State the rule for adding costs (sequential blocks) vs multiplying them (nesting), and try it on a snippet with a loop after a doubly-nested loop — which term survives?*

## The Limit and Ratio Method
*Show how \\( \lim_{n\to\infty} f(n)/g(n) \\) landing on \\( 0 \\), a positive constant, or \\( \infty \\) classifies the bound — when is this cleaner than juggling \\( c \\) and \\( n_0 \\) by hand?*

## Best, Worst, and Average Case
*For one algorithm (try linear search or quicksort), predict all three and explain what input triggers each.*

### Which Case Does Big-O Describe?
*Clear up the conflation: is Big-O the same as worst case? Explain how you can put a Big-O on the best case too.*

## Time Complexity
*Define what you're bounding when you say an algorithm is \\( O(f(n)) \\) in time — count of dominant operations as a function of \\( n \\), independent of hardware.*

### Per-Operation vs Whole-Algorithm Cost
*Distinguish the cost of one method call from running the whole algorithm — when is it more honest to report per-operation cost (e.g. for a data structure's API)?*

### Best / Average / Worst and Their Triggers
*For a chosen algorithm, name the exact input shapes that trigger each case — why does average case usually require an assumption about the input distribution?*

### Why the Bound Holds (Intuition)
*Take a doubly-nested loop and reason informally to \\( O(n^2) \\): how many times does the inner body run in total, and why does the summation come out quadratic?*

### Constant Factors That Actually Matter
*Discuss when two \\( O(n) \\) algorithms differ enough in constant factor to matter — number of passes, cache behavior — and why Big-O hides this.*

## Space Complexity
*Define space complexity as extra memory used as a function of \\( n \\) — what counts, and does the input array itself count?*

### Auxiliary Space vs Total Space
*Separate "in-place" (\\( O(1) \\) auxiliary) from algorithms that allocate \\( O(n) \\) scratch — why is auxiliary space the number people usually quote?*

### Call-Stack Space: Iterative vs Recursive
*Explain why recursion can cost \\( O(\text{depth}) \\) space with no explicit allocation — how deep is the stack for a balanced recursion vs a degenerate one, and how does converting to iteration change it?*

### Time–Space Tradeoffs
*Give the intuition that you can buy speed with memory (memo tables, hashing) or save memory by recomputing — what question decides which side to favor?*

## Common Misconceptions and Traps
*Collect classic mistakes: "Big-O means worst case", "lower Big-O is always faster in practice", reporting a loose \\( O \\) as tight, ignoring stack space — pick two and explain the fix.*

## Why This Is the Language of the Whole Course
*Explain how every later topic gets summarized in this notation — what does it let you predict about an algorithm before you ever run it?*

## Implementation Walkthrough
*Plan a tiny harness that empirically checks an asymptotic guess by operation-counting across growing \\( n \\) — sketch the shape of the code before writing it.*

### Setup and State
*Decide what you'll vary (the sizes of \\( n \\)) and what you'll record (operation count or elapsed time) — what holds the results?*

### Generating Inputs per Size
*Figure out how to build a representative input for each \\( n \\), and how to force best/worst case when you want to observe them.*

### The Measurement Loop
*Work out how to run the algorithm under test for each \\( n \\) and capture its cost — where do you reset counters, and why warm up first if timing?*

### Inferring the Growth Class
*Decide how you'd read the table of (\\( n \\), cost) pairs to guess the Big-O — what does the ratio of successive costs tell you when \\( n \\) doubles?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
