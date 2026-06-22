# Recursion & Divide and Conquer: Problem Set

Each problem is an implementation task: fill in the matching stub in `problemset/`
and make its test in `tests/problemset/` pass. The set opens with **Foundational**
warm-ups that drill the core recursive shapes — base case, single recursive step,
and divide-and-combine — then moves through **Applied Problems** that weave real
LeetCode interview questions together with contest-style challenges, ordered easy
to hard. Lean on recursion and divide and conquer throughout: split the input,
solve the pieces, and combine.

---

**Foundational**

## Problem 1: Sum of Digits

### Description
Given a non-negative integer `n`, return the sum of its base-10 digits. Solve it
recursively: the last digit is `n % 10`, and the rest of the number is `n / 10`.
Do not use any loops.

### Examples
**Example 1:**
```
Input:  n = 12345
Output: 15
```
1 + 2 + 3 + 4 + 5 = 15.

**Example 2:**
```
Input:  n = 0
Output: 0
```
Zero has a single digit whose sum is 0 — this is the base case.

**Example 3:**
```
Input:  n = 9
Output: 9
```
A single-digit number is its own digit sum.

### Constraints
- `0 <= n <= 2,000,000,000`

---

## Problem 2: Recursive Power

### Description
Compute `b` raised to the power `e`, where `e` is a non-negative integer, using
exponentiation by squaring. Halve the exponent at each step: `b^e = (b^(e/2))^2`
for even `e`, and `b * b^(e-1)` for odd `e`. The recursion should make
`O(log e)` multiplications, not `O(e)`.

### Examples
**Example 1:**
```
Input:  b = 2, e = 10
Output: 1024
```
`2^10 = 1024`, reached in about four squarings rather than ten multiplications.

**Example 2:**
```
Input:  b = 5, e = 0
Output: 1
```
Any base to the zero power is 1 — the base case of the recursion.

**Example 3:**
```
Input:  b = 3, e = 3
Output: 27
```
`3^3 = 27`.

### Constraints
- `-100 <= b <= 100`
- `0 <= e <= 30`
- The result fits in a 64-bit signed integer.

---

## Problem 3: Reverse a String

### Description
Return the reverse of a string using recursion. The empty string is its own
reverse (base case); otherwise the reverse is the reverse of everything after the
first character, followed by the first character. Do not use a loop or a library
reverse helper.

### Examples
**Example 1:**
```
Input:  s = "recursion"
Output: "noisrucer"
```

**Example 2:**
```
Input:  s = ""
Output: ""
```
The empty string is the base case.

**Example 3:**
```
Input:  s = "a"
Output: "a"
```
A single character reversed is itself.

### Constraints
- `0 <= s.length <= 10,000`
- `s` consists of printable ASCII characters.

---

## Problem 4: Recursive Binary Search

### Description
Given an array sorted in ascending order and a `target`, return the index of
`target`, or `-1` if it is absent. Implement the search recursively as divide and
conquer: compare against the middle element and recurse into the half that can
still contain the target. Run in `O(log n)`.

### Examples
**Example 1:**
```
Input:  a = [-3, 0, 4, 7, 11, 18], target = 7
Output: 3
```
The middle splits the array; 7 lies in the right half and is found at index 3.

**Example 2:**
```
Input:  a = [1, 2, 3, 4, 5], target = 6
Output: -1
```
6 is larger than every element, so the search exhausts and returns -1.

**Example 3:**
```
Input:  a = [42], target = 42
Output: 0
```

### Constraints
- `0 <= a.length <= 100,000`
- `a` is sorted in strictly ascending order.
- `-10^9 <= a[i], target <= 10^9`

---

## Problem 5: Greatest Common Divisor

### Description
Compute the greatest common divisor of two non-negative integers `a` and `b`
using the recursive Euclidean algorithm: `gcd(a, b) = gcd(b, a % b)`, with
`gcd(a, 0) = a` as the base case. By convention `gcd(0, 0) = 0`.

### Examples
**Example 1:**
```
Input:  a = 48, b = 18
Output: 6
```
`gcd(48, 18) -> gcd(18, 12) -> gcd(12, 6) -> gcd(6, 0) = 6`.

