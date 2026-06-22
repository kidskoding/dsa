import java.util.List;

/**
 * The shared graph abstraction for this module: vertices are integers {@code 0..n-1} and edges are
 * stored as adjacency lists. The same type models both directed and undirected graphs; for an
 * undirected edge, callers add both directions (or use {@link Graph#addUndirectedEdge}).
 *
 * <p>This is the single, shared {@link Graph} abstraction reused by every other class in this
 * module — do not redefine it elsewhere. Implement each method from first principles; see the
 * workbook page {@code representations.md} for definitions and invariants.
 */
public final class Graph {

	private final int vertexCount;
	private final boolean directed;

	/**
	 * Creates a graph with {@code vertexCount} vertices and no edges.
	 *
	 * @param vertexCount the number of vertices; must be non-negative
	 * @param directed whether the graph is directed
	 * @throws IllegalArgumentException if {@code vertexCount} is negative
	 */
	public Graph(int vertexCount, boolean directed) {
		// TODO: validate vertexCount and allocate the adjacency-list storage.
		throw new UnsupportedOperationException("TODO: implement Graph(int, boolean)");
	}

	/**
	 * Returns the number of vertices.
	 *
	 * @return the vertex count supplied at construction
	 */
	public int vertexCount() {
		// TODO: return the number of vertices.
		throw new UnsupportedOperationException("TODO: implement vertexCount");
	}

	/**
	 * Returns whether this graph is directed.
	 *
	 * @return {@code true} if directed, {@code false} if undirected
	 */
	public boolean isDirected() {
		// TODO: return the directedness flag.
		throw new UnsupportedOperationException("TODO: implement isDirected");
	}

	/**
	 * Adds a directed edge {@code u -> v}.
	 *
	 * @param u the source vertex; must satisfy {@code 0 <= u < vertexCount()}
	 * @param v the target vertex; must satisfy {@code 0 <= v < vertexCount()}
	 * @throws IndexOutOfBoundsException if either endpoint is out of range
	 */
	public void addEdge(int u, int v) {
		// TODO: bounds-check, then append v to u's adjacency list.
		throw new UnsupportedOperationException("TODO: implement addEdge");
	}

	/**
	 * Adds an undirected edge between {@code u} and {@code v} by recording both directions.
	 *
	 * @param u one endpoint; must satisfy {@code 0 <= u < vertexCount()}
	 * @param v the other endpoint; must satisfy {@code 0 <= v < vertexCount()}
	 * @throws IndexOutOfBoundsException if either endpoint is out of range
	 */
	public void addUndirectedEdge(int u, int v) {
		// TODO: add both u -> v and v -> u.
		throw new UnsupportedOperationException("TODO: implement addUndirectedEdge");
	}

	/**
	 * Returns the neighbors of {@code u} in adjacency-list order.
	 *
	 * @param u the vertex to inspect; must satisfy {@code 0 <= u < vertexCount()}
	 * @return an unmodifiable list of {@code u}'s out-neighbors
	 * @throws IndexOutOfBoundsException if {@code u} is out of range
	 */
	public List<Integer> neighbors(int u) {
		// TODO: bounds-check, then return u's adjacency list.
		throw new UnsupportedOperationException("TODO: implement neighbors");
	}

	/**
	 * Returns the out-degree of {@code u} (the number of edges leaving {@code u}).
	 *
	 * @param u the vertex to inspect; must satisfy {@code 0 <= u < vertexCount()}
	 * @return the size of {@code u}'s adjacency list
	 * @throws IndexOutOfBoundsException if {@code u} is out of range
	 */
	public int degree(int u) {
		// TODO: bounds-check, then return the adjacency-list size.
		throw new UnsupportedOperationException("TODO: implement degree");
	}
}
