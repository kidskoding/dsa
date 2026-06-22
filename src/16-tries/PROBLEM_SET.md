# Tries: Problem Set

A trie (prefix tree) turns a dictionary of strings into a branching map of
shared prefixes, so that every insert, lookup, and prefix query costs time
proportional to the length of the key rather than the size of the dictionary.
This set works that idea from the ground up: the **Foundational** problems build
the core trie operations — insert, search, prefix existence, prefix counting,
and deletion. The **Applied Problems** then put the structure to work on real
dictionary tasks: autocomplete and search suggestions, word break and
segmentation, root replacement, weighted prefix sums, wildcard matching, and
binary tries for maximum-XOR queries. They run from easy to hard and mix
LeetCode classics with self-contained contest-style scenarios.

Each problem is an implementation task: fill in the stub in `problemset/` and
make its test in `tests/problemset/` pass. A shared `TrieNode` helper is
available by simple name if you want a ready-made node type, but you are free to
build your own. Every solution method takes its input as a `String[]` so the
harness can drive it uniformly.

**Foundational**

## Problem 1: Insert and Search Keys

### Description
Build a trie that supports two operations and answers a batch of them in order.
You are given a list of `operations`, each a string of the form `"insert word"`
or `"search word"`. An `insert` adds `word` to the dictionary as a complete key.
A `search` reports whether `word` is present as a *complete* inserted key — a
strict prefix of some key does not count.

Process the operations left to right and return, for each `search` operation
(in order), the string `"true"` or `"false"`. `insert` operations produce no
output.

Each lookup and insert must run in `O(L)` time for a word of length `L`.

### Examples
**Example 1:**
```
Input:  ["insert apple", "search apple", "search app"]
Output: ["true", "false"]
```
`apple` is a complete key, so it is found. `app` is only a prefix of `apple`,
not a key, so the search reports `false`.

**Example 2:**
```
Input:  ["search ghost", "insert ghost", "search ghost"]
Output: ["false", "true"]
```
The first search precedes the insert, so the key is absent.

**Example 3:**
```
Input:  ["insert cat", "insert cat", "search cat"]
Output: ["true"]
```
Inserting the same key twice still leaves a single findable key.

### Constraints
- `1 <= operations.length <= 10^4`
- Each operation is `"insert <word>"` or `"search <word>"`.
- `1 <= word.length <= 50`, words contain only lowercase English letters.

---

## Problem 2: Prefix Existence

### Description
Extend the trie with a prefix query. You are given a list of `operations`, each
either `"insert word"` or `"prefix p"`. An `insert` adds `word` to the
dictionary. A `prefix` query reports whether *any* inserted key begins with `p`
(the prefix itself need not be a complete key).

Process the operations in order and return, for each `prefix` query, `"true"` or
`"false"`. Each query must run in `O(L)` time for a prefix of length `L`.

### Examples
**Example 1:**
```
Input:  ["insert apple", "prefix app", "prefix apx"]
Output: ["true", "false"]
```
`app` is a prefix of `apple`, so the first query is true. No key starts with
`apx`.

**Example 2:**
```
Input:  ["insert dog", "prefix dog", "prefix do"]
Output: ["true", "true"]
```
A complete key also counts as a prefix of itself, and `do` is a proper prefix.

**Example 3:**
```
Input:  ["prefix a", "insert ant", "prefix a"]
Output: ["false", "true"]
```
Before any insert no prefix exists; after inserting `ant` the prefix `a` is
present.

### Constraints
- `1 <= operations.length <= 10^4`
- Each operation is `"insert <word>"` or `"prefix <p>"`.
- `1 <= word.length, p.length <= 50`, lowercase English letters only.

---

## Problem 3: Count Keys With a Prefix

### Description
Maintain a trie that can report how many inserted keys share a given prefix. You
are given a list of `operations`, each `"insert word"` or `"count p"`. Each
`count` query returns the number of inserted keys (counting duplicates) that
begin with `p`.

Process the operations in order and return, for each `count` query, the count as
a string. Aim for `O(L)` per query by maintaining a passthrough count on each
trie node.

