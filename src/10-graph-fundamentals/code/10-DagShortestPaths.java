
/**
 * Single-source shortest (and longest) paths on a weighted DAG built over the shared {@link Graph}:
 * relax edges in topological order to handle arbitrary (including negative) weights in linear time.
 * Implement each method from first principles — see the workbook page {@code dag-shortest-paths.md}
 * for definitions and invariants.
 *
 * <p>The structural graph carries vertices and edges; per-edge weights are supplied alongside as a
 * weight lookup so the shared {@link Graph} type stays unweighted.
 */
final class DagShortestPaths {

	private DagShortestPaths() {}

	/**
	 * Returns the shortest-path distance from {@code source} to every vertex of a weighted DAG, using
	 * {@link Integer#MAX_VALUE} for unreachable vertices.
	 *
	 * @param graph a directed acyclic graph
	 * @param weight weight of each edge, indexed as {@code weight[u][v]} (only edges present in
	 *		 {@code graph} are read)
	 * @param source the start vertex; must satisfy {@code 0 <= source < graph.vertexCount()}
	 * @return shortest distances indexed by vertex
	 * @throws IllegalArgumentException if {@code graph} is not a DAG
	 * @throws IndexOutOfBoundsException if {@code source} is out of range
	 */
	public static int[] shortestDistances(Graph graph, int[][] weight, int source) {
		// TODO: topologically order, then relax outgoing edges in that order.
		throw new UnsupportedOperationException("TODO: implement shortestDistances");
	}

	/**
	 * Returns the longest-path distance from {@code source} to every vertex of a weighted DAG, using
	 * {@link Integer#MIN_VALUE} for unreachable vertices.
	 *
	 * @param graph a directed acyclic graph
	 * @param weight weight of each edge, indexed as {@code weight[u][v]}
	 * @param source the start vertex; must satisfy {@code 0 <= source < graph.vertexCount()}
	 * @return longest distances indexed by vertex
	 * @throws IllegalArgumentException if {@code graph} is not a DAG
	 * @throws IndexOutOfBoundsException if {@code source} is out of range
	 */
	public static int[] longestDistances(Graph graph, int[][] weight, int source) {
		// TODO: relax in topological order, maximizing instead of minimizing.
		throw new UnsupportedOperationException("TODO: implement longestDistances");
	}
}
