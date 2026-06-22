/**
 * Problem 17 — Range Update, Point Query. Apply range-add updates and answer point queries, each in
 * \(O(\log n)\) via a difference-array Fenwick tree.
 */
class Problem17 {

	/**
	 * Replays an operation stream over an array of {@code n} positions initialized to zero. Each
	 * operation is a 4-element array: {@code {0, l, r, delta}} adds {@code delta} to every position in
	 * {@code [l, r]}; {@code {1, i, 0, 0}} queries the current value at position {@code i}. Type-1
	 * answers are returned in order.
	 *
	 * @param n the number of positions
	 * @param operations the encoded operation stream
	 * @return the point-query (type-1) answers, in order
	 */
	long[] pointValuesAfterRangeUpdates(int n, int[][] operations) {
		// TODO: difference-array Fenwick tree; point value = prefix sum of deltas.
		throw new UnsupportedOperationException("TODO: implement pointValuesAfterRangeUpdates");
	}
}
