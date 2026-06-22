import java.util.List;

/**
 * Articulation points and bridges of an undirected shared {@link Graph}: the cut vertices and cut
 * edges whose removal increases the number of connected components, found in a single DFS using
 * discovery and low-link values. Implement each method from first principles — see the workbook
 * page {@code articulation-points-bridges.md} for definitions and invariants.
 */
final class ArticulationPointsBridges {

	private ArticulationPointsBridges() {}

	/**
	 * Returns the articulation points (cut vertices) of an undirected graph, in ascending order.
	 *
	 * @param graph an undirected graph
	 * @return the sorted list of articulation-point vertices
	 */
	public static List<Integer> articulationPoints(Graph graph) {
		// TODO: DFS computing disc/low; apply the root and non-root cut-vertex conditions.
		throw new UnsupportedOperationException("TODO: implement articulationPoints");
	}

	/**
	 * Returns the bridges (cut edges) of an undirected graph, each as a normalized {@code [u, v]}
	 * pair with {@code u < v}.
	 *
	 * @param graph an undirected graph
	 * @return the list of bridge edges
	 */
	public static List<int[]> bridges(Graph graph) {
		// TODO: DFS computing disc/low; tree edge (u,v) is a bridge iff low[v] > disc[u].
		throw new UnsupportedOperationException("TODO: implement bridges");
	}
}
