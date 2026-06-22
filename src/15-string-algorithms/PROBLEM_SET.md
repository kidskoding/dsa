# String Algorithms: Problem Set

Drill the core string-processing techniques — brute-force and linear-time pattern matching (KMP prefix function, Z-array), polynomial rolling hashes, periodicity, palindromes, and anagram sliding windows. **Foundational** problems build the primitives you should be able to write cold; **Applied Problems** weave interview-style (LeetCode) and competitive-programming-style (Codeforces / Advent of Code / Codyssi) challenges, roughly easy to hard.

**Foundational**

## Problem 1: Naive Matcher

### Description

Given a `text` and a `pattern`, return every 0-based start index where `pattern` occurs in `text`, in ascending order, using the brute-force `O(nm)` scan that tries each alignment and compares character by character. Overlapping matches are reported. An empty pattern matches at every index `0..text.length()` inclusive.

### Examples

**Example 1:**
```
Input:  text = "ABABDABACDABABCABAB", pattern = "ABAB"
Output: [0, 9, 12]
```
The pattern aligns at indices 0, 9, and 12.

**Example 2:**
```
Input:  text = "aaaaaa", pattern = "aaa"
Output: [0, 1, 2, 3]
```
Overlapping matches are each reported.

**Example 3:**
```
Input:  text = "abcde", pattern = "xyz"
Output: []
```

### Constraints

- `0 <= text.length(), pattern.length() <= 2000`
- An empty pattern matches at indices `0..text.length()` inclusive.

---

## Problem 2: Prefix Function

### Description

Compute the KMP **prefix (failure) function** of a string `s`. Return an `int[]` `pi` of length `s.length()` where `pi[i]` is the length of the longest proper prefix of `s[0..i]` (inclusive) that is also a suffix of `s[0..i]`. "Proper" means the prefix is shorter than the substring itself. Build it in `O(n)` time.

### Examples

**Example 1:**
```
Input:  s = "ababaca"
Output: [0, 0, 1, 2, 3, 0, 1]
```
At index 4 (`"ababa"`), the longest proper prefix that is also a suffix is `"aba"`, length 3.

**Example 2:**
```
Input:  s = "aaaa"
Output: [0, 1, 2, 3]
```

**Example 3:**
```
Input:  s = "abcabcd"
Output: [0, 0, 0, 1, 2, 3, 0]
```

### Constraints

- `1 <= s.length() <= 10^5`

---

## Problem 3: Z-Array

### Description

Compute the **Z-array** of a string `s`. Return an `int[]` `z` of length `s.length()` where `z[i]` is the length of the longest substring starting at `i` that matches a prefix of `s`. By convention `z[0]` is `0`. Build it in `O(n)` time using the Z-box (the rightmost match interval seen so far).

### Examples

**Example 1:**
```
Input:  s = "aabxaabxcaabxaabxay"
Output: [0, 1, 0, 0, 4, 1, 0, 0, 0, 8, 1, 0, 0, 5, 1, 0, 0, 1, 0]
```
At index 9 the prefix `"aabxaabx"` (length 8) reappears.

**Example 2:**
```
Input:  s = "aaaaa"
Output: [0, 4, 3, 2, 1]
```

**Example 3:**
```
Input:  s = "abacaba"
Output: [0, 0, 1, 0, 3, 0, 1]
```

### Constraints

- `1 <= s.length() <= 10^5`

---

## Problem 4: Rolling Hash

### Description

Compute the polynomial **rolling hash** of a string `s` under a given `base` (radix) and `mod` (modulus), evaluated in Horner form. The hash is `((s[0] * base + s[1]) * base + s[2]) * base + ... + s[n-1]) mod mod`, where each character contributes its `int` code point. Return the result as a non-negative `long` in `[0, mod)`.

### Examples

**Example 1:**
```
Input:  s = "abc", base = 256, mod = 1000000007
Output: 6382179
```
`('a'*256 + 'b')*256 + 'c' = (97*256 + 98)*256 + 99 = 6382179`.

**Example 2:**
```
Input:  s = "a", base = 31, mod = 1000000007
Output: 97
```

**Example 3:**
```
Input:  s = "", base = 31, mod = 1000000007
Output: 0
```

