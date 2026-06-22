# Doubly Linked List

## What It Is & When to Use It
*Each node links both ways — what does the backward pointer unlock that a singly linked list can't offer?*

## The Mental Model: A Two-Way Street
*Why is a doubly linked list like a street with signs pointing both directions at every house, and what new movements does that enable?*

## Node Layout (prev / next)
*What three fields does a node carry now, and what invariant ties `a.next == b` to `b.prev == a`?*

### The Mutual-Link Invariant
*Why must every forward link have a matching backward link, and how does breaking that symmetry corrupt the whole list?*

## Head, Tail & Sentinel Nodes
*Why keep both a head and a tail pointer, and how do dummy sentinel nodes erase the special cases at the boundaries?*

### Life Without Sentinels
*What boundary checks does every insert and delete need when head and tail can be `null`, and which bugs does that breed?*

### Life With Sentinels
*How does ringing the list with permanent dummy head and tail nodes mean a real node always has non-null neighbors?*

## Bidirectional Traversal
*How does holding both links let you walk forward from the head or backward from the tail with the same code shape?*

## Core Operations
*Every edit touches more pointers than in a singly list — break them out.*

### Insert at Head / Tail
*With a tail pointer or tail sentinel, why are both ends now symmetric \\( O(1) \\) inserts, and which links update at each end?*

### Insert Between Two Nodes
*Which four pointers change when you splice a new node between a left and right neighbor, and in what safe order so no link is read after it's overwritten?*

### Delete Given a Node
*Why can you remove a node in constant time when you already hold a reference to it — no predecessor search needed — and which two links bridge the gap left behind?*

### Search by Value
*Why is finding by value still a linear scan despite the extra pointer, and can searching from both ends help in the worst case?*

## Sentinels vs Null Checks
*How does ringing the list with dummy head/tail nodes turn every insert and delete into the same uniform four assignments with no branching?*

## Time Complexity
*Reason about what the backward pointer makes cheap and what it leaves unchanged.*

### Insert / Delete at a Known Node
*Why is splicing in or removing a node you already hold strictly \\( O(1) \\), and why is this the single biggest win over a singly list?*

### Head & Tail Operations
*Why are insert and delete at *both* ends \\( O(1) \\) here, when a singly list could only cheaply delete at the head?*

### Search & Index Access
*Why are search and "get the k-th node" still \\( O(n) \\), and how does bidirectional access only halve the constant, not the order?*

## Space Complexity
*Reason about the cost of the second pointer.*

### Two Pointers Per Node
*Why is total space \\( O(n) \\) but with a larger constant than a singly list, and when does that overhead actually matter?*

### Sentinel Overhead
*Why do the dummy head and tail add only \\( O(1) \\) fixed space while removing branching from every operation?*

### Auxiliary Space of Operations
*Why do all insert, delete, and search operations need only \\( O(1) \\) extra space, and why is a recursive traversal still \\( O(n) \\) on the stack?*

## Trade-offs vs Singly Linked
*Two pointers per node means more memory and more links to keep consistent — when is the backward link worth that overhead?*

## Pointer-Surgery Bugs & Edge Cases
*Updating `next` but forgetting the matching `prev`, breaking the `a.next/b.prev` invariant, single-node and empty cases, deleting head or tail without sentinels.*

## Real-World & Interview Uses
*LRU caches (the canonical use), browser history, text-editor buffers, deques, and `java.util.LinkedList` under the hood.*

## Implementation Walkthrough
*Before writing code, break the problem into the pieces you must get right.*

### State & Setup
*What does the list hold (head/tail pointers or two sentinels, plus size), and how do you wire the sentinels together at construction so the empty list is valid?*

### The Four-Pointer Splice
*For insert between neighbors, name the four assignments and the order that keeps both the new node's and the neighbors' links consistent.*

### The Unlink Step
*For delete, which two links must you redirect to bypass the node, and what should you do to the removed node's own pointers?*

### Edge-Case Branches (or Their Absence)
*Which boundary cases need special handling without sentinels, and why do sentinels let you delete those branches entirely?*

### Termination & Return
*How does each operation finish, and what does it return — a value, a boolean, or the affected node?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
