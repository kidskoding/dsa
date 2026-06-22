
/**
 * Bellman-Ford single-source shortest paths. Unlike Dijkstra, it tolerates negative edge weights
 * and detects negative cycles reachable from the source.
 *
 * <p>Target complexity: {@code O(V * E)} via {@code V - 1} rounds of edge relaxation plus one
 * detection pass.
 */
class ShortestPathsBellmanFord {

	/** Sentinel returned for vertices that are unreachable from the source. */
	public static final double UNREACHABLE = Double.POSITIVE_INFINITY;

	/**
	 * Computes shortest-path distances from {@code source}, allowing negative edges.
	 *
	 * @param graph the weighted graph (edges may be negative)
	 * @param source the source vertex
	 * @return an array {@code dist} of shortest-path distances; {@link #UNREACHABLE} for unreachable
	 *		 vertices
	 * @throws IllegalArgumentException if {@code source} is out of range
	 * @throws ArithmeticException if a negative cycle reachable from {@code source} exists
	 */
	public double[] shortestPaths(WeightedGraph graph, int source) {
		// TODO: relax all edges V-1 times, then run one more pass to detect negative cycles.
		throw new UnsupportedOperationException("TODO: implement Bellman-Ford shortestPaths");
	}

	/**
	 * Reports whether the graph contains a negative-weight cycle reachable from {@code source}.
	 *
	 * @param graph the weighted graph
	 * @param source the source vertex
	 * @return {@code true} if a reachable negative cycle exists
	 */
	public boolean hasNegativeCycle(WeightedGraph graph, int source) {
		// TODO: after V-1 relaxations, a further relaxation that still improves a distance proves a
		//			 negative cycle.
		throw new UnsupportedOperationException("TODO: implement hasNegativeCycle");
	}
}
