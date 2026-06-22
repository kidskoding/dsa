# Monotonic Stack

## What It Is & When to Use It
*What class of problems — "for each element, find the nearest larger or smaller one" — collapses from \\( O(n^2) \\) to \\( O(n) \\) once you keep a stack in sorted order, and what signals that a problem is secretly a monotonic-stack problem?*

## How the Ordered Stack Works
*As you scan the array, what does the stack hold at any moment, and why does keeping it strictly ordered let each new element instantly "answer" the elements it displaces?*

### The Mental Model of a Staircase
*How do you picture the stack as a rising or falling staircase, and what does it mean physically when an incoming element knocks several steps off the top before settling?*

## The Push-While-Pop Invariant
*Before pushing the new element, why do you pop everything that violates the order, and what stays true about the remaining stack after every step?*

### Increasing vs. Decreasing
*How does the direction of monotonicity decide whether you are answering "next greater" versus "next smaller," and how do left-to-right versus right-to-left scans change which neighbor (next vs. previous) you recover?*

### Storing Indices vs. Values
*Why is it usually better to push indices rather than raw values, and what extra information (distance, span, width) does an index give you that a bare value cannot?*

## The Next Greater / Next Smaller Pattern
*When you finally pop an element, why is the element currently being processed exactly its answer — and what do the indices left on the stack at the end (never popped) tell you about elements that have no greater or smaller neighbor?*

### Strict vs. Non-Strict Comparison on Ties
*How does choosing `<` versus `<=` when popping decide whether equal elements count as "greater-or-equal" neighbors, and why must this match the problem's definition exactly?*

## Span & Histogram Applications
*How do "stock span" and "daily temperatures" reduce to a previous/next comparison, and in the Largest Rectangle in a Histogram, why does the moment you pop a bar reveal the widest rectangle that bar can be the minimum of?*

### Sentinels
*Why does pushing a zero-height bar at the end (and/or a boundary at the start) flush the stack cleanly and remove an annoying "drain the leftovers" edge case?*

## Time Complexity
*Why is the whole scan \\( O(n) \\) even though a single incoming element can trigger many pops in one step?*

### Best Case
*When does the stack barely move — an already-monotonic input — and why is the per-element work still just a push and one comparison?*

### Worst & Average Case
*Each index is pushed exactly once and popped at most once — why does that cap the total number of pops across the entire run at \\( n \\), making the amortized cost per element \\( O(1) \\) and the whole algorithm \\( \Theta(n) \\)?*

## Space Complexity
*Why is the extra space \\( O(n) \\) in the worst case (a fully monotonic input that never pops), and what input shape forces the stack to hold every element at once?*

## Trade-offs vs. Brute Force & Other Structures
*When is the naive \\( O(n^2) \\) double loop actually fine, and when would a different structure (segment tree, sparse table) be preferred over a monotonic stack?*

## Common Bugs & Edge Cases
*Where do bugs creep in — wrong strict-vs-nonstrict comparison on ties, pushing values instead of indices, forgetting to drain the stack at the end, or mishandling an empty or single-element array?*

## Implementation Walkthrough
*Break the technique into the parts you must get right before you write a line.*

### Setup
*What do you initialize the stack and the answer array to, and how do you represent "no neighbor found"?*

### The Scan Loop
*As you iterate, what is the pop condition that compares the incoming element to the stack top, and after popping, what do you record and then push?*

### The Tricky Step
*At the instant you pop, how do you use both the popped index and the current index (and the new top) to compute the answer — the distance, the width, or the neighbor?*

### Termination & Draining
*When the scan ends, what do leftover stack entries mean, and how do sentinels or a final pass assign their answers?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
