/**
 * Utilities for solving divide-and-conquer recurrences. Implement each method from first principles
 * — see the workbook page {@code recurrence-relations.md} for the Master Theorem and recursion-tree
 * method.
 */
class RecurrenceRelations {

	/**
	 * Classifies a recurrence of the form {@code T(n) = a·T(n/b) + Θ(n^d)} using the Master Theorem
	 * and returns the exponent {@code e} such that the solution is {@code Θ(n^e)} (ignoring any
	 * logarithmic factor in the tie case).
	 *
	 * @param a number of subproblems, a &ge; 1
	 * @param b factor by which the problem size shrinks, b &gt; 1
	 * @param d exponent of the additive work term
	 * @return the exponent of n in the closed-form solution
	 */
	public double masterExponent(int a, int b, double d) {
		// TODO: compare d against log_b(a) and return the dominating exponent.
		throw new UnsupportedOperationException("TODO: implement masterExponent");
	}

	/**
	 * Returns {@code true} if the Master Theorem tie case applies, i.e. {@code d == log_b(a)}, in
	 * which case the solution carries an extra logarithmic factor: {@code Θ(n^d log n)}.
	 *
	 * @param a number of subproblems, a &ge; 1
	 * @param b factor by which the problem size shrinks, b &gt; 1
	 * @param d exponent of the additive work term
	 * @return whether the balanced (tie) case of the Master Theorem applies
	 */
	public boolean hasLogFactor(int a, int b, double d) {
		// TODO: test whether d equals log_b(a) within tolerance.
		throw new UnsupportedOperationException("TODO: implement hasLogFactor");
	}
}
