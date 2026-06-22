# Foundations: Problem Set

Computational warm-ups on growth rates, operation counting, and the closed forms behind summations and recurrences. Every problem returns a single number — fill in the stub in `problemset/` and make its test in `tests/problemset/` pass.

**Foundational**

## Problem 1: Nested Loop Operation Count

### Description

A doubly nested loop runs the inner index `j` from the outer index `i` up to `n` (inclusive on `i`, exclusive on `n`):

```
for i in 0..n-1:
    for j in i..n-1:
        op()      // count this
```

Given an integer `n`, return the exact number of times `op()` executes. This is the triangular number `n(n+1)/2`.

### Examples

**Example 1:**
```
Input:  n = 4
Output: 10
```
The inner loop runs 4, 3, 2, 1 times for i = 0, 1, 2, 3, summing to 10.

**Example 2:**
```
Input:  n = 1
Output: 1
```

**Example 3:**
```
Input:  n = 0
Output: 0
```

### Constraints

- `0 <= n <= 100000`

---

## Problem 2: Geometric Series Sum

### Description

Given a first term `a`, an integer ratio `r`, and a count `k`, return the sum of the geometric series `a + a*r + a*r^2 + ... + a*r^(k-1)`, i.e. `sum over i=0..k-1 of a*r^i`. Handle the `r = 1` case (the sum is `a*k`).

### Examples

**Example 1:**
```
Input:  a = 1, r = 2, k = 4
Output: 15
```
1 + 2 + 4 + 8 = 15.

**Example 2:**
```
Input:  a = 3, r = 1, k = 5
Output: 15
```
With ratio 1 every term is 3, so the sum is 3 * 5 = 15.

**Example 3:**
```
Input:  a = 2, r = 3, k = 3
Output: 26
```
2 + 6 + 18 = 26.

### Constraints

- `1 <= k <= 30`
- `1 <= r <= 10`
- the result fits in a 64-bit signed integer

---

## Problem 3: Floor of Log Base 2

### Description

Given an integer `n >= 1`, return `floor(log2(n))` using only integer operations (no floating point). This equals the index of the highest set bit, or the number of times you can halve `n` before reaching 1.

### Examples

**Example 1:**
```
Input:  n = 1
Output: 0
```
2^0 = 1 <= 1 < 2.

**Example 2:**
```
Input:  n = 8
Output: 3
```
2^3 = 8 <= 8 < 16.

**Example 3:**
```
Input:  n = 100
Output: 6
```
2^6 = 64 <= 100 < 128.

### Constraints

- `1 <= n <= 2000000000`

---

## Problem 4: Harmonic Number

### Description

Given an integer `n >= 0`, return the `n`-th harmonic number `H_n = sum over i=1..n of 1/i` as a double, with `H_0 = 0`.

### Examples

**Example 1:**
```
Input:  n = 0
Output: 0.0
```

**Example 2:**
```
Input:  n = 1
Output: 1.0
```

**Example 3:**
```
Input:  n = 4
Output: 2.0833333333333335
```
1 + 1/2 + 1/3 + 1/4 = 25/12.

### Constraints

- `0 <= n <= 1000000`

---

## Problem 5: Sum of First N Squares

### Description

Given an integer `n >= 0`, return `sum over i=1..n of i^2`, which has the closed form `n(n+1)(2n+1)/6`.

### Examples

**Example 1:**
```
Input:  n = 3
Output: 14
```
1 + 4 + 9 = 14.

**Example 2:**
```
Input:  n = 0
Output: 0
```

**Example 3:**
```
Input:  n = 5
Output: 55
```
1 + 4 + 9 + 16 + 25 = 55.

### Constraints

- `0 <= n <= 1000000`

---

**Applied Problems**

## Problem 6: Dynamic Array Doubling Copy Cost

### Description

A dynamic array starts with capacity 1 and doubles its capacity whenever a push would overflow. Each doubling copies all currently stored elements into the new buffer. Simulate `n` pushes and return the total number of element copies performed across all resizes.

### Examples

**Example 1:**
```
Input:  n = 1
Output: 0
```
The first push fits in the initial capacity-1 buffer; no copy.

