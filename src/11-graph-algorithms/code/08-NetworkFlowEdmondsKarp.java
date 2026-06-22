
/**
 * Edmonds-Karp maximum-flow algorithm: Ford-Fulkerson where each augmenting path is a shortest
 * (fewest-edges) path found by BFS.
 *
 * <p>Choosing BFS bounds the number of augmentations by {@code O(V * E)}, giving an overall {@code
 * O(V * E^2)} running time independent of the capacity magnitudes.
 */
class NetworkFlowEdmondsKarp {

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
		// TODO: while BFS finds a shortest augmenting path in the residual graph, push its bottleneck.
		throw new UnsupportedOperationException("TODO: implement Edmonds-Karp maxFlow");
	}
}
