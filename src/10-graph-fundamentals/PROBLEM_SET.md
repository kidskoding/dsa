# Graph Fundamentals: Problem Set

Every problem is an implementation task: fill in the stub in `problemset/` and make
its test in `tests/problemset/` pass. Inputs arrive as plain Java values — `int[][]`
edge lists, adjacency-style arrays, or `char[][]`/`int[][]` grids — so each problem is
self-contained and verified the same way. The **Foundational** group drills the core
traversals (BFS, DFS, components, cycles, ordering, coloring); the **Applied Problems**
group weaves LeetCode classics and contest-style tasks from easy to hard, all built on
those same primitives. A shared `Graph` helper lives in the module; use it by its simple
name wherever an adjacency structure is convenient.

---

**Foundational**

## Problem 1: Vertex Degrees

**LeetCode:** ### Description
You are given an undirected graph with `vertexCount` vertices labelled `0..vertexCount-1`
and a list of `edges`, where each edge is a pair `[u, v]`. Return an array `deg` where
`deg[i]` is the degree of vertex `i` — the number of edges incident to it. The graph has
no self-loops and no duplicate edges.

### Examples
**Example 1:**
```
Input:  vertexCount = 3, edges = [[0,1],[1,2]]
Output: [1, 2, 1]
```
Vertex 1 touches both edges, so its degree is 2; vertices 0 and 2 each touch one edge.

**Example 2:**
```
Input:  vertexCount = 2, edges = []
Output: [0, 0]
```
With no edges every vertex has degree 0.

**Example 3:**
```
Input:  vertexCount = 4, edges = [[0,1],[0,2],[0,3]]
Output: [3, 1, 1, 1]
```
Vertex 0 is the hub of a star and touches all three edges.

### Constraints
- `0 <= vertexCount <= 10^5`
- `0 <= edges.length <= 2 * 10^5`
- `0 <= u, v < vertexCount` and `u != v`
- No duplicate edges.

---

## Problem 2: Connected Components

**LeetCode:** ### Description
Given an undirected graph as a `vertexCount` and an `int[][]` edge list, return the number
of connected components — maximal sets of vertices reachable from one another. Isolated
vertices count as their own component.

### Examples
**Example 1:**
```
Input:  vertexCount = 5, edges = [[0,1],[1,2],[3,4]]
Output: 2
```
`{0,1,2}` form one component and `{3,4}` the other.

**Example 2:**
```
Input:  vertexCount = 4, edges = []
Output: 4
```
With no edges each of the four vertices is its own component.

**Example 3:**
```
Input:  vertexCount = 6, edges = [[0,1],[1,2],[2,0],[3,4]]
Output: 3
```
The triangle `{0,1,2}`, the pair `{3,4}`, and the lone vertex `5`.

### Constraints
- `1 <= vertexCount <= 10^5`
- `0 <= edges.length <= 2 * 10^5`
- `0 <= u, v < vertexCount`

---

## Problem 3: BFS Within K Levels

**LeetCode:** ### Description
Given an unweighted undirected graph (as `vertexCount` and an `int[][]` edge list), a
`source` vertex, and an integer `k`, return — sorted ascending — every vertex whose
shortest-path distance from `source` is at most `k` BFS levels. The source itself is at
distance 0 and is always included.

### Examples
**Example 1:**
```
Input:  vertexCount = 5, edges = [[0,1],[1,2],[2,3],[3,4]], source = 0, k = 2
Output: [0, 1, 2]
```
Distances from 0 are `[0,1,2,3,4]`; only those `<= 2` qualify.

**Example 2:**
```
Input:  vertexCount = 4, edges = [[0,1],[0,2],[0,3]], source = 0, k = 1
Output: [0, 1, 2, 3]
```
Every neighbor sits one level away from the hub.

**Example 3:**
```
Input:  vertexCount = 3, edges = [], source = 1, k = 5
Output: [1]
```
With no edges only the source is reachable.

### Constraints
- `1 <= vertexCount <= 10^5`
- `0 <= source < vertexCount`
- `0 <= k <= vertexCount`

