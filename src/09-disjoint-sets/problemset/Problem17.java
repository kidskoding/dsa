/** Problem 17: Kruskal's Minimum Spanning Tree Weight. */
public class Problem17 {

	/**
	 * Given {@code n} nodes labelled {@code 0..n-1} and weighted undirected {@code edges} (each
	 * {@code [u, v, w]}), returns the total weight of a minimum spanning tree, or {@code -1} if the
	 * graph is not connected. Sort edges by ascending weight; accept an edge only if it joins two
	 * different components. The MST exists only when exactly {@code n - 1} edges are accepted.
	 *
	 * @param n the number of nodes, n &ge; 1
	 * @param edges the weighted undirected edges, each {@code [u, v, w]}
	 * @return the total MST weight, or -1 if the graph is disconnected
	 */
	long minimumSpanningTree(int n, int[][] edges) {
		// TODO: sort edges by weight, union to reject cycles, sum accepted weights; -1 if disconnected.
		throw new UnsupportedOperationException("TODO: implement minimumSpanningTree");
	}
}
