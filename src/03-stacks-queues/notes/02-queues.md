# Queues

## What It Is & When to Use It
*What problems need "serve in the order things arrived," and what makes a queue the right fit over a stack or list?*

## FIFO Discipline
*What does first-in-first-out mean for who gets served next, and why is fairness a natural consequence?*

### The Mental Model
*If you picture a line at a counter, where do arrivals join and where do departures happen?*

### Two Ends, Two Roles
*Why do the back and front play different roles, unlike a stack's single end?*

## Core Operations
*Which operations make up the contract, and what does each promise?*

### enqueue
*How do you add an element at the back without disturbing the front?*

### dequeue
*How do you remove and return the front, and what must hold before you may?*

### peek / front
*How do you read the front without removing it, and why keep that separate from dequeue?*

## State and Invariants
*What internal fields must always agree for the queue to stay correct?*

### Front and Rear Markers
*How do two indices let you avoid shifting every element on each dequeue?*

### The Size or Count Field
*Why is an explicit count often the cleanest way to keep the structure honest?*

## Circular Buffer Wraparound
*How does modular arithmetic let a slot freed at the front be reused at the back of a fixed array?*

### Why a Ring Beats a Line
*Without wraparound, why does a simple array queue "walk off" the end and waste space?*

### Distinguishing Full from Empty
*Why does front == rear alone fail to tell full from empty, and what two fixes resolve it?*

## Array-Backed vs Linked-List Backing
*What does each backing buy you for growth, wraparound bookkeeping, and pointer overhead?*

### Array Backing with a Ring
*How do head, tail, and count cooperate to keep operations constant time?*

### Linked-List Backing
*Why do head and tail node references give a clean queue with no wraparound math at all?*

## Growth and Resizing
*When a circular array fills, how do you copy into a larger one without scrambling the logical order across the wrap point?*

## Time Complexity
*What does each operation cost, and what forces that bound?*

### enqueue and dequeue
*Why are both constant time once you have front and rear markers, even though elements never shift?*

### Amortized enqueue on a Growable Queue
*What single enqueue becomes expensive, what triggers it, and why does the average stay constant?*

### peek
*Why is reading the front always cheap regardless of length?*

## Space Complexity
*How much memory beyond the elements, and where does it come from?*

### Slack Capacity vs Pointer Overhead
*Why does a ring-buffer queue hold unused slots while a linked queue pays a reference per node?*

### Auxiliary Space of Operations
*Why do the core operations need no extra space proportional to length?*

### Queue Space in a BFS
*When a queue drives a breadth-first search, how large can it grow relative to the input, and what determines its peak?*

## Trade-offs vs Alternatives
*When is a queue the right call over a stack, a deque, or a priority queue, and what do you sacrifice?*

## Common Bugs & Edge Cases
*What breaks on dequeue-from-empty, the full/empty ambiguity, a missed modulo, or a resize that ignores the wrap point?*

## Real-World & Interview Uses
*Where do BFS, task scheduling, buffering, and producer/consumer pipelines depend on this shape?*

## Implementation Walkthrough
*Before writing code, settle each part.*

### State & Setup
*What fields hold the buffer, capacity, front, rear, and count, and what are their empty-queue values?*

### enqueue Step by Step
*In what order do you check fullness, possibly resize, place the element, advance rear with wraparound, and bump count?*

### dequeue Step by Step
*In what order do you check emptiness, read the front, advance front with wraparound, and drop count?*

### The Wraparound Computation
*How exactly does modular arithmetic turn "past the end" back to index zero for both markers?*

### Resize Step
*How do you re-lay the elements in logical order when copying a wrapped buffer into a bigger one?*

### Termination & Return
*What does each operation return, and how do you signal an illegal dequeue on an empty queue?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