### Examples
**Example 1:**
```
Input:  ["insert app", "insert apple", "insert apricot", "count ap"]
Output: ["3"]
```
All three keys begin with `ap`.

**Example 2:**
```
Input:  ["insert app", "insert apple", "count app", "count appl"]
Output: ["2", "1"]
```
Two keys start with `app`; only `apple` starts with `appl`.

**Example 3:**
```
Input:  ["insert cat", "insert cat", "count cat", "count dog"]
Output: ["2", "0"]
```
Duplicates are counted; no key starts with `dog`.

### Constraints
- `1 <= operations.length <= 10^4`
- Each operation is `"insert <word>"` or `"count <p>"`.
- `1 <= word.length, p.length <= 50`, lowercase English letters only.

---

## Problem 4: Delete a Key

### Description
Support deletion from a trie. You are given a list of `operations`, each
`"insert word"`, `"delete word"`, or `"search word"`. A `delete` removes `word`
if it is a complete key and prunes any node that becomes both childless and
non-terminal; if `word` is not a present key, the delete has no effect. A
`search` reports whether `word` is currently a complete key.

Process the operations in order and return, for each `search`, `"true"` or
`"false"`.

### Examples
**Example 1:**
```
Input:  ["insert apple", "delete apple", "search apple"]
Output: ["false"]
```
After deletion the key is gone.

**Example 2:**
```
Input:  ["insert app", "insert apple", "delete apple", "search app"]
Output: ["true"]
```
Deleting `apple` must not remove `app`, which shares the `app` prefix.

**Example 3:**
```
Input:  ["insert cat", "delete dog", "search cat"]
Output: ["true"]
```
Deleting a missing key leaves the trie unchanged.

### Constraints
- `1 <= operations.length <= 10^4`
- Each operation is `"insert <word>"`, `"delete <word>"`, or `"search <word>"`.
- `1 <= word.length <= 50`, lowercase English letters only.

---

## Problem 5: Longest Common Prefix

**LeetCode:** [14. Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)

### Description
Given an array `words` of strings, return the longest prefix shared by *every*
string. If the strings share no common prefix, return the empty string `""`.

Solve it by inserting all words into a trie and descending from the root while
exactly one child exists and the current node is not the end of a shorter word.

### Examples
**Example 1:**
```
Input:  ["flower", "flow", "flight"]
Output: "fl"
```
All three share `fl`; they diverge at the next character.

**Example 2:**
```
Input:  ["dog", "racecar", "car"]
Output: ""
```
No common starting character, so the answer is the empty string.

**Example 3:**
```
Input:  ["interspecies", "interstellar", "interstate"]
Output: "inters"
```

### Constraints
- `1 <= words.length <= 200`
- `0 <= words[i].length <= 200`
- `words[i]` consists of lowercase English letters.

---

**Applied Problems**

## Problem 6: Implement Trie (Prefix Tree)

**LeetCode:** [208. Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/)

### Description
Implement a full trie driven by a command stream. You are given a list of
`operations`, each `"insert word"`, `"search word"`, or `"startsWith prefix"`.
`insert` adds a key; `search` returns whether `word` is a complete key;
`startsWith` returns whether any key has the given prefix.

Process the operations in order and return, for each `search` and `startsWith`
(in order), `"true"` or `"false"`. `insert` produces no output.

### Examples
**Example 1:**
```
Input:  ["insert apple", "search apple", "search app", "startsWith app", "insert app", "search app"]
Output: ["true", "false", "true", "true"]
```
`apple` is found; `app` is not yet a key but is a prefix; after inserting `app`
it is found.

**Example 2:**
```
Input:  ["startsWith a", "insert a", "search a", "startsWith a"]
Output: ["false", "true", "true"]
```

**Example 3:**
```
Input:  ["insert trie", "startsWith tri", "search tri"]
Output: ["true", "false"]
```

### Constraints
- `1 <= operations.length <= 3 * 10^4`
- Each operation is `"insert <word>"`, `"search <word>"`, or `"startsWith <prefix>"`.
- `1 <= word.length, prefix.length <= 2000`, lowercase English letters only.

