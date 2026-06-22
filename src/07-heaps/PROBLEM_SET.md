# Heaps & Priority Queues: Problem Set

Heaps give you the cheapest possible answer to one recurring question: *which element matters most right now?* The foundational problems build the machine — sift-down, the array-as-tree layout, heapsort, the heap-select. The applied problems put that machine to work on the patterns heaps were born for: top-k selection, the running median with two balanced heaps, interval and deadline scheduling, k-way merging of sorted streams, and online/streaming computation where the data never stops arriving. Each problem is an implementation task: fill in the stub in `problemset/` and make its test in `tests/problemset/` pass.

**Foundational**

## Problem 1: Sift Down

### Description

Given an integer array interpreted as a complete binary tree (index `i` has children `2i + 1` and `2i + 2`), a heap size `n`, and an index `i` whose two child subtrees already satisfy the **max-heap** property, sift the element at index `i` downward until the subtree rooted at `i` is a valid max-heap. Operate in place and consider only indices in `[0, n)`.

This is the single primitive that powers heapify, extract-max, and heapsort. Each step swaps the current element with its larger child and descends; it stops when the element is at least as large as both children (or becomes a leaf).

### Examples

**Example 1:**
```
Input:  heap = [1, 9, 8, 5, 6, 7, 4], n = 7, i = 0
Output: [9, 6, 8, 5, 1, 7, 4]
```
The root `1` swaps with its larger child `9`, then with `6`, settling into a valid max-heap.

**Example 2:**
```
Input:  heap = [3, 1, 2], n = 3, i = 0
Output: [3, 1, 2]
```
The root `3` already dominates both children, so nothing moves.

**Example 3:**
```
Input:  heap = [4, 10, 9, 8, 3, 2, 1], n = 7, i = 0
Output: [10, 8, 9, 4, 3, 2, 1]
```
`4` sinks past `10` and then `8`.

### Constraints

- `1 <= n <= heap.length <= 10^4`
- `0 <= i < n`
- The subtrees rooted at the children of `i` are already valid max-heaps.

---

## Problem 2: Is It a Min-Heap?

### Description

Given an integer array using the standard array-as-complete-binary-tree layout, decide whether it satisfies the **min-heap** property: every node is less than or equal to each of its children. Return `true` if the array is a valid min-heap and `false` otherwise. An empty or single-element array is trivially a valid heap.

### Examples

**Example 1:**
```
Input:  [1, 3, 2, 7, 4, 5, 6]
Output: true
```
Each parent is `<=` both children.

**Example 2:**
```
Input:  [1, 3, 2, 7, 4, 0, 6]
Output: false
```
Node `2` at index 2 has a child `0` at index 5, violating the property.

**Example 3:**
```
Input:  [5]
Output: true
```
A single element is always a valid heap.

### Constraints

- `0 <= array.length <= 10^5`
- Values fit in a 32-bit signed integer.

---

## Problem 3: Heapsort

### Description

Given an integer array, sort it in ascending order **in place** using heapsort: build a max-heap over the whole array, then repeatedly swap the root (current maximum) to the end of the active heap region and sift the new root down over the shrunken region. Do not call a library sort.

### Examples

**Example 1:**
```
Input:  [5, 1, 4, 2, 8]
Output: [1, 2, 4, 5, 8]
```

**Example 2:**
```
Input:  [3, 3, 1, 2, 3]
Output: [1, 2, 3, 3, 3]
```
Duplicates are handled correctly.

**Example 3:**
```
Input:  [9]
Output: [9]
```

### Constraints

- `0 <= array.length <= 10^5`
- Values fit in a 32-bit signed integer.

---

## Problem 4: K Smallest Elements

### Description

Given an integer array and an integer `k`, return the `k` smallest values in **ascending** order, using a heap. If `k >= array.length`, return all elements sorted ascending. Duplicates count individually (so the result may contain repeats).

A classic approach keeps a max-heap of size `k`: push each element, and whenever the heap exceeds `k` evict its maximum, so the heap always holds the `k` smallest seen so far.

### Examples

**Example 1:**
```
Input:  array = [7, 10, 4, 3, 20, 15], k = 3
Output: [3, 4, 7]
```

**Example 2:**
```
Input:  array = [1, 1, 1, 2], k = 2
Output: [1, 1]
```