**Example 2:**
```
Input:  n = 4
Output: 3
```
Resizes happen at the 2nd, 3rd, and 5th push; for n = 4 we copy 1 + 2 = 3 elements (capacity grows 1 -> 2 -> 4).

**Example 3:**
```
Input:  n = 5
Output: 7
```
Capacity grows 1 -> 2 -> 4 -> 8, copying 1 + 2 + 4 = 7 elements.

### Constraints

- `0 <= n <= 1000000`

---

## Problem 7: Sum of All Subarray Sums

### Description

Given an array `a` of length `m`, return the sum of the sums of every contiguous subarray. Element `a[i]` appears in `(i+1)*(m-i)` subarrays, so the answer is `sum over i of a[i]*(i+1)*(m-i)` — computable in linear time.

### Examples

**Example 1:**
```
Input:  a = [1, 2, 3]
Output: 20
```
Subarrays: [1]=1, [2]=2, [3]=3, [1,2]=3, [2,3]=5, [1,2,3]=6, totaling 20.

**Example 2:**
```
Input:  a = [4]
Output: 4
```

**Example 3:**
```
Input:  a = [1, 1]
Output: 4
```
[1]=1, [1]=1, [1,1]=2, totaling 4.

### Constraints

- `1 <= m <= 100000`
- the result fits in a 64-bit signed integer

---

## Problem 8: Trailing Zeros of a Factorial

### Description

Given an integer `n >= 0`, return the number of trailing zeros in `n!` in base 10. This equals `floor(n/5) + floor(n/25) + floor(n/125) + ...`, counting factors of 5.

### Examples

**Example 1:**
```
Input:  n = 5
Output: 1
```
5! = 120 ends in one zero.

**Example 2:**
```
Input:  n = 25
Output: 6
```
floor(25/5) + floor(25/25) = 5 + 1 = 6.

**Example 3:**
```
Input:  n = 3
Output: 0
```
3! = 6 has no trailing zero.

### Constraints

- `0 <= n <= 2000000000`

---

## Problem 9: Reduce a Fraction

### Description

Given a `numerator` and a nonzero `denominator`, reduce the fraction to lowest terms using the Euclidean algorithm. Return a two-element array `[num, den]` with the sign normalized so that `den` is always positive.

### Examples

**Example 1:**
```
Input:  numerator = 6, denominator = 8
Output: [3, 4]
```

**Example 2:**
```
Input:  numerator = -4, denominator = -2
Output: [2, 1]
```
Both negatives cancel; gcd(4, 2) = 2.

**Example 3:**
```
Input:  numerator = 3, denominator = -9
Output: [-1, 3]
```
The sign moves to the numerator.

### Constraints

- `-1000000000 <= numerator <= 1000000000`
- `1 <= |denominator| <= 1000000000`

---

## Problem 10: Log Factorial Cost

### Description

Given an integer `n >= 0`, return `log2(n!)` computed as `sum over i=1..n of log2(i)` as a double. This summation grows as `Theta(n log n)` and equals `0.0` for `n = 0` or `n = 1`.

### Examples

**Example 1:**
```
Input:  n = 1
Output: 0.0
```
log2(1) = 0.

**Example 2:**
```
Input:  n = 2
Output: 1.0
```
log2(1) + log2(2) = 0 + 1 = 1.

**Example 3:**
```
Input:  n = 4
Output: 4.584962500721156
```
log2(2) + log2(3) + log2(4) = 1 + 1.585 + 2.

### Constraints

- `0 <= n <= 1000000`

---

## Problem 11: Recursion Tree Total Work

### Description

For a power-of-two `n`, the recurrence `T(n) = 2*T(n/2) + n` builds a recursion tree where each level contributes exactly `n` work and there are `log2(n) + 1` levels. Given such an `n`, return the total work summed across every node, which equals `n*(log2(n) + 1)`.

### Examples

**Example 1:**
```
Input:  n = 1
Output: 1
```
A single node of work 1; log2(1) + 1 = 1 level.

**Example 2:**
```
Input:  n = 8
Output: 32
```
8 * (3 + 1) = 32.

**Example 3:**
```
Input:  n = 4
Output: 12
```
4 * (2 + 1) = 12.

### Constraints

- `n` is a power of two, `1 <= n <= 1073741824`

---

## Problem 12: Binary Counter Bit Flips

### Description

