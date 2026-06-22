import java.util.OptionalDouble;

/**
 * Problem 20: Shortest Path With Exactly K Edges (DP over edge count). Return the minimum-weight walk
 * from source to sink using exactly {@code k} edges, or empty if none exists.
 */
class Problem20 {

	/**
	 * Returns the minimum-weight walk from {@code source} to {@code sink} using exactly {@code k} edges.
	 *
	 * @param graph the weighted graph
	 * @param source the source vertex
	 * @param sink the sink vertex
	 * @param k the exact number of edges
	 * @return the minimum walk weight, or empty if no such walk exists
	 */
	OptionalDouble shortestWalkWithKEdges(WeightedGraph graph, int source, int sink, int k) {
		// TODO: DP best[e][v] = min weight to reach v in exactly e edges; answer is best[k][sink].
		throw new UnsupportedOperationException("TODO: implement");
	}
}
