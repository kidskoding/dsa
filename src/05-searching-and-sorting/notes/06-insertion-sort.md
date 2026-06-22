# Insertion Sort

## What It Is & When to Use It
*What is the card-player analogy, and why is insertion sort the go-to for small or nearly-sorted inputs?*

## How Inserting into the Sorted Prefix Works
*How does each step take the next element and slide it back into its place among the sorted left side?*

### The Sorted-Prefix Invariant
*Why is the left part always sorted (though not necessarily final) before each insertion?*

## Iterative Coding
*How do you hold the current key, walk leftward, and find its insertion point?*

### Shifting vs Swapping
*Why is shifting elements rightward into a hole cheaper than repeated three-assignment swaps?*

### The Hole Mental Model
*How does picturing a "hole" that moves left clarify where the held key finally lands?*

## Adaptivity & Inversions
*How does the work insertion sort does map directly onto the number of inversions in the input?*

## Stability & In-Place
*Which comparison choice (`>` vs `>=`) keeps equal keys in order while using \\( O(1) \\) extra space?*

## Binary Insertion Variant
*How does using binary search to find the slot cut comparisons but not the shifting cost?*

## Time Complexity
*How do you count comparisons and shifts, and why does input order drive the result?*

### Best Case
*Why does an already-sorted (or nearly-sorted) array run in \\( O(n) \\), and what makes the inner loop exit immediately?*

### Average Case
*Why does a random permutation land at \\( \Theta(n^2) \\), and how does the average inversion count explain it?*

### Worst Case
*Which input (reverse-sorted) forces the maximum shifts, and why does every element travel the full prefix?*

## Space Complexity
*Why is insertion sort \\( O(1) \\) auxiliary space, and why does it need no recursion stack?*

## Trade-offs vs Other Quadratic Sorts
*Why is insertion sort usually the fastest quadratic sort in practice and the most adaptive to input order?*

## Common Bugs & Edge Cases
*Where do you overwrite the held key, run the inner loop past index 0, or break stability?*

## Real-World Uses
*Why do hybrid sorts (Timsort, introsort) fall back to insertion sort for small subarrays?*

## Implementation Walkthrough
*Break the algorithm into the parts you must get right before you write a line.*

### Setup
*Where does the outer loop start, and why is index 0 already a trivially sorted prefix?*

### The Inner Shift Loop
*How do you hold the key, shift larger elements right, and decide when to stop?*

### Placing the Key & Return
*Where does the held key get dropped once the inner loop stops, and why is no explicit return needed?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
