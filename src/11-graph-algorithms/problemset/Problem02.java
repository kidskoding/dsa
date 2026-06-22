import java.util.Set;

/**
 * Problem 02: Reachable Set Under Budget. Return every vertex whose shortest-path distance from the
 * source is at most {@code budget}.
 */
class Problem02 {

	/**
	 * Returns the set of vertices within shortest-path distance {@code budget} of {@code source}.
	 *
	 * @param graph the weighted graph with non-negative weights
	 * @param source the source vertex
	 * @param budget the maximum allowed distance
	 * @return the set of reachable vertices, including the source
	 */
	Set<Integer> reachableWithin(WeightedGraph graph, int source, double budget) {
		// TODO: run Dijkstra from source; collect every vertex whose distance is <= budget.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
