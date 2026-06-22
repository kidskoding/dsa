
/**
 * Floyd-Warshall all-pairs shortest paths via dynamic programming over intermediate vertices.
 *
 * <p>Target complexity: {@code O(V^3)} time, {@code O(V^2)} space. Handles negative edges; behavior
 * on negative cycles is reported separately.
 */
class FloydWarshall {

	/** Sentinel for the absence of a path between two vertices. */
	public static final double UNREACHABLE = Double.POSITIVE_INFINITY;

	/**
	 * Computes the shortest-path distance between every ordered pair of vertices.
	 *
	 * @param graph the weighted graph (edges may be negative)
	 * @return a {@code V x V} matrix {@code dist} where {@code dist[i][j]} is the shortest distance
	 *		 from {@code i} to {@code j}, or {@link #UNREACHABLE} if none exists
	 * @throws ArithmeticException if the graph contains a negative cycle
	 */
	public double[][] allPairsShortestPaths(WeightedGraph graph) {
		// TODO: initialize from edges, then for each intermediate k relax dist[i][j] via k.
		throw new UnsupportedOperationException("TODO: implement Floyd-Warshall allPairsShortestPaths");
	}

	/**
	 * Reports whether the graph contains any negative-weight cycle.
	 *
	 * @param graph the weighted graph
	 * @return {@code true} if some vertex has a negative distance to itself after the DP
	 */
	public boolean hasNegativeCycle(WeightedGraph graph) {
		// TODO: a negative diagonal entry dist[i][i] < 0 signals a negative cycle through i.
		throw new UnsupportedOperationException("TODO: implement hasNegativeCycle");
	}
}
