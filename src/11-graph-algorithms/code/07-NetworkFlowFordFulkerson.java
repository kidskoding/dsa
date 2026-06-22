
/**
 * Ford-Fulkerson maximum-flow method. Edge weights are interpreted as capacities.
 *
 * <p>It repeatedly finds an augmenting path in the residual graph (via DFS) and pushes flow along
 * it until no augmenting path remains. With integer capacities this terminates; on irrational
 * capacities it may not, which is why Edmonds-Karp fixes the path-finding order.
 */
class NetworkFlowFordFulkerson {

	/**
	 * Computes the maximum flow value from {@code source} to {@code sink}.
	 *
	 * @param graph a graph whose edge weights are non-negative capacities
	 * @param source the source vertex
	 * @param sink the sink vertex
	 * @return the value of a maximum {@code source}-{@code sink} flow
	 * @throws IllegalArgumentException if {@code source == sink} or a vertex is out of range
	 */
	public double maxFlow(WeightedGraph graph, int source, int sink) {
		// TODO: build a residual capacity structure; while a DFS augmenting path exists, push its
		//			 bottleneck and update residuals.
		throw new UnsupportedOperationException("TODO: implement Ford-Fulkerson maxFlow");
	}
}
