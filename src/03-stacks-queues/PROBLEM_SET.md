# Stacks & Queues: Problem Set

Work top to bottom. Coding problems are implemented against the stubs in
`problemset/`. Conceptual problems are proofs and derivations — write them in
LaTeX in your notes, with no code. Challenge problems are harder problems
implemented against the stubs in `problemset/`. No solutions are provided.

## Coding

- [ ] **Problem 01: Valid parentheses.** Given a string of brackets drawn from
  `()[]{}`, return whether every opening bracket is closed by a matching closing
  bracket in the correct order. Use a stack in \\( O(n) \\) time.
- [ ] **Problem 02: Evaluate Reverse Polish Notation.** Given tokens in postfix
  form (integers and the operators `+ - * /`), evaluate the expression with a
  stack and return the integer result.
- [ ] **Problem 03: Queue from two stacks.** Implement a FIFO queue using only
  two stacks. Support `Enqueue` and `Dequeue` with amortized \\( O(1) \\) cost.
- [ ] **Problem 04: Stack from two queues.** Implement a LIFO stack using only
  two queues. Support `Push` and `Pop`.
- [ ] **Problem 05: Min stack.** Design a stack that supports `Push`, `Pop`, and
  `GetMin`, where `GetMin` returns the minimum element on the stack in
  \\( O(1) \\).
- [ ] **Problem 06: Sliding window maximum.** Given an array and a window size
  \\( k \\), return the maximum of each contiguous window using a monotonic deque
  in \\( O(n) \\) time.

## Conceptual

- [ ] **Problem 07.** Prove that the dynamic-array-backed stack achieves
  amortized \\( O(1) \\) per `Push` under doubling. Use the aggregate (or
  accounting) method and state the potential function if you use the potential
  method.
- [ ] **Problem 08.** Prove that the two-stack queue (Problem 03) performs
  \\( n \\) operations in \\( O(n) \\) total time, i.e. amortized \\( O(1) \\) per
  operation. Define a potential function over the two stacks and show each
  operation has \\( O(1) \\) amortized cost.
- [ ] **Problem 09.** Prove the correctness of the monotonic-deque sliding-window
  maximum (Problem 06): state the invariant maintained by the deque and prove
  that each element is enqueued and dequeued at most once, giving \\( \Theta(n) \\)
  total work.
- [ ] **Problem 10.** A circular-buffer queue of fixed capacity \\( m \\) uses head
  and tail indices modulo \\( m \\). Prove that `Enqueue`/`Dequeue` are \\( O(1) \\)
  worst case, and characterize exactly when the full and empty states are
  indistinguishable without an extra count or sentinel.
- [ ] **Problem 11.** Show that any algorithm deciding whether a bracket string of
  length \\( n \\) is balanced requires \\( \Omega(n) \\) time, and argue why the
  stack-based recognizer is therefore optimal in time. Comment on its worst-case
  space.

## Challenge

- [ ] **Problem 12: Largest rectangle in histogram.** Given bar heights, return
  the area of the largest axis-aligned rectangle that fits under the histogram.
  Use a monotonic stack in \\( O(n) \\) time.
- [ ] **Problem 13: Basic calculator.** Evaluate a string expression containing
  non-negative integers, `+`, `-`, and parentheses. Use stacks to handle nesting
  in a single pass.
- [ ] **Problem 14: Maximum in all subarrays via deque.** Given an array and a
  window size \\( k \\), return the minimum of each window using a monotonic deque,
  generalizing the sliding-window technique.
- [ ] **Problem 15: Decode string.** Given an encoded string like `3[a2[c]]`,
  return the decoded string using a stack to manage nested repetition counts.
- [ ] **Problem 16: Trapping rain water.** Given an elevation map, compute how
  much water it can trap after raining. Solve it with a monotonic stack in
  \\( O(n) \\) time and \\( O(n) \\) extra space.
