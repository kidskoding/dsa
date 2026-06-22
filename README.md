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
- `PROBLEM_SET.md` — the module's problems (Coding / Conceptual / Challenge).

All `.java` files use the default package (no `package` line) and are
compiled per module — flat and dependency-free. Topic skeleton classes are
package-private so the numbered filenames compile.

## Build & tooling

- **Java 21** + **JUnit 5**, built with **Gradle** (Kotlin DSL).
- The Gradle wrapper (`./gradlew`) downloads Gradle and pulls JUnit from
  Maven Central, so a JDK on your `PATH` is all you need to install.

## Run the book

You can run the book locally using `mdbook`, which you can install via `cargo`

```bash
cargo install mdbook
```

Run the book locally to preview it in your browser

```bash
mdbook serve --open
```

> **NOTE**: Math (recurrences, bounds, proofs) renders via MathJax.

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

## Student workflow

1. Read the topic in the mdBook
2. Open the `.java` skeleton in your editor
3. Implement until the tests pass
4. Work through `PROBLEM_SET.md` for the module
5. Fill in your notes and reflections in the markdown
6. Check the topic off in `TODO.md`

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
