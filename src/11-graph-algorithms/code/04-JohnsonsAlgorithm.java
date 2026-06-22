
/**
 * Johnson's algorithm for all-pairs shortest paths on sparse graphs with possibly negative edges.
 *
 * <p>It reweights edges using Bellman-Ford potentials so that every weight becomes non-negative,
 * then runs Dijkstra from each vertex. Target complexity: {@code O(V * E * log V)}.
 */
class JohnsonsAlgorithm {

	/** Sentinel for the absence of a path between two vertices. */
	public static final double UNREACHABLE = Double.POSITIVE_INFINITY;

	/**
	 * Computes the shortest-path distance between every ordered pair of vertices.
	 *
	 * @param graph the weighted graph (edges may be negative)
	 * @return a {@code V x V} matrix of shortest distances, with {@link #UNREACHABLE} where no path
	 *		 exists
	 * @throws ArithmeticException if the graph contains a negative cycle
	 */
	public double[][] allPairsShortestPaths(WeightedGraph graph) {
		// TODO: add a virtual source with 0-weight edges, compute h via Bellman-Ford, reweight, then
		//			 run Dijkstra from each vertex and undo the reweighting.
		throw new UnsupportedOperationException("TODO: implement Johnson's allPairsShortestPaths");
	}

	/**
	 * Computes the Bellman-Ford potential function {@code h} used for reweighting.
	 *
	 * @param graph the weighted graph
	 * @return an array {@code h} where {@code h[v]} is the shortest distance from the virtual source
	 * @throws ArithmeticException if the graph contains a negative cycle
	 */
	public double[] computePotentials(WeightedGraph graph) {
		// TODO: build the augmented graph and run Bellman-Ford from the virtual source.
		throw new UnsupportedOperationException("TODO: implement computePotentials");
	}
}
