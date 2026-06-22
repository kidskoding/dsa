/** Tier 1 — Problem 01: Dynamic Order Statistics. */
public class Problem01 {

	/**
	 * Applies a sequence of operations to a multiset and returns the answers to the rank/select
	 * queries embedded in it. Each operation is encoded as a 2-element array {@code {type, value}}
	 * where type 0 inserts {@code value}, type 1 deletes one occurrence of {@code value}, and type 2
	 * asks for the {@code value}-th smallest element (1-indexed). Type-2 results are returned in
	 * order.
	 *
	 * @param operations the encoded operation stream
	 * @return the answers to the type-2 (k-th smallest) queries, in order
	 */
	public int[] kthSmallestAfterOps(int[][] operations) {
		// TODO: maintain an order-statistics structure and answer select queries in O(log n).
		throw new UnsupportedOperationException("TODO: implement kthSmallestAfterOps");
	}
}
