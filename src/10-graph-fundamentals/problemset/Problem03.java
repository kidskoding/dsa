import java.util.List;

/** Tier 1 — Problem 03: Vertices reachable within exactly {@code k} BFS levels. */
public class Problem03 {

	/**
	 * Returns the vertices whose shortest-path distance from {@code source} is at most {@code k} BFS
	 * levels, in ascending order.
	 *
	 * @param vertexCount the number of vertices
	 * @param edges the undirected edges as {@code [u, v]} pairs
	 * @param source the BFS start vertex
	 * @param k the maximum level (number of edges) to include
	 * @return the sorted list of vertices within {@code k} levels of {@code source}
	 */
	public List<Integer> reachableWithin(int vertexCount, int[][] edges, int source, int k) {
		// TODO: BFS from source, collecting vertices discovered at level <= k.
		throw new UnsupportedOperationException("TODO: implement reachableWithin");
	}
}
