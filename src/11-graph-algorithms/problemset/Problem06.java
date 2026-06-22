import java.util.List;
import java.util.OptionalDouble;

/**
 * Problem 06: Bottleneck Of A Path. Return the minimum edge capacity along a fixed path, using the
 * widest available edge for each pair, or empty if the path is invalid.
 */
class Problem06 {

	/**
	 * Returns the bottleneck (minimum capacity) of the walk through {@code path}, or empty if
	 * any consecutive pair is unconnected. A single-vertex path has bottleneck positive infinity.
	 *
	 * @param graph the weighted graph whose weights are capacities
	 * @param path the ordered vertices of the path
	 * @return the bottleneck capacity, or empty if the path is invalid
	 */
	OptionalDouble bottleneck(WeightedGraph graph, List<Integer> path) {
		// TODO: for each consecutive pair take the widest connecting edge; the answer is the min of those.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
