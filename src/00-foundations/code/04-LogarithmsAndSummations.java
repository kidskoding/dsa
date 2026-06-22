/**
 * Utilities for closed-form summations and logarithm identities. Implement each method from first
 * principles — see the workbook page {@code logarithms-and-summations.md} for the formulas.
 */
class LogarithmsAndSummations {

	/**
	 * Returns {@code floor(log_2(n))} for {@code n >= 1} using only integer operations (no floating
	 * point).
	 *
	 * @param n a positive integer
	 * @return the floor of the base-2 logarithm of n
	 */
	public int floorLog2(long n) {
		// TODO: count how many times n can be halved before reaching 1.
		throw new UnsupportedOperationException("TODO: implement floorLog2");
	}

	/**
	 * Returns the geometric series {@code sum_{i=0}^{terms-1} a·r^i}, handling the {@code r == 1}
	 * case where the sum is simply {@code a·terms}.
	 *
	 * @param a the first term
	 * @param r the common ratio
	 * @param terms the number of terms, terms &ge; 0
	 * @return the value of the geometric sum
	 */
	public double geometricSum(double a, double r, int terms) {
		// TODO: use the closed form (a(1 - r^terms)/(1 - r)), special-casing r == 1.
		throw new UnsupportedOperationException("TODO: implement geometricSum");
	}

	/**
	 * Returns the {@code n}-th harmonic number {@code H_n = sum_{i=1}^{n} 1/i}, with {@code H_0 = 0}.
	 *
	 * @param n the index, n &ge; 0
	 * @return the n-th harmonic number
	 */
	public double harmonic(int n) {
		// TODO: accumulate the reciprocals 1/1 + 1/2 + ... + 1/n.
		throw new UnsupportedOperationException("TODO: implement harmonic");
	}
}
