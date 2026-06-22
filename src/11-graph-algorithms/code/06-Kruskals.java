import java.util.List;

/**
 * Kruskal's algorithm for the minimum spanning tree (MST).
 *
 * <p>It sorts edges by weight and greedily adds each edge that does not form a cycle, using a
 * union-find (disjoint-set) structure. Target complexity: {@code O(E log E)}.
 */
class Kruskals {

	/**
	 * Computes a minimum spanning tree (or minimum spanning forest if disconnected).
	 *
	 * @param graph an undirected, weighted graph
	 * @return the edges chosen for the MST/forest
	 */
	public List<WeightedGraph.Edge> minimumSpanningTree(WeightedGraph graph) {
		// TODO: sort edges ascending; add an edge iff its endpoints are in different union-find sets.
		throw new UnsupportedOperationException("TODO: implement Kruskal's minimumSpanningTree");
	}

	/**
	 * Computes the total weight of the minimum spanning tree (or forest).
	 *
	 * @param graph an undirected, weighted graph
	 * @return the sum of the selected edge weights
	 */
	public double minimumSpanningTreeWeight(WeightedGraph graph) {
		// TODO: sum the weights of the edges returned by minimumSpanningTree.
		throw new UnsupportedOperationException("TODO: implement minimumSpanningTreeWeight");
	}
}
