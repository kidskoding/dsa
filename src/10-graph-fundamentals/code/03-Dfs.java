import java.util.List;

/**
 * Depth-first search over the shared {@link Graph}: recursive/iterative exploration that yields
 * discovery and finish times, traversal order, and basic reachability/cycle facts. Implement each
 * method from first principles — see the workbook page {@code dfs.md} for definitions and
 * invariants.
 */
final class Dfs {

	private Dfs() {}

	/**
	 * Returns the order in which vertices are first discovered (pre-order) during a DFS from {@code
	 * source}.
	 *
	 * @param graph the graph to search
	 * @param source the start vertex; must satisfy {@code 0 <= source < graph.vertexCount()}
	 * @return the DFS pre-order visitation order
	 * @throws IndexOutOfBoundsException if {@code source} is out of range
	 */
	public static List<Integer> traversalOrder(Graph graph, int source) {
		// TODO: run DFS from source, appending each vertex when first discovered.
		throw new UnsupportedOperationException("TODO: implement traversalOrder");
	}

	/**
	 * Returns the discovery time of each vertex in a full DFS over all vertices (in increasing vertex
	 * order), or {@code -1} for vertices never reached (cannot happen in a full sweep, but defined
	 * for partial searches).
	 *
	 * @param graph the graph to search
	 * @return discovery times indexed by vertex
	 */
	public static int[] discoveryTimes(Graph graph) {
		// TODO: run a full DFS with a global clock, stamping each vertex on discovery.
		throw new UnsupportedOperationException("TODO: implement discoveryTimes");
	}

	/**
	 * Returns whether {@code target} is reachable from {@code source}.
	 *
	 * @param graph the graph to search
	 * @param source the start vertex
	 * @param target the destination vertex
	 * @return {@code true} if a directed path from source to target exists
	 * @throws IndexOutOfBoundsException if an endpoint is out of range
	 */
	public static boolean isReachable(Graph graph, int source, int target) {
		// TODO: DFS from source and report whether target is visited.
		throw new UnsupportedOperationException("TODO: implement isReachable");
	}

	/**
	 * Returns whether the (undirected) graph contains a cycle.
	 *
	 * @param graph an undirected graph
	 * @return {@code true} if any cycle exists
	 */
	public static boolean hasCycleUndirected(Graph graph) {
		// TODO: DFS tracking the parent; a visited non-parent neighbor implies a cycle.
		throw new UnsupportedOperationException("TODO: implement hasCycleUndirected");
	}
}
