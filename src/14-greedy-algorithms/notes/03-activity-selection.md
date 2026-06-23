# Activity Selection

## The Problem: Most Non-Overlapping Intervals
*Given intervals with start and finish times, what exactly are you maximizing and under what constraint?*

## Why the Obvious Greedies Fail
*Why do "shortest activity first" or "earliest start first" pick suboptimal sets?*

### Building a Counterexample
*How would you hand-craft three intervals that defeat the shortest-duration rule?*

## The Greedy Choice: Earliest Finish Time
*Why does always taking the activity that frees the resource soonest leave the most room for the rest?*

## The Algorithm Walked Through
*Sort by finish time, then scan — when do you take an activity and when do you skip it?*

### Tracking the Last Finish Time
*What single variable lets you decide compatibility in \\( O(1) \\) per activity?*

## Why the Greedy Is Optimal (Intuition)
*How would an exchange argument swap an optimal solution's first pick for the earliest-finishing one?*

### Staying-Ahead View
*Why is the greedy set never "behind" an optimal one in finish time after each pick?*

## Interval Scheduling vs. Interval Partitioning
*What's the difference between picking the most jobs and using the fewest rooms?*

## The Weighted Variant
*Why does attaching values to activities break greedy and push you toward DP?*

## Time Complexity
*Where does the work go from input to answer?*

### Sorting Dominates
*Why is the sort by finish time the \\( O(n \log n) \\) bottleneck?*

### The Linear Scan
*Why is the selection pass only \\( O(n) \\), and how does pre-sorted input drop the total to \\( O(n) \\)?*

## Space Complexity
*What memory does the algorithm need beyond the intervals themselves?*

### Storing the Result
*Why is the extra space \\( O(n) \\) for the chosen set in the worst case but only \\( O(1) \\) running state?*

## Real Uses
*Where does this appear — meeting-room booking, CPU job scheduling, bandwidth allocation?*

## Pitfalls
*Why must you sort by finish time, not start time, and how do you handle ties or touching endpoints?*

## Implementation Walkthrough
*How do the pieces of the code map onto the greedy rule?*

### Setup & Sorting
*What comparator do you sort by, and how do you represent each interval?*

### The Selection Loop
*How does the loop compare each activity's start against the last finish and decide to take or skip?*

### Collecting & Returning Results
*How do you record selected activities and end with the maximum compatible set?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
