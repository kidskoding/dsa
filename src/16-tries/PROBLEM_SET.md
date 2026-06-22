# Tries: Problem Set

Work top to bottom. Coding problems are implemented against the stubs,
Conceptual problems are proofs and derivations written in LaTeX (no code), and
Challenge problems are harder implementations against the stubs. No solutions
are provided.

## Coding

- [ ] **Problem 01: Insert and search.** Build a trie supporting `Insert(word)`
  and `Search(word)` where search returns `true` only for complete inserted
  keys. Both run in \\( O(L) \\) time for a key of length \\( L \\).
- [ ] **Problem 02: Prefix existence.** Add `StartsWith(prefix)` returning
  whether any inserted key has the given prefix, in \\( O(L) \\) time.
- [ ] **Problem 03: Count words with prefix.** Return how many inserted keys
  begin with a given prefix. Aim for \\( O(L) \\) per query after preprocessing.
- [ ] **Problem 04: Delete a key.** Implement `Delete(word)` that removes a key
  and prunes any nodes that become both childless and non-terminal.
- [ ] **Problem 05: Longest common prefix.** Given a set of strings inserted
  into a trie, return the longest prefix common to all of them.

## Conceptual

- [ ] **Problem 06.** Prove that trie insertion, exact search, and prefix search
  each run in \\( \Theta(L) \\) time for a key of length \\( L \\), independent of
  the number \\( n \\) of stored keys. State the loop invariant you rely on.
- [ ] **Problem 07.** Bound the space of a standard trie over an alphabet of size
  \\( \sigma \\) holding \\( n \\) keys of total length \\( N \\). Give a worst-case
  bound in terms of \\( N \\) and \\( \sigma \\), and explain when it is loose.
- [ ] **Problem 08.** Prove that a compressed trie (radix tree) over \\( n \\) keys
  has at most \\( 2n - 1 \\) nodes. Argue from the branching structure.
- [ ] **Problem 09.** Compare expected lookup cost of a trie against a balanced
  BST and a hash table for string keys. Derive each bound and state the regime
  in which the trie wins, in terms of \\( L \\), \\( n \\), and \\( \sigma \\).

## Challenge

- [ ] **Problem 10: Wildcard search.** Support `Search(pattern)` where `.`
  matches any single character. Bound the worst-case cost of a query.
- [ ] **Problem 11: Top-k autocomplete.** Given prefix queries and per-word
  frequencies, return the \\( k \\) most frequent completions of a prefix,
  ordered by descending frequency then lexicographically.
- [ ] **Problem 12: Maximum XOR pair.** Given an array of integers, insert their
  binary representations into a binary trie and return the maximum XOR over all
  pairs in \\( O(n \cdot b) \\) time for \\( b \\)-bit integers.
- [ ] **Problem 13: Word break.** Given a dictionary stored in a trie and a
  string \\( s \\), return whether \\( s \\) can be segmented into a sequence of
  dictionary words.
