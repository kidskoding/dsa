import java.util.List;

/**
 * Bipartite testing and matching on the shared {@link Graph}: two-coloring to decide bipartiteness
 * and augmenting-path search to find a maximum matching. Implement each method from first
 * principles — see the workbook page {@code bipartite-graphs-matching.md} for definitions and
 * invariants.
 */
final class BipartiteGraphsMatching {

	private BipartiteGraphsMatching() {}

	/**
	 * Returns whether the undirected graph is bipartite (2-colorable with no monochromatic edge).
	 *
	 * @param graph an undirected graph
	 * @return {@code true} if the graph is bipartite
	 */
	public static boolean isBipartite(Graph graph) {
		// TODO: BFS/DFS two-coloring; report failure on any same-color edge.
		throw new UnsupportedOperationException("TODO: implement isBipartite");
	}

	/**
	 * Returns a 2-coloring (each vertex assigned color {@code 0} or {@code 1}) if the graph is
	 * bipartite, or an empty array if it is not.
	 *
	 * @param graph an undirected graph
	 * @return colors indexed by vertex, or an empty array if not bipartite
	 */
	public static int[] twoColoring(Graph graph) {
		// TODO: BFS/DFS assigning alternating colors across each component.
		throw new UnsupportedOperationException("TODO: implement twoColoring");
	}

	/**
	 * Returns the size of a maximum matching in a bipartite graph whose vertices are partitioned by
	 * the given side mask.
	 *
	 * @param graph an undirected bipartite graph
	 * @param leftSide for each vertex, {@code true} if it belongs to the left partition
	 * @return the cardinality of a maximum matching
	 * @throws IllegalArgumentException if {@code leftSide.length != graph.vertexCount()}
	 */
	public static int maximumMatching(Graph graph, boolean[] leftSide) {
		// TODO: repeatedly search for augmenting paths from unmatched left vertices.
		throw new UnsupportedOperationException("TODO: implement maximumMatching");
	}

	/**
	 * Returns the partition classes of a bipartite graph as two vertex groups, or an empty list if
	 * the graph is not bipartite.
	 *
	 * @param graph an undirected graph
	 * @return the two color classes, or empty if not bipartite
	 */
	public static List<List<Integer>> partitionClasses(Graph graph) {
		// TODO: two-color the graph, then bucket vertices by color.
		throw new UnsupportedOperationException("TODO: implement partitionClasses");
	}
}
