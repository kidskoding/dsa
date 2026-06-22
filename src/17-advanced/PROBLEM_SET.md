# Advanced: Problem Set

These problems exercise the advanced range-query toolkit: prefix sums, Fenwick
(binary indexed) trees, segment trees with and without lazy propagation, order
statistics, interval stabbing, and inversion counting. Each problem is an
implementation task — fill in the matching stub in `problemset/` and make its
test in `tests/problemset/` pass. Inputs arrive as `int[]` arrays plus query or
operation lists encoded as small `int[]` records, so every solution is a pure
function with no I/O. The Foundational group builds the core primitives; the
Applied group weaves LeetCode classics with contest-style problems, roughly easy
to hard.

**Foundational**

## Problem 1: Static Prefix Sums

### Description

You are given an integer array `nums` and a list of inclusive range queries.
For each query `[l, r]` return the sum of `nums[l..r]`. The array is never
modified, so precompute a prefix-sum table once and answer each query in
`O(1)`. Return the answers in the same order as the queries.

### Examples

**Example 1:**
```
Input:  nums = [1, 2, 3, 4, 5], queries = [[0, 2], [1, 3], [0, 4]]
Output: [6, 9, 15]
```
Query `[0,2]` sums `1+2+3=6`; `[1,3]` sums `2+3+4=9`; `[0,4]` sums all `15`.

**Example 2:**
```
Input:  nums = [-2, 0, 3, -5, 2, -1], queries = [[0, 2], [2, 5], [0, 5]]
Output: [1, -1, -3]
```
A negative reading is handled the same as any other.

**Example 3:**
```
Input:  nums = [7], queries = [[0, 0]]
Output: [7]
```

### Constraints

- `1 <= nums.length <= 1e5`
- `-1e4 <= nums[i] <= 1e4`
- `0 <= l <= r < nums.length`
- Sums fit in a `long`.

---

## Problem 2: Fenwick Tree Point Update, Prefix Sum

### Description

Build a Fenwick (binary indexed) tree over an initial array and replay an
operation stream. Each operation is a 3-element array `{type, a, b}`: type `0`
adds `b` to index `a`; type `1` asks for the prefix sum over `[0, a]`. Return the
type-1 answers in order. Each operation must run in `O(log n)`.

### Examples

**Example 1:**
```
Input:  nums = [1, 2, 3, 4], ops = [[1, 3], [0, 1, 10], [1, 3]]
Output: [10, 20]
```
Prefix `[0,3]` is `1+2+3+4=10`; add `10` to index `1`; prefix `[0,3]` is now `20`.

**Example 2:**
```
Input:  nums = [5, 5, 5], ops = [[1, 0], [1, 2]]
Output: [5, 15]
```

**Example 3:**
```
Input:  nums = [0, 0, 0], ops = [[0, 1, 7], [1, 1]]
Output: [7]
```

### Constraints

- `1 <= nums.length <= 1e5`
- Up to `1e5` operations.
- For a type-0 op, `0 <= a < nums.length`.
- For a type-1 op, `0 <= a < nums.length`.
- Prefix sums fit in a `long`.

---

## Problem 3: Build a Segment Tree for Range Minimum

### Description

Construct a segment tree over an integer array and answer a batch of range-minimum
queries. Each query `[l, r]` asks for the minimum of `nums[l..r]` inclusive. The
array is static for this problem. Each query must be answered in `O(log n)`.
Return the minima in query order.

### Examples

**Example 1:**
```
Input:  nums = [2, 5, 1, 4, 9, 3], queries = [[0, 2], [3, 5], [0, 5]]
Output: [1, 3, 1]
```
Minimum of `[2,5,1]` is `1`; of `[4,9,3]` is `3`; of the whole array is `1`.

**Example 2:**
```
Input:  nums = [8, 8, 8], queries = [[0, 0], [1, 2]]
Output: [8, 8]
```

**Example 3:**
```
Input:  nums = [-3, 0, -7, 5], queries = [[1, 3], [0, 3]]
Output: [-7, -7]
```

### Constraints

- `1 <= nums.length <= 1e5`
- `-1e9 <= nums[i] <= 1e9`
- `0 <= l <= r < nums.length`

---

## Problem 4: Coordinate Compression

