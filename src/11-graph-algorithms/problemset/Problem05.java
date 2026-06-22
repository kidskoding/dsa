import java.util.List;
import java.util.OptionalDouble;

/**
 * Problem 05: Spanning Tree Validator. Verify a claimed edge set spans every vertex acyclically and
 * return its total weight, or report it is not a valid spanning tree.
 */
class Problem05 {

	/**
	 * Returns the total weight if {@code claimedTree} is a valid spanning tree of
	 * {@code vertexCount} vertices, or empty otherwise.
	 *
	 * @param vertexCount the number of vertices
	 * @param claimedTree the undirected edges claimed to form a spanning tree
	 * @return the total weight, or empty if not a valid spanning tree
	 */
	OptionalDouble spanningTreeWeight(int vertexCount, List<WeightedGraph.Edge> claimedTree) {
		// TODO: check exactly vertexCount-1 edges, acyclic and connected via union-find; sum the weights.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
