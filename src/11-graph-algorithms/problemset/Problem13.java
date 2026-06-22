
/**
 * Tier 3 — Problem 13: Second-Best Minimum Spanning Tree.
 *
 * <p>Compute the weight of the second-best spanning tree: the minimum weight over all spanning
 * trees that differ from the MST in at least one edge.
 */
public class Problem13 {

	/**
	 * Returns the weight of the second-best spanning tree of a connected, undirected graph.
	 *
	 * @param graph an undirected, connected, weighted graph
	 * @return the weight of the second-best spanning tree
	 * @throws IllegalStateException if no second spanning tree exists (e.g. the graph is itself a
	 *		 tree)
	 */
	public double secondBestSpanningTreeWeight(WeightedGraph graph) {
		// TODO: build the MST, then for each non-tree edge swap in and remove the heaviest edge on the
		//			 cycle it closes; take the cheapest resulting increase.
		throw new UnsupportedOperationException("TODO: implement secondBestSpanningTreeWeight");
	}
}
