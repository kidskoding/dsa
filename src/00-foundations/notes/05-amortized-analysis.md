# Amortized Analysis

## The Problem: Worst-Case per Operation Lies
*Explain why quoting the single most expensive operation overstates the real cost of a long sequence — what question does amortized analysis answer instead?*

## Amortized Is Not Average-Case
*Clarify the difference: amortized makes no probability assumptions and holds for ANY sequence — why is this a stronger guarantee than "average over random inputs"?*

## The Mental Model: Spreading Cost Over Time
*Describe the core intuition of "saving up" for an expensive operation across many cheap ones — what real-world analogy (prepaying, subscriptions) captures it?*

## The Aggregate Method
*Explain the recipe: bound the total cost of \( n \) operations, then divide by \( n \) — what makes this the simplest method, and what's its weakness?*

### Worked Setup: Dynamic Array Doubling
*Set up the aggregate argument for \( n \) appends with table doubling — where do the expensive copies happen and what do the copy costs sum to?*

## The Accounting (Banker's) Method
*Describe assigning each operation a charge that may differ from its real cost, banking the surplus as credit — what invariant must the stored credit always satisfy?*

### Choosing the Right Charge
*Explain how you pick a per-operation charge so credit never goes negative — what's the trial-and-error feel of getting it right?*

### Mapping Credit to Real Objects
*Reason about WHERE credit physically lives (e.g. on each array element) — why does tying credit to objects make the "never negative" check concrete?*

## The Potential Method
*Define a potential function \( \Phi \) and the amortized cost \( \hat{c_i} = c_i + \Phi_i - \Phi_{i-1} \) — what properties must \( \Phi \) have for the bound to be valid?*

### Intuition for Potential
*Explain \( \Phi \) as "stored energy" or "messiness" of the structure — how does an expensive operation correspond to a big drop in \( \Phi \)?*

### Picking \( \Phi \) for a Structure
*Describe how you'd choose a potential for a dynamic array (relate it to how full the array is) — what makes a candidate \( \Phi \) work or fail?*

## Case Study: Dynamic Arrays (ArrayList Growth)
*Walk through why each append is \( O(1) \) amortized despite occasional \( O(n) \) resizes — and why doubling, not adding a constant, is what makes it work.*

### Why Growth-by-Constant Breaks It
*Reason about resizing by adding a fixed chunk instead of doubling — why does the amortized cost degrade to \( O(n) \) per append?*

## Case Study: A Stack With Multipop
*Analyze a stack supporting push, pop, and multipop(k); argue why a sequence is cheap amortized even though one multipop can be \( O(n) \).*

## Case Study: A Binary Counter
*Take incrementing a binary counter and show why the total bit-flips over \( n \) increments is \( O(n) \), making each increment \( O(1) \) amortized.*

## Time Complexity
*Pin down what "amortized \( O(1) \)" actually claims about TIME over a sequence — and how it differs from a per-call worst-case bound.*

### Amortized vs Worst-Case per Operation
*For the dynamic array, contrast the \( O(n) \) single-operation worst case with the \( O(1) \) amortized cost — which one matters for a tight loop of \( n \) appends, and why?*

### Why the Amortized Bound Holds (Intuition)
*Argue informally why doubling makes the total copy work across \( n \) appends sum to \( O(n) \) — what geometric series is hiding in the resize costs?*

### When Amortized Isn't Good Enough
*Reason about a latency-sensitive setting where one \( O(n) \) resize spike is unacceptable even if amortized cost is \( O(1) \) — what does this push you toward (incremental resizing)?*

## Space Complexity
*Explain the memory side of these structures — why does amortized time often come WITH some wasted space?*

### Wasted Space from Doubling
*Reason about how much capacity sits unused right after (and right before) a resize — what's the worst-case fraction of allocated space that's empty?*

### Time–Space Tradeoff in the Growth Factor
*Discuss how the growth factor (2× vs 1.5×) trades amortized time against wasted memory — why might a library pick a smaller factor?*

## Pitfalls and How to Sanity-Check
*Collect common errors: confusing amortized with average, a potential that can go negative, forgetting initial potential — how would you catch each?*

## Where It Shows Up Later
*Name structures whose advertised bounds are amortized (dynamic arrays, hash-table resizing, union-find, splay trees, Fibonacci heaps) — why does the field rely on this so heavily?*

## Implementation Walkthrough
*Plan a dynamic array (or binary counter) from scratch so you can measure its amortized behavior — sketch the parts first.*

### Setup and State
*Decide the fields you need: backing array, size, capacity — what's the initial capacity and why does it matter for the first few appends?*

### The Append / Increment Operation
*Work out the fast path that's usually \( O(1) \) — what condition triggers the slow path?*

### The Resize / Carry Step
*Figure out what the expensive branch does (allocate, copy, swap; or ripple-carry the bits) and why it runs rarely — how does its cost relate to the current size?*

### Instrumenting to Observe Amortization
*Decide what to count (total copies or flips across \( n \) operations) and how you'd divide by \( n \) to confirm the amortized bound empirically.*

## Implementation
```java
// implement from scratch here
```

## My Notes
*Fill this in as you learn*
