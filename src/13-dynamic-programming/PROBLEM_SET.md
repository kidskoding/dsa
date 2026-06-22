# Dynamic Programming: Problem Set

Dynamic programming turns exponential recursion into polynomial tables by
remembering subproblem answers. This set starts with the classic 1-D recurrences
(stairs, robber, subarrays) and builds up through the core patterns: knapsack and
coin systems, grid paths, subsequence problems (LIS, LCS, palindromes), edit
distance, partitioning, and interval DP. Every problem is an implementation task:
fill in the stub in `problemset/` and make its test in `tests/problemset/` pass.

**Foundational**

## Problem 1: Climbing Stairs

**LeetCode:** [70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)

### Description
You are climbing a staircase with `n` steps. Each time you may climb either 1 or 2
steps. Count the number of distinct ways you can reach the top. This is the canonical
introduction to DP: the number of ways to reach step `i` is the sum of the ways to
reach steps `i-1` and `i-2`, the Fibonacci recurrence in disguise.

### Examples
**Example 1:**
```
Input:  n = 2
Output: 2
```
There are two ways: `1+1` and `2`.

**Example 2:**
```
Input:  n = 3
Output: 3
```
The ways are `1+1+1`, `1+2`, and `2+1`.

**Example 3:**
```
Input:  n = 5
Output: 8
```

### Constraints
- `1 <= n <= 45`

---

## Problem 2: Maximum Subarray Sum

**LeetCode:** [53. Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)

