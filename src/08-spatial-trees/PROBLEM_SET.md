# Spatial Trees: Problem Set

Every problem is an implementation task: fill in the stub in `problemset/` and make
its test in `tests/problemset/` pass. The work is 2-D geometry — squared distances,
points inside rectangles, nearest neighbours, closest pairs, bounding boxes, and
quadrant counts — the same primitives a k-d tree or quadtree leans on. Problems are
grouped into **Foundational** warm-ups and **Applied Problems**, numbered
contiguously and ordered roughly easy to hard.

---

**Foundational**

## Problem 1: Squared Euclidean Distance

### Description
Given two points `a = [ax, ay]` and `b = [bx, by]` in the plane, return the squared Euclidean distance between them, `(ax - bx)^2 + (ay - by)^2`. The square root is deliberately omitted: keeping the squared value avoids floating-point error and is all that nearest-neighbour comparisons ever need.

### Examples
**Example 1:**
```
Input:  a = [0, 0], b = [3, 4]
Output: 25
```
The legs are 3 and 4, so the squared distance is `9 + 16 = 25`.

**Example 2:**
```
Input:  a = [7, -2], b = [7, -2]
Output: 0
```
A point is distance zero from itself.

**Example 3:**
```
Input:  a = [-1, -1], b = [2, 3]
Output: 25
```
`(-3)^2 + (-4)^2 = 9 + 16 = 25`.

### Constraints
- `-10^4 <= ax, ay, bx, by <= 10^4`
- Coordinates are integers.

---

## Problem 2: Point Inside a Rectangle

### Description
An axis-aligned rectangle is given by its inclusive bounds `[xMin, yMin, xMax, yMax]` with `xMin <= xMax` and `yMin <= yMax`. Given a query point `[px, py]`, return `true` if the point lies inside the rectangle or on its boundary, and `false` otherwise.

### Examples
**Example 1:**
```
Input:  rect = [0, 0, 4, 4], point = [2, 2]
Output: true
```
The point sits strictly inside.

**Example 2:**
```
Input:  rect = [0, 0, 4, 4], point = [4, 1]
Output: true
```
A point on the right edge counts as inside.

**Example 3:**
```
Input:  rect = [0, 0, 4, 4], point = [5, 2]
Output: false
```
`px = 5` exceeds `xMax = 4`.

### Constraints
- `-10^4 <= coordinates <= 10^4`
- `xMin <= xMax` and `yMin <= yMax`.

---

## Problem 3: Bounding Box of Points

### Description
Given a non-empty list of points `points[i] = [x, y]`, return the smallest axis-aligned rectangle that contains them all, as `[xMin, yMin, xMax, yMax]`. This is the tightest bounding box — exactly what a spatial tree stores at each node to prune searches.

### Examples
**Example 1:**
```
Input:  points = [[1, 2], [3, 1], [2, 5]]
Output: [1, 1, 3, 5]
```
The minimum x is 1, minimum y is 1, maximum x is 3, maximum y is 5.

**Example 2:**
```
Input:  points = [[4, 4]]
Output: [4, 4, 4, 4]
```
A single point's bounding box is degenerate.

**Example 3:**
```
Input:  points = [[-2, 3], [5, -1], [0, 0]]
Output: [-2, -1, 5, 3]
```

### Constraints
- `1 <= points.length <= 10^5`
- `-10^4 <= x, y <= 10^4`

---

## Problem 4: Quadrant of a Point

### Description
A quadtree node splits its region at a center `[cx, cy]` into four quadrants. Given the center and a query point `[px, py]` (not equal to the center on the axis being tested), return which quadrant the point falls in as one of the strings `"NE"`, `"NW"`, `"SE"`, `"SW"`. Use the convention that a point with `px >= cx` is on the East side and `py >= cy` is on the North side.

### Examples
**Example 1:**
```
Input:  center = [0, 0], point = [3, 5]
Output: "NE"
```
Right of center and above it.

**Example 2:**
```
Input:  center = [0, 0], point = [-2, 4]
Output: "NW"
```
Left of center and above it.

**Example 3:**
```
Input:  center = [10, 10], point = [4, 2]
Output: "SW"
```
Left of center and below it.

### Constraints
- `-10^4 <= coordinates <= 10^4`

---

## Problem 5: Brute-Force Range Query

### Description
Given a list of points `points[i] = [x, y]` and an axis-aligned query rectangle `[xMin, yMin, xMax, yMax]` with inclusive bounds, return the indices of all points that lie inside the rectangle (boundary included), in increasing index order. This linear scan is the baseline a k-d tree range query must beat.

