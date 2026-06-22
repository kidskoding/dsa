# Linear Search

## What It Is & When to Use It
*What problem does linear search solve, and in what situations is it the only option you have?*

## The Sequential Scan Mental Model
*How do you picture walking a collection element by element, and what single piece of state do you carry as you go?*

### The Loop Invariant
*What is guaranteed about every element you've already passed at the moment you inspect index \( i \)?*

### Why Order Doesn't Matter
*Why does this work on unsorted data when binary search cannot, and what freedom does that give you?*

## The Comparison at the Core
*What does it mean to "match" an element — reference equality, value equality, or a predicate — and how does that choice change the code?*

## Iterative Coding
*What does the basic loop look like, and where do you place the equality check and the early return?*

### Returning First vs Last Match
*If duplicates exist, how do you control which occurrence you report, and what loop direction does each need?*

## Sentinel Optimization
*How can placing the target at the end as a sentinel remove the bounds check from the inner loop?*

### Why the Sentinel Helps
*What hidden per-iteration cost does the bounds check carry, and what must you restore afterward?*

## The Found vs Not-Found Contract
*What should you return when the target is absent — an index, a boolean, or \( -1 \) — and why does the caller care?*

## Time Complexity
*What is the cost model — how many comparisons does linear search perform as a function of \( n \)?*

### Best Case
*What input makes it finish in \( O(1) \), and where must the target sit for that to happen?*

### Average Case
*If the target is equally likely at any position, where does a random hit land on average, and why is that still \( \Theta(n) \)?*

### Worst Case
*Which two situations both force a full \( n \)-element scan, and why?*

### Constant Factors
*Why can a plain linear scan beat a fancier algorithm on small \( n \) despite the same or worse big-O?*

## Space Complexity
*Why is linear search \( O(1) \) auxiliary space, and what would you have to add to change that?*

## Trade-offs vs Binary Search & Hashing
*When is an \( O(n) \) scan actually the right call over an \( O(\log n) \) or \( O(1) \) lookup, once you count setup cost?*

## Common Bugs & Edge Cases
*What goes wrong with empty inputs, off-by-one loop bounds, or comparing objects with `==` instead of `.equals`?*

## Real-World Uses
*Where do small lists, linked structures, or one-shot scans make linear search the practical choice?*

## Implementation Walkthrough
*Break the algorithm into the parts you must get right before you write a line.*

### Setup
*What inputs and return-type decision do you fix before the loop starts?*

### The Scan Loop
*How do you structure the single pass, and what exactly is compared each iteration?*

### Termination & Return
*What are the two ways the loop can end, and what value does each path return?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
