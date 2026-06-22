# Hash Tables: Problem Set

Three sections. Coding problems are implemented against the stubs, Conceptual
problems are proofs and derivations written in LaTeX (no code), and Challenge
problems are harder implementations against the stubs. Problems with an
associated code stub list its file in parentheses.

Use MathJax delimiters `\\( \\)` for inline and `\\[ \\]` for display math.

---

## Coding

**Problem 01: First non-repeating character** (`problemset/Problem01.java`)
Given a string, return the index of the first character that appears exactly
once, or `-1` if there is none. Use a hash-based frequency count so the scan is
linear.

**Problem 02: Two-sum existence** (`problemset/Problem02.java`)
Given an integer array and a target, return whether some pair of distinct
indices sums to the target. Use a hash set of complements for an \\( O(n) \\)
solution.

**Problem 03: Group anagrams count** (`problemset/Problem03.java`)
Given a list of words, return the number of distinct anagram groups. Two words
belong to the same group if one is a permutation of the other. Use a canonical
key per word.

**Problem 04: Deduplicate preserving order** (`problemset/Problem04.java`)
Given a sequence of integers, return a new list with duplicates removed, keeping
the first occurrence order. Use a hash set to track seen values.

**Problem 05: Most frequent element** (`problemset/Problem05.java`)
Given a non-empty integer array, return the value that occurs most often
(break ties by smallest value). Use a hash map of counts.

---

## Conceptual

**Problem 06: Expected chain length.**
Under the simple uniform hashing assumption, prove that the expected number of
elements in any one chain of a chaining hash table with \\( n \\) keys and
\\( m \\) slots is the load factor \\( \alpha = n/m \\). Conclude that an
unsuccessful search costs \\( \Theta(1 + \alpha) \\) expected time.

**Problem 07: Amortized cost of table doubling.**
Consider a dynamic table that starts at capacity 1 and doubles whenever it
fills, copying all elements on each grow. Using the accounting (or potential)
method, prove that the amortized cost of an `Insert` over any sequence of
\\( n \\) insertions is \\( O(1) \\).

**Problem 08: Universal family collision bound.**
Let \\( \mathcal{H} = \{ h_{a,b}(k) = ((ak+b) \bmod p) \bmod m \} \\) with prime
\\( p > m \\), \\( a \in \{1,\dots,p-1\} \\), \\( b \in \{0,\dots,p-1\} \\). Prove
that for any two distinct keys \\( x \neq y \\),
\\( \Pr_{h \in \mathcal{H}}[h(x) = h(y)] \le 1/m \\).

**Problem 09: Optimal number of Bloom hashes.**
For a Bloom filter with \\( m \\) bits and \\( n \\) inserted elements, the
false-positive rate is approximately \\( (1 - e^{-kn/m})^k \\). Prove that this is
minimized at \\( k = (m/n)\ln 2 \\), and state the resulting optimal rate.

**Problem 10: Why open addressing degrades under high load.**
For uniform-hashing open addressing with load factor \\( \alpha < 1 \\), derive
the expected number of probes for an unsuccessful search, \\( \frac{1}{1-\alpha} \\),
and explain why performance collapses as \\( \alpha \to 1 \\).

---

## Challenge

**Problem 11: LRU cache** (`problemset/Problem11.java`)
Implement a fixed-capacity LRU cache supporting `Get` and `Put` in \\( O(1) \\)
expected time. Combine a hash map with a doubly linked list so that the least
recently used entry is evicted when capacity is exceeded.

**Problem 12: Sliding-window distinct count** (`problemset/Problem12.java`)
Given an integer array and window size \\( k \\), return, for each window
position, the number of distinct values in that window. Maintain a hash map of
counts as the window slides for \\( O(n) \\) total work.

**Problem 13: Longest consecutive sequence** (`problemset/Problem13.java`)
Given an unsorted integer array, return the length of the longest run of
consecutive integers (e.g. `[100,4,200,1,3,2]` has run `1,2,3,4`, length 4).
Use a hash set to achieve \\( O(n) \\) time without sorting.

**Problem 14: Subarray sum equals K** (`problemset/Problem14.java`)
Given an integer array and target \\( k \\), return the number of contiguous
subarrays whose elements sum to \\( k \\). Use a hash map of prefix-sum
frequencies for an \\( O(n) \\) solution.
