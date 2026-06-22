/**
 * Problem 19 — Count Intervals Covering Points (Mixed Stream). Maintain active closed intervals and
 * answer point-coverage queries interleaved with additions, each in \(O(\log n)\).
 */
class Problem19 {

	/**
	 * Replays an operation stream over an initially empty set of closed integer intervals. Each
	 * operation is a 3-element array {@code {type, a, b}}: type 0 adds the interval {@code [a, b]};
	 * type 1 asks how many currently-present intervals cover the point {@code a} (inclusive; {@code b}
	 * is ignored). Type-1 answers are returned in order.
	 *
	 * @param operations the encoded operation stream
	 * @return the coverage-count (type-1) answers, in order
	 */
	int[] coverageCounts(int[][] operations) {
		// TODO: Fenwick tree over compressed coordinates; starts <= a minus ends < a.
		throw new UnsupportedOperationException("TODO: implement coverageCounts");
	}
}
