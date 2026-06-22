# Linked Lists: Problem Set

Work these in order. Every problem is an implementation task: fill in the stub
in `problemset/` and make its test in `tests/problemset/` pass. The Foundational
problems drill the core pointer-rewiring moves; the Applied problems weave
interview classics together with contest-style challenges, ramping from easy to
hard. All share the `ListNode` helper and are verified the same way. No
solutions are provided.

**Foundational**

## Problem 1: Reverse a Singly Linked List

**LeetCode:** [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)

### Description
Given the `head` of a singly linked list, reverse the list and return the head
of the reversed list. Do it iteratively in \\( O(n) \\) time and \\( O(1) \\)
extra space by rewiring the `next` pointers as you walk.

### Examples
**Example 1:**
```
Input:  1 -> 2 -> 3 -> 4 -> 5
Output: 5 -> 4 -> 3 -> 2 -> 1
```
Every link is flipped to point at the previous node.

**Example 2:**
```
Input:  7
Output: 7
```
A single node is its own reverse.

**Example 3:**
```
Input:  (empty)
Output: (empty)
```
An empty list reverses to an empty list.

### Constraints
- The number of nodes is in the range \\( [0, 5000] \\).
- \\( -5000 \le \text{Node.val} \le 5000 \\).

---

## Problem 2: Find the Middle Node

**LeetCode:** [876. Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)

### Description
Given the `head` of a non-empty singly linked list, return the middle node. If
the list has an even number of nodes, return the second of the two middle nodes.
Use a single pass with the slow/fast two-pointer technique.

### Examples
**Example 1:**
```
Input:  1 -> 2 -> 3 -> 4 -> 5
Output: 3 -> 4 -> 5
```
The middle of five nodes is the third node.

**Example 2:**
```
Input:  1 -> 2 -> 3 -> 4 -> 5 -> 6
Output: 4 -> 5 -> 6
```
For six nodes the second middle (the fourth node) is returned.

**Example 3:**
```
Input:  1
Output: 1
```
A single node is its own middle.

### Constraints
- The number of nodes is in the range \\( [1, 100] \\).
- \\( 1 \le \text{Node.val} \le 100 \\).

---

## Problem 3: Detect a Cycle

**LeetCode:** [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)

### Description
Given the `head` of a singly linked list, return `true` if the list contains a
cycle and `false` otherwise. A cycle exists if some node can be reached again by
continuously following `next`. Use \\( O(1) \\) extra space (Floyd's
slow/fast pointers).

### Examples
**Example 1:**
```
Input:  3 -> 2 -> 0 -> -4, tail connects back to node index 1 (value 2)
Output: true
```
Following `next` from the tail re-enters the list at the node with value 2.

**Example 2:**
```
Input:  1 -> 2, tail connects back to node index 0 (value 1)
Output: true
```
The two-node list loops on itself.

**Example 3:**
```
Input:  1 -> 2 -> 3 -> 4 (no cycle)
Output: false
```
The tail's `next` is null, so traversal terminates.

### Constraints
- The number of nodes is in the range \\( [0, 10^4] \\).
- \\( -10^5 \le \text{Node.val} \le 10^5 \\).

---

## Problem 4: Merge Two Sorted Lists

**LeetCode:** [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)

### Description
You are given the heads of two singly linked lists, `a` and `b`, each sorted in
ascending order. Splice their nodes together into one ascending sorted list and
return its head. The result should be made by reusing the existing nodes, not by
allocating new ones.

### Examples
**Example 1:**
```
Input:  a = 1 -> 2 -> 4, b = 1 -> 3 -> 4
Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4
```
Nodes are interleaved in non-decreasing order.

**Example 2:**
```
Input:  a = (empty), b = (empty)
Output: (empty)
```
Two empty lists merge to an empty list.

**Example 3:**
```
Input:  a = (empty), b = 0
Output: 0
```
Merging with an empty list returns the other list.

### Constraints
- The number of nodes in both lists is in the range \\( [0, 50] \\).
- \\( -100 \le \text{Node.val} \le 100 \\).

---

## Problem 5: Remove Duplicates from a Sorted List

**LeetCode:** [83. Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)

### Description
Given the `head` of a sorted singly linked list, delete all nodes that have
duplicate values so that each value appears exactly once. Return the head of the
modified list, which must remain sorted.

