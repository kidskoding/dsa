import java.util.List;

/**
 * Prim's algorithm for the minimum spanning tree (MST) of a connected, undirected, weighted graph.
 *
 * <p>It grows the tree one vertex at a time, always adding the cheapest edge crossing the current
 * cut. Target complexity: {@code O(E log V)} with a binary-heap priority queue.
 */
class Prims {

	/**
	 * Computes a minimum spanning tree rooted at {@code start}.
	 *
	 * @param graph an undirected, connected, weighted graph (each undirected edge present in both
	 *		 directions)
	 * @param start the vertex to grow the tree from
	 * @return the edges chosen for the MST, as directed {@code parent -> child} edges
	 * @throws IllegalArgumentException if {@code start} is out of range
	 * @throws IllegalStateException if the graph is not connected
	 */
	public List<WeightedGraph.Edge> minimumSpanningTree(WeightedGraph graph, int start) {
		// TODO: repeatedly extract the lightest edge to an unvisited vertex and add that vertex.
		throw new UnsupportedOperationException("TODO: implement Prim's minimumSpanningTree");
	}

	/**
	 * Computes the total weight of a minimum spanning tree.
	 *
	 * @param graph an undirected, connected, weighted graph
	 * @return the sum of the MST edge weights
	 * @throws IllegalStateException if the graph is not connected
	 */
	public double minimumSpanningTreeWeight(WeightedGraph graph) {
		// TODO: sum the weights of the edges returned by minimumSpanningTree.
		throw new UnsupportedOperationException("TODO: implement minimumSpanningTreeWeight");
	}
}
