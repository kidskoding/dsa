# Disjoint Sets: Problem Set

Every problem is an implementation task: fill in the stub in `problemset/` and make
its test in `tests/problemset/` pass. The theme throughout is connectivity, merging,
and grouping — friend circles, islands, redundant connections, account merges, and
Kruskal-style spanning trees — all powered by a union-find (disjoint set) structure.
The set opens with foundational union-find usage, then weaves through applied LeetCode
and contest-style problems, easy to hard.

**Foundational**

## Problem 1: Count Connected Components

**LeetCode:** [323. Number of Connected Components in an Undirected Graph](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/)

### Description
You are given `n` nodes labelled `0` to `n - 1` and a list of undirected `edges`,
where each edge `[u, v]` connects nodes `u` and `v`. Return the number of connected
components in the graph.

Build a union-find over the `n` nodes, union the endpoints of every edge, then count
the number of distinct representatives (roots).

### Examples
**Example 1:**
```
Input:  n = 5, edges = [[0,1],[1,2],[3,4]]
Output: 2
```
Nodes `{0,1,2}` form one component and `{3,4}` form another.

**Example 2:**
```
Input:  n = 5, edges = [[0,1],[1,2],[2,3],[3,4]]
Output: 1
```
All nodes are chained into a single component.

**Example 3:**
```
Input:  n = 4, edges = []
Output: 4
```
With no edges, every node is its own component.

### Constraints
- `1 <= n <= 2000`
- `0 <= edges.length <= 5000`
- `edges[i].length == 2`
- `0 <= u, v < n`
- There are no self-loops or repeated edges.

---

## Problem 2: Detect a Cycle in an Undirected Graph

**LeetCode:** [261. Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree/)

### Description
Given `n` nodes labelled `0` to `n - 1` and a list of undirected `edges`, return
`true` if the graph contains a cycle, and `false` otherwise.

Process edges one at a time with a union-find. If the two endpoints of an edge already
share a representative before you union them, that edge closes a cycle.

### Examples
**Example 1:**
```
Input:  n = 3, edges = [[0,1],[1,2],[2,0]]
Output: true
```
The third edge connects two nodes already joined through `0-1-2`, forming a cycle.

**Example 2:**
```
Input:  n = 4, edges = [[0,1],[1,2],[2,3]]
Output: false
```
The edges form a simple path with no cycle.

**Example 3:**
```
Input:  n = 2, edges = []
Output: false
```
No edges means no cycle.

### Constraints
- `1 <= n <= 2000`
- `0 <= edges.length <= 5000`
- `edges[i].length == 2`
- `0 <= u, v < n`

---

## Problem 3: Redundant Connection

