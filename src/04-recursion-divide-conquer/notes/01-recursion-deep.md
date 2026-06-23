# Recursion Deep

## What Recursion Is & When to Reach for It
*What kind of problem is naturally "the same problem on smaller input," and when is recursion clearer than a loop?*

## Base Case and Recursive Case
*What stops the recursion, and what shrinks the problem toward that stop?*

### Why Every Path Must Reach a Base Case
*What guarantees that repeated shrinking actually lands on the base case rather than running forever?*

## The Two-Part Mental Model
*How do you separate "what the smallest case answers" from "how a bigger case builds on a smaller one"?*

### Trusting the Recursion
*Why can you assume the recursive call already works on the smaller input while you write the larger case?*

## Translating a Recursive Idea to Code
*How do you turn "solve smaller, then combine" into a method that calls itself?*

### The Recursive Leap of Faith in Practice
*Where in the method do you make the call, and where do you use its result?*

## The Call Stack and Frames
*What gets pushed on each call, and where do parameters and locals live during the call?*

### What a Single Frame Holds
*What information must a frame keep so it can resume after its recursive call returns?*

### Unwinding the Stack
*What happens to each frame's pending work as control returns up the chain?*

## Work on the Way Down vs the Way Up
*When does computation happen before the recursive call versus after it returns, and how does that change the result order?*

## Tail vs Non-Tail Recursion
*When is the recursive call the last thing a frame does, and why does that distinction matter for the stack?*

### Why Tail Calls Can Be Loop-Like
*What about a tail call means the current frame has nothing left to do, and what could an optimizer exploit?*

## Multiple and Tree Recursion
*What changes about shape and cost when one call spawns two or more recursive calls?*

### Redundant Work and Memoization
*How does caching results stop recomputing the same subproblem, and how does that collapse the cost?*

## Recursion to Iteration
*How would an explicit stack mimic what the runtime does for you automatically?*

### What You Have to Track by Hand
*Which pieces of frame state must you push manually that the language used to manage for you?*

## Time Complexity
*How do you reason about the cost from the call structure rather than deriving a recurrence?*

### Counting Calls Times Work per Call
*Why is total cost roughly the number of calls multiplied by the non-recursive work each does?*

### Linear vs Exponential Branching
*Why does single recursion tend toward linear cost while unmemoized branching can explode exponentially?*

### How Memoization Changes the Count
*Why does caching cut the cost to roughly the number of distinct subproblems?*

## Space Complexity
*Where does recursion spend memory beyond what an equivalent loop would?*

### Call-Stack Depth Dominates
*Why is the peak stack depth, not the total number of calls, the figure that drives space?*

### Depth by Recursion Shape
*Why does linear recursion cost depth proportional to n while balanced branching costs only depth proportional to its height?*

### Iterative Versions and Their Own Stack
*When you convert to a loop with an explicit stack, where does the space actually go, and is it really saved?*

## Stack Depth and Overflow
*What input depth blows past the available frames and crashes, and how do you bound or restructure it?*

## Common Bugs & Edge Cases
*What goes wrong with a missing base case, a step that doesn't shrink, off-by-one on the boundary, or shared mutable state across calls?*

## Real-World & Interview Uses
*Where do traversals, backtracking, parsing, and divide-and-conquer lean on recursion?*

## Implementation Walkthrough
*Before writing code, decide each part.*

### Signature & Setup
*What parameters carry the shrinking input and any accumulated result, and what does the caller pass first?*

### The Base Case Branch
*Which condition do you test first, and what do you return immediately without recursing?*

### The Recursive Branch
*How do you build a strictly smaller argument, make the call, and use its return value?*

### Combining Sub-Results
*Where does the work that turns the smaller answer into the bigger one belong, before or after the call?*

### Termination & Return
*What does the top-level call ultimately hand back, and how do you confirm every path returns?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
