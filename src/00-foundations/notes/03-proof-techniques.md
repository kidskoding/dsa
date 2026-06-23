# Proof Techniques

## Why Algorithms Need Proofs, Not Just Tests
*Explain what a proof of correctness buys you that a passing test suite never can — what category of bug do finite tests structurally miss?*

## Anatomy of a Claim
*Break a statement like "for all sorted arrays, binary search returns the target if present" into its quantifier, hypothesis, and conclusion — what exactly must you establish?*

### Universal vs Existential Claims
*Contrast "for all" and "there exists" claims — how does the burden of proof (and the way to disprove) flip between them?*

## Direct Proof
*Describe chaining from hypothesis to conclusion using definitions and known facts — how do you decide the first thing to write down?*

## Proof by Contrapositive
*Explain why proving \\( \lnot Q \Rightarrow \lnot P \\) settles \\( P \Rightarrow Q \\), and give the gut-check for when the contrapositive is the easier direction.*

## Proof by Contradiction
*Describe assuming the negation and chasing it to an absurdity — what makes a claim a good candidate for this technique?*

### Contradiction vs Contrapositive
*These feel similar — pin down the difference in what you assume and what you conclude, and when each reads more cleanly.*

## Mathematical Induction: The Engine
*Lay out base case and inductive step as a "domino" argument — what is the inductive hypothesis actually letting you assume?*

### Weak vs Strong Induction
*Compare assuming just \\( k \\) versus all of \\( 1..k \\) — describe a problem (proving a recursive routine correct) where you genuinely need the strong form.*

### Structural Induction
*Explain induction over recursively-defined structures (trees, lists) — how does the base case become "the leaf/empty case" and the step become "assume children correct"?*

### Induction Pitfalls
*Collect the classic failures: forgetting the base case, a base case that doesn't connect to the step, assuming what you're proving — pick one and show how it sneaks in.*

## Loop Invariants: Induction for Iterative Code
*State the initialization, maintenance, and termination pattern — explain how it's just induction over loop iterations in disguise.*

### Designing an Invariant
*Given a loop (try insertion sort's outer loop), describe how you'd find an invariant strong enough to imply correctness at termination.*

### Initialization, Maintenance, Termination
*For your chosen loop, lay out what each of the three steps must show — which one most often reveals an off-by-one bug?*

## Counterexamples
*Explain why a single counterexample destroys a "for all" claim, and how hunting for one is a debugging strategy before you commit to a proof.*

## Proof by Cases (Exhaustive Reasoning)
*Describe when you must split into cases and what "exhaustive" requires — what's the risk if your cases overlap or leave a gap?*

## Reasoning About Complexity Claims
*Explain how proof technique underpins a complexity statement — when you assert an algorithm is \\( O(n\log n) \\), what is the implicit "for all inputs of size \\( n \\)" claim, and how would induction or an invariant justify it?*

### Time-Bound Arguments via Invariants
*Show how a loop invariant about "work done so far" can prove a running-time bound, not just correctness — what quantity would the invariant track?*

### Space-Bound Arguments via Induction
*Reason about proving a recursive routine never exceeds \\( O(\log n) \\) stack depth — how does induction on the recursion depth give that bound?*

## Connecting Proofs to Real Algorithm Analysis
*Map each technique to where it shows up later: invariants for iterative algorithms, induction for recursion, contradiction for greedy/optimality, counterexamples for disproving a heuristic — which would you reach for first on a greedy proof?*

## Implementation Walkthrough
*Plan code that DEMONSTRATES a proof technique — e.g. a function whose loop invariant you can assert and check at runtime — sketch its parts first.*

### Setup and State
*Decide what state the loop maintains and what invariant you claim about it — where will you assert it?*

### The Main Loop and Its Invariant
*Work out where in the loop body the invariant is temporarily broken and where it's restored (maintenance) — what assertion catches a violation?*

### Termination and the Conclusion
*Figure out the loop's exit condition and what the invariant guarantees at that moment — how does it yield the correctness conclusion?*

### Turning the Argument Into a Test
*Decide how you'd encode the invariant as runtime checks or property-based tests so the proof and the code agree.*

## Implementation
```java
// implement from scratch here
```

## Summary
*Recap the whole topic in a few lines — the core idea, the key complexities and trade-offs, and when to reach for it. The cheat-sheet you'd skim before an exam or interview.*

## My Notes
*Fill this in as you learn*
