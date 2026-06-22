# Fractional Knapsack

## The Problem & When to Use It
*What are you maximizing, what is the capacity constraint, and what does "fractional" let you do?*

## Fractional vs. 0/1 Knapsack
*Why does allowing partial items change the problem from NP-hard to easy?*

## The Greedy Choice: Value Density
*Why is the value-per-weight ratio \\( v_i / w_i \\) the right thing to sort and pick by?*

### Why Density, Not Raw Value or Weight
*What counterexample shows that picking by highest value (or lightest item) first fails?*

## The Algorithm Walked Through
*Sort by density, take whole items while they fit — what happens at the boundary?*

### Splitting the Last Item
*How does taking a fraction of the final item fill the capacity exactly?*

## Why the Greedy Is Optimal (Intuition)
*How would swapping low-density weight for high-density weight prove no better packing exists?*

### The Continuous Swap
*Why can you always move an infinitesimal unit of capacity to a denser item without loss?*

## Why the Same Rule Breaks for 0/1
*Why does indivisibility let a high-ratio item block a better whole-item combination?*

## Time Complexity
*Where does the running time go?*

### Sorting by Ratio Dominates
*Why is computing and sorting densities the \\( O(n \log n) \\) step?*

### The Fill Pass
*Why is the greedy fill only \\( O(n) \\), and could a selection-based approach reach \\( O(n) \\) overall?*

## Space Complexity
*What memory does the algorithm need beyond the items?*

### Running State vs. Item Array
*Why is the extra space \\( O(1) \\) (remaining capacity, accumulated value) on top of the \\( O(n) \\) item list?*

## Real Uses
*Where does divisible-resource allocation appear — investment splitting, bandwidth, cargo by weight?*

## Pitfalls
*Why must ratios drive selection, and how do zero-weight items, tied ratios, or floating-point drift trip you up?*

## Implementation Walkthrough
*How do the parts of the code realize the greedy fill?*

### Setup: Compute Ratios & Sort
*How do you pair each item with its density and order the array descending?*

### The Greedy Fill Loop
*How does each iteration take a whole item or compute the fraction that fits?*

### Termination & Accumulated Value
*When does the loop stop, and how do you return the total value including the fractional piece?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
