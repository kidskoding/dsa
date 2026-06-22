# Z-Algorithm

## What It Computes & When to Use It
*What question about every suffix-vs-prefix overlap does the Z-array answer in one pass?*

## The Z-Array Definition
*What does \\( Z[i] \\) measure — the longest substring starting at \\( i \\) that matches the prefix?*

### The Z[0] Convention
*Why is position zero defined specially, and what would a literal definition give?*

## The Z-Box Window
*How do the \\( [l, r] \\) bounds track the rightmost match segment found so far?*

## Reusing Computed Values
*Why can a position inside the current Z-box copy an earlier Z-value instead of re-comparing?*

### Inside-the-Box vs. Past-the-Edge
*What are the two cases when computing \\( Z[i] \\), and when must you extend by explicit comparison?*

### Why the Mirror Value Works
*Why does the already-known Z-value at the mirrored position give a correct head start?*

## Pattern Matching via Concatenation
*How does forming \\( P \# T \\) turn Z-values into positions of every match?*

### Choosing the Separator
*Why must the separator be a character that appears in neither pattern nor text?*

## Z-Array vs. KMP Prefix Function
*How do the Z-array and the \\( \pi \\) array encode the same self-similarity differently?*

## Other Applications
*How does the Z-array help count distinct substrings, find periods, or detect repetitions?*

## Time Complexity
*Why is the single pass linear despite the inner extension loop?*

### The Right-Boundary Argument
*Why does the right edge \\( r \\) only ever advance, bounding total comparisons at \\( O(n) \\)?*

### No Input-Dependent Blowup
*Why does the Z-algorithm avoid the collision-driven worst case that hashing suffers?*

## Space Complexity
*What memory does the algorithm consume?*

### The Z-Array and Concatenation
*Why is the Z-array \\( O(n) \\), and why does \\( P \# T \\) cost \\( O(n+m) \\) extra for the combined string?*

## Real Uses
*Where does this fit — string search libraries, compression preprocessing, bioinformatics?*

## Pitfalls
*Why are the separator-character choice and off-by-one box updates the usual sources of bugs?*

## Implementation Walkthrough
*How do the cases turn into a clean single loop?*

### Setup & the Z-Box Pointers
*What array and what \\( l, r \\) pointers do you initialize before scanning?*

### The Main Scan and Case Split
*How does each position either copy a mirrored value or start fresh, then extend by comparison?*

### Updating the Box
*When and how do you move \\( l \\) and \\( r \\) after extending past the old right edge?*

### Reading Off Matches
*How do you scan the finished Z-array of \\( P \# T \\) to emit each match position in the text?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
