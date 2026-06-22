# Memory Model

## What an Array Is & When to Reach for One
*What problem does a fixed, indexable block of same-typed elements solve, and when is it the obvious first choice over a map or a list?*

## The Mental Model: One Labeled Ruler
*Picture memory as a long ruler of numbered slots — what does it buy you to demand that all your data sit on one unbroken stretch of that ruler?*

## Contiguous Allocation
*What does it mean for all elements to sit back-to-back in one block, and why must the runtime know the element size up front to allocate it?*

### Why Same-Typed Elements
*Why does every slot having identical size make the indexing trick possible, and what would break if element sizes varied?*

### Stack vs Heap Placement
*Where does the block physically come from for a local fixed array versus a heap-allocated one, and how does that affect lifetime?*

## The Base Pointer & Element Stride
*Where does the array "live" as a single starting address, and what is the stride that separates one element's start from the next?*

## Address Arithmetic
*How is the address of element \\( i \\) computed from base and stride, and why is it pure multiply-and-add with no scanning?*

### Why Indexing Never "Looks Through" Earlier Elements
*Why does the CPU never visit elements 0..i-1 to reach element \\( i \\) — what does it compute directly instead?*

### Zero-Based Indexing
*Why does counting from 0 make the offset formula cleanest, and what does index 0 mean in terms of the base address?*

## Constant-Time Random Access
*Why does reaching element one million cost the same as element 0, while a linked structure cannot promise that?*

## Cache Lines & Locality
*How does a sequential walk ride the CPU cache line-by-line, and what makes a strided or random walk fall off a performance cliff even at the same Big-O?*

### Spatial vs Temporal Locality
*What is the difference between reusing nearby addresses and reusing the same address, and which does a forward array scan exploit?*

### When Stride Hurts
*Why can jumping by a large stride defeat the cache even though each individual access is still \\( O(1) \\)?*

## Fixed Size & Why Arrays Don't Grow
*Once the block is allocated, why can't you append in place, and what does "the array is full" actually force you to do?*

## Bounds & Out-of-Range Access
*What lives just past index \\( n-1 \\), who is responsible for the check, and how do Java's checked access and C's unchecked access differ?*

### The Invariant a Valid Index Must Hold
*What condition must every index satisfy before use, and why is violating it either a thrown exception or silent corruption depending on the language?*

## Value vs Reference Element Types
*What does each slot hold when elements are primitives versus objects, and where does the real object data actually live?*

## Time Complexity
*Reason about the cost of every fundamental array operation and what makes each bound hold.*

### Index Read / Write
*Why is access or assignment by index \\( O(1) \\) in all cases with no best/worst split — what single computation does it reduce to?*

### Search by Value
*Why is finding an unknown value \\( O(n) \\) worst case, what is the best case (first slot) and the average case, and how would a sorted array change the picture?*

### Insert or Delete at an Index
*Why does editing the middle cost \\( O(n) \\) from shifting, why is the front the worst case, and why is the tail the cheap case?*

### Why Constant Factors Still Matter
*Two \\( O(n) \\) scans can differ widely in wall-clock time — how do cache behavior and stride change the hidden constant?*

## Space Complexity
*Reason about how much memory an array occupies and what extra space its operations need.*

### The Array Itself
*Why is the storage \\( O(n) \\) for \\( n \\) elements, and what fixed overhead (length field, header) rides along?*

### Operating In Place
*Why do read, write, and search need only \\( O(1) \\) auxiliary space, and what does "in place" really mean here?*

### Iterative vs Recursive Traversal
*Why does an iterative scan use \\( O(1) \\) extra space while a naive recursive walk can cost \\( O(n) \\) on the call stack — and what sits in those stack frames?*

## Common Bugs & Edge Cases
*Off-by-one at the boundaries, the empty array, uninitialized/default values, signed-index mistakes, assuming a fixed array can grow — which trip people up most?*

## Real-World & Interview Uses
*Where does the raw array hide under the hood — strings, buffers, matrices, hash-table backing stores — and which interview patterns lean on \\( O(1) \\) indexing?*

## Implementation Walkthrough
*Before writing code, break the problem into the pieces you must get right.*

### State & Setup
*What fields must your array wrapper hold (backing storage, length), and what must be true the instant it is constructed?*

### The Access Path
*What does `get(i)` / `set(i, v)` do step by step, and where exactly does the bounds check belong relative to the offset computation?*

### The Traversal Loop
*How is the scan loop structured, what are its start and stop conditions, and what invariant holds about every index already visited?*

### Termination & Return
*How does each operation decide it is done, and what does it hand back (value, nothing, or a thrown error) in the success and out-of-bounds cases?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
