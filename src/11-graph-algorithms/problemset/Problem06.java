import java.util.List;
import java.util.OptionalDouble;

/**
 * Tier 1 — Problem 06: Bottleneck Of A Path.
 *
 * <p>Given a single fixed path between a source and a sink, return the minimum edge capacity along
 * that path (its bottleneck).
 */
public class Problem06 {

	/**
	 * Returns the bottleneck (minimum edge weight) along the walk described by {@code path}, or empty
	 * if any consecutive pair is not connected.
	 *
	 * @param graph the weighted graph whose weights are interpreted as capacities
	 * @param path an ordered list of vertices from source to sink
	 * @return the minimum capacity along the path, or empty if the path is invalid
	 */
	public OptionalDouble bottleneck(WeightedGraph graph, List<Integer> path) {
		// TODO: walk the path, tracking the minimum connecting-edge weight; fail if a hop is missing.
		throw new UnsupportedOperationException("TODO: implement bottleneck");
	}
}
