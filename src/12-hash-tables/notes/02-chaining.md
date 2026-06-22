# Chaining

## What It Is & When To Use It
*How does separate chaining resolve collisions by letting each slot hold a whole list of entries, and why is it the default for tables that must handle high load or frequent deletes?*

## The Bucket-Of-Lists Picture
*Picture the table as an array where each cell points to a linked list — where does a colliding key go, and why can a single slot hold any number of entries?*

## Representation
*What does each node in a chain store (key, value, next pointer), and how does the table array reference the head of each list?*

### Why The List, Not The Array, Owns Collisions
*Why does pushing collisions into per-bucket lists let the table array stay fixed-width, and how does that decouple capacity from collision handling?*

## Coding `insert`
*How do you hash to a bucket, then add the entry — and why must you first scan the chain to update an existing key rather than blindly duplicate it?*

### Insert At Head vs. Tail
*Why is head-insertion \\( O(1) \\) but risks reordering, and when does the existing-key scan dominate the cost anyway?*

## Coding `lookup`
*How do you hash to a bucket and walk its list comparing keys with `equals`, and what do you return when the chain runs out without a match?*

## Coding `delete`
*Why is deletion clean with chaining — just unlink the node by fixing its predecessor's pointer — compared to the tombstone gymnastics open addressing needs?*

## Load Factor \\( \alpha \\)
*Define \\( \alpha = n/m \\) (entries over slots) and explain why it equals the average chain length and thus directly predicts search cost.*

### Why \\( \alpha > 1 \\) Is Allowed
*Why can chaining keep working with more entries than slots, unlike open addressing — what is the cost of letting \\( \alpha \\) grow past 1?*

## Choosing The Bucket Structure
*When might a balanced tree or dynamic array beat a linked list per bucket, and why does Java's HashMap convert a bucket to a tree past a threshold?*

## Time Complexity
*Why does every chaining operation cost "hash the key, then scan one bucket", making expected cost a function of \\( \alpha \\) and worst case a function of the longest chain?*

### insert / lookup / delete — Average Case
*Why are all three \\( O(1 + \alpha) \\) on average with a good hash, and which part is the constant and which part is the chain walk?*

### Worst Case — Everything In One Chain
*What adversarial or degenerate input collapses every key into one bucket, and why does that make all operations \\( O(n) \\)?*

### Effect Of Resizing On Amortized Cost
*Why does keeping \\( \alpha \\) bounded by periodic resizing hold the expected per-operation cost at \\( O(1) \\) amortized?*

## Space Complexity
*Why does chaining use \\( O(n + m) \\) space — the table array of \\( m \\) slots plus one node per entry — and why does each node carry pointer overhead that open addressing avoids?*

### The Pointer-Overhead Tax
*Why does every chained entry cost extra memory for its `next` reference, and how does that add up versus a flat probed table?*

## Trade-offs vs. Open Addressing
*Why does chaining tolerate \\( \alpha > 1 \\) and trivial deletes, but pay in pointer overhead and worse cache locality than a contiguous probed table?*

## Pitfalls
*Where do bugs hide — forgetting to check for an existing key on insert, comparing with `==` instead of `equals`, losing the predecessor pointer on delete, or letting \\( \alpha \\) grow unbounded?*

## Implementation Walkthrough
*Before writing code, plan the pieces below — each prompt tells you what to work out, not the answer.*

### The Bucket Array And Node Type
*How do you declare the array of list heads and the node holding key, value, and next?*

### Hash-To-Bucket Then Scan
*How does each operation share the same first two steps — index into the array, then walk that one chain?*

### Insert With Update-Or-Add
*How do you distinguish "key already present, overwrite value" from "new key, prepend node"?*

### Delete By Unlinking
*How do you track the predecessor as you scan so you can splice a node out of the chain?*

### Triggering A Resize
*Where do you check \\( \alpha \\) after an insert and hand off to a rehash routine?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
