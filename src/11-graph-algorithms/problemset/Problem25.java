/**
 * Problem 25: Minimum-Cost Maximum Flow. Return the minimum total cost among all flows achieving the
 * maximum flow value from {@code source} to {@code sink}.
 */
class Problem25 {

	/**
	 * Returns the minimum cost of a maximum flow from {@code source} to {@code sink}.
	 *
	 * @param n the number of vertices
	 * @param edges directed edges {@code {u, v, cap, cost}}
	 * @param source the source vertex
	 * @param sink the sink vertex
	 * @return the minimum total cost of a maximum flow
	 */
	int minCostMaxFlow(int n, int[][] edges, int source, int sink) {
		// TODO: repeatedly send flow along the cheapest augmenting path (shortest by cost via SPFA/Bellman-Ford) until none remains.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
