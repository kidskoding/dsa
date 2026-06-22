# Rabin–Karp

## The Problem & The Hashing Idea
*Why turn substring comparison into number comparison, and what does that buy you?*

## Hashing a Window
*How is a fixed-length substring mapped to a single numeric fingerprint?*

### Polynomial Hash
*Why treat the characters as digits of a number in some base when forming the hash?*

## The Rolling Hash Update
*Why can the next window's hash be computed in \\( O(1) \\) from the previous one?*

### Remove-Left, Add-Right
*What two operations slide the window, and why does precomputing the high-power constant matter?*

## Modular Arithmetic & Collisions
*How does the modulus keep numbers bounded, and what is a spurious (false-positive) hit?*

### Why Mod Doesn't Break the Roll
*Why does taking everything mod a prime still let the remove-left/add-right update work?*

## Verifying Matches
*Why must every hash match be confirmed character-by-character before reporting it?*

## Choosing Base and Modulus
*How do a large prime modulus and a good base reduce collisions, and why use double hashing?*

## Multi-Pattern & 2D Search
*How does fingerprinting extend to searching many patterns at once or matching grids?*

## Rabin–Karp vs. KMP
*When is hashing preferable to a failure function, and when is the worst case a dealbreaker?*

## Time Complexity
*Why does the same algorithm have such different best and worst behavior?*

### Building Hashes
*Why is computing the initial pattern and window hash \\( O(m) \\), and each roll \\( O(1) \\)?*

### Expected Case
*Why is the total \\( O(n + m) \\) expected when collisions are rare and verifications few?*

### Worst Case with Collisions
*Why does an adversarial input that forces a verify at every position degrade to \\( O(nm) \\)?*

## Space Complexity
*What memory does the algorithm need?*

### Single-Pattern Footprint
*Why is the auxiliary space \\( O(1) \\) — a few hash values and the precomputed power — for one pattern?*

### Multi-Pattern Sets
*Why does searching many patterns cost \\( O(k) \\) extra to store their fingerprints in a set?*

## Real Uses
*Where do rolling hashes appear — plagiarism detection, rsync chunking, substring dedup?*

## Pitfalls
*Why do integer overflow, a tiny modulus, or skipping verification quietly break correctness?*

## Implementation Walkthrough
*How do the hashing pieces become working code?*

### Setup: Base, Modulus & Precomputed Power
*What constants do you fix, and why precompute base raised to the window length minus one?*

### Initial Hashes
*How do you build the pattern hash and the first window hash before the main loop?*

### The Rolling Loop
*How does each step compare hashes, verify on a hit, then roll to the next window?*

### Guarding Against Overflow & False Positives
*How do you keep arithmetic inside the modulus and always confirm a hash hit?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