**Example 2:**
```
Input:  a = 17, b = 5
Output: 1
```
17 and 5 are coprime.

**Example 3:**
```
Input:  a = 0, b = 9
Output: 9
```

### Constraints
- `0 <= a, b <= 2,000,000,000`

---

## Problem 6: Power of Two

### Description
Decide whether a positive integer `n` is a power of two. Use a recursive halving
check: `n` is a power of two if it is `1` (base case), or if it is even and
`n / 2` is a power of two. Any odd number greater than one is not.

### Examples
**Example 1:**
```
Input:  n = 16
Output: true
```
`16 -> 8 -> 4 -> 2 -> 1`, halving cleanly every step.

**Example 2:**
```
Input:  n = 12
Output: false
```
`12 -> 6 -> 3`, which is odd and greater than one, so 12 is not a power of two.

**Example 3:**
```
Input:  n = 1
Output: true
```
`2^0 = 1` is the base case.

### Constraints
- `1 <= n <= 2,000,000,000`

---

**Applied Problems**

## Problem 7: Pow(x, n)

**LeetCode:** [50. Pow(x, n)](https://leetcode.com/problems/pow-x-n/)

### Description
Implement `pow(x, n)`, which raises the floating-point base `x` to the integer
power `n`. Use fast exponentiation (exponentiation by squaring) so the work is
`O(log |n|)`. Handle negative exponents by raising the reciprocal: `x^(-n) =
(1/x)^n`.

### Examples
**Example 1:**
```
Input:  x = 2.00000, n = 10
Output: 1024.00000
```

**Example 2:**
```
Input:  x = 2.10000, n = 3
Output: 9.26100
```

**Example 3:**
```
Input:  x = 2.00000, n = -2
Output: 0.25000
```
`2^(-2) = 1 / 2^2 = 1/4 = 0.25`.

### Constraints
- `-100.0 < x < 100.0`
- `-2^31 <= n <= 2^31 - 1`
- Either `x` is non-zero or `n > 0`.
- The result is within `10^-5` of the true value.

---

## Problem 8: Fibonacci Number

**LeetCode:** [509. Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)

### Description
The Fibonacci sequence is defined by `F(0) = 0`, `F(1) = 1`, and
`F(n) = F(n-1) + F(n-2)` for `n >= 2`. Given `n`, return `F(n)`. Express the
recurrence directly; to stay fast you may memoize or fold the two recursive calls
into a single linear pass.

### Examples
**Example 1:**
```
Input:  n = 2
Output: 1
```
`F(2) = F(1) + F(0) = 1 + 0 = 1`.

**Example 2:**
```
Input:  n = 4
Output: 3
```
`F(4) = F(3) + F(2) = 2 + 1 = 3`.

**Example 3:**
```
Input:  n = 10
Output: 55
```

### Constraints
- `0 <= n <= 30`

---

## Problem 9: Merge Two Sorted Lists

**LeetCode:** [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)

### Description
Given two arrays each sorted in ascending order, merge them into a single sorted
array. Solve it recursively in the spirit of the merge step of merge sort: compare
the two front elements, emit the smaller, and recurse on the remainder. Do not
call a library sort.

### Examples
**Example 1:**
```
Input:  a = [1, 2, 4], b = [1, 3, 4]
Output: [1, 1, 2, 3, 4, 4]
```

**Example 2:**
```
Input:  a = [], b = []
Output: []
```

**Example 3:**
```
Input:  a = [], b = [0]
Output: [0]
```

### Constraints
- `0 <= a.length, b.length <= 50,000`
- Both arrays are sorted in non-decreasing order.
- `-10^9 <= a[i], b[i] <= 10^9`

---

## Problem 10: Find Peak Element

**LeetCode:** [162. Find Peak Element](https://leetcode.com/problems/find-peak-element/)

### Description
A peak element is strictly greater than its neighbors; out-of-bounds neighbors
count as negative infinity. Given an array where no two adjacent elements are
equal, return the index of any peak. Use a divide-and-conquer binary search:
compare the middle to its right neighbor and recurse toward the higher side, which
must contain a peak. Run in `O(log n)`.

### Examples
**Example 1:**
```
Input:  a = [1, 2, 3, 1]
Output: 2
```
`a[2] = 3` is greater than both neighbors, so index 2 is a peak.

**Example 2:**
```
Input:  a = [1, 2, 1, 3, 5, 6, 4]
Output: 5
```
Index 5 (value 6) is a peak; index 1 (value 2) is another valid answer.

**Example 3:**
```
Input:  a = [1]
Output: 0
```
A single element is a peak with both neighbors treated as negative infinity.

### Constraints
- `1 <= a.length <= 1,000`
- `-2^31 <= a[i] <= 2^31 - 1`
- `a[i] != a[i + 1]` for all valid `i`.

---

## Problem 11: Search in Rotated Sorted Array

**LeetCode:** [33. Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)

### Description
An ascending sorted array of distinct values has been rotated at an unknown pivot
(for example `[0,1,2,4,5,6,7]` becomes `[4,5,6,7,0,1,2]`). Given the rotated array
and a `target`, return its index, or `-1` if absent. Use a modified binary search:
at each step one half is sorted — decide whether the target lies in it and recurse
accordingly. Run in `O(log n)`.

### Examples
**Example 1:**
```
Input:  a = [4, 5, 6, 7, 0, 1, 2], target = 0
Output: 4
```

**Example 2:**
```
Input:  a = [4, 5, 6, 7, 0, 1, 2], target = 3
Output: -1
```

**Example 3:**
```
Input:  a = [1], target = 0
Output: -1
```

### Constraints
- `1 <= a.length <= 5,000`
- All values in `a` are distinct.
- `a` is a rotation of an ascending array.
- `-10^4 <= a[i], target <= 10^4`

---

## Problem 12: Subsets

**LeetCode:** [78. Subsets](https://leetcode.com/problems/subsets/)

### Description
Given an array of distinct integers, return all possible subsets (the power set).
The solution set must not contain duplicate subsets; order does not matter. Build
the subsets by recursion/backtracking: at each index, choose to include or exclude
the element and recurse on the rest.

### Examples
**Example 1:**
```
Input:  nums = [1, 2, 3]
Output: [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
```
All 2^3 = 8 subsets, in any order.

**Example 2:**
```
Input:  nums = [0]
Output: [[], [0]]
```

**Example 3:**
```
Input:  nums = []
Output: [[]]
```
The only subset of the empty set is the empty set itself.

### Constraints
- `0 <= nums.length <= 10`
- All elements of `nums` are distinct.
- `-10 <= nums[i] <= 10`

---

## Problem 13: Permutations

**LeetCode:** [46. Permutations](https://leetcode.com/problems/permutations/)

### Description
Given an array of distinct integers, return all possible orderings (permutations).
Use backtracking: pick an unused element for the current position, recurse to fill
the remaining positions, then undo the choice and try the next candidate. Any
order of the permutations is accepted.

### Examples
**Example 1:**
```
Input:  nums = [1, 2, 3]
Output: [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]]
```
All 3! = 6 orderings, in any order.

**Example 2:**
```
Input:  nums = [0, 1]
Output: [[0, 1], [1, 0]]
```

**Example 3:**
```
Input:  nums = [1]
Output: [[1]]
```

### Constraints
- `1 <= nums.length <= 6`
- All elements of `nums` are distinct.
- `-10 <= nums[i] <= 10`

---

## Problem 14: Sort an Array (Merge Sort)

**LeetCode:** [912. Sort an Array](https://leetcode.com/problems/sort-an-array/)

### Description
Given an array of integers, return it sorted in ascending order in `O(n log n)`
time without using any built-in sort. Implement merge sort as divide and conquer:
split the array in half, recursively sort each half, then merge the two sorted
halves into one.

### Examples
**Example 1:**
```
Input:  nums = [5, 2, 3, 1]
Output: [1, 2, 3, 5]
```

**Example 2:**
```
Input:  nums = [5, 1, 1, 2, 0, 0]
Output: [0, 0, 1, 1, 2, 5]
```

**Example 3:**
```
Input:  nums = [42]
Output: [42]
```

### Constraints
- `1 <= nums.length <= 50,000`
- `-50,000 <= nums[i] <= 50,000`

---

## Problem 15: Majority Element

**LeetCode:** [169. Majority Element](https://leetcode.com/problems/majority-element/)

### Description
Given an array of size `n`, return the majority element — the value that appears
more than `n / 2` times. You may assume one always exists. Solve it with divide
and conquer: recursively find the majority of the left and right halves; if they
agree that is the answer, otherwise count which candidate dominates the full
range.

### Examples
**Example 1:**
```
Input:  nums = [3, 2, 3]
Output: 3
```
3 appears twice in an array of length 3, which is more than 1.5.

**Example 2:**
```
Input:  nums = [2, 2, 1, 1, 1, 2, 2]
Output: 2
```
2 appears four times out of seven.

**Example 3:**
```
Input:  nums = [7]
Output: 7
```

### Constraints
- `1 <= nums.length <= 50,000`
- A majority element is guaranteed to exist.
- `-10^9 <= nums[i] <= 10^9`

---

## Problem 16: Different Ways to Add Parentheses

**LeetCode:** [241. Different Ways to Add Parentheses](https://leetcode.com/problems/different-ways-to-add-parentheses/)

### Description
Given a string expression of numbers and the operators `+`, `-`, and `*`, return
all possible results of computing it under every way of grouping the operands with
parentheses. Solve it with divide and conquer: split at each operator, recursively
evaluate the left and right sub-expressions, and combine every left result with
every right result using that operator. Results may be returned in any order.

### Examples
**Example 1:**
```
Input:  expression = "2-1-1"
Output: [0, 2]
```
`(2-1)-1 = 0` and `2-(1-1) = 2`.

**Example 2:**
```
Input:  expression = "2*3-4*5"
Output: [-34, -14, -10, -10, 10]
```
The five distinct parenthesizations evaluate to these values.

**Example 3:**
```
Input:  expression = "11"
Output: [11]
```
A bare number has exactly one value.

### Constraints
- `1 <= expression.length <= 20`
- `expression` contains only digits and the operators `+`, `-`, `*`.
- Every integer operand is in the range `[0, 99]`.

---

## Problem 17: Count Inversions

### Description
Given an array, count the number of inversions: pairs `(i, j)` with `i < j` and
`a[i] > a[j]`. A brute-force scan is `O(n^2)`; instead piggyback on merge sort —
while merging two sorted halves, every time you take an element from the right
half before the left, it forms an inversion with all remaining left-half elements.
Run in `O(n log n)`.

### Examples
**Example 1:**
```
Input:  a = [2, 4, 1, 3, 5]
Output: 3
```
The inversions are (2,1), (4,1), and (4,3).

**Example 2:**
```
Input:  a = [5, 4, 3, 2, 1]
Output: 10
```
A strictly descending array of length 5 has every one of its 10 pairs inverted.

**Example 3:**
```
Input:  a = [1, 2, 3]
Output: 0
```
An already-sorted array has no inversions.

### Constraints
- `1 <= a.length <= 100,000`
- `-10^9 <= a[i] <= 10^9`
- The count fits in a 64-bit signed integer.

---

## Problem 18: Generate Parentheses

**LeetCode:** [22. Generate Parentheses](https://leetcode.com/problems/generate-parentheses/)

### Description
Given `n` pairs of parentheses, generate all combinations of well-formed
parentheses. Use backtracking: at each step you may add an opening bracket if any
remain, or a closing bracket if it would not exceed the opens placed so far.
Results may be returned in any order.

### Examples
**Example 1:**
```
Input:  n = 3
Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]
```
The five valid arrangements of three pairs.

**Example 2:**
```
Input:  n = 1
Output: ["()"]
```

**Example 3:**
```
Input:  n = 2
Output: ["(())", "()()"]
```

### Constraints
- `1 <= n <= 8`

---

## Problem 19: Combination Sum

**LeetCode:** [39. Combination Sum](https://leetcode.com/problems/combination-sum/)

### Description
Given an array of distinct positive integers `candidates` and a `target`, return
all unique combinations whose elements sum to `target`. The same number may be
chosen unlimited times. Two combinations are the same regardless of order. Use
backtracking: try each candidate, subtract it from the remaining target, and
recurse — allowing the same index again to permit reuse. Any order is accepted.

### Examples
**Example 1:**
```
Input:  candidates = [2, 3, 6, 7], target = 7
Output: [[2, 2, 3], [7]]
```
`2 + 2 + 3 = 7` and `7 = 7`.

**Example 2:**
```
Input:  candidates = [2, 3, 5], target = 8
Output: [[2, 2, 2, 2], [2, 3, 3], [3, 5]]
```

**Example 3:**
```
Input:  candidates = [2], target = 1
Output: []
```
No multiple of 2 equals 1.

### Constraints
- `1 <= candidates.length <= 30`
- All elements of `candidates` are distinct.
- `1 <= candidates[i] <= 200`
- `1 <= target <= 500`

---

## Problem 20: Median of Two Sorted Arrays

**LeetCode:** [4. Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)

### Description
Given two arrays sorted in ascending order, return the median of their combined
multiset. The overall run time must be `O(log(min(m, n)))`. Binary-search a
partition of the shorter array so that all elements on the left of the combined
split are no greater than those on the right; the median falls at the boundary.

### Examples
**Example 1:**
```
Input:  a = [1, 3], b = [2]
Output: 2.00000
```
The merged array is `[1, 2, 3]`, whose median is 2.

**Example 2:**
```
Input:  a = [1, 2], b = [3, 4]
Output: 2.50000
```
The merged array is `[1, 2, 3, 4]`; the median is `(2 + 3) / 2 = 2.5`.

**Example 3:**
```
Input:  a = [], b = [1]
Output: 1.00000
```

### Constraints
- `0 <= m, n <= 1,000` and `1 <= m + n`
- Both arrays are sorted in non-decreasing order.
- `-10^6 <= a[i], b[i] <= 10^6`

---

## Problem 21: Relay Station Spacing

### Description
Given the planar coordinates of relay stations, return the smallest Euclidean
distance between any two distinct stations. Use the closest-pair-of-points
divide-and-conquer algorithm: sort by x, split into left and right halves, recurse
on each, then check the narrow strip around the dividing line for any closer
cross-pair. Run in `O(n log n)`. Reuses the module's `Point` record.

### Examples
**Example 1:**
```
Input:  stations = [(0,0), (5,5), (1,1), (9,2)]
Output: 1.41421356
```
The closest pair is `(0,0)` and `(1,1)`, at distance `sqrt(2)`.

**Example 2:**
```
Input:  stations = [(0,0), (3,4)]
Output: 5.0
```
With two points the answer is simply the distance between them.

**Example 3:**
```
Input:  stations = [(2,2), (2,5), (2,2.5), (8,8)]
Output: 0.5
```
The pair `(2,2)` and `(2,2.5)` is the closest, at distance `0.5`.

### Constraints
- `2 <= stations.length <= 100,000`
- `-10^9 <= x, y <= 10^9`
- All stations are distinct points.

---

## Problem 22: Skyline Merge

### Description
Each building is given as `[left, right, height]`. The skyline is the silhouette
formed by all the buildings against the horizon, described as a list of "key
points" `[x, height]` sorted by `x`, where each point marks a change in the
visible roofline; the last point has height `0`. Compute it with divide and
conquer: split the buildings into two groups, recursively compute each group's
skyline, then merge the two skylines by sweeping their key points and tracking the
running max height of each side. Run in `O(n log n)`.

### Examples
**Example 1:**
```
Input:  buildings = [[2,9,10], [3,7,15], [5,12,12], [15,20,10], [19,24,8]]
Output: [[2,10], [3,15], [7,12], [12,0], [15,10], [20,8], [24,0]]
```
The merged silhouette rises to 15, steps down past each building, and returns to 0.

**Example 2:**
```
Input:  buildings = [[0,2,3], [2,5,3]]
Output: [[0,3], [5,0]]
```
Two equal-height adjacent buildings form a single flat roofline.

**Example 3:**
```
Input:  buildings = [[1,5,11]]
Output: [[1,11], [5,0]]
```
A lone building gives its left edge and its right drop to ground.

### Constraints
- `1 <= buildings.length <= 10,000`
- `0 <= left < right <= 2^31 - 1`
- `1 <= height <= 2^31 - 1`

---
