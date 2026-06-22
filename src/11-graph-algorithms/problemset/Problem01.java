import java.util.List;
import java.util.OptionalDouble;

/**
 * Problem 01: Path Weight Validator. Compute the total weight of walking an ordered vertex sequence,
 * or report the walk invalid when some consecutive pair has no connecting edge.
 */
class Problem01 {

	/**
	 * Returns the total weight of the walk through {@code path}, or empty if any consecutive
	 * pair is not connected by an edge.
	 *
	 * @param graph the weighted graph
	 * @param path an ordered list of vertices describing the walk
	 * @return the total walk weight, or empty if the walk is invalid
	 */
	OptionalDouble pathWeight(WeightedGraph graph, List<Integer> path) {
		// TODO: for each consecutive pair find the lightest connecting edge and accumulate its weight.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
