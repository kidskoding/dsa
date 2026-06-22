/**
 * Problem 5 — Kth Smallest Element. Given an array and a 1-indexed {@code k}, return the k-th
 * smallest element ({@code k == 1} is the minimum). Aim for average linear time with a
 * quickselect-style partition; do not perform a full sort.
 */
class Problem5 {

	/**
	 * Returns the {@code k}-th smallest value in {@code nums} (1-indexed), where {@code k == 1} is
	 * the minimum and {@code k == nums.length} is the maximum.
	 *
	 * @param nums the input array; may contain duplicates
	 * @param k the 1-indexed rank to retrieve, with {@code 1 <= k <= nums.length}
	 * @return the k-th smallest element
	 */
	int kthSmallest(int[] nums, int k) {
		// TODO: quickselect for the (k-1)-th order statistic.
		throw new UnsupportedOperationException("TODO: implement kthSmallest");
	}
}
