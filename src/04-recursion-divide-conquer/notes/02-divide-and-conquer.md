# Divide and Conquer

## What the Paradigm Is & When It Applies
*What signals that a problem can be split, solved in pieces, and merged, and when does that beat a direct approach?*

## Divide, Conquer, Combine
*What are the three phases, and which one usually dominates the cost?*

### Divide
*How do you split the input into smaller, same-shaped subproblems, and what makes a split "clean"?*

### Conquer
*How does recursion solve each piece, and where does the base case end the descent?*

### Combine
*How do you merge the sub-solutions into a full answer, and why is this often the hard part?*

## Subproblem Independence
*Why must the pieces not overlap for this paradigm, rather than dynamic programming, to fit?*

### Contrast with Overlapping Subproblems
*What does it look like when subproblems repeat, and why does that push you toward memoization instead?*

## The Mental Model
*How do you picture the recursion as a tree, with the original problem at the root and base cases at the leaves?*

### Where Work Happens in the Tree
*At which nodes does the divide cost land, and at which does the combine cost land?*

## Mapping the Structure to Code
*How does the divide/conquer/combine shape become a recursive method skeleton?*

### The Base Case First
*Why do you test for the smallest solvable size before attempting to split?*

## A Worked Example: Merge Sort
*How do split-in-half, sort-each, and merge realize each phase?*

### The Merge Step
*How do two sorted halves combine into one sorted whole in a single linear pass?*

### Why Merge Sort Is Stable and Predictable
*What about the merge keeps equal elements in order and avoids a bad worst case?*

## Another Lens: Binary Search
*How is halving the search space a degenerate divide-and-conquer with one recursive call and no combine?*

## Where the Cost Comes From
*Which dominates: the splitting, the recursive calls, or the combining, and how does that decide the total?*

## Time Complexity
*How do you reason about the running time without formally solving a recurrence?*

### Counting Work per Level
*Why is the total often "work per level times number of levels," and what sets each factor?*

### When Combine Is the Bottleneck
*Why does a linear combine over logarithmically many levels give the classic n log n shape?*

### When Branching Is the Bottleneck
*Why can many subproblems per level make the leaf count, not the combine, dominate the cost?*

### Best, Average, and Worst Triggers
*What kinds of splits keep the balanced bound, and what unbalanced split degrades it?*

## Space Complexity
*Where does divide-and-conquer spend memory, and how much?*

### Recursion-Stack Depth
*Why does the depth of the recursion tree, not its total node count, set the stack space?*

### Auxiliary Buffers in Combine
*Why does a step like merge need scratch space, and how big is it relative to the input?*

### In-Place vs Out-of-Place Variants
*What do you trade in code complexity to shrink the auxiliary space toward constant?*

## Trade-offs vs Alternatives
*When does divide-and-conquer beat a straightforward linear scan or a DP table, and when is its overhead not worth it?*

## Common Bugs & Edge Cases
*What breaks on uneven splits, a wrong or missing base case, an off-by-one in the midpoint, or a combine that mishandles leftovers?*

## Real-World & Interview Uses
*Where do sorting, search, closest-pair, fast multiplication, and parallelizable work use this paradigm?*

## Implementation Walkthrough
*Before writing code, decide each part.*

### Signature & Setup
*What bounds or sub-ranges does the recursive method take, and what does the top-level caller pass?*

### The Base Case Branch
*Which smallest size do you solve directly, and what do you return without recursing?*

### The Divide Step
*How do you compute the split point and form the sub-ranges without losing or duplicating elements?*

### The Recursive Calls
*In what order do you solve the sub-ranges, and where do you store their results?*

### The Combine Step
*How do you walk the sub-results together, and where does any scratch buffer live?*

### Termination & Return
*What does the top-level call hand back, and how do you confirm every element is accounted for?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
