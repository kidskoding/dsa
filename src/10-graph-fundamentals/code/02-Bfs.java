import java.util.List;

/**
 * Breadth-first search over the shared {@link Graph}: level-order traversal that computes
 * shortest-path distances and predecessors in an unweighted graph. Implement each method from first
 * principles — see the workbook page {@code bfs.md} for definitions and invariants.
 */
final class Bfs {

	private Bfs() {}

	/**
	 * Returns the shortest-path distance (in number of edges) from {@code source} to every vertex,
	 * with {@code -1} for vertices unreachable from {@code source}.
	 *
	 * @param graph the graph to search
	 * @param source the start vertex; must satisfy {@code 0 <= source < graph.vertexCount()}
	 * @return an array of distances indexed by vertex
	 * @throws IndexOutOfBoundsException if {@code source} is out of range
	 */
	public static int[] distances(Graph graph, int source) {
		// TODO: run a queue-based BFS, recording the level at which each vertex is discovered.
		throw new UnsupportedOperationException("TODO: implement distances");
	}

	/**
	 * Returns the order in which vertices are first dequeued during a BFS from {@code source}.
	 *
	 * @param graph the graph to search
	 * @param source the start vertex; must satisfy {@code 0 <= source < graph.vertexCount()}
	 * @return the BFS visitation order
	 * @throws IndexOutOfBoundsException if {@code source} is out of range
	 */
	public static List<Integer> traversalOrder(Graph graph, int source) {
		// TODO: run BFS and append each vertex as it is dequeued.
		throw new UnsupportedOperationException("TODO: implement traversalOrder");
	}

	/**
	 * Reconstructs a shortest path from {@code source} to {@code target}, or an empty list if none
	 * exists.
	 *
	 * @param graph the graph to search
	 * @param source the start vertex
	 * @param target the destination vertex
	 * @return the vertices of a shortest path from source to target, inclusive, or empty if
	 *		 unreachable
	 * @throws IndexOutOfBoundsException if an endpoint is out of range
	 */
	public static List<Integer> shortestPath(Graph graph, int source, int target) {
		// TODO: BFS while tracking predecessors, then walk back from target to source.
		throw new UnsupportedOperationException("TODO: implement shortestPath");
	}
}
