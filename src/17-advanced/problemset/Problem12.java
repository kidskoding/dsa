/**
 * Problem 12 — Count of Range Sum (LeetCode 327). Count range sums {@code S(i, j)} lying within
 * {@code [lower, upper]} in \(O(n \log n)\).
 */
class Problem12 {

	/**
	 * Counts the number of contiguous range sums {@code S(i, j) = nums[i] + ... + nums[j]} (with
	 * {@code i <= j}) that fall within the inclusive bound {@code [lower, upper]}.
	 *
	 * @param nums the input array
	 * @param lower the inclusive lower bound on a range sum
	 * @param upper the inclusive upper bound on a range sum
	 * @return the number of qualifying range sums
	 */
	long countRangeSum(int[] nums, long lower, long upper) {
		// TODO: prefix sums + merge-sort counting (or Fenwick over compressed prefixes).
		throw new UnsupportedOperationException("TODO: implement countRangeSum");
	}
}