### Examples
**Example 1:**
```
Input:  points = [[1, 1], [5, 5], [2, 3]], rect = [0, 0, 3, 3]
Output: [0, 2]
```
Points 0 and 2 fall inside `[0,0]..[3,3]`; point 1 does not.

**Example 2:**
```
Input:  points = [[0, 0], [3, 0]], rect = [0, 0, 3, 0]
Output: [0, 1]
```
Both points lie on the rectangle's boundary.

**Example 3:**
```
Input:  points = [[4, 4]], rect = [0, 0, 1, 1]
Output: []
```
No point is inside.

### Constraints
- `1 <= points.length <= 10^5`
- `-10^4 <= coordinates <= 10^4`
- `xMin <= xMax` and `yMin <= yMax`.

---

**Applied Problems**

## Problem 6: K Closest Points to Origin

**LeetCode:** [973. K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/)

### Description
Given a list of points `points[i] = [x, y]` and an integer `k`, return the `k` points closest to the origin `[0, 0]` by Euclidean distance. Compare points by squared distance `x*x + y*y`; the answer may be returned in any order. Assume `0 <= k <= points.length`.

### Examples
**Example 1:**
```
Input:  points = [[1, 3], [-2, 2]], k = 1
Output: [[-2, 2]]
```
`(-2,2)` has squared distance 8 versus 10 for `(1,3)`.

**Example 2:**
```
Input:  points = [[3, 3], [5, -1], [-2, 4]], k = 2
Output: [[3, 3], [-2, 4]]
```
Squared distances are 18, 26, 20; the two smallest are picked (any order).

**Example 3:**
```
Input:  points = [[1, 1]], k = 0
Output: []
```

### Constraints
- `1 <= points.length <= 10^4`
- `0 <= k <= points.length`
- `-10^4 <= x, y <= 10^4`

---

## Problem 7: Count Points in a Rectangle

### Description
Given a list of points `points[i] = [x, y]` and an axis-aligned query rectangle `[xMin, yMin, xMax, yMax]` with inclusive bounds, return how many points lie inside the rectangle (boundary counts as inside). This is the range-count primitive a range tree answers in logarithmic time.

### Examples
**Example 1:**
```
Input:  points = [[1, 1], [5, 5], [2, 3], [3, 3]], rect = [0, 0, 3, 3]
Output: 3
```
Points `(1,1)`, `(2,3)`, `(3,3)` qualify.

**Example 2:**
```
Input:  points = [[0, 0], [4, 4]], rect = [1, 1, 3, 3]
Output: 0
```
Neither point is inside.

**Example 3:**
```
Input:  points = [[2, 2], [2, 2]], rect = [2, 2, 2, 2]
Output: 2
```
Duplicates are each counted.

### Constraints
- `1 <= points.length <= 10^5`
- `-10^4 <= coordinates <= 10^4`
- `xMin <= xMax` and `yMin <= yMax`.

---

## Problem 8: Nearest Neighbour Among Points

### Description
Given a list of points `points[i] = [x, y]` and a query point `[qx, qy]`, return the index of the point closest to the query by Euclidean distance. The query point may coincide with a listed point. Break ties by smallest index.

### Examples
**Example 1:**
```
Input:  points = [[0, 0], [5, 5], [1, 1]], query = [2, 2]
Output: 2
```
Point 2 `(1,1)` is squared distance 2 away, the nearest.

**Example 2:**
```
Input:  points = [[3, 4], [3, 4]], query = [0, 0]
Output: 0
```
Two equally-near points; the smaller index wins.

**Example 3:**
```
Input:  points = [[10, 10]], query = [10, 10]
Output: 0
```
The query lands exactly on the only point.

### Constraints
- `1 <= points.length <= 10^5`
- `-10^4 <= coordinates <= 10^4`

---

## Problem 9: Points Within a Radius

### Description
Given a list of points `points[i] = [x, y]`, a center `[cx, cy]`, and an integer `radius`, return how many points lie within (inclusive) Euclidean distance `radius` of the center. Compare squared distances against `radius * radius` to stay in integer arithmetic.

### Examples
**Example 1:**
```
Input:  points = [[0, 0], [3, 0], [5, 0]], center = [0, 0], radius = 3
Output: 2
```
`(0,0)` and `(3,0)` are within distance 3; `(5,0)` is not.

**Example 2:**
```
Input:  points = [[1, 1], [-1, -1]], center = [0, 0], radius = 1
Output: 0
```
Both points are distance `sqrt(2) > 1` away.

**Example 3:**
```
Input:  points = [[2, 0]], center = [0, 0], radius = 2
Output: 1
```
A point exactly on the circle counts as inside.

### Constraints
- `1 <= points.length <= 10^5`
- `0 <= radius <= 2 * 10^4`
- `-10^4 <= coordinates <= 10^4`

