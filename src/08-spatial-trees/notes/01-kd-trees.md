# kd-Trees

## What It's For
*What kinds of queries — nearest neighbor, k-NN, range/box search over points in space — make a kd-tree worth building over a plain list?*

## Alternating Split Dimensions
*Why does the splitting axis cycle through \( x, y, z, \dots \) as you descend, and how does the node's depth (mod \( k \)) pick the axis?*

### What a Split Plane Means Geometrically
*Why does each node carve space into "everything left of the plane" and "everything right," and why is the plane axis-aligned?*

## Node Layout & Representation
*What does each node store — a point, an implicit splitting axis from its depth, and two children — and why does the plane NOT need to be stored explicitly?*

## Building a Balanced Tree
*Why does choosing the MEDIAN point along the current axis at each level keep the tree balanced, and what's the build cost?*

### Median Selection
*How do you find the median along an axis without fully sorting every level — what does quickselect / nth-element buy you, and why does it matter for total build time?*

### Why Balance Decays Under Inserts
*Why does building once from a median split stay balanced, but inserting points one at a time afterward can skew the tree?*

## Insertion & Deletion
*How do you descend axis-by-axis to place a new point, and why is deletion awkward enough that people often mark-and-rebuild instead of truly removing?*

## Range Queries
*How do you decide whether a node's implied region is fully inside, fully outside, or straddling the query box — and which subtrees can you skip entirely?*

### The Region-Box Test
*As you recurse, how do you carry and shrink the bounding region for each child so the inside/outside/straddle test is cheap?*

## Nearest-Neighbor Search
*After diving to a leaf for a first candidate, why might you still have to back up and explore the OTHER side of a split you already passed?*

### Pruning with the Splitting Plane
*What single distance comparison — distance from query to the split plane vs. best-distance-so-far — lets you discard an entire subtree unvisited?*

### Maintaining Best-So-Far
*Why does the order in which you visit the near vs. far child matter for how much you can prune?*

## Curse of Dimensionality
*Why does search degrade toward \( O(n) \) as the number of dimensions \( k \) grows — why does almost everything become "the far side might be closer" so pruning fails?*

## vs. Quadtrees & Other Structures
*When is a kd-tree the better choice than a quadtree, a uniform grid, or a brute-force scan, and when is it the worse one?*

## Time Complexity
*Separate the one-time build from per-query costs, and be explicit about what makes the worst case bite.*

### Build
*Why is building \( O(n\log n) \) when you use linear-time median selection at each level — what's the recurrence shape intuitively?*

### Range Query
*Why is a balanced range query roughly \( O(\sqrt{n} + m) \) in 2D (\( m \) reported points), and what about the query box size and dimension changes it?*

### Nearest-Neighbor: Best / Average / Worst
*Why is NN often close to \( O(\log n) \) in low dimensions, but \( O(n) \) worst case — what query position or dimensionality triggers visiting nearly every node?*

## Space Complexity
*Why is the tree itself \( O(n) \) — one node per point — and what does a pointer-based representation cost over a flat array?*

### Recursion Call-Stack
*Why does query and build recursion cost \( O(\text{height}) \) stack — \( O(\log n) \) balanced, \( O(n) \) degenerate — and how does that interact with deep skewed trees?*

## Pitfalls
*What breaks if you forget to alternate axes, compare on the wrong coordinate at a level, let the tree skew after many inserts, or skip the back-up/other-side step in nearest-neighbor?*

## Implementation Walkthrough
*Plan the code in parts before you write it — each sub-section tells you what to work out, not the answer.*

### Node Type & Axis-by-Depth
*What does the node hold, and how do you derive the comparison axis from depth without storing it?*

### Recursive Median Build
*How does the build pick the axis, select the median along it, set that as the node, and recurse on the two halves?*

### Range-Query Traversal
*How do you pass the query box down, test each node's point for inclusion, and prune children whose region can't overlap?*

### Nearest-Neighbor Traversal & Pruning
*How do you descend to the near child first, update best-so-far, then decide via the plane-distance test whether the far child is worth visiting?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
