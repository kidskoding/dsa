/**
 * Problem 18 — Range Update, Range Sum (Lazy Segment Tree). Apply range-add updates and answer
 * range-sum queries, each in \(O(\log n)\) with lazy propagation.
 */
class Problem18 {

	/**
	 * Replays an operation stream over an array of {@code n} positions initialized to zero. Each
	 * operation is a 4-element array: {@code {0, l, r, delta}} adds {@code delta} across {@code [l, r]};
	 * {@code {1, l, r, 0}} queries the inclusive sum over {@code [l, r]}. Type-1 answers are returned
	 * in order.
	 *
	 * @param n the number of positions
	 * @param operations the encoded operation stream
	 * @return the range-sum (type-1) answers, in order
	 */
	long[] rangeSumsAfterRangeUpdates(int n, int[][] operations) {
		// TODO: lazy-propagation segment tree supporting range-add and range-sum.
		throw new UnsupportedOperationException("TODO: implement rangeSumsAfterRangeUpdates");
	}
}
