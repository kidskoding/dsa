# Graph Algorithms: Problem Set

Every problem here is an implementation task: fill in the stub in `problemset/`
and make its test in `tests/problemset/` pass. The set is organized into two
groups. **Foundational** problems build the primitives you reuse everywhere —
walking edges, crossing cuts, counting components, validating spanning trees,
and reading bottlenecks. **Applied Problems** then weave real LeetCode and
contest-style challenges from easy to hard across the three big themes of
weighted graphs: shortest paths, minimum spanning trees, and maximum
flow / minimum cut. Applied problems take their weighted graphs as `int[][]`
edge lists `{u, v, w}` (or `{u, v, c}` for capacities); the Foundational tier
reuses the shared `WeightedGraph` helper directly.

**Foundational**

## Problem 1: Path Weight Validator

### Description

Given a `WeightedGraph` and an ordered list of vertices describing a walk,
compute the total weight of traversing that exact sequence. If any consecutive
pair in the list is not connected by an edge, the walk is invalid: return an
empty result instead of a weight. An empty path or a single-vertex path has
total weight `0`. When several edges connect the same pair, use the lightest
one.

### Examples

**Example 1:**
```
Input:  edges = [(0,1,4), (1,2,3)], path = [0, 1, 2]
Output: 7.0
```
The walk 0 → 1 → 2 uses edges of weight 4 and 3, totaling 7.

**Example 2:**
```
Input:  edges = [(0,1,4)], path = [0, 2]
Output: empty
```
There is no edge from 0 to 2, so the walk is invalid.

**Example 3:**
```
Input:  edges = [(0,1,4)], path = [0]
Output: 0.0
```
A single-vertex path traverses no edges.

### Constraints

- `0 <= path.size()`
- Vertices in `path` are valid indices of `graph`.
- Edge weights may be any `double`.

---

## Problem 2: Reachable Set Under Budget

### Description

Given a `WeightedGraph`, a source vertex, and a non-negative distance budget
`B`, return the set of every vertex whose shortest-path distance from the source
is at most `B`. The source itself is always included (distance `0`). Edge
weights are non-negative, so a Dijkstra-style relaxation finds the distances.

### Examples

**Example 1:**
```
Input:  edges = [(0,1,2), (1,2,2), (2,3,2)], source = 0, B = 4
Output: {0, 1, 2}
```
Distances from 0 are 0, 2, 4, 6; only the first three are within budget 4.

**Example 2:**
```
Input:  edges = [(0,1,5)], source = 0, B = 0
Output: {0}
```
Only the source is within a budget of 0.

**Example 3:**
```
Input:  edges = [(0,1,1), (0,2,1)], source = 0, B = 10
Output: {0, 1, 2}
```
Everything reachable fits inside a generous budget.

### Constraints

- `0 <= B`
- Edge weights are non-negative.
- `source` is a valid vertex.

---

## Problem 3: Lightest Edge Across a Cut

### Description

Given a `WeightedGraph` and a subset `S` of its vertices, find the
minimum-weight edge with exactly one endpoint in `S` — the cheapest edge
crossing the cut `(S, V \ S)`. Return that edge, or report that none exists when
the cut is empty (no edge has exactly one endpoint inside `S`). This is the
greedy step at the heart of Prim's algorithm.

### Examples

**Example 1:**
```
Input:  edges = [(0,1,5), (1,2,2), (0,2,9)], S = {0, 1}
Output: (1, 2, 2)
```
Edges crossing the cut are (1,2,2) and (0,2,9); the lighter is (1,2,2).

**Example 2:**
```
Input:  edges = [(0,1,5)], S = {0, 1}
Output: none
```
Both endpoints of the only edge are inside S, so no edge crosses.

**Example 3:**
```
Input:  edges = [(0,1,5), (2,3,1)], S = {0}
Output: (0, 1, 5)
```
Only (0,1) crosses; (2,3) lies entirely outside S.

### Constraints

- `S` is a subset of the graph's vertices.
- The graph may be treated as undirected.

---

## Problem 4: Count Connected Components

### Description

Treating the `WeightedGraph` as undirected (ignore edge directions and
weights), count the number of connected components. Isolated vertices each count
as their own component.

### Examples

**Example 1:**
```
Input:  vertexCount = 5, edges = [(0,1), (1,2), (3,4)]
Output: 2
```
{0,1,2} forms one component and {3,4} forms another.

**Example 2:**
```
Input:  vertexCount = 3, edges = []
Output: 3
```
With no edges, every vertex is isolated.

