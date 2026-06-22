/**
 * Problem 01 — Static Prefix Sums. Precompute a prefix-sum table and answer inclusive range-sum
 * queries in \(O(1)\) each over an immutable array.
 */
class Problem1 {

	/**
	 * Answers a batch of inclusive range-sum queries over an immutable array. Each query is a
	 * 2-element array {@code {l, r}} asking for the sum of {@code nums[l..r]}. Answers are returned
	 * in query order.
	 *
	 * @param nums the immutable array
	 * @param queries the inclusive {@code {l, r}} range queries
	 * @return the range sums, in query order
	 */
	long[] rangeSums(int[] nums, int[][] queries) {
		// TODO: build a prefix-sum table once, then answer each query in O(1).
		throw new UnsupportedOperationException("TODO: implement rangeSums");
	}
}
