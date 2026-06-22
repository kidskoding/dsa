import java.util.List;

/**
 * Topological sorting of a directed acyclic shared {@link Graph}: produce a linear order consistent
 * with all edges, via Kahn's algorithm or DFS finish times. Implement each method from first
 * principles — see the workbook page {@code topological-sort.md} for definitions and invariants.
 */
final class TopologicalSort {

	private TopologicalSort() {}

	/**
	 * Returns a valid topological ordering of {@code graph}, or an empty list if the graph contains a
	 * cycle (and thus no ordering exists).
	 *
	 * @param graph a directed graph
	 * @return a topological order, or empty if the graph is cyclic
	 */
	public static List<Integer> order(Graph graph) {
		// TODO: Kahn's algorithm — repeatedly remove a zero in-degree vertex.
		throw new UnsupportedOperationException("TODO: implement order");
	}

	/**
	 * Returns whether {@code graph} is a directed acyclic graph (DAG).
	 *
	 * @param graph a directed graph
	 * @return {@code true} if the graph has no directed cycle
	 */
	public static boolean isDag(Graph graph) {
		// TODO: a topological order exists iff the graph is acyclic.
		throw new UnsupportedOperationException("TODO: implement isDag");
	}
}
