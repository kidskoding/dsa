import java.util.Set;

/**
 * Minimum {@code s}-{@code t} cut via the max-flow min-cut theorem.
 *
 * <p>After computing a maximum flow, the set of vertices reachable from the source in the residual
 * graph forms one side of a minimum cut, and the capacity of the cut equals the maximum flow value.
 */
class MinimumCut {

	/**
	 * Computes the capacity of a minimum {@code source}-{@code sink} cut.
	 *
	 * @param graph a graph whose edge weights are non-negative capacities
	 * @param source the source vertex
	 * @param sink the sink vertex
	 * @return the total capacity of the edges crossing a minimum cut
	 * @throws IllegalArgumentException if {@code source == sink} or a vertex is out of range
	 */
	public double minCutCapacity(WeightedGraph graph, int source, int sink) {
		// TODO: by max-flow min-cut, the minimum cut capacity equals the maximum flow value.
		throw new UnsupportedOperationException("TODO: implement minCutCapacity");
	}

	/**
	 * Returns the source side of a minimum {@code source}-{@code sink} cut.
	 *
	 * @param graph a graph whose edge weights are non-negative capacities
	 * @param source the source vertex
	 * @param sink the sink vertex
	 * @return the set of vertices reachable from {@code source} in the residual graph after max flow
	 * @throws IllegalArgumentException if {@code source == sink} or a vertex is out of range
	 */
	public Set<Integer> sourceSide(WeightedGraph graph, int source, int sink) {
		// TODO: compute a max flow, then BFS/DFS over residual edges from the source.
		throw new UnsupportedOperationException("TODO: implement sourceSide");
	}
}
