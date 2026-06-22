/**
 * Problem 9 — Coin Change (Count Combinations).
 *
 * <p>Count order-independent combinations of {@code coins} (unlimited supply) summing to
 * {@code amount}.
 */
class Problem9 {

	/**
	 * Returns the number of distinct combinations of {@code coins} that sum to {@code amount}.
	 *
	 * @param amount the target amount ({@code amount >= 0})
	 * @param coins the available denominations (positive)
	 * @return the number of combinations
	 */
	int change(int amount, int[] coins) {
		// TODO: dp[0] = 1; for each coin, for a from coin..amount: dp[a] += dp[a - coin].
		throw new UnsupportedOperationException("TODO: implement change");
	}
}
