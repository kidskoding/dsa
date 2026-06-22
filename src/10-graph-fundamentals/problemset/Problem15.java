/** Tier 3 — Problem 15: Longest path in a weighted DAG via topological relaxation. */
public class Problem15 {

	/**
	 * Returns the longest-path length from {@code source} to every vertex of a weighted DAG (weights
	 * may be negative), using {@link Integer#MIN_VALUE} for unreachable vertices.
	 *
	 * @param vertexCount the number of vertices
	 * @param edges the directed edges as {@code [u, v, w]} triples meaning {@code u -> v} with weight
	 *		 {@code w}
	 * @param source the start vertex
	 * @return longest distances indexed by vertex
	 */
	public int[] longestPaths(int vertexCount, int[][] edges, int source) {
		// TODO: topologically order the DAG, then relax edges maximizing distance.
		throw new UnsupportedOperationException("TODO: implement longestPaths");
	}
}
