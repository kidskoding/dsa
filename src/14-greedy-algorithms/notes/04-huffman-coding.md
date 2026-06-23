# Huffman Coding

## The Compression Problem
*Why does assigning fixed-length codes to every symbol waste space, and what do we want instead?*

## Variable-Length Codes
*Why should frequent symbols get short codes and rare symbols long ones?*

### Weighted Code Length as the Objective
*What sum are you actually minimizing across all symbols and their frequencies?*

## Prefix-Free Codes
*Why must no codeword be a prefix of another, and how does a binary tree guarantee it?*

### Codewords as Root-to-Leaf Paths
*Why does placing every symbol at a leaf make the code automatically decodable?*

## The Greedy Frequency Merge
*Why repeatedly combine the two least-frequent symbols into one subtree?*

### Why the Two Rarest Merge First
*What goes wrong if you ever merge anything but the two smallest available weights?*

## Building the Tree with a Heap
*How does a min-priority-queue of subtrees drive the construction loop?*

### Node Layout
*What does each tree node hold — frequency, symbol, two children — and how are merges recorded?*

## Encoding & Decoding
*How do you walk the tree to turn text into bits, and bits back into text?*

### Emitting the Code Table
*Why do you traverse the finished tree once to assign each symbol its bit string?*

## Why Greedy Is Optimal (Intuition)
*How would an exchange argument show the two rarest symbols belong deepest in the tree?*

## Static vs. Adaptive Huffman
*When do you ship the frequency table versus learn it on the fly?*

## Time Complexity
*Where does the running time go for building and using the code?*

### Building the Tree
*Why is the build \\( O(n \log n) \\) in the number of distinct symbols, driven by heap pushes and pops?*

### Counting, Encoding, and Decoding
*Why is the frequency count and the encode/decode pass linear in the text length?*

## Space Complexity
*What memory does the encoder and decoder need?*

### The Tree and the Code Table
*Why are the tree and per-symbol code table both \\( O(n) \\) in the alphabet size?*

### Output and Heap Footprint
*How big is the compressed bitstream and the heap relative to the input?*

## Real Uses
*Where does Huffman sit inside ZIP, JPEG, MP3, and other codecs?*

## Pitfalls
*Why must the decoder know the tree, and what happens with a single-symbol alphabet or tie-breaking choices?*

## Implementation Walkthrough
*How do the stages of the code line up — count, build, assign, encode?*

### Setup: Frequency Table & Heap
*How do you count symbol frequencies and seed the priority queue with leaf nodes?*

### The Merge Loop
*What does each iteration pop, combine, and push, and when does the loop end with one root?*

### Assigning Codes by Traversal
*How does a recursive walk accumulate the bit path to each leaf into the code table?*

### Encoding & Decoding Streams
*How do you map text to bits via the table, and bits back to text by walking the tree?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
