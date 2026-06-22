/**
 * Problem 06 — K-th Smallest via Order-Statistics Tree. Maintain a multiset under insert/delete and
 * answer k-th smallest queries in \(O(\log n)\).
 */
class Problem6 {

	/**
	 * Replays an operation stream over an initially empty multiset. Each operation is a 2-element
	 * array {@code {type, value}}: type 0 inserts {@code value}; type 1 deletes one occurrence of
	 * {@code value}; type 2 asks for the {@code value}-th smallest element (1-indexed). Type-2 answers
	 * are returned in order.
	 *
	 * @param operations the encoded operation stream
	 * @return the k-th smallest (type-2) answers, in order
	 */
	int[] kthSmallestAfterOps(int[][] operations) {
		// TODO: order-statistics Fenwick tree over compressed values; select in O(log n).
		throw new UnsupportedOperationException("TODO: implement kthSmallestAfterOps");
	}
}
