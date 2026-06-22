/**
 * Problem 30 — Burst Balloons.
 *
 * <p>Maximize coins from bursting all balloons, where bursting {@code i} earns
 * {@code nums[left] * nums[i] * nums[right]} (interval DP on the last balloon burst).
 */
class Problem30 {

	/**
	 * Returns the maximum coins collectable by bursting all balloons.
	 *
	 * @param nums the balloon values (non-empty)
	 * @return the maximum coins
	 */
	int maxCoins(int[] nums) {
		// TODO: pad with 1s; dp[i][j] = max over k of dp[i][k] + dp[k][j] + a[i]*a[k]*a[j].
		throw new UnsupportedOperationException("TODO: implement maxCoins");
	}
}