**Example 3:**
```
Input:  vertexCount = 4, edges = [(0,1), (1,2), (2,3)]
Output: 1
```
A single path links all four vertices.

### Constraints

- `0 <= vertexCount`
- Self-loops and parallel edges may appear.

---

## Problem 5: Spanning Tree Validator

### Description

Given a vertex count and a list of edges claimed to form a spanning tree, verify
that the edges connect every vertex without forming a cycle, and return the
total weight of the tree. If the edge set is not a valid spanning tree (wrong
edge count, a cycle, or a disconnected graph), return an empty result. A valid
spanning tree on `V` vertices has exactly `V - 1` edges, is acyclic, and is
connected.

### Examples

**Example 1:**
```
Input:  vertexCount = 3, edges = [(0,1,4), (1,2,3)]
Output: 7.0
```
Two edges connect all three vertices acyclically; total weight is 7.

**Example 2:**
```
Input:  vertexCount = 3, edges = [(0,1,4), (1,2,3), (0,2,1)]
Output: empty
```
Three edges on three vertices must contain a cycle, so this is not a tree.

**Example 3:**
```
Input:  vertexCount = 4, edges = [(0,1,1), (2,3,1)]
Output: empty
```
The edges leave the graph disconnected.

### Constraints

- `0 <= vertexCount`
- Edges are undirected.

---

## Problem 6: Bottleneck Of A Path

### Description

Given a `WeightedGraph` whose weights represent capacities and a fixed path
(an ordered list of vertices), return the bottleneck of the path: the minimum
edge capacity along it. If any consecutive pair is not connected, the path is
invalid and you return an empty result. When several edges connect a pair, the
widest (maximum-capacity) one is available to the path. A single-vertex path has
no edges; treat its bottleneck as positive infinity.

### Examples

**Example 1:**
```
Input:  edges = [(0,1,5), (1,2,3), (2,3,8)], path = [0, 1, 2, 3]
Output: 3.0
```
Capacities along the path are 5, 3, 8; the bottleneck is 3.

**Example 2:**
```
Input:  edges = [(0,1,5)], path = [0, 2]
Output: empty
```
No edge connects 0 and 2, so the path is invalid.

**Example 3:**
```
Input:  edges = [(0,1,5), (0,1,9)], path = [0, 1]
Output: 9.0
```
The path may use the wider of the two parallel edges.

### Constraints

- Capacities are positive.
- Vertices in `path` are valid indices.

---

**Applied Problems**

## Problem 7: Network Delay Time

