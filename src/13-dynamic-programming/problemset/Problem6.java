/**
 * Problem 6 — Minimum Falling Path Sum.
 *
 * <p>Find the minimum sum of a falling path through an {@code n x n} matrix, moving each step to
 * the cell directly below or diagonally below.
 */
class Problem6 {

	/**
	 * Returns the minimum falling path sum through {@code matrix}.
	 *
	 * @param matrix the square matrix (non-empty)
	 * @return the minimum falling path sum
	 */
	int minFallingPathSum(int[][] matrix) {
		// TODO: dp[r][c] = matrix[r][c] + min(dp[r-1][c-1], dp[r-1][c], dp[r-1][c+1]).
		throw new UnsupportedOperationException("TODO: implement minFallingPathSum");
	}
}
