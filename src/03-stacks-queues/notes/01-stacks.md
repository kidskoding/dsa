# Stacks

## What It Is & When to Use It
*What problems naturally call for "deal with the most recent thing first," and what makes a stack the right fit over a list or queue?*

## LIFO Discipline
*What does last-in-first-out mean for the order things leave, and how is that ordering a feature rather than a limitation?*

### The Mental Model
*If you picture a stack of plates, which plate is reachable and which are trapped, and why?*

### The Single Access Point Invariant
*Why does allowing access at exactly one end make the structure easier to reason about and to keep correct?*

## Core Operations
*Which operations form the public contract, and what does each promise to the caller?*

### push
*How do you add an element so it becomes the new top without disturbing what's below?*

### pop
*How do you remove and return the top, and what must be true before you're allowed to?*

### peek / top
*How do you read the top without removing it, and why is that distinct from pop?*

### isEmpty / size
*How do you expose state so callers can guard their own pops without touching internals?*

## State and Invariants
*What internal fields must always agree, and what relationship between them must hold after every operation?*

### The Top Index or Pointer
*How does the top marker tell push and pop where to act, and what value marks "empty"?*

### Invariant Maintenance
*After any push or pop, what must still be true about size, the top marker, and the stored elements?*

## Array-Backed vs Linked-List Backing
*What changes about growth, pointers, cache locality, and worst-case spikes when you swap the underlying store?*

### Array Backing
*How does a top index plus a contiguous array realize a stack, and what happens at the boundary when it fills?*

### Linked-List Backing
*Why does pushing onto the head of a singly linked list give a clean O(1) with no resize ever needed?*

### Choosing Between Them
*Which backing wins on memory overhead, which on predictable latency, and why?*

## Growth and Resizing
*When an array stack fills, how do you grow it, and why is doubling the capacity the standard move rather than adding a fixed amount?*

### Why Doubling Amortizes
*How does the cost of an occasional expensive copy get spread thin across many cheap pushes?*

## Time Complexity
*What does each operation cost, and what in the implementation forces that bound?*

### push
*Why is push constant time in the common case, and which case makes a single push expensive?*

### pop and peek
*Why are these always constant time regardless of how full the stack is?*

### Amortized vs Worst-Case push
*What is the difference between the cost of one unlucky push and the average over many, and what triggers the unlucky one?*

### Constant Factors
*Where does array backing tend to beat linked backing in practice even when both are labeled O(1)?*

## Space Complexity
*How much memory does the structure use beyond the elements themselves, and where does it come from?*

### Storage Overhead by Backing
*Why does a linked stack pay per-element pointer overhead while an array stack may hold unused slack capacity?*

### Auxiliary Space of Operations
*Why do push, pop, and peek need no extra space proportional to size?*

### Call-Stack Space When Used Recursively
*If a stack is consumed by a recursive walk, how does the recursion's own frame depth add to space cost?*

## Trade-offs vs Alternatives
*When would you reach for a stack over a queue, a deque, or a plain dynamic list, and what do you give up?*

## Common Bugs & Edge Cases
*What goes wrong on popping or peeking an empty stack, off-by-one on the top index, forgetting to null freed slots, or resizing at the wrong moment?*

## Real-World & Interview Uses
*Where do call frames, undo, bracket matching, expression evaluation, and DFS rely on this exact shape?*

## Implementation Walkthrough
*Before writing code, break the build into parts and decide each one.*

### State & Setup
*What fields hold the elements, the capacity, and the top marker, and what are their initial values for an empty stack?*

### push Step by Step
*In what order do you check capacity, possibly resize, place the element, and advance the top marker?*

### pop Step by Step
*In what order do you check emptiness, read the top, shrink the marker, and optionally free the slot?*

### Resize Step
*How do you allocate the bigger store and copy elements so the top marker still points correctly afterward?*

### Termination & Return
*What does each operation return, and how do you signal an illegal pop on an empty stack?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
