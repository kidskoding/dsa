/**
 * Worked illustrations of the dynamic-programming paradigm: identifying overlapping subproblems and
 * optimal substructure, then solving the same recurrence three ways — naive recursion, top-down
 * memoization, and bottom-up tabulation. The running example is the Fibonacci numbers, the simplest
 * recurrence that exposes exponential blow-up under naive recursion. See {@code dp-paradigm.md}.
 */
class DpParadigm {

	/**
	 * Computes the {@code n}th Fibonacci number by naive recursion, recomputing shared subproblems.
	 * Provided to contrast its exponential running time with the memoized and tabulated variants.
	 *
	 * @param n the index ({@code n >= 0}); {@code fib(0) = 0}, {@code fib(1) = 1}
	 * @return the {@code n}th Fibonacci number
	 */
	public long fibNaive(int n) {
		// TODO: base cases for n <= 1, otherwise fibNaive(n-1) + fibNaive(n-2).
		throw new UnsupportedOperationException("TODO: implement fibNaive");
	}

	/**
	 * Computes the {@code n}th Fibonacci number top-down, caching each solved subproblem so it is
	 * computed at most once.
	 *
	 * @param n the index ({@code n >= 0})
	 * @return the {@code n}th Fibonacci number
	 */
	public long fibMemoized(int n) {
		// TODO: allocate a memo table; recurse, returning the cached value when present.
		throw new UnsupportedOperationException("TODO: implement fibMemoized");
	}

	/**
	 * Computes the {@code n}th Fibonacci number bottom-up, filling a table from the base cases
	 * upward.
	 *
	 * @param n the index ({@code n >= 0})
	 * @return the {@code n}th Fibonacci number
	 */
	public long fibTabulated(int n) {
		// TODO: iterate i from 2..n accumulating the previous two values.
		throw new UnsupportedOperationException("TODO: implement fibTabulated");
	}
}
