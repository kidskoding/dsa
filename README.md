# dsa - data structures and algorithms

data strucutures and algorithms in Java

A hands-on **workbook** for mastering data structures and algorithms from the very
first principles. It pairs a readable mdBook (theory, complexity proofs,
edge cases) with Java skeletons and JUnit 5 tests you implement yourself.

This repo ships **blank** on purpose: skeletons with `TODO`s, failing
tests, and prompts to fill in. The answers are yours to write.

## What's inside

Each module folder under `src/` holds:

- `notes/NN-<topic>.md` — the mdBook pages (numbered in reading order).
- `code/NN-<Class>.java` — the Java skeletons you implement.
- `problemset/ProblemNN.java` — one stub per problem.
- `tests/concepts/*Test.java` — JUnit 5 tests for the topic skeletons.
- `tests/problemset/*Test.java` — JUnit 5 tests for the problem set.
- `PROBLEM_SET.md` — the module's problems (Foundational + Applied).

All `.java` files use the default package (no `package` line) and are
compiled per module — flat and dependency-free. Topic skeleton classes are
package-private so the numbered filenames compile.

## Table of Contents

18 modules, 112 topics. Each topic is a fill-in-yourself lecture outline (concept → time & space complexity → implementation walkthrough) paired with a Java skeleton and JUnit 5 tests — except a few concept/proof topics that are notes-only.

<details>
<summary><b>Module 0 — <a href="src/00-foundations/README.md">Foundations</a></b> · 5 topics</summary>

1. [Asymptotic Analysis](src/00-foundations/notes/01-asymptotic-analysis.md)
2. [Recurrence Relations](src/00-foundations/notes/02-recurrence-relations.md)
3. [Proof Techniques](src/00-foundations/notes/03-proof-techniques.md)
4. [Logarithms And Summations](src/00-foundations/notes/04-logarithms-and-summations.md)
5. [Amortized Analysis](src/00-foundations/notes/05-amortized-analysis.md)

