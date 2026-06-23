# Fast Exponentiation

## The Problem & When to Use It
*When you need a power of something with a huge exponent, why not just loop and multiply?*

## Naive Repeated Multiplication
*Why is multiplying one factor at a time wasteful, and exactly how many multiplications does it spend?*

## The Squaring Insight
*How does \\( x^n = (x^{n/2})^2 \\) cut the remaining work roughly in half at each step?*

### Why Halving the Exponent Is the Whole Trick
*What is the key realization that lets you reuse one squared value instead of recomputing from scratch?*

## Odd vs Even Exponents
*What extra factor of \\( x \\) appears when the exponent is odd, and how do you fold it in?*

### Handling the Parity at Each Step
*How does testing the lowest bit of the exponent decide whether you multiply in an extra factor?*

## Recursive Top-Down Version
*How do you code "halve the exponent, square the result, multiply once if odd"?*

### Base Case
*What exponent ends the recursion, and what value does it return?*

### Why You Square the Returned Value, Not Recompute
*What goes wrong for the cost if you call the recursion twice instead of squaring its single result?*

## Iterative Binary Version
*How do the bits of the exponent tell you when to square and when to multiply?*

### Reading the Exponent's Bits
*How does scanning \\( n \\) bit by bit drive an accumulator alongside a running square?*

### Why the Running Square Tracks Powers of Two
*What does the repeatedly-squared base represent at the moment you inspect each bit?*

## The Mental Model
*How do you see the exponent's binary representation as a recipe of "square always, multiply on a set bit"?*

## Modular Exponentiation
*How does taking a remainder at each step keep the intermediate numbers small for cryptographic use?*

### Why You Can Reduce at Every Step
*What property of modular arithmetic lets you take the remainder after each multiply without changing the result?*

## Time Complexity
*How do you reason about the cost without deriving a recurrence?*

### Counting the Multiplications
*Why does halving the exponent each step give a number of multiplications tied to the bit-length of \\( n \\)?*

### Recursive vs Iterative Step Count
*Why do both forms perform essentially the same number of squarings and multiplies?*

### When Operand Size Matters
*Why does the per-multiply cost stop being constant once the numbers grow into bignum territory?*

## Space Complexity
*Where does each version spend memory?*

### Iterative Constant Space
*Why does the loop need only a couple of accumulator variables regardless of the exponent?*

### Recursive Call-Stack Depth
*Why does the top-down version cost stack depth proportional to the bit-length of \\( n \\)?*

## Common Bugs & Edge Cases
*What goes wrong with exponent zero, negative exponents, integer overflow, a missing modulo, or squaring before handling the odd factor?*

## Real-World & Interview Uses
*Where do cryptography, hashing, matrix-power tricks, and modular arithmetic rely on this?*

## Implementation Walkthrough
*Before writing code, decide each part.*

### Signature & Setup
*What does the method take, and what accumulator and running-base variables do you initialize?*

### The Base Case or Loop Guard
*What condition ends the recursion, or what condition keeps the loop running over the exponent's bits?*

### The Square-and-Maybe-Multiply Step
*In what order do you inspect the current bit, multiply into the accumulator if set, and square the base?*

### Optional Modular Reduction
*Where exactly do you take the remainder so numbers stay bounded?*

### Termination & Return
*What does the method return once the exponent is exhausted, and what should it return for exponent zero?*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
