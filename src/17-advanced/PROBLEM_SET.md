# Advanced Data Structures: Problem Set

Three sections. Coding problems are implemented against the stubs, Conceptual
problems are proofs and derivations written in LaTeX (no code), and Challenge
problems are harder implementations against the stubs. Statements only — no
solutions here.

---

## Coding

### Problem 01: Dynamic Order Statistics
Maintain a multiset under insertions and deletions while answering "what is the
\\( i \\)-th smallest element?" and "what is the rank of value \\( x \\)?" Each query
must run in \\( O(\log n) \\). Implement `Problem01.KthSmallestAfterOps`.

### Problem 02: Stabbing Query
Given a set of closed intervals and a query point \\( q \\), report whether any
interval contains \\( q \\). Support insertion. Implement `Problem02.AnyIntervalContains`.

### Problem 03: Range Sum with Point Updates
Given an integer array, support point updates and prefix-sum / range-sum queries,
each in \\( O(\log n) \\). Implement `Problem03.RangeSumAfterUpdates` using a Fenwick tree.

### Problem 04: Static Range Minimum
Preprocess a static array so that range-minimum queries are answered in \\( O(1) \\).
Implement `Problem04.RangeMinima` for a batch of queries.

### Problem 05: Range Add, Range Sum
Support range-add updates and range-sum queries on an array, each in
\\( O(\log n) \\), using lazy propagation. Implement `Problem05.RangeAddRangeSum`.

### Problem 06: Pattern Occurrence Count
Given a text and a set of pattern queries, count occurrences of each pattern.
Implement `Problem06.CountPatternOccurrences` using a suffix array or suffix tree.

---

## Conceptual

### Problem 07: Treap Expected Depth
Prove that the expected depth of any fixed key in a treap built from \\( n \\)
distinct keys with independent uniform priorities is \\( O(\log n) \\). State and use
the indicator-variable decomposition for ancestry.

### Problem 08: van Emde Boas Recurrence
Show that the van Emde Boas recurrence \\( T(u) = T(\sqrt{u}) + O(1) \\) solves to
\\( T(u) = O(\log\log u) \\). Be explicit about the substitution \\( m = \log u \\).

### Problem 09: Fenwick vs Segment Tree Expressiveness
Prove that a Fenwick tree can answer range queries in \\( O(\log n) \\) only when the
aggregate operation has an inverse, while a segment tree handles any associative
operation. Give a concrete monoid (e.g. min) that the Fenwick range trick fails on.

### Problem 10: Cache-Oblivious Transpose Bound
Prove that the recursive cache-oblivious matrix transpose of an \\( n \times n \\)
matrix incurs \\( O(n^2 / B) \\) memory transfers in the ideal-cache model with block
size \\( B \\) and cache size \\( M \ge B^2 \\) (tall-cache assumption).

### Problem 11: Sorting Lower Bound in External Memory
State the external-memory sorting lower bound
\\( \Omega\!\left(\frac{n}{B}\log_{M/B}\frac{n}{B}\right) \\) and explain why
comparison-based internal sorting bounds do not directly transfer.

### Problem 12: Suffix Array / LCP Equivalence
Prove that a suffix array together with its LCP array can simulate the
substring-search queries of a suffix tree with only an \\( O(\log n) \\) slowdown.

---

## Challenge

### Problem 13: Persistent Segment Tree
Design a fully persistent segment tree supporting range-sum queries against any
historical version after a sequence of point updates, using \\( O(\log n) \\) extra
space per update. Implement `Problem13.QueryVersion`.

### Problem 14: Mergeable Treaps (Split/Merge)
Implement order-preserving `split` and `merge` on treaps and use them to perform a
range reversal on an implicit-key treap. Implement `Problem14.RangeReverse`.

### Problem 15: Offline Interval Scheduling via Order-Statistics Tree
Given weighted intervals, support an online mix of insert/delete and "max-weight
non-overlapping subset over [l, r]" approximations. Implement
`Problem15.MaxNonOverlapping`.

### Problem 16: Longest Common Substring of Two Strings
Using a generalized suffix structure, find the longest substring common to two
input strings in \\( O(n + m) \\) time. Implement `Problem16.LongestCommonSubstring`.

### Problem 17: Distinct Values in a Range (Offline)
Given an array and a batch of range queries, answer the number of distinct values
in each range. Implement `Problem17.DistinctInRanges` using a Fenwick tree over a
sorted-query (offline) sweep.

### Problem 18: Dynamic Predecessor Under a Bounded Universe
Build a structure over the universe \\( \{0,\dots,u-1\} \\) supporting insert, delete,
and predecessor in \\( O(\log\log u) \\). Implement `Problem18.PredecessorAfterOps`
backed by a van Emde Boas tree.
