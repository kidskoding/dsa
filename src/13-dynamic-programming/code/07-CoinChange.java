/**
 * Coin change with unbounded supply of each denomination: compute the fewest coins that sum to an
 * amount, and the number of distinct combinations summing to an amount. Both are unbounded-knapsack
 * style DPs running in {@code O(amount * coins)}. See {@code coin-change.md}.
 */
class CoinChange {

	/**
	 * Returns the minimum number of coins that sum exactly to {@code amount}, or {@code -1} when the
	 * amount cannot be formed.
	 *
	 * @param coins the available denominations (positive)
	 * @param amount the target amount ({@code amount >= 0})
	 * @return the fewest coins, or {@code -1} if impossible
	 */
	public int minCoins(int[] coins, int amount) {
		// TODO: dp[a] = 1 + min over c of dp[a - c]; dp[0] = 0, unreachable = infinity.
		throw new UnsupportedOperationException("TODO: implement minCoins");
	}

	/**
	 * Returns the number of distinct combinations of coins (order-insensitive) that sum to {@code
	 * amount}.
	 *
	 * @param coins the available denominations (positive)
	 * @param amount the target amount ({@code amount >= 0})
	 * @return the number of combinations (1 for {@code amount == 0})
	 */
	public int countCombinations(int[] coins, int amount) {
		// TODO: coin loop OUTER, amount loop inner, accumulating dp[a] += dp[a - coin].
		throw new UnsupportedOperationException("TODO: implement countCombinations");
	}
}