### Description
Given an integer array `nums`, find the contiguous non-empty subarray with the largest
sum and return that sum. Framed as DP (Kadane's algorithm), the best sum ending at index
`i` is either `nums[i]` alone or `nums[i]` extended onto the best sum ending at `i-1`.

### Examples
**Example 1:**
```
Input:  nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
```
The subarray `[4, -1, 2, 1]` has the largest sum, `6`.

**Example 2:**
```
Input:  nums = [1]
Output: 1
```

**Example 3:**
```
Input:  nums = [-5, -1, -8]
Output: -1
```
All elements are negative, so the best single element `-1` is the answer.

### Constraints
- `1 <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4`

---

## Problem 3: House Robber

**LeetCode:** [198. House Robber](https://leetcode.com/problems/house-robber/)

### Description
You are a robber planning to loot houses along a street. Each house holds a non-negative
amount of money, given by the array `nums`. Adjacent houses have connected security systems,
so robbing two adjacent houses on the same night triggers an alarm. Return the maximum amount
you can rob without alerting the police.

### Examples
**Example 1:**
```
Input:  nums = [1, 2, 3, 1]
Output: 4
```
Rob house 0 (money = 1) and house 2 (money = 3): total `4`.

**Example 2:**
```
Input:  nums = [2, 7, 9, 3, 1]
Output: 12
```
Rob houses 0, 2, and 4: `2 + 9 + 1 = 12`.

**Example 3:**
```
Input:  nums = [5]
Output: 5
```

### Constraints
- `1 <= nums.length <= 100`
- `0 <= nums[i] <= 400`

---

## Problem 4: Unique Grid Paths

**LeetCode:** [62. Unique Paths](https://leetcode.com/problems/unique-paths/)

### Description
A robot sits in the top-left corner of an `m x n` grid. It can only move either right or
down at any point. Count the number of distinct paths the robot can take to reach the
bottom-right corner. The number of paths to a cell is the sum of paths to the cell above
and the cell to the left.

### Examples
**Example 1:**
```
Input:  m = 3, n = 7
Output: 28
```

**Example 2:**
```
Input:  m = 3, n = 2
Output: 3
```
The three paths are: Right→Down→Down, Down→Right→Down, Down→Down→Right.

**Example 3:**
```
Input:  m = 1, n = 1
Output: 1
```

### Constraints
- `1 <= m, n <= 100`
- The answer fits in a 32-bit signed integer.

---

## Problem 5: Subset Sum Feasibility

**LeetCode:** ### Description
Given an array of positive integers `nums` and a target `t`, decide whether some subset of
`nums` sums to exactly `t`. This is the boolean core of the knapsack family: `reachable[s]`
is true if some subset sums to `s`, and adding a number `x` makes `reachable[s]` true whenever
`reachable[s - x]` was already true.

### Examples
**Example 1:**
```
Input:  nums = [3, 34, 4, 12, 5, 2], t = 9
Output: true
```
The subset `[4, 5]` sums to `9`.

**Example 2:**
```
Input:  nums = [3, 34, 4, 12, 5, 2], t = 30
Output: false
```
No subset sums to exactly `30`.

**Example 3:**
```
Input:  nums = [1, 2, 3], t = 0
Output: true
```
The empty subset sums to `0`.

### Constraints
- `0 <= nums.length <= 200`
- `1 <= nums[i] <= 1000`
- `0 <= t <= 100000`

---

## Problem 6: Minimum Falling Path Sum

**LeetCode:** [931. Minimum Falling Path Sum](https://leetcode.com/problems/minimum-falling-path-sum/)

### Description
Given an `n x n` integer matrix, find the minimum sum of any falling path. A falling path
starts at any cell in the first row and chooses, at each step, the cell directly below or
diagonally left-below or right-below the current cell, until it reaches the last row. Return
the minimum total of such a path.

### Examples
**Example 1:**
```
Input:  matrix = [[2, 1, 3], [6, 5, 4], [7, 8, 9]]
Output: 13
```
The minimal path is `1 -> 5 -> 7 = 13`.

**Example 2:**
```
Input:  matrix = [[-19, 57], [-40, -5]]
Output: -59
```
The minimal path is `-19 -> -40 = -59`.

**Example 3:**
```
Input:  matrix = [[7]]
Output: 7
```

### Constraints
- `1 <= n <= 100`
- `-100 <= matrix[i][j] <= 100`

---

**Applied Problems**

## Problem 7: Min Cost Climbing Stairs

**LeetCode:** [746. Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/)

### Description
You are given an array `cost` where `cost[i]` is the cost of stepping on the `i`-th stair.
Once you pay the cost you may climb one or two stairs. You can start from either stair `0`
or stair `1`. Return the minimum cost to reach the top of the floor (just past the last
stair).

### Examples
**Example 1:**
```
Input:  cost = [10, 15, 20]
Output: 15
```
Start at index 1, pay `15`, and climb two stairs to the top.

**Example 2:**
```
Input:  cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
Output: 6
```
Stepping on indices `0, 2, 4, 6, 7, 9` costs `1` each: total `6`.

**Example 3:**
```
Input:  cost = [0, 0]
Output: 0
```

### Constraints
- `2 <= cost.length <= 1000`
- `0 <= cost[i] <= 999`

---

## Problem 8: Coin Change (Minimum Coins)

**LeetCode:** [322. Coin Change](https://leetcode.com/problems/coin-change/)

### Description
Given an array of coin denominations `coins` and a target `amount`, compute the fewest number
of coins needed to make up that amount. Each denomination may be used an unlimited number of
times. If the amount cannot be formed by any combination of coins, return `-1`.

### Examples
**Example 1:**
```
Input:  coins = [1, 2, 5], amount = 11
Output: 3
```
`11 = 5 + 5 + 1`, using three coins.

**Example 2:**
```
Input:  coins = [2], amount = 3
Output: -1
```
No combination of `2`-coins makes `3`.

**Example 3:**
```
Input:  coins = [1, 5, 10], amount = 0
Output: 0
```

### Constraints
- `1 <= coins.length <= 12`
- `1 <= coins[i] <= 2^31 - 1`
- `0 <= amount <= 10^4`

---

## Problem 9: Coin Change (Count Combinations)

**LeetCode:** [518. Coin Change II](https://leetcode.com/problems/coin-change-ii/)

### Description
Given an array of coin denominations `coins` and a target `amount`, count the number of
distinct combinations (order does not matter) of coins that sum to `amount`. Each denomination
may be used an unlimited number of times. This is the unbounded counting version of coin
change: iterating coins in the outer loop avoids counting permutations as distinct.

### Examples
**Example 1:**
```
Input:  amount = 5, coins = [1, 2, 5]
Output: 4
```
The combinations are `5`, `2+2+1`, `2+1+1+1`, and `1+1+1+1+1`.

**Example 2:**
```
Input:  amount = 3, coins = [2]
Output: 0
```

**Example 3:**
```
Input:  amount = 10, coins = [10]
Output: 1
```

### Constraints
- `1 <= coins.length <= 300`
- `1 <= coins[i] <= 5000`
- `0 <= amount <= 5000`
- The answer fits in a 32-bit signed integer.

---

## Problem 10: Perfect Squares

**LeetCode:** [279. Perfect Squares](https://leetcode.com/problems/perfect-squares/)

### Description
Given an integer `n`, return the least number of perfect-square numbers (`1, 4, 9, 16, ...`)
that sum to `n`. This is coin change where the "coins" are the perfect squares not exceeding
`n`, with unlimited reuse.

### Examples
**Example 1:**
```
Input:  n = 12
Output: 3
```
`12 = 4 + 4 + 4`.

**Example 2:**
```
Input:  n = 13
Output: 2
```
`13 = 4 + 9`.

**Example 3:**
```
Input:  n = 1
Output: 1
```

### Constraints
- `1 <= n <= 10^4`

---

## Problem 11: Maximum Product Subarray

**LeetCode:** [152. Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)

### Description
Given an integer array `nums`, find the contiguous non-empty subarray with the largest product
and return that product. Because a negative factor can flip the largest product to the smallest,
you must track both the running maximum and minimum product ending at each index.

### Examples
**Example 1:**
```
Input:  nums = [2, 3, -2, 4]
Output: 6
```
The subarray `[2, 3]` has product `6`.

**Example 2:**
```
Input:  nums = [-2, 0, -1]
Output: 0
```
The result cannot be `2`, because `[-2, -1]` is not contiguous.

**Example 3:**
```
Input:  nums = [-2, 3, -4]
Output: 24
```
The whole array multiplies to `24`.

### Constraints
- `1 <= nums.length <= 2 * 10^4`
- `-10 <= nums[i] <= 10`
- The product of any subarray fits in a 32-bit signed integer.

---

## Problem 12: House Robber II (Circular Street)

**LeetCode:** [213. House Robber II](https://leetcode.com/problems/house-robber-ii/)

### Description
Houses are arranged in a circle, so the first and last houses are adjacent. As before, you
cannot rob two adjacent houses. Return the maximum amount you can rob. The trick is to run the
linear House Robber twice — once excluding the first house, once excluding the last — and take
the better result.

### Examples
**Example 1:**
```
Input:  nums = [2, 3, 2]
Output: 3
```
You cannot rob houses 0 and 2 together (they are adjacent in the circle), so the best is `3`.

**Example 2:**
```
Input:  nums = [1, 2, 3, 1]
Output: 4
```
Rob houses 0 and 2: `1 + 3 = 4`.

**Example 3:**
```
Input:  nums = [5]
Output: 5
```

### Constraints
- `1 <= nums.length <= 100`
- `0 <= nums[i] <= 1000`

---

## Problem 13: Decode Ways

**LeetCode:** [91. Decode Ways](https://leetcode.com/problems/decode-ways/)

### Description
A message of digits is encoded using the mapping `'A' -> "1", 'B' -> "2", ..., 'Z' -> "26"`.
Given a string `s` of digits, count the number of ways to decode it. A single digit `1`–`9`
decodes on its own; a two-digit group `10`–`26` decodes as one letter. Leading zeros and
standalone zeros that cannot pair are invalid and contribute `0` ways.

### Examples
**Example 1:**
```
Input:  s = "12"
Output: 2
```
It decodes as `"AB"` (1 2) or `"L"` (12).

**Example 2:**
```
Input:  s = "226"
Output: 3
```
It decodes as `"BZ"`, `"VF"`, or `"BBF"`.

**Example 3:**
```
Input:  s = "06"
Output: 0
```
A leading zero cannot be decoded.

### Constraints
- `1 <= s.length <= 100`
- `s` contains only digits and may contain leading zeros.

---

## Problem 14: Longest Increasing Subsequence

**LeetCode:** [300. Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)

### Description
Given an integer array `nums`, return the length of the longest strictly increasing
subsequence. A subsequence is formed by deleting zero or more elements without changing the
order of the rest. The `O(n^2)` DP sets `dp[i]` to the longest increasing subsequence ending
at index `i`.

### Examples
**Example 1:**
```
Input:  nums = [10, 9, 2, 5, 3, 7, 101, 18]
Output: 4
```
One longest increasing subsequence is `[2, 3, 7, 18]`.

**Example 2:**
```
Input:  nums = [0, 1, 0, 3, 2, 3]
Output: 4
```

**Example 3:**
```
Input:  nums = [7, 7, 7, 7]
Output: 1
```
"Strictly" increasing means equal elements do not extend the run.

### Constraints
- `1 <= nums.length <= 2500`
- `-10^4 <= nums[i] <= 10^4`

---

## Problem 15: Longest Common Subsequence

**LeetCode:** [1143. Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)

### Description
Given two strings `text1` and `text2`, return the length of their longest common subsequence,
or `0` if there is none. A common subsequence appears in both strings in the same relative
order but not necessarily contiguously. The DP compares characters: on a match, extend the
diagonal; otherwise take the better of dropping a character from either string.

### Examples
**Example 1:**
```
Input:  text1 = "abcde", text2 = "ace"
Output: 3
```
The longest common subsequence is `"ace"`.

**Example 2:**
```
Input:  text1 = "abc", text2 = "abc"
Output: 3
```

**Example 3:**
```
Input:  text1 = "abc", text2 = "def"
Output: 0
```

### Constraints
- `1 <= text1.length, text2.length <= 1000`
- The strings consist of lowercase English letters.

---

## Problem 16: Longest Palindromic Subsequence

**LeetCode:** [516. Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/)

### Description
Given a string `s`, return the length of its longest palindromic subsequence. This is interval
DP: `dp[i][j]` is the longest palindromic subsequence within `s[i..j]`. When the endpoints match
they add `2` to the inner interval; otherwise take the better of shrinking from either end.

### Examples
**Example 1:**
```
Input:  s = "bbbab"
Output: 4
```
One longest palindromic subsequence is `"bbbb"`.

**Example 2:**
```
Input:  s = "cbbd"
Output: 2
```
One longest palindromic subsequence is `"bb"`.

**Example 3:**
```
Input:  s = "a"
Output: 1
```

### Constraints
- `1 <= s.length <= 1000`
- `s` consists of lowercase English letters.

---

## Problem 17: Edit Distance

**LeetCode:** [72. Edit Distance](https://leetcode.com/problems/edit-distance/)

### Description
Given two strings `word1` and `word2`, return the minimum number of operations required to
convert `word1` into `word2`. The permitted operations are inserting a character, deleting a
character, and replacing a character (Levenshtein distance). The DP fills a table where
`dp[i][j]` is the edit distance between the first `i` and first `j` characters.

### Examples
**Example 1:**
```
Input:  word1 = "horse", word2 = "ros"
Output: 3
```
`horse -> rorse -> rose -> ros` (replace, delete, delete).

**Example 2:**
```
Input:  word1 = "intention", word2 = "execution"
Output: 5
```

**Example 3:**
```
Input:  word1 = "", word2 = "abc"
Output: 3
```

### Constraints
- `0 <= word1.length, word2.length <= 500`
- The strings consist of lowercase English letters.

---

## Problem 18: Partition Equal Subset Sum

**LeetCode:** [416. Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/)

### Description
Given an array of positive integers `nums`, decide whether it can be partitioned into two
subsets with equal sums. This reduces to subset-sum: a valid split exists only if the total
sum is even and some subset sums to exactly half of it.

### Examples
**Example 1:**
```
Input:  nums = [1, 5, 11, 5]
Output: true
```
The array splits into `[1, 5, 5]` and `[11]`, each summing to `11`.

**Example 2:**
```
Input:  nums = [1, 2, 3, 5]
Output: false
```
The total `11` is odd, so no equal split is possible.

**Example 3:**
```
Input:  nums = [2, 2]
Output: true
```

### Constraints
- `1 <= nums.length <= 200`
- `1 <= nums[i] <= 100`

---

## Problem 19: Unique Paths II (With Obstacles)

**LeetCode:** [63. Unique Paths II](https://leetcode.com/problems/unique-paths-ii/)

### Description
A robot moves from the top-left to the bottom-right of an `m x n` grid, going only right or
down. Some cells contain obstacles, marked `1`, which cannot be entered; open cells are marked
`0`. Count the number of distinct obstacle-free paths. If the start or end cell is blocked, the
answer is `0`.

### Examples
**Example 1:**
```
Input:  grid = [[0, 0, 0], [0, 1, 0], [0, 0, 0]]
Output: 2
```
The obstacle in the middle leaves exactly two paths around it.

**Example 2:**
```
Input:  grid = [[0, 1], [0, 0]]
Output: 1
```

**Example 3:**
```
Input:  grid = [[1]]
Output: 0
```
The start cell is blocked.

### Constraints
- `1 <= m, n <= 100`
- `grid[i][j]` is `0` or `1`.
- The answer fits in a 32-bit signed integer.

---

## Problem 20: Minimum Path Sum

**LeetCode:** [64. Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/)

### Description
Given an `m x n` grid of non-negative integers, find a path from the top-left to the
bottom-right that minimizes the sum of all numbers along the way. You may only move right or
down. Return that minimum sum, counting both endpoints.

### Examples
**Example 1:**
```
Input:  grid = [[1, 3, 1], [1, 5, 1], [4, 2, 1]]
Output: 7
```
The path `1 -> 3 -> 1 -> 1 -> 1` sums to `7`.

**Example 2:**
```
Input:  grid = [[1, 2, 3], [4, 5, 6]]
Output: 12
```

**Example 3:**
```
Input:  grid = [[5]]
Output: 5
```

### Constraints
- `1 <= m, n <= 200`
- `0 <= grid[i][j] <= 200`

---

## Problem 21: Word Break

**LeetCode:** [139. Word Break](https://leetcode.com/problems/word-break/)

### Description
Given a string `s` and a dictionary of strings `wordDict`, return `true` if `s` can be segmented
into a space-separated sequence of one or more dictionary words. The same dictionary word may be
reused. The DP marks `dp[i]` true when some dictionary word ends exactly at position `i` and the
prefix before it is also breakable.

### Examples
**Example 1:**
```
Input:  s = "leetcode", wordDict = ["leet", "code"]
Output: true
```
`"leetcode"` splits into `"leet code"`.

**Example 2:**
```
Input:  s = "applepenapple", wordDict = ["apple", "pen"]
Output: true
```
`"applepenapple"` splits into `"apple pen apple"`; reuse is allowed.

**Example 3:**
```
Input:  s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
Output: false
```

### Constraints
- `1 <= s.length <= 300`
- `1 <= wordDict.length <= 1000`
- `1 <= wordDict[i].length <= 20`
- All strings consist of lowercase English letters.

---

## Problem 22: Best Time to Buy and Sell Stock with Cooldown

**LeetCode:** [309. Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/)

### Description
Given an array `prices` where `prices[i]` is the stock price on day `i`, find the maximum profit
you can achieve. You may complete as many transactions as you like, but you may not hold more than
one share at a time, and after you sell you must wait one day (a cooldown) before buying again.
A small state machine — holding, sold, resting — captures the transitions.

### Examples
**Example 1:**
```
Input:  prices = [1, 2, 3, 0, 2]
Output: 3
```
The transactions are buy, sell, cooldown, buy, sell: profit `3`.

**Example 2:**
```
Input:  prices = [1]
Output: 0
```

**Example 3:**
```
Input:  prices = [2, 1, 4]
Output: 3
```
Buy at `1`, sell at `4`.

### Constraints
- `1 <= prices.length <= 5000`
- `0 <= prices[i] <= 1000`

---

## Problem 23: Maximal Square

**LeetCode:** [221. Maximal Square](https://leetcode.com/problems/maximal-square/)

### Description
Given an `m x n` binary matrix of `0`s and `1`s, find the largest square containing only `1`s and
return its area. The DP value `dp[i][j]` is the side length of the largest all-ones square whose
bottom-right corner is at `(i, j)`, equal to one plus the minimum of its top, left, and top-left
neighbors when the cell is `1`.

### Examples
**Example 1:**
```
Input:  matrix = [[1, 0, 1, 0, 0], [1, 0, 1, 1, 1], [1, 1, 1, 1, 1], [1, 0, 0, 1, 0]]
Output: 4
```
The largest all-ones square has side `2`, so area `4`.

**Example 2:**
```
Input:  matrix = [[0, 1], [1, 0]]
Output: 1
```

**Example 3:**
```
Input:  matrix = [[0]]
Output: 0
```

### Constraints
- `1 <= m, n <= 300`
- `matrix[i][j]` is `0` or `1`.

---

## Problem 24: Target Sum

**LeetCode:** [494. Target Sum](https://leetcode.com/problems/target-sum/)

### Description
Given an array of non-negative integers `nums` and an integer `target`, you assign a `+` or `-`
sign to each number and concatenate them into an expression. Return the number of different sign
assignments that evaluate to `target`. Splitting the numbers into a positive group `P` and a
negative group `N`, the problem reduces to counting subsets `P` with a fixed sum, a subset-sum
counting DP.

### Examples
**Example 1:**
```
Input:  nums = [1, 1, 1, 1, 1], target = 3
Output: 5
```
There are five ways to reach `3`, e.g. `-1+1+1+1+1` and `+1+1+1+1-1`.

**Example 2:**
```
Input:  nums = [1], target = 1
Output: 1
```

**Example 3:**
```
Input:  nums = [1], target = 2
Output: 0
```

### Constraints
- `1 <= nums.length <= 20`
- `0 <= nums[i] <= 1000`
- `-1000 <= target <= 1000`
- The answer fits in a 32-bit signed integer.

---

## Problem 25: Longest Palindromic Substring

**LeetCode:** [5. Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)

### Description
Given a string `s`, return the longest contiguous substring of `s` that is a palindrome. Unlike
the subsequence version, the characters must be adjacent. The interval DP marks `dp[i][j]` true
when `s[i..j]` is a palindrome, which holds when the endpoints match and the inner substring is
also a palindrome.

### Examples
**Example 1:**
```
Input:  s = "babad"
Output: "bab"
```
`"aba"` is also a valid answer of the same length.

**Example 2:**
```
Input:  s = "cbbd"
Output: "bb"
```

**Example 3:**
```
Input:  s = "a"
Output: "a"
```

### Constraints
- `1 <= s.length <= 1000`
- `s` consists of digits and English letters.

---

## Problem 26: Number of Longest Increasing Subsequences

**LeetCode:** [673. Number of Longest Increasing Subsequence](https://leetcode.com/problems/number-of-longest-increasing-subsequence/)

### Description
Given an integer array `nums`, return the number of longest strictly increasing subsequences.
Beyond the length DP, you track a count `cnt[i]` of how many longest increasing subsequences end
at index `i`, updating both the length and the count as you extend.

### Examples
**Example 1:**
```
Input:  nums = [1, 3, 5, 4, 7]
Output: 2
```
The two longest increasing subsequences are `[1, 3, 4, 7]` and `[1, 3, 5, 7]`.

**Example 2:**
```
Input:  nums = [2, 2, 2, 2, 2]
Output: 5
```
Each single element is a longest increasing subsequence of length `1`.

**Example 3:**
```
Input:  nums = [1, 2, 4, 3, 5, 4, 7, 2]
Output: 3
```

### Constraints
- `1 <= nums.length <= 2000`
- `-10^6 <= nums[i] <= 10^6`
- The answer fits in a 32-bit signed integer.

---

## Problem 27: 0/1 Knapsack

**LeetCode:** ### Description
You are given `n` items, where item `i` has weight `weights[i]` and value `values[i]`, and a
knapsack with capacity `capacity`. Choose a subset of items whose total weight does not exceed
`capacity` so as to maximize the total value. Each item may be taken at most once. Return the
maximum value achievable.

### Examples
**Example 1:**
```
Input:  weights = [1, 3, 4, 5], values = [1, 4, 5, 7], capacity = 7
Output: 9
```
Take items with weights `3` and `4` for value `4 + 5 = 9`.

**Example 2:**
```
Input:  weights = [2, 3, 4], values = [4, 5, 6], capacity = 5
Output: 9
```
Take items with weights `2` and `3` for value `4 + 5 = 9`.

**Example 3:**
```
Input:  weights = [5], values = [10], capacity = 4
Output: 0
```
The only item is too heavy.

### Constraints
- `0 <= n <= 200`
- `1 <= weights[i] <= 1000`
- `0 <= values[i] <= 10^6`
- `0 <= capacity <= 10^4`

---

## Problem 28: Minimum Workshop Split

**LeetCode:** ### Description
An elf workshop must divide a pile of parts into two bins. Given positive part weights `parts`,
split them into two groups so that the absolute difference between the two group sums is as small
as possible. Return that minimum difference. This is the optimization twin of partition: find the
subset sum closest to half the total.

### Examples
**Example 1:**
```
Input:  parts = [1, 6, 11, 5]
Output: 1
```
Split into `[1, 5, 6]` (sum 12) and `[11]` (sum 11): difference `1`.

**Example 2:**
```
Input:  parts = [3, 1, 4, 2, 2]
Output: 0
```
Split into `[3, 2]` and `[1, 4]`... or any even split summing to `6` each.

**Example 3:**
```
Input:  parts = [10]
Output: 10
```

### Constraints
- `0 <= parts.length <= 200`
- `1 <= parts[i] <= 100`

---

## Problem 29: Matrix Chain Multiplication

**LeetCode:** ### Description
You must multiply a chain of matrices `A1 · A2 · ... · An`, where matrix `Ai` has dimensions
`dims[i-1] x dims[i]`. Matrix multiplication is associative, so the parenthesization does not
change the result but does change the number of scalar multiplications. Given the array `dims` of
length `n+1`, return the minimum number of scalar multiplications needed. This is the textbook
interval DP: `dp[i][j]` is the best cost to multiply the sub-chain from `i` to `j`, split at every
possible point `k`.

### Examples
**Example 1:**
```
Input:  dims = [10, 20, 30]
Output: 6000
```
Two matrices `10x20` and `20x30` cost `10 * 20 * 30 = 6000`.

**Example 2:**
```
Input:  dims = [40, 20, 30, 10, 30]
Output: 26000
```
The optimal parenthesization is `(A1(A2A3))A4`.

**Example 3:**
```
Input:  dims = [10, 20]
Output: 0
```
A single matrix needs no multiplications.

### Constraints
- `2 <= dims.length <= 100`
- `1 <= dims[i] <= 500`
- The answer fits in a 64-bit signed integer.

---

## Problem 30: Burst Balloons

**LeetCode:** [312. Burst Balloons](https://leetcode.com/problems/burst-balloons/)

### Description
You are given `n` balloons in a row, with balloon `i` painted with the number `nums[i]`. If you
burst balloon `i`, you earn `nums[left] * nums[i] * nums[right]` coins, where `left` and `right`
are the balloons immediately adjacent to `i` (treating out-of-range neighbors as a virtual balloon
worth `1`). After bursting, the neighbors become adjacent. Return the maximum coins you can collect
by bursting all the balloons. The interval DP considers each balloon as the *last* one burst in an
interval, so its neighbors are the fixed interval boundaries.

### Examples
**Example 1:**
```
Input:  nums = [3, 1, 5, 8]
Output: 167
```
Bursting in order `1, 5, 3, 8` yields `3*1*5 + 3*5*8 + 1*3*8 + 1*8*1 = 167`.

**Example 2:**
```
Input:  nums = [1, 5]
Output: 10
```
Burst `1` first for `1*1*5 = 5`, then `5` for `1*5*1 = 5`: total `10`.

**Example 3:**
```
Input:  nums = [7]
Output: 7
```

### Constraints
- `1 <= n <= 300`
- `0 <= nums[i] <= 100`
- The answer fits in a 32-bit signed integer.

---