**Example 3:**
```
Input:  array = [5, 2], k = 5
Output: [2, 5]
```
`k` exceeds the length, so all elements are returned sorted.

### Constraints

- `0 <= k`
- `0 <= array.length <= 10^5`
- Values fit in a 32-bit signed integer.

---

## Problem 5: Heap Index Arithmetic

### Description

For a 0-indexed **d-ary** heap with branching factor `d` (each node has up to `d` children), implement two index helpers:

- `parent(i, d)` returns the parent index of node `i`, or `-1` if `i` is the root (`i == 0`).
- `child(i, j, d)` returns the index of the `j`-th child (0-indexed, `0 <= j < d`) of node `i`.

For a d-ary heap the parent of node `i` is `(i - 1) / d` (integer division) and the `j`-th child is `d * i + j + 1`.

### Examples

**Example 1:**
```
Input:  parent(i = 5, d = 2)
Output: 2
```
In a binary heap, index 5's parent is `(5 - 1) / 2 = 2`.

**Example 2:**
```
Input:  child(i = 2, j = 0, d = 3)
Output: 7
```
In a ternary heap, node 2's first child is `3*2 + 0 + 1 = 7`.

**Example 3:**
```
Input:  parent(i = 0, d = 4)
Output: -1
```
The root has no parent.

### Constraints

- `d >= 2`
- `i >= 0`, `0 <= j < d`
- Results fit in a 32-bit signed integer.

---

**Applied Problems**

## Problem 6: Kth Largest Element in an Array

**LeetCode:** [215. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)

### Description

