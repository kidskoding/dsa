/** Tier 3 — Problem 11: Minimum Spanning Forest via Kruskal. */
public class Problem11 {

	/**
	 * Returns the total weight of a minimum spanning forest of an undirected weighted graph on {@code
	 * n} vertices, given as an edge list where {@code edges[i] = [u, v, weight]}. Disconnected graphs
	 * yield a spanning forest (the sum over connected components). Uses Kruskal's greedy with {@link
	 * DisjointSet}.
	 *
	 * @param n the number of vertices, labelled {@code 0..n-1}
	 * @param edges the undirected edges, each as {@code [u, v, weight]}
	 * @return the total weight of a minimum spanning forest
	 */
	public long minSpanningForestWeight(int n, int[][] edges) {
		// TODO: sort edges by weight, union endpoints with DisjointSet, summing accepted edge weights.
		throw new UnsupportedOperationException("TODO: implement minSpanningForestWeight");
	}
}
