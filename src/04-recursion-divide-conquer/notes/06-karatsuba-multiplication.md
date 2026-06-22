# Karatsuba Multiplication

## The Problem & When It Pays Off
*Why do we need a faster multiply for very large numbers, and at what size does the overhead start to win?*

## Schoolbook Multiply
*Why does the grade-school digit-by-digit method scale quadratically, and exactly what work does it duplicate?*

## Splitting Numbers in Half
*How do you write each factor as \( a \cdot 10^{m} + b \) (or the base-2 equivalent)?*

### Choosing the Split Point
*How does the digit count decide where to cut, and what do you do when the length is odd?*

## The Four-Product Expansion
*When you multiply the split forms out, which four partial products appear, and which two are the "corners"?*

### Why Naively This Is Still Four Multiplies
*What makes the straightforward expansion no better than schoolbook in the number of big multiplications?*

## The Three-Multiplication Trick
*How does computing \( (a+b)(c+d) \) let you recover the middle term and drop one of the four products?*

### Recovering the Middle Term
*Which two already-computed products do you subtract from \( (a+b)(c+d) \) to isolate the cross term?*

## The Mental Model
*How do you see three smaller multiplications replacing four, recursively, as the source of the speedup?*

## Combining the Pieces
*How do the three partial products recombine with shifts and a subtraction into the final number?*

### Where the Shifts Come From
*Why does each partial product get multiplied by a specific power of the base when reassembled?*

## Recursion Structure
*How do the three multiplications become three recursive calls, and what is the base case?*

### The Call Stack
*How deep does the recursion go, and what does each frame compute before returning its partial product?*

### The Base Case
*At what operand size do you stop recursing and just multiply directly, and why?*

## Mapping It to Code
*How do you handle the shifts, the additions, the subtraction, and the carries when assembling the result?*

## Time Complexity
*How do you reason about the cost without formally solving the recurrence?*

### Three Subproblems of Half Size
*Why does replacing four half-size multiplies with three change the growth rate at all?*

### The Resulting Exponent
*Why does three-way branching on half-size inputs land near \( n^{1.585} \) rather than \( n^2 \)?*

### The Hidden Constant Factor
*Why do the extra additions, subtractions, and shifts inflate the constant, hurting small inputs?*

## Space Complexity
*Where does Karatsuba spend memory beyond the operands?*

### Recursion-Stack Depth
*Why is the stack depth tied to how many times the operands can be halved?*

### Temporary Sums and Partial Products
*Why do the intermediate sums \( a+b \), \( c+d \), and the three products need scratch space at each level?*

## Trade-offs vs Alternatives
*Why is Karatsuba slower than schoolbook on small inputs, and where do FFT-based methods eventually take over?*

## Common Bugs & Edge Cases
*What goes wrong with odd splits, leading zeros, a negative middle term, mismatched operand lengths, or a missed shift?*

## Real-World & Interview Uses
*Where do bignum libraries and arbitrary-precision arithmetic use this algorithm?*

## Implementation Walkthrough
*Before writing code, decide each part.*

### Signature & Setup
*What representation do the operands use, and how do you read their length to pick a split point?*

### The Base Case Branch
*At what size do you fall back to direct multiplication, and what do you return there?*

### Splitting Into High and Low Halves
*How do you extract \( a, b \) and \( c, d \) from each operand without losing digits?*

### The Three Recursive Products
*Which three products do you compute, and how do you form the \( (a+b) \) and \( (c+d) \) inputs?*

### Recombining With Shifts
*How do you apply the powers of the base and the middle-term subtraction to assemble the result?*

### Termination & Return
*What final number does the top-level call return, and how do you confirm carries were handled?*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