Given an integer array `nums` and an integer `k`, return the `k`-th largest element in the array. Note that it is the `k`-th largest in sorted order, not the `k`-th distinct element. Aim for an `O(n log k)` solution using a size-`k` min-heap (the heap's root is the answer once all elements are processed).

### Examples

**Example 1:**
```
Input:  nums = [3, 2, 1, 5, 6, 4], k = 2
Output: 5
```

**Example 2:**
```
Input:  nums = [3, 2, 3, 1, 2, 4, 5, 5, 6], k = 4
Output: 4
```

**Example 3:**
```
Input:  nums = [1], k = 1
Output: 1
```

### Constraints

- `1 <= k <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4`

---

## Problem 7: Last Stone Weight

**LeetCode:** [1046. Last Stone Weight](https://leetcode.com/problems/last-stone-weight/)

### Description

You are given an array of integer stone weights. On each turn, smash together the two heaviest stones with weights `x <= y`: if `x == y` both are destroyed; otherwise the stone of weight `x` is destroyed and the stone of weight `y` becomes weight `y - x`. Repeat until at most one stone remains. Return the weight of the last remaining stone, or `0` if none remain. Use a max-heap.

### Examples

**Example 1:**
```
Input:  stones = [2, 7, 4, 1, 8, 1]
Output: 1
```
Smash 8 and 7 -> 1; stones `[2,4,1,1,1]`. Smash 4 and 2 -> 2; `[2,1,1,1]`. Smash 2 and 1 -> 1; `[1,1,1]`. Smash 1 and 1 -> 0; `[1]`. Last stone is `1`.

**Example 2:**
```
Input:  stones = [1]
Output: 1
```

**Example 3:**
```
Input:  stones = [3, 3]
Output: 0
```
Equal stones annihilate each other.

### Constraints

- `1 <= stones.length <= 3 * 10^4`
- `1 <= stones[i] <= 10^4`

---

## Problem 8: K Closest Points to Origin

**LeetCode:** [973. K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/)

### Description

Given an array of 2-D points `points[i] = [xi, yi]` and an integer `k`, return the `k` points closest to the origin `(0, 0)` by Euclidean distance. The answer may be returned in any order. Compare squared distances to avoid floating point. Use a size-`k` max-heap keyed on squared distance.

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
Returned order may vary.

**Example 3:**
```
Input:  points = [[0, 1], [1, 0]], k = 2
Output: [[0, 1], [1, 0]]
```

### Constraints

- `1 <= k <= points.length <= 10^4`
- `-10^4 <= xi, yi <= 10^4`

---

## Problem 9: Top K Frequent Elements

**LeetCode:** [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)

### Description

Given an integer array `nums` and an integer `k`, return the `k` most frequent elements, ordered by **descending** frequency. It is guaranteed the answer is unique. Tally counts in a map, then select the top `k` by frequency with a heap.

### Examples

**Example 1:**
```
Input:  nums = [1, 1, 1, 2, 2, 3], k = 2
Output: [1, 2]
```
`1` appears 3 times, `2` twice.

**Example 2:**
```
Input:  nums = [1], k = 1
Output: [1]
```

**Example 3:**
```
Input:  nums = [4, 4, 4, 6, 6, 7], k = 2
Output: [4, 6]
```

### Constraints

- `1 <= nums.length <= 10^5`
- `k` is in the range `[1, number of distinct elements]`.
- The answer is unique.

---

## Problem 10: Kth Largest Element in a Stream

**LeetCode:** [703. Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/)

### Description

Design a class that, given `k` and an initial array of integers, supports an `add(val)` operation returning the `k`-th largest element in the stream **after** inserting `val`. The same value may appear multiple times. Maintain a size-`k` min-heap so each `add` runs in `O(log k)` and its root is the current `k`-th largest.

### Examples

**Example 1:**
```
Input:  k = 3, initial = [4, 5, 8, 2]; add(3), add(5), add(10), add(9), add(4)
Output: [4, 5, 5, 8, 8]
```
Each call reports the 3rd-largest after the insertion.

**Example 2:**
```
Input:  k = 1, initial = []; add(-3), add(-2), add(-4), add(0), add(4)
Output: [-3, -2, -2, 0, 4]
```
With `k = 1` the answer is the running maximum.

**Example 3:**
```
Input:  k = 2, initial = [0]; add(-1), add(1), add(-2), add(-4), add(3)
Output: [-1, 0, 0, 0, 1]
```

### Constraints

- `1 <= k <= 10^4`
- `0 <= initial.length <= 10^4`
- `-10^4 <= each value <= 10^4`
- At most `10^4` calls to `add`.

---

## Problem 11: Find Median from Data Stream

**LeetCode:** [295. Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/)

### Description

Design a data structure that supports adding integers from a stream and finding the median of all elements added so far. Implement `addNum(int num)` and `findMedian()` (which returns a `double`; for an even count it is the average of the two middle values). Use a max-heap for the lower half and a min-heap for the upper half, kept balanced so each operation is `O(log n)`.

### Examples

**Example 1:**
```
Input:  addNum(1), addNum(2), findMedian(), addNum(3), findMedian()
Output: 1.5, 2.0
```
After `1, 2` the median is `1.5`; after `1, 2, 3` it is `2.0`.

**Example 2:**
```
Input:  addNum(5), findMedian()
Output: 5.0
```

**Example 3:**
```
Input:  addNum(-1), addNum(-2), addNum(-3), findMedian()
Output: -2.0
```

### Constraints

- `-10^5 <= num <= 10^5`
- `findMedian` is only called after at least one `addNum`.
- At most `5 * 10^4` calls in total.

---

## Problem 12: Sort a Nearly Sorted Array

### Description

Given an array in which every element is at most `k` positions away from its correct sorted position, sort it in ascending order in `O(n log k)` time using a bounded-size min-heap of capacity `k + 1`. Push elements into the heap; once it holds `k + 1` elements, pop the minimum into the output before pushing the next, then drain the heap at the end.

### Examples

**Example 1:**
```
Input:  array = [6, 5, 3, 2, 8, 10, 9], k = 3
Output: [2, 3, 5, 6, 8, 9, 10]
```

**Example 2:**
```
Input:  array = [2, 1, 3], k = 1
Output: [1, 2, 3]
```

**Example 3:**
```
Input:  array = [10, 9, 8, 7, 4, 70, 60, 50], k = 4
Output: [4, 7, 8, 9, 10, 50, 60, 70]
```

### Constraints

- `0 <= k < array.length <= 10^5`
- Values fit in a 32-bit signed integer.

---

## Problem 13: Meeting Rooms II

**LeetCode:** [253. Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/)

### Description

Given an array of half-open meeting intervals `intervals[i] = [start, end)`, return the minimum number of conference rooms required so that no two overlapping meetings share a room. Sort by start time and use a min-heap of end times: for each meeting, if the earliest-ending room frees by its start, reuse it; otherwise open a new room. The answer is the maximum simultaneous occupancy.

### Examples

**Example 1:**
```
Input:  intervals = [[0, 30], [5, 10], [15, 20]]
Output: 2
```
`[0,30]` overlaps both others, but `[5,10]` and `[15,20]` don't overlap each other.

**Example 2:**
```
Input:  intervals = [[7, 10], [2, 4]]
Output: 1
```
Disjoint meetings reuse one room.

**Example 3:**
```
Input:  intervals = [[1, 5], [2, 6], [3, 7]]
Output: 3
```
All three overlap.

### Constraints

- `0 <= intervals.length <= 10^4`
- `0 <= start < end <= 10^6`

---

## Problem 14: Task Scheduler

**LeetCode:** [621. Task Scheduler](https://leetcode.com/problems/task-scheduler/)

### Description

Given an array of CPU tasks identified by uppercase letters and a non-negative integer `n` representing the cooldown, return the minimum number of time units (each unit runs one task or idles) the CPU needs to finish all tasks. Two identical tasks must be separated by at least `n` units. A heap-driven greedy schedule always runs the most-frequent ready task.

### Examples

**Example 1:**
```
Input:  tasks = ['A', 'A', 'A', 'B', 'B', 'B'], n = 2
Output: 8
```
One valid order is `A B idle A B idle A B`.

**Example 2:**
```
Input:  tasks = ['A', 'A', 'A', 'B', 'B', 'B'], n = 0
Output: 6
```
No cooldown means no idling.

**Example 3:**
```
Input:  tasks = ['A', 'A', 'A', 'B', 'C', 'D'], n = 2
Output: 7
```
`A ? ? A ? ? A` with the others filling the gaps -> length 7.

### Constraints

- `1 <= tasks.length <= 10^4`
- `tasks[i]` is an uppercase English letter.
- `0 <= n <= 100`

---

## Problem 15: Reorganize String

**LeetCode:** [767. Reorganize String](https://leetcode.com/problems/reorganize-string/)

### Description

Given a string `s`, rearrange its characters so that no two adjacent characters are the same, and return any valid arrangement. If no such arrangement exists, return the empty string `""`. Greedily place the most frequent remaining character using a max-heap, never picking the character placed immediately before.

### Examples

**Example 1:**
```
Input:  s = "aab"
Output: "aba"
```

**Example 2:**
```
Input:  s = "aaab"
Output: ""
```
`a` appears too often to separate.

**Example 3:**
```
Input:  s = "vvvlo"
Output: "vlvov"
```
Any arrangement with no equal adjacent pair is accepted.

### Constraints

- `1 <= s.length <= 500`
- `s` consists of lowercase English letters.

---

## Problem 16: Merge k Sorted Lists

**LeetCode:** [23. Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)

### Description

Given `k` ascending-sorted integer lists (each as an `int[]`), merge them into a single ascending-sorted array in `O(N log k)` time using a min-heap, where `N` is the total number of elements. Seed the heap with the head of each non-empty list; repeatedly pop the smallest and push the next element from the same list.

### Examples

**Example 1:**
```
Input:  lists = [[1, 4, 5], [1, 3, 4], [2, 6]]
Output: [1, 1, 2, 3, 4, 4, 5, 6]
```

**Example 2:**
```
Input:  lists = []
Output: []
```

**Example 3:**
```
Input:  lists = [[], [0]]
Output: [0]
```
Empty lists are skipped.

### Constraints

- `0 <= k <= 10^4`
- The total number of elements across all lists is at most `10^5`.
- Each list is sorted in ascending order.

---

## Problem 17: Smallest Range Covering Elements from K Lists

**LeetCode:** [632. Smallest Range Covering Elements from K Lists](https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/)

### Description

You have `k` lists of integers, each sorted in ascending order. Find the smallest range `[a, b]` that includes at least one number from each of the `k` lists. A range `[a, b]` is smaller than `[c, d]` if `b - a < d - c`, or if `b - a == d - c` and `a < c`. Use a min-heap holding one candidate per list (like a k-way merge), tracking the current maximum to size each window.

### Examples

**Example 1:**
```
Input:  lists = [[4, 10, 15, 24, 26], [0, 9, 12, 20], [5, 18, 22, 30]]
Output: [20, 24]
```
`24` is in list 1, `20` in list 2, `22` in list 3; width 4 is minimal.

**Example 2:**
```
Input:  lists = [[1, 2, 3], [1, 2, 3], [1, 2, 3]]
Output: [1, 1]
```

**Example 3:**
```
Input:  lists = [[10], [11]]
Output: [10, 11]
```

### Constraints

- `1 <= k <= 3500`
- `1 <= lists[i].length <= 50`
- `-10^5 <= lists[i][j] <= 10^5`
- Each list is sorted in ascending order.

---

## Problem 18: Find K Pairs with Smallest Sums

**LeetCode:** [373. Find K Pairs with Smallest Sums](https://leetcode.com/problems/find-k-pairs-with-smallest-sums/)

### Description

Given two ascending-sorted integer arrays `nums1` and `nums2` and an integer `k`, return the `k` pairs `(u, v)` with `u` from `nums1` and `v` from `nums2` that have the smallest sums `u + v`. Return at most `k` pairs (fewer if the total number of pairs is smaller). Use a min-heap over candidate pairs, expanding neighbors lazily so you never materialize all `m * n` pairs.

### Examples

**Example 1:**
```
Input:  nums1 = [1, 7, 11], nums2 = [2, 4, 6], k = 3
Output: [[1, 2], [1, 4], [1, 6]]
```

**Example 2:**
```
Input:  nums1 = [1, 1, 2], nums2 = [1, 2, 3], k = 2
Output: [[1, 1], [1, 1]]
```

**Example 3:**
```
Input:  nums1 = [1, 2], nums2 = [3], k = 3
Output: [[1, 3], [2, 3]]
```
Only two pairs exist, so all are returned.

### Constraints

- `1 <= nums1.length, nums2.length <= 10^5`
- `-10^9 <= nums1[i], nums2[i] <= 10^9`
- `1 <= k <= 10^4`
- Both arrays are sorted in ascending order.

---

## Problem 19: Sliding Window Median

**LeetCode:** [480. Sliding Window Median](https://leetcode.com/problems/sliding-window-median/)

### Description

Given an integer array `nums` and a window size `k`, return the median of each contiguous window of size `k` as the window slides one step at a time. For an even `k` the median is the average of the two middle values (a `double`); for odd `k` it is the single middle value. Maintain the window with two balanced heaps and lazy deletion so each step is roughly `O(log k)`.

### Examples

**Example 1:**
```
Input:  nums = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
Output: [1.0, -1.0, -1.0, 3.0, 5.0, 6.0]
```

**Example 2:**
```
Input:  nums = [1, 2, 3, 4], k = 2
Output: [1.5, 2.5, 3.5]
```

**Example 3:**
```
Input:  nums = [5, 5, 5], k = 1
Output: [5.0, 5.0, 5.0]
```

### Constraints

- `1 <= k <= nums.length <= 10^5`
- `-2^31 <= nums[i] <= 2^31 - 1`

---

## Problem 20: IPO

**LeetCode:** [502. IPO](https://leetcode.com/problems/ipo/)

### Description

You can complete at most `k` distinct projects. Project `i` has a one-time `capital[i]` requirement and a `profits[i]` payoff added to your working capital on completion. Starting with capital `w`, repeatedly pick the most profitable project you can currently afford. Return the maximum capital after finishing at most `k` projects. Sort projects by capital and use a max-heap keyed on profit over the currently affordable set.

### Examples

**Example 1:**
```
Input:  k = 2, w = 0, profits = [1, 2, 3], capital = [0, 1, 1]
Output: 4
```
Take project 0 (capital 0 -> 1), then the profit-3 project (capital 1 -> 4).

**Example 2:**
```
Input:  k = 3, w = 0, profits = [1, 2, 3], capital = [0, 1, 2]
Output: 6
```
All three become affordable in turn.

**Example 3:**
```
Input:  k = 1, w = 2, profits = [1, 2, 3], capital = [1, 1, 2]
Output: 5
```
Pick the most profitable affordable project (profit 3).

### Constraints

- `1 <= k <= 10^5`
- `0 <= w <= 10^9`
- `1 <= profits.length == capital.length <= 10^5`
- `0 <= profits[i], capital[i] <= 10^9`

---

## Problem 21: Single-Threaded CPU

**LeetCode:** [1834. Single-Threaded CPU](https://leetcode.com/problems/single-threaded-cpu/)

### Description

You are given `n` tasks where `tasks[i] = [enqueueTime, processingTime]`. A single-threaded CPU, whenever idle, picks the available task (enqueue time `<=` current time) with the **shortest processing time**, breaking ties by smaller original index. If no task is available it idles to the next enqueue time. Return the order of task indices in which the CPU processes them. Use a min-heap keyed on `(processingTime, index)`.

### Examples

**Example 1:**
```
Input:  tasks = [[1, 2], [2, 4], [3, 2], [4, 1]]
Output: [0, 2, 3, 1]
```
At time 1 only task 0 is ready; by time 3 the shortest ready task is 2, then 3, then 1.

**Example 2:**
```
Input:  tasks = [[7, 10], [7, 12], [7, 5], [7, 4], [7, 2]]
Output: [4, 3, 2, 0, 1]
```
All arrive at time 7, so they run by ascending processing time.

**Example 3:**
```
Input:  tasks = [[1, 2]]
Output: [0]
```

### Constraints

- `1 <= tasks.length <= 10^5`
- `1 <= enqueueTime, processingTime <= 10^9`

---

## Problem 22: Cargo Merge Cost

### Description

A freighter combines `n` cargo piles into a single pile. Merging two piles costs the sum of their weights and produces a new pile of that combined weight. Always merge the two lightest piles (Huffman-style). Return the total merge cost of reducing `weights` to one pile, or `0` if there are fewer than two piles. Use a min-heap.

### Examples

**Example 1:**
```
Input:  weights = [4, 3, 2, 6]
Output: 29
```
Merge 2+3=5 (cost 5), then 4+5=9 (cost 9), then 6+9=15 (cost 15); total `5+9+15 = 29`.

**Example 2:**
```
Input:  weights = [1, 2, 3]
Output: 9
```
Merge 1+2=3 (cost 3), then 3+3=6 (cost 6); total `9`.

**Example 3:**
```
Input:  weights = [5]
Output: 0
```
A single pile needs no merging.

### Constraints

- `0 <= weights.length <= 10^5`
- `1 <= weights[i] <= 10^4`

---

## Problem 23: Running Median Checksum

### Description

A sensor reports a stream of integer readings. After each reading, take the **running lower median**: the element at index `(count - 1) / 2` of the readings-so-far in sorted order (so for an even count it is the lower of the two middle values). Return the sum of all running lower medians across the whole stream. Maintain the medians online with two heaps.

### Examples

**Example 1:**
```
Input:  stream = [2, 1, 5, 7, 2, 0, 5]
Output: 13
```
The running lower medians are `2, 1, 2, 2, 2, 2, 2`, which sum to `13`.

**Example 2:**
```
Input:  stream = [5]
Output: 5
```
The only median is `5`.

**Example 3:**
```
Input:  stream = [3, 1]
Output: 4
```
Medians are `3` then lower-of(`1, 3`) = `1`; sum `4`.

### Constraints

- `1 <= stream.length <= 10^5`
- `-10^4 <= stream[i] <= 10^4`

---

## Problem 24: Galactic Relay Merge

### Description

Given `k` strictly-ascending id streams (each an `int[]`), consider their merged ascending sequence with duplicates kept across streams. Return the id at 0-indexed position `target` in that merged sequence, or `-1` if the merged sequence has fewer than `target + 1` elements. Do not fully materialize the merge; advance a min-heap `target + 1` times.

### Examples

**Example 1:**
```
Input:  streams = [[1, 4, 7], [2, 5, 8], [3, 6, 9]], target = 4
Output: 5
```
Merged: `1, 2, 3, 4, 5, ...`; index 4 is `5`.

**Example 2:**
```
Input:  streams = [[1, 2, 3]], target = 0
Output: 1
```

**Example 3:**
```
Input:  streams = [[10], [11]], target = 5
Output: -1
```
Only two elements exist, so index 5 is out of range.

### Constraints

- `1 <= k <= 10^4`
- `0 <= target`
- Total elements across all streams is at most `10^5`.
- Each stream is strictly ascending.

---
