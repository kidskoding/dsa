import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

/**
 * Utilities for exercising proof techniques computationally. Implement each method from first
 * principles — see the workbook page {@code proof-techniques.md} for induction, well-ordering, and
 * contradiction.
 */
class ProofTechniques {

	/**
	 * Empirically checks a statement that is claimed to hold for all integers by induction: verifies
	 * the base case at {@code base} and that {@code predicate} holds for every integer in {@code
	 * [base, upTo]}. Returns {@code true} only if every checked instance holds.
	 *
	 * @param predicate the proposition P(k) to test
	 * @param base the base case value
	 * @param upTo inclusive upper bound to test up to
	 * @return whether the predicate held for every value in the range
	 */
	public boolean verifyByInduction(IntPredicate predicate, int base, int upTo) {
		// TODO: confirm the base case, then walk the inductive range checking the predicate.
		throw new UnsupportedOperationException("TODO: implement verifyByInduction");
	}

	/**
	 * Returns the smallest integer in {@code [from, to]} for which {@code predicate} is true — the
	 * least counterexample used in well-ordering / minimal-counterexample arguments — or {@code -1}
	 * if no such integer exists in the range.
	 *
	 * @param predicate the property identifying a counterexample
	 * @param from inclusive lower bound of the search
	 * @param to inclusive upper bound of the search
	 * @return the least witness, or -1 when none is found
	 */
	public int leastCounterexample(IntPredicate predicate, int from, int to) {
		// TODO: scan upward and return the first integer satisfying the predicate.
		throw new UnsupportedOperationException("TODO: implement leastCounterexample");
	}

	/**
	 * Confirms a closed-form claim by contradiction-style exhaustive disagreement: returns {@code
	 * true} if {@code closedForm} and {@code direct} agree for every integer in {@code [from, to]},
	 * and {@code false} as soon as a disagreeing value (a contradiction) is found.
	 *
	 * @param closedForm the proposed closed-form function
	 * @param direct the directly computed reference function
	 * @param from inclusive lower bound
	 * @param to inclusive upper bound
	 * @return whether the two functions agree over the whole range
	 */
	public boolean agreesEverywhere(
			IntUnaryOperator closedForm, IntUnaryOperator direct, int from, int to) {
		// TODO: compare the two functions across the range, failing fast on mismatch.
		throw new UnsupportedOperationException("TODO: implement agreesEverywhere");
	}
}
