/** Tier 3 — Problem 13: Master Theorem classifier. */
public class Problem13 {

	/**
	 * Given {@code a}, {@code b}, and the exponent {@code d} of the additive term {@code Θ(n^d)},
	 * returns the exponent of {@code n} in the closed-form solution to {@code T(n) = a·T(n/b) +
	 * Θ(n^d)}.
	 *
	 * @param a number of subproblems, a &ge; 1
	 * @param b shrink factor, b &gt; 1
	 * @param d exponent of the additive work term
	 * @return the exponent of n in the solution
	 */
	public double solutionExponent(int a, int b, double d) {
		// TODO: compare d to log_b(a) and return the dominating exponent.
		throw new UnsupportedOperationException("TODO: implement solutionExponent");
	}

	/**
	 * Returns {@code true} when the solution carries an extra logarithmic factor, i.e. the balanced
	 * Master Theorem case where {@code d == log_b(a)}.
	 *
	 * @param a number of subproblems, a &ge; 1
	 * @param b shrink factor, b &gt; 1
	 * @param d exponent of the additive work term
	 * @return whether a logarithmic factor appears
	 */
	public boolean hasLogFactor(int a, int b, double d) {
		// TODO: detect the tie case d == log_b(a) within tolerance.
		throw new UnsupportedOperationException("TODO: implement hasLogFactor");
	}
}