---

## Problem 10: Quadrant Counts

### Description
Given a list of points `points[i] = [x, y]` and a center `[cx, cy]`, count how many points fall in each of the four quadrants relative to the center and return the counts as `[ne, nw, sw, se]`. Use the convention `px >= cx` is East and `py >= cy` is North, so a point with `px >= cx` and `py >= cy` is North-East. Every point lands in exactly one quadrant under this rule.

### Examples
**Example 1:**
```
Input:  points = [[1, 1], [-1, 1], [-1, -1], [1, -1]], center = [0, 0]
Output: [1, 1, 1, 1]
```
One point per quadrant.

**Example 2:**
```
Input:  points = [[2, 3], [4, 5]], center = [0, 0]
Output: [2, 0, 0, 0]
```
Both points are North-East.

**Example 3:**
```
Input:  points = [[0, 0]], center = [0, 0]
Output: [1, 0, 0, 0]
```
A point on the center counts as North-East (`>=` on both axes).

### Constraints
- `1 <= points.length <= 10^5`
- `-10^4 <= coordinates <= 10^4`

---

## Problem 11: Closest Pair (Brute Force)

### Description
Given at least two points `points[i] = [x, y]`, return the smallest squared Euclidean distance between any two distinct points, checking all pairs. This `O(n^2)` answer is the reference value the divide-and-conquer closest-pair algorithm must match.

### Examples
**Example 1:**
```
Input:  points = [[0, 0], [3, 4], [1, 1]]
Output: 2
```
The closest pair is `(0,0)` and `(1,1)`, squared distance 2.

**Example 2:**
```
Input:  points = [[5, 5], [5, 6]]
Output: 1
```
Only one pair; vertical distance 1.

**Example 3:**
```
Input:  points = [[1, 1], [1, 1], [9, 9]]
Output: 0
```
Two coincident points give distance 0.

### Constraints
- `2 <= points.length <= 2000`
- `-10^4 <= x, y <= 10^4`

---

## Problem 12: Rectangle Overlap

