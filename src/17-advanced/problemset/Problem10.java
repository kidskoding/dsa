/**
 * Problem 10 — Range Minimum Queries with Updates. Support point updates and range-minimum queries,
 * each in \(O(\log n)\) using a segment tree.
 */
class Problem10 {

	/**
	 * Replays an operation stream against an initial array. Each operation is a 3-element array
	 * {@code {type, a, b}}: type 0 sets index {@code a} to value {@code b}; type 1 asks for the
	 * minimum over the inclusive range {@code [a, b]}. Type-1 answers are returned in order.
	 *
	 * @param nums the initial array
	 * @param operations the encoded operation stream
	 * @return the range-minimum (type-1) answers, in order
	 */
	int[] rangeMinWithUpdates(int[] nums, int[][] operations) {
		// TODO: back the array with a segment tree; point update and range-min in O(log n).
		throw new UnsupportedOperationException("TODO: implement rangeMinWithUpdates");
	}
}
