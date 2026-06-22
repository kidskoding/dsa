import java.util.Optional;
import java.util.Set;

/**
 * Problem 03: Lightest Edge Across a Cut. Find the minimum-weight edge with exactly one endpoint in
 * the subset {@code s}, or report that none crosses the cut.
 */
class Problem03 {

	/**
	 * Returns the lightest edge crossing the cut {@code (s, V \ s)}, or empty if none exists.
	 *
	 * @param graph the weighted graph
	 * @param s the subset of vertices defining one side of the cut
	 * @return the cheapest crossing edge, or empty if no edge crosses
	 */
	Optional<WeightedGraph.Edge> lightestCrossingEdge(WeightedGraph graph, Set<Integer> s) {
		// TODO: scan all edges; keep the lightest whose endpoints straddle s.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
