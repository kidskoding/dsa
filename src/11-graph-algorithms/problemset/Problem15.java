
/**
 * Tier 3 — Problem 15: Minimum-Cost Maximum Flow Value.
 *
 * <p>Given capacities and per-unit edge costs (encoded as a second {@link WeightedGraph} sharing
 * the same edge structure), compute the minimum total cost among all flows that achieve the maximum
 * flow value from {@code source} to {@code sink}.
 */
public class Problem15 {

	/**
	 * Returns the minimum total cost of a maximum {@code source}-{@code sink} flow.
	 *
	 * @param capacities a graph whose edge weights are capacities
	 * @param costs a graph (same edges as {@code capacities}) whose weights are per-unit costs
	 * @param source the source vertex
	 * @param sink the sink vertex
	 * @return the minimum cost to push the maximum flow value
	 * @throws IllegalArgumentException if the two graphs do not share the same vertex count
	 */
	public double minCostMaxFlow(
			WeightedGraph capacities, WeightedGraph costs, int source, int sink) {
		// TODO: repeatedly augment along the cheapest (shortest-cost) augmenting path, e.g. via
		//			 Bellman-Ford / SPFA on the residual cost graph, until the max flow is reached.
		throw new UnsupportedOperationException("TODO: implement minCostMaxFlow");
	}
}
