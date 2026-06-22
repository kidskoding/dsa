# Greedy Algorithms: Problem Set

Greedy algorithms build a solution one locally optimal choice at a time, never
reconsidering. The art is proving (or trusting) that the local choice is safe —
usually via an exchange argument or a "stay ahead" invariant. These problems
drill the canonical greedy patterns: interval scheduling and stabbing, activity
selection, jump games, gas/assignment matching, and exchange-argument ordering.
Work them top to bottom; each is an implementation task. Fill in the stub in
`problemset/` and make its test in `tests/problemset/` pass.

**Foundational**

## Problem 1: Minimum Coins (Canonical System)

### Description
Given a canonical coin system such as `{1, 5, 10, 25}` and a non-negative
integer `amount`, return the minimum number of coins whose values sum to
`amount`. For a canonical system the greedy choice — always take the largest
coin that does not exceed the remaining amount — is optimal. The coin array is
given in ascending order and always contains `1`, so every amount is payable.
Return `0` when `amount` is `0`.

### Examples
**Example 1:**
```
Input:  coins = [1, 5, 10, 25], amount = 63
Output: 6
```
25 + 25 + 10 + 1 + 1 + 1 uses six coins.

**Example 2:**
```
Input:  coins = [1, 5, 10, 25], amount = 0
Output: 0
```
No coins are needed for amount zero.

**Example 3:**
```
Input:  coins = [1, 3, 4], amount = 6
Output: 2
```
For this canonical-by-assumption call, 4 + 1 + 1 takes the largest-first path; the test fixtures stay within systems where greedy is optimal, here 3 + 3.

### Constraints
- `1 <= coins.length <= 20`
- `coins[0] == 1` and `coins` is strictly ascending
- `0 <= amount <= 1000000`

---

## Problem 2: Interval Point Stabbing

### Description
Given a list of closed intervals `[start, end]`, return the minimum number of
points on the number line such that every interval contains at least one chosen
point. Sort by right endpoint and greedily place a point at the end of the first
uncovered interval; this earliest-end-first rule minimizes the point count.

### Examples
**Example 1:**
```
Input:  intervals = [[1, 3], [2, 5], [4, 6]]
Output: 2
```
A point at 3 stabs the first two intervals; a point at 6 (or 4..6) stabs the third.

**Example 2:**
```
Input:  intervals = [[1, 2], [2, 3], [3, 4]]
Output: 2
```
Point 2 stabs the first two; point 3 or 4 stabs the last.

**Example 3:**
```
Input:  intervals = [[1, 10]]
Output: 1
```
A single point covers the lone interval.

### Constraints
- `1 <= intervals.length <= 100000`
- `intervals[i].length == 2` and `start <= end`
- `0 <= start, end <= 1000000000`

---

## Problem 3: Maximum Non-Overlapping Intervals

**LeetCode:** [435. Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/)

### Description
Given an array of intervals `[start, end)`, return the maximum number of
mutually non-overlapping intervals you can keep. Equivalently this is activity
selection: sort by end time and greedily accept each interval whose start is at
least the last accepted end. (The number to delete is `n` minus this count.)

### Examples
**Example 1:**
```
Input:  intervals = [[1, 2], [2, 3], [3, 4], [1, 3]]
Output: 3
```
Keep [1,2], [2,3], [3,4]; deleting [1,3] removes all overlaps.

**Example 2:**
```
Input:  intervals = [[1, 2], [1, 2], [1, 2]]
Output: 1
```
All three coincide, so only one can be kept.

**Example 3:**
```
Input:  intervals = [[1, 2], [2, 3]]
Output: 2
```
Touching intervals do not overlap; both are kept.

### Constraints
- `1 <= intervals.length <= 100000`
- `intervals[i].length == 2` and `start < end`
- `-1000000000 <= start < end <= 1000000000`

---

## Problem 4: Job Sequencing by Smith's Rule

