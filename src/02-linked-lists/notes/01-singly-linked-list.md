# Singly Linked List

## What It Is & When to Use It
*A chain of nodes where each points only forward — when does this beat an array, and when does it lose badly?*

## The Mental Model: A Treasure Hunt
*Why is a linked list less like a numbered shelf and more like a trail of clues where each node only knows where the next one is?*

## Node Layout
*What does one node hold — a payload plus a single `next` reference — and why is there no contiguity guarantee between consecutive nodes?*

### Nodes Scattered Across the Heap
*Why can two adjacent-in-the-list nodes sit far apart in memory, and what does that cost you in cache behavior versus an array?*

## Head Pointer & the Null Terminator
*Where does the list begin, what marks the end, and why is the empty list simply `head == null`?*

### The Structural Invariant
*Following `next` repeatedly from a non-cyclic head must end in `null` — why is preserving that the heart of every edit?*

## Traversal
*How do you walk node-to-node with a moving cursor, why can you only ever go forward, and why is there no way to "back up" without restarting?*

## Core Operations
*The everyday verbs — split each into its own pointer dance.*

### Insert at Head
*Why is prepending the cheapest possible write, and what two assignments make it work and in what order?*

### Insert at Tail
*Why does appending cost a full walk unless you keep a tail pointer, and what does maintaining a tail pointer buy and cost you?*

### Insert After a Given Node
*Which links rewire to splice a new node between two existing ones, and in what order so you never lose the rest of the chain?*

### Delete a Node
*Why do you need the node *before* the target, and how does the predecessor's `next` jump over the victim to unlink it?*

### Search by Value
*Why is finding an element inherently a linear scan with no shortcut, even when the data happens to be sorted?*

## Reversal
*How do you flip every `next` pointer in a single pass using three cursors (prev, curr, next), and where does the old head end up?*

### Why You Need Three Pointers
*Why does saving `curr.next` before rewiring it prevent you from severing the unvisited remainder of the list?*

## Cycle Detection
*How do fast and slow pointers (tortoise and hare) reveal a loop, and what does it mean structurally when they meet?*

## Time Complexity
*Reason about each operation and exactly what makes it cheap or costly.*

### Head Operations
*Why are insert-at-head and delete-head \\( O(1) \\) — what work is bounded no matter how long the list is?*

### Tail Operations
*Why is insert-at-tail \\( O(n) \\) without a tail pointer but \\( O(1) \\) with one, and why is delete-tail still \\( O(n) \\) even with a tail pointer?*

### Search & Index Access
*Why are search and "get the k-th element" \\( O(n) \\) worst case, what is the best case, and why is there no \\( O(1) \\) random access at all?*

### Reversal & Cycle Detection
*Why are both single-pass \\( O(n) \\) walks, and why does the two-pointer cycle check stay \\( O(n) \\) despite the hare moving twice as fast?*

## Space Complexity
*Reason about per-node overhead and the extra space operations consume.*

### Per-Node Pointer Overhead
*Why does each node cost its payload plus one reference, making total space \\( O(n) \\) with a real constant the array doesn't pay?*

### In-Place Operations
*Why do insert, delete, search, and iterative reversal all need only \\( O(1) \\) auxiliary space?*

### Recursive vs Iterative Traversal
*Why does a recursive traversal or recursive reversal use \\( O(n) \\) call-stack space while the iterative version uses \\( O(1) \\) — and what risk does that create on a long list?*

## Trade-offs vs Arrays
*No random access and poor cache behavior vs \\( O(1) \\) splicing and no resize cost — when does each win?*

## Pointer-Surgery Bugs & Edge Cases
*Losing the tail by reassigning `next` too early, dropping the last reference (leak), one-element and empty-list cases, deleting the head — which are the classic traps?*

## Real-World & Interview Uses
*Stacks, adjacency lists, LRU chains, undo stacks, and the many "reverse/merge/detect-cycle" interview staples.*

## Implementation Walkthrough
*Before writing code, break the problem into the pieces you must get right.*

### State & Setup
*What fields does the list hold (head, optional tail, optional size), and what does a freshly constructed empty list look like?*

### The Traversal Cursor
*How do you set up and advance a walking pointer, and what is the loop's stop condition so you don't dereference `null`?*

### The Pointer-Rewire Step
*For insert and delete, in what order must you read-then-write the `next` links so no part of the chain is orphaned mid-edit?*

### Edge-Case Branches
*Which special cases (empty list, single node, operating on the head) need their own branch, and what must each branch update?*

### Termination & Return
*How does each operation decide it is done, and what does it return — a value, the new head, a boolean, or nothing?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
