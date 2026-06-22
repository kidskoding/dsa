# Multidimensional Arrays

## What They Model & When to Use One
*Grids, matrices, images, game boards — when is a 2D+ array the natural fit versus a map keyed by coordinates?*

## The Mental Model: A Shape Laid Over a Line
*Memory is one-dimensional — what does it mean to impose a 2D "shape" on a single line of cells, and why is the shape just an interpretation of offsets?*

## Flattening a Grid into Linear Memory
*What does it mean to "flatten" a rectangular grid into one unbroken run of cells, and why does flattening even happen under the hood?*

## Row-Major vs Column-Major Layout
*Two ways to order the cells: walk a full row before dropping down, or walk a full column. Which does Java use, which do Fortran and NumPy default to?*

### Index Flattening Formula
*How do you turn a coordinate \( (i, j) \) into one linear offset given the column count, and why does the number of columns appear in the formula?*

### Reading Back a Coordinate
*Given a flat offset, how do you recover the row and column using divide and modulo, and which operand is the column count?*

## Strides for Higher Dimensions
*Generalize the offset to 3D and beyond — what is a per-axis stride, and how do the strides chain so each index contributes its own multiplied term?*

### The Stride of Each Axis
*Why does the innermost axis have stride 1 while each outer axis's stride is the product of the sizes inside it?*

## Jagged (Array-of-Arrays) vs Rectangular
*When are rows separate sub-arrays each with their own length and address versus one solid contiguous block? What does Java's `int[][]` actually give you?*

### Memory Layout Consequences
*Why does a jagged array scatter rows across the heap (extra pointer hop, worse locality) while a true rectangular block stays contiguous?*

## Traversal Order & Locality
*Why can swapping the inner and outer loop over the same matrix change runtime dramatically, even though you touch every cell exactly once?*

### Matching Loop Order to Layout
*Why should the innermost loop vary the axis with stride 1, and what cache penalty appears when it doesn't?*

## Allocation & Initialization Patterns
*How do you allocate a rectangular block, a jagged structure, or a single flat array you index by hand — and what are the default cell values in each?*

## Common Operations
*Transpose, row/column sums, neighbor lookups on a board — how does each map onto the indexing scheme?*

## Time Complexity
*Reason about the cost of grid operations in terms of rows R and columns C.*

### Cell Access
*Why is reading or writing a single cell \( O(1) \) regardless of grid size, even with the flattening math?*

### Full Traversal
*Why is visiting every cell \( O(R \cdot C) \), and why is that bound the same no matter the loop order even when wall-clock time differs?*

### Row Scan vs Column Scan
*Why are both a single row scan \( O(C) \) and a single column scan \( O(R) \) in Big-O, yet one can be far slower in practice on a row-major layout?*

## Space Complexity
*Reason about the memory a grid occupies and what extra space operations need.*

### Storing the Grid
*Why is the data \( O(R \cdot C) \), and what extra overhead does a jagged array carry (one pointer and length per row) over a flat block?*

### In-Place vs Allocating Operations
*Why can a row sum run in \( O(1) \) extra space while a transpose into a new grid needs \( O(R \cdot C) \), and when can transpose be done in place?*

### Recursive Grid Walks
*Why can a recursive flood-fill or DFS over a grid use up to \( O(R \cdot C) \) call-stack space in the worst case?*

## Common Bugs & Edge Cases
*Swapped \( i \) and \( j \), mismatched row lengths in a jagged array, off-by-one on the last row/column, assuming rectangularity that isn't there.*

## Real-World & Interview Uses
*Image buffers, matrices, dynamic-programming tables, grid/maze problems — which interview patterns live on a 2D array?*

## Implementation Walkthrough
*Before writing code, break the problem into the pieces you must get right.*

### State & Setup
*What does your structure store (a flat backing array plus row/column counts, or nested arrays), and what defines a valid newly-allocated grid?*

### The Coordinate-to-Offset Step
*What does `get(i, j)` / `set(i, j, v)` compute, where do the two bounds checks go, and how does the offset formula appear in code?*

### The Nested Traversal
*How are the outer and inner loops ordered, and what invariant holds about all cells already visited at any point in the walk?*

### Termination & Return
*How does each operation finish, and what does it return or throw for a valid coordinate versus an out-of-range one?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