Starting from zero, perform `k` increments on a binary counter. Each increment flips a run of trailing 1s to 0 and then sets one 0 to 1, flipping every bit it touches. Return the total number of bit flips performed across all `k` increments. The amortized cost approaches 2 flips per increment.

### Examples

**Example 1:**
```
Input:  k = 1
Output: 1
```
0 -> 1 flips one bit.

**Example 2:**
```
Input:  k = 4
Output: 7
```
Flips: 1 + 2 + 1 + 3 = 7 to reach 100.

**Example 3:**
```
Input:  k = 8
Output: 15
```

### Constraints

- `0 <= k <= 1000000000`

---

## Problem 13: Digit Power Summation

### Description

For every integer from 1 to `n`, raise each of its decimal digits to the power `p` and accumulate. Return the total sum of all those digit-powers across the whole range.

### Examples

**Example 1:**
```
Input:  n = 11, p = 2
Output: 288
```
Numbers 1..9 contribute their digit squared, summing to 1+4+9+...+81 = 285; 10 adds 1^2+0^2 = 1; 11 adds 1^2+1^2 = 2, for 288 total.

**Example 2:**
```
Input:  n = 9, p = 1
Output: 45
```
Each number 1..9 is a single digit; raising to power 1 leaves it unchanged, summing to 45.

**Example 3:**
```
Input:  n = 10, p = 2
Output: 286
```
1^2 + 2^2 + ... + 9^2 = 285, plus 10 contributes 1^2 + 0^2 = 1, totaling 286.

### Constraints

- `1 <= n <= 100000`
- `1 <= p <= 6`

---

## Problem 14: Collatz Step Counter

### Description

Starting at a positive integer `n`, repeatedly halve it when even or replace it with `3n + 1` when odd. Return the number of steps required to first reach 1.

### Examples

**Example 1:**
```
Input:  n = 1
Output: 0
```
Already at 1.

**Example 2:**
```
Input:  n = 6
Output: 8
```
6 -> 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1 is 8 steps.

**Example 3:**
```
Input:  n = 7
Output: 16
```

### Constraints

- `1 <= n <= 1000000`

---

## Problem 15: Triangular Layer Budget

### Description

A triangular stack places `i` crates in layer `i`, so the first `k` layers need `k(k+1)/2` crates. Given a crate budget, return the largest number of complete layers `k` such that `k(k+1)/2 <= crates`.

### Examples

**Example 1:**
```
Input:  crates = 10
Output: 4
```
1+2+3+4 = 10 fits exactly; a 5th layer would need 15.

**Example 2:**
```
Input:  crates = 0
Output: 0
```

**Example 3:**
```
Input:  crates = 11
Output: 4
```
10 used by 4 layers; the 5th needs 15, which exceeds 11.

### Constraints

- `0 <= crates <= 2000000000`

---

## Problem 16: Exponential Overtakes Polynomial

### Description

Return the smallest positive integer `n` such that `2^n > n^k` for a given exponent `k`. This shows concretely that `2^n` eventually dominates any fixed polynomial `n^k`. Compare in a way that avoids overflow (e.g. logarithms or careful big-integer style growth).

### Examples

**Example 1:**
```
Input:  k = 1
Output: 1
```
2^1 = 2 > 1^1 = 1.

**Example 2:**
```
Input:  k = 2
Output: 5
```
2^5 = 32 > 5^2 = 25, and no smaller n works (2^4 = 16 < 16 is not strictly greater).

**Example 3:**
```
Input:  k = 3
Output: 10
```
2^10 = 1024 > 10^3 = 1000.

### Constraints

- `1 <= k <= 10`

---

## Problem 17: Tribonacci Modulo

### Description

Evaluate the recurrence `T(k) = T(k-1) + T(k-2) + T(k-3)` with `T(0) = 0`, `T(1) = 1`, `T(2) = 1`, and return `T(k) mod 1000000007`. Iterate to stay within machine integers.

### Examples

**Example 1:**
```
Input:  k = 0
Output: 0
```

**Example 2:**
```
Input:  k = 4
Output: 4
```
T(3) = 0+1+1 = 2, T(4) = 1+1+2 = 4.

**Example 3:**
```
Input:  k = 10
Output: 149
```

### Constraints

- `0 <= k <= 1000000`

---
