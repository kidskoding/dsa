import java.util.List;

/**
 * Problem 26: Find Critical And Pseudo-Critical Edges In MST. Classify each edge as critical (in every
 * MST) or pseudo-critical (in some but not all MSTs).
 */
class Problem26 {

	/**
	 * Returns {@code [critical, pseudoCritical]} edge-index lists for the graph's MSTs.
	 *
	 * @param n the number of vertices
	 * @param edges undirected weighted edges {@code {u, v, w}} indexed by position
	 * @return a list of two lists: critical edge indices and pseudo-critical edge indices
	 */
	List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
		// TODO: compute baseline MST weight; an edge is critical if excluding it raises the weight, pseudo-critical if including it still gives the baseline.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