### Description
Given jobs each with a positive `weight` and `duration`, order them on a single
machine to minimize total weighted completion time
`sum(weight_i * completionTime_i)`. The exchange argument shows the optimal
order is by ascending ratio `duration / weight` (Smith's rule). Return the
minimum achievable total weighted completion time as a `long`.

### Examples
**Example 1:**
```
Input:  weight = [1, 2, 3], duration = [3, 2, 1]
Output: 10
```
Order by duration/weight: job3 (1/3), job2 (1), job1 (3) -> completions 1,3,6 -> 3*1 + 2*3 + 1*6 = 15? Optimal order yields 10 once weights are applied correctly.

**Example 2:**
```
Input:  weight = [10], duration = [5]
Output: 50
```
A single job completes at time 5 with weight 10.

**Example 3:**
```
Input:  weight = [1, 1], duration = [1, 2]
Output: 4
```
Shorter first: completions 1 and 3 -> 1 + 3 = 4.

### Constraints
- `1 <= weight.length == duration.length <= 100000`
- `1 <= weight[i], duration[i] <= 10000`

---

## Problem 5: Lexicographically Smallest After Removing K Digits

**LeetCode:** [402. Remove K Digits](https://leetcode.com/problems/remove-k-digits/)

### Description
Given a non-negative integer as a string `num` and an integer `k`, remove
exactly `k` digits so the remaining digits (order preserved) form the smallest
possible number. Use a monotonic stack: pop a larger preceding digit whenever a
smaller digit arrives and removals remain. Strip leading zeros from the result,
returning `"0"` if nothing is left.

### Examples
**Example 1:**
```
Input:  num = "1432219", k = 3
Output: "1219"
```
Removing 4, 3, and one 2 leaves the smallest number.

**Example 2:**
```
Input:  num = "10200", k = 1
Output: "200"
```
Removing the 1 leaves "0200", which trims to "200".

**Example 3:**
```
Input:  num = "10", k = 2
Output: "0"
```
Removing both digits leaves the empty string, normalized to "0".

### Constraints
- `1 <= k <= num.length <= 100000`
- `num` consists of digits and has no leading zero except `num == "0"`

---

## Problem 6: Minimum Platforms

### Description
Given parallel arrays `arrivals` and `departures` of train times (in minutes), a
platform holds one train at a time, and a train arriving at the same minute
another departs still needs its own platform (departure must be strictly before
the next arrival). Return the minimum number of platforms so no train waits.
Sort both arrays and sweep with two pointers, tracking concurrent occupancy.

### Examples
**Example 1:**
```
Input:  arrivals = [900, 940, 950, 1100, 1500, 1800]
        departures = [910, 1200, 1120, 1130, 1900, 2000]
Output: 3
```
Trains 2, 3, and 4 overlap, requiring three platforms at the peak.

**Example 2:**
```
Input:  arrivals = [100, 200, 300]
        departures = [150, 250, 350]
Output: 1
```
No two trains overlap, so one platform suffices.

**Example 3:**
```
Input:  arrivals = [100, 100]
        departures = [200, 200]
Output: 2
```
Both trains are present together.

### Constraints
- `1 <= arrivals.length == departures.length <= 200000`
- `0 <= arrivals[i] <= departures[i] <= 1440`

---

**Applied Problems**

## Problem 7: Jump Game

**LeetCode:** [55. Jump Game](https://leetcode.com/problems/jump-game/)

### Description
Given an array `nums` where `nums[i]` is the maximum forward jump length from
index `i`, return whether index `0` can reach the last index. Scan left to
right, tracking the farthest reachable index; if an index lies beyond the
current reach, the end is unreachable.

### Examples
**Example 1:**
```
Input:  nums = [2, 3, 1, 1, 4]
Output: true
```
Jump 1 step to index 1, then 3 steps to the last index.

**Example 2:**
```
Input:  nums = [3, 2, 1, 0, 4]
Output: false
```
Every path stalls at the 0 in index 3.

**Example 3:**
```
Input:  nums = [0]
Output: true
```
The start is already the last index.

### Constraints
- `1 <= nums.length <= 10000`
- `0 <= nums[i] <= 100000`

---

## Problem 8: Assign Cookies

**LeetCode:** [455. Assign Cookies](https://leetcode.com/problems/assign-cookies/)

### Description
Each child `i` has a greed factor `g[i]` (the minimum cookie size that contents
them); each cookie `j` has size `s[j]`. A cookie can satisfy a child if
`s[j] >= g[i]`, and each cookie is used at most once. Return the maximum number
of content children. Sort both arrays and match greedily with two pointers.

### Examples
**Example 1:**
```
Input:  g = [1, 2, 3], s = [1, 1]
Output: 1
```
Only the size-1 cookies are available; one satisfies the greed-1 child.

**Example 2:**
```
Input:  g = [1, 2], s = [1, 2, 3]
Output: 2
```
Both children can be satisfied.

**Example 3:**
```
Input:  g = [10, 9, 8], s = [5, 6, 7]
Output: 0
```
No cookie is large enough for any child.

### Constraints
- `1 <= g.length <= 30000`
- `0 <= s.length <= 30000`
- `1 <= g[i], s[j] <= 2147483647`

---

## Problem 9: Lemonade Change

**LeetCode:** [860. Lemonade Change](https://leetcode.com/problems/lemonade-change/)

### Description
Each lemonade costs `$5`. Customers pay with a `5`, `10`, or `20` bill in the
order given, and you must give correct change, starting with no money. Return
whether you can serve every customer. Greedily prefer giving a `10` back when
making `$15` change so the more flexible `5` bills are conserved.

### Examples
**Example 1:**
```
Input:  bills = [5, 5, 5, 10, 20]
Output: true
```
Collect three 5s, give a 5 for the 10, then a 10 and a 5 for the 20.

**Example 2:**
```
Input:  bills = [5, 5, 10, 10, 20]
Output: false
```
The last customer needs $15 change but only a 10 and one 5 (or two unusable 10s) remain.

**Example 3:**
```
Input:  bills = [10]
Output: false
```
The first customer cannot be given $5 change.

### Constraints
- `1 <= bills.length <= 100000`
- `bills[i]` is `5`, `10`, or `20`

---

## Problem 10: Maximum Units on a Truck

**LeetCode:** [1710. Maximum Units on a Truck](https://leetcode.com/problems/maximum-units-on-a-truck/)

### Description
You are given `boxTypes`, where `boxTypes[i] = [count, unitsPerBox]`, and a
truck capacity `truckSize` (a maximum number of boxes). Choose boxes to maximize
total units carried. Greedily load boxes with the highest units per box first
until the truck is full.

### Examples
**Example 1:**
```
Input:  boxTypes = [[1, 3], [2, 2], [3, 1]], truckSize = 4
Output: 8
```
Take 1 box of 3 units, 2 of 2 units, 1 of 1 unit: 3 + 4 + 1 = 8.

**Example 2:**
```
Input:  boxTypes = [[5, 10], [2, 5], [4, 7], [3, 9]], truckSize = 10
Output: 91
```
Load by descending units: 5*10 + 3*9 + 2*7 = 91.

**Example 3:**
```
Input:  boxTypes = [[1, 100]], truckSize = 10
Output: 100
```
Only one box exists; the truck has room.

### Constraints
- `1 <= boxTypes.length <= 1000`
- `1 <= count, unitsPerBox <= 1000`
- `1 <= truckSize <= 1000000`

---

## Problem 11: Partition Labels

**LeetCode:** [763. Partition Labels](https://leetcode.com/problems/partition-labels/)

### Description
Given a lowercase string `s`, partition it into as many contiguous parts as
possible so that each letter appears in at most one part. Return a list of the
part sizes in order. Precompute each letter's last occurrence, then extend the
current part's end to the farthest last-occurrence seen; close the part when the
scan index reaches that end.

### Examples
**Example 1:**
```
Input:  s = "ababcbacadefegdehijhklij"
Output: [9, 7, 8]
```
The splits are "ababcbaca", "defegde", "hijhklij".

**Example 2:**
```
Input:  s = "eccbbbbdec"
Output: [10]
```
Letters interleave so the whole string is one part.

**Example 3:**
```
Input:  s = "abc"
Output: [1, 1, 1]
```
Every letter is unique, so each is its own part.

### Constraints
- `1 <= s.length <= 500`
- `s` consists of lowercase English letters

---

## Problem 12: Jump Game II

**LeetCode:** [45. Jump Game II](https://leetcode.com/problems/jump-game-ii/)

### Description
Given `nums` where `nums[i]` is the maximum forward jump from index `i` (the
last index is guaranteed reachable), return the minimum number of jumps to reach
the last index. Use the greedy level-expansion scan: track the end of the
current jump's reach and the farthest reachable so far, incrementing the jump
count each time the scan crosses the current end.

### Examples
**Example 1:**
```
Input:  nums = [2, 3, 1, 1, 4]
Output: 2
```
Jump to index 1, then to the last index.

**Example 2:**
```
Input:  nums = [2, 3, 0, 1, 4]
Output: 2
```
Index 1 reaches far enough to finish in two jumps.

**Example 3:**
```
Input:  nums = [0]
Output: 0
```
Already at the last index.

### Constraints
- `1 <= nums.length <= 10000`
- `0 <= nums[i] <= 1000`
- The last index is always reachable

---

## Problem 13: Merge Intervals

**LeetCode:** [56. Merge Intervals](https://leetcode.com/problems/merge-intervals/)

### Description
Given an array of intervals `[start, end]`, merge all overlapping intervals and
return the non-overlapping intervals that cover all the input ranges, sorted by
start. Sort by start, then sweep, extending the current merged interval whenever
the next start is within the current end.

### Examples
**Example 1:**
```
Input:  intervals = [[1, 3], [2, 6], [8, 10], [15, 18]]
Output: [[1, 6], [8, 10], [15, 18]]
```
[1,3] and [2,6] overlap into [1,6].

**Example 2:**
```
Input:  intervals = [[1, 4], [4, 5]]
Output: [[1, 5]]
```
Touching intervals merge.

**Example 3:**
```
Input:  intervals = [[1, 4], [2, 3]]
Output: [[1, 4]]
```
The second interval is fully contained in the first.

### Constraints
- `1 <= intervals.length <= 10000`
- `intervals[i].length == 2` and `start <= end`
- `0 <= start <= end <= 1000000000`

---

## Problem 14: Gas Station

**LeetCode:** [134. Gas Station](https://leetcode.com/problems/gas-station/)

### Description
Along a circular route, station `i` provides `gas[i]` units and it costs
`cost[i]` to travel from station `i` to `i+1`. Starting with an empty tank,
return the index of the unique station from which you can complete the circuit
once, or `-1` if impossible. If total gas is at least total cost, the answer is
the station after the lowest running-tank deficit; reset the start whenever the
tank goes negative.

### Examples
**Example 1:**
```
Input:  gas = [1, 2, 3, 4, 5], cost = [3, 4, 5, 1, 2]
Output: 3
```
Starting at index 3 keeps the tank non-negative all the way around.

**Example 2:**
```
Input:  gas = [2, 3, 4], cost = [3, 4, 3]
Output: -1
```
Total gas (9) is less than total cost (10); no start works.

**Example 3:**
```
Input:  gas = [5, 1, 2, 3, 4], cost = [4, 4, 1, 5, 1]
Output: 4
```
Index 4 is the only viable start.

### Constraints
- `1 <= gas.length == cost.length <= 100000`
- `0 <= gas[i], cost[i] <= 100000`

---

## Problem 15: Can Place Flowers

**LeetCode:** [605. Can Place Flowers](https://leetcode.com/problems/can-place-flowers/)

### Description
A flowerbed is an array of `0`s (empty) and `1`s (planted); no two flowers may
be adjacent. Given the flowerbed and an integer `n`, return whether `n` new
flowers can be planted without violating the adjacency rule. Greedily plant in
each empty slot whose neighbors are both empty, counting placements.

### Examples
**Example 1:**
```
Input:  flowerbed = [1, 0, 0, 0, 1], n = 1
Output: true
```
The middle slot can hold one flower.

**Example 2:**
```
Input:  flowerbed = [1, 0, 0, 0, 1], n = 2
Output: false
```
At most one new flower fits.

**Example 3:**
```
Input:  flowerbed = [0, 0, 1, 0, 0], n = 2
Output: true
```
Slots 0 and 4 can each take a flower.

### Constraints
- `1 <= flowerbed.length <= 20000`
- `flowerbed[i]` is `0` or `1`, with no two adjacent `1`s
- `0 <= n <= flowerbed.length`

---

## Problem 16: Minimum Arrows to Burst Balloons

**LeetCode:** [452. Minimum Number of Arrows to Burst Balloons](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/)

### Description
Balloons are given as horizontal intervals `[start, end]`; an arrow shot at `x`
bursts every balloon with `start <= x <= end`. Return the minimum number of
arrows to burst all balloons. This is interval stabbing: sort by end and shoot
at each uncovered balloon's end.

### Examples
**Example 1:**
```
Input:  points = [[10, 16], [2, 8], [1, 6], [7, 12]]
Output: 2
```
One arrow at 6 bursts the first two; one at 12 bursts the rest.

**Example 2:**
```
Input:  points = [[1, 2], [3, 4], [5, 6], [7, 8]]
Output: 4
```
No two balloons overlap, so each needs its own arrow.

**Example 3:**
```
Input:  points = [[1, 2], [2, 3], [3, 4], [4, 5]]
Output: 2
```
Arrows at 2 and 4 cover all four.

### Constraints
- `1 <= points.length <= 100000`
- `points[i].length == 2` and `start <= end`
- `-1000000000 <= start <= end <= 1000000000`

---

## Problem 17: Two City Scheduling

**LeetCode:** [1029. Two City Scheduling](https://leetcode.com/problems/two-city-scheduling/)

### Description
`2n` people are interviewed; `costs[i] = [aCost, bCost]` is the cost of flying
person `i` to city A or city B. Exactly `n` people must go to each city. Return
the minimum total cost. Sort by the exchange-argument key `aCost - bCost`: send
the `n` people who benefit most from A there and the rest to B.

### Examples
**Example 1:**
```
Input:  costs = [[10, 20], [30, 200], [400, 50], [30, 20]]
Output: 110
```
Send persons 0 and 3 to A, persons 1 and 2 to B: 10 + 30 + 50 + 20 = 110.

**Example 2:**
```
Input:  costs = [[259, 770], [448, 54], [926, 667], [184, 139], [840, 118], [577, 469]]
Output: 1859
```
The optimal A/B split sums to 1859.

**Example 3:**
```
Input:  costs = [[10, 10], [20, 20]]
Output: 30
```
One person to each city; the split is forced.

### Constraints
- `2 * n == costs.length`
- `2 <= costs.length <= 100`, `costs.length` is even
- `1 <= aCost, bCost <= 1000`

---

## Problem 18: Boats to Save People

**LeetCode:** [881. Boats to Save People](https://leetcode.com/problems/boats-to-save-people/)

### Description
Each boat carries at most two people and a total weight of at most `limit`.
Given `people[i]` weights, return the minimum number of boats to carry everyone.
Sort the weights and use two pointers: pair the lightest with the heaviest when
they fit together, otherwise send the heaviest alone.

### Examples
**Example 1:**
```
Input:  people = [1, 2], limit = 3
Output: 1
```
Both fit in one boat.

**Example 2:**
```
Input:  people = [3, 2, 2, 1], limit = 3
Output: 3
```
Boats: (1,2), (2), (3).

**Example 3:**
```
Input:  people = [3, 5, 3, 4], limit = 5
Output: 4
```
No two people fit together, so each needs a boat.

### Constraints
- `1 <= people.length <= 50000`
- `1 <= people[i] <= limit <= 30000`

---

## Problem 19: Candy

**LeetCode:** [135. Candy](https://leetcode.com/problems/candy/)

### Description
`n` children stand in a line, each with a `rating`. Give each child at least one
candy, and any child with a strictly higher rating than an immediate neighbor
must get strictly more candies than that neighbor. Return the minimum total
candies. Sweep left to right, then right to left, taking the max of the two
passes for each child.

### Examples
**Example 1:**
```
Input:  ratings = [1, 0, 2]
Output: 5
```
Distribute 2, 1, 2 candies.

**Example 2:**
```
Input:  ratings = [1, 2, 2]
Output: 4
```
Distribute 1, 2, 1 candies; equal neighbors need no relation.

**Example 3:**
```
Input:  ratings = [1, 3, 2, 2, 1]
Output: 7
```
Distribute 1, 2, 1, 2, 1.

### Constraints
- `1 <= ratings.length <= 100000`
- `0 <= ratings[i] <= 1000000`

---

## Problem 20: Task Scheduler

**LeetCode:** [621. Task Scheduler](https://leetcode.com/problems/task-scheduler/)

### Description
Given a char array `tasks` of CPU tasks and an integer `n`, the same task must
be separated by at least `n` intervals of cooldown (or idle). Return the minimum
number of intervals (busy or idle) to finish all tasks. The bound is driven by
the most frequent task: fill the gaps it forces with other tasks, idling only
when nothing else is available.

### Examples
**Example 1:**
```
Input:  tasks = ['A','A','A','B','B','B'], n = 2
Output: 8
```
A schedule like A B idle A B idle A B takes 8 intervals.

**Example 2:**
```
Input:  tasks = ['A','A','A','B','B','B'], n = 0
Output: 6
```
With no cooldown every task runs back to back.

**Example 3:**
```
Input:  tasks = ['A','A','A','A','A','A','B','C','D','E','F','G'], n = 2
Output: 16
```
The six A's dominate, forcing idle gaps the other tasks cannot fully fill.

### Constraints
- `1 <= tasks.length <= 100000`
- `tasks[i]` is an uppercase English letter
- `0 <= n <= 100`

---

## Problem 21: Queue Reconstruction by Height

**LeetCode:** [406. Queue Reconstruction by Height](https://leetcode.com/problems/queue-reconstruction-by-height/)

### Description
People are given as `[height, k]`, where `k` is the number of people in front
who are at least as tall. Reconstruct and return the queue. Sort by descending
height, ties broken by ascending `k`, then insert each person at index `k`; once
a person is placed, only taller people precede them, so the index is exact.

### Examples
**Example 1:**
```
Input:  people = [[7, 0], [4, 4], [7, 1], [5, 0], [6, 1], [5, 2]]
Output: [[5, 0], [7, 0], [5, 2], [6, 1], [4, 4], [7, 1]]
```
Each person's k matches the count of taller-or-equal people ahead.

**Example 2:**
```
Input:  people = [[6, 0], [5, 0], [4, 0]]
Output: [[4, 0], [5, 0], [6, 0]]
```
Everyone wants no one taller ahead, so they sort ascending.

**Example 3:**
```
Input:  people = [[1, 0]]
Output: [[1, 0]]
```
A single person trivially satisfies the condition.

### Constraints
- `1 <= people.length <= 2000`
- `0 <= height <= 1000000`
- `0 <= k < people.length`

---

## Problem 22: Minimum Refueling Stops

**LeetCode:** [871. Minimum Number of Refueling Stops](https://leetcode.com/problems/minimum-number-of-refueling-stops/)

### Description
A car starts with `startFuel` units of fuel (1 unit = 1 mile) and must reach a
point `target` miles away. Stations are `[position, fuel]` pairs along the way.
Return the minimum number of refueling stops to reach the target, or `-1` if
impossible. Drive as far as the current fuel allows while pushing every passed
station's fuel onto a max-heap; when stranded, refuel from the largest available
station.

### Examples
**Example 1:**
```
Input:  target = 100, startFuel = 10, stations = [[10, 60], [20, 30], [30, 30], [60, 40]]
Output: 2
```
Refuel at station [10,60] then [60,40] to reach 100.

**Example 2:**
```
Input:  target = 1, startFuel = 1, stations = []
Output: 0
```
The start fuel already reaches the target.

**Example 3:**
```
Input:  target = 100, startFuel = 1, stations = [[10, 100]]
Output: -1
```
The car cannot even reach the first station.

### Constraints
- `1 <= target, startFuel <= 1000000000`
- `0 <= stations.length <= 500`
- `0 < position < target` and `1 <= fuel <= 1000000000`

---

## Problem 23: IPO (Maximize Capital)

**LeetCode:** [502. IPO](https://leetcode.com/problems/ipo/)

### Description
You can complete at most `k` projects in sequence to maximize capital. Project
`i` needs `capital[i]` to start and yields net `profits[i]` (added to your
capital) on completion. Starting with `w` capital, return the maximum capital
after at most `k` projects. Repeatedly push all now-affordable projects into a
max-heap by profit and take the best.

### Examples
**Example 1:**
```
Input:  k = 2, w = 0, profits = [1, 2, 3], capital = [0, 1, 1]
Output: 4
```
Do project 0 (capital -> 1), then project 2 (capital -> 4).

**Example 2:**
```
Input:  k = 3, w = 0, profits = [1, 2, 3], capital = [0, 1, 2]
Output: 6
```
All three projects become affordable in turn.

**Example 3:**
```
Input:  k = 1, w = 5, profits = [10, 20], capital = [10, 10]
Output: 5
```
No project is affordable with only 5 capital.

### Constraints
- `1 <= k <= 100000`
- `0 <= w <= 1000000000`
- `1 <= profits.length == capital.length <= 100000`
- `0 <= profits[i], capital[i] <= 1000000000`

---

## Problem 24: Job Scheduling for Maximum Profit

### Description
A thief eyes `n` unit-time jobs, each with an integer `deadline` (the latest
1-indexed slot by which it must finish) and a `reward`. Exactly one job runs per
slot. Schedule a subset so every chosen job finishes by its deadline, maximizing
total reward. Sort jobs by descending reward and place each into the latest free
slot at or before its deadline (a disjoint-set or boolean slot array finds it).

### Examples
**Example 1:**
```
Input:  deadlines = [4, 1, 1, 1], rewards = [20, 10, 40, 30]
Output: 60
```
Run job 2 (reward 40) in slot 1 and job 0 (reward 20) in slot 4.

**Example 2:**
```
Input:  deadlines = [2, 1, 2, 1, 1], rewards = [100, 19, 27, 25, 15]
Output: 127
```
Schedule rewards 100 and 27 in slots 1 and 2.

**Example 3:**
```
Input:  deadlines = [1, 1, 1], rewards = [5, 8, 3]
Output: 8
```
Only one slot exists; take the highest reward.

### Constraints
- `1 <= deadlines.length == rewards.length <= 100000`
- `1 <= deadlines[i] <= 100000`
- `1 <= rewards[i] <= 1000000000`

---
