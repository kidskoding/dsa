IMPORTANT — THIS IS A WORKBOOK, NOT A SOLUTION SET.
Do NOT fill in any implementations, answers, proofs, or solutions.
Generate skeletons only: signatures, Javadoc, TODO comments, and
`throw new UnsupportedOperationException()` bodies. The STUDENT fills in
the TODOs. Specifically:
- .java implementation/problem files: stubs with TODOs, no real logic.
- Tests: written to define expected behavior, and they must FAIL
  initially (because the code is unimplemented) — that is intentional.
- Markdown workbook sections: leave the prompt/placeholder text only —
  do NOT write the answers.
- PROBLEM_SET problems: statements only, no solutions.
The only things you fully author: structure, scaffolding, config
(book.toml, .editorconfig, CI, Gradle build), problem statements, and
the guiding prompt text in each template section.

---

Create a DSA workbook repo called `dsa` set up
as an mdBook project. The src/ directory contains all markdown
files organized by module folder. Include a book.toml with title
"DSA Mastery". Enable LaTeX math rendering by setting
`mathjax-support = true` under `[output.html]` in book.toml, so proofs
and complexity derivations can be written in real LaTeX (inline `\( \)`,
display `\[ \]` or `$$ $$`). Include a SUMMARY.md linking every module
and topic as chapters and sections. The project should be ready to
serve immediately with `mdbook serve`.

The code alongside the mdBook is plain **Java 21** + **JUnit 5**, built
with **Gradle** (Kotlin DSL). All `.java` files use the default package
(no `package` line). Class names therefore collide across modules (every
module has its own `Problem01`, etc.), so each module gets its own
isolated source set + test task — see the runner below.

---

Build & test setup (Gradle wrapper + `build.gradle.kts`):

- `build.gradle.kts` discovers every module folder under `src/` and gives
  EACH its own isolated source set + `Test` task. `main_<module>` compiles
  the module's `code/` skeletons + `problemset/` stubs (excluding the
  `tests/` subtree); `test_<module>` compiles `tests/` against that output.
  Per-module source sets are what keep the duplicate default-package class
  names from colliding. JUnit 5 (`junit-jupiter` + `junit-platform-launcher`)
  is pulled from Maven Central; the only prerequisite is a JDK on `PATH`
  (the wrapper downloads Gradle itself).

  ```bash
  ./gradlew test              # compile + run every module's JUnit 5 tests
  ./gradlew test_06-trees     # one module (task name == folder name)
  ```

- Tests fail by design (skeletons throw `UnsupportedOperationException`),
  but `ignoreFailures = true` keeps the build green so every module runs
  and reports rather than aborting at the first red module.

---

CI / linting:

1. `.editorconfig` at the root — the source of truth for style: LF line
   endings, final newline, trim trailing whitespace, UTF-8, tab
   indentation for `.java`, spaces elsewhere.

2. `.github/workflows/ci.yml` — GitHub Actions on push (main) and
   pull_request, two jobs:
   - `lint`: runs `editorconfig-checker` (config in
     `.editorconfig-checker.json`, which excludes `build/`, `book/`,
     `SPEC.md`, and the Gradle wrapper).
   - `build`: sets up Temurin JDK 21 and runs `./gradlew test`. Tests fail
     by design, but `ignoreFailures` keeps the build green — it is
     informational and never blocks CI.

3. `.github/workflows/deploy-book.yml` — builds the mdBook with
   `mdbook build` and publishes `book/` to GitHub Pages (actions/
   deploy-pages). Runs on push to main. One-time setup: repo
   Settings → Pages → Source = "GitHub Actions".

---

Each markdown workbook file is a per-topic lecture page. It does NOT use
a single fixed skeleton repeated across topics. Instead each file's H2
(`##`) headers are the SUBTOPICS ACTUALLY RELEVANT to that one topic —
like the section/agenda slides of a college lecture deck for it.

