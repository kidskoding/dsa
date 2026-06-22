/**
 * Problem 29 — Matrix Chain Multiplication.
 *
 * <p>Given the chain dimensions {@code dims}, return the minimum number of scalar multiplications
 * to multiply the matrix chain (interval DP).
 */
class Problem29 {

	/**
	 * Returns the minimum scalar multiplications to multiply the chain described by {@code dims}.
	 *
	 * @param dims the dimension array of length {@code n+1} for {@code n} matrices
	 * @return the minimum number of scalar multiplications
	 */
	long minScalarMultiplications(int[] dims) {
		// TODO: dp[i][j] = min over k of dp[i][k] + dp[k+1][j] + dims[i]*dims[k+1]*dims[j+1].
		throw new UnsupportedOperationException("TODO: implement minScalarMultiplications");
	}
}