---

## Problem 4: Detect a Cycle (Undirected)

**LeetCode:** ### Description
Given an undirected graph as `vertexCount` and an `int[][]` edge list, return `true` if the
graph contains a cycle and `false` otherwise. The graph has no self-loops or duplicate
edges, so any cycle has length at least 3.

### Examples
**Example 1:**
```
Input:  vertexCount = 3, edges = [[0,1],[1,2],[2,0]]
Output: true
```
The three edges close a triangle.

**Example 2:**
```
Input:  vertexCount = 4, edges = [[0,1],[1,2],[2,3]]
Output: false
```
A simple path has no cycle.

**Example 3:**
```
Input:  vertexCount = 5, edges = [[0,1],[2,3],[3,4],[4,2]]
Output: true
```
The component `{2,3,4}` forms a cycle even though `{0,1}` does not.

### Constraints
- `1 <= vertexCount <= 10^5`
- `0 <= edges.length <= 2 * 10^5`
- No self-loops or duplicate edges.

---

## Problem 5: Topological Order

**LeetCode:** ### Description
Given a directed graph as `vertexCount` and an `int[][]` edge list (each `[u, v]` means
`u -> v`), return a valid topological ordering of all vertices as an `int[]`. If the graph
contains a cycle no ordering exists, so return an empty array. Any valid order is accepted.

### Examples
**Example 1:**
```
Input:  vertexCount = 3, edges = [[0,1],[1,2]]
Output: [0, 1, 2]
```
Every edge points forward in the returned order.

**Example 2:**
```
Input:  vertexCount = 2, edges = [[0,1],[1,0]]
Output: []
```
The two edges form a cycle, so no ordering exists.

**Example 3:**
```
Input:  vertexCount = 4, edges = [[0,1],[0,2],[3,0]]
Output: [3, 0, 1, 2]
```
3 must precede 0, which must precede both 1 and 2.

### Constraints
- `1 <= vertexCount <= 10^5`
- `0 <= edges.length <= 2 * 10^5`
- A returned order, if non-empty, must list every vertex exactly once.

---

## Problem 6: Bipartite Check With Classes

**LeetCode:** ### Description
Given an undirected graph as `vertexCount` and an `int[][]` edge list, decide whether it is
2-colorable. Return an `int[]` `color` of length `vertexCount` where each entry is `0` or
`1` and no edge joins two same-colored vertices. If the graph is not bipartite, return an
empty array. For disconnected graphs, color each component independently; isolated vertices
may take either color (use `0`).

### Examples
**Example 1:**
```
Input:  vertexCount = 4, edges = [[0,1],[1,2],[2,3],[3,0]]
Output: [0, 1, 0, 1]
```
The even cycle is 2-colorable.

**Example 2:**
```
Input:  vertexCount = 3, edges = [[0,1],[1,2],[2,0]]
Output: []
```
An odd cycle cannot be 2-colored.

**Example 3:**
```
Input:  vertexCount = 3, edges = [[0,1]]
Output: [0, 1, 0]
```
Vertex 2 is isolated and defaults to color 0.

### Constraints
- `1 <= vertexCount <= 10^5`
- `0 <= edges.length <= 2 * 10^5`
- A non-empty result must be a proper 2-coloring.

---

**Applied Problems**

## Problem 7: Flood Fill

