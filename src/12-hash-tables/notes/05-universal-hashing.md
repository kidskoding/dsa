# Universal Hashing

## What It Is & Why It Matters
*What does picking a hash function at random from a carefully designed family guarantee that any single fixed function cannot, and why does that guarantee survive adversarial input?*

## The Adversary Problem
*Why can an attacker who knows your one fixed hash function feed inputs that all collide into a single slot, turning expected \\( O(1) \\) into \\( O(n) \\)?*

### Where This Bites In Practice
*Why is this a real security concern (hash-flooding denial-of-service against web servers and language runtimes), not just a theoretical worry?*

## The Core Idea: Randomize The Function, Not The Data
*Why does choosing \\( h \\) randomly at table-creation time mean no fixed input can be "bad" in advance, since the adversary can't predict which \\( h \\) you'll use?*

### Randomness At Setup, Not Per Operation
*Why is the random choice made once when the table is built (and held fixed after), rather than re-rolled on every lookup, and why is that enough?*

## Definition Of A Universal Family
*State the defining guarantee: for any two distinct keys, the probability they collide over a random choice of \\( h \\) is at most \\( 1/m \\) — and why is that exactly "as good as truly random"?*

### Why \\( 1/m \\) Is The Right Target
*Why is \\( 1/m \\) the collision probability you'd get from idealized uniform hashing, so matching it means you lose nothing to adversaries?*

## Constructing A Universal Family
*Sketch the \\( ((a k + b) \bmod p) \bmod m \\) construction — what are the prime \\( p \\), the multiplier \\( a \\), and the offset \\( b \\), and how are they chosen so the family is provably universal?*

### The Role Of The Prime \\( p \\)
*Why must \\( p \\) exceed the key universe and be prime, and what does the inner mod-\\( p \\) step accomplish before the outer mod-\\( m \\)?*

## Expected Collisions From The Bound
*How does the \\( 1/m \\) per-pair collision bound translate into an expected chain length of about \\( \alpha \\), restoring the average-case guarantee for chaining even on worst-case keys?*

## Stronger Independence & \\( k \\)-Wise Variants
*What does \\( k \\)-independence (any \\( k \\) keys behave independently) buy beyond plain universality, and which applications need it?*

## Time Complexity
*Why does universal hashing keep the same expected per-operation cost as ordinary hashing while making that expectation hold for every input — at the price of a little more arithmetic per hash?*

### Expected Operation Cost Over Random h
*Why is each operation expected \\( O(1) \\) where the expectation is now taken over the random choice of \\( h \\), so it holds regardless of which keys arrive?*

### Cost Of Evaluating The Hash
*Why does the \\( ((ak+b) \bmod p) \bmod m \\) evaluation stay \\( O(1) \\) per call, just with a couple more multiplies and mods than a naive hash?*

## Space Complexity
*Why does a universal hash need only \\( O(1) \\) extra storage — the constants \\( a \\), \\( b \\), \\( p \\) (and seed) — independent of the number of keys, so it adds nothing asymptotic to the table?*

## Trade-offs
*Why is the extra arithmetic and the need for randomness at setup worth it for adversarial or untrusted input, but possibly overkill for trusted, fixed data?*

## Pitfalls
*Where do people slip — reusing the same seed across every table, picking a non-prime \\( p \\) or one too small, or assuming universality removes worst-case collisions entirely rather than just making them unlikely?*

## Implementation Walkthrough
*Before writing code, plan the pieces below — each prompt tells you what to work out, not the answer.*

### Choosing The Parameters
*How do you pick the prime \\( p \\), and how do you draw random \\( a \\) and \\( b \\) in their valid ranges at construction time?*

### Evaluating The Function
*How does the hash method apply \\( ((a k + b) \bmod p) \bmod m \\) while guarding against overflow on the multiply?*

### Re-Seeding On Resize
*Why might you draw fresh \\( a, b \\) when the table resizes, and what does that protect against?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