**LeetCode:** [743. Network Delay Time](https://leetcode.com/problems/network-delay-time/)

### Description

A network of `n` nodes labeled `1..n` is described by directed, weighted travel
times `times[i] = {u, v, w}`, meaning a signal from `u` reaches `v` after `w`
units of time. A signal is sent from node `k`. Return the minimum time for the
signal to reach **all** `n` nodes, or `-1` if some node is unreachable. Run
Dijkstra from `k`; the answer is the largest finite distance.

### Examples

**Example 1:**
```
Input:  times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
Output: 2
```
From node 2: node 1 at time 1, node 3 at time 1, node 4 at time 2. The last to
hear is node 4 at time 2.

**Example 2:**
```
Input:  times = [[1,2,1]], n = 2, k = 1
Output: 1
```
The single edge delivers the signal to node 2 at time 1.

**Example 3:**
```
Input:  times = [[1,2,1]], n = 2, k = 2
Output: -1
```
Node 1 cannot be reached from node 2.

### Constraints

- `1 <= k <= n <= 100`
- `1 <= times.length <= 6000`
- `0 <= w <= 100`

---

## Problem 8: Path With Maximum Probability

**LeetCode:** [1514. Path with Maximum Probability](https://leetcode.com/problems/path-with-maximum-probability/)

### Description

You are given an undirected weighted graph of `n` nodes `0..n-1`, with edges
`edges[i] = {u, v}` where the success probability of traversing that edge is
`succProb[i]`. Return the maximum probability of success to go from `start` to
`end` (the product of edge probabilities along the path), or `0` if no path
exists. Because probabilities multiply and lie in `[0, 1]`, a Dijkstra-style
search that maximizes the running product (using a max-heap) finds the answer.

### Examples

**Example 1:**
```
Input:  n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.2], start = 0, end = 2
Output: 0.25
```
The path 0 → 1 → 2 has probability 0.5 * 0.5 = 0.25, beating the direct edge's 0.2.

**Example 2:**
```
Input:  n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.3], start = 0, end = 2
Output: 0.3
```
Now the direct edge (0.3) beats the two-hop path (0.25).

**Example 3:**
```
Input:  n = 3, edges = [[0,1]], succProb = [0.5], start = 0, end = 2
Output: 0.0
```
No path connects 0 to 2.

### Constraints

- `2 <= n <= 10^4`
- `0 <= start, end < n`
- `0 <= succProb[i] <= 1`

---

## Problem 9: Path With Minimum Effort

**LeetCode:** [1631. Path With Minimum Effort](https://leetcode.com/problems/path-with-minimum-effort/)

### Description

You are given a `rows x cols` grid `heights` where `heights[r][c]` is the height
of cell `(r, c)`. Travel from the top-left cell to the bottom-right cell, moving
up, down, left, or right. The **effort** of a route is the maximum absolute
height difference between two consecutive cells along it. Return the minimum
effort required. A Dijkstra-style bottleneck search — where a path's cost is the
max edge weight rather than the sum — solves it.

### Examples

**Example 1:**
```
Input:  heights = [[1,2,2],[3,8,2],[5,3,5]]
Output: 2
```
The route 1→3→5→3→5 has a maximum adjacent difference of 2, better than routes
through the 8.

**Example 2:**
```
Input:  heights = [[1,2,3],[3,8,4],[5,3,5]]
Output: 1
```
The route 1→2→3→4→5 keeps every step within difference 1.

**Example 3:**
```
Input:  heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]
Output: 0
```
A path of all-equal heights exists, so the effort is 0.

### Constraints

- `1 <= rows, cols <= 100`
- `1 <= heights[r][c] <= 10^6`

---

## Problem 10: Min Cost To Connect All Points

**LeetCode:** [1584. Min Cost to Connect All Points](https://leetcode.com/problems/min-cost-to-connect-all-points/)

### Description

You are given `points` on a 2D plane, where `points[i] = {xi, yi}`. The cost of
connecting two points is the Manhattan distance between them,
`|xi - xj| + |yi - yj|`. Return the minimum total cost to connect all points so
that there is exactly one simple path between any two points. This is a minimum
spanning tree over the complete graph of Manhattan distances (Prim's or
Kruskal's).

### Examples

**Example 1:**
```
Input:  points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
Output: 20
```
A minimum spanning tree of the Manhattan-distance graph has total weight 20.

**Example 2:**
```
Input:  points = [[3,12],[-2,5],[-4,1]]
Output: 18
```
Connecting the three points along the cheapest two edges costs 18.

**Example 3:**
```
Input:  points = [[0,0]]
Output: 0
```
A single point needs no connections.

### Constraints

- `1 <= points.length <= 1000`
- `-10^6 <= xi, yi <= 10^6`
- All points are distinct.

---

## Problem 11: Cheapest Flights Within K Stops

**LeetCode:** [787. Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/)

### Description

There are `n` cities `0..n-1` connected by directed flights
`flights[i] = {from, to, price}`. Return the cheapest price from `src` to `dst`
using **at most** `k` intermediate stops, or `-1` if there is no such route. A
hop-bounded Bellman-Ford (relax all edges `k + 1` rounds over a snapshot of the
previous round's distances) respects the stop limit cleanly.

### Examples

**Example 1:**
```
Input:  n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1
Output: 700
```
0 → 1 → 3 costs 700 with one stop; the cheaper 0 → 1 → 2 → 3 (500) needs two
stops and is disallowed.

**Example 2:**
```
Input:  n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1
Output: 200
```
0 → 1 → 2 (one stop) costs 200, beating the direct 500.

**Example 3:**
```
Input:  n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0
Output: 500
```
With no stops allowed, only the direct flight qualifies.

### Constraints

- `1 <= n <= 100`
- `0 <= flights.length <= n * (n - 1)`
- `1 <= price <= 10^4`
- `0 <= k < n`

---

## Problem 12: Find The City With The Smallest Number Of Neighbors

**LeetCode:** [1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance](https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/)

### Description

There are `n` cities `0..n-1` connected by weighted bidirectional roads
`edges[i] = {u, v, w}`. For a given `distanceThreshold`, find the city that can
reach the fewest other cities within that threshold distance. If multiple cities
tie, return the one with the **greatest** label. All-pairs shortest paths
(Floyd-Warshall) computes the reachability counts directly.

### Examples

**Example 1:**
```
Input:  n = 4, edges = [[0,1,3],[1,2,1],[1,3,4],[2,3,1]], distanceThreshold = 4
Output: 3
```
City 3 reaches only cities 1 and 2 within distance 4 (tied for fewest with city
0), and 3 is the larger label.

**Example 2:**
```
Input:  n = 5, edges = [[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]], distanceThreshold = 2
Output: 0
```
City 0 reaches only city 1 within distance 2 — the fewest of all cities.

**Example 3:**
```
Input:  n = 2, edges = [[0,1,10]], distanceThreshold = 5
Output: 1
```
Neither city reaches the other; both tie at 0, so the larger label 1 wins.

### Constraints

- `2 <= n <= 100`
- `1 <= w, distanceThreshold <= 10^4`

---

## Problem 13: Swim In Rising Water

**LeetCode:** [778. Swim in Rising Water](https://leetcode.com/problems/swim-in-rising-water/)

### Description

You are given an `n x n` grid where `grid[r][c]` is the elevation of cell
`(r, c)`. At time `t`, every cell with elevation at most `t` is submerged and
swimmable. Starting at `(0, 0)`, you may swim 4-directionally to adjacent cells
that are submerged. Return the least time `t` at which you can reach the
bottom-right cell `(n-1, n-1)`. This is a minimax-path / bottleneck shortest path
on cell elevations.

### Examples

**Example 1:**
```
Input:  grid = [[0,2],[1,3]]
Output: 3
```
You cannot move until time 3, when cell (1,1) with elevation 3 becomes
swimmable, completing the route 0 → 1 → 3.

**Example 2:**
```
Input:  grid = [[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]]
Output: 16
```
The optimal route waits until time 16, the highest elevation it must cross.

**Example 3:**
```
Input:  grid = [[0,1],[2,3]]
Output: 3
```
Reaching (1,1) requires its elevation 3 to be submerged.

### Constraints

- `n == grid.length == grid[i].length`
- `1 <= n <= 50`
- `grid[i][j]` is a permutation of `0..n*n-1`.

---

## Problem 14: Minimum Cost To Reach Destination In Time

**LeetCode:** [1928. Minimum Cost to Reach Destination in Time](https://leetcode.com/problems/minimum-cost-to-reach-destination-in-time/)

### Description

There are `n` cities `0..n-1` connected by bidirectional roads
`edges[i] = {u, v, time}`, where `time` is the minutes to traverse road `i`.
Each city `j` has a passing fee `passingFees[j]` charged every time you are at
that city (including the start and end). Starting at city `0` with a time budget
of `maxTime` minutes, return the **minimum total passing fee** to reach city
`n-1` within the budget, or `-1` if impossible. State is `(city, timeUsed)`;
relax with a Dijkstra-style search keyed on cost subject to the time bound.

### Examples

**Example 1:**
```
Input:  maxTime = 30, edges = [[0,1,10],[1,2,10],[2,5,10],[0,3,1],[3,4,10],[4,5,15]],
        passingFees = [5,1,2,20,20,3]
Output: 11
```
The route 0 → 1 → 2 → 5 takes 30 minutes and pays fees 5 + 1 + 2 + 3 = 11.

**Example 2:**
```
Input:  maxTime = 29, edges = [[0,1,10],[1,2,10],[2,5,10],[0,3,1],[3,4,10],[4,5,15]],
        passingFees = [5,1,2,20,20,3]
Output: 48
```
With one fewer minute the cheap route is too slow, forcing a costlier one.

**Example 3:**
```
Input:  maxTime = 25, edges = [[0,1,10],[1,2,10],[2,5,10],[0,3,1],[3,4,10],[4,5,15]],
        passingFees = [5,1,2,20,20,3]
Output: -1
```
No route reaches city 5 within 25 minutes.

### Constraints

- `1 <= n <= 1000`
- `1 <= maxTime <= 1000`
- `1 <= passingFees[j] <= 1000`

---

## Problem 15: The Maze II — Shortest Roll To Destination

**LeetCode:** [505. The Maze II](https://leetcode.com/problems/the-maze-ii/)

### Description

A ball rolls through a maze given as a grid of `0` (empty) and `1` (wall). From a
`start` cell the ball can roll up, down, left, or right, and it does not stop
until it hits a wall. Given `start` and `destination` cells, return the shortest
distance (number of empty cells the ball travels, not counting the start) for the
ball to stop at the destination, or `-1` if it cannot. Model each "roll until a
wall" as a weighted edge and run Dijkstra over stop positions.

### Examples

**Example 1:**
```
Input:  maze = [[0,0,1,0,0],[0,0,0,0,0],[0,0,0,1,0],[1,1,0,1,1],[0,0,0,0,0]],
        start = [0,4], destination = [4,4]
Output: 12
```
The ball can stop at the destination after rolling a total of 12 cells.

**Example 2:**
```
Input:  maze = [[0,0,1,0,0],[0,0,0,0,0],[0,0,0,1,0],[1,1,0,1,1],[0,0,0,0,0]],
        start = [0,4], destination = [3,2]
Output: -1
```
The ball cannot stop at (3,2); it always rolls past.

**Example 3:**
```
Input:  maze = [[0,0],[0,0]], start = [0,0], destination = [1,1]
Output: 2
```
Roll right then down (or down then right) to stop in the corner after 2 cells.

### Constraints

- `1 <= rows, cols <= 100`
- `start` and `destination` are empty cells.

---

## Problem 16: Frostbite Supply Lines

### Description

An outpost network has `n` depots `0..n-1` joined by undirected supply roads
`roads[i] = {u, v, w}`, where `w` is the road's snow depth. A convoy crosses a
road only if its plow rating is at least that road's snow depth. Return the
minimum single plow rating `r` such that the roads with `w <= r` connect all `n`
depots, or `-1` if no rating connects them. This is the bottleneck / minimax
spanning tree problem: the answer is the largest edge weight in a minimum
spanning tree.

### Examples

**Example 1:**
```
Input:  n = 4, roads = [[0,1,3],[1,2,1],[2,3,4],[0,3,2]]
Output: 3
```
Using roads of depth ≤ 3 connects all depots; depth 2 alone does not.

**Example 2:**
```
Input:  n = 3, roads = [[0,1,5],[1,2,5]]
Output: 5
```
Both roads share depth 5 and are both required to connect the depots.

**Example 3:**
```
Input:  n = 3, roads = [[0,1,2]]
Output: -1
```
Depot 2 is isolated; no rating connects the network.

### Constraints

- `1 <= n <= 10^5`
- `0 <= w <= 10^9`

---

## Problem 17: Festival Stage Cabling

### Description

A festival must power `n` stages `0..n-1`; stage `0` holds the generator.
Candidate undirected cables `cables[i] = {u, v, w}` connect two stages at install
cost `w`. With a total `budget`, install cables greedily from cheapest to most
expensive (skipping any cable whose two stages are already in one component, and
any cable that would push the running total over budget). Return the maximum
number of stages — including stage `0` — drawn into a single powered component
connected to the generator.

### Examples

**Example 1:**
```
Input:  n = 4, cables = [[0,1,1],[1,2,2],[2,3,5]], budget = 3
Output: 3
```
Install (0,1,1) and (1,2,2) for total 3; the (2,3) cable would overspend, so
stages {0,1,2} are powered.

**Example 2:**
```
Input:  n = 3, cables = [[0,1,4]], budget = 2
Output: 1
```
No affordable cable touches the generator, so only stage 0 is powered.

**Example 3:**
```
Input:  n = 4, cables = [[1,2,1],[2,3,1]], budget = 10
Output: 1
```
The affordable cables form a component {1,2,3} disconnected from the generator;
only stage 0 stays powered.

### Constraints

- `1 <= n <= 10^5`
- `0 <= w <= 10^9`
- `0 <= budget <= 10^14`

---

## Problem 18: Galactic Courier

### Description

The Galactic Courier Guild has `n` relay stations `0..n-1` joined by
bidirectional warp lanes `lanes[i] = {u, v, w}` with fuel cost `w`. Some lanes
are boosted (`boosted[i] == true`): using a boosted lane halves its cost via
integer division (`w / 2`). A courier travelling from `src` to `dst` may apply
the boost to **at most one** lane over the whole trip. Return the minimum total
fuel from `src` to `dst`, or `-1` if `dst` is unreachable. Run a layered
Dijkstra over states `(station, boostUsed)`.

### Examples

**Example 1:**
```
Input:  n = 3, lanes = [[0,1,10],[1,2,10]], boosted = [false, true], src = 0, dst = 2
Output: 15
```
Boosting the second lane gives 10 + 10/2 = 15.

**Example 2:**
```
Input:  n = 3, lanes = [[0,1,4],[1,2,4],[0,2,10]], boosted = [false,false,true], src = 0, dst = 2
Output: 5
```
Boosting the direct lane costs 10/2 = 5, beating the unboosted 8.

**Example 3:**
```
Input:  n = 2, lanes = [], boosted = [], src = 0, dst = 1
Output: -1
```
No lanes connect the stations.

### Constraints

- `1 <= n <= 10^5`
- `0 <= w <= 10^9`
- Lanes may repeat; the graph may be disconnected.

---

## Problem 19: Toll Road Reimbursement

### Description

A company runs trucks across `n` cities `0..n-1` over directed toll roads
`roads[i] = {u, v, w}`. Promotions can make a toll negative (a rebate), but the
network has **no negative-cost cycle**. From headquarters at city `0`, return an
array `cost` of length `n` where `cost[v]` is the minimum net toll from city `0`
to city `v`, using `Integer.MAX_VALUE` for any unreachable city. Negative weights
rule out Dijkstra; use Bellman-Ford.

### Examples

**Example 1:**
```
Input:  n = 3, roads = [[0,1,4],[1,2,-2],[0,2,5]]
Output: [0, 4, 2]
```
City 2 is cheaper via 0 → 1 → 2 (4 + (-2) = 2) than the direct edge of 5.

**Example 2:**
```
Input:  n = 3, roads = [[0,1,1]]
Output: [0, 1, 2147483647]
```
City 2 is unreachable, so it stays at `Integer.MAX_VALUE`.

**Example 3:**
```
Input:  n = 2, roads = [[0,1,-3]]
Output: [0, -3]
```
A single rebate edge yields a negative net toll.

### Constraints

- `1 <= n <= 2000`
- `-10^4 <= w <= 10^4`
- No negative-cost cycle exists.

---

## Problem 20: Shortest Path With Exactly K Edges

### Description

Given a `WeightedGraph`, a source, a sink, and an integer `k`, compute the
minimum-weight **walk** from source to sink that uses exactly `k` edges (vertices
and edges may repeat), or report that none exists. Dynamic programming over the
number of edges used — `best[e][v]` = min weight to reach `v` in exactly `e`
edges — solves it in `O(k * E)` time.

### Examples

**Example 1:**
```
Input:  edges = [(0,1,2), (1,2,3), (0,2,10)], source = 0, sink = 2, k = 2
Output: 5.0
```
The two-edge walk 0 → 1 → 2 costs 5; the direct edge uses only one edge.

**Example 2:**
```
Input:  edges = [(0,1,2), (1,2,3), (0,2,4)], source = 0, sink = 2, k = 1
Output: 4.0
```
Exactly one edge forces the direct route of weight 4.

**Example 3:**
```
Input:  edges = [(0,1,2)], source = 0, sink = 2, k = 3
Output: empty
```
No 3-edge walk reaches the sink.

### Constraints

- `0 <= k`
- Edge weights may be any `double`.
- Walks may repeat vertices and edges.

---

## Problem 21: Second-Best Minimum Spanning Tree

### Description

Given an undirected `WeightedGraph`, compute the weight of the **second-best**
spanning tree: the minimum weight over all spanning trees that differ from a
minimum spanning tree in at least one edge. Build an MST, then for each non-tree
edge consider swapping it in and removing the heaviest tree edge on the cycle it
creates; the smallest resulting increase gives the second-best total. Assume the
graph is connected with at least two distinct spanning trees.

### Examples

**Example 1:**
```
Input:  edges = [(0,1,1), (1,2,2), (0,2,3)]
Output: 4.0
```
The MST {(0,1),(1,2)} weighs 3; the cheapest single swap (drop (1,2), add (0,2))
gives 1 + 3 = 4.

**Example 2:**
```
Input:  edges = [(0,1,1), (1,2,1), (0,2,1)]
Output: 2.0
```
Every spanning tree weighs 2, so the second-best also weighs 2.

**Example 3:**
```
Input:  edges = [(0,1,1), (1,2,2), (2,3,3), (0,3,4)]
Output: 7.0
```
The MST weighs 6; the cheapest swap raises it to 7.

### Constraints

- The graph is connected and undirected.
- At least two distinct spanning trees exist.

---

## Problem 22: Aqueduct Throughput (Maximum Flow)

### Description

An aqueduct routes water from spring `source` to cistern `sink` over `n`
junctions `0..n-1`. Directed pipes `pipes[i] = {u, v, c}` each carry up to `c`
litres per second from `u` to `v`; water is conserved at every junction except
the source and sink. Return the maximum sustained throughput from `source` to
`sink`. Build a residual network and run a max-flow algorithm (Edmonds-Karp:
repeatedly find an augmenting path by BFS and push its bottleneck until none
remain).

### Examples

**Example 1:**
```
Input:  n = 4, pipes = [[0,1,3],[0,2,2],[1,2,1],[1,3,2],[2,3,3]], source = 0, sink = 3
Output: 4
```
Two augmenting paths saturate the cut into the sink at total throughput 4.

**Example 2:**
```
Input:  n = 3, pipes = [[0,1,7],[1,2,4]], source = 0, sink = 2
Output: 4
```
The narrower pipe (capacity 4) limits the series throughput.

**Example 3:**
```
Input:  n = 2, pipes = [[0,1,5],[0,1,3]], source = 0, sink = 1
Output: 8
```
Two parallel pipes add their capacities for total throughput 8.

### Constraints

- `2 <= n <= 500`
- `1 <= c <= 10^4`
- Total capacity fits in an `int`.

---

## Problem 23: Evacuation Choke Point (Minimum Cut)

### Description

A coastal town has `n` intersections `0..n-1` and undirected roads
`roads[i] = {u, v, c}` with per-hour vehicle capacity `c`. During an evacuation,
vehicles flow from town center `source` to the on-ramp `sink`. Return the minimum
total capacity that, if removed, would cut `source` off from `sink`. By the
max-flow / min-cut theorem this equals the maximum evacuation throughput. Model
each undirected road as two opposing directed arcs of capacity `c`.

### Examples

**Example 1:**
```
Input:  n = 4, roads = [[0,1,3],[1,3,3],[0,2,2],[2,3,2]], source = 0, sink = 3
Output: 5
```
The two disjoint routes carry 3 and 2, so cutting capacity 5 separates source
from sink.

**Example 2:**
```
Input:  n = 3, roads = [[0,1,4],[1,2,4]], source = 0, sink = 2
Output: 4
```
Cutting either road (capacity 4) breaks the only path.

**Example 3:**
```
Input:  n = 4, roads = [[0,1,5]], source = 0, sink = 3
Output: 0
```
The sink is already disconnected; no capacity need be removed.

### Constraints

- `2 <= n <= 500`
- `1 <= c <= 10^4`

---

## Problem 24: Vertex-Capacitated Max Flow

### Description

Given a directed flow network on `n` vertices `0..n-1` with edge capacities
`edges[i] = {u, v, c}` **and** a per-vertex capacity `vertexCap[v]` limiting the
total flow that may pass through vertex `v` (the source and sink are
uncapacitated), compute the maximum flow from `source` to `sink`. Use the
vertex-splitting trick: replace each vertex `v` with an in-node and an out-node
joined by an edge of capacity `vertexCap[v]`, then run ordinary max flow.

### Examples

**Example 1:**
```
Input:  n = 3, edges = [[0,1,10],[1,2,10]], vertexCap = [99,4,99], source = 0, sink = 2
Output: 4
```
Vertex 1 throttles the series flow to 4 despite the wide edges.

**Example 2:**
```
Input:  n = 4, edges = [[0,1,5],[0,2,5],[1,3,5],[2,3,5]], vertexCap = [99,3,3,99], source = 0, sink = 3
Output: 6
```
Two paths each capped at 3 by their middle vertex yield 6.

**Example 3:**
```
Input:  n = 2, edges = [[0,1,7]], vertexCap = [99,99], source = 0, sink = 1
Output: 7
```
With uncapped endpoints the single edge passes its full capacity.

### Constraints

- `2 <= n <= 200`
- `1 <= c <= 10^4`
- `1 <= vertexCap[v] <= 10^4`

---

## Problem 25: Minimum-Cost Maximum Flow

### Description

Given a directed network on `n` vertices `0..n-1` where each edge
`edges[i] = {u, v, cap, cost}` has a capacity and a per-unit-flow cost, compute
the **minimum total cost** among all flows that achieve the maximum flow value
from `source` to `sink`. Repeatedly send flow along the cheapest augmenting path
(shortest path by cost in the residual graph, e.g. via Bellman-Ford / SPFA),
saturating its bottleneck, until no augmenting path remains.

### Examples

**Example 1:**
```
Input:  n = 4, edges = [[0,1,3,1],[0,2,2,2],[1,3,2,1],[2,3,3,1],[1,2,1,1]],
        source = 0, sink = 3
Output: 9
```
The maximum flow is 4; routing it along the cheapest paths costs 9 in total.

**Example 2:**
```
Input:  n = 3, edges = [[0,1,5,2],[1,2,5,3]], source = 0, sink = 2
Output: 25
```
All 5 units travel the only route at unit cost 2 + 3 = 5, for 25 total.

**Example 3:**
```
Input:  n = 3, edges = [[0,1,4,1],[0,2,4,5],[1,2,4,1]], source = 0, sink = 2
Output: 8
```
Four units along 0 → 1 → 2 (unit cost 2) beat the costly direct edge.

### Constraints

- `2 <= n <= 200`
- `1 <= cap <= 10^4`
- `0 <= cost <= 10^4`

---

## Problem 26: Reconnecting The Country After Road Closures

**LeetCode:** [1489. Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree](https://leetcode.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/)

### Description

You have `n` cities `0..n-1` and a list of weighted undirected edges
`edges[i] = {u, v, w}` (edge `i` is identified by its index). An edge is
**critical** if removing it increases the weight of any minimum spanning tree (or
disconnects the graph); it is **pseudo-critical** if it appears in some MST but
not all. Return the two index lists `{critical, pseudoCritical}`. Compare MST
weights with each edge force-excluded and force-included against the baseline MST
weight.

### Examples

**Example 1:**
```
Input:  n = 5, edges = [[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]]
Output: critical = [0,1], pseudoCritical = [2,3,4,5]
```
Edges 0 and 1 are in every MST; edges 2–5 appear in some but not all.

**Example 2:**
```
Input:  n = 4, edges = [[0,1,1],[1,2,1],[2,3,1],[0,3,1]]
Output: critical = [], pseudoCritical = [0,1,2,3]
```
All four equal-weight edges are interchangeable, so none is critical.

**Example 3:**
```
Input:  n = 3, edges = [[0,1,1],[1,2,2]]
Output: critical = [0,1], pseudoCritical = []
```
Both edges are needed to span three vertices, so both are critical.

### Constraints

- `2 <= n <= 100`
- `1 <= edges.length <= min(200, n * (n - 1) / 2)`
- `1 <= w <= 1000`

---

## Problem 27: Distribute Water With Optimal Supply

**LeetCode:** [1168. Optimize Water Distribution in a Village](https://leetcode.com/problems/optimize-water-distribution-in-a-village/)

### Description

There are `n` houses `1..n`. Supplying water to a house costs either `wells[i]`
(building a well at house `i+1`) or the cost of a pipe `pipes[j] = {u, v, w}`
connecting it to another supplied house. Return the minimum total cost to supply
water to every house. The classic trick adds a virtual node `0` connected to each
house `i` with an edge of weight `wells[i-1]`, turning the problem into a single
minimum spanning tree.

### Examples

**Example 1:**
```
Input:  n = 3, wells = [1,2,2], pipes = [[1,2,1],[2,3,1]]
Output: 3
```
Build a well at house 1 (cost 1) and lay pipes 1–2 and 2–3 (cost 1 each).

**Example 2:**
```
Input:  n = 2, wells = [1,1], pipes = [[1,2,1]]
Output: 2
```
Two wells (cost 1 each) beat one well plus the pipe.

**Example 3:**
```
Input:  n = 1, wells = [5], pipes = []
Output: 5
```
The only option is to build the single well.

### Constraints

- `1 <= n <= 10^4`
- `wells.length == n`
- `0 <= pipes.length <= 10^4`
- `1 <= wells[i], w <= 10^5`

---

## Problem 28: Number Of Ways To Arrive At Destination

**LeetCode:** [1976. Number of Ways to Arrive at Destination](https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/)

### Description

A city has `n` intersections `0..n-1` joined by bidirectional roads
`roads[i] = {u, v, time}`. Starting at intersection `0`, return the number of
**different shortest-time paths** that arrive at intersection `n-1`. Because the
count can be large, return it modulo `10^9 + 7`. Run Dijkstra and, alongside the
shortest distances, accumulate path counts: when a strictly shorter route to a
node is found, reset its count; when an equally short route is found, add to it.

### Examples

**Example 1:**
```
Input:  n = 7, roads = [[0,6,7],[0,1,2],[1,2,3],[1,3,3],[6,3,3],[3,5,1],[6,5,1],[2,5,1],[0,4,5],[4,6,2]]
Output: 4
```
The shortest time from 0 to 6 is 7, reachable by 4 distinct paths.

**Example 2:**
```
Input:  n = 2, roads = [[0,1,1]]
Output: 1
```
A single road gives exactly one shortest path.

**Example 3:**
```
Input:  n = 3, roads = [[0,1,1],[1,2,1],[0,2,2]]
Output: 2
```
Both 0 → 2 directly and 0 → 1 → 2 take time 2, so there are 2 shortest paths.

### Constraints

- `1 <= n <= 200`
- `1 <= roads.length <= n * (n - 1) / 2`
- `1 <= time <= 10^9`

---
