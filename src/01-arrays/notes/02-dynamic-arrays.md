# Dynamic Arrays

## What It Is & When to Use It
*Why wrap a fixed array in a structure that "grows," and when do you pick this over a linked list or a plain array?*

## The Mental Model: A Resizable Wrapper
*How is a dynamic array really a fixed array plus bookkeeping that lies about its size — what illusion does it maintain for the caller?*

## Capacity vs Size
*What is the difference between how many elements exist and how many slots are allocated, and why must you track both as separate numbers?*

### The Core Invariant
*What relationship between `size` and `capacity` must always hold, and what does each append or remove do to preserve it?*

## The Backing Array
*How does the structure hold a private fixed array behind the scenes, and what stays the same when only `size` changes but capacity does not?*

## Append: The Central Operation
*Why is push-to-end the operation that defines this structure, and what are its two distinct paths?*

### Append at the End (Room to Spare)
*Walk the happy path — where does the new element go, what increments, and why is no copy involved?*

### Append When Full
*What ordered sequence fires when capacity is exhausted: allocate a bigger block, copy the old elements, swap the reference, then write the new one?*

## Geometric Growth
*Why multiply capacity by a factor (often 2 or 1.5) instead of adding a fixed chunk, and what would fixed-increment growth cost you over many appends?*

### Why a Factor, Not a Constant
*What is the mental picture for why doubling makes resizes exponentially rarer as the array grows?*

## Insert & Delete at an Index
*Why does inserting or removing in the middle force a shift of everything after it, which direction does each shift go, and when can a resize also be triggered?*

## Shrinking Policy
*When should the backing array contract, why shrink at quarter-full rather than half-full, and how does that gap avoid grow/shrink thrashing at the boundary?*

## Iterator Invalidation & Mutation During Iteration
*Why can a resize or a mid-loop removal leave a saved index, pointer, or iterator referring to the wrong slot or a freed block?*

## Time Complexity
*Reason about per-operation cost, including why one operation needs the amortized lens.*

### Index Access & Update
*Why are `get` and `set` flat \( O(1) \) just like a plain array, regardless of size?*

### Amortized Append
*Why is a single append \( O(n) \) in the worst case (the resize) yet \( O(1) \) amortized — what is the intuition for spreading the rare expensive copy across the many cheap appends? State the bound; don't formally derive it.*

### Insert / Delete at Index
*Why is editing position \( k \) \( O(n - k) \), making the front \( O(n) \) and the tail \( O(1) \), and how does a triggered resize fold into that?*

### Search
*Why is unsorted search \( O(n) \), and what changes if the contents are sorted?*

## Space Complexity
*Reason about the memory the structure holds versus the data it stores.*

### Storage and Slack
*Why is space \( O(n) \) yet potentially up to ~2x the live data because of unused capacity — and when is that slack at its worst?*

### Resize Transients
*Why does a grow momentarily hold both the old and new backing arrays, and what is the peak extra space during the copy?*

### Auxiliary Space of Operations
*Why do append, insert, and delete each need only \( O(1) \) auxiliary space beyond any resize copy?*

## Trade-offs vs Linked List
*Random access and cache friendliness vs cheap middle insertion and no resize cost — when does each structure win?*

## Common Bugs & Edge Cases
*Forgetting to null out removed slots (leaks), growing from capacity 0, integer overflow on the new capacity, copying `size` vs `capacity` elements — which bite hardest?*

## Real-World & Interview Uses
*Where does this back the standard library (`ArrayList`, `vector`, Python `list`), and which interview patterns assume an \( O(1) \) amortized push?*

## Implementation Walkthrough
*Before writing code, break the problem into the pieces you must get right.*

### State & Setup
*What fields does the structure carry (backing array, size, capacity), and what should an empty or default-constructed instance look like?*

### The Grow Routine
*What does the private resize do step by step — compute new capacity, allocate, copy each live element, reassign — and what must be true when it returns?*

### Append Threading Through Grow
*How does `add` decide whether to call grow first, and in what order must the size increment and the element write happen?*

### Shifting for Insert and Delete
*Which way do you copy elements to open or close a gap, and why does the copy direction matter to avoid overwriting data you still need?*

### Termination & Return
*How does each operation signal success, bounds errors, or the new size, and what invariant must hold on every exit?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
