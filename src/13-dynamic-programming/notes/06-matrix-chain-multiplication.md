# Matrix Chain Multiplication

## Why Parenthesization Matters
*Same product, different cost. What does associativity buy and cost here?*

## Cost of a Single Multiply
*Recall the \\( p \times q \\) by \\( q \times r \\) scalar-multiply count.*

## Interval DP State
*What does \\( OPT(i, j) \\) mean over the subchain from \\( i \\) to \\( j \\)?*

## The Split-Point Recurrence
*Write the \\( \min \\) over every split \\( k \\) between \\( i \\) and \\( j \\).*

## Order of Filling & Runtime
*Why fill by increasing interval length, and where does \\( O(n^3) \\) come from?*

## Reconstructing the Parenthesization
*How does a stored split table rebuild the optimal bracketing?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
