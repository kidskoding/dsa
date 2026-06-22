# Bucket Sort

## What It Is & When to Use It
*How does spreading keys into buckets achieve linear expected time, and what input does it assume?*

## The Uniform-Distribution Assumption
*Why does bucket sort rely on inputs spread evenly over a known range, and what happens when they aren't?*

### Why Even Spread Means Tiny Buckets
*If keys are uniform, why does each bucket hold only a handful of elements on average?*

## How Scattering into Buckets Works
*How do you map each key to a bucket index so that buckets stay in sorted order relative to each other?*

### The Index Mapping Formula
*For a key in a known range and \( b \) buckets, what formula sends it to the right bucket?*

### Choosing the Number of Buckets
*How does bucket count affect the size of each bucket and the work to sort it?*

## Sorting Within Buckets
*Which subroutine sorts each bucket, and why is insertion sort the common choice for small buckets?*

## Concatenation
*Why does gathering the buckets in index order produce a fully sorted array?*

## Stability & Space
*Why does bucket sort need \( O(n + b) \) extra space, and when is it stable?*

## Time Complexity
*Why does the cost split into scatter, per-bucket sort, and gather — reason about each.*

### Expected (Average) Case
*Under uniform input, why does the per-bucket sorting total only \( O(n) \), giving \( O(n + b) \) overall?*

### Worst Case
*What skewed input dumps everything into one bucket, and why does that collapse the cost to the inner sort's \( O(n^2) \)?*

### Why the Distribution Drives Everything
*Why is bucket sort's complexity a statement about the input distribution, not just \( n \)?*

## Space Complexity
*Why does bucket sort allocate \( O(n + b) \) for the buckets, and why is it not in-place?*

### The Cost of Too Many Buckets
*Why does choosing far more buckets than elements waste space without helping time?*

## Trade-offs vs Radix & Counting Sort
*When do you reach for bucket sort over the other linear-time sorts, given its distribution assumption?*

## Common Bugs & Edge Cases
*Where do bad index mapping, out-of-range keys, or empty buckets cause problems?*

## Real-World Uses
*Where do uniformly distributed floats or known-range data — like sorting fractions in \( [0, 1) \) — fit bucket sort?*

## Implementation Walkthrough
*Break the algorithm into the parts you must get right before you write a line.*

### Setup & Bucket Allocation
*How many buckets do you create, and what container holds each one?*

### The Scatter Pass
*How do you compute each element's bucket index and append it?*

### Sorting Each Bucket
*How do you run the inner sort over every non-empty bucket?*

### The Gather Pass & Return
*How do you walk the buckets in order and write elements back to produce the sorted output?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
