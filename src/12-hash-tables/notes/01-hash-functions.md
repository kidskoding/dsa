# Hash Functions

## What It Is & Why It Matters
*What job does a hash function do in a hash table — turning an arbitrary key into a slot index — and why does its quality single-handedly decide whether lookups stay fast?*

## Properties Of A Good Hash Function
*Which traits do you want: determinism, fast computation, and spreading keys evenly across slots — and why does each one matter for performance?*

### Determinism & Speed
*Why must the same key always hash to the same slot, and why does a slow hash defeat the whole point of \\( O(1) \\) access?*

### Uniformity (Avoiding Hot Slots)
*Why do you want keys scattered so no single slot gets overloaded, and what happens to operation cost when the function clumps keys together?*

### Avalanche: Small Key Change, Big Hash Change
*Why is it desirable that flipping one bit of the key scrambles the whole hash, and how does poor avalanche let near-identical keys collide?*

## From Hash Code To Index
*Why do you separate "compute an integer hash code from the key" from "fold that integer into \\( [0, m) \\)", and how does each stage have its own pitfalls?*

### Handling Negative Or Overflowed Codes
*Why can a raw integer hash code be negative or wrap around, and how must you sanitize it before using it as an array index?*

## The Division Method
*How does `hash mod m` map a key into the table, and why is the choice of \\( m \\) (favor a prime, avoid powers of two) so important here?*

### Why Powers Of Two Are Dangerous
*Why does a power-of-two modulus effectively keep only the low bits of the hash, and what kind of key patterns does that expose?*

## The Multiplication Method
*How does multiplying by a constant fraction and taking the fractional part spread keys, and why is it more forgiving about the value of \\( m \\)?*

## Hashing Non-Integer Keys
*How would you turn a string, tuple, or object into an integer first — e.g. polynomial rolling for strings — and why must equal keys always produce equal codes?*

### The hashCode / equals Contract
*Why must any two objects that are `equals` produce the same hash code, and what subtle bug appears if you override one without the other?*

## The Simple Uniform Hashing Assumption
*What idealization (every key equally likely to land in any slot, independently) do average-case analyses lean on, and when does real-world structured data violate it?*

## Time Complexity
*Why is a hash function's own runtime — not just the table's — part of every operation's cost, and what determines it?*

### Cost Of Computing The Hash
*Why is hashing a fixed-width integer \\( O(1) \\) but hashing a string \\( O(L) \\) in its length \\( L \\), and how does that feed into overall lookup cost?*

### How The Hash Shapes Table Operation Cost
*Why does a good hash give expected \\( O(1) \\) per table operation while a poor one collapses toward \\( O(n) \\) by overloading a few slots?*

## Space Complexity
*Why does a hash function itself use \\( O(1) \\) space (just a few constants or a seed), independent of how many keys you hash, and where does the actual storage cost live instead?*

## Trade-offs
*Why might you accept a slower but stronger hash (better spread, avalanche, adversary-resistance) versus a fast weak one, and what governs that choice?*

## Pitfalls
*Where do hash functions go wrong — using a power-of-two modulus that throws away high bits, ignoring part of the key, forgetting to handle negatives, or letting structured input create patterns?*

## Implementation Walkthrough
*Before writing code, plan the pieces below — each prompt tells you what to work out, not the answer.*

### Computing An Integer Hash Code
*How do you derive a well-mixed integer from the key type you care about, and how do you fold a multi-field or string key in?*

### Reducing To A Slot Index
*How do you map the (possibly negative or oversized) code into \\( [0, m) \\) safely, and which modulus choice are you committing to?*

### A Polynomial String Hash
*How does a rolling Horner-style loop combine each character with a multiplier to hash a string, and what base do you pick?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