**LeetCode:** [684. Redundant Connection](https://leetcode.com/problems/redundant-connection/)

### Description
A graph started as a tree with `n` nodes labelled `1` to `n`, then exactly one extra
edge was added. The resulting graph has `n` edges. Return the one edge that can be
removed so the remaining graph is a tree. If multiple answers qualify, return the edge
that appears last in the input.

Union endpoints in input order; the first edge whose endpoints are already connected is
the redundant one.

### Examples
**Example 1:**
```
Input:  edges = [[1,2],[1,3],[2,3]]
Output: [2,3]
```
The edge `[2,3]` connects two nodes already joined through node `1`.

**Example 2:**
```
Input:  edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
Output: [1,4]
```
`[1,4]` closes the cycle `1-2-3-4-1`.

**Example 3:**
```
Input:  edges = [[1,2],[2,3],[1,3]]
Output: [1,3]
```
`[1,3]` is the last edge whose endpoints were already connected.

### Constraints
- `3 <= n <= 1000`
- `edges.length == n`
- `edges[i].length == 2`
- `1 <= ai < bi <= n`
- The given graph is connected and contains exactly one extra edge.

---

## Problem 4: Largest Set Size

**LeetCode:** ### Description
You are given `n` elements labelled `0` to `n - 1` and a sequence of union operations,
each a pair `[a, b]` that merges the sets containing `a` and `b`. After applying all
unions, return the size of the largest resulting set.

Track set sizes as you union (union by size makes this natural), then return the
maximum size over all roots.

### Examples
**Example 1:**
```
Input:  n = 6, unions = [[0,1],[1,2],[3,4]]
Output: 3
```
Set `{0,1,2}` has size 3; `{3,4}` has size 2; `{5}` has size 1.

**Example 2:**
```
Input:  n = 4, unions = []
Output: 1
```
With no unions, every set is a singleton.

**Example 3:**
```
Input:  n = 5, unions = [[0,1],[2,3],[3,4],[2,4]]
Output: 3
```
Set `{2,3,4}` reaches size 3; the redundant union `[2,4]` does not change sizes.

### Constraints
- `1 <= n <= 10^5`
- `0 <= unions.length <= 10^5`
- `0 <= a, b < n`

---

## Problem 5: Are All Elements Connected?

**LeetCode:** ### Description
You are given `n` elements labelled `0` to `n - 1` and a list of union operations.
After applying all of them, return `true` if every element belongs to a single set,
and `false` otherwise.

Apply the unions, then check that the number of distinct representatives is exactly one.

### Examples
**Example 1:**
```
Input:  n = 3, unions = [[0,1],[1,2]]
Output: true
```
All three elements end up in one set.

**Example 2:**
```
Input:  n = 4, unions = [[0,1],[2,3]]
Output: false
```
Two separate sets `{0,1}` and `{2,3}` remain.

**Example 3:**
```
Input:  n = 1, unions = []
Output: true
```
A single element is trivially fully connected.

### Constraints
- `1 <= n <= 10^5`
- `0 <= unions.length <= 10^5`
- `0 <= a, b < n`

---

**Applied Problems**

## Problem 6: Number of Provinces

**LeetCode:** [547. Number of Provinces](https://leetcode.com/problems/number-of-provinces/)

### Description
There are `n` cities. Some are directly connected. A province is a group of cities
that are directly or indirectly connected, with no city outside the group. You are
given an `n x n` matrix `isConnected` where `isConnected[i][j] = 1` means city `i` and
city `j` are directly connected, and `0` means they are not. Return the total number
of provinces.

The matrix is symmetric with ones on the diagonal. Union city `i` with city `j`
whenever `isConnected[i][j] == 1`, then count the components.

### Examples
**Example 1:**
```
Input:  isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2
```
Cities `0` and `1` form one province; city `2` forms another.

**Example 2:**
```
Input:  isConnected = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
```
No city is connected to any other, so each is its own province.

**Example 3:**
```
Input:  isConnected = [[1,1,1],[1,1,1],[1,1,1]]
Output: 1
```
Every city is connected, forming a single province.

### Constraints
- `1 <= n <= 200`
- `isConnected[i].length == n`
- `isConnected[i][j]` is `0` or `1`
- `isConnected[i][i] == 1`
- `isConnected[i][j] == isConnected[j][i]`

---

## Problem 7: Find if Path Exists in Graph

**LeetCode:** [1971. Find if Path Exists in Graph](https://leetcode.com/problems/find-if-path-exists-in-graph/)

### Description
There is a bidirectional graph with `n` vertices labelled `0` to `n - 1`, described by
a list of `edges` where each `edges[i] = [ui, vi]`. Given a `source` and a
`destination` vertex, return `true` if a path exists between them.

Union every edge, then return whether `source` and `destination` share a representative.

### Examples
**Example 1:**
```
Input:  n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
Output: true
```
A path `0 -> 2` exists directly through the edge `[2,0]`.

**Example 2:**
```
Input:  n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
Output: false
```
Vertices `0` and `5` lie in different components.

**Example 3:**
```
Input:  n = 1, edges = [], source = 0, destination = 0
Output: true
```
A vertex always has a path to itself.

### Constraints
- `1 <= n <= 2 * 10^5`
- `0 <= edges.length <= 2 * 10^5`
- `edges[i].length == 2`
- `0 <= ui, vi, source, destination < n`

---

## Problem 8: Satisfiability of Equality Equations

**LeetCode:** [990. Satisfiability of Equality Equations](https://leetcode.com/problems/satisfiability-of-equality-equations/)

### Description
You are given an array of strings `equations` representing relationships between
single-lowercase-letter variables. Each string is either `"a==b"` or `"a!=b"`. Return
`true` if it is possible to assign integers to the variables so that every equation is
satisfied.

Union all variables joined by `==`. Then for every `!=` equation, verify its two
variables are not in the same set.

### Examples
**Example 1:**
```
Input:  equations = ["a==b","b!=a"]
Output: false
```
`a == b` forces them equal, but `b != a` requires them different.

**Example 2:**
```
Input:  equations = ["b==a","a==b"]
Output: true
```
Both equations agree; assigning `a = b = 1` works.

**Example 3:**
```
Input:  equations = ["a==b","b==c","a!=c"]
Output: false
```
Transitivity forces `a == c`, contradicting `a != c`.

### Constraints
- `1 <= equations.length <= 500`
- `equations[i].length == 4`
- `equations[i][0]` and `equations[i][3]` are lowercase letters
- `equations[i][1]` is either `=` or `!`
- `equations[i][2]` is `=`

---

## Problem 9: Number of Operations to Make Network Connected

**LeetCode:** [1319. Number of Operations to Make Network Connected](https://leetcode.com/problems/number-of-operations-to-make-network-connected/)

### Description
There are `n` computers labelled `0` to `n - 1` connected by `connections`, where each
`connections[i] = [ai, bi]` is a cable between two computers. You may unplug any cable
and reconnect it between any pair of computers. Return the minimum number of cables you
must move to connect all computers, or `-1` if it is impossible.

You need at least `n - 1` cables. Count components `c` with union-find; the answer is
`c - 1`, since each spare (cycle-forming) cable can bridge one extra component.

### Examples
**Example 1:**
```
Input:  n = 4, connections = [[0,1],[0,2],[1,2]]
Output: 1
```
There is one redundant cable; moving it joins the isolated computer `3`.

**Example 2:**
```
Input:  n = 6, connections = [[0,1],[0,2],[0,3],[1,2],[1,3]]
Output: 2
```
Two redundant cables connect the two remaining isolated computers.

**Example 3:**
```
Input:  n = 6, connections = [[0,1],[0,2],[0,3],[1,2]]
Output: -1
```
With only 4 cables for 6 computers (fewer than `n - 1 = 5`), connection is impossible.

### Constraints
- `1 <= n <= 10^5`
- `1 <= connections.length <= min(n * (n - 1) / 2, 10^5)`
- `connections[i].length == 2`
- `0 <= ai, bi < n`
- There are no repeated connections or self-loops.

---

## Problem 10: Number of Islands

**LeetCode:** [200. Number of Islands](https://leetcode.com/problems/number-of-islands/)

### Description
Given an `m x n` binary `grid` of `'1'` (land) and `'0'` (water), return the number of
islands. An island is a maximal group of land cells connected 4-directionally
(horizontally or vertically).

Map each land cell `(r, c)` to an index `r * n + c`. Union adjacent land cells (right
and down neighbours suffice), then count the distinct roots among land cells.

### Examples
**Example 1:**
```
Input:  grid = [["1","1","0"],
                ["1","0","0"],
                ["0","0","1"]]
Output: 2
```
The top-left block of land is one island; the bottom-right cell is another.

**Example 2:**
```
Input:  grid = [["1","1","1"],
                ["0","1","0"],
                ["1","1","1"]]
Output: 1
```
All land cells connect into a single H-shaped island.

**Example 3:**
```
Input:  grid = [["0","0"],
                ["0","0"]]
Output: 0
```
There is no land, so there are no islands.

### Constraints
- `m == grid.length`
- `n == grid[i].length`
- `1 <= m, n <= 300`
- `grid[i][j]` is `'0'` or `'1'`

---

## Problem 11: Most Stones Removed with Same Row or Column

**LeetCode:** [947. Most Stones Removed with Same Row or Column](https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/)

### Description
On a 2D plane there are `n` stones, each at an integer coordinate. A stone can be
removed if it shares its row or its column with another stone that has not been removed.
Return the largest possible number of stones you can remove.

Two stones in the same row or column belong to the same group. The maximum number
removable is `n - (number of groups)`. Union stones by shared row and shared column,
then subtract the component count from `n`.

### Examples
**Example 1:**
```
Input:  stones = [[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]]
Output: 5
```
All six stones form one group, so five can be removed.

**Example 2:**
```
Input:  stones = [[0,0],[0,2],[1,1],[2,0],[2,2]]
Output: 3
```
The stones form two groups; `5 - 2 = 3` can be removed.

**Example 3:**
```
Input:  stones = [[0,0]]
Output: 0
```
A lone stone shares no row or column, so none can be removed.

### Constraints
- `1 <= stones.length <= 1000`
- `0 <= xi, yi <= 10^4`
- No two stones share the same coordinate.

---

## Problem 12: Accounts Merge

**LeetCode:** [721. Accounts Merge](https://leetcode.com/problems/accounts-merge/)

### Description
You are given a list of `accounts`, where `accounts[i][0]` is a name and the remaining
entries are emails belonging to that account. Two accounts belong to the same person if
they share at least one common email (names alone do not identify a person). Merge such
accounts and return the result: each merged account is the name followed by all its
emails in sorted order. Return the merged accounts in any order.

Union accounts that share an email by keying union-find on emails. Then collect emails
per representative, sort them, and prepend the owning name.

### Examples
**Example 1:**
```
Input:  accounts = [["John","a@x.com","b@x.com"],
                    ["John","b@x.com","c@x.com"],
                    ["Mary","m@x.com"]]
Output: [["John","a@x.com","b@x.com","c@x.com"],
         ["Mary","m@x.com"]]
```
The two "John" accounts share `b@x.com`, so they merge; "Mary" stays separate.

**Example 2:**
```
Input:  accounts = [["Alex","alex@x.com"],
                    ["Alex","alex2@x.com"]]
Output: [["Alex","alex2@x.com"],
         ["Alex","alex@x.com"]]
```
The two "Alex" accounts share no email, so they remain distinct.

**Example 3:**
```
Input:  accounts = [["Sam","s1@x.com","s2@x.com"],
                    ["Sam","s2@x.com"],
                    ["Sam","s1@x.com","s3@x.com"]]
Output: [["Sam","s1@x.com","s2@x.com","s3@x.com"]]
```
All three accounts link transitively through shared emails into one account.

### Constraints
- `1 <= accounts.length <= 1000`
- `2 <= accounts[i].length <= 10`
- `1 <= accounts[i][j].length <= 30`
- `accounts[i][0]` consists of English letters
- All emails are valid and consist of lowercase letters and symbols.

---

## Problem 13: Number of Provinces from Friend Pairs

**LeetCode:** [547. Number of Provinces](https://leetcode.com/problems/number-of-provinces/)

### Description
There are `n` people labelled `0` to `n - 1`. You are given a list of `friendships`,
where each `[a, b]` means `a` and `b` are direct friends. A friend circle is a maximal
group of people connected directly or indirectly by friendships. Return the number of
friend circles.

This is the edge-list form of "number of provinces": union each friendship pair, then
count the resulting components.

### Examples
**Example 1:**
```
Input:  n = 4, friendships = [[0,1],[1,2]]
Output: 2
```
People `{0,1,2}` form one circle; person `3` is alone.

**Example 2:**
```
Input:  n = 5, friendships = [[0,1],[2,3],[3,4]]
Output: 2
```
Circles `{0,1}` and `{2,3,4}` remain.

**Example 3:**
```
Input:  n = 3, friendships = []
Output: 3
```
With no friendships, each person is their own circle.

### Constraints
- `1 <= n <= 10^5`
- `0 <= friendships.length <= 10^5`
- `0 <= a, b < n`

---

## Problem 14: The Earliest Moment When Everyone Become Friends

**LeetCode:** [1101. The Earliest Moment When Everyone Become Friends](https://leetcode.com/problems/the-earliest-moment-when-everyone-become-friends/)

### Description
There are `n` people in a social group labelled `0` to `n - 1`. You are given `logs`,
where each `logs[i] = [timestamp, a, b]` records that `a` and `b` became friends at the
given time. Friendship is symmetric and transitive. Return the earliest timestamp at
which every person is connected (directly or indirectly), or `-1` if that never happens.

Sort the logs by timestamp, union friends as you go, and return the timestamp of the
union that drops the component count to one.

### Examples
**Example 1:**
```
Input:  n = 4, logs = [[5,0,1],[10,1,2],[15,2,3]]
Output: 15
```
Only after the log at time `15` does everyone belong to a single group.

**Example 2:**
```
Input:  n = 4, logs = [[3,0,1],[4,2,3]]
Output: -1
```
The group never becomes fully connected.

**Example 3:**
```
Input:  n = 3, logs = [[20,1,2],[5,0,1]]
Output: 20
```
Sorted by time, the union at time `20` connects the final pair.

### Constraints
- `2 <= n <= 100`
- `1 <= logs.length <= 10^4`
- `logs[i].length == 3`
- `0 <= timestamp <= 10^9`
- All timestamps are distinct
- `0 <= a, b < n` and `a != b`

---

## Problem 15: Redundant Connection (Last Removable Edge)

**LeetCode:** [684. Redundant Connection](https://leetcode.com/problems/redundant-connection/)

### Description
A network of `n` planets labelled `1` to `n` began as a tree, then exactly one extra
lane was added, creating a single cycle. Given `edges` in insertion order, return the
one edge whose removal restores a tree. If several edges lie on the cycle, return the
one appearing last in the input.

Union endpoints in order; the edge whose two endpoints are already connected when you
reach it is the one to remove.

### Examples
**Example 1:**
```
Input:  edges = [[1,2],[2,3],[3,1]]
Output: [3,1]
```
The edge `[3,1]` closes the cycle `1-2-3-1`.

**Example 2:**
```
Input:  edges = [[1,2],[1,3],[2,3],[3,4]]
Output: [2,3]
```
`[2,3]` is the edge that finds its endpoints already connected.

**Example 3:**
```
Input:  edges = [[1,4],[2,4],[3,4],[1,2]]
Output: [1,2]
```
`[1,2]` is the last edge to close the cycle through node `4`.

### Constraints
- `3 <= n <= 1000`
- `edges.length == n`
- `edges[i].length == 2`
- `1 <= ai < bi <= n` is not guaranteed; treat edges as unordered pairs.

---

## Problem 16: Smallest String With Swaps

**LeetCode:** [1202. Smallest String With Swaps](https://leetcode.com/problems/smallest-string-with-swaps/)

### Description
You are given a string `s` and an array `pairs` of index pairs, where each
`pairs[i] = [a, b]` means you may swap the characters at indices `a` and `b` any number
of times. Return the lexicographically smallest string obtainable through such swaps.

Indices connected by swaps form a group; within a group, characters can be freely
rearranged. Union the index pairs, then for each group sort its characters and place the
smallest ones at the smallest indices.

### Examples
**Example 1:**
```
Input:  s = "dcab", pairs = [[0,3],[1,2]]
Output: "bacd"
```
Group `{0,3}` holds `{d,b}` and group `{1,2}` holds `{c,a}`; sorting each gives `bacd`.

**Example 2:**
```
Input:  s = "dcab", pairs = [[0,3],[1,2],[0,2]]
Output: "abcd"
```
All four indices merge into one group, so the whole string can be sorted.

**Example 3:**
```
Input:  s = "cba", pairs = [[0,1],[1,2]]
Output: "abc"
```
Indices `{0,1,2}` form one group; the characters sort to `abc`.

### Constraints
- `1 <= s.length <= 10^5`
- `0 <= pairs.length <= 10^5`
- `0 <= a, b < s.length`
- `s` consists of lowercase English letters.

---

## Problem 17: Kruskal's Minimum Spanning Tree Weight

**LeetCode:** ### Description
You are given `n` nodes labelled `0` to `n - 1` and a list of weighted undirected
`edges`, where each `edges[i] = [u, v, w]`. Return the total weight of a minimum
spanning tree connecting all nodes, or `-1` if the graph is not connected.

Sort edges by ascending weight (Kruskal's algorithm). For each edge, union its
endpoints if they lie in different components and add its weight; skip cycle-forming
edges. The MST exists only if you accept exactly `n - 1` edges.

### Examples
**Example 1:**
```
Input:  n = 4, edges = [[0,1,1],[1,2,2],[2,3,3],[0,3,4]]
Output: 6
```
Accepting weights `1 + 2 + 3` spans all four nodes; the weight-4 edge would form a cycle.

**Example 2:**
```
Input:  n = 3, edges = [[0,1,5]]
Output: -1
```
Node `2` is unreachable, so no spanning tree exists.

**Example 3:**
```
Input:  n = 1, edges = []
Output: 0
```
A single node needs no edges; the MST weight is zero.

### Constraints
- `1 <= n <= 10^5`
- `0 <= edges.length <= 2 * 10^5`
- `edges[i].length == 3`
- `0 <= u, v < n`
- `1 <= w <= 10^6`

---

## Problem 18: Bridge Building Budget

**LeetCode:** ### Description
There are `n` islands labelled `0` to `n - 1` and a list of candidate bridges, each
`[u, v, cost]`. Bridges are considered in ascending order of cost; a bridge is built
only if its endpoints are not already connected. Return the total cost to connect every
island, or `-1` if it is impossible to connect all of them.

This is Kruskal's algorithm framed as a budget: greedily accept the cheapest
component-joining bridges until everything is connected.

### Examples
**Example 1:**
```
Input:  n = 3, bridges = [[0,1,1],[1,2,2],[0,2,5]]
Output: 3
```
Building the cost-1 and cost-2 bridges connects all islands; the cost-5 bridge is skipped.

**Example 2:**
```
Input:  n = 4, bridges = [[0,1,3],[2,3,4]]
Output: -1
```
The two pairs `{0,1}` and `{2,3}` can never be joined, so connection is impossible.

**Example 3:**
```
Input:  n = 1, bridges = []
Output: 0
```
A single island is already connected; no bridges are needed.

### Constraints
- `1 <= n <= 10^5`
- `0 <= bridges.length <= 2 * 10^5`
- `bridges[i].length == 3`
- `0 <= u, v < n`
- `1 <= cost <= 10^9`

---

## Problem 19: Galactic Senate Faction Queries

**LeetCode:** ### Description
The Galactic Senate has `n` senators labelled `0` to `n - 1`. You are given `alliances`,
where each `[a, b]` means `a` and `b` belong to the same faction (alliances are
transitive), and a list of `queries`, each `[x, y]`. For every query, report whether
`x` and `y` end up in the same faction. Return a boolean array, one entry per query.

Process all alliances into a union-find first, then answer each query by comparing
representatives.

### Examples
**Example 1:**
```
Input:  n = 4, alliances = [[0,1],[1,2]], queries = [[0,2],[0,3]]
Output: [true,false]
```
`0` and `2` share a faction through `1`; `3` is alone.

**Example 2:**
```
Input:  n = 3, alliances = [], queries = [[0,1],[2,2]]
Output: [false,true]
```
No alliances exist, so distinct senators differ; a senator always matches itself.

**Example 3:**
```
Input:  n = 5, alliances = [[0,1],[2,3],[3,4]], queries = [[2,4],[1,3]]
Output: [true,false]
```
`2` and `4` share a faction; `1` and `3` lie in different factions.

### Constraints
- `1 <= n <= 2 * 10^5`
- `0 <= alliances.length <= 2 * 10^5`
- `1 <= queries.length <= 2 * 10^5`
- `0 <= a, b, x, y < n`

---

## Problem 20: Advent Grid Flood

**LeetCode:** ### Description
You are handed a `rows x cols` grid of characters. Two orthogonally adjacent cells (up,
down, left, right) are joined when they hold the same character. A region is a maximal
group of joined cells. Return the size (cell count) of the single largest region.

Map each cell to an index, union equal adjacent cells (right and down neighbours
suffice), then return the maximum component size.

### Examples
**Example 1:**
```
Input:  grid = ["AAB",
                "ABB",
                "BBB"]
Output: 5
```
The five `'B'` cells form the largest region; the `'A'` cells split into smaller ones.

**Example 2:**
```
Input:  grid = ["AB",
                "BA"]
Output: 1
```
No two equal cells are adjacent, so every region has size 1.

**Example 3:**
```
Input:  grid = ["CCCC"]
Output: 4
```
All four `'C'` cells join into one region.

### Constraints
- `1 <= rows, cols <= 1000`
- The grid is non-empty and rectangular.
- Each cell holds a single uppercase English letter.

---
