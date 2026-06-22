/**
 * Problem 04 — Unique Grid Paths.
 *
 * <p>On an {@code m x n} grid, moving only right or down, count the number of distinct paths from
 * the top-left to the bottom-right cell.
 */
public class Problem04 {

	/**
	 * Returns the number of distinct right/down paths across an {@code m x n} grid.
	 *
	 * @param m the number of rows ({@code m >= 1})
	 * @param n the number of columns ({@code n >= 1})
	 * @return the number of distinct paths
	 */
	public long countPaths(int m, int n) {
		// TODO: dp[i][j] = dp[i-1][j] + dp[i][j-1]; first row/column are all 1.
		throw new UnsupportedOperationException("TODO: implement countPaths");
	}
}
