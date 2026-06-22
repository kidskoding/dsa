/**
 * Problem 27 — 0/1 Knapsack.
 *
 * <p>Choose a subset of items, each taken at most once, maximizing total value without exceeding
 * the weight {@code capacity}.
 */
class Problem27 {

	/**
	 * Returns the maximum value of items fitting within {@code capacity}.
	 *
	 * @param weights the item weights (positive), parallel to {@code values}
	 * @param values the item values (non-negative), parallel to {@code weights}
	 * @param capacity the knapsack capacity ({@code capacity >= 0})
	 * @return the maximum achievable value
	 */
	int knapsack(int[] weights, int[] values, int capacity) {
		// TODO: dp[w] = max(dp[w], dp[w - weights[i]] + values[i]) iterating w downward.
		throw new UnsupportedOperationException("TODO: implement knapsack");
	}
}
