/**
 * Problem 7 — Min Cost Climbing Stairs.
 *
 * <p>Pay {@code cost[i]} to step on stair {@code i}, then climb 1 or 2 stairs. Starting from
 * stair 0 or 1, reach the top (past the last stair) at minimum total cost.
 */
class Problem7 {

	/**
	 * Returns the minimum cost to climb past the last stair.
	 *
	 * @param cost the per-stair costs ({@code cost.length >= 2})
	 * @return the minimum total cost to reach the top
	 */
	int minCostClimbingStairs(int[] cost) {
		// TODO: dp[i] = cost[i] + min(dp[i - 1], dp[i - 2]); answer = min(dp[n - 1], dp[n - 2]).
		throw new UnsupportedOperationException("TODO: implement minCostClimbingStairs");
	}
}