### Description

Many order-statistics structures need values mapped to a dense `0..m-1` range.
Given an integer array `values`, return a new array `ranks` where `ranks[i]` is
the index of `values[i]` among the sorted distinct values (its compressed
coordinate). Equal values receive equal ranks. This is the standard preprocessing
step before a Fenwick tree over values.

### Examples

**Example 1:**
```
Input:  values = [40, 10, 20, 10, 30]
Output: [3, 0, 1, 0, 2]
```
Sorted distinct values are `[10, 20, 30, 40]`, giving ranks `10->0, 20->1, 30->2, 40->3`.

**Example 2:**
```
Input:  values = [5, 5, 5]
Output: [0, 0, 0]
```

**Example 3:**
```
Input:  values = [-2, 7, -2, 100]
Output: [0, 1, 0, 2]
```

### Constraints

- `1 <= values.length <= 1e5`
- `-1e9 <= values[i] <= 1e9`

---

## Problem 5: Count Inversions

### Description

Count the number of inversions in an array: index pairs `(i, j)` with `i < j` and
`nums[i] > nums[j]`. Use a merge-sort counting pass or a Fenwick tree over
compressed values to run in `O(n log n)`. Return the count as a `long`.

### Examples

**Example 1:**
```
Input:  nums = [2, 4, 1, 3, 5]
Output: 3
```
The inversions are `(2,1)`, `(4,1)`, and `(4,3)`.

**Example 2:**
```
Input:  nums = [1, 2, 3, 4]
Output: 0
```
A sorted array has no inversions.

**Example 3:**
```
Input:  nums = [5, 4, 3, 2, 1]
Output: 10
```
A strictly descending array of length 5 has every pair inverted.

### Constraints

- `1 <= nums.length <= 1e5`
- `-1e9 <= nums[i] <= 1e9`
- The count fits in a `long`.

---

## Problem 6: K-th Smallest via Order-Statistics Tree

### Description

Maintain a multiset of integers under an operation stream, starting empty. Each
operation is a 2-element array `{type, value}`: type `0` inserts `value`; type `1`
deletes one occurrence of `value`; type `2` asks for the `value`-th smallest
element currently present (1-indexed). Use an order-statistics Fenwick tree over
compressed values so each operation runs in `O(log n)`. Return the type-2 answers
in order. Deletes and selects are always valid.

### Examples

**Example 1:**
```
Input:  ops = [[0, 5], [0, 1], [0, 3], [2, 2]]
Output: [3]
```
After inserting `5, 1, 3` the sorted multiset is `[1, 3, 5]`; the 2nd smallest is `3`.

**Example 2:**
```
Input:  ops = [[0, 10], [0, 10], [2, 1], [2, 2]]
Output: [10, 10]
```
Duplicates are tracked by count.

**Example 3:**
```
Input:  ops = [[0, 4], [0, 8], [1, 4], [2, 1]]
Output: [8]
```
After deleting the single `4`, the smallest remaining is `8`.

### Constraints

- Up to `1e5` operations.
- `-1e9 <= value <= 1e9` for insert/delete.
- For a type-2 op, `1 <= value <= current multiset size`.

---

**Applied Problems**

## Problem 7: Range Sum Query - Immutable

**LeetCode:** [303. Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/)

### Description

Given an integer array `nums`, answer a batch of inclusive range-sum queries
`sumRange(l, r) = nums[l] + ... + nums[r]`. The array is never modified.
Precompute a prefix-sum table so each query is `O(1)`. Return the answers in
query order.

### Examples

**Example 1:**
```
Input:  nums = [-2, 0, 3, -5, 2, -1], queries = [[0, 2], [2, 5], [0, 5]]
Output: [1, -1, -3]
```
`sumRange(0,2) = -2+0+3 = 1`; `sumRange(2,5) = 3-5+2-1 = -1`; `sumRange(0,5) = -3`.

**Example 2:**
```
Input:  nums = [1, 2, 3], queries = [[0, 0], [0, 2]]
Output: [1, 6]
```

**Example 3:**
```
Input:  nums = [10], queries = [[0, 0]]
Output: [10]
```

### Constraints

- `1 <= nums.length <= 1e4`
- `-1e5 <= nums[i] <= 1e5`
- `0 <= l <= r < nums.length`

