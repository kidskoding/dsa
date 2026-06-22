/**
 * The longest strictly increasing subsequence (LIS) of an array: the longest subsequence whose
 * values strictly increase left-to-right. The classic DP runs in {@code O(n^2)}; the
 * patience-sorting refinement runs in {@code O(n log n)}. See {@code
 * longest-increasing-subsequence.md}.
 */
class LongestIncreasingSubsequence {

	/**
	 * Returns the length of a longest strictly increasing subsequence of {@code nums} using the
	 * {@code O(n^2)} DP.
	 *
	 * @param nums the input array (non-null)
	 * @return the LIS length (0 for an empty array)
	 */
	public int length(int[] nums) {
		// TODO: dp[i] = 1 + max(dp[j]) over j < i with nums[j] < nums[i].
		throw new UnsupportedOperationException("TODO: implement length");
	}

	/**
	 * Returns the length of a longest strictly increasing subsequence using the {@code O(n log n)}
	 * patience-sorting / binary-search refinement over pile tails.
	 *
	 * @param nums the input array (non-null)
	 * @return the LIS length (0 for an empty array)
	 */
	public int lengthFast(int[] nums) {
		// TODO: maintain tails[]; binary-search the insertion point for each value.
		throw new UnsupportedOperationException("TODO: implement lengthFast");
	}
}
