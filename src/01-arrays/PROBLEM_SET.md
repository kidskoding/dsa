# Arrays: Problem Set

Drill the core array techniques — two pointers, prefix sums, Kadane, matrix transforms, Boyer–Moore voting, and sliding windows. **Foundational** problems build the moves you should write cold; **Applied Problems** weave interview-style (LeetCode) and competitive-programming-style (Codeforces / Advent of Code / Codyssi) challenges, roughly easy to hard.

**Foundational**

## Problem 1: Reverse In Place

**LeetCode:** [344. Reverse String](https://leetcode.com/problems/reverse-string/)

### Description

You are given an `int[]` array. Reverse its elements **in place** using `O(1)` extra space — swap from both ends toward the middle — and return the same array reference.

### Examples

**Example 1:**
```
Input:  [1, 2, 3, 4]
Output: [4, 3, 2, 1]
```
Two-pointer swaps: (1,4) then (2,3).

**Example 2:**
```
Input:  [1, 2, 3]
Output: [3, 2, 1]
```

**Example 3:**
```
Input:  []
Output: []
```

### Constraints

- `0 <= n <= 10^5`
- Must use `O(1)` extra space.

---

## Problem 2: Rotate Array Left

**LeetCode:** [189. Rotate Array](https://leetcode.com/problems/rotate-array/)

### Description

Rotate the array `nums` to the **left** by `k` positions, in place. `k` may exceed `n`, so reduce it modulo `n` first. The element at index `i` moves to index `(i - k mod n + n) mod n`.

### Examples

**Example 1:**
```
Input:  nums = [1, 2, 3, 4, 5], k = 2
Output: [3, 4, 5, 1, 2]
```
The first two elements wrap around to the end.

**Example 2:**
```
Input:  nums = [1, 2, 3], k = 0
Output: [1, 2, 3]
```

**Example 3:**
```
Input:  nums = [1, 2, 3, 4], k = 6
Output: [3, 4, 1, 2]
```
`6 mod 4 = 2`.

### Constraints

- `1 <= n <= 10^5`
- `0 <= k <= 10^9`

---

## Problem 3: Two Sum II (Sorted)

**LeetCode:** [167. Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)

### Description

Given a **sorted** (ascending) array `a` and a `target`, return the two **0-based indices** `[i, j]` with `i < j` whose values sum to `target`. If no such pair exists, return `[-1, -1]`. Use the two-pointer technique in `O(n)`.

### Examples

**Example 1:**
```
Input:  a = [2, 7, 11, 15], target = 9
Output: [0, 1]
```
`2 + 7 = 9`.

**Example 2:**
```
Input:  a = [2, 3, 4], target = 6
Output: [0, 2]
```

**Example 3:**
```
Input:  a = [1, 2, 3], target = 100
Output: [-1, -1]
```

### Constraints

- `2 <= n <= 10^4`
- At most one valid pair.

---

## Problem 4: Merge Sorted Arrays

**LeetCode:** [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

### Description

Given two sorted (ascending) arrays `a` and `b`, merge them into a single new sorted array and return it. Use a two-pointer merge in `O(a.length + b.length)`.

### Examples

**Example 1:**
```
Input:  a = [1, 3, 5], b = [2, 4]
Output: [1, 2, 3, 4, 5]
```

**Example 2:**
```
Input:  a = [], b = [1, 2]
Output: [1, 2]
```

**Example 3:**
```
Input:  a = [1, 1, 2], b = [1, 3]
Output: [1, 1, 1, 2, 3]
```

### Constraints

- `0 <= a.length, b.length <= 10^5`

---

## Problem 5: Maximum Subarray

**LeetCode:** [53. Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)

### Description

Return the maximum sum of any **contiguous, non-empty** subarray of `a`, using Kadane's algorithm in `O(n)`. At each index keep the best sum ending there: `cur = max(a[i], cur + a[i])`.

### Examples

**Example 1:**
```
Input:  [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
```
The subarray `[4, -1, 2, 1]` sums to 6.

**Example 2:**
```
Input:  [-3, -1, -2]
Output: -1
```
All negative — the single largest element wins.

**Example 3:**
```
Input:  [5, 4, -1, 7, 8]
Output: 23
```

### Constraints

- `1 <= n <= 10^5`
- `-10^4 <= a[i] <= 10^4`

---

## Problem 6: Remove Duplicates from Sorted Array

**LeetCode:** [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

### Description

Given a **sorted** array, compact it in place so each value appears once, preserving order. Return the new logical length `k`; the first `k` slots must hold the unique values. Use a slow/fast two-pointer write index.

### Examples

**Example 1:**
```
Input:  [0, 0, 1, 1, 2]
Output: 3
```
The array begins `[0, 1, 2, ...]`.

**Example 2:**
```
Input:  [1, 1, 1]
Output: 1
```

**Example 3:**
```
Input:  [1, 2, 3]
Output: 3
```

### Constraints

- `0 <= n <= 3 * 10^4`
- Input is sorted ascending.

---

**Applied Problems**

## Problem 7: Move Zeroes

**LeetCode:** [283. Move Zeroes](https://leetcode.com/problems/move-zeroes/)

### Description

Move all `0`s in `nums` to the end while preserving the relative order of the non-zero elements. Do it **in place** with `O(1)` extra space, then return the array.

### Examples

**Example 1:**
```
Input:  [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]
```

**Example 2:**
```
Input:  [0, 0, 1]
Output: [1, 0, 0]
```

**Example 3:**
```
Input:  [1, 2, 3]
Output: [1, 2, 3]
```

### Constraints

- `1 <= n <= 10^4`
- In place, `O(1)` extra space.

---

## Problem 8: Majority Element

**LeetCode:** [169. Majority Element](https://leetcode.com/problems/majority-element/)

### Description

Return the element that appears **more than `n/2` times** (guaranteed to exist). Use the Boyer–Moore voting algorithm in `O(n)` time and `O(1)` space: track a candidate and a count.

### Examples

**Example 1:**
```
Input:  [3, 2, 3]
Output: 3
```

**Example 2:**
```
Input:  [2, 2, 1, 1, 1, 2, 2]
Output: 2
```

**Example 3:**
```
Input:  [7]
Output: 7
```

### Constraints

- `1 <= n <= 5 * 10^4`
- A majority element always exists.

---

## Problem 9: Glacier Survey

### Description

A drone records ice thickness `t[i]` over `n` days. A *thaw streak* is a maximal run of consecutive days where each day is **strictly thinner** than the previous one. Return the length of the longest thaw streak. A single day counts as a streak of length 1; an empty array returns 0.

### Examples

**Example 1:**
```
Input:  [5, 3, 2, 4, 1]
Output: 3
```
The run `5, 3, 2` is strictly decreasing.

**Example 2:**
```
Input:  [1, 2, 3]
Output: 1
```
No two consecutive days decrease.

**Example 3:**
```
Input:  []
Output: 0
```

### Constraints

- `0 <= n <= 10^5`

---

## Problem 10: Container With Most Water

**LeetCode:** [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/)

### Description

Given vertical line heights `h`, find two lines that with the x-axis form a container holding the most water. Return the maximum area `min(h[i], h[j]) * (j - i)` over all pairs. Use two pointers in `O(n)`.

### Examples

**Example 1:**
```
Input:  [1, 8, 6, 2, 5, 4, 8, 3, 7]
Output: 49
```
Lines at indices 1 and 8: `min(8,7) * 7 = 49`.

**Example 2:**
```
Input:  [1, 1]
Output: 1
```

**Example 3:**
```
Input:  [4, 3, 2, 1, 4]
Output: 16
```

### Constraints

- `2 <= n <= 10^5`
- `0 <= h[i] <= 10^4`

---

## Problem 11: Relay Towers

### Description

`n` towers stand in a row with heights `h[i]`. Looking from the far left, a tower is *visible* if it is **strictly taller than every tower before it** (the first tower is always visible). Return the count of visible towers.

### Examples

**Example 1:**
```
Input:  [3, 1, 4, 1, 5]
Output: 3
```
Towers `3`, `4`, `5` are each a new running maximum.

**Example 2:**
```
Input:  [5, 4, 3]
Output: 1
```

**Example 3:**
```
Input:  [1, 2, 3, 4]
Output: 4
```

### Constraints

- `1 <= n <= 10^5`

---

## Problem 12: Best Time to Buy and Sell Stock

**LeetCode:** [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

### Description

Given daily `prices`, return the maximum profit from buying on one day and selling on a strictly later day. If no profit is possible, return `0`. Track the running minimum price in one `O(n)` pass.

### Examples

**Example 1:**
```
Input:  [7, 1, 5, 3, 6, 4]
Output: 5
```
Buy at 1, sell at 6.

**Example 2:**
```
Input:  [7, 6, 4, 3, 1]
Output: 0
```
Prices only fall.

**Example 3:**
```
Input:  [2, 4, 1]
Output: 2
```

### Constraints

- `1 <= n <= 10^5`
- `0 <= prices[i] <= 10^4`

---

## Problem 13: Product of Array Except Self

**LeetCode:** [238. Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)

### Description

Return an array `out` where `out[i]` is the product of all elements of `a` **except** `a[i]`. Do it **without division** in `O(n)` using prefix and suffix products.

### Examples

**Example 1:**
```
Input:  [1, 2, 3, 4]
Output: [24, 12, 8, 6]
```

**Example 2:**
```
Input:  [-1, 1, 0, -3, 3]
Output: [0, 0, 9, 0, 0]
```

**Example 3:**
```
Input:  [2, 3]
Output: [3, 2]
```

### Constraints

- `2 <= n <= 10^5`
- The full product fits in a 64-bit integer.

---

## Problem 14: Ledger Audit

### Description

Given `n` daily balance changes `d[i]` and `q` range queries `(l, r)`, return an array whose `j`-th entry is the **net change over days `l..r` inclusive**. Answer all queries in `O(n + q)` using a prefix-sum array.

### Examples

**Example 1:**
```
Input:  d = [1, -2, 3, 4], queries = [[0,1], [1,3], [0,3]]
Output: [-1, 5, 6]
```
`d[0..1] = -1`, `d[1..3] = 5`, `d[0..3] = 6`.

**Example 2:**
```
Input:  d = [5], queries = [[0,0]]
Output: [5]
```

**Example 3:**
```
Input:  d = [2, 2, 2], queries = [[0,2], [1,1]]
Output: [6, 2]
```

### Constraints

- `1 <= n, q <= 10^5`
- `0 <= l <= r < n`

---

## Problem 15: Spiral Matrix

**LeetCode:** [54. Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)

### Description

Given an `r x c` matrix, return all its elements in **clockwise spiral order**, starting from the top-left. Walk right, down, left, up while shrinking the four boundaries.

### Examples

**Example 1:**
```
Input:  [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
```

**Example 2:**
```
Input:  [[1, 2], [3, 4]]
Output: [1, 2, 4, 3]
```

**Example 3:**
```
Input:  [[1, 2, 3, 4]]
Output: [1, 2, 3, 4]
```

### Constraints

- `1 <= r, c <= 100`

---

## Problem 16: Caravan Fuel (Gas Station)

**LeetCode:** [134. Gas Station](https://leetcode.com/problems/gas-station/)

### Description

On a circular route of `n` stations, station `i` provides `gas[i]` fuel and driving to the next station burns `cost[i]`. Starting with an empty tank, return the index of the **first** station from which you can complete a full loop, or `-1` if impossible. Solve in one `O(n)` pass.

### Examples

**Example 1:**
```
Input:  gas = [1, 2, 3, 4, 5], cost = [3, 4, 5, 1, 2]
Output: 3
```
Starting at station 3 completes the loop.

**Example 2:**
```
Input:  gas = [2, 3, 4], cost = [3, 4, 3]
Output: -1
```

**Example 3:**
```
Input:  gas = [5, 1, 2, 3, 4], cost = [4, 4, 1, 5, 1]
Output: 4
```

### Constraints

- `1 <= n <= 10^5`
- The answer is unique if it exists.

---

## Problem 17: Rotate Image

**LeetCode:** [48. Rotate Image](https://leetcode.com/problems/rotate-image/)

### Description

Rotate an `n x n` matrix **90° clockwise, in place**, then return it. Standard approach: transpose the matrix, then reverse each row.

### Examples

**Example 1:**
```
Input:  [[1, 2], [3, 4]]
Output: [[3, 1], [4, 2]]
```

**Example 2:**
```
Input:  [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Output: [[7, 4, 1], [8, 5, 2], [9, 6, 3]]
```

**Example 3:**
```
Input:  [[1]]
Output: [[1]]
```

### Constraints

- `1 <= n <= 20`
- Rotate in place.

---

## Problem 18: Seismic Peaks

### Description

Given seismograph readings `a[i]`, a *peak* is an index `i` with `0 < i < n-1` satisfying `a[i-1] < a[i] > a[i+1]`. Return the number of peaks (endpoints can never be peaks).

### Examples

**Example 1:**
```
Input:  [1, 3, 2, 4, 1]
Output: 2
```
Peaks at index 1 (value 3) and index 3 (value 4).

**Example 2:**
```
Input:  [1, 2, 3]
Output: 0
```

**Example 3:**
```
Input:  [5, 1, 5, 1, 5]
Output: 1
```

### Constraints

- `1 <= n <= 10^5`

---

## Problem 19: Find Pivot Index

**LeetCode:** [724. Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)

### Description

Return the **leftmost** pivot index `i` where the sum of elements strictly to its left equals the sum strictly to its right. If none exists, return `-1`. Use a total sum and a running left sum in `O(n)`.

### Examples

**Example 1:**
```
Input:  [1, 7, 3, 6, 5, 6]
Output: 3
```
Left of index 3 sums to 11; right of it sums to 11.

**Example 2:**
```
Input:  [1, 2, 3]
Output: -1
```

**Example 3:**
```
Input:  [2, 1, -1]
Output: 0
```
Left of index 0 is empty (0); right is `1 + (-1) = 0`.

### Constraints

- `1 <= n <= 10^4`
- `-1000 <= a[i] <= 1000`

---

## Problem 20: Report Repair

### Description

From Advent of Code: given an expense report `a` of integers, find the **two distinct entries that sum to `target`** and return their product. Exactly one such pair exists. A hash set or two-pointer scan over the sorted array both work in `O(n)`.

### Examples

**Example 1:**
```
Input:  a = [1721, 979, 366, 299, 675, 1456], target = 2020
Output: 514579
```
`1721 + 299 = 2020`, and `1721 * 299 = 514579`.

**Example 2:**
```
Input:  a = [10, 20, 30], target = 50
Output: 600
```
`20 * 30 = 600`.

**Example 3:**
```
Input:  a = [1010, 1010, 5], target = 2020
Output: 1020100
```

### Constraints

- `2 <= n <= 10^5`
- Exactly one valid pair exists.

---

## Problem 21: Trapping Rain Water

**LeetCode:** [42. Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)

### Description

Given bar heights `h`, compute how much water is trapped after raining. Water above each bar is `min(maxLeft, maxRight) - h[i]`. Use two pointers in `O(n)` time and `O(1)` extra space.

### Examples

**Example 1:**
```
Input:  [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
Output: 6
```

**Example 2:**
```
Input:  [4, 2, 0, 3, 2, 5]
Output: 9
```

**Example 3:**
```
Input:  [1, 2, 3]
Output: 0
```

### Constraints

- `0 <= n <= 2 * 10^4`
- `0 <= h[i] <= 10^5`

---

## Problem 22: Subarray Sum Equals K

**LeetCode:** [560. Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)

### Description

Return the **number of contiguous subarrays** whose elements sum to exactly `k`. Use prefix sums with a hash map counting how many times each running sum has been seen, in `O(n)`.

### Examples

**Example 1:**
```
Input:  nums = [1, 1, 1], k = 2
Output: 2
```
Subarrays `[0..1]` and `[1..2]`.

**Example 2:**
```
Input:  nums = [1, 2, 3], k = 3
Output: 2
```
`[1, 2]` and `[3]`.

**Example 3:**
```
Input:  nums = [1, -1, 0], k = 0
Output: 3
```

### Constraints

- `1 <= n <= 2 * 10^4`
- `-10^7 <= k <= 10^7`

---

## Problem 23: Warehouse Forklift

### Description

A row of `n` crates has weights `w[i]`. A forklift moves left to right carrying a running load; whenever adding the next crate **would exceed** capacity `L`, it drops its current load (always able to carry at least one crate) and starts fresh with that crate. Return the total number of drops needed to clear all crates. The final non-empty load also counts as a drop.

### Examples

**Example 1:**
```
Input:  w = [2, 3, 1, 5], L = 5
Output: 3
```
Loads `[2,3]`, `[1]`, `[5]` — three drops.

**Example 2:**
```
Input:  w = [1, 1, 1], L = 5
Output: 1
```
All three fit in one load.

**Example 3:**
```
Input:  w = [4, 4, 4], L = 4
Output: 3
```

### Constraints

- `1 <= n <= 10^5`
- `1 <= w[i] <= L <= 10^9`

---

## Problem 24: Maximum Sum of Window Size K

**LeetCode:** [643. Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/)

### Description

Given an array `a` and an integer `k`, return the **maximum sum of any contiguous subarray of length exactly `k`**. Slide a fixed-size window: add the entering element, subtract the leaving one, in `O(n)`.

### Examples

**Example 1:**
```
Input:  a = [1, 12, -5, -6, 50, 3], k = 4
Output: 51
```
Window `[-5, -6, 50, 3]` sums to 42... the best window `[12, -5, -6, 50]` sums to 51.

**Example 2:**
```
Input:  a = [5, 5, 5], k = 1
Output: 5
```

**Example 3:**
```
Input:  a = [-1, -2, -3, -4], k = 2
Output: -3
```
Window `[-1, -2]`.

### Constraints

- `1 <= k <= n <= 10^5`

---
