# External-Memory Model

## What It's For
*Why do we need a different cost model when the data is too big for RAM and lives on disk or SSD?*

## The DAM Model: B and M
*What do block size \( B \) and internal-memory size \( M \) mean, and what exactly does one I/O transfer?*

## Counting I/Os, Not CPU Operations
*Why does the dominant cost become block transfers between disk and memory rather than instructions executed?*

### Why a Random Read Costs the Same as a Block Read
*What does the all-or-nothing block model assume, and why does that reward sequential access patterns?*

## The Scanning Bound
*Why does streaming through \( n \) contiguous elements cost about \( n/B \) I/Os instead of \( n \)?*

## The Sorting Bound
*What is the external sorting cost \( \frac{n}{B}\log_{M/B}\frac{n}{B} \), and what does the \( M/B \)-way merge intuition behind it look like?*

### Why M/B-Way Merge, Not 2-Way
*How many sorted runs can you merge in one pass given memory \( M \) and block size \( B \), and why does that base of the logarithm crush the number of passes?*

## B-Trees as the Native Search Structure
*Why does giving each node fanout proportional to \( B \) drive search cost down to \( \log_B n \) I/Os instead of \( \log_2 n \)?*

### Why Binary Search Trees Are Bad on Disk
*What makes a pointer-chasing binary tree pay one I/O per level, and why is that the wrong shape for disk?*

## Buffering and Batching
*How do buffer trees and write-deferral amortize updates so each one costs far less than a full root-to-leaf I/O path?*

## Time Complexity in I/Os
*Restate every basic operation in the currency of block transfers.*

### Scan, Search, Sort
*State scan \( O(n/B) \), B-tree search \( O(\log_B n) \), and sort \( O\!\left(\frac{n}{B}\log_{M/B}\frac{n}{B}\right) \). For each, name the one structural choice that earns the bound.*

### Updates and Their Amortization
*Why is a single B-tree insert \( O(\log_B n) \) I/Os, and how does batching (buffer trees, LSM) drive the amortized cost below that?*

### Contrast with the RAM Model
*For each operation above, what's the RAM-model cost, and why does ignoring \( B \) mislead you about real disk performance?*

## Space Complexity
*Account for storage on disk and in memory.*

### On-Disk Footprint
*Why is a B-tree's disk space \( O(n/B) \) blocks, and how full must nodes be kept to avoid wasting blocks?*

### In-Memory Working Set
*What must fit in \( M \) for sorting and merging to hit their bounds — how many blocks does an \( M/B \)-way merge hold open at once?*

## Real Uses
*Where does this model govern design — databases, filesystems, key-value stores, log-structured merge trees?*

## Pitfalls
*Why can a RAM-optimal algorithm be I/O-terrible, and what assumptions (single disk, known \( B \)) does the basic model simplify away?*

## Implementation Walkthrough
*Plan an external merge sort before writing it.*

### Run Formation
*How do you read chunks that fill \( M \), sort them in memory, and write sorted runs back to disk? What sets the run length?*

### The Multiway Merge
*How do you keep one input block per run plus one output block in memory, and how do you refill a block when it drains? Prompts only.*

### Buffering Reads and Writes
*Where do you batch I/O so you transfer whole blocks rather than single records, and why does that decide the constant factor?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn.*
