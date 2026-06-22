/** Tier 3 — Problem 13: Kruskal's MST weight. */
public class Problem13 {

	/**
	 * Given a weighted undirected graph on {@code n} nodes described by {@code edges} (each {@code
	 * [u, v, weight]}), returns the total weight of a minimum spanning tree by sorting edges and
	 * using union-find to reject cycle-forming edges. If the graph is disconnected, returns the total
	 * weight of the minimum spanning forest.
	 *
	 * @param n the number of nodes, n &ge; 0
	 * @param edges the weighted edges, each {@code [u, v, weight]}
	 * @return the total MST (or MSF) weight
	 */
	public long mstWeight(int n, int[][] edges) {
		// TODO: sort edges by weight; add an edge only if it joins two different sets.
		throw new UnsupportedOperationException("TODO: implement mstWeight");
	}
}
