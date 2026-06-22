import java.util.List;

/**
 * Euler paths and circuits of an undirected shared {@link Graph}: trails that use every edge
 * exactly once, characterized by vertex parities and constructed with Hierholzer's algorithm.
 * Implement each method from first principles — see the workbook page {@code euler-paths.md} for
 * definitions and invariants.
 */
final class EulerPaths {

	private EulerPaths() {}

	/**
	 * Returns whether the undirected graph has an Euler circuit (a closed trail using every edge
	 * once): it is connected on its non-isolated vertices and every vertex has even degree.
	 *
	 * @param graph an undirected graph
	 * @return {@code true} if an Euler circuit exists
	 */
	public static boolean hasEulerCircuit(Graph graph) {
		// TODO: check edge-connectivity of non-isolated vertices and all-even degrees.
		throw new UnsupportedOperationException("TODO: implement hasEulerCircuit");
	}

	/**
	 * Returns whether the undirected graph has an Euler path (an open or closed trail using every
	 * edge once): connected with exactly zero or two odd-degree vertices.
	 *
	 * @param graph an undirected graph
	 * @return {@code true} if an Euler path exists
	 */
	public static boolean hasEulerPath(Graph graph) {
		// TODO: check connectivity and that the odd-degree vertex count is 0 or 2.
		throw new UnsupportedOperationException("TODO: implement hasEulerPath");
	}

	/**
	 * Returns the vertex sequence of an Euler circuit via Hierholzer's algorithm, or an empty list if
	 * none exists.
	 *
	 * @param graph an undirected graph
	 * @return the Euler circuit as a vertex sequence, or empty if none exists
	 */
	public static List<Integer> eulerCircuit(Graph graph) {
		// TODO: Hierholzer — splice sub-tours together into a single closed trail.
		throw new UnsupportedOperationException("TODO: implement eulerCircuit");
	}
}
