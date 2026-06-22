import java.util.ArrayList;
import java.util.List;

/**
 * A directed, weighted graph stored as adjacency lists. This is the single shared graph type for
 * the whole module; treat it as undirected by inserting both {@code (u,v)} and {@code (v,u)}.
 *
 * <p>Vertices are integers in {@code [0, vertexCount)}. Edges carry a {@code double} weight (used as
 * a cost in shortest-path/MST contexts and as a capacity in flow contexts).
 *
 * <p>This is a top-level type in the default (unnamed) package: every algorithm in this module
 * compiles together and refers to it by simple name — do not redefine it elsewhere.
 */
public final class WeightedGraph {

	/** A single directed edge: {@code from -> to} with a numeric weight. */
	public record Edge(int from, int to, double weight) {}

	private final int vertexCount;
	private final List<List<Edge>> adjacency;

	/**
	 * Creates a graph with {@code vertexCount} vertices and no edges.
	 *
	 * @param vertexCount the number of vertices; must be non-negative
	 */
	public WeightedGraph(int vertexCount) {
		if (vertexCount < 0) {
			throw new IllegalArgumentException("vertexCount must be non-negative");
		}
		this.vertexCount = vertexCount;
		this.adjacency = new ArrayList<>(vertexCount);
		for (int i = 0; i < vertexCount; i++) {
			adjacency.add(new ArrayList<>());
		}
	}

	/**
	 * Adds a directed edge {@code from -> to} with the given weight.
	 *
	 * @param from the tail vertex
	 * @param to the head vertex
	 * @param weight the edge weight
	 */
	public void addDirectedEdge(int from, int to, double weight) {
		checkVertex(from);
		checkVertex(to);
		adjacency.get(from).add(new Edge(from, to, weight));
	}

	/**
	 * Adds an undirected edge between {@code u} and {@code v} (two directed edges).
	 *
	 * @param u one endpoint
	 * @param v the other endpoint
	 * @param weight the edge weight
	 */
	public void addUndirectedEdge(int u, int v, double weight) {
		addDirectedEdge(u, v, weight);
		addDirectedEdge(v, u, weight);
	}

	/**
	 * Returns the outgoing edges of {@code vertex}.
	 *
	 * @param vertex the vertex to inspect
	 * @return an unmodifiable view of {@code vertex}'s outgoing edges
	 */
	public List<Edge> edgesFrom(int vertex) {
		checkVertex(vertex);
		return List.copyOf(adjacency.get(vertex));
	}

	/**
	 * Returns every directed edge in the graph.
	 *
	 * @return a flat list of all edges
	 */
	public List<Edge> allEdges() {
		List<Edge> all = new ArrayList<>();
		for (List<Edge> list : adjacency) {
			all.addAll(list);
		}
		return all;
	}

	/**
	 * Returns the number of vertices.
	 *
	 * @return the vertex count
	 */
	public int vertexCount() {
		return vertexCount;
	}

	private void checkVertex(int vertex) {
		if (vertex < 0 || vertex >= vertexCount) {
			throw new IllegalArgumentException("vertex out of range: " + vertex);
		}
	}
}