[Problem Set »](src/00-foundations/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 1 — <a href="src/01-arrays/README.md">Arrays</a></b> · 4 topics</summary>

1. [Memory Model](src/01-arrays/notes/01-memory-model.md)
2. [Dynamic Arrays](src/01-arrays/notes/02-dynamic-arrays.md)
3. [Multidimensional Arrays](src/01-arrays/notes/03-multidimensional-arrays.md)
4. [Prefix & Suffix Sums and Products](src/01-arrays/notes/04-prefix-sums.md)

[Problem Set »](src/01-arrays/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 2 — <a href="src/02-linked-lists/README.md">Linked Lists</a></b> · 3 topics</summary>

1. [Singly Linked List](src/02-linked-lists/notes/01-singly-linked-list.md)
2. [Doubly Linked List](src/02-linked-lists/notes/02-doubly-linked-list.md)
3. [Skip Lists](src/02-linked-lists/notes/03-skip-lists.md)

[Problem Set »](src/02-linked-lists/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 3 — <a href="src/03-stacks-queues/README.md">Stacks & Queues</a></b> · 4 topics</summary>

1. [Stacks](src/03-stacks-queues/notes/01-stacks.md)
2. [Queues](src/03-stacks-queues/notes/02-queues.md)
3. [Deques](src/03-stacks-queues/notes/03-deques.md)
4. [Monotonic Stack](src/03-stacks-queues/notes/04-monotonic-stack.md)

[Problem Set »](src/03-stacks-queues/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 4 — <a href="src/04-recursion-divide-conquer/README.md">Recursion & Divide and Conquer</a></b> · 6 topics</summary>

1. [Recursion Deep](src/04-recursion-divide-conquer/notes/01-recursion-deep.md)
2. [Divide and Conquer](src/04-recursion-divide-conquer/notes/02-divide-and-conquer.md)
3. [Backtracking](src/04-recursion-divide-conquer/notes/03-backtracking.md)
4. [Closest Pair of Points](src/04-recursion-divide-conquer/notes/04-closest-pair-of-points.md)
5. [Fast Exponentiation](src/04-recursion-divide-conquer/notes/05-fast-exponentiation.md)
6. [Karatsuba Multiplication](src/04-recursion-divide-conquer/notes/06-karatsuba-multiplication.md)

[Problem Set »](src/04-recursion-divide-conquer/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 5 — <a href="src/05-searching-and-sorting/README.md">Searching & Sorting</a></b> · 13 topics</summary>

1. [Linear Search](src/05-searching-and-sorting/notes/01-linear-search.md)
2. [Binary Search](src/05-searching-and-sorting/notes/02-binary-search.md)
3. [Comparison Lower Bound](src/05-searching-and-sorting/notes/03-comparison-lower-bound.md)
4. [Bubble Sort](src/05-searching-and-sorting/notes/04-bubble-sort.md)
5. [Selection Sort](src/05-searching-and-sorting/notes/05-selection-sort.md)
6. [Insertion Sort](src/05-searching-and-sorting/notes/06-insertion-sort.md)
7. [Merge Sort](src/05-searching-and-sorting/notes/07-merge-sort.md)
8. [Quicksort](src/05-searching-and-sorting/notes/08-quicksort.md)
9. [Heapsort](src/05-searching-and-sorting/notes/09-heapsort.md)
10. [Counting Sort](src/05-searching-and-sorting/notes/10-counting-sort.md)
11. [Radix Sort](src/05-searching-and-sorting/notes/11-radix-sort.md)
12. [Bucket Sort](src/05-searching-and-sorting/notes/12-bucket-sort.md)
13. [Quickselect](src/05-searching-and-sorting/notes/13-quickselect.md)

[Problem Set »](src/05-searching-and-sorting/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 6 — <a href="src/06-trees/README.md">Trees</a></b> · 7 topics</summary>

1. [Binary Trees](src/06-trees/notes/01-binary-trees.md)
2. [Binary Search Trees](src/06-trees/notes/02-binary-search-trees.md)
3. [2-3 Trees](src/06-trees/notes/03-2-3-trees.md)
4. [AVL Trees](src/06-trees/notes/04-avl-trees.md)
5. [Red-Black Trees](src/06-trees/notes/05-red-black-trees.md)
6. [Splay Trees](src/06-trees/notes/06-splay-trees.md)
7. [B-Trees](src/06-trees/notes/07-b-trees.md)

[Problem Set »](src/06-trees/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 7 — <a href="src/07-heaps/README.md">Heaps & Priority Queues</a></b> · 4 topics</summary>

1. [Binary Heap](src/07-heaps/notes/01-binary-heap.md)
2. [Build-Heap](src/07-heaps/notes/02-build-heap.md)
3. [d-ary Heaps](src/07-heaps/notes/03-d-ary-heaps.md)
4. [Fibonacci Heaps](src/07-heaps/notes/04-fibonacci-heaps.md)

[Problem Set »](src/07-heaps/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 8 — <a href="src/08-spatial-trees/README.md">Spatial Trees</a></b> · 2 topics</summary>

1. [kd-Trees](src/08-spatial-trees/notes/01-kd-trees.md)
2. [Quadtrees](src/08-spatial-trees/notes/02-quad-trees.md)

[Problem Set »](src/08-spatial-trees/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 9 — <a href="src/09-disjoint-sets/README.md">Disjoint Sets</a></b> · 4 topics</summary>

1. [Union-Find](src/09-disjoint-sets/notes/01-union-find.md)
2. [Path Compression](src/09-disjoint-sets/notes/02-path-compression.md)
3. [Union by Rank](src/09-disjoint-sets/notes/03-union-by-rank.md)
4. [Amortized Analysis & the Inverse Ackermann Function](src/09-disjoint-sets/notes/04-amortized-analysis-inverse-ackermann.md)

[Problem Set »](src/09-disjoint-sets/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 10 — <a href="src/10-graph-fundamentals/README.md">Graph Fundamentals</a></b> · 10 topics</summary>

1. [Graph Representations](src/10-graph-fundamentals/notes/01-representations.md)
2. [Breadth-First Search](src/10-graph-fundamentals/notes/02-bfs.md)
3. [Depth-First Search](src/10-graph-fundamentals/notes/03-dfs.md)
4. [Topological Sort](src/10-graph-fundamentals/notes/04-topological-sort.md)
5. [Strongly Connected Components](src/10-graph-fundamentals/notes/05-strongly-connected-components.md)
6. [Articulation Points & Bridges](src/10-graph-fundamentals/notes/06-articulation-points-bridges.md)
7. [Euler Paths & Circuits](src/10-graph-fundamentals/notes/07-euler-paths.md)
8. [Hamiltonian Paths & Cycles](src/10-graph-fundamentals/notes/08-hamiltonian-paths.md)
9. [Bipartite Graphs & Matching](src/10-graph-fundamentals/notes/09-bipartite-graphs-matching.md)
10. [DAG Shortest Paths](src/10-graph-fundamentals/notes/10-dag-shortest-paths.md)

[Problem Set »](src/10-graph-fundamentals/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 11 — <a href="src/11-graph-algorithms/README.md">Graph Algorithms</a></b> · 9 topics</summary>

1. [Dijkstra's Shortest Paths](src/11-graph-algorithms/notes/01-shortest-paths-dijkstra.md)
2. [Bellman-Ford Shortest Paths](src/11-graph-algorithms/notes/02-shortest-paths-bellman-ford.md)
3. [Floyd-Warshall All-Pairs Shortest Paths](src/11-graph-algorithms/notes/03-floyd-warshall.md)
4. [Johnson's Algorithm](src/11-graph-algorithms/notes/04-johnsons-algorithm.md)
5. [Prim's Minimum Spanning Tree](src/11-graph-algorithms/notes/05-prims.md)
6. [Kruskal's Minimum Spanning Tree](src/11-graph-algorithms/notes/06-kruskals.md)
7. [Ford-Fulkerson Maximum Flow](src/11-graph-algorithms/notes/07-network-flow-ford-fulkerson.md)
8. [Edmonds-Karp Maximum Flow](src/11-graph-algorithms/notes/08-network-flow-edmonds-karp.md)
9. [Minimum Cut](src/11-graph-algorithms/notes/09-minimum-cut.md)

[Problem Set »](src/11-graph-algorithms/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 12 — <a href="src/12-hash-tables/README.md">Hash Tables</a></b> · 6 topics</summary>

1. [Hash Functions](src/12-hash-tables/notes/01-hash-functions.md)
2. [Chaining](src/12-hash-tables/notes/02-chaining.md)
3. [Open Addressing](src/12-hash-tables/notes/03-open-addressing.md)
4. [Amortized Resizing](src/12-hash-tables/notes/04-amortized-resizing.md)
5. [Universal Hashing](src/12-hash-tables/notes/05-universal-hashing.md)
6. [Bloom Filters](src/12-hash-tables/notes/06-bloom-filters.md)

[Problem Set »](src/12-hash-tables/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 13 — <a href="src/13-dynamic-programming/README.md">Dynamic Programming</a></b> · 9 topics</summary>

1. [The Dynamic Programming Paradigm](src/13-dynamic-programming/notes/01-dp-paradigm.md)
2. [0/1 Knapsack](src/13-dynamic-programming/notes/02-knapsack.md)
3. [Longest Common Subsequence](src/13-dynamic-programming/notes/03-longest-common-subsequence.md)
4. [Longest Increasing Subsequence](src/13-dynamic-programming/notes/04-longest-increasing-subsequence.md)
5. [Edit Distance](src/13-dynamic-programming/notes/05-edit-distance.md)
6. [Matrix Chain Multiplication](src/13-dynamic-programming/notes/06-matrix-chain-multiplication.md)
7. [Coin Change](src/13-dynamic-programming/notes/07-coin-change.md)
8. [Rod Cutting](src/13-dynamic-programming/notes/08-rod-cutting.md)
9. [Dynamic Programming on Trees](src/13-dynamic-programming/notes/09-dp-on-trees.md)

[Problem Set »](src/13-dynamic-programming/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 14 — <a href="src/14-greedy-algorithms/README.md">Greedy Algorithms</a></b> · 6 topics</summary>

1. [The Greedy Paradigm](src/14-greedy-algorithms/notes/01-greedy-paradigm.md)
2. [The Exchange Argument](src/14-greedy-algorithms/notes/02-exchange-argument.md)
3. [Activity Selection](src/14-greedy-algorithms/notes/03-activity-selection.md)
4. [Huffman Coding](src/14-greedy-algorithms/notes/04-huffman-coding.md)
5. [Fractional Knapsack](src/14-greedy-algorithms/notes/05-fractional-knapsack.md)
6. [Stable Matching](src/14-greedy-algorithms/notes/06-stable-matching.md)

[Problem Set »](src/14-greedy-algorithms/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 15 — <a href="src/15-string-algorithms/README.md">String Algorithms</a></b> · 3 topics</summary>

1. [KMP](src/15-string-algorithms/notes/01-kmp.md)
2. [Rabin–Karp](src/15-string-algorithms/notes/02-rabin-karp.md)
3. [Z-Algorithm](src/15-string-algorithms/notes/03-z-algorithm.md)

[Problem Set »](src/15-string-algorithms/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 16 — <a href="src/16-tries/README.md">Tries</a></b> · 4 topics</summary>

1. [Trie Basics](src/16-tries/notes/01-trie-basics.md)
2. [Prefix Search](src/16-tries/notes/02-prefix-search.md)
3. [Autocomplete](src/16-tries/notes/03-autocomplete.md)
4. [Compressed Tries (Radix Trees)](src/16-tries/notes/04-compressed-tries.md)

[Problem Set »](src/16-tries/PROBLEM_SET.md)
</details>

<details>
<summary><b>Module 17 — <a href="src/17-advanced/README.md">Advanced</a></b> · 13 topics</summary>

1. [Order-Statistics Trees](src/17-advanced/notes/01-order-statistics-trees.md)
2. [Interval Trees](src/17-advanced/notes/02-interval-trees.md)
3. [Treaps](src/17-advanced/notes/03-treaps.md)
4. [van Emde Boas Trees](src/17-advanced/notes/04-van-emde-boas-trees.md)
5. [Cache-Oblivious Algorithms](src/17-advanced/notes/05-cache-oblivious-algorithms.md)
6. [External-Memory Model](src/17-advanced/notes/06-external-memory-model.md)
7. [Segment Trees](src/17-advanced/notes/07-segment-trees.md)
8. [Lazy Propagation](src/17-advanced/notes/08-lazy-propagation.md)
9. [Fenwick Tree (Binary Indexed Tree)](src/17-advanced/notes/09-fenwick-tree.md)
10. [Fenwick vs Segment Tree](src/17-advanced/notes/10-fenwick-vs-segment-tree.md)
11. [Sparse Tables](src/17-advanced/notes/11-sparse-tables.md)
12. [Suffix Arrays](src/17-advanced/notes/12-suffix-arrays.md)
13. [Suffix Trees](src/17-advanced/notes/13-suffix-trees.md)

[Problem Set »](src/17-advanced/PROBLEM_SET.md)
</details>

## Build & tooling

- **Java 21** + **JUnit 5**, built with **Gradle** (Kotlin DSL).
- The Gradle wrapper (`./gradlew`) downloads Gradle and pulls JUnit from
  Maven Central, so a JDK on your `PATH` is all you need to install.

## Run the book

You can run the book locally using `mdbook`. The roadmap on the intro page is a
[Mermaid](https://mermaid.js.org/) diagram, so you also need the
`mdbook-mermaid` preprocessor. Install both via `cargo`:

```bash
cargo install mdbook mdbook-mermaid
```

Run the book locally to preview it in your browser

```bash
mdbook serve --open
```

> **NOTE**: Math (recurrences, bounds, proofs) renders via MathJax, and the
> roadmap renders via `mdbook-mermaid`.

## Run the tests

```bash
./gradlew test              # compile + test every module
./gradlew test_06-trees     # just one module (task name == folder name)
```

Each module gets its own isolated Gradle source set and test task, so the
duplicate default-package class names across modules (every module has its
own `Problem01`, etc.) don't collide. `ignoreFailures` keeps the build green
so every module runs and reports.

Tests **fail initially** — that's the point. Implement a skeleton until its
tests go green.

## Lint

Style is enforced by [editorconfig-checker](https://github.com/editorconfig-checker/editorconfig-checker)
against the root `.editorconfig` (LF endings, final newline, no trailing
whitespace, tab indentation for `.java`). Run the exact same check CI runs:

```bash
./gradlew lint
```

The checker binary is fetched into `build/tools/` on first use, then run with
`.editorconfig-checker.json`. It exits non-zero and lists `file:line` for any
violation, so run it before you push.

## Distribution & usage

The main repo holds only the blank skeletons (the template).

- It is marked as a **GitHub Template Repository**
- Click **"Use this template"** to create a **standalone repo** of your
  own — not a fork, no "forked from" link, clean history, its own repo
  Public or private, your choice. Fill in your answers there

## CI / CD

- `ci.yml` — compiles every module and runs `./gradlew test`. Tests run
  informationally (`ignoreFailures`) since the template ships unimplemented,
  so the build stays green on the blank workbook
- `deploy-book.yml` — builds and deploys the book to GitHub Pages on push
  to `main`. Enable via Settings → Pages → Source: "GitHub Actions"

## Progress

See [`TODO.md`](TODO.md) for the full module/topic checklist.
