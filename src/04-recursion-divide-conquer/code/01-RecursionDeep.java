/**
 * Recursion fundamentals: base cases, recursive cases, and the call-stack model. Implement each
 * method from scratch — see the workbook page {@code recursion-deep.md}.
 */
class RecursionDeep {

	/**
	 * Returns {@code n!} computed recursively, with {@code 0! = 1}.
	 *
	 * @param n a non-negative integer
	 * @return the factorial of {@code n}
	 */
	public long factorial(int n) {
		// TODO: define the base case (n == 0) and the recursive case.
		throw new UnsupportedOperationException("TODO: implement factorial");
	}

	/**
	 * Returns the {@code n}-th Fibonacci number using the naive double recursion, with {@code fib(0)
	 * = 0} and {@code fib(1) = 1}.
	 *
	 * @param n a non-negative index
	 * @return the {@code n}-th Fibonacci number
	 */
	public long fibonacci(int n) {
		// TODO: two base cases (0 and 1), then fib(n-1) + fib(n-2).
		throw new UnsupportedOperationException("TODO: implement fibonacci");
	}

	/**
	 * Returns the sum {@code 1 + 2 + ... + n} computed recursively, with the empty sum {@code 0} for
	 * {@code n <= 0}.
	 *
	 * @param n the inclusive upper bound
	 * @return the sum of the first {@code n} positive integers
	 */
	public long sumToN(int n) {
		// TODO: base case n <= 0 returns 0, otherwise n + sumToN(n - 1).
		throw new UnsupportedOperationException("TODO: implement sumToN");
	}
}
