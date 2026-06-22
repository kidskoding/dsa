/**
 * Problem 08: Path With Maximum Probability (Dijkstra on products). Return the maximum-probability
 * path from {@code start} to {@code end}, or {@code 0} if none exists.
 */
class Problem08 {

	/**
	 * Returns the maximum success probability from {@code start} to {@code end}.
	 *
	 * @param n the number of nodes
	 * @param edges undirected edges {@code {u, v}}
	 * @param succProb the per-edge success probabilities
	 * @param start the start node
	 * @param end the end node
	 * @return the maximum probability, or {@code 0.0} if no path exists
	 */
	double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
		// TODO: Dijkstra with a max-heap maximizing the running product of edge probabilities.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
