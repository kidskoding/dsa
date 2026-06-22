# Quadtrees

## What It's For
*What 2D problems — spatial indexing, collision/broad-phase detection, image region compression, level-of-detail — make a quadtree the natural structure?*

## Recursive Four-Way Subdivision
*How does each node carve its square region into four equal quadrants, and what condition makes the recursion stop dividing?*

### Why Four (and the 3D Cousin)
*Why does 2D split into four, and how does the same idea become an octree's eight in 3D?*

## Node Layout & Representation
*What does a node store — its bounding box, a point bucket OR four child pointers — and how do you label and order the quadrants (NW, NE, SW, SE)?*

## Point vs. Region Quadtrees
*What distinguishes storing points at leaves with a capacity threshold (point quadtree) from partitioning the space itself by value (region quadtree, e.g. image pixels)?*

## Insertion & Bucket Splitting
*When a leaf quadrant overflows its capacity, how do you create four children and redistribute the existing points down into them?*

### Which Quadrant Does a Point Fall In?
*Given a point and a node's center, how do you compute the correct child in two comparisons (above/below, left/right of center)?*

### Subdivide-Then-Reinsert
*Why, on a split, do you re-route every stored point through the same quadrant test rather than guessing where they go?*

## Deletion & Merging
*How do you remove a point, and when can four sparse children collapse back into a single leaf to keep the tree from staying needlessly deep?*

## Spatial Queries & Collision Checks
*Why does testing a query region against four quadrants prune most of the plane quickly, and which children do you recurse into vs. skip?*

### Region Overlap Test
*How do you decide a child's box is disjoint from, contained in, or straddling the query region, and how does each verdict steer the recursion?*

## Depth, Balance & Clustering
*Why can tightly clustered points drive a quadtree very deep and unbalanced — splitting again and again with points still together — unlike a median-split kd-tree?*

### The Coincident-Points Trap
*Why can two identical (or sub-resolution) points make subdivision recurse forever, and what guard (max depth) stops it?*

## Time Complexity
*Tie costs to tree DEPTH, and be explicit that depth depends on the point distribution, not just \\( n \\).*

### Insert & Point Query
*Why are these \\( O(\text{depth}) \\) — \\( O(\log n) \\) when points spread evenly, but degrading toward \\( O(n) \\) when they clump into one corner?*

### Range Query
*Why is the cost output-sensitive — \\( O(\text{visited nodes} + m) \\) reported points — and what query/region shapes make it visit a lot?*

### Best / Average / Worst Triggers
*What point distribution gives the balanced best case, and what distribution (heavy clustering, coincident points) triggers the degenerate worst case?*

## Space Complexity
*Why is total space \\( O(n) \\) in the well-spread case but potentially worse with deep clustering — internal nodes can outnumber points?*

### Empty-Child Overhead & Recursion Stack
*Why do allocating four children even for sparse quadrants waste space, and what stack depth (\\( O(\text{depth}) \\)) does recursive insert/query pay?*

## vs. kd-Trees & Grids
*When do you reach for a quadtree over a kd-tree or a uniform grid — and what's the trade-off in each direction (adaptivity, balance guarantees, simplicity)?*

## Pitfalls
*What goes wrong with points exactly on quadrant boundaries, duplicate/coincident points exceeding capacity forever, never merging empty children, or forgetting a max-depth cap?*

## Implementation Walkthrough
*Plan the code in parts before you write it — each sub-section tells you what to work out, not the answer.*

### Node, Bounds & Capacity
*What does a node hold for its bounding box, point bucket, and four child slots, and where does the capacity threshold live?*

### The Quadrant Selector
*How do you compare a point to the node's center to return NW / NE / SW / SE, and how do you compute each child's bounding box?*

### Insert With Split
*How does insert add to the bucket, detect overflow, subdivide, and push every point (old and new) down through the selector?*

### Range-Query Recursion
*How do you walk the tree, skip children whose box can't overlap the query, collect points inside, and recurse only into straddling children?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
