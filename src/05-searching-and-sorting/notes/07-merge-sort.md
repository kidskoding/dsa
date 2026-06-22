# Merge Sort

## What It Is & When to Use It
*What guarantees does merge sort give that quicksort doesn't, and when do those guarantees matter?*

## The Divide & Conquer Shape
*How does recursively halving the array down to single elements set up the work?*

### Why a Single Element Is Already Sorted
*Why is the base case trivial, and what does it let the recursion assume?*

### The Recursion Tree Picture
*How many levels does the splitting create, and how much total work sits on each level?*

## The Merge Step
*How do two pointers combine two already-sorted runs into one in linear time?*

### Tie-Breaking During the Merge
*When both runs show equal keys, which one do you take first, and why does that choice decide stability?*

### Draining the Leftover Run
*After one run empties, why can you copy the rest of the other run verbatim?*

## Top-Down Recursive Coding
*How do you split at the midpoint, recurse on both halves, and merge the results?*

## Bottom-Up Iterative Coding
*How does merging runs of size 1, then 2, then 4 avoid recursion entirely?*

## Stability & In-Place Question
*Why is merge sort stable, and why is the standard array version not in-place?*

## Time Complexity
*Why is the cost the work-per-level times the number of levels — reason it out from the recursion tree (no formal recurrence solving).*

### Why Best, Average, and Worst Are All \\( \Theta(n \log n) \\)
*Why does input order not change the cost, unlike quicksort or insertion sort?*

### Constant Factors vs Quicksort
*Why does merge sort often lose to quicksort in practice despite the same big-O?*

## Space Complexity
*Where does the \\( O(n) \\) auxiliary array come from, and how much call-stack depth does the recursion add?*

### Reducing the Copying
*How can ping-ponging between two buffers cut redundant array copies?*

### Linked-List Merge Sort
*Why can a linked list be merge-sorted with only \\( O(1) \\) extra node space?*

## Trade-offs vs Quicksort & Heapsort
*When do you pick merge sort's predictability and stability over quicksort's cache-friendly speed?*

## Common Bugs & Edge Cases
*Where do midpoint overflow, leftover-run draining, and off-by-one merge bounds bite?*

## Real-World Uses
*Why is merge sort the engine behind external sorting, linked-list sorting, and stable library sorts?*

## Implementation Walkthrough
*Break the algorithm into the parts you must get right before you write a line.*

### Setup & Base Case
*What subrange does each call own, and what range size stops the recursion?*

### The Recursive Split
*How do you compute the midpoint and recurse on the two halves before merging?*

### The Merge Sub-Step
*What pointers and temporary storage does the merge need, and how do you walk them?*

### Returning / Writing Back
*How do merged results make it back into the original array positions?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
