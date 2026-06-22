import java.util.Optional;
import java.util.Set;

/**
 * Tier 1 — Problem 03: Lightest Edge Across a Cut.
 *
 * <p>Given a graph and a subset {@code S} of vertices, find the minimum-weight edge with exactly
 * one endpoint in {@code S}, or report that no such edge exists.
 */
public class Problem03 {

	/**
	 * Returns the lightest edge crossing the cut defined by {@code subset}.
	 *
	 * @param graph the weighted graph
	 * @param subset the set {@code S} defining one side of the cut
	 * @return the minimum-weight crossing edge, or empty if none crosses the cut
	 */
	public Optional<WeightedGraph.Edge> lightestCrossingEdge(
			WeightedGraph graph, Set<Integer> subset) {
		// TODO: scan all edges; keep the lightest whose endpoints split across the subset boundary.
		throw new UnsupportedOperationException("TODO: implement lightestCrossingEdge");
	}
}
