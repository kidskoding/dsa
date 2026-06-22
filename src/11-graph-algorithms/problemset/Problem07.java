/**
 * Problem 07: Network Delay Time (Dijkstra). Return the time for a signal sent from node {@code k} to
 * reach all {@code n} nodes, or {@code -1} if some node is unreachable.
 */
class Problem07 {

	/**
	 * Returns the minimum time for every node to receive the signal, or {@code -1} if unreachable.
	 *
	 * @param times directed weighted edges {@code {u, v, w}} over 1-indexed nodes
	 * @param n the number of nodes
	 * @param k the originating node
	 * @return the time for all nodes to receive the signal, or {@code -1}
	 */
	int networkDelayTime(int[][] times, int n, int k) {
		// TODO: run Dijkstra from k; answer is the maximum finite distance, or -1 if any is infinite.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
