import java.util.List;
import java.util.OptionalDouble;

/**
 * Tier 1 — Problem 01: Path Weight Validator.
 *
 * <p>Given a graph and an ordered list of vertices, compute the total weight of walking that exact
 * sequence, or report that the walk is invalid because some consecutive pair has no connecting
 * edge.
 */
public class Problem01 {

	/**
	 * Returns the total weight of the walk through {@code path}, or empty if any consecutive pair is
	 * not connected by an edge.
	 *
	 * @param graph the weighted graph
	 * @param path an ordered list of vertices describing the walk
	 * @return the total walk weight, or an empty optional if the walk is invalid
	 */
	public OptionalDouble pathWeight(WeightedGraph graph, List<Integer> path) {
		// TODO: for each consecutive pair, find a connecting edge and accumulate its weight.
		throw new UnsupportedOperationException("TODO: implement pathWeight");
	}
}
