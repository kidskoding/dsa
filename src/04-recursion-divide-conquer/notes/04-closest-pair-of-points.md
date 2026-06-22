# Closest Pair of Points

## The Problem & Why It Matters
*Given points in a plane, what exactly are you trying to find, and where does this come up?*

## Brute-Force Baseline
*What does checking every pair cost, and why is it worth beating?*

## The Divide-and-Conquer Idea
*How does splitting the plane turn one hard search into two smaller ones plus a merge?*

### The Mental Model
*How do you picture the points cut by a vertical line, with each half solved on its own before reconciling the boundary?*

## Divide by Median x
*How does a vertical line through the median x split the points into two balanced halves?*

### Why the Median Keeps Halves Balanced
*What goes wrong for the cost if the split is lopsided instead of even?*

## Conquer Each Half
*How does recursion find the closest pair within the left and the right sets, and what does each call return?*

## The Strip Problem
*Why might the true closest pair straddle the dividing line, and how do you catch it?*

### Strip of Width Two Delta
*Which points near the dividing line still need checking, and why only those within delta of the line?*

### The Constant-Neighbor Argument
*Why does each strip point, scanned in y order, compare against only a fixed number of following points?*

## Combining the Three Candidates
*How do you pick the final answer from the left best, the right best, and the strip best?*

## Keeping the Combine Linear
*How does presorting by y, or merging sorted halves on the way up, avoid re-sorting inside the strip?*

### Two Sort Orders at Once
*Why does the algorithm want points ordered by x for the split but by y for the strip scan, and how do you maintain both?*

## Recursion Structure
*What are the base case and the two recursive calls, and how deep does the recursion go?*

### The Base Case
*At what small point count do you stop recursing and just brute-force, and why is that safe?*

## Time Complexity
*How do you reason about the running time without solving a recurrence formally?*

### Cost per Level
*Why is the combine (strip build plus constant-neighbor scan) linear at each level of the recursion?*

### Why It Beats Brute Force
*How does linear-combine work over logarithmically many balanced levels land below the quadratic baseline?*

### What the Presort Costs
*Why is the one-time sort by x not the dominant term once the recursion is running?*

## Space Complexity
*Where does this algorithm spend memory beyond the input points?*

### Recursion Depth
*Why is the stack depth tied to how many times the point set can be halved?*

### Strip and Sorted Buffers
*Why does building the strip and keeping y-sorted order need extra space proportional to the points involved?*

## Common Bugs & Edge Cases
*What goes wrong with duplicate points, fewer than two points, ties at the median, coincident points giving distance zero, or an unsorted strip?*

## Real-World & Interview Uses
*Where do collision detection, clustering, map labeling, and spatial queries rely on closest-pair?*

## Implementation Walkthrough
*Before writing code, decide each part.*

### Setup & Presort
*Which arrays do you sort up front, and by which coordinate, before the first recursive call?*

### The Base Case Branch
*At what size do you switch to brute force, and how do you compute the minimum directly there?*

### The Divide Step
*How do you find the median x and partition points into left and right without breaking the sorted orders?*

### The Two Recursive Calls
*How do you call each half and capture the smaller of the two returned distances as delta?*

### Building and Scanning the Strip
*How do you collect points within delta of the line, order them by y, and run the bounded-neighbor comparison?*

### Termination & Return
*What single value (and pair) does each call return, and how does the top level report the global closest pair?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
