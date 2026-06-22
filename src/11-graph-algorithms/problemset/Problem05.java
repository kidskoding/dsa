import java.util.List;
import java.util.OptionalDouble;

/**
 * Tier 1 — Problem 05: Tree Edge Sum.
 *
 * <p>Given a list of edges claimed to form a spanning tree of a graph with {@code vertexCount}
 * vertices, verify it spans every vertex without forming a cycle, and return its total weight, or
 * report that it is not a valid spanning tree.
 */
public class Problem05 {

	/**
	 * Returns the total weight of {@code claimedTree} if it is a valid spanning tree of {@code
	 * vertexCount} vertices, or empty otherwise.
	 *
	 * @param vertexCount the number of vertices the tree must span
	 * @param claimedTree the candidate spanning-tree edges
	 * @return the spanning-tree weight, or empty if the edge set is not a spanning tree
	 */
	public OptionalDouble spanningTreeWeight(int vertexCount, List<WeightedGraph.Edge> claimedTree) {
		// TODO: a spanning tree has exactly V-1 edges, is acyclic, and connects all vertices.
		throw new UnsupportedOperationException("TODO: implement spanningTreeWeight");
	}
}
