/**
 * Problem 8 — Coin Change (Minimum Coins).
 *
 * <p>Compute the fewest coins from {@code coins} (unlimited supply) summing to {@code amount}, or
 * {@code -1} if impossible.
 */
class Problem8 {

	/**
	 * Returns the minimum number of coins that sum to {@code amount}, or {@code -1} if impossible.
	 *
	 * @param coins the available denominations (positive)
	 * @param amount the target amount ({@code amount >= 0})
	 * @return the fewest coins, or {@code -1}
	 */
	int coinChange(int[] coins, int amount) {
		// TODO: dp[a] = min over coins c of dp[a - c] + 1; dp[0] = 0, rest = infinity.
		throw new UnsupportedOperationException("TODO: implement coinChange");
	}
}
