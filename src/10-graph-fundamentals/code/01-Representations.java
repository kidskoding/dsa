import java.util.List;

/**
 * Graph representations: the shared adjacency-list {@link Graph} type used throughout this module,
 * plus conversions between common encodings (edge list, adjacency matrix, adjacency list).
 *
 * <p>This file defines the single, shared {@link Graph} abstraction reused by every other class in
 * the {@code graphsfundamentals} package — do not redefine it elsewhere. Implement each method from
 * first principles; see the workbook page {@code representations.md} for definitions and
 * invariants.
 */
final class Representations {

	private Representations() {}

	/**
	 * Builds a shared {@link Graph} from an edge list.
	 *
	 * @param vertexCount the number of vertices
	 * @param edges the edges as {@code [u, v]} pairs
	 * @param directed whether to build a directed graph
	 * @return the constructed graph
	 * @throws IllegalArgumentException if any edge is malformed
	 * @throws IndexOutOfBoundsException if any endpoint is out of range
	 */
	public static Graph fromEdgeList(int vertexCount, int[][] edges, boolean directed) {
		// TODO: create a Graph and add each edge (respecting directedness).
		throw new UnsupportedOperationException("TODO: implement fromEdgeList");
	}

	/**
	 * Converts a {@link Graph} into a boolean adjacency matrix where {@code m[u][v]} is {@code true}
	 * iff edge {@code u -> v} exists.
	 *
	 * @param graph the source graph
	 * @return the adjacency matrix
	 */
	public static boolean[][] toAdjacencyMatrix(Graph graph) {
		// TODO: allocate an n-by-n matrix and set m[u][v] for each edge.
		throw new UnsupportedOperationException("TODO: implement toAdjacencyMatrix");
	}
}
