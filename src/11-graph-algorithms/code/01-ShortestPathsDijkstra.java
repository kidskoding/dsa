/**
 * Dijkstra's single-source shortest-paths algorithm on a weighted graph with non-negative edge
 * weights.
 *
 * <p>The shared graph type {@link WeightedGraph} is a top-level type in this module — see
 * {@code WeightedGraph.java}. Every algorithm in this package operates on that same type.
 *
 * <p>Target complexity: {@code O((V + E) log V)} using a binary-heap priority queue.
 */
class ShortestPathsDijkstra {

	/** Sentinel returned for vertices that are unreachable from the source. */
	public static final double UNREACHABLE = Double.POSITIVE_INFINITY;

	/**
	 * Computes the shortest-path distance from {@code source} to every vertex in {@code graph}.
	 *
	 * @param graph a weighted graph whose edge weights are all non-negative
	 * @param source the source vertex
	 * @return an array {@code dist} where {@code dist[v]} is the shortest-path distance from {@code
	 *		 source} to {@code v}, or {@link #UNREACHABLE} if {@code v} cannot be reached
	 * @throws IllegalArgumentException if {@code source} is out of range or any edge weight is
	 *		 negative
	 */
	public double[] shortestPaths(WeightedGraph graph, int source) {
		// TODO: relax edges greedily, always extracting the closest unsettled vertex from a min-heap.
		throw new UnsupportedOperationException("TODO: implement Dijkstra shortestPaths");
	}
}