---

## Problem 8: Range Sum Query 2D - Immutable

**LeetCode:** [304. Range Sum Query 2D - Immutable](https://leetcode.com/problems/range-sum-query-2d-immutable/)

### Description

Given a 2D integer matrix, answer rectangle-sum queries. Each query is a 4-element
array `{r1, c1, r2, c2}` asking for the sum of the submatrix whose upper-left
corner is `(r1, c1)` and lower-right corner is `(r2, c2)`, inclusive. Precompute a
2D prefix-sum table so each query is `O(1)`. Return the answers in query order.

### Examples

**Example 1:**
```
Input:  matrix = [[3, 0, 1, 4, 2],
                  [5, 6, 3, 2, 1],
                  [1, 2, 0, 1, 5],
                  [4, 1, 0, 1, 7],
                  [1, 0, 3, 0, 5]],
        queries = [[2, 1, 4, 3], [1, 1, 2, 2], [1, 2, 2, 4]]
Output: [8, 11, 12]
```
The first rectangle `(2,1)-(4,3)` sums to `8`.

**Example 2:**
```
Input:  matrix = [[1, 2], [3, 4]], queries = [[0, 0, 1, 1]]
Output: [10]
```

**Example 3:**
```
Input:  matrix = [[5]], queries = [[0, 0, 0, 0]]
Output: [5]
```

### Constraints

- `1 <= rows, cols <= 200`
- `-1e5 <= matrix[i][j] <= 1e5`
- `0 <= r1 <= r2 < rows`, `0 <= c1 <= c2 < cols`

---

## Problem 9: Range Sum Query - Mutable

**LeetCode:** [307. Range Sum Query - Mutable](https://leetcode.com/problems/range-sum-query-mutable/)

### Description

Support point updates interleaved with range-sum queries over an array. Each
operation is a 3-element array `{type, a, b}`: type `0` sets index `a` to value
`b`; type `1` asks for the inclusive range sum over `[a, b]`. Back the array with
a Fenwick tree so each operation runs in `O(log n)`. Return the type-1 answers in
order.

### Examples

**Example 1:**
```
Input:  nums = [1, 3, 5], ops = [[1, 0, 2], [0, 1, 2], [1, 0, 2]]
Output: [9, 8]
```
Query `[0,2]` is `9`; set index `1` to `2`; query `[0,2]` is now `1+2+5=8`.

**Example 2:**
```
Input:  nums = [2, 4, 6, 8], ops = [[1, 1, 3], [0, 2, 10], [1, 0, 3]]
Output: [18, 24]
```

**Example 3:**
```
Input:  nums = [7], ops = [[1, 0, 0], [0, 0, 1], [1, 0, 0]]
Output: [7, 1]
```

### Constraints

- `1 <= nums.length <= 3e4`
- `-100 <= nums[i] <= 100`, `-100 <= b <= 100` for updates.
- Up to `3e4` operations.
- Range sums fit in a `long`.

---

## Problem 10: Range Minimum Queries with Updates

### Description

A monitoring array supports point updates interleaved with range-minimum queries.
Each operation is a 3-element array `{type, a, b}`: type `0` sets index `a` to
value `b`; type `1` asks for the minimum reading over the inclusive range
`[a, b]`. Use a segment tree so each operation runs in `O(log n)`. Return the
type-1 answers in order.

### Examples

**Example 1:**
```
Input:  nums = [3, 7, 2, 9, 4], ops = [[1, 0, 2], [0, 1, 1], [1, 0, 2]]
Output: [2, 1]
```
Min of `[3,7,2]` is `2`; set index `1` to `1`; min of `[3,1,2]` is `1`.

**Example 2:**
```
Input:  nums = [5, 4, 6], ops = [[1, 0, 2]]
Output: [4]
```

**Example 3:**
```
Input:  nums = [10, 20], ops = [[0, 0, 100], [1, 0, 1]]
Output: [20]
```

### Constraints

- `1 <= nums.length <= 1e5`
- `-1e9 <= nums[i] <= 1e9`
- Up to `1e5` operations.

---

## Problem 11: Range Counts in Sorted Data

### Description

A sensor field reports `n` integer readings. For each query `[lo, hi]` report how
many readings fall in the inclusive range `[lo, hi]`. Sort the readings once, then
binary-search both bounds per query so each costs `O(log n)`. Return the counts in
query order.

### Examples

**Example 1:**
```
Input:  readings = [4, 1, 7, 3, 9, 3], queries = [[3, 7], [0, 1], [5, 100]]
Output: [4, 1, 2]
```
Values in `[3,7]` are `4, 7, 3, 3` (four); in `[0,1]` only `1`; in `[5,100]` are `7, 9`.

**Example 2:**
```
Input:  readings = [5, 5, 5], queries = [[5, 5], [6, 10]]
Output: [3, 0]
```

**Example 3:**
```
Input:  readings = [-3, 0, 8], queries = [[-10, 0]]
Output: [2]
```

### Constraints

- `1 <= readings.length <= 1e5`
- Up to `1e5` queries.
- Values and bounds fit in an `int`.

---

## Problem 12: Count of Range Sum

**LeetCode:** [327. Count of Range Sum](https://leetcode.com/problems/count-of-range-sum/)

### Description

Given an integer array `nums` and an inclusive range `[lower, upper]`, count the
number of range sums `S(i, j) = nums[i] + ... + nums[j]` (with `i <= j`) that lie
within `[lower, upper]`. Compute prefix sums, then count qualifying prefix-pair
differences in `O(n log n)` via merge-sort counting or a Fenwick tree over
compressed prefix sums. Return the count as a `long`.

### Examples

**Example 1:**
```
Input:  nums = [-2, 5, -1], lower = -2, upper = 2
Output: 3
```
The qualifying range sums are `-2`, `-1`, and `2`.

**Example 2:**
```
Input:  nums = [0], lower = 0, upper = 0
Output: 1
```

**Example 3:**
```
Input:  nums = [1, 2, 3], lower = 3, upper = 5
Output: 3
```
Sums in range are `3` (`[1,2]`), `5` (`[2,3]`), and `3` (the single `3`).

### Constraints

- `1 <= nums.length <= 1e5`
- `-1e9 <= nums[i] <= 1e9`
- `-1e15 <= lower <= upper <= 1e15`
- The count fits in a `long`.

---

## Problem 13: Reverse Pairs

**LeetCode:** [493. Reverse Pairs](https://leetcode.com/problems/reverse-pairs/)

### Description

Given an integer array `nums`, count the number of reverse pairs: index pairs
`(i, j)` with `i < j` and `nums[i] > 2 * nums[j]`. Use a modified merge-sort
counting pass or a Fenwick tree over compressed values for `O(n log n)`. Return
the count as a `long`.

### Examples

**Example 1:**
```
Input:  nums = [1, 3, 2, 3, 1]
Output: 2
```
The reverse pairs are at indices `(1,4)` and `(3,4)`: `3 > 2*1`.

**Example 2:**
```
Input:  nums = [2, 4, 3, 5, 1]
Output: 3
```

**Example 3:**
```
Input:  nums = [1, 2, 3, 4, 5]
Output: 0
```

### Constraints

- `1 <= nums.length <= 5e4`
- `-2^31 <= nums[i] <= 2^31 - 1`
- The count fits in a `long`.

---

## Problem 14: Count of Smaller Numbers After Self

**LeetCode:** [315. Count of Smaller Numbers After Self](https://leetcode.com/problems/count-of-smaller-numbers-after-self/)

### Description

Given an integer array `nums`, return an array `counts` where `counts[i]` is the
number of elements to the right of `nums[i]` that are strictly smaller than it.
Process from right to left, inserting compressed values into a Fenwick tree and
querying how many smaller values were already seen, for `O(n log n)` total.

### Examples

**Example 1:**
```
Input:  nums = [5, 2, 6, 1]
Output: [2, 1, 1, 0]
```
Right of `5` are `2, 1` (two smaller); right of `2` is `1` (one); right of `6` is `1` (one).

**Example 2:**
```
Input:  nums = [-1, -1]
Output: [0, 0]
```

**Example 3:**
```
Input:  nums = [3, 2, 2, 6, 1]
Output: [3, 1, 1, 1, 0]
```

### Constraints

- `1 <= nums.length <= 1e5`
- `-1e4 <= nums[i] <= 1e4`

---

## Problem 15: Range Frequency Queries

**LeetCode:** [2080. Range Frequency Queries](https://leetcode.com/problems/range-frequency-queries/)

### Description

Given an integer array `arr`, answer queries asking how many times a given value
appears within an inclusive index range. Each query is a 3-element array
`{l, r, value}`. Precompute, for each distinct value, the sorted list of indices
where it occurs, then binary-search those indices to count how many fall in
`[l, r]`. Return the answers in query order.

### Examples

**Example 1:**
```
Input:  arr = [12, 33, 4, 56, 22, 2, 34, 33, 22, 12, 34, 56],
        queries = [[1, 2, 4], [0, 11, 33], [0, 11, 22]]
Output: [1, 2, 2]
```
Value `4` appears once in `[1,2]`; `33` appears twice overall; `22` appears twice.

**Example 2:**
```
Input:  arr = [1, 1, 1, 1], queries = [[0, 3, 1], [1, 2, 1]]
Output: [4, 2]
```

**Example 3:**
```
Input:  arr = [7, 8, 9], queries = [[0, 2, 5]]
Output: [0]
```

### Constraints

- `1 <= arr.length <= 1e5`
- Up to `1e5` queries.
- Values fit in an `int`; `0 <= l <= r < arr.length`.

---

## Problem 16: Interval Stabbing Counts

### Description

You are given `n` closed intervals `[start, end]` and `q` query points. For each
query point report how many intervals cover it (inclusive of endpoints). With all
intervals and queries known up front, answer every query offline in
`O((n + q) log(n + q))` using a sorted boundary sweep or a difference array over
compressed coordinates. Return the counts in query order.

### Examples

**Example 1:**
```
Input:  intervals = [[1, 5], [2, 6], [4, 8]], points = [3, 7, 1]
Output: [2, 1, 1]
```
Point `3` lies in `[1,5]` and `[2,6]`; point `7` only in `[4,8]`; point `1` only in `[1,5]`.

**Example 2:**
```
Input:  intervals = [[0, 0]], points = [0, 1]
Output: [1, 0]
```

**Example 3:**
```
Input:  intervals = [[1, 10], [1, 10], [1, 10]], points = [5]
Output: [3]
```

### Constraints

- `1 <= n, q <= 1e5`
- Coordinates fit in an `int`; `start <= end`.

---

## Problem 17: Range Update, Point Query

### Description

A ledger over `n` positions supports range-add updates interleaved with single
point queries. Each operation is a 4-element array: `{0, l, r, delta}` adds `delta`
to every position in `[l, r]`; `{1, i, 0, 0}` queries the current value at position
`i`. Use a difference-array Fenwick tree (point query = prefix sum of deltas) so
each operation runs in `O(log n)`. The array starts at all zeros. Return the
type-1 answers in order.

### Examples

**Example 1:**
```
Input:  n = 5, ops = [[0, 1, 3, 2], [1, 2, 0, 0], [1, 4, 0, 0]]
Output: [2, 0]
```
Adding `2` to `[1,3]` makes position `2` equal `2`; position `4` is untouched (`0`).

**Example 2:**
```
Input:  n = 3, ops = [[0, 0, 2, 5], [0, 1, 1, 3], [1, 1, 0, 0]]
Output: [8]
```
Position `1` receives `5` then `3`, totaling `8`.

**Example 3:**
```
Input:  n = 4, ops = [[1, 0, 0, 0]]
Output: [0]
```

### Constraints

- `1 <= n <= 1e5`
- Up to `1e5` operations.
- `-1e9 <= delta <= 1e9`; values fit in a `long`.

---

## Problem 18: Range Update, Range Sum (Lazy Segment Tree)

### Description

A reactor logs coolant pressure across `n` segments, all starting at zero. Apply
range-add adjustments and answer range-sum queries, each in `O(log n)` with a
lazy-propagation segment tree. Operations are 4-element arrays: `{0, l, r, delta}`
adds `delta` across `[l, r]`; `{1, l, r, 0}` queries the inclusive sum over
`[l, r]`. Return the type-1 answers in order.

### Examples

**Example 1:**
```
Input:  n = 5, ops = [[0, 0, 2, 3], [0, 1, 4, 2], [1, 0, 4, 0]]
Output: [19]
```
Add `3` to `[0,2]` (sum 9) and `2` to `[1,4]` (adds 8); total over `[0,4]` is `19`.

**Example 2:**
```
Input:  n = 3, ops = [[0, 0, 2, 4], [1, 1, 2, 0]]
Output: [8]
```

**Example 3:**
```
Input:  n = 4, ops = [[1, 0, 3, 0]]
Output: [0]
```

### Constraints

- `1 <= n <= 1e5`
- Up to `1e5` operations.
- `-1e9 <= delta <= 1e9`; sums fit in a `long`.

---

## Problem 19: Count Intervals Covering Points (Mixed Stream)

### Description

A coverage tracker processes a stream over an initially empty set of closed
integer intervals. Each operation is a 3-element array `{type, a, b}`: type `0`
adds the interval `[a, b]`; type `1` asks how many currently-present intervals
cover the single point `a` (inclusive; `b` is ignored). Because additions and
queries are interleaved, maintain a multiset of active interval boundaries and
answer each query in `O(log n)` (e.g. a Fenwick tree over compressed coordinates
counting starts `<= a` minus ends `< a`). Return the type-1 answers in order.

### Examples

**Example 1:**
```
Input:  ops = [[0, 1, 5], [0, 3, 8], [1, 4, 0], [1, 7, 0]]
Output: [2, 1]
```
After adding `[1,5]` and `[3,8]`: point `4` is covered by both; point `7` by only `[3,8]`.

**Example 2:**
```
Input:  ops = [[0, 0, 10], [1, 0, 0], [1, 10, 0], [1, 11, 0]]
Output: [1, 1, 0]
```
Endpoints are inclusive, so `0` and `10` are covered; `11` is not.

**Example 3:**
```
Input:  ops = [[1, 5, 0]]
Output: [0]
```
With no intervals added yet, nothing covers `5`.

### Constraints

- Up to `1e5` operations.
- Coordinates fit in an `int`; for additions `a <= b`.

---

## Problem 20: Range Distinct Values (Offline)

### Description

An archive stores `n` artifact codes in a fixed array. A batch of `q` queries each
asks how many distinct codes appear in an inclusive span `[l, r]`. With all queries
known up front, sort them by right endpoint and sweep a Fenwick tree that keeps
only each value's last occurrence alive: as the sweep advances `r`, deactivate any
earlier index holding the same value and activate the current one, so a query is a
range count over active positions. Answer every query in `O((n + q) log n)` and
return answers in input order.

### Examples

**Example 1:**
```
Input:  codes = [1, 1, 2, 1, 3], queries = [[0, 1], [0, 4], [2, 4]]
Output: [1, 3, 3]
```
`[0,1]` has only `{1}`; `[0,4]` has `{1,2,3}`; `[2,4]` has `{2,1,3}`.

**Example 2:**
```
Input:  codes = [5, 5, 5], queries = [[0, 2]]
Output: [1]
```

**Example 3:**
```
Input:  codes = [4, 7, 4, 7], queries = [[0, 3], [1, 2]]
Output: [2, 2]
```

### Constraints

- `1 <= n, q <= 1e5`
- Codes fit in an `int`; `0 <= l <= r < n`.

---

## Problem 21: My Calendar III (Max Concurrent Intervals)

**LeetCode:** [732. My Calendar III](https://leetcode.com/problems/my-calendar-iii/)

### Description

You are given a list of half-open booking intervals `[start, end)` processed in
order. After each booking, report the maximum number of intervals that overlap at
any single point so far (the maximum "k-booking"). Use a sweep with a difference
map over event coordinates, or a segment tree with range-add and range-max. Return
an array whose `i`-th entry is the maximum overlap after the first `i+1` bookings.

### Examples

**Example 1:**
```
Input:  bookings = [[10, 20], [50, 60], [10, 40], [5, 15], [5, 10], [25, 55]]
Output: [1, 1, 2, 3, 3, 3]
```
The third booking overlaps the first, giving `2`; the fourth pushes a point to `3`.

**Example 2:**
```
Input:  bookings = [[0, 10], [10, 20]]
Output: [1, 1]
```
Half-open intervals `[0,10)` and `[10,20)` do not overlap at point `10`.

**Example 3:**
```
Input:  bookings = [[1, 100], [2, 99], [3, 98]]
Output: [1, 2, 3]
```

### Constraints

- `1 <= bookings.length <= 400`
- `0 <= start < end <= 1e9`

---

## Problem 22: The Skyline Problem

**LeetCode:** [218. The Skyline Problem](https://leetcode.com/problems/the-skyline-problem/)

### Description

Given the buildings of a city as triples `{left, right, height}`, compute the
skyline: the list of "key points" `[x, height]` marking where the visible outline
changes, sorted by `x`. Sweep the building edges left to right, maintaining the
current maximum active height (e.g. a multiset / max-heap with lazy deletion), and
emit a key point whenever that maximum changes. The skyline ends with a key point
at the rightmost edge with height `0`. Return the key points as an `int[][]`.

### Examples

**Example 1:**
```
Input:  buildings = [[2, 9, 10], [3, 7, 15], [5, 12, 12], [15, 20, 10], [19, 24, 8]]
Output: [[2, 10], [3, 15], [7, 12], [12, 0], [15, 10], [20, 8], [24, 0]]
```
The outline rises to `15` at `x=3`, drops to `12` when the tall building ends, and so on.

**Example 2:**
```
Input:  buildings = [[0, 2, 3], [2, 5, 3]]
Output: [[0, 3], [5, 0]]
```
Two abutting buildings of equal height merge into one flat segment.

**Example 3:**
```
Input:  buildings = [[1, 3, 4]]
Output: [[1, 4], [3, 0]]
```

### Constraints

- `1 <= buildings.length <= 1e4`
- `0 <= left < right <= 2^31 - 1`, `1 <= height <= 2^31 - 1`

---

## Problem 23: Falling Squares

**LeetCode:** [699. Falling Squares](https://leetcode.com/problems/falling-squares/)

### Description

Axis-aligned squares drop one at a time onto a number line. Square `i` is given as
`{left, sideLength}` and occupies the interval `[left, left + sideLength)`. When a
square lands it rests on top of whatever is already in its horizontal span. After
each drop, report the height of the tallest stack anywhere. Use coordinate
compression with a segment tree supporting range-max query and range-assign.
Return an array whose `i`-th entry is the tallest height after the first `i+1`
drops.

### Examples

**Example 1:**
```
Input:  squares = [[1, 2], [2, 3], [6, 1]]
Output: [2, 5, 5]
```
The first square rests at height `2`; the second overlaps it and stacks to `2+3=5`;
the third lands elsewhere at height `1`, so the max stays `5`.

**Example 2:**
```
Input:  squares = [[100, 100], [200, 100]]
Output: [100, 100]
```
The squares do not overlap, so each rests on the ground.

**Example 3:**
```
Input:  squares = [[1, 5], [2, 2]]
Output: [5, 7]
```

### Constraints

- `1 <= squares.length <= 1e3`
- `1 <= left, sideLength <= 1e8`

---

## Problem 24: Number of Longest Increasing Subsequence via Fenwick

**LeetCode:** [673. Number of Longest Increasing Subsequence](https://leetcode.com/problems/number-of-longest-increasing-subsequence/)

### Description

Given an integer array `nums`, return the number of longest strictly increasing
subsequences. Process elements left to right over compressed values, and for each
value query a Fenwick tree keyed by value that stores, for the best LIS length
ending at a smaller value, both that length and the count of ways to achieve it.
Combine to extend, then update the tree at the current value. This yields the LIS
length and the number of such subsequences in `O(n log n)`. Return the count.

### Examples

**Example 1:**
```
Input:  nums = [1, 3, 5, 4, 7]
Output: 2
```
The LIS length is `4`; the two longest are `[1,3,5,7]` and `[1,3,4,7]`.

**Example 2:**
```
Input:  nums = [2, 2, 2, 2, 2]
Output: 5
```
The longest strictly increasing subsequence has length `1`, and there are five of them.

**Example 3:**
```
Input:  nums = [1, 2, 4, 3, 5, 4, 7, 2]
Output: 3
```

### Constraints

- `1 <= nums.length <= 2e3`
- `-1e6 <= nums[i] <= 1e6`

---
