import java.util.OptionalDouble;

/**
 * Tier 3 — Problem 14: Shortest Path With Exactly K Edges.
 *
 * <p>Compute the minimum-weight walk from {@code source} to {@code sink} that uses exactly {@code
 * k} edges (repeated vertices allowed), or report that none exists.
 */
public class Problem14 {

	/**
	 * Returns the minimum weight of a {@code source}-{@code sink} walk using exactly {@code k} edges.
	 *
	 * @param graph the weighted graph
	 * @param source the start vertex
	 * @param sink the end vertex
	 * @param k the exact number of edges the walk must use
	 * @return the minimum walk weight, or empty if no such walk exists
	 * @throws IllegalArgumentException if {@code k} is negative
	 */
	public OptionalDouble shortestWalkWithKEdges(WeightedGraph graph, int source, int sink, int k) {
		// TODO: DP over (edge count, vertex): dp[i][v] = best weight to reach v using exactly i edges.
		throw new UnsupportedOperationException("TODO: implement shortestWalkWithKEdges");
	}
}
