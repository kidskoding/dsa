# Skip Lists

## What It Is & When to Use It
*A sorted linked list with stacked "express lanes" — when do you reach for this instead of a balanced tree, and why is it loved for concurrency?*

## The Mental Model: Express Lanes Over Local Stops
*Why is a skip list like a subway map where higher levels are express trains skipping many stops, and how does dropping to a slower line near your destination mirror the search?*

## The Layered Structure
*How do stacked sorted lists sit on top of a full base list, and what does each higher level skip over relative to the level below it?*

### The Base Level Holds Everything
*Why must the bottom level contain every element in sorted order, and why is correctness anchored there?*

## Node Towers
*What does it mean for one node to exist on several levels at once, and what does a node's array of forward pointers look like?*

### Height of a Tower
*What determines how tall a given node's tower is, and what does a node of height 1 versus height 4 participate in?*

## Probabilistic Levels
*Why use a coin flip to decide each node's height instead of strictly balancing, and roughly what fraction of nodes reach each successive level?*

### Why Randomness Replaces Rebalancing
*What does the coin flip buy you that lets you skip the rotations a balanced tree needs, and what do you give up in exchange?*

## Search
*How does a query start at the top-left, move right until the next node would overshoot the target, then drop a level — and why does that feel like a balanced-tree descent?*

### Tracking the Update Path
*Why must search remember the rightmost node it stopped at on every level, and how is that saved path reused by insert and delete?*

## Insertion & Tower Building
*How do you find the slot via the update path, flip coins to pick the new node's height, and splice it into each level it reaches?*

### Growing the List's Level
*What happens when a new tower is taller than any existing one, and how must the head and the recorded level adjust?*

## Deletion
*How do you unlink a node from every level it appears on, why is the update path again the key, and when should the list's top level shrink back?*

## Time Complexity
*Reason about why the randomized structure behaves like a logarithmic one.*

### Why Search Is Expected \\( O(\log n) \\)
*Why does halving (roughly) the candidates at each level make the expected number of levels about \\( \log n \\), and why is the work per level expected constant?*

### Insert & Delete
*Why do insert and delete share search's \\( O(\log n) \\) expected cost plus an expected-constant amount of splicing across the touched levels?*

### Worst Case vs Expected
*Why is the worst case \\( O(n) \\) (every tower the same height), why is "expected" the honest word, and why does it rarely bite in practice?*

## Space Complexity
*Reason about the cost of all those extra pointers.*

### Expected Tower Heights
*Why does the average tower height stay constant, making total pointer space expected \\( O(n) \\) rather than \\( O(n \log n) \\)?*

### Tuning with the Probability Factor
*How does the coin's probability \\( p \\) trade pointer space against search speed, and what does a smaller \\( p \\) do to both?*

### Search Auxiliary Space
*Why does a search need only \\( O(1) \\) working space, while remembering the update path for insert/delete costs \\( O(\log n) \\) expected?*

## Trade-offs vs Balanced Trees
*Simpler code and no rotations vs randomized (not worst-case) guarantees — when does a skip list win over a red-black or AVL tree?*

## Common Bugs & Edge Cases
*Forgetting to update every level, an empty or single-node list, growing the head's level when a tall tower appears, an unseeded RNG making the structure degenerate.*

## Real-World & Interview Uses
*Redis sorted sets, `ConcurrentSkipListMap`, LevelDB-style stores, and ranked leaderboards — where the ordered, lock-friendly structure shines.*

## Implementation Walkthrough
*Before writing code, break the problem into the pieces you must get right.*

### State & Setup
*What does the structure hold (a head with an array of forward pointers, a current level, a max level, the probability \\( p \\)), and what does the empty list look like?*

### The Random-Level Routine
*How does the coin-flip loop decide a new node's height, what caps it, and how should the RNG be seeded to avoid degenerate runs?*

### The Search-and-Record Loop
*How do you descend from the top level, move right while the next key is smaller than the target, and store the stop node per level into the update array?*

### Splicing Across Levels
*Using the update array, how do you rewire forward pointers at each level the new node reaches, and how does this mirror singly-linked insertion repeated per level?*

### Termination & Return
*How does each operation finish, when do you raise or lower the list's current level, and what does each return (found value, success boolean)?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
