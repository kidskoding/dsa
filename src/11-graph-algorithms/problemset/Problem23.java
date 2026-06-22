/**
 * Problem 23: Evacuation Choke Point (minimum cut). Return the minimum total capacity whose removal
 * separates {@code source} from {@code sink}, equal to the max flow.
 */
class Problem23 {

	/**
	 * Returns the minimum cut capacity between {@code source} and {@code sink}.
	 *
	 * @param n the number of intersections
	 * @param roads undirected roads {@code {u, v, c}} with capacity {@code c}
	 * @param source the source intersection
	 * @param sink the sink intersection
	 * @return the minimum cut capacity
	 */
	int minCutCapacity(int n, int[][] roads, int source, int sink) {
		// TODO: model each undirected road as two opposing arcs; run max flow; by max-flow/min-cut the value is the answer.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
