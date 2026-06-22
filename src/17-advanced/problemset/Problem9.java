/**
 * Problem 09 — Range Sum Query - Mutable (LeetCode 307). Support point updates and range-sum
 * queries, each in \(O(\log n)\) using a Fenwick tree.
 */
class Problem9 {

	/**
	 * Replays an operation stream against an initial array. Each operation is a 3-element array
	 * {@code {type, a, b}}: type 0 sets index {@code a} to value {@code b}; type 1 asks for the
	 * inclusive range sum over {@code [a, b]}. Type-1 answers are returned in order.
	 *
	 * @param nums the initial array
	 * @param operations the encoded operation stream
	 * @return the range-sum (type-1) answers, in order
	 */
	long[] rangeSumWithUpdates(int[] nums, int[][] operations) {
		// TODO: back the array with a Fenwick tree; point update and range sum in O(log n).
		throw new UnsupportedOperationException("TODO: implement rangeSumWithUpdates");
	}
}
