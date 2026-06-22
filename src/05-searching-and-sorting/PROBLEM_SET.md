# Searching & Sorting: Problem Set

These problems drill the core toolkit of this module: binary search and its
generalization to "binary search on the answer," comparison and non-comparison
sorting, selection (finding the k-th element without a full sort), custom
comparators, and ranking. Each problem is an implementation task — fill in the
stub in `problemset/` and make its test in `tests/problemset/` pass. The
**Foundational** problems isolate one technique at a time; the **Applied
Problems** weave those techniques into LeetCode and contest-style challenges,
ordered roughly easy to hard.

**Foundational**

## Problem 1: Classic Binary Search

**LeetCode:** [704. Binary Search](https://leetcode.com/problems/binary-search/)

### Description
Given an array `nums` sorted in ascending order with all distinct values, and a
target value `target`, return the index of `target` in `nums`, or `-1` if it is
not present. You must run in `O(log n)` time, so do not scan the array linearly.

### Examples
**Example 1:**
```
Input:  nums = [-1, 0, 3, 5, 9, 12], target = 9
Output: 4
```
`9` lives at index `4`.

**Example 2:**
```
Input:  nums = [-1, 0, 3, 5, 9, 12], target = 2
Output: -1
```
`2` does not appear in `nums`.

**Example 3:**
```
Input:  nums = [5], target = 5
Output: 0
```

### Constraints
- `1 <= nums.length <= 10^4`
- `-10^4 < nums[i], target < 10^4`
- All values in `nums` are distinct and sorted ascending.

---

## Problem 2: Search Insert Position

**LeetCode:** [35. Search Insert Position](https://leetcode.com/problems/search-insert-position/)

### Description
Given a sorted array of distinct integers and a target value, return the index
where the target is found. If it is not found, return the index where it would
be inserted to keep the array sorted. You must run in `O(log n)` time.

### Examples
**Example 1:**
```
Input:  nums = [1, 3, 5, 6], target = 5
Output: 2
```
`5` is found at index `2`.

**Example 2:**
```
Input:  nums = [1, 3, 5, 6], target = 2
Output: 1
```
`2` would be inserted between `1` and `3`, at index `1`.

**Example 3:**
```
Input:  nums = [1, 3, 5, 6], target = 7
Output: 4
```
`7` is larger than every element, so it goes at the end.

### Constraints
- `1 <= nums.length <= 10^4`
- `-10^4 <= nums[i], target <= 10^4`
- `nums` contains distinct values sorted in ascending order.

---

## Problem 3: Find First and Last Position

**LeetCode:** [34. Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

### Description
Given an array of integers sorted in non-decreasing order, find the starting and
ending index of a given target value, returned as a two-element array
`[first, last]`. If the target is not found, return `[-1, -1]`. You must run in
`O(log n)` time, so binary-search the two boundaries separately rather than
scanning the run.

### Examples
**Example 1:**
```
Input:  nums = [5, 7, 7, 8, 8, 10], target = 8
Output: [3, 4]
```
The run of `8`s spans indices `3` through `4`.

**Example 2:**
```
Input:  nums = [5, 7, 7, 8, 8, 10], target = 6
Output: [-1, -1]
```
`6` is absent.

**Example 3:**
```
Input:  nums = [], target = 0
Output: [-1, -1]
```

### Constraints
- `0 <= nums.length <= 10^5`
- `-10^9 <= nums[i], target <= 10^9`
- `nums` is sorted in non-decreasing order.

---

## Problem 4: Merge Two Sorted Arrays

**LeetCode:** [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

### Description
Given two arrays `a` and `b`, each sorted in non-decreasing order, return a
single new array containing all elements of both, sorted in non-decreasing
order. Do not call a library sort — merge the two runs with a two-pointer scan
in `O(m + n)` time.

### Examples
**Example 1:**
```
Input:  a = [1, 2, 3], b = [2, 5, 6]
Output: [1, 2, 2, 3, 5, 6]
```

**Example 2:**
```
Input:  a = [], b = [1]
Output: [1]
```
One input is empty, so the result is the other.

**Example 3:**
```
Input:  a = [4, 4], b = [1, 4]
Output: [1, 4, 4, 4]
```
Duplicates across the two arrays are all kept.

### Constraints
- `0 <= a.length, b.length <= 10^5`
- `-10^9 <= a[i], b[i] <= 10^9`
- Both `a` and `b` are sorted in non-decreasing order.

---

## Problem 5: Kth Smallest Element (Quickselect)

**LeetCode:** [215. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)

### Description
Given an integer array `nums` and an integer `k` (1-indexed), return the `k`-th
smallest element in the array. Aim for average linear time using a
quickselect-style partition — do not perform a full sort. Note this asks for the
`k`-th *smallest*: `k = 1` is the minimum, `k = nums.length` is the maximum.

### Examples
**Example 1:**
```
Input:  nums = [3, 2, 1, 5, 6, 4], k = 2
Output: 2
```
The sorted order is `[1, 2, 3, 4, 5, 6]`; the 2nd smallest is `2`.

**Example 2:**
```
Input:  nums = [3, 2, 3, 1, 2, 4, 5, 5, 6], k = 4
Output: 3
```
Duplicates count toward the rank.

**Example 3:**
```
Input:  nums = [7], k = 1
Output: 7
```

### Constraints
- `1 <= k <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4`

---

## Problem 6: Sort Colors (Dutch National Flag)

**LeetCode:** [75. Sort Colors](https://leetcode.com/problems/sort-colors/)

### Description
Given an array `nums` containing only the values `0`, `1`, and `2` (representing
red, white, and blue), sort it in place so all `0`s come first, then all `1`s,
then all `2`s. Do it in a single pass with `O(1)` extra space using the
three-way (Dutch national flag) partition. Return the same array after sorting.

### Examples
**Example 1:**
```
Input:  nums = [2, 0, 2, 1, 1, 0]
Output: [0, 0, 1, 1, 2, 2]
```

**Example 2:**
```
Input:  nums = [2, 0, 1]
Output: [0, 1, 2]
```

**Example 3:**
```
Input:  nums = [0]
Output: [0]
```

### Constraints
- `1 <= nums.length <= 300`
- `nums[i]` is `0`, `1`, or `2`.

---

**Applied Problems**

## Problem 7: First Bad Version

**LeetCode:** [278. First Bad Version](https://leetcode.com/problems/first-bad-version/)

### Description
You are managing `n` versions `1..n` of a product. Each version is built from the
previous one, and once a version is bad every later version is bad too. You are
given the first bad version index `bad` (the smallest index that is bad). Using
only the monotone predicate "is version `v` bad?" (`v >= bad`), return the first
bad version while making `O(log n)` predicate checks. Binary-search the boundary
between good and bad.

### Examples
**Example 1:**
```
Input:  n = 5, bad = 4
Output: 4
```
Versions `4` and `5` are bad; `4` is the first.

**Example 2:**
```
Input:  n = 1, bad = 1
Output: 1
```

**Example 3:**
```
Input:  n = 10, bad = 1
Output: 1
```
Every version is bad, so the first is `1`.

### Constraints
- `1 <= bad <= n <= 2^31 - 1`
- The predicate is monotone: if version `v` is bad, every version `> v` is bad.

---

## Problem 8: Single Element in a Sorted Array

**LeetCode:** [540. Single Element in a Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/)

### Description
You are given a sorted array where every element appears exactly twice except for
one element that appears exactly once. Return that single element. You must run
in `O(log n)` time and `O(1)` space — binary-search on the parity of indices.
Before the lone element the first of each pair sits at an even index; after it
the pattern flips.

### Examples
**Example 1:**
```
Input:  nums = [1, 1, 2, 3, 3, 4, 4, 8, 8]
Output: 2
```

**Example 2:**
```
Input:  nums = [3, 3, 7, 7, 10, 11, 11]
Output: 10
```

**Example 3:**
```
Input:  nums = [5]
Output: 5
```
A single element is itself the unpaired one.

### Constraints
- `1 <= nums.length <= 10^5`, and `nums.length` is odd.
- `0 <= nums[i] <= 10^5`
- `nums` is sorted in non-decreasing order with exactly one unpaired value.

---

## Problem 9: Find Peak Element

**LeetCode:** [162. Find Peak Element](https://leetcode.com/problems/find-peak-element/)

### Description
A peak element is one that is strictly greater than its neighbors. Given an array
`nums` where `nums[i] != nums[i+1]` for all valid `i`, return the index of any
peak. Imagine `nums[-1]` and `nums[n]` are both negative infinity, so the ends
can be peaks. You must run in `O(log n)` time by always walking toward the higher
neighbor.

### Examples
**Example 1:**
```
Input:  nums = [1, 2, 3, 1]
Output: 2
```
`3` at index `2` is greater than both neighbors.

**Example 2:**
```
Input:  nums = [1, 2, 1, 3, 5, 6, 4]
Output: 5
```
Index `5` (value `6`) is a peak; index `1` (value `2`) would also be acceptable.

**Example 3:**
```
Input:  nums = [1]
Output: 0
```

### Constraints
- `1 <= nums.length <= 1000`
- `-2^31 <= nums[i] <= 2^31 - 1`
- `nums[i] != nums[i + 1]` for all valid `i`.

---

## Problem 10: Search in Rotated Sorted Array

**LeetCode:** [33. Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)

### Description
An ascending sorted array of distinct integers is rotated at an unknown pivot, so
`[0,1,2,4,5,6,7]` might become `[4,5,6,7,0,1,2]`. Given the rotated array `nums`
and a `target`, return the index of `target`, or `-1` if it is absent. You must
run in `O(log n)` time — find the target directly with a modified binary search,
without first locating the pivot in a separate pass.

### Examples
**Example 1:**
```
Input:  nums = [4, 5, 6, 7, 0, 1, 2], target = 0
Output: 4
```

**Example 2:**
```
Input:  nums = [4, 5, 6, 7, 0, 1, 2], target = 3
Output: -1
```

**Example 3:**
```
Input:  nums = [1], target = 0
Output: -1
```

### Constraints
- `1 <= nums.length <= 5000`
- `-10^4 <= nums[i], target <= 10^4`
- All values are distinct; `nums` was originally ascending then rotated.

---

## Problem 11: Find Minimum in Rotated Sorted Array

**LeetCode:** [153. Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)

### Description
An ascending sorted array of distinct integers has been rotated at an unknown
pivot. Return the minimum element. You must run in `O(log n)` time by comparing
the midpoint against the right end to decide which half holds the rotation point.

### Examples
**Example 1:**
```
Input:  nums = [3, 4, 5, 1, 2]
Output: 1
```

**Example 2:**
```
Input:  nums = [4, 5, 6, 7, 0, 1, 2]
Output: 0
```

**Example 3:**
```
Input:  nums = [11, 13, 15, 17]
Output: 11
```
A zero-rotation array still returns its first element.

### Constraints
- `1 <= nums.length <= 5000`
- `-5000 <= nums[i] <= 5000`
- All values are distinct.

---

## Problem 12: Search a 2D Matrix

**LeetCode:** [74. Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/)

### Description
You are given an `m x n` matrix in which each row is sorted left to right, and
the first integer of each row is greater than the last integer of the previous
row. Given a `target`, return whether it appears in the matrix. You must run in
`O(log(m * n))` time — treat the matrix as one flattened sorted array and binary
search it, mapping a flat index back to `(row, col)`.

### Examples
**Example 1:**
```
Input:  matrix = [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]], target = 3
Output: true
```

**Example 2:**
```
Input:  matrix = [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]], target = 13
Output: false
```

**Example 3:**
```
Input:  matrix = [[1]], target = 1
Output: true
```

### Constraints
- `1 <= m, n <= 100`
- `-10^4 <= matrix[i][j], target <= 10^4`
- The whole matrix, read row by row, is in ascending order.

---

## Problem 13: Kth Largest Element

**LeetCode:** [215. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)

### Description
Given an integer array `nums` and an integer `k`, return the `k`-th largest
element (1-indexed), where `k = 1` is the maximum. This is the rank in sorted
order, not the `k`-th distinct value, so duplicates count. Solve it without a
full sort — a quickselect or a size-`k` heap both meet the bar.

### Examples
**Example 1:**
```
Input:  nums = [3, 2, 1, 5, 6, 4], k = 2
Output: 5
```
The sorted order is `[1, 2, 3, 4, 5, 6]`; the 2nd largest is `5`.

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

## Problem 14: Top K Frequent Elements

**LeetCode:** [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)

### Description
Given an integer array `nums` and an integer `k`, return the `k` most frequent
elements, ordered from most frequent to least frequent. The answer is guaranteed
to be unique (no ties at the cutoff). Tally counts, then select the top `k` by
frequency using a heap or a bucket-by-count pass.

### Examples
**Example 1:**
```
Input:  nums = [1, 1, 1, 2, 2, 3], k = 2
Output: [1, 2]
```
`1` appears three times, `2` appears twice.

**Example 2:**
```
Input:  nums = [1], k = 1
Output: [1]
```

**Example 3:**
```
Input:  nums = [4, 4, 4, 5, 5, 6], k = 2
Output: [4, 5]
```

### Constraints
- `1 <= nums.length <= 10^5`
- `k` is between `1` and the number of distinct elements.
- The set of top `k` frequent elements is unique.

---

## Problem 15: H-Index

**LeetCode:** [274. H-Index](https://leetcode.com/problems/h-index/)

### Description
Given an array `citations` where `citations[i]` is the number of citations a
researcher's `i`-th paper received, return the researcher's h-index: the largest
value `h` such that at least `h` papers each have at least `h` citations. Sort
the citations and scan, or count by citation value.

### Examples
**Example 1:**
```
Input:  citations = [3, 0, 6, 1, 5]
Output: 3
```
Three papers have at least `3` citations each (`3`, `6`, `5`), and the rest have
no more than `3`.

**Example 2:**
```
Input:  citations = [1, 3, 1]
Output: 1
```

**Example 3:**
```
Input:  citations = [0]
Output: 0
```
A single uncited paper gives an h-index of `0`.

### Constraints
- `1 <= citations.length <= 5000`
- `0 <= citations[i] <= 1000`

---

## Problem 16: Relative Ranks

**LeetCode:** [506. Relative Ranks](https://leetcode.com/problems/relative-ranks/)

### Description
You are given an array `score` of distinct athletes' scores. Athletes are ranked
by score descending. Return an array `answer` where `answer[i]` is the rank of
athlete `i` as a string: the top three scorers get `"Gold Medal"`, `"Silver
Medal"`, and `"Bronze Medal"`; everyone else gets their 1-indexed placement as a
string (`"4"`, `"5"`, ...). Sort indices by score with a custom comparator, then
assign labels by rank.

### Examples
**Example 1:**
```
Input:  score = [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
```

**Example 2:**
```
Input:  score = [10, 3, 8, 9, 4]
Output: ["Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"]
```
`10` is 1st, `9` is 2nd, `8` is 3rd, `4` is 4th, `3` is 5th.

**Example 3:**
```
Input:  score = [1]
Output: ["Gold Medal"]
```

### Constraints
- `1 <= score.length <= 10^4`
- `0 <= score[i] <= 10^6`
- All scores are distinct.

---

## Problem 17: Sort Array by Increasing Frequency

**LeetCode:** [1636. Sort Array by Increasing Frequency](https://leetcode.com/problems/sort-array-by-increasing-frequency/)

### Description
Given an array `nums`, sort it in increasing order of each value's frequency. If
two values have the same frequency, sort those values in decreasing order.
Return the rearranged array. This is a classic custom-comparator problem: the
primary key is the count, the tiebreak is the value (reversed).

### Examples
**Example 1:**
```
Input:  nums = [1, 1, 2, 2, 2, 3]
Output: [3, 1, 1, 2, 2, 2]
```
`3` has frequency `1`, `1` has frequency `2`, `2` has frequency `3`.

**Example 2:**
```
Input:  nums = [2, 3, 1, 3, 2]
Output: [1, 3, 3, 2, 2]
```
`2` and `3` both have frequency `2`, so the larger value `3` comes first.

**Example 3:**
```
Input:  nums = [-1, 1, -6, 4, 5, -6, 1, 4, 1]
Output: [5, -1, 4, 4, -6, -6, 1, 1, 1]
```

### Constraints
- `1 <= nums.length <= 100`
- `-100 <= nums[i] <= 100`

---

## Problem 18: Count Inversions

### Description

Given an array `nums`, count the number of inversions: pairs of indices
`(i, j)` with `i < j` and `nums[i] > nums[j]`. A naive double loop is `O(n^2)`;
you must do better by piggybacking the count onto a merge sort, accumulating
cross-pair inversions during each merge step for `O(n log n)` total. Return the
count as a `long`, since it can be as large as about `n^2 / 2`.

### Examples
**Example 1:**
```
Input:  nums = [2, 4, 1, 3, 5]
Output: 3
```
The inversions are `(2,1)`, `(4,1)`, and `(4,3)`.

**Example 2:**
```
Input:  nums = [5, 4, 3, 2, 1]
Output: 10
```
Every pair is inverted: `5 choose 2 = 10`.

**Example 3:**
```
Input:  nums = [1, 2, 3]
Output: 0
```
An already-sorted array has no inversions.

### Constraints
- `1 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`
- The answer can exceed a 32-bit integer; return a `long`.

---

## Problem 19: Find the Duplicate Number

**LeetCode:** [287. Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/)

### Description
Given an array `nums` of `n + 1` integers where each value is in the range
`[1, n]`, exactly one value is repeated (possibly more than once). Return that
repeated value. Solve it without modifying the array and in better than `O(n^2)`
time — binary-searching on the value range and counting how many elements are
`<= mid` is one clean approach (by the pigeonhole principle, the count crosses
the threshold at the duplicate).

### Examples
**Example 1:**
```
Input:  nums = [1, 3, 4, 2, 2]
Output: 2
```

**Example 2:**
```
Input:  nums = [3, 1, 3, 4, 2]
Output: 3
```

**Example 3:**
```
Input:  nums = [2, 2, 2, 2, 2]
Output: 2
```
A value may repeat many times; still return that value.

### Constraints
- `1 <= n <= 10^5`, and `nums.length == n + 1`.
- `1 <= nums[i] <= n`
- Exactly one value is repeated.

---

## Problem 20: Merge Intervals

**LeetCode:** [56. Merge Intervals](https://leetcode.com/problems/merge-intervals/)

### Description
Given an array of intervals where `intervals[i] = [start_i, end_i]`, merge all
overlapping intervals and return the non-overlapping intervals that cover all the
input, sorted by start. Two intervals overlap when one's start is `<=` the
other's end (touching endpoints count as overlapping). Sort by start first, then
sweep.

### Examples
**Example 1:**
```
Input:  intervals = [[1, 3], [2, 6], [8, 10], [15, 18]]
Output: [[1, 6], [8, 10], [15, 18]]
```
`[1,3]` and `[2,6]` overlap and merge into `[1,6]`.

**Example 2:**
```
Input:  intervals = [[1, 4], [4, 5]]
Output: [[1, 5]]
```
Touching at `4` is treated as overlapping.

**Example 3:**
```
Input:  intervals = [[1, 4], [0, 4]]
Output: [[0, 4]]
```

### Constraints
- `1 <= intervals.length <= 10^4`
- `intervals[i].length == 2` and `0 <= start_i <= end_i <= 10^4`

---

## Problem 21: K Closest Numbers

**LeetCode:** [658. Find K Closest Elements](https://leetcode.com/problems/find-k-closest-elements/)

### Description
Given a sorted array `arr`, an integer `k`, and an integer `x`, return the `k`
elements closest to `x`, as a list sorted in ascending order. An element `a` is
closer to `x` than `b` if `|a - x| < |b - x|`, or if they tie and `a < b`. Binary
search for a starting window of width `k` and shrink toward `x` from both ends.

### Examples
**Example 1:**
```
Input:  arr = [1, 2, 3, 4, 5], k = 4, x = 3
Output: [1, 2, 3, 4]
```
`3` is exact; among the rest, `2` and `4` tie, and the smaller `2` (and then `1`)
fill the window.

**Example 2:**
```
Input:  arr = [1, 2, 3, 4, 5], k = 4, x = -1
Output: [1, 2, 3, 4]
```

**Example 3:**
```
Input:  arr = [1, 1, 1, 10, 10, 10], k = 1, x = 9
Output: [10]
```

### Constraints
- `1 <= k <= arr.length <= 10^4`
- `arr` is sorted in ascending order.
- `-10^4 <= arr[i], x <= 10^4`

---

## Problem 22: Koko Eating Bananas

**LeetCode:** [875. Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/)

### Description
Koko has `piles` of bananas and `h` hours before the guards return. Each hour she
picks one pile and eats up to `speed` bananas from it; if the pile has fewer she
eats the whole pile and stops for that hour (she cannot move to another pile the
same hour). Return the minimum integer eating speed `speed` such that she can
finish all the bananas within `h` hours. The "can she finish at speed `s`?"
predicate is monotone, so binary-search the answer over `[1, max(piles)]`.

### Examples
**Example 1:**
```
Input:  piles = [3, 6, 7, 11], h = 8
Output: 4
```
At speed `4` the hours used are `1 + 2 + 2 + 3 = 8`.

**Example 2:**
```
Input:  piles = [30, 11, 23, 4, 20], h = 5
Output: 30
```
With exactly as many hours as piles, she must clear each pile in one hour.

**Example 3:**
```
Input:  piles = [30, 11, 23, 4, 20], h = 6
Output: 23
```

### Constraints
- `1 <= piles.length <= 10^4`
- `piles.length <= h <= 10^9`
- `1 <= piles[i] <= 10^9`

---

## Problem 23: Capacity to Ship Packages Within D Days

**LeetCode:** [1011. Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/)

### Description
A conveyor belt has `weights` of packages that must ship in the given order over
`days` days. Each day a contiguous prefix of the remaining packages is loaded, and
the day's total cannot exceed the ship's fixed capacity. Packages cannot be
reordered or split. Return the least capacity that ships everything within `days`
days. The feasibility predicate is monotone in capacity, so binary-search it over
`[max(weights), sum(weights)]`.

### Examples
**Example 1:**
```
Input:  weights = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], days = 5
Output: 15
```
The split is `[1..5] [6,7] [8] [9] [10]`, each day's load at most `15`.

**Example 2:**
```
Input:  weights = [3, 2, 2, 4, 1, 4], days = 3
Output: 6
```

**Example 3:**
```
Input:  weights = [1, 2, 3, 1, 1], days = 4
Output: 3
```

### Constraints
- `1 <= days <= weights.length <= 5 * 10^4`
- `1 <= weights[i] <= 500`

---

## Problem 24: Split Array Largest Sum

**LeetCode:** [410. Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/)

### Description
Given an array `nums` and an integer `k`, split `nums` into `k` non-empty
contiguous subarrays so that the largest subarray sum among them is minimized.
Return that minimized largest sum. Binary-search the answer over
`[max(nums), sum(nums)]`: for a candidate cap, greedily count how many subarrays
are needed and check whether it is at most `k`.

### Examples
**Example 1:**
```
Input:  nums = [7, 2, 5, 10, 8], k = 2
Output: 18
```
The best split is `[7, 2, 5]` and `[10, 8]`, whose larger sum is `18`.

**Example 2:**
```
Input:  nums = [1, 2, 3, 4, 5], k = 2
Output: 9
```
Split as `[1, 2, 3, 4]` and `[5]`? No — `[1,2,3]` and `[4,5]` gives `9`.

**Example 3:**
```
Input:  nums = [1, 4, 4], k = 3
Output: 4
```
Each element is its own subarray.

### Constraints
- `1 <= nums.length <= 1000`
- `0 <= nums[i] <= 10^6`
- `1 <= k <= nums.length`

---

## Problem 25: Median of Two Sorted Arrays

**LeetCode:** [4. Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)

### Description
Given two sorted arrays `a` and `b` of sizes `m` and `n`, return the median of
their combined sorted order as a `double`. The overall run time must be
`O(log(min(m, n)))` — binary-search a partition of the smaller array so the left
halves of both arrays together form the lower half of the merge.

### Examples
**Example 1:**
```
Input:  a = [1, 3], b = [2]
Output: 2.0
```
The merged array is `[1, 2, 3]`; the median is `2`.

**Example 2:**
```
Input:  a = [1, 2], b = [3, 4]
Output: 2.5
```
The merged array is `[1, 2, 3, 4]`; the median is `(2 + 3) / 2 = 2.5`.

**Example 3:**
```
Input:  a = [], b = [1]
Output: 1.0
```

### Constraints
- `0 <= m, n <= 1000` and `1 <= m + n <= 2000`
- `-10^6 <= a[i], b[i] <= 10^6`
- Both arrays are sorted ascending.

---

## Problem 26: Maximum Gap

**LeetCode:** [164. Maximum Gap](https://leetcode.com/problems/maximum-gap/)

### Description
Given an unsorted array `nums`, return the maximum difference between two
successive elements in its sorted form. If the array has fewer than two elements,
return `0`. You must run in linear time and use linear extra space — a comparison
sort is `O(n log n)`, so use bucketing (pigeonhole on the value range) instead.

### Examples
**Example 1:**
```
Input:  nums = [3, 6, 9, 1]
Output: 3
```
Sorted: `[1, 3, 6, 9]`; the largest successive gap is `3` (between `3` and `6`,
or `6` and `9`).

**Example 2:**
```
Input:  nums = [10]
Output: 0
```
Fewer than two elements gives `0`.

**Example 3:**
```
Input:  nums = [1, 1, 1]
Output: 0
```

### Constraints
- `1 <= nums.length <= 10^5`
- `0 <= nums[i] <= 10^9`

---

## Problem 27: Leaderboard Sort

### Description

A game leaderboard stores `(score, name)` entries given as parallel arrays
`scores` and `names` of equal length. Rank entries by score descending, breaking
ties by name ascending (lexicographic), and return the names in final ranked
order. Implement the ordering with a single stable sort driven by a custom
comparator over the entry indices.

### Examples
**Example 1:**
```
Input:  scores = [50, 80, 80], names = ["amy", "carol", "bob"]
Output: ["bob", "carol", "amy"]
```
`carol` and `bob` tie at `80`; `bob` sorts before `carol` by name.

**Example 2:**
```
Input:  scores = [10, 20, 30], names = ["x", "y", "z"]
Output: ["z", "y", "x"]
```

**Example 3:**
```
Input:  scores = [5], names = ["solo"]
Output: ["solo"]
```

### Constraints
- `1 <= names.length == scores.length <= 10^5`
- `0 <= scores[i] <= 10^9`
- Names are non-empty lowercase strings; names may repeat but `(score, name)`
  pairs are distinct.

---

## Problem 28: External K-Way Merge

### Description

You are given `k` already-sorted integer streams (as a list of arrays) and must
merge them into one ascending array. Simulating external merge, use a min-heap
keyed on the current front of each stream so the total work is `O(N log k)`,
where `N` is the total element count — do not concatenate and re-sort. Return the
merged array.

### Examples
**Example 1:**
```
Input:  streams = [[1, 4, 5], [1, 3, 4], [2, 6]]
Output: [1, 1, 2, 3, 4, 4, 5, 6]
```

**Example 2:**
```
Input:  streams = [[], [1]]
Output: [1]
```
Empty streams contribute nothing.

**Example 3:**
```
Input:  streams = []
Output: []
```

### Constraints
- `0 <= k <= 10^4` streams.
- The total number of elements `N` is at most `10^5`.
- Each stream is individually sorted ascending; values fit in a 32-bit int.

---

## Problem 29: Wiggle Sort

**LeetCode:** [324. Wiggle Sort II](https://leetcode.com/problems/wiggle-sort-ii/)

### Description
Given an array `nums`, reorder it in place so that
`nums[0] < nums[1] > nums[2] < nums[3] ...` (strictly alternating). It is
guaranteed that a valid arrangement exists. Return the reordered array. A clean
approach finds the median (via selection) and interleaves the lower and upper
halves so equal values never land adjacent.

### Examples
**Example 1:**
```
Input:  nums = [1, 5, 1, 1, 6, 4]
Output: [1, 6, 1, 5, 1, 4]
```
Any output satisfying the strict wiggle pattern is accepted.

**Example 2:**
```
Input:  nums = [1, 3, 2, 2, 3, 1]
Output: [2, 3, 1, 3, 1, 2]
```

**Example 3:**
```
Input:  nums = [1, 2]
Output: [1, 2]
```

### Constraints
- `1 <= nums.length <= 5 * 10^4`
- `0 <= nums[i] <= 5000`
- A valid wiggle arrangement is guaranteed to exist.

---

## Problem 30: Sliding Window Median

**LeetCode:** [480. Sliding Window Median](https://leetcode.com/problems/sliding-window-median/)

### Description
Given an integer array `nums` and a window size `k`, return the median of each
contiguous window as it slides one position at a time, as an array of `double`s.
For odd `k` the median is the middle value; for even `k` it is the average of the
two middle values. Maintain the window's order efficiently (for example with two
balanced heaps or an ordered multiset) so each median is cheap.

### Examples
**Example 1:**
```
Input:  nums = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
Output: [1.0, -1.0, -1.0, 3.0, 5.0, 6.0]
```
The windows are `[1,3,-1]`, `[3,-1,-3]`, ... and their medians follow.

**Example 2:**
```
Input:  nums = [1, 2, 3, 4], k = 2
Output: [1.5, 2.5, 3.5]
```
Even `k` averages the two middle values per window.

**Example 3:**
```
Input:  nums = [5], k = 1
Output: [5.0]
```

### Constraints
- `1 <= k <= nums.length <= 10^5`
- `-2^31 <= nums[i] <= 2^31 - 1`

---
