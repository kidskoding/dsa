/**
 * Problem 19 — Unique Paths II (With Obstacles).
 *
 * <p>Count right/down paths across a grid where cells valued {@code 1} are blocked.
 */
class Problem19 {

	/**
	 * Returns the number of obstacle-free right/down paths across {@code grid}.
	 *
	 * @param grid the grid where {@code 1} marks an obstacle and {@code 0} is open
	 * @return the number of distinct safe paths
	 */
	int uniquePathsWithObstacles(int[][] grid) {
		// TODO: dp[i][j] = (blocked ? 0 : dp[i-1][j] + dp[i][j-1]); start cell seeds 1.
		throw new UnsupportedOperationException("TODO: implement uniquePathsWithObstacles");
	}
}