### Constraints

- `0 <= s.length() <= 10^5`
- `2 <= base <= 10^6`
- `2 <= mod <= 2 * 10^9`

---

## Problem 5: Count Occurrences

### Description

Return the number of (possibly overlapping) occurrences of `pattern` in `text` using any linear-time matcher (KMP or Z). An empty pattern occurs `text.length() + 1` times. Run in `O(n + m)` time.

### Examples

**Example 1:**
```
Input:  text = "abababab", pattern = "abab"
Output: 3
```
Matches start at indices 0, 2, and 4.

**Example 2:**
```
Input:  text = "aaaaa", pattern = "aa"
Output: 4
```

**Example 3:**
```
Input:  text = "abcde", pattern = ""
Output: 6
```

### Constraints

- `0 <= text.length(), pattern.length() <= 10^5`
- An empty pattern occurs `text.length() + 1` times.

---

**Applied Problems**

## Problem 6: Implement strStr

**LeetCode:** [28. Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

### Description

Return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`. An empty `needle` matches at index `0`.

### Examples

**Example 1:**
```
Input:  haystack = "sadbutsad", needle = "sad"
Output: 0
```
`"sad"` occurs at index 0 and 6; the first is index 0.

**Example 2:**
```
Input:  haystack = "leetcode", needle = "leeto"
Output: -1
```

**Example 3:**
```
Input:  haystack = "hello", needle = ""
Output: 0
```

### Constraints

- `1 <= haystack.length(), needle.length() <= 10^4` (an empty `needle` is also accepted and returns 0)
- `haystack` and `needle` consist of only lowercase English characters.

---

## Problem 7: Valid Anagram

**LeetCode:** [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)

### Description

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise. An anagram uses exactly the same multiset of characters. Strings of different length can never be anagrams.

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
Different lengths.

### Constraints

- `1 <= s.length(), t.length() <= 5 * 10^4`
- `s` and `t` consist of lowercase English letters.

---

## Problem 8: Repeated Substring Pattern

**LeetCode:** [459. Repeated Substring Pattern](https://leetcode.com/problems/repeated-substring-pattern/)

### Description

Given a string `s`, return `true` if it can be constructed by taking some proper substring of it and appending multiple copies of that substring together. The substring must be strictly shorter than `s`.

### Examples

**Example 1:**
```
Input:  s = "abab"
Output: true
```
`"ab"` repeated twice.

**Example 2:**
```
Input:  s = "aba"
Output: false
```

**Example 3:**
```
Input:  s = "abcabcabcabc"
Output: true
```
`"abc"` repeated four times (also `"abcabc"` twice).

### Constraints

- `1 <= s.length() <= 10^4`
- `s` consists of lowercase English letters.

---

## Problem 9: Longest Happy Prefix

**LeetCode:** [1392. Longest Happy Prefix](https://leetcode.com/problems/longest-happy-prefix/)

### Description

A string is a **happy prefix** if it is a non-empty prefix that is also a proper suffix (excluding the whole string). Given a string `s`, return the longest happy prefix of `s`. Return the empty string `""` if no such prefix exists. Use the prefix function so it runs in `O(n)`.

### Examples

**Example 1:**
```
Input:  s = "level"
Output: "l"
```
The longest prefix that is also a proper suffix is `"l"`.

**Example 2:**
```
Input:  s = "ababab"
Output: "abab"
```

**Example 3:**
```
Input:  s = "abcd"
Output: ""
```

### Constraints

- `1 <= s.length() <= 10^5`
- `s` contains only lowercase English letters.

---

## Problem 10: Find All Anagrams in a String

**LeetCode:** [438. Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)

### Description

Given two strings `s` and `p`, return an ascending list of all the start indices of `p`'s anagrams in `s`. An anagram is a rearrangement using the same multiset of letters. Use a fixed-width sliding window of character counts so the scan is `O(n)`. If `p` is longer than `s`, return an empty list.

### Examples

**Example 1:**
```
Input:  s = "cbaebabacd", p = "abc"
Output: [0, 6]
```
Window `"cba"` at index 0 and `"bac"` at index 6 are anagrams of `"abc"`.

**Example 2:**
```
Input:  s = "abab", p = "ab"
Output: [0, 1, 2]
```

**Example 3:**
```
Input:  s = "af", p = "be"
Output: []
```

### Constraints

- `1 <= s.length(), p.length() <= 3 * 10^4`
- `s` and `p` consist of lowercase English letters.

---

## Problem 11: Repeated DNA Sequences

**LeetCode:** [187. Repeated DNA Sequences](https://leetcode.com/problems/repeated-dna-sequences/)

### Description

The DNA sequence is composed of a series of nucleotides abbreviated as `'A'`, `'C'`, `'G'`, and `'T'`. Given a string `s` representing a DNA sequence, return all the **10-letter-long** substrings (substrings of length 10) that occur **more than once** in the DNA molecule. You may return the answer in any order.

### Examples

**Example 1:**
```
Input:  s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC", "CCCCCAAAAA"]
```

**Example 2:**
```
Input:  s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"]
```

**Example 3:**
```
Input:  s = "ACGT"
Output: []
```
Shorter than 10.

### Constraints

- `1 <= s.length() <= 10^5`
- `s[i]` is either `'A'`, `'C'`, `'G'`, or `'T'`.

---

## Problem 12: Valid Palindrome II

**LeetCode:** [680. Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/)

### Description

Given a string `s`, return `true` if `s` can be a palindrome after deleting **at most one** character from it. A string that is already a palindrome qualifies (zero deletions). Solve it in `O(n)` with two pointers.

### Examples

**Example 1:**
```
Input:  s = "aba"
Output: true
```
Already a palindrome.

**Example 2:**
```
Input:  s = "abca"
Output: true
```
Delete `'c'` (or `'b'`) to get a palindrome.

**Example 3:**
```
Input:  s = "abc"
Output: false
```

### Constraints

- `1 <= s.length() <= 10^5`
- `s` consists of lowercase English letters.

---

## Problem 13: Longest Palindromic Substring

**LeetCode:** [5. Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)

### Description

Given a string `s`, return the longest substring of `s` that reads the same forwards and backwards. If several have the maximum length, return any one of them. Expand around each center (both odd and even) for an `O(n^2)` solution.

### Examples

**Example 1:**
```
Input:  s = "babad"
Output: "bab"
```
`"aba"` is also a valid answer.

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

- `1 <= s.length() <= 1000`
- `s` consists of only digits and English letters.

---

## Problem 14: Group Anagrams

**LeetCode:** [49. Group Anagrams](https://leetcode.com/problems/group-anagrams/)

### Description

Given an array of strings `strs`, group the anagrams together and return the groups. Two strings are anagrams when one is a rearrangement of the other's letters. Within each group, preserve the original input order; the groups themselves should appear in the order their first member was encountered. Return the result as a `String[][]`.

### Examples

**Example 1:**
```
Input:  strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
```

**Example 2:**
```
Input:  strs = [""]
Output: [[""]]
```

**Example 3:**
```
Input:  strs = ["a"]
Output: [["a"]]
```

### Constraints

- `1 <= strs.length <= 10^4`
- `0 <= strs[i].length <= 100`
- `strs[i]` consists of lowercase English letters.

---

## Problem 15: Shortest Period

### Description

Given a non-empty string `s`, return the length of its **shortest period**: the smallest `p` such that `s` is a prefix of an infinite repetition of `s[0..p)`. Equivalently, `p = n - pi[n-1]` where `pi` is the prefix function and `n = s.length()`. If `s` has no shorter period it returns `n`. Run in `O(n)`.

### Examples

**Example 1:**
```
Input:  s = "abcabcab"
Output: 3
```
`"abc"` repeated covers `s` (the last copy is partial).

**Example 2:**
```
Input:  s = "aaaa"
Output: 1
```

**Example 3:**
```
Input:  s = "abcd"
Output: 4
```
No proper period.

### Constraints

- `1 <= s.length() <= 2 * 10^5`
- `s` consists of printable ASCII characters.

---

## Problem 16: Conveyor Tiling

### Description

A factory belt named "Helix" is printed by repeating a tile of glyphs end to end. Given the belt string `s`, return the length of the **shortest** block that, repeated a **whole number of times**, reproduces the belt exactly. If no proper tile divides the belt evenly, return the belt's length `s.length()`. This is the smallest period that also divides `n`.

### Examples

**Example 1:**
```
Input:  s = "abcabcabc"
Output: 3
```
`"abc"` repeated three times.

**Example 2:**
```
Input:  s = "ababab"
Output: 2
```

**Example 3:**
```
Input:  s = "abcab"
Output: 5
```
No proper tile divides length 5 evenly.

### Constraints

- `1 <= s.length() <= 2 * 10^5`
- `s` consists of printable ASCII characters.

---

## Problem 17: Mirror Lock

### Description

The vault "Specula" opens when its code reads the same forwards and backwards after deleting **at most one** character. Given the code string `s`, return `true` if it is already a palindrome or can become one by removing exactly one character; otherwise return `false`. Solve in `O(n)` with two pointers.

### Examples

**Example 1:**
```
Input:  s = "deeee"
Output: true
```
Delete `'d'` to get `"eeee"`.

**Example 2:**
```
Input:  s = "racecar"
Output: true
```
Already a palindrome.

**Example 3:**
```
Input:  s = "abcdef"
Output: false
```

### Constraints

- `1 <= s.length() <= 10^5`
- `s` consists of lowercase English letters.

---

## Problem 18: Border Patrol

### Description

Two checkpoints share a fence string `s`. A **seam** is a non-empty proper prefix of `s` that is also a suffix of `s` (a border). Return the **longest** seam as a substring, or the empty string `""` when none exists. Use the prefix function so the answer is read off in `O(n)` without re-scanning.

### Examples

**Example 1:**
```
Input:  s = "abacaba"
Output: "aba"
```
`"aba"` is both a prefix and a suffix.

**Example 2:**
```
Input:  s = "aaaa"
Output: "aaa"
```

**Example 3:**
```
Input:  s = "abcd"
Output: ""
```

### Constraints

- `1 <= s.length() <= 2 * 10^5`
- `s` consists of printable ASCII characters.

---

## Problem 19: Pattern in Cyclic Rotations

### Description

A rotating drum prints a text `text`; a sensor must decide whether a `pattern` appears in **any** rotation of the text. A rotation by `k` moves the first `k` characters to the end (wrapping around). Return `true` if `pattern` occurs as a contiguous substring of some rotation of `text`, else `false`. The trick: every rotation's substrings of length `|pattern|` appear in `text + text`, so match `pattern` against the doubled text in linear time. The pattern must be no longer than the text to fit in a single rotation.

### Examples

**Example 1:**
```
Input:  text = "abcde", pattern = "deab"
Output: true
```
The rotation `"deabc"` contains `"deab"`.

**Example 2:**
```
Input:  text = "abcde", pattern = "fgh"
Output: false
```

**Example 3:**
```
Input:  text = "aaaa", pattern = "aaaa"
Output: true
```

### Constraints

- `1 <= text.length() <= 2 * 10^5`
- `1 <= pattern.length() <= text.length()`
- Both strings consist of printable ASCII characters.

---

## Problem 20: Carousel Decoder

### Description

A rotating billboard "Carousel" shows some cyclic rotation of its marquee `s`. A rotation by offset `k` (for `0 <= k < n`) is `s[k..n) + s[0..k)`. Given the marquee `s` and a `prefix`, return the number of rotation offsets `k` in `[0, n)` whose rotation **starts with** `prefix`. If `prefix` is longer than the marquee, the answer is `0`. Aim for linear time by searching for `prefix` inside `s + s` (a match starting at index `k < n` means rotation `k` begins with `prefix`).

### Examples

**Example 1:**
```
Input:  s = "ababab", prefix = "ab"
Output: 3
```
Rotations starting at offsets 0, 2, 4 begin with `"ab"`.

**Example 2:**
```
Input:  s = "abcde", prefix = "cd"
Output: 1
```
Only the rotation `"cdeab"` starts with `"cd"`.

**Example 3:**
```
Input:  s = "abc", prefix = "abcd"
Output: 0
```
Prefix longer than the marquee.

### Constraints

- `1 <= s.length() <= 2 * 10^5`
- `1 <= prefix.length()`
- Both strings consist of printable ASCII characters.

---