**LeetCode:** [836. Rectangle Overlap](https://leetcode.com/problems/rectangle-overlap/)

### Description
Each axis-aligned rectangle is given as `[x1, y1, x2, y2]`, where `[x1, y1]` is the bottom-left corner and `[x2, y2]` is the top-right corner. Two rectangles overlap if the area of their intersection is positive; rectangles that touch only along an edge or corner do not overlap. Given two rectangles, return `true` if they overlap.

### Examples
**Example 1:**
```
Input:  rec1 = [0, 0, 2, 2], rec2 = [1, 1, 3, 3]
Output: true
```
They share a 1-by-1 square of positive area.

**Example 2:**
```
Input:  rec1 = [0, 0, 1, 1], rec2 = [1, 0, 2, 1]
Output: false
```
They touch along the line `x = 1` but share no area.

**Example 3:**
```
Input:  rec1 = [0, 0, 1, 1], rec2 = [2, 2, 3, 3]
Output: false
```
The rectangles are disjoint.

### Constraints
- `-10^4 <= coordinates <= 10^4`
- `x1 < x2` and `y1 < y2` for each rectangle.

---

## Problem 13: Manhattan Nearest Neighbour

### Description
Given a list of points `points[i] = [x, y]` and a query point `[qx, qy]`, return the index of the point closest to the query under the Manhattan (L1) distance `|x - qx| + |y - qy|`. Break ties by smallest index. Manhattan distance is the metric a k-d tree uses for grid-like data.

### Examples
**Example 1:**
```
Input:  points = [[1, 1], [4, 4], [0, 3]], query = [0, 0]
Output: 0
```
L1 distances are 2, 8, 3; point 0 is nearest.

**Example 2:**
```
Input:  points = [[2, 0], [0, 2]], query = [0, 0]
Output: 0
```
Both are distance 2; the smaller index wins.

**Example 3:**
```
Input:  points = [[5, 5]], query = [5, 5]
Output: 0
```

### Constraints
- `1 <= points.length <= 10^5`
- `-10^4 <= coordinates <= 10^4`

---

## Problem 14: Median Split Point

### Description
Building a balanced k-d tree means splitting points at the median of one coordinate. Given a list of points `points[i] = [x, y]` and an axis (`0` for x, `1` for y), return the index of the point whose chosen coordinate is the lower median: if the coordinates are sorted, this is the element at position `(n - 1) / 2`. Break ties on equal coordinate by smaller original index.

### Examples
**Example 1:**
```
Input:  points = [[3, 1], [1, 2], [2, 9]], axis = 0
Output: 1
```
The x-coordinates are `3, 1, 2`; sorted they are `1, 2, 3`, lower median 2 belongs to point 1.

**Example 2:**
```
Input:  points = [[0, 5], [0, 2], [0, 8], [0, 4]], axis = 1
Output: 3
```
The y-coordinates sorted are `2, 4, 5, 8`; lower median of 4 elements is the 2nd value, 4, at point 3.

**Example 3:**
```
Input:  points = [[7, 7]], axis = 0
Output: 0
```
A single point is its own median.

### Constraints
- `1 <= points.length <= 10^5`
- `axis` is `0` or `1`.
- `-10^4 <= coordinates <= 10^4`

---

## Problem 15: Maximum Points in a Unit-Side Square

### Description
Given a list of points `points[i] = [x, y]` and an integer side length `s`, place an axis-aligned `s`-by-`s` square anywhere (real-valued position allowed) and return the maximum number of points it can cover, counting points on the boundary. With `n <= 2000` an `O(n^2)` sweep over candidate square positions is fine.

### Examples
**Example 1:**
```
Input:  points = [[0, 0], [1, 1], [2, 2]], s = 1
Output: 2
```
A 1-by-1 square covering `(0,0)` and `(1,1)` (e.g. corners at `[0,0]` and `[1,1]`) holds two points.

**Example 2:**
```
Input:  points = [[0, 0], [0, 0], [5, 5]], s = 2
Output: 2
```
The two coincident points fit in one square.

**Example 3:**
```
Input:  points = [[0, 0], [3, 0], [6, 0]], s = 1
Output: 1
```
No two points are within a unit square.

### Constraints
- `1 <= points.length <= 2000`
- `0 <= s <= 2 * 10^4`
- `-10^4 <= x, y <= 10^4`

---

## Problem 16: Closest Pair (Sorted Sweep)

### Description
Given at least two points, return the smallest squared Euclidean distance between any two distinct points, but aim to beat the naive all-pairs scan. Sort the points by x, sweep left to right maintaining a candidate strip whose width is the current best distance, and only compare points within that strip. The returned value must equal the brute-force answer; the strip technique is the heart of divide-and-conquer closest pair.

### Examples
**Example 1:**
```
Input:  points = [[0, 0], [10, 10], [11, 11], [3, 4]]
Output: 2
```
The closest pair is `(10,10)` and `(11,11)`, squared distance 2.

**Example 2:**
```
Input:  points = [[1, 1], [2, 2]]
Output: 2
```

**Example 3:**
```
Input:  points = [[0, 0], [0, 0], [100, 100]]
Output: 0
```
Coincident points give distance 0.

### Constraints
- `2 <= points.length <= 10^5`
- `-10^4 <= x, y <= 10^4`

---

## Problem 17: K Nearest Neighbours to a Query

### Description
Given a list of points `points[i] = [x, y]`, a query point `[qx, qy]`, and an integer `k`, return the indices of the `k` points nearest the query by Euclidean distance, ordered from nearest to farthest. Break ties on equal distance by smaller index. Assume `0 <= k <= points.length`.

### Examples
**Example 1:**
```
Input:  points = [[1, 0], [2, 0], [5, 0]], query = [0, 0], k = 2
Output: [0, 1]
```
Distances are 1, 2, 5; the two nearest are points 0 and 1.

**Example 2:**
```
Input:  points = [[3, 4], [3, 4], [0, 1]], query = [0, 0], k = 1
Output: [2]
```
Point 2 at distance 1 is nearest.

**Example 3:**
```
Input:  points = [[9, 9]], query = [0, 0], k = 0
Output: []
```

### Constraints
- `1 <= points.length <= 10^5`
- `0 <= k <= points.length`
- `-10^4 <= coordinates <= 10^4`

---

## Problem 18: Count Pairs Within Distance

### Description
Given a list of points `points[i] = [x, y]` and an integer `d`, return the number of unordered pairs of distinct points whose Euclidean distance is at most `d`. Compare squared distances against `d * d` to stay in integer arithmetic. With `n <= 3000` an all-pairs check is acceptable.

### Examples
**Example 1:**
```
Input:  points = [[0, 0], [1, 0], [2, 0]], d = 1
Output: 2
```
Pairs `(0,1)` and `(1,2)` are within distance 1; `(0,2)` is distance 2 apart.

**Example 2:**
```
Input:  points = [[0, 0], [3, 4]], d = 5
Output: 1
```
The single pair is exactly distance 5 apart, which counts.

**Example 3:**
```
Input:  points = [[0, 0], [10, 10], [20, 20]], d = 1
Output: 0
```
No pair is close enough.

### Constraints
- `2 <= points.length <= 3000`
- `0 <= d <= 5 * 10^4`
- `-10^4 <= x, y <= 10^4`

---
