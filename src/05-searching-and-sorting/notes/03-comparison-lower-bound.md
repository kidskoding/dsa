# Comparison Lower Bound

## What a Comparison Sort Is
*Which sorts only ever learn about elements by comparing pairs, and which ones don't?*

### The Comparison-Only Rule
*Why does "no peeking at the key's value, only `<`/`>` results" define this whole class of algorithms?*

## The Core Claim
*What is the headline result — why can no comparison sort beat \\( n \log n \\) in the worst case?*

## The Intuition Behind the Bound
*Conceptually, why does the number of possible orderings force a minimum amount of work? (idea only, no formal proof)*

### Counting the Possible Orderings
*How many distinct arrangements of \\( n \\) items exist, and why must a correct sort be able to distinguish all of them?*

### Information Gained Per Comparison
*Why does each yes/no comparison reveal at most one bit, and how does that cap progress per step?*

### Putting the Two Together
*If you must distinguish a huge number of orderings and each step gives one bit, why does the step count grow like \\( n \log n \\)?*

## What "Lower Bound" Actually Means
*How is a lower bound a statement about every possible algorithm, not the running time of any single one?*

### Worst-Case vs Average-Case Bounds
*Why does the bound hold even for the average case, not just the worst?*

## Which Sorts Hit the Bound
*Why are merge sort and heapsort considered asymptotically optimal comparison sorts?*

## How Non-Comparison Sorts Escape It
*Why do counting, radix, and bucket sort sidestep the \\( n \log n \\) wall entirely?*

### What Assumptions They Trade In
*What must you know about the keys for a non-comparison sort to be legal, and what do you give up?*

## Time-Complexity Implications
*How does this bound set the floor for the time complexity of any general-purpose comparison sort?*

### Why \\( O(n) \\) Comparison Sorting Is Impossible
*What would an \\( O(n) \\) comparison sort have to do that the counting argument forbids?*

### Where the Best Case Slips Under
*Why can a comparison sort still finish in \\( O(n) \\) on a lucky input without violating the worst-case floor?*

## Space-Complexity Note
*Why does the lower bound concern comparisons and time, and say nothing on its own about memory use?*

## Why This Matters in Practice
*How does knowing the bound stop you from chasing an impossible faster general-purpose comparison sort?*

## Implementation Walkthrough
*Reason about a demonstration rather than a sort.*

### What There Is to Implement
*Why is there no algorithm to code here — what could you instead build to illustrate the idea (e.g. counting comparisons a sort makes)?*

### Setting Up the Demonstration
*What would you measure across input sizes to see the comparison count rise like \\( n \log n \\)?*

### Interpreting the Result
*How would the measured curve support, but not prove, the lower bound?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
