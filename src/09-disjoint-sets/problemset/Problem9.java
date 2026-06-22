/** Problem 9: Number of Operations to Make Network Connected. */
public class Problem9 {

	/**
	 * Returns the minimum number of cables that must be moved so that all {@code n} computers
	 * (labelled {@code 0..n-1}) are connected, or {@code -1} if it cannot be done. Each entry of
	 * {@code connections} is an undirected cable. There must be at least {@code n - 1} cables;
	 * otherwise return {@code -1}. With {@code c} components, the answer is {@code c - 1}.
	 *
	 * @param n the number of computers, n &ge; 1
	 * @param connections the undirected cables, each a two-element array
	 * @return the minimum number of cables to move, or -1 if impossible
	 */
	int makeConnected(int n, int[][] connections) {
		// TODO: if connections.length < n - 1 return -1; else union endpoints and return components - 1.
		throw new UnsupportedOperationException("TODO: implement makeConnected");
	}
}
