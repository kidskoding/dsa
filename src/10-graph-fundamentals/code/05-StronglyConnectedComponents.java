import java.util.List;

/**
 * Strongly connected components of a directed shared {@link Graph}: partition vertices so that
 * {@code u} and {@code v} share a component iff each reaches the other, via Kosaraju's or Tarjan's
 * algorithm. Implement each method from first principles — see the workbook page {@code
 * strongly-connected-components.md} for definitions and invariants.
 */
final class StronglyConnectedComponents {

	private StronglyConnectedComponents() {}

	/**
	 * Returns a component id in {@code 0..k-1} for each vertex, where two vertices share an id iff
	 * they are strongly connected.
	 *
	 * @param graph a directed graph
	 * @return component ids indexed by vertex
	 */
	public static int[] componentIds(Graph graph) {
		// TODO: run Kosaraju (DFS finish order, then DFS the transpose) to assign ids.
		throw new UnsupportedOperationException("TODO: implement componentIds");
	}

	/**
	 * Returns the number of strongly connected components.
	 *
	 * @param graph a directed graph
	 * @return the count of distinct SCCs
	 */
	public static int count(Graph graph) {
		// TODO: number of distinct component ids.
		throw new UnsupportedOperationException("TODO: implement count");
	}

	/**
	 * Returns the SCCs as a list of vertex groups.
	 *
	 * @param graph a directed graph
	 * @return one list of vertices per strongly connected component
	 */
	public static List<List<Integer>> components(Graph graph) {
		// TODO: bucket vertices by their component id.
		throw new UnsupportedOperationException("TODO: implement components");
	}
}
