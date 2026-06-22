# Prefix & Suffix Sums and Products

## What It's For & Why It Matters
*Why precompute cumulative totals once so that any range query becomes \( O(1) \) instead of re-scanning the subarray every time, and where do range queries dominate the workload?*

## The Core Idea
*How does storing "the answer for every prefix" let you recover the answer for any interval by subtracting two stored values, turning repeated work into a single lookup?*

### The Mental Model
*How do you picture the prefix-sum array as a running odometer, where the cost of a stretch of road is just the difference of two readings?*

## The Prefix-Sum Array
*If \( P[i] \) is the sum of the first \( i \) elements, what does \( P \) let you compute, and why is the length usually \( n+1 \) with \( P[0] = 0 \)?*

### Building It
*Why is each entry just the previous entry plus one new element, and why does that make construction a single left-to-right pass?*

### Range Sum in O(1)
*Why does the sum of \( a[lo..hi] \) equal \( P[hi+1] - P[lo] \), and how does the \( P[0]=0 \) sentinel make the edge case \( lo = 0 \) just work?*

### Off-by-One Discipline
*What goes wrong if you mix up inclusive vs. exclusive bounds, and how does fixing one convention (half-open) avoid the bugs?*

## Suffix Sums
*What changes when you accumulate from the right instead of the left, and when is a suffix sum the natural tool rather than a prefix sum?*

## Prefix × Suffix Products
*For "product of the array except self," why does multiplying a prefix-product (everything before \( i \)) by a suffix-product (everything after \( i \)) give the answer without ever dividing?*

### Why Avoid Division
*Why is the prefix·suffix approach preferable to "total product ÷ a[i]," especially when the array can contain a zero?*

## Difference Arrays (the Inverse Trick)
*If prefix sums turn point values into range queries, why does a difference array do the opposite — turning many range updates into a single prefix-sum pass at the end?*

### One Update in O(1)
*Why does adding `delta` at `lo` and subtracting it just past `hi` mark a whole range, and why does the final prefix-sum pass "spread" those marks back into actual values?*

## 2-D Prefix Sums
*How does inclusion–exclusion extend the idea to a grid so any axis-aligned rectangle sum is \( O(1) \), and why are there four terms in the query?*

### Building the Table
*Why does each table cell combine the cell above, the cell to the left, and a subtracted overlap, and why is the table sized \( (R+1)\times(C+1) \)?*

### The Four-Corner Query
*Why does a rectangle sum add two corners and subtract two, and which corner is the doubly-removed overlap that gets added back?*

## Implementation Walkthrough
*Before writing code, decide each part.*

### Setup & Sizing
*Why allocate \( n+1 \) (or \( (R+1)\times(C+1) \)) slots with a zero sentinel, and what invariant does \( P[0]=0 \) guarantee about every later entry?*

### The Build Loop
*How does the single accumulation pass maintain "P[i] holds the sum of the first i elements" as it advances, and what is true of all entries to the left at each step?*

### The Query Step
*How does a range or rectangle query reduce to a constant number of array reads and one subtraction (or inclusion–exclusion), with the bounds checks placed before the arithmetic?*

### Termination & Return
*What does each operation return — a freshly built array/table from a build, a single number from a query — and what does it throw for an out-of-range interval?*

## Time Complexity
*Separate the one-time build cost from the per-query cost.*

### Build Cost
*Why is building the prefix array \( O(n) \) (or \( O(R \cdot C) \) in 2-D) — a single pass that touches each element once?*

### Query Cost
*Why is each range or rectangle query \( O(1) \) regardless of how wide the interval is, since it reads only a fixed number of precomputed cells?*

### When the Trade Pays Off
*Why does the up-front build only beat naive re-summing once you make enough queries, and how do you reason about the crossover point?*

## Space Complexity
*Reason about the memory beyond the input.*

### The Stored Table
*Why does the prefix array cost \( O(n) \) extra space (or \( O(R \cdot C) \) for a 2-D table), and what does that extra space buy you per query?*

### In-Place vs Allocating
*When can a difference array or prefix pass be done in place over the input, and when must you allocate a separate \( n+1 \) array to keep the sentinel?*

## Common Bugs & Edge Cases
*What breaks with integer overflow on large ranges (why `long`?), with the \( n+1 \) sizing, with an empty array, with a zero in product-except-self, or with forgetting the final prefix pass on a difference array?*

## Real-World & Interview Uses
*Where do range-sum queries, "subarray with given sum," running balances, image integral tables, and batch range-update problems rely on these techniques?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