Rules for each file:
- Keep the `# [Topic Name]` H1.
- 4–8 topic-specific `##` sections, distinct per topic. (e.g. Binary
  Search → "Precondition: Sorted Input", "The Loop Invariant",
  "Computing the Midpoint", "Lower vs Upper Bound", "Complexity
  Derivation"; Dijkstra → "Greedy Relaxation", "Priority Queue", "Why It
  Fails on Negative Edges", "\( O((V+E)\log V) \)".)
- Under each header, ONE short *italic* guiding-prompt line — a question
  or instruction, NOT the answer.
- Always include an `## Implementation` section with an empty Java block:

  ```java
  // implement from scratch here
  ```

- End with `## My Notes` and an italic placeholder.
- Use LaTeX (inline `\( \)`) in prompts where natural.
- No "Primary Resources" / external reference section.

---

For every topic that has an implementation, generate three things
(topics are numbered per module, NN = 01, 02, … in lecture order):

1. src/<module>/notes/NN-topic.md — the markdown workbook file (above).
2. src/<module>/code/NN-TopicName.java — Java implementation skeleton
   - Package-private top-level class (no `public`), so the NN- filename
     prefix is a legal compilation unit
   - Full method signatures
   - Javadoc comments explaining what each method should do
   - TODO comments where the student fills in the logic
   - `throw new UnsupportedOperationException()` bodies — skeleton only
3. src/<module>/tests/concepts/TopicNameTest.java — JUnit 5 test file
   - Tests for all core operations
   - Tests for edge cases (empty, single element, duplicates,
     large input)
   - All tests fail initially — that is intentional
   - Descriptive test names:
     insert_intoEmptyTree_rootShouldNotBeNull()

For every module, also generate a problem set:

src/<module>/PROBLEM_SET.md
- 10-20 problems per module ranging from easy to hard
- Organized into three tiers:
  [ ] Tier 1 — Foundational (implement and verify basics)
  [ ] Tier 2 — Conceptual (prove, derive, explain — written in LaTeX)
  [ ] Tier 3 — Challenge (non-obvious applications,
      tricky edge cases, combine multiple concepts)
- Each problem has a clear problem statement
- No solutions

src/<module>/problemset/
- One .java file per Tier 1 and Tier 3 problem (e.g. Problem01.java,
  Problem02.java), each containing that single problem's stub
- Each file: one TODO stub method, method signature + Javadoc
  describing the problem
- Tier 2 problems are proof/derivation based — no code stub
- Name files to match the problem number/title in PROBLEM_SET.md

src/<module>/tests/problemset/ProblemNNTest.java (one test file per problem)
- Failing JUnit 5 tests for every Tier 1 and Tier 3 stub

Example stub format:
/**
 * Given a singly linked list, reverse it in-place
 * in O(n) time and O(1) space.
 */
public ListNode reverseList(ListNode head) {
    // TODO
    throw new UnsupportedOperationException();
}

---

Full module and topic structure:

00-foundations/
  Display name: "Foundations"
  - asymptotic-analysis.md
  - recurrence-relations.md
  - proof-techniques.md
  - logarithms-and-summations.md
  - amortized-analysis.md

01-arrays/
  Display name: "Arrays"
  - memory-model.md
  - dynamic-arrays.md
  - multidimensional-arrays.md

02-linked-lists/
  Display name: "Linked Lists"
  - singly-linked-list.md
  - doubly-linked-list.md
  - skip-lists.md

03-stacks-queues/
  Display name: "Stacks & Queues"
  - stacks.md
  - queues.md
  - deques.md

04-recursion-divide-conquer/
  Display name: "Recursion & Divide and Conquer"
  - recursion-deep.md
  - divide-and-conquer-paradigm.md
  - closest-pair-of-points.md
  - fast-exponentiation.md
  - karatsuba-multiplication.md

05-searching-and-sorting/
  Display name: "Searching & Sorting"
  - linear-search.md
  - binary-search.md
  - comparison-lower-bound.md
  - bubble-sort.md
  - selection-sort.md
  - insertion-sort.md
  - merge-sort.md
  - quicksort.md
  - heapsort.md
  - counting-sort.md
  - radix-sort.md
  - bucket-sort.md

06-trees/
  Display name: "Trees"
  - binary-trees.md
  - binary-search-trees.md
  - 2-3-trees.md
  - avl-trees.md
  - red-black-trees.md
  - splay-trees.md
  - b-trees.md

07-heaps/
  Display name: "Heaps & Priority Queues"
  - binary-heap.md
  - build-heap.md
  - d-ary-heaps.md
  - fibonacci-heaps.md

08-spatial-trees/
  Display name: "Spatial Trees"
  - kd-trees.md
  - quad-trees.md

09-disjoint-sets/
  Display name: "Disjoint Sets"
  - union-find.md
  - path-compression.md
  - union-by-rank.md
  - amortized-analysis-inverse-ackermann.md

10-graph-fundamentals/
  Display name: "Graph Fundamentals"
  - representations.md
  - bfs.md
  - dfs.md
  - topological-sort.md
  - strongly-connected-components.md
  - articulation-points-bridges.md
  - euler-paths.md
  - hamiltonian-paths.md
  - bipartite-graphs-matching.md
  - dag-shortest-paths.md

11-graph-algorithms/
  Display name: "Graph Algorithms"
  - shortest-paths-dijkstra.md
  - shortest-paths-bellman-ford.md
  - floyd-warshall.md
  - johnsons-algorithm.md
  - prims.md
  - kruskals.md
  - network-flow-ford-fulkerson.md
  - network-flow-edmonds-karp.md
  - minimum-cut.md

12-hash-tables/
  Display name: "Hash Tables"
  - hash-functions.md
  - chaining.md
  - open-addressing.md
  - amortized-resizing.md
  - universal-hashing.md
  - bloom-filters.md

13-dynamic-programming/
  Display name: "Dynamic Programming"
  - dp-paradigm.md
  - knapsack.md
  - longest-common-subsequence.md
  - longest-increasing-subsequence.md
  - edit-distance.md
  - matrix-chain-multiplication.md
  - coin-change.md
  - rod-cutting.md
  - dp-on-trees.md

14-greedy-algorithms/
  Display name: "Greedy Algorithms"
  - greedy-paradigm.md
  - exchange-argument.md
  - activity-selection.md
  - huffman-coding.md
  - fractional-knapsack.md
  - stable-matching.md

15-string-algorithms/
  Display name: "String Algorithms"
  - kmp.md
  - rabin-karp.md
  - z-algorithm.md

16-tries/
  Display name: "Tries"
  - trie-basics.md
  - prefix-search.md
  - autocomplete.md
  - compressed-tries.md

17-advanced/
  Display name: "Advanced"
  - order-statistics-trees.md
  - interval-trees.md
  - treaps.md
  - van-emde-boas-trees.md
  - cache-oblivious-algorithms.md
  - external-memory-model.md
  - segment-trees.md
  - lazy-propagation.md
  - fenwick-tree.md
  - fenwick-vs-segment-tree.md
  - sparse-tables.md
  - suffix-arrays.md
  - suffix-trees.md

---

Add a README.md at the root with:
- What this repo is and how to use it
- How to run the book: `mdbook serve`
- How to run tests: `./gradlew test` (and `./gradlew test_<module>`)
- The student workflow:
  1. Read the topic in mdBook
  2. Open the .java skeleton in your editor
  3. Implement until tests pass
  4. Work through PROBLEM_SET.md
  5. Fill in notes and reflections in the markdown
- A [ ] checkbox progress tracker for every topic

---

Add a "Distribution & Usage" section to README.md explaining how to use
the workbook:
- The main repo holds only the blank skeletons (the template).
- Mark the main repo as a GitHub Template Repository
  (Settings → check "Template repository").
- To start working, click "Use this template" → this creates a
  standalone repo of your own (NOT a fork — no "forked from" link,
  clean history, shows up as its own repo). Public or private, your
  choice. Fill in your answers there.

---

Add a TODO.md at the root — the master progress tracker:
- [ ] checkbox per module, with nested [ ] checkboxes per topic
- A separate section tracking PROBLEM_SET completion per module
  (Tier 1 / Tier 2 / Tier 3)
- Grouped by module in the same order as the structure above
- This is the single place the student checks off overall progress
