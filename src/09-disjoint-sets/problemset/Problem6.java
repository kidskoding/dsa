/** Problem 6: Number of Provinces. */
public class Problem6 {

	/**
	 * Given an {@code n x n} symmetric adjacency matrix {@code isConnected} where {@code 1} marks a
	 * direct connection, returns the number of provinces (maximal groups of directly or indirectly
	 * connected cities). Union cities {@code i} and {@code j} whenever {@code isConnected[i][j] == 1},
	 * then count components.
	 *
	 * @param isConnected the symmetric adjacency matrix with ones on the diagonal
	 * @return the number of provinces
	 */
	int findCircleNum(int[][] isConnected) {
		// TODO: union i with j when isConnected[i][j] == 1, then count distinct roots.
		throw new UnsupportedOperationException("TODO: implement findCircleNum");
	}
}
