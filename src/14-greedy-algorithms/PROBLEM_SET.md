# Greedy Algorithms: Problem Set

Work these in order. Coding problems are implemented against the stubs in
`problemset/`, Conceptual problems are proofs and derivations written in LaTeX
(no code), and Challenge problems are harder implementations against the stubs.

---

## Coding

### Problem 01: Minimum Coins (Canonical System)
Given a canonical coin system (e.g. `{1, 5, 10, 25}`) and an integer `amount >= 0`,
return the minimum number of coins whose values sum to `amount`. Assume the system
is canonical so the largest-coin-first greedy is optimal. Return `0` for `amount == 0`.

### Problem 02: Interval Point Stabbing
Given a list of closed intervals `[start, end]`, return the minimum number of points
on the line such that every interval contains at least one chosen point. Use the
earliest-end-first greedy.

### Problem 03: Maximum Non-Overlapping Intervals
Given a list of intervals, return the maximum number of mutually non-overlapping
intervals you can keep (equivalently, the fewest to delete to remove all overlaps).

### Problem 04: Fractional Job Scheduling Profit
Given jobs each with a `weight` and a `duration`, order them to minimize the total
weighted completion time. Return the optimal total weighted completion time using
the Smith-ratio (shortest-weighted-processing-time) greedy.

### Problem 05: Lexicographically Smallest Subsequence
Given a digit string and an integer `k`, remove exactly `k` digits so the remaining
string (with order preserved) forms the smallest possible number. Return it as a
string with no leading zeros (except the value `"0"`).

---

## Conceptual

### Problem 06: Exchange Argument for Earliest Finish Time
Prove that the earliest-finish-time greedy for activity selection produces a
maximum-cardinality compatible set. State the exchange step formally: given an
optimal solution \\(O\\) and the greedy choice \\(g\\), show \\(O\\) can be transformed
into a solution containing \\(g\\) without reducing \\(|O|\\).

### Problem 07: Optimality of Huffman Codes
Prove the greedy-merge property: in an optimal prefix code, the two least-frequent
symbols \\(x, y\\) are siblings at maximum depth. Then argue by induction on the
alphabet size that Huffman's construction is optimal. Make the cost-difference
\\(\Delta = (d_x - d_z)(f_z - f_x)\\) explicit.

### Problem 08: Matroids and Greedy
Define a matroid \\((E, \mathcal{I})\\) and state the theorem that the greedy
algorithm maximizes weight over the independent sets of a matroid iff the system
is a matroid. Prove the forward direction (matroid \\(\Rightarrow\\) greedy optimal).

### Problem 09: Proposer-Optimality of Gale–Shapley
Prove that the deferred-acceptance algorithm, run with one side proposing, yields
the proposer-optimal stable matching: every proposer is matched to the best
receiver achievable in any stable matching. Use the notion of a "valid partner"
and induction on the first proposer rejected by a valid partner.

### Problem 10: Greedy Fails: A Counterexample Discipline
Construct a smallest counterexample showing the largest-coin-first greedy is not
optimal for the coin system \\(\{1, 3, 4\}\\). Then state, in general terms, the
property a problem must have (greedy-choice + optimal substructure) for a greedy
strategy to be sound, and explain why this system violates it.

---

## Challenge

### Problem 11: Minimum Spanning Forest via Kruskal
Given a weighted undirected graph as an edge list, return the total weight of a
minimum spanning forest using Kruskal's greedy with union-find. Handle disconnected
graphs (return the spanning forest weight).

### Problem 12: Task Scheduler with Deadlines and Penalties
Given unit-time tasks each with a `deadline` and a `penalty`, schedule them on a
single machine to minimize total penalty for late tasks. Return the minimum total
penalty (the classic matroid-scheduling problem).

### Problem 13: Minimum Number of Refueling Stops
Given a target distance, a starting fuel, and a list of `(position, fuel)` stations
along the way, return the minimum number of refueling stops needed to reach the
target, or `-1` if it is impossible. Use a max-heap greedy over passed stations.

### Problem 14: Maximize Capital with k Projects
Given `k`, starting `capital`, and projects each with a `(capital_required, profit)`,
select at most `k` projects (sequentially, profits add to capital) to maximize final
capital. Return the maximum capital.