---

## Problem 7: Search Suggestions System

**LeetCode:** [1268. Search Suggestions System](https://leetcode.com/problems/search-suggestions-system/)

### Description
You are given a `String[]` whose first element is a search `word` and whose
remaining elements are the catalogue of `products`. As the user types `word`
character by character, return, after each character, up to three
lexicographically smallest products that have the typed prefix.

Return the suggestions as a flat `String[]`: for the i-th typed prefix
(`1 <= i <= word.length`), emit a single string that joins its (up to three)
suggestions with a comma, or the empty string if there are none. The result has
`word.length` entries, in typing order.

### Examples
**Example 1:**
```
Input:  ["mouse", "mobile", "mouse", "moneypot", "monitor", "mousepad"]
Output: ["mobile,moneypot,monitor", "mobile,moneypot,monitor", "mouse,mousepad", "mouse,mousepad", "mouse,mousepad"]
```
For prefixes `m` and `mo` the three smallest are `mobile, moneypot, monitor`;
once `mou` is typed only `mouse` and `mousepad` qualify.

**Example 2:**
```
Input:  ["havana", "havana"]
Output: ["havana", "havana", "havana", "havana", "havana", "havana"]
```
The single product matches every prefix of the search word.

**Example 3:**
```
Input:  ["bags", "bags", "baggage", "banner", "box"]
Output: ["baggage,bags,banner", "baggage,bags,banner", "baggage,bags", "bags"]
```

### Constraints
- The first element is the search word; the rest are products.
- `1 <= products.length <= 1000`
- `1 <= word.length, products[i].length <= 3000`
- All strings consist of lowercase English letters.

---

## Problem 8: Replace Words With Roots

**LeetCode:** [648. Replace Words](https://leetcode.com/problems/replace-words/)

### Description
You are given a `String[]` whose first element is a `sentence` of
space-separated words and whose remaining elements are dictionary `roots`. For
every word in the sentence, if one or more roots is a prefix of it, replace the
word with the *shortest* such root; otherwise leave the word unchanged.

Return the rewritten sentence as a single string with words separated by single
spaces.

### Examples
**Example 1:**
```
Input:  ["the cattle was rattled by the battery", "cat", "bat", "rat"]
Output: "the cat was rat by the bat"
```
`cattle` -> `cat`, `rattled` -> `rat`, `battery` -> `bat`; other words have no
root prefix.

**Example 2:**
```
Input:  ["a aa a aaaa aaa", "a", "b", "c"]
Output: "a a a a a"
```
The root `a` is a prefix of every token, and it is the shortest match.

**Example 3:**
```
Input:  ["hello world", "xyz"]
Output: "hello world"
```
No root is a prefix of any word, so the sentence is unchanged.

### Constraints
- The first element is the sentence; the rest are roots.
- `1 <= roots.length <= 1000`, `1 <= roots[i].length <= 100`
- `1 <= sentence words <= 1000`, each word `1 <= length <= 1000`
- All strings consist of lowercase English letters and single spaces.

---

## Problem 9: Map Sum Pairs

**LeetCode:** [677. Map Sum Pairs](https://leetcode.com/problems/map-sum-pairs/)

### Description
Implement a key-value store with prefix sums, driven by a command stream. You
are given a list of `operations`, each `"insert key val"` (set or overwrite the
integer value of `key`) or `"sum prefix"` (return the sum of values over all
stored keys that begin with `prefix`).

Process the operations in order and return, for each `sum` query, the total as a
string.

### Examples
**Example 1:**
```
Input:  ["insert apple 3", "sum ap", "insert app 2", "sum ap"]
Output: ["3", "5"]
```
After inserting `apple=3`, `ap` sums to 3; adding `app=2` raises the `ap` sum to
5.

**Example 2:**
```
Input:  ["insert apple 3", "insert apple 2", "sum app"]
Output: ["2"]
```
Re-inserting `apple` overwrites its value, so the sum uses 2, not 5.

**Example 3:**
```
Input:  ["insert a 5", "insert b 7", "sum a", "sum c"]
Output: ["5", "0"]
```

### Constraints
- `1 <= operations.length <= 5 * 10^4`
- Each operation is `"insert <key> <val>"` or `"sum <prefix>"`.
- `1 <= key.length, prefix.length <= 50`, lowercase English letters only.
- `0 <= val <= 1000`.

---

## Problem 10: Longest Word in Dictionary

**LeetCode:** [720. Longest Word in Dictionary](https://leetcode.com/problems/longest-word-in-dictionary/)

### Description
Given an array `words`, return the longest word that can be built one character
at a time, where every intermediate prefix of the word is itself present in
`words`. If several words are equally long, return the lexicographically smallest
one. If no word qualifies, return the empty string `""`.

Insert the words into a trie and find the deepest node reachable along a path
whose every node is a terminal key.

### Examples
**Example 1:**
```
Input:  ["w", "wo", "wor", "worl", "world"]
Output: "world"
```
Each prefix `w`, `wo`, `wor`, `worl` is present, so `world` is buildable.

**Example 2:**
```
Input:  ["a", "banana", "app", "appl", "ap", "apply", "apple"]
Output: "apple"
```
Both `apple` and `apply` are buildable and length 5; `apple` is
lexicographically smaller. `banana` fails because `b`, `ba`, ... are absent.

**Example 3:**
```
Input:  ["yo", "ew", "fc", "zsl", "y"]
Output: "yo"
```
`yo` is buildable (because `y` exists); `ew`, `fc`, `zsl` are not.

### Constraints
- `1 <= words.length <= 1000`
- `1 <= words[i].length <= 30`
- `words[i]` consists of lowercase English letters.

---

## Problem 11: Word Break

**LeetCode:** [139. Word Break](https://leetcode.com/problems/word-break/)

### Description
You are given a `String[]` whose first element is the target string `s` and
whose remaining elements form the dictionary `wordDict`. Determine whether `s`
can be segmented into a space-separated sequence of one or more dictionary words.
A dictionary word may be reused any number of times.

Store the dictionary in a trie and run a memoised left-to-right scan that follows
trie edges to find candidate word boundaries. Return `"true"` or `"false"`.

### Examples
**Example 1:**
```
Input:  ["leetcode", "leet", "code"]
Output: "true"
```
`leetcode` splits as `leet` + `code`.

**Example 2:**
```
Input:  ["applepenapple", "apple", "pen"]
Output: "true"
```
Splits as `apple` + `pen` + `apple`; `apple` is reused.

**Example 3:**
```
Input:  ["catsandog", "cats", "dog", "sand", "and", "cat"]
Output: "false"
```
No segmentation covers the whole string.

### Constraints
- The first element is `s`; the rest are dictionary words.
- `1 <= s.length <= 300`
- `1 <= wordDict.length <= 1000`, `1 <= wordDict[i].length <= 20`
- All strings consist of lowercase English letters.

---

## Problem 12: Add and Search Word (Wildcard `.`)

**LeetCode:** [211. Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/)

### Description
Implement a word dictionary that supports wildcard search, driven by a command
stream. You are given a list of `operations`, each `"addWord word"` or
`"search pattern"`. In a `search` pattern, the character `.` matches any single
letter; all other characters must match exactly. A search succeeds only if some
added word matches the whole pattern.

Process the operations in order and return, for each `search`, `"true"` or
`"false"`. Searching a pattern with `k` wildcards may branch, so bound the
worst-case cost accordingly.

### Examples
**Example 1:**
```
Input:  ["addWord bad", "addWord dad", "addWord mad", "search pad", "search bad", "search .ad", "search b.."]
Output: ["false", "true", "true", "true"]
```
`pad` is absent; `bad` matches exactly; `.ad` matches `bad`/`dad`/`mad`; `b..`
matches `bad`.

**Example 2:**
```
Input:  ["addWord a", "search .", "search a", "search aa"]
Output: ["true", "true", "false"]
```
`.` matches the single-letter word `a`; `aa` has no two-letter match.

**Example 3:**
```
Input:  ["search a", "addWord a", "search a"]
Output: ["false", "true"]
```

### Constraints
- `1 <= operations.length <= 10^4`
- Each operation is `"addWord <word>"` or `"search <pattern>"`.
- `1 <= word.length, pattern.length <= 25`
- `word` consists of lowercase letters; `pattern` of lowercase letters and `.`.

---

## Problem 13: Top-K Autocomplete

### Description
You are given a `String[]` whose first two elements are an integer `k` (as a
string) and a query `prefix`, and whose remaining elements are catalogue entries
of the form `"word freq"` (a word and its non-negative integer frequency).

Return the `k` most frequent completions of `prefix` — that is, the `k` highest
frequency words that begin with `prefix` — ordered by descending frequency, with
ties broken lexicographically. If fewer than `k` words match, return all of them.
Return the result as a `String[]` of words (frequencies omitted), in ranked
order.

### Examples
**Example 1:**
```
Input:  ["2", "ap", "apple 5", "app 3", "apply 5", "banana 9"]
Output: ["apple", "apply"]
```
Words under `ap`: `apple` (5), `apply` (5), `app` (3). The top two by frequency
are `apple` and `apply`; they tie at 5, so `apple` ranks first lexically.

**Example 2:**
```
Input:  ["3", "c", "cat 4", "car 4", "cab 4"]
Output: ["cab", "car", "cat"]
```
All tie at frequency 4, so the order is purely lexicographic.

**Example 3:**
```
Input:  ["2", "z", "apple 5"]
Output: []
```
No catalogue word begins with `z`.

### Constraints
- The first element is `k`; the second is the prefix; the rest are `"word freq"`.
- `0 <= k <= 10^4`, `1 <= number of entries <= 10^4`
- `1 <= word.length, prefix.length <= 100`, lowercase English letters only.
- `0 <= freq <= 10^9`.

---

## Problem 14: Prefix Tally at the Lexicon Archive

### Description
The archivist loads a dictionary, then answers a stream of prefix-count queries.
You are given a `String[]` of `lines`: a prefix block of words, a separator line
`"---"`, and then a block of query prefixes (one per line). Build a trie over the
words, store a count of words passing through each node, and for each query
report how many archived words begin with that prefix.

Return one count per query, in order, as a `String[]`. Each query must run in
`O(L)` time for a prefix of length `L`.

### Examples
**Example 1:**
```
Input:  ["apple", "app", "apricot", "---", "ap", "app", "b"]
Output: ["3", "2", "0"]
```
Three words start with `ap`; two start with `app`; none with `b`.

**Example 2:**
```
Input:  ["dog", "---", "do", "dog", "dogs"]
Output: ["1", "1", "0"]
```
`dog` matches the prefixes `do` and `dog`; nothing has the prefix `dogs`.

**Example 3:**
```
Input:  ["cat", "cat", "car", "---", "ca", "cat"]
Output: ["3", "2"]
```
Duplicate words are counted: three words start with `ca`, two with `cat`.

### Constraints
- Exactly one separator line `"---"` divides words from queries.
- `1 <= words count, queries count <= 2 * 10^5`, total characters `<= 10^6`.
- Words and queries consist of lowercase English letters only.

---

## Problem 15: Segmenting the Signal Stream

### Description
Mission control receives a `signal` and a `vocabulary` of legal chunks. You are
given a `String[]` whose first element is the `signal` string and whose remaining
elements are the vocabulary chunks. Determine whether `signal` can be split into a
contiguous sequence of vocabulary chunks, where each chunk may be reused any
number of times.

Store the vocabulary in a trie and run a memoised left-to-right scan that follows
trie edges to enumerate candidate chunk boundaries. Return `"true"` if a full
segmentation exists, else `"false"`.

### Examples
**Example 1:**
```
Input:  ["abcd", "ab", "cd", "abc"]
Output: "true"
```
`abcd` segments as `ab` + `cd`.

**Example 2:**
```
Input:  ["aaaaa", "aa", "aaa"]
Output: "true"
```
`aaaaa` segments as `aa` + `aaa` (or `aaa` + `aa`); chunks may repeat.

**Example 3:**
```
Input:  ["abcf", "ab", "cd"]
Output: "false"
```
The suffix `cf` matches no chunk, so no full segmentation exists.

### Constraints
- The first element is the signal; the rest are vocabulary chunks.
- `1 <= signal.length <= 2000`
- `1 <= vocabulary.length <= 10^4`
- All strings consist of lowercase English letters.

---

## Problem 16: Longest Shared Call-Sign Prefix

### Description
A fleet of ships broadcasts `callSigns`. The relay needs the longest prefix
shared by *every* call-sign in order to compress transmissions. You are given the
call-signs as a `String[]`.

Insert all call-signs into a trie and descend from the root while exactly one
child exists and the node is not the end of a shorter call-sign. Return that
longest common prefix, or the empty string if none is shared by all.

### Examples
**Example 1:**
```
Input:  ["alpha", "alpine", "altitude"]
Output: "al"
```
Every call-sign starts with `al`; they diverge afterwards.

**Example 2:**
```
Input:  ["north", "northwest", "northeast"]
Output: "north"
```
The shortest call-sign `north` is itself a prefix of the others, so it caps the
shared prefix.

**Example 3:**
```
Input:  ["echo", "foxtrot"]
Output: ""
```
No shared starting character.

### Constraints
- `1 <= callSigns.length <= 10^5`
- `1 <= callSigns[i].length <= 100`
- `callSigns[i]` consists of lowercase English letters.

---

## Problem 17: Weighted Prefix Frequency on the Trade Ledger

### Description
The trade ledger stores named entries with integer weights, then answers
weighted prefix-sum queries. You are given a `String[]` of `lines`: an entry
block of `"name weight"` pairs, a separator line `"---"`, and then a block of
query prefixes. A later entry with the same name overwrites its weight. For each
query, return the sum of weights over all stored names that begin with that
prefix.

Maintain a trie whose nodes accumulate weight contributions so each prefix sum is
`O(L)`. Return one sum per query, in order, as a `String[]`.

### Examples
**Example 1:**
```
Input:  ["apple 3", "app 2", "---", "ap", "app", "b"]
Output: ["5", "5", "0"]
```
Both `apple` (3) and `app` (2) start with `ap` and `app`, totalling 5; nothing
starts with `b`.

**Example 2:**
```
Input:  ["apple 3", "apple 7", "---", "app"]
Output: ["7"]
```
Re-inserting `apple` overwrites its weight, so the sum uses 7, not 10.

**Example 3:**
```
Input:  ["cat 4", "car 5", "---", "ca", "cat", "cz"]
Output: ["9", "4", "0"]
```

### Constraints
- Exactly one separator line `"---"` divides entries from queries.
- `1 <= entries count, queries count <= 10^5`
- Weights fit in a signed 32-bit integer; names and prefixes are lowercase letters.

---

## Problem 18: Maximum XOR Pair

**LeetCode:** [421. Maximum XOR of Two Numbers in an Array](https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/)

### Description
You are given an array `nums` of non-negative integers, supplied as a `String[]`
of decimal numerals. Return the maximum value of `nums[i] XOR nums[j]` over all
pairs `i, j`, as a string.

Insert each number's fixed-width binary representation into a binary trie (one
bit per level, most significant bit first). For each number, walk the trie
greedily preferring the opposite bit at each level to maximise the XOR, giving an
`O(n * b)` algorithm for `b`-bit integers.

### Examples
**Example 1:**
```
Input:  ["3", "10", "5", "25", "2", "8"]
Output: "28"
```
`5 XOR 25 = 28` is the largest pairwise XOR.

**Example 2:**
```
Input:  ["0", "0"]
Output: "0"
```
The only pair XORs to 0.

**Example 3:**
```
Input:  ["8", "10", "2"]
Output: "10"
```
`8 XOR 2 = 10` beats the other pairs.

### Constraints
- `1 <= nums.length <= 2 * 10^5`
- `0 <= nums[i] <= 2^31 - 1`
- Each element of the input array is a decimal numeral.

---