### Examples
**Example 1:**
```
Input:  1 -> 1 -> 2
Output: 1 -> 2
```
The second `1` is dropped.

**Example 2:**
```
Input:  1 -> 1 -> 2 -> 3 -> 3
Output: 1 -> 2 -> 3
```
Each run of equal values collapses to one node.

**Example 3:**
```
Input:  (empty)
Output: (empty)
```
An empty list is unchanged.

### Constraints
- The number of nodes is in the range \\( [0, 300] \\).
- \\( -100 \le \text{Node.val} \le 100 \\), and the list is sorted ascending.

---

**Applied Problems**

## Problem 6: Remove the N-th Node From the End

**LeetCode:** [19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

### Description
Given the `head` of a linked list, remove the `n`-th node from the end of the
list and return its head. Do it in a single pass by advancing one pointer `n`
steps ahead of another so the gap pinpoints the node to unlink.

### Examples
**Example 1:**
```
Input:  head = 1 -> 2 -> 3 -> 4 -> 5, n = 2
Output: 1 -> 2 -> 3 -> 5
```
The 2nd-from-last node (value 4) is removed.

**Example 2:**
```
Input:  head = 1, n = 1
Output: (empty)
```
Removing the only node leaves an empty list.

**Example 3:**
```
Input:  head = 1 -> 2, n = 2
Output: 2
```
Removing the 2nd-from-last node (the head) leaves the tail.

### Constraints
- The number of nodes is `sz`, with \\( 1 \le sz \le 30 \\).
- \\( 1 \le n \le sz \\).

---

## Problem 7: Palindrome Linked List

**LeetCode:** [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)

### Description
Given the `head` of a singly linked list, return `true` if the sequence of
values reads the same forwards and backwards. Aim for \\( O(n) \\) time and
\\( O(1) \\) extra space (find the middle, reverse the second half, compare).

### Examples
**Example 1:**
```
Input:  1 -> 2 -> 2 -> 1
Output: true
```
The values mirror around the center.

**Example 2:**
```
Input:  1 -> 2 -> 3 -> 2 -> 1
Output: true
```
An odd-length palindrome with a lone middle value.

**Example 3:**
```
Input:  1 -> 2
Output: false
```
Reversed it reads `2 -> 1`, which differs.

### Constraints
- The number of nodes is in the range \\( [1, 10^5] \\).
- \\( 0 \le \text{Node.val} \le 9 \\).

---

## Problem 8: Odd-Even Linked List

**LeetCode:** [328. Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/)

### Description
Given the `head` of a singly linked list, group all nodes at odd positions
together followed by the nodes at even positions, then return the reordered
list. Positions are 1-based by index, not by value. Preserve the relative order
within each group and use \\( O(1) \\) extra space.

### Examples
**Example 1:**
```
Input:  1 -> 2 -> 3 -> 4 -> 5
Output: 1 -> 3 -> 5 -> 2 -> 4
```
Odd-position nodes (1,3,5) precede even-position nodes (2,4).

**Example 2:**
```
Input:  2 -> 1 -> 3 -> 5 -> 6 -> 4 -> 7
Output: 2 -> 3 -> 6 -> 7 -> 1 -> 5 -> 4
```
Grouping is by position, so values stay in their original relative order.

**Example 3:**
```
Input:  1 -> 2
Output: 1 -> 2
```
With one node per group, the list is unchanged.

### Constraints
- The number of nodes is in the range \\( [0, 10^4] \\).
- \\( -10^6 \le \text{Node.val} \le 10^6 \\).

---

## Problem 9: Swap Nodes in Pairs

**LeetCode:** [24. Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)

### Description
Given the `head` of a linked list, swap every two adjacent nodes and return its
head. You must change the node links rather than the values. If the list has an
odd number of nodes, the final unpaired node stays in place.

### Examples
**Example 1:**
```
Input:  1 -> 2 -> 3 -> 4
Output: 2 -> 1 -> 4 -> 3
```
Each adjacent pair is swapped.

**Example 2:**
```
Input:  1 -> 2 -> 3
Output: 2 -> 1 -> 3
```
The trailing odd node (value 3) keeps its position.

**Example 3:**
```
Input:  1
Output: 1
```
A single node has nothing to swap.

### Constraints
- The number of nodes is in the range \\( [0, 100] \\).
- \\( 0 \le \text{Node.val} \le 100 \\).

---

## Problem 10: Intersection of Two Linked Lists

**LeetCode:** [160. Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/)

### Description
Given the heads of two singly linked lists `a` and `b`, return the first node at
which they intersect by reference, or `null` if they never intersect. Intersection
means the two lists share the same tail nodes (same objects, not just equal
values). Aim for \\( O(m + n) \\) time and \\( O(1) \\) extra space.

### Examples
**Example 1:**
```
Input:  a = 4 -> 1 -> 8 -> 4 -> 5, b = 5 -> 6 -> 1 -> 8 -> 4 -> 5
        the "8 -> 4 -> 5" tail is the same shared nodes
Output: node with value 8
```
Both lists converge at the shared node holding value 8.

**Example 2:**
```
Input:  a = 1 -> 9 -> 1 -> 2 -> 4, b = 3 -> 2 -> 4 (shared tail 2 -> 4)
Output: node with value 2
```
The shared suffix begins at the node holding value 2.

**Example 3:**
```
Input:  a = 2 -> 6 -> 4, b = 1 -> 5 (no shared nodes)
Output: null
```
The lists are disjoint, so there is no intersection.

### Constraints
- The number of nodes of each list is in the range \\( [0, 3 \times 10^4] \\).
- \\( 1 \le \text{Node.val} \le 10^5 \\).

---

## Problem 11: Reorder List

**LeetCode:** [143. Reorder List](https://leetcode.com/problems/reorder-list/)

### Description
Given the `head` of a singly linked list \\( L_0 \to L_1 \to \dots \to L_n \\),
reorder it in place to \\( L_0 \to L_n \to L_1 \to L_{n-1} \to \dots \\) You may
not modify the values, only the node links. Return the new head.

### Examples
**Example 1:**
```
Input:  1 -> 2 -> 3 -> 4
Output: 1 -> 4 -> 2 -> 3
```
Front and back nodes are interleaved inward.

**Example 2:**
```
Input:  1 -> 2 -> 3 -> 4 -> 5
Output: 1 -> 5 -> 2 -> 4 -> 3
```
With odd length the middle node lands last.

**Example 3:**
```
Input:  1 -> 2
Output: 1 -> 2
```
A two-node list is already in reordered form.

### Constraints
- The number of nodes is in the range \\( [1, 5 \times 10^4] \\).
- \\( 1 \le \text{Node.val} \le 1000 \\).

---

## Problem 12: Add Two Numbers (Most-Significant First)

### Description
Two non-negative integers are stored as singly linked lists of decimal digits in
most-significant-digit-first order, so `7 -> 2 -> 4` represents 724. Given the
heads `a` and `b`, return their sum as a new most-significant-first digit list
with no leading zeros (except the single node `0` for a zero sum). Each list's
value fits in a `long`. This is the Advent-of-Code flavor of LeetCode's "Add Two
Numbers" with the digits running high-to-low.

### Examples
**Example 1:**
```
Input:  a = 7 -> 2 -> 4, b = 5 -> 6   (724 + 56)
Output: 7 -> 8 -> 0                    (780)
```
Adding from the least-significant ends carries into the tens place.

**Example 2:**
```
Input:  a = 0, b = 0
Output: 0
```
A zero sum is the single node `0`.

**Example 3:**
```
Input:  a = 9 -> 9, b = 1            (99 + 1)
Output: 1 -> 0 -> 0                  (100)
```
The carry extends the result by one digit.

### Constraints
- Each list has between 1 and 18 digits.
- The leading digit is non-zero unless the number is the single node `0`.

---

## Problem 13: Rotate List Right

**LeetCode:** [61. Rotate List](https://leetcode.com/problems/rotate-list/)

### Description
Given the `head` of a singly linked list, rotate the list to the right by `k`
places, so the last `k` nodes move to the front. `k` may exceed the list length,
in which case take it modulo the length. Return the new head; an empty list
returns `null`.

### Examples
**Example 1:**
```
Input:  head = 1 -> 2 -> 3 -> 4 -> 5, k = 2
Output: 4 -> 5 -> 1 -> 2 -> 3
```
The last two nodes wrap around to the front.

**Example 2:**
```
Input:  head = 0 -> 1 -> 2, k = 4
Output: 2 -> 0 -> 1
```
`k = 4` modulo length 3 is an effective rotation of 1.

**Example 3:**
```
Input:  head = 1 -> 2 -> 3, k = 3
Output: 1 -> 2 -> 3
```
Rotating by the full length restores the original order.

### Constraints
- The number of nodes is in the range \\( [0, 500] \\).
- \\( -100 \le \text{Node.val} \le 100 \\), and \\( 0 \le k \le 2 \times 10^9 \\).

---

## Problem 14: Train Car Partition

### Description
A freight train is a singly linked list of car weights, and the yard master
picks a pivot weight `x`. Reorder the cars so every car with weight strictly less
than `x` precedes every car with weight `\ge x`, preserving the relative order
within each group. Mutate the links only, not the values. This is the
contest framing of LeetCode's "Partition List."

### Examples
**Example 1:**
```
Input:  cars = 1 -> 4 -> 3 -> 2 -> 5 -> 2, x = 3
Output: 1 -> 2 -> 2 -> 4 -> 3 -> 5
```
Cars lighter than 3 (1,2,2) keep order ahead of the rest (4,3,5).

**Example 2:**
```
Input:  cars = 2 -> 1, x = 2
Output: 1 -> 2
```
The lighter car moves ahead of the pivot-weight car.

**Example 3:**
```
Input:  cars = 1 -> 2 -> 3, x = 0
Output: 1 -> 2 -> 3
```
No car is lighter than the pivot, so order is unchanged.

### Constraints
- The number of cars is in the range \\( [0, 200] \\).
- \\( -100 \le \text{weight} \le 100 \\) and \\( -200 \le x \le 200 \\).

---

## Problem 15: Reverse Nodes in k-Group

**LeetCode:** [25. Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/)

### Description
Given the `head` of a linked list, reverse the nodes of the list `k` at a time
and return the modified list. `k` is a positive integer no larger than the list
length. Nodes left over at the end (fewer than `k`) stay in their original
order. Change only the links, not the values.

### Examples
**Example 1:**
```
Input:  head = 1 -> 2 -> 3 -> 4 -> 5, k = 2
Output: 2 -> 1 -> 4 -> 3 -> 5
```
Each full pair is reversed; the lone node 5 stays put.

**Example 2:**
```
Input:  head = 1 -> 2 -> 3 -> 4 -> 5, k = 3
Output: 3 -> 2 -> 1 -> 4 -> 5
```
The first three reverse; the trailing two are short of `k`.

**Example 3:**
```
Input:  head = 1 -> 2 -> 3 -> 4, k = 4
Output: 4 -> 3 -> 2 -> 1
```
The whole list is a single group and fully reverses.

### Constraints
- The number of nodes is in the range \\( [1, 5000] \\).
- \\( 0 \le \text{Node.val} \le 1000 \\) and \\( 1 \le k \le n \\).

---

## Problem 16: Copy List with Random Pointer

**LeetCode:** [138. Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/)

### Description
You are given the head of a `RandomNode` list where each node carries a `next`
pointer and a `random` pointer that may point to any node in the list or be
`null`. Return a deep copy: a brand-new list of `RandomNode` objects whose `next`
and `random` structure mirrors the original, sharing no nodes with it. Aim for
\\( O(n) \\) time.

### Examples
**Example 1:**
```
Input:  vals = [7, 13, 11, 10, 1], random indices = [null, 0, 4, 2, 0]
Output: a new list with identical values and random targets, distinct objects
```
Node 13's `random` points at node 7 in the copy, just as in the original.

**Example 2:**
```
Input:  vals = [1, 2], random indices = [1, 1]
Output: a new two-node list where both copies' random point at the copied node 2
```
Random pointers reference copied nodes, never the originals.

**Example 3:**
```
Input:  (empty)
Output: (empty)
```
An empty list copies to an empty list.

### Constraints
- The number of nodes is in the range \\( [0, 1000] \\).
- \\( -10^4 \le \text{Node.val} \le 10^4 \\); `random` is `null` or points into the list.

---

## Problem 17: Remove Duplicates From a Sorted List II

**LeetCode:** [82. Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)

### Description
Given the `head` of a sorted singly linked list, delete *every* node that has a
duplicate value, leaving only the values that were originally distinct. Return
the new head, still sorted, in \\( O(n) \\) time. Framed as submarine depth
readings, `1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5` compacts to `1 -> 2 -> 5`.

### Examples
**Example 1:**
```
Input:  1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
Output: 1 -> 2 -> 5
```
Both `3`s and both `4`s are removed entirely.

**Example 2:**
```
Input:  1 -> 1 -> 1 -> 2 -> 3
Output: 2 -> 3
```
The whole run of `1`s disappears, including the head.

**Example 3:**
```
Input:  (empty)
Output: (empty)
```
An empty list is unchanged.

### Constraints
- The number of nodes is in the range \\( [0, 300] \\).
- \\( -100 \le \text{Node.val} \le 100 \\), and the list is sorted ascending.

---

## Problem 18: Next Greater Node in Linked List

**LeetCode:** [1019. Next Greater Node In Linked List](https://leetcode.com/problems/next-greater-node-in-linked-list/)

### Description
A relay team is a singly linked list of runner speeds. For each runner from front
to back, report the speed of the next runner who is strictly faster, or `0` if no
later runner is faster. Return the answers as an array indexed by 0-based
position. Aim for \\( O(n) \\) time using a monotonic stack.

### Examples
**Example 1:**
```
Input:  2 -> 1 -> 5
Output: [5, 5, 0]
```
The next strictly greater value after 2 and after 1 is 5; 5 has none.

**Example 2:**
```
Input:  2 -> 7 -> 4 -> 3 -> 5
Output: [7, 0, 5, 5, 0]
```
Each entry is the first later value that exceeds it, else 0.

**Example 3:**
```
Input:  1 -> 7 -> 5 -> 1 -> 9 -> 2 -> 5 -> 1
Output: [7, 9, 9, 9, 0, 5, 0, 0]
```
Values with no greater successor map to 0.

### Constraints
- The number of nodes is in the range \\( [1, 10^4] \\).
- \\( 1 \le \text{Node.val} \le 10^9 \\).

---

## Problem 19: Merge Zero Segments

**LeetCode:** [2181. Merge Nodes in Between Zeros](https://leetcode.com/problems/merge-nodes-in-between-zeros/)

### Description
A flight recorder is a singly linked list that begins and ends with a `0` node;
between every pair of consecutive zeros lies one console reading's values, and no
two zeros are adjacent. Merge each maximal segment strictly between two zeros into
a single node holding the sum of its values, then drop the zeros. Return the head
of the compacted list.

### Examples
**Example 1:**
```
Input:  0 -> 3 -> 1 -> 0 -> 4 -> 5 -> 2 -> 0
Output: 4 -> 11
```
The first segment sums to 4 and the second to 11.

**Example 2:**
```
Input:  0 -> 1 -> 0 -> 3 -> 0 -> 2 -> 2 -> 0
Output: 1 -> 3 -> 4
```
Each between-zeros segment collapses to its sum.

**Example 3:**
```
Input:  0 -> 5 -> 0
Output: 5
```
A single segment yields a single node.

### Constraints
- The number of nodes is in the range \\( [3, 2 \times 10^5] \\).
- \\( 0 \le \text{Node.val} \le 1000 \\); the list starts and ends with `0` and has no adjacent zeros.

---

## Problem 20: Sort a Linked List

**LeetCode:** [148. Sort List](https://leetcode.com/problems/sort-list/)

### Description
Given the `head` of a singly linked list, return it sorted in ascending order.
Aim for \\( O(n \log n) \\) time and, ideally, \\( O(1) \\) auxiliary space using
a bottom-up merge sort over the links.

### Examples
**Example 1:**
```
Input:  4 -> 2 -> 1 -> 3
Output: 1 -> 2 -> 3 -> 4
```
The nodes are relinked into ascending order.

**Example 2:**
```
Input:  -1 -> 5 -> 3 -> 4 -> 0
Output: -1 -> 0 -> 3 -> 4 -> 5
```
Negative and zero values sort correctly alongside positives.

**Example 3:**
```
Input:  (empty)
Output: (empty)
```
An empty list is already sorted.

### Constraints
- The number of nodes is in the range \\( [0, 5 \times 10^4] \\).
- \\( -10^5 \le \text{Node.val} \le 10^5 \\).

---
