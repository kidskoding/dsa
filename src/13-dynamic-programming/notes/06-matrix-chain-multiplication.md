# Matrix Chain Multiplication

## Why Parenthesization Matters
*Same product, wildly different cost. What does associativity let you choose, and what does the wrong choice cost?*

## Cost of a Single Multiply
*Recall the scalar-multiply count for a \( p \times q \) times \( q \times r \) product. Why is that the unit of cost?*

## Recognizing the DP (Interval DP)
*What about "optimally split a sequence at some point, recurse on both sides" signals interval DP?*

## Optimal Substructure
*Why is the best bracketing of a chain built from best bracketings of its left and right subchains around the outermost split?*

## Overlapping Subproblems
*Which subchains \( (i, j) \) get solved repeatedly across different outer splits? How many distinct intervals are there?*

## Interval DP State
*What does \( OPT(i, j) \) mean over the subchain of matrices from \( i \) to \( j \)?*

## The Split-Point Recurrence
*Write the min over every split \( k \) between \( i \) and \( j \): left cost + right cost + cost to combine the two halves.*

### Reading the Combine Term
*The combine cost uses three dimensions from the dimension array — which three, and why those?*

### Base Cases
*What is \( OPT(i, i) \) — the cost of a single matrix with nothing to multiply?*

## Order of Filling
*Why fill by increasing interval length rather than row by row? What dependency makes length-order the safe sweep?*

## Reconstructing the Parenthesization
*How does a stored split table \( s(i,j) \) let you rebuild the optimal bracketing recursively?*

## Time Complexity
*Apply cost = states × transition. How many intervals \( (i, j) \) are there, and why does each cost \( O(n) \) to scan its splits?*

### Where \( O(n^3) \) Comes From
*Combine the \( O(n^2) \) intervals with the \( O(n) \) split scan — and contrast with the exponential count of all parenthesizations (Catalan).*

## Space Complexity
*Why is the cost table \( O(n^2) \), and what extra \( O(n^2) \) does the split table add for reconstruction? Any rolling-array saving here, and why is it awkward?*

## Variants & Related Problems
*How do optimal BST, polygon triangulation, burst balloons, and boolean parenthesization share this interval-DP shape?*

## Pitfalls
*Where do people slip — dimension array off-by-one, wrong fill order (not by length), forgetting the combine term, confusing counts vs values?*

## Implementation Walkthrough
*Plan the code in parts before writing it.*

### Dimension Array & Table Setup
*How is the chain encoded as a dimension array of length \( n+1 \), and what do the diagonal (single-matrix) cells start at?*

### The Length-Then-Split Loops
*How do you loop over increasing interval length, then over start index, then over split point \( k \)?*

### Recording the Best Split
*Where do you store the argmin split so reconstruction can find it later?*

### Reconstruction Pass
*How does a recursive walk over the split table emit the bracketed product?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
