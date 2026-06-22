# Deques

## Open at Both Ends
*What can a deque do that a plain stack or queue cannot, and why is that worth a more complex structure?*

## When to Use It
*What problems want fast insertion and removal at both ends, and how do you recognize them?*

## The Mental Model
*If you picture a double-ended line where people join and leave from either side, what stays symmetric and what does not?*

## Four Core Operations
*What are the push/pop pairs at each end, and how do they mirror one another?*

### pushFront / pushBack
*How do you add at the head versus the tail, and what marker moves in each case?*

### popFront / popBack
*How do you remove at each end, and what must you check before each removal?*

### peekFront / peekBack
*How do you read either end without removing, and why keep that separate?*

## State and Invariants
*What internal fields must always agree, and what must hold about head, tail, and count after every operation?*

### Head and Tail Markers
*How do two indices, moving in opposite directions, track both ends of the data?*

### The Count Field
*Why does an explicit element count make the full and empty conditions unambiguous?*

## Circular Array Wraparound
*How do head and tail indices move in opposite directions around a ring?*

### Wraparound Indexing
*How does modular arithmetic keep both indices in bounds as they cross zero in either direction?*

### Distinguishing Full from Empty
*Why can't head and tail alone tell full from empty here, and how does a count resolve it?*

## Doubly-Linked Alternative
*When is a node-based deque, with prev and next pointers, preferable to an array-based one?*

### Why Both Pointers Are Needed
*What would break at popBack if each node only knew its successor and not its predecessor?*

## As a Stack and as a Queue
*How does a deque subsume both by ignoring one end, and what restriction recovers each?*

## Time Complexity
*What does each end operation cost, and what makes the bound hold?*

### The Four End Operations
*Why are all four push/pop-at-an-end operations constant time once head, tail, and count exist?*

### Amortized Cost on a Growable Array Deque
*Which operation occasionally triggers a resize, and why does the per-operation average stay constant anyway?*

### Array vs Linked Constant Factors
*Where does the array deque's contiguous memory beat the linked deque even when both are O(1)?*

## Space Complexity
*How much memory beyond the elements, and where does it come from?*

### Slack vs Pointer Overhead
*Why does the ring-buffer deque carry unused capacity while the linked deque pays two pointers per node?*

### Auxiliary Space of Operations
*Why do the end operations need no scratch space proportional to size?*

## Sliding-Window Use
*How does a monotonic deque maintain a window maximum in O(n) total work?*

### Why Each Index Enters and Leaves Once
*What argument explains the linear total cost even though a single step can pop many elements?*

## Trade-offs vs Alternatives
*When does the extra generality of a deque cost you versus a dedicated stack or queue?*

## Common Bugs & Edge Cases
*What goes wrong with index underflow on popFront, full/empty ambiguity, a missed modulo in either direction, or stale window indices?*

## Real-World & Interview Uses
*Where do work-stealing schedulers, undo/redo, palindrome checks, and sliding-window problems use deques?*

## Implementation Walkthrough
*Before writing code, settle each part.*

### State & Setup
*What fields hold the buffer, capacity, head, tail, and count, and what are their empty-deque values?*

### pushFront and pushBack Step by Step
*In what order do you check fullness, possibly resize, place the element, and move the correct marker in the correct direction?*

### popFront and popBack Step by Step
*In what order do you check emptiness, read the end, move the marker, and update count?*

### Wraparound in Both Directions
*How do you compute the next index when advancing forward versus stepping backward past zero?*

### Resize Step
*How do you copy a possibly-wrapped buffer into a larger one while preserving front-to-back order?*

### Termination & Return
*What does each operation return, and how do you signal an illegal pop on an empty deque?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