**LeetCode:** [733. Flood Fill](https://leetcode.com/problems/flood-fill/)

### Description
You are given an `int[][]` `image` of pixel colors, a starting pixel `(sr, sc)`, and a
`color`. Perform a flood fill: starting from `(sr, sc)`, recolor that pixel and every pixel
4-directionally connected to it that shares its original color, then return the modified
image. If the start pixel already has the target color, the image is unchanged.

### Examples
**Example 1:**
```
Input:  image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]
```
All 1s connected to the center become 2; the bottom-right 1 is cut off by water.

**Example 2:**
```
Input:  image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 5
Output: [[5,5,5],[5,5,5]]
```
The whole image shares one color and is repainted.

**Example 3:**
```
Input:  image = [[0,0,0],[0,1,0]], sr = 1, sc = 1, color = 1
Output: [[0,0,0],[0,1,0]]
```
The start already equals the new color, so nothing changes.

### Constraints
- `1 <= image.length, image[0].length <= 50`
- `0 <= image[i][j], color < 2^16`
- `0 <= sr < image.length`, `0 <= sc < image[0].length`

---

## Problem 8: Number of Islands

**LeetCode:** [200. Number of Islands](https://leetcode.com/problems/number-of-islands/)

### Description
Given a `char[][]` `grid` of `'1'` (land) and `'0'` (water), count the number of islands. An
island is a maximal group of land cells connected horizontally or vertically. Cells outside
the grid are treated as water.

### Examples
**Example 1:**
```
Input:  grid = [['1','1','0'],['1','1','0'],['0','0','0']]
Output: 1
```
The four land cells form a single island.

**Example 2:**
```
Input:  grid = [['1','0','1'],['0','0','0'],['1','0','0']]
Output: 3
```
Three land cells, none adjacent, give three islands.

**Example 3:**
```
Input:  grid = [['0','0'],['0','0']]
Output: 0
```
No land means no islands.

### Constraints
- `1 <= grid.length, grid[0].length <= 300`
- Each cell is `'0'` or `'1'`.

---

## Problem 9: Max Area of Island

**LeetCode:** [695. Max Area of Island](https://leetcode.com/problems/max-area-of-island/)

### Description
Given an `int[][]` `grid` of `0`s and `1`s, return the area of the largest island. An island
is a maximal group of `1`s connected 4-directionally; its area is the number of cells. If
there is no land, return `0`.

### Examples
**Example 1:**
```
Input:  grid = [[1,1,0,0],[1,0,0,1],[0,0,1,1]]
Output: 3
```
The bottom-right island has three cells; the top-left island has three as well — the max is 3.

**Example 2:**
```
Input:  grid = [[0,0,0],[0,0,0]]
Output: 0
```
No land at all.

**Example 3:**
```
Input:  grid = [[1,1,1],[1,1,1]]
Output: 6
```
The whole grid is one island of six cells.

### Constraints
- `1 <= grid.length, grid[0].length <= 50`
- Each cell is `0` or `1`.

---

## Problem 10: Largest Treasure Region

**LeetCode:** ### Description
A treasure map is an `int[][]` `grid` of `1` (treasure) and `0` (sea). A region is a maximal
group of treasure cells connected 4-directionally, and its size is the number of cells.
Return the size of the largest region, or `0` if there is no treasure.

### Examples
**Example 1:**
```
Input:  grid = [[1,0,1],[1,0,0],[0,0,1]]
Output: 2
```
The left column pair is the largest region.

**Example 2:**
```
Input:  grid = [[0,0],[0,0]]
Output: 0
```
No treasure on the map.

**Example 3:**
```
Input:  grid = [[1,1,1],[0,0,1],[1,1,1]]
Output: 7
```
All treasure cells but the isolated bottom-left pair connect into one region of seven.

### Constraints
- `1 <= grid.length, grid[0].length <= 500`
- Each cell is `0` or `1`.

---

## Problem 11: Number of Provinces

**LeetCode:** [547. Number of Provinces](https://leetcode.com/problems/number-of-provinces/)

### Description
There are `n` cities. You are given an `n x n` `int[][]` `isConnected` where
`isConnected[i][j] = 1` means cities `i` and `j` are directly connected (the matrix is
symmetric with `1`s on the diagonal). A province is a group of directly or indirectly
connected cities. Return the number of provinces.

### Examples
**Example 1:**
```
Input:  isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2
```
Cities 0 and 1 form one province; city 2 stands alone.

**Example 2:**
```
Input:  isConnected = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
```
No connections beyond self, so three provinces.

**Example 3:**
```
Input:  isConnected = [[1,1,0],[1,1,1],[0,1,1]]
Output: 1
```
The connections chain all three cities into one province.

### Constraints
- `1 <= n <= 200`
- `isConnected[i][j]` is `0` or `1`, `isConnected[i][i] = 1`, and the matrix is symmetric.

---

## Problem 12: Find Center of Star Graph

**LeetCode:** [1791. Find Center of Star Graph](https://leetcode.com/problems/find-center-of-star-graph/)

### Description
A star graph on `n` vertices (`n >= 3`) has one center connected to every other vertex and
no other edges. Given the `int[][]` `edges` list (exactly `n - 1` edges), return the center
vertex.

### Examples
**Example 1:**
```
Input:  edges = [[1,2],[2,3],[4,2]]
Output: 2
```
Vertex 2 appears in every edge.

**Example 2:**
```
Input:  edges = [[1,2],[5,1],[1,3],[1,4]]
Output: 1
```
Vertex 1 is the shared endpoint.

**Example 3:**
```
Input:  edges = [[3,1],[3,2]]
Output: 3
```
The center is the vertex common to the first two edges.

### Constraints
- `3 <= n <= 10^5` and `edges.length == n - 1`
- The input is guaranteed to form a valid star graph.

---

## Problem 13: Find if Path Exists in Graph

**LeetCode:** [1971. Find if Path Exists in Graph](https://leetcode.com/problems/find-if-path-exists-in-graph/)

### Description
Given an undirected graph with `vertexCount` vertices, an `int[][]` edge list, a `source`,
and a `destination`, return `true` if there is a path from `source` to `destination` and
`false` otherwise. A vertex always has a path to itself.

### Examples
**Example 1:**
```
Input:  vertexCount = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
Output: true
```
The triangle connects 0 and 2.

**Example 2:**
```
Input:  vertexCount = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
Output: false
```
`{0,1,2}` and `{3,4,5}` are separate components.

**Example 3:**
```
Input:  vertexCount = 1, edges = [], source = 0, destination = 0
Output: true
```
A vertex reaches itself trivially.

### Constraints
- `1 <= vertexCount <= 2 * 10^5`
- `0 <= edges.length <= 2 * 10^5`
- `0 <= source, destination < vertexCount`

---

## Problem 14: Is Graph Bipartite?

**LeetCode:** [785. Is Graph Bipartite?](https://leetcode.com/problems/is-graph-bipartite/)

### Description
Given an undirected graph as an adjacency list `int[][]` `graph`, where `graph[u]` lists the
neighbors of vertex `u`, return `true` if the graph is bipartite — its vertices can be split
into two sets with every edge crossing between them — and `false` otherwise. The graph may
be disconnected.

### Examples
**Example 1:**
```
Input:  graph = [[1,3],[0,2],[1,3],[0,2]]
Output: true
```
Sets `{0,2}` and `{1,3}` split the 4-cycle.

**Example 2:**
```
Input:  graph = [[1,2,3],[0,2],[0,1,3],[0,2]]
Output: false
```
The triangle `{0,1,2}` is an odd cycle.

**Example 3:**
```
Input:  graph = [[],[3],[],[1]]
Output: true
```
A lone edge `{1,3}` plus isolated vertices is bipartite.

### Constraints
- `1 <= graph.length <= 100`
- `graph[u]` contains distinct neighbors and does not contain `u`.
- If `v` is in `graph[u]`, then `u` is in `graph[v]`.

---

## Problem 15: Two-Team Rivalry Split

**LeetCode:** ### Description
A tournament has `playerCount` players labelled `0..playerCount-1` and a list of undirected
`[u, v]` rivalry edges. Decide whether the players can be split into exactly two teams so
that every rivalry crosses between the teams. Return `true` or `false`. The rivalry graph may
be disconnected.

### Examples
**Example 1:**
```
Input:  playerCount = 4, edges = [[0,1],[1,2],[2,3],[3,0]]
Output: true
```
Teams `{0,2}` and `{1,3}` separate every rivalry.

**Example 2:**
```
Input:  playerCount = 3, edges = [[0,1],[1,2],[2,0]]
Output: false
```
Three mutual rivals cannot be two-team split.

**Example 3:**
```
Input:  playerCount = 5, edges = [[0,1],[2,3]]
Output: true
```
Disconnected rivalries are each separable.

### Constraints
- `1 <= playerCount <= 10^5`
- `0 <= edges.length <= 10^5`
- `0 <= u, v < playerCount`

---

## Problem 16: Course Schedule

**LeetCode:** [207. Course Schedule](https://leetcode.com/problems/course-schedule/)

### Description
There are `numCourses` courses labelled `0..numCourses-1`. You are given `prerequisites`
where `[a, b]` means you must take course `b` before course `a`. Return `true` if you can
finish all courses — i.e. the prerequisite graph is acyclic — and `false` otherwise.

### Examples
**Example 1:**
```
Input:  numCourses = 2, prerequisites = [[1,0]]
Output: true
```
Take 0, then 1.

**Example 2:**
```
Input:  numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
```
Each course requires the other — a cycle.

**Example 3:**
```
Input:  numCourses = 3, prerequisites = [[1,0],[2,1]]
Output: true
```
The chain `0 -> 1 -> 2` is acyclic.

### Constraints
- `1 <= numCourses <= 10^5`
- `0 <= prerequisites.length <= 5 * 10^5`
- `0 <= a, b < numCourses`

---

## Problem 17: Build Deadlock

**LeetCode:** ### Description
A continuous-integration system has `taskCount` build tasks labelled `0..taskCount-1` and a
list of `[a, b]` dependencies meaning task `a` must finish before task `b`. Return `true` if
the dependency graph contains a circular dependency (a deadlock), else `false`.

### Examples
**Example 1:**
```
Input:  taskCount = 3, deps = [[0,1],[1,2],[2,0]]
Output: true
```
The three tasks wait on each other in a cycle.

**Example 2:**
```
Input:  taskCount = 4, deps = [[0,1],[0,2],[1,3],[2,3]]
Output: false
```
A diamond of dependencies is still acyclic.

**Example 3:**
```
Input:  taskCount = 2, deps = []
Output: false
```
No dependencies, no deadlock.

### Constraints
- `1 <= taskCount <= 10^5`
- `0 <= deps.length <= 2 * 10^5`
- `0 <= a, b < taskCount`

---

## Problem 18: Course Schedule II

**LeetCode:** [210. Course Schedule II](https://leetcode.com/problems/course-schedule-ii/)

### Description
There are `numCourses` courses. Given `prerequisites` where `[a, b]` means `b` must be taken
before `a`, return any valid ordering of all courses as an `int[]`. If a cycle makes this
impossible, return an empty array.

### Examples
**Example 1:**
```
Input:  numCourses = 2, prerequisites = [[1,0]]
Output: [0, 1]
```
Course 0 unlocks course 1.

**Example 2:**
```
Input:  numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
Output: [0, 1, 2, 3]
```
0 first, then 1 and 2, finally 3 (other valid orders accepted).

**Example 3:**
```
Input:  numCourses = 2, prerequisites = [[0,1],[1,0]]
Output: []
```
A cyclic prerequisite leaves no ordering.

### Constraints
- `1 <= numCourses <= 10^5`
- `0 <= prerequisites.length <= 5 * 10^5`
- A non-empty result lists every course exactly once.

---

## Problem 19: Pipeline Schedule

**LeetCode:** ### Description
Given `stepCount` pipeline steps and `[a, b]` dependency pairs (`a` must run before `b`),
return any valid execution order of all steps as an `int[]`, or an empty array if a cycle
makes the pipeline unschedulable. When several steps are simultaneously available, prefer the
smallest step id, so a fully-chained input yields the natural ascending order.

### Examples
**Example 1:**
```
Input:  stepCount = 3, deps = [[0,1],[1,2]]
Output: [0, 1, 2]
```
A single chain yields the natural order.

**Example 2:**
```
Input:  stepCount = 4, deps = [[0,2],[1,2],[2,3]]
Output: [0, 1, 2, 3]
```
0 and 1 are both free first; the smaller id 0 leads.

**Example 3:**
```
Input:  stepCount = 2, deps = [[0,1],[1,0]]
Output: []
```
A cycle makes the pipeline unschedulable.

### Constraints
- `1 <= stepCount <= 10^5`
- `0 <= deps.length <= 2 * 10^5`
- Ties are broken by smallest available step id.

---

## Problem 20: Rotting Oranges

**LeetCode:** [994. Rotting Oranges](https://leetcode.com/problems/rotting-oranges/)

### Description
You are given an `int[][]` `grid` where `0` is empty, `1` is a fresh orange, and `2` is a
rotten orange. Each minute, any fresh orange 4-directionally adjacent to a rotten one becomes
rotten. Return the minimum number of minutes until no fresh orange remains, or `-1` if some
fresh orange can never rot. Use multi-source BFS.

### Examples
**Example 1:**
```
Input:  grid = [[2,1,1],[1,1,0],[0,1,1]]
Output: 4
```
Rot spreads outward from the corner over four minutes.

**Example 2:**
```
Input:  grid = [[2,1,1],[0,1,1],[1,0,1]]
Output: -1
```
The bottom-left orange is sealed off and never rots.

**Example 3:**
```
Input:  grid = [[0,2]]
Output: 0
```
No fresh oranges, so zero minutes.

### Constraints
- `1 <= grid.length, grid[0].length <= 100`
- Each cell is `0`, `1`, or `2`.

---

## Problem 21: 01 Matrix

**LeetCode:** [542. 01 Matrix](https://leetcode.com/problems/01-matrix/)

### Description
Given an `int[][]` `mat` of `0`s and `1`s, return a matrix of the same size where each entry
is the distance to the nearest `0`, measured in 4-directional steps. Cells holding `0` have
distance `0`. Use multi-source BFS from all zeros at once.

### Examples
**Example 1:**
```
Input:  mat = [[0,0,0],[0,1,0],[0,0,0]]
Output: [[0,0,0],[0,1,0],[0,0,0]]
```
The single 1 is one step from a zero.

**Example 2:**
```
Input:  mat = [[0,0,0],[0,1,0],[1,1,1]]
Output: [[0,0,0],[0,1,0],[1,2,1]]
```
The center bottom 1 is two steps from the nearest zero.

**Example 3:**
```
Input:  mat = [[0,1],[1,1]]
Output: [[0,1],[1,2]]
```
The far corner is two steps away.

### Constraints
- `1 <= mat.length, mat[0].length <= 10^4` with `mat.length * mat[0].length <= 10^4`
- Each cell is `0` or `1`; at least one `0` is present.

---

## Problem 22: Shortest Path in Binary Matrix

**LeetCode:** [1091. Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/)

### Description
Given an `n x n` `int[][]` `grid` of `0`s (clear) and `1`s (blocked), return the length of
the shortest clear path from the top-left cell `(0,0)` to the bottom-right cell `(n-1,n-1)`,
where moves may go in any of the 8 directions and path length counts visited cells. Return
`-1` if no such path exists.

### Examples
**Example 1:**
```
Input:  grid = [[0,1],[1,0]]
Output: 2
```
Step diagonally from corner to corner.

**Example 2:**
```
Input:  grid = [[0,0,0],[1,1,0],[1,1,0]]
Output: 4
```
A four-cell path threads down the open right column.

**Example 3:**
```
Input:  grid = [[1,0,0],[1,1,0],[1,1,0]]
Output: -1
```
The start cell is blocked, so no path exists.

### Constraints
- `1 <= n <= 100`
- Each cell is `0` or `1`.

---

## Problem 23: Maze Escape Hops

**LeetCode:** ### Description
A robot stands on the cell marked `'S'` in a `char[][]` `maze` where `'#'` is a wall, `'.'`
is open floor, and `'E'` is the single exit. Each move steps to a 4-adjacent non-wall cell.
Return the minimum number of moves from `'S'` to `'E'`, or `-1` if the exit is unreachable.

### Examples
**Example 1:**
```
Input:  maze = [['S','.','.'],['#','#','.'],['.','.','E']]
Output: 4
```
The only route hugs the right column then crosses the bottom row.

**Example 2:**
```
Input:  maze = [['S','#','E']]
Output: -1
```
A wall separates start from exit.

**Example 3:**
```
Input:  maze = [['S','.','E']]
Output: 2
```
Two open steps reach the exit.

### Constraints
- `1 <= maze.length, maze[0].length` and `maze.length * maze[0].length <= 10^6`
- Exactly one `'S'` and one `'E'`; other cells are `'.'` or `'#'`.

---

## Problem 24: Number of Closed Islands

**LeetCode:** [1254. Number of Closed Islands](https://leetcode.com/problems/number-of-closed-islands/)

### Description
Given an `int[][]` `grid` where `0` is land and `1` is water, return the number of closed
islands. A closed island is a maximal group of land cells connected 4-directionally that does
not touch any border of the grid. Border-touching land does not count.

### Examples
**Example 1:**
```
Input:  grid = [[1,1,1,1],[1,0,0,1],[1,0,0,1],[1,1,1,1]]
Output: 1
```
The interior block of land is fully enclosed by water.

**Example 2:**
```
Input:  grid = [[0,0,1,1],[0,1,0,1],[1,1,1,0]]
Output: 0
```
Every land cell reaches the border.

**Example 3:**
```
Input:  grid = [[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
Output: 1
```
The ring of land around the central water cell is one closed island.

### Constraints
- `1 <= grid.length, grid[0].length <= 100`
- Each cell is `0` or `1`.

---

## Problem 25: Surrounded Regions

**LeetCode:** [130. Surrounded Regions](https://leetcode.com/problems/surrounded-regions/)

### Description
Given a `char[][]` `board` of `'X'` and `'O'`, capture every region of `'O'`s that is fully
surrounded by `'X'`s by flipping those `'O'`s to `'X'`. An `'O'` region is safe if any of its
cells is connected 4-directionally to the border. Modify the board in place and return it.

### Examples
**Example 1:**
```
Input:  board = [['X','X','X'],['X','O','X'],['X','X','X']]
Output: [['X','X','X'],['X','X','X'],['X','X','X']]
```
The lone interior `'O'` is captured.

**Example 2:**
```
Input:  board = [['X','O','X'],['X','O','X']]
Output: [['X','O','X'],['X','O','X']]
```
The `'O'`s touch the top and bottom borders, so they survive.

**Example 3:**
```
Input:  board = [['X','X','X','X'],['X','O','O','X'],['X','X','O','X'],['X','O','X','X']]
Output: [['X','X','X','X'],['X','X','X','X'],['X','X','X','X'],['X','O','X','X']]
```
The inner region is captured; the border-touching `'O'` remains.

### Constraints
- `1 <= board.length, board[0].length <= 200`
- Each cell is `'X'` or `'O'`.

---

## Problem 26: Pacific Atlantic Water Flow

**LeetCode:** [417. Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/)

### Description
Given an `int[][]` `heights` grid, water can flow from a cell to a 4-adjacent cell of equal
or lower height. The Pacific Ocean borders the top and left edges; the Atlantic borders the
bottom and right edges. Return, as an `int[][]` list of `[row, col]` pairs sorted ascending
by row then column, every cell from which water can reach both oceans.

### Examples
**Example 1:**
```
Input:  heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
```
These ridge cells drain to both coasts.

**Example 2:**
```
Input:  heights = [[1]]
Output: [[0,0]]
```
The single cell touches every border.

**Example 3:**
```
Input:  heights = [[2,1],[1,2]]
Output: [[0,0],[0,1],[1,0],[1,1]]
```
Every cell borders both oceans directly.

### Constraints
- `1 <= heights.length, heights[0].length <= 200`
- `0 <= heights[i][j] <= 10^5`

---

## Problem 27: Clone Graph

**LeetCode:** [133. Clone Graph](https://leetcode.com/problems/clone-graph/)

### Description
An undirected connected graph is given by `vertexCount` and an `int[][]` adjacency list
`adj`, where `adj[u]` lists the neighbors of vertex `u`. Produce a deep copy and return it as
a fresh adjacency list (a brand-new `int[][]`, not the input array), with each neighbor list
sorted ascending. The clone must be structurally identical to the input.

### Examples
**Example 1:**
```
Input:  vertexCount = 4, adj = [[1,3],[0,2],[1,3],[0,2]]
Output: [[1,3],[0,2],[1,3],[0,2]]
```
A 4-cycle is copied edge for edge.

**Example 2:**
```
Input:  vertexCount = 1, adj = [[]]
Output: [[]]
```
A single isolated vertex copies to itself.

**Example 3:**
```
Input:  vertexCount = 2, adj = [[1],[0]]
Output: [[1],[0]]
```
A single edge is duplicated.

### Constraints
- `1 <= vertexCount <= 100`
- `adj[u]` contains distinct neighbors, none equal to `u`.
- The returned array must not share references with the input.

---

## Problem 28: Keys and Rooms

**LeetCode:** [841. Keys and Rooms](https://leetcode.com/problems/keys-and-rooms/)

### Description
There are `n` rooms labelled `0..n-1`, all locked except room `0`. You are given an `int[][]`
`rooms`, where `rooms[i]` lists the keys found in room `i` (each key opens the room with that
number). Starting in room `0`, return `true` if you can visit every room and `false`
otherwise.

### Examples
**Example 1:**
```
Input:  rooms = [[1],[2],[3],[]]
Output: true
```
Each room hands you the key to the next.

**Example 2:**
```
Input:  rooms = [[1,3],[3,0,1],[2],[0]]
Output: false
```
Room 2 is never unlocked.

**Example 3:**
```
Input:  rooms = [[1,2],[],[]]
Output: true
```
Room 0 alone holds keys to both other rooms.

### Constraints
- `2 <= n <= 1000`
- `0 <= rooms[i].length <= 1000`
- Keys are valid room labels in `0..n-1`.

---

## Problem 29: Find Eventual Safe States

**LeetCode:** [802. Find Eventual Safe States](https://leetcode.com/problems/find-eventual-safe-states/)

### Description
Given a directed graph as an `int[][]` adjacency list `graph` (where `graph[u]` lists the
out-neighbors of `u`), a node is *safe* if every path starting from it eventually reaches a
terminal node (one with no outgoing edges) — that is, it cannot reach any cycle. Return all
safe nodes in ascending order.

### Examples
**Example 1:**
```
Input:  graph = [[1,2],[2,3],[5],[0],[5],[],[]]
Output: [2, 4, 5, 6]
```
Nodes 0, 1, 3 can reach the cycle `0 -> 1 -> 3 -> 0`.

**Example 2:**
```
Input:  graph = [[],[0,2,3,4],[3],[4],[]]
Output: [0, 1, 2, 3, 4]
```
The graph is acyclic, so every node is safe.

**Example 3:**
```
Input:  graph = [[1],[2],[0]]
Output: []
```
Every node sits on the single 3-cycle.

### Constraints
- `1 <= graph.length <= 10^4`
- The total number of edges is at most `4 * 10^4`.

---

## Problem 30: Minimum Height Trees

**LeetCode:** [310. Minimum Height Trees](https://leetcode.com/problems/minimum-height-trees/)

### Description
A tree on `n` vertices labelled `0..n-1` is given by an `int[][]` edge list of `n - 1`
undirected edges. Rooting the tree at a vertex produces a height; return all root labels that
minimize that height (the centroids), in ascending order. There are always either one or two
such roots. Peel leaves layer by layer until one or two vertices remain.

### Examples
**Example 1:**
```
Input:  n = 4, edges = [[1,0],[1,2],[1,3]]
Output: [1]
```
Rooting at the star center gives height 1.

**Example 2:**
```
Input:  n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
Output: [3, 4]
```
Two adjacent centroids minimize the height.

**Example 3:**
```
Input:  n = 1, edges = []
Output: [0]
```
A single vertex is its own centroid.

### Constraints
- `1 <= n <= 2 * 10^4`
- `edges.length == n - 1` and the input forms a valid tree.

---
