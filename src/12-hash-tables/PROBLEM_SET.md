# Hash Tables: Problem Set

Master the hash-map toolkit — frequency counting, deduplication, grouping by canonical key, O(1) lookup, and prefix-sum maps. **Foundational** problems build the moves you should write cold; **Applied Problems** weave interview-style (LeetCode) and competitive-programming-style (Codeforces / Advent of Code / Codyssi) challenges, roughly easy to hard.

**Foundational**

## Problem 1: Two Sum

**LeetCode:** [1. Two Sum](https://leetcode.com/problems/two-sum/)

### Description

Given an `int[]` array `nums` and an `int target`, return the indices `[i, j]` (`i < j`) of the two distinct elements that sum to `target`. Exactly one solution exists. Use a hash map from value to index so each element is visited once: for each `x`, check whether `target - x` was already seen.

### Examples

**Example 1:**
```
Input:  nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
```
`nums[0] + nums[1] = 2 + 7 = 9`.

**Example 2:**
```
Input:  nums = [3, 2, 4], target = 6
Output: [1, 2]
```

**Example 3:**
```
Input:  nums = [3, 3], target = 6
Output: [0, 1]
```

### Constraints

- `2 <= n <= 10^4`
- Exactly one valid answer exists.
- Target O(n) time.

---

## Problem 2: Character Frequency Count

### Description

Given a lowercase string `s`, return a `Map<Character, Integer>` mapping each distinct character to the number of times it appears in `s`. This is the canonical frequency-count move that underpins anagram and counting problems. Characters that do not appear are absent from the map.

### Examples

**Example 1:**
```
Input:  s = "banana"
Output: {b=1, a=3, n=2}
```

**Example 2:**
```
Input:  s = "aabb"
Output: {a=2, b=2}
```

**Example 3:**
```
Input:  s = ""
Output: {}
```

### Constraints

- `0 <= s.length() <= 10^5`
- `s` consists of lowercase English letters.

---

## Problem 3: Deduplicate Preserving Order

### Description

Given an `int[]` array, return a new array with duplicates removed, keeping the **first occurrence order** of each distinct value. Use a hash set to track which values have already been emitted.

### Examples

**Example 1:**
```
Input:  [3, 1, 3, 4, 1, 5]
Output: [3, 1, 4, 5]
```

**Example 2:**
```
Input:  [7, 7, 7]
Output: [7]
```

**Example 3:**
```
Input:  []
Output: []
```

### Constraints

- `0 <= n <= 10^5`
- Preserve first-seen order.

---

## Problem 4: Contains Duplicate

**LeetCode:** [217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

### Description

Given an `int[]` array `nums`, return `true` if any value appears at least twice, and `false` if every element is distinct. Add values to a hash set during a single scan and report a collision the moment one is found.

### Examples

**Example 1:**
```
Input:  [1, 2, 3, 1]
Output: true
```
`1` repeats.

**Example 2:**
```
Input:  [1, 2, 3, 4]
Output: false
```

**Example 3:**
```
Input:  [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output: true
```

### Constraints

- `1 <= n <= 10^5`
- Target O(n) time.

---

## Problem 5: Most Frequent Element

### Description

Given a non-empty `int[]` array, return the value that occurs most often. Break ties by returning the **smallest** such value. Tally counts in a hash map, then scan the entries for the max count (smallest value on ties).

### Examples

**Example 1:**
```
Input:  [1, 3, 3, 2, 2, 2]
Output: 2
```
`2` appears 3 times.

**Example 2:**
```
Input:  [4, 4, 5, 5]
Output: 4
```
Tie between `4` and `5`; return the smaller.

**Example 3:**
```
Input:  [9]
Output: 9
```

### Constraints

- `1 <= n <= 10^5`
- Return smallest value on a tie.

---

## Problem 6: Group By Parity Key

### Description

Given an `int[]` array, partition the values into groups keyed by a simple canonical function — here, **remainder modulo 3** (`0`, `1`, or `2`, using the non-negative remainder). Return a `Map<Integer, List<Integer>>` from each key to the list of values that map to it, in their original order. This drills the grouping-by-key pattern that generalizes to anagrams and signatures.

### Examples

**Example 1:**
```
Input:  [1, 2, 3, 4, 5, 6]
Output: {0=[3, 6], 1=[1, 4], 2=[2, 5]}
```

**Example 2:**
```
Input:  [3, 6, 9]
Output: {0=[3, 6, 9]}
```

**Example 3:**
```
Input:  []
Output: {}
```

### Constraints

- `0 <= n <= 10^5`
- Use the non-negative remainder modulo 3.

---

**Applied Problems**

## Problem 7: Valid Anagram

**LeetCode:** [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)

### Description

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s` — the same characters with the same multiplicities. Count characters of `s` in a hash map, decrement for each character of `t`, and confirm every count lands at zero (or compare two frequency maps).

### Examples

**Example 1:**
```
Input:  s = "anagram", t = "nagaram"
Output: true
```

**Example 2:**
```
Input:  s = "rat", t = "car"
Output: false
```

**Example 3:**
```
Input:  s = "ab", t = "a"
Output: false
```
Different lengths cannot be anagrams.

### Constraints

- `1 <= s.length(), t.length() <= 5 * 10^4`
- `s` and `t` consist of lowercase English letters.

---

## Problem 8: First Unique Character

**LeetCode:** [387. First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)

### Description

Given a string `s`, return the index of the **first** character that appears exactly once. If no such character exists, return `-1`. Build a frequency map in one pass, then scan left to right for the first character with count `1`.

### Examples

**Example 1:**
```
Input:  s = "leetcode"
Output: 0
```
`'l'` is the first non-repeating character.

**Example 2:**
```
Input:  s = "loveleetcode"
Output: 2
```
`'v'` is the first non-repeating character.

**Example 3:**
```
Input:  s = "aabb"
Output: -1
```

### Constraints

- `1 <= s.length() <= 10^5`
- `s` consists of lowercase English letters.

---

## Problem 9: Intersection of Two Arrays

**LeetCode:** [349. Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)

### Description

Given two `int[]` arrays `a` and `b`, return their distinct shared values in **ascending order**. Put one array's values into a hash set, test membership while scanning the other, and collect each match once.

### Examples

**Example 1:**
```
Input:  a = [1, 2, 2, 1], b = [2, 2]
Output: [2]
```

**Example 2:**
```
Input:  a = [4, 9, 5], b = [9, 4, 9, 8, 4]
Output: [4, 9]
```

**Example 3:**
```
Input:  a = [1, 2, 3], b = [4, 5, 6]
Output: []
```

### Constraints

- `0 <= a.length, b.length <= 10^4`
- Result must be sorted ascending and contain no duplicates.

---

## Problem 10: Ransom Note

**LeetCode:** [383. Ransom Note](https://leetcode.com/problems/ransom-note/)

### Description

Given two strings `ransomNote` and `magazine`, return `true` if `ransomNote` can be constructed using the letters of `magazine`, where each letter of `magazine` may be used **at most once**. Count available letters in a hash map, then spend them as you scan the note.

### Examples

**Example 1:**
```
Input:  ransomNote = "a", magazine = "b"
Output: false
```

**Example 2:**
```
Input:  ransomNote = "aa", magazine = "ab"
Output: false
```
Only one `'a'` is available.

**Example 3:**
```
Input:  ransomNote = "aa", magazine = "aab"
Output: true
```

### Constraints

- `1 <= ransomNote.length(), magazine.length() <= 10^5`
- Both consist of lowercase English letters.

---

## Problem 11: Jewels and Stones

**LeetCode:** [771. Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/)

### Description

Given a string `jewels` (each character is a distinct jewel type) and a string `stones`, return how many characters in `stones` are jewels. Load `jewels` into a hash set for O(1) membership, then count matching stones in one pass.

### Examples

**Example 1:**
```
Input:  jewels = "aA", stones = "aAAbbbb"
Output: 3
```

**Example 2:**
```
Input:  jewels = "z", stones = "ZZ"
Output: 0
```
Matching is case-sensitive.

**Example 3:**
```
Input:  jewels = "abc", stones = "aabbcc"
Output: 6
```

### Constraints

- `1 <= jewels.length(), stones.length() <= 50`
- All characters are letters; characters in `jewels` are distinct.

---

## Problem 12: Contains Duplicate II

**LeetCode:** [219. Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/)

### Description

Given an `int[]` array `nums` and an integer `k`, return `true` if there exist two indices `i` and `j` such that `nums[i] == nums[j]` and `|i - j| <= k`. Track the **last index** seen for each value in a hash map; when a value recurs, check the index gap.

### Examples

**Example 1:**
```
Input:  nums = [1, 2, 3, 1], k = 3
Output: true
```
The two `1`s are 3 apart.

**Example 2:**
```
Input:  nums = [1, 0, 1, 1], k = 1
Output: true
```

**Example 3:**
```
Input:  nums = [1, 2, 3, 1, 2, 3], k = 2
Output: false
```

### Constraints

- `1 <= n <= 10^5`
- `0 <= k <= 10^5`

---

## Problem 13: Group Anagrams

**LeetCode:** [49. Group Anagrams](https://leetcode.com/problems/group-anagrams/)

### Description

Given an array of strings `words`, group together those that are anagrams of one another. Return the number of **distinct anagram groups**. Map each word to a canonical key (its sorted characters, or a 26-letter count signature) and count distinct keys.

### Examples

**Example 1:**
```
Input:  ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: 3
```
Groups: {eat, tea, ate}, {tan, nat}, {bat}.

**Example 2:**
```
Input:  [""]
Output: 1
```

**Example 3:**
```
Input:  ["a", "b", "c"]
Output: 3
```

### Constraints

- `1 <= words.length <= 10^4`
- Words consist of lowercase English letters.

---

## Problem 14: Top K Frequent Elements

**LeetCode:** [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)

### Description

Given an `int[]` array `nums` and an integer `k`, return the `k` most frequent values in **descending order of frequency**. Break frequency ties by **smaller value first**. Tally counts in a hash map, then select the top `k` by frequency.

### Examples

**Example 1:**
```
Input:  nums = [1, 1, 1, 2, 2, 3], k = 2
Output: [1, 2]
```

**Example 2:**
```
Input:  nums = [1], k = 1
Output: [1]
```

**Example 3:**
```
Input:  nums = [4, 4, 5, 5, 6], k = 2
Output: [4, 5]
```
`4` and `5` both appear twice; ties broken by smaller value.

### Constraints

- `1 <= n <= 10^5`
- `1 <= k <= ` number of distinct values.

---

## Problem 15: Subarray Sum Equals K

**LeetCode:** [560. Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)

### Description

Given an `int[]` array `nums` and an integer `k`, return the number of contiguous subarrays whose elements sum to `k`. Maintain a running prefix sum and a hash map of **how many times each prefix-sum value has occurred**; for each position add the count of earlier prefixes equal to `prefix - k`.

### Examples

**Example 1:**
```
Input:  nums = [1, 1, 1], k = 2
Output: 2
```

**Example 2:**
```
Input:  nums = [1, 2, 3], k = 3
Output: 2
```
`[1,2]` and `[3]`.

**Example 3:**
```
Input:  nums = [1, -1, 0], k = 0
Output: 3
```

### Constraints

- `1 <= n <= 2 * 10^4`
- `-1000 <= nums[i] <= 1000`
- Values may be negative; target O(n) time.

---

## Problem 16: Longest Substring Without Repeating Characters

**LeetCode:** [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

### Description

Given a string `s`, return the length of the longest substring that contains **no repeated character**. Use a sliding window with a hash map from character to its last seen index; when a repeat falls inside the window, jump the left boundary past the previous occurrence.

### Examples

**Example 1:**
```
Input:  s = "abcabcbb"
Output: 3
```
The answer is `"abc"`.

**Example 2:**
```
Input:  s = "bbbbb"
Output: 1
```

**Example 3:**
```
Input:  s = "pwwkew"
Output: 3
```
The answer is `"wke"`.

### Constraints

- `0 <= s.length() <= 5 * 10^4`
- `s` consists of printable ASCII characters.

---

## Problem 17: Longest Consecutive Sequence

**LeetCode:** [128. Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/)

### Description

Given an unsorted `int[]` array, return the length of the longest run of consecutive integers. Put all values in a hash set; start a count only at values that are the **start of a run** (`x - 1` absent), then walk upward. This achieves O(n) without sorting.

### Examples

**Example 1:**
```
Input:  [100, 4, 200, 1, 3, 2]
Output: 4
```
The run `1, 2, 3, 4` has length 4.

**Example 2:**
```
Input:  [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]
Output: 9
```

**Example 3:**
```
Input:  []
Output: 0
```

### Constraints

- `0 <= n <= 10^5`
- Target O(n) time.

---

## Problem 18: Lone Odd-Count Code

### Description

The Codyssi quartermaster scans each crate's part code at the dock and again in the vault. Across both combined logs every part code appears an **even** number of times except one, which appears an **odd** number of times. Given the combined `int[]` log, return that lone odd-count code. Tally counts in a hash map (or toggle a set's membership) and return the code whose count is odd.

### Examples

**Example 1:**
```
Input:  [4, 1, 2, 1, 2]
Output: 4
```

**Example 2:**
```
Input:  [7, 7, 9]
Output: 9
```

**Example 3:**
```
Input:  [5]
Output: 5
```

### Constraints

- `1 <= n <= 10^6`, `n` is odd.
- Codes lie in `1..1_000_000`; exactly one code has an odd count.

---

## Problem 19: Elf Gift Pairing

### Description

Each Advent elf has a joy value; two elves can pair if their joy values differ by exactly `d`. Given an `int[]` array of joy values and `d`, return the number of **distinct unordered value pairs** `(a, b)` with `a < b`, `b - a == d`, and both `a` and `b` present in the array. Count value pairs, not index pairs. Put the distinct values in a hash set, then for each distinct value `a` check whether `a + d` is present.

### Examples

**Example 1:**
```
Input:  values = [1, 5, 3, 4, 2], d = 2
Output: 3
```
Pairs: `(1,3)`, `(2,4)`, `(3,5)`.

**Example 2:**
```
Input:  values = [8, 12, 16, 4, 0, 0], d = 4
Output: 4
```
Duplicates do not create extra value pairs.

**Example 3:**
```
Input:  values = [1, 2, 3], d = 5
Output: 0
```

### Constraints

- `1 <= n <= 10^5`
- `d >= 1`; the array may contain duplicates.

---

## Problem 20: Handle Team Signatures

### Description

Group Codeforces handles by **signature** — the case-insensitive multiset of their letters, ignoring digits and any non-letter characters. Handles with identical signatures share a team. Given a `String[]` of handles, return the size of the largest team, or `0` if there are no handles. Build a canonical key per handle (e.g. a 26-letter count string) and count group sizes in a hash map.

### Examples

**Example 1:**
```
Input:  ["abc", "CAB", "bca1", "xyz"]
Output: 3
```
`abc`, `CAB`, `bca1` all reduce to signature `{a,b,c}`.

**Example 2:**
```
Input:  ["a1", "A2", "b"]
Output: 2
```
`a1` and `A2` both reduce to `{a}`.

**Example 3:**
```
Input:  []
Output: 0
```

### Constraints

- `0 <= n <= 10^4`
- Signatures ignore case, digits, and non-letter characters.

---

## Problem 21: Balanced Ledger Window

### Description

The Codyssi treasury logs daily net coin changes (positive or negative) in an `int[]`. Return the length of the **longest contiguous range of days** whose values sum to exactly zero, or `0` if no such range exists. Track running prefix sums in a hash map from sum value to its **earliest index**; a repeated prefix sum marks a zero-sum range between the two positions.

### Examples

**Example 1:**
```
Input:  [3, -3, 1, 1, -2]
Output: 2
```
The range `[3, -3]` sums to 0 (length 2).

**Example 2:**
```
Input:  [1, 2, -3, 3, -3]
Output: 5
```
The whole array sums to 0.

**Example 3:**
```
Input:  [1, 2, 3]
Output: 0
```

### Constraints

- `1 <= n <= 10^5`
- Values may be negative; the log is non-null.

---

## Problem 22: Stable Rune Lines

### Description

Each scroll line is a stream of rune characters. A line is **stable** if, after counting each distinct rune's occurrences, every nonzero count is **unique** — no two distinct runes share a count. Given a `String[]` of lines, return how many lines are stable. Build a frequency map per line, then check that its count values have no duplicates (a set of counts whose size equals the number of distinct runes).

### Examples

**Example 1:**
```
Input:  ["aabbb", "abc", "aabb"]
Output: 1
```
`"aabbb"` has counts {2,3} (unique) — stable. `"abc"` has counts {1,1,1} (collision) — unstable. `"aabb"` has counts {2,2} (collision) — unstable.

**Example 2:**
```
Input:  ["a", "aabbb", "xxyyyzz"]
Output: 2
```
`"a"` has counts {1}; `"aabbb"` has {2,3} — both unique. `"xxyyyzz"` has {2,3,2} (collision) — unstable.

**Example 3:**
```
Input:  []
Output: 0
```

### Constraints

- `0 <= n <= 10^4`
- A single-rune line is always stable.

---

## Problem 23: Submission Verdict Streak

### Description

Replay a stream of submitted problem ids as an `int[]`. Return the length of the **longest contiguous run** of submissions in which no problem id repeats. Use a sliding window with a hash map from id to last seen index; advance the left boundary past any repeat to keep the window distinct.

### Examples

**Example 1:**
```
Input:  [1, 2, 3, 2, 5]
Output: 3
```
`[1, 2, 3]` and `[3, 2, 5]` are length-3 windows with distinct ids.

**Example 2:**
```
Input:  [7, 7, 7]
Output: 1
```

**Example 3:**
```
Input:  [1, 2, 3, 4]
Output: 4
```

### Constraints

- `1 <= n <= 10^5`
- The stream is non-null.

---

## Problem 24: LRU Cache

**LeetCode:** [146. LRU Cache](https://leetcode.com/problems/lru-cache/)

### Description

Implement a fixed-capacity LRU (least-recently-used) cache supporting two operations in O(1) expected time: `get(key)` returns the value for `key` or `-1` if absent (and marks it most-recently used), and `put(key, value)` inserts or updates the entry (marking it most-recently used), evicting the least-recently-used entry when capacity is exceeded. Combine a hash map with a doubly linked list (or a `LinkedHashMap` in access order).

### Examples

**Example 1:**
```
Input:  capacity = 2
        put(1, 1); put(2, 2); get(1); put(3, 3); get(2); put(4, 4); get(1); get(3); get(4)
Output: get(1)=1, get(2)=-1, get(1)=-1, get(3)=3, get(4)=4
```
`put(3,3)` evicts key 2; `put(4,4)` evicts key 1.

**Example 2:**
```
Input:  capacity = 1
        put(1, 1); put(2, 2); get(1); get(2)
Output: get(1)=-1, get(2)=2
```

**Example 3:**
```
Input:  capacity = 2
        put(1, 10); put(1, 20); get(1)
Output: get(1)=20
```
Updating an existing key overwrites its value.

### Constraints

- `1 <= capacity <= 3000`
- `get` and `put` must run in O(1) expected time.

---
