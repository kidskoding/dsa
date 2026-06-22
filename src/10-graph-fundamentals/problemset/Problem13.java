import java.util.List;

/** Tier 3 — Problem 13: Find all bridges of an undirected graph in one DFS pass. */
public class Problem13 {

	/**
	 * Returns the bridge edges of an undirected graph, each as a normalized {@code [u, v]} pair with
	 * {@code u < v}, computed in a single DFS using discovery and low-link values.
	 *
	 * @param vertexCount the number of vertices
	 * @param edges the undirected edges as {@code [u, v]} pairs
	 * @return the bridge edges
	 */
	public List<int[]> bridges(int vertexCount, int[][] edges) {
		// TODO: DFS computing disc/low; tree edge (u,v) is a bridge iff low[v] > disc[u].
		throw new UnsupportedOperationException("TODO: implement bridges");
	}
}
