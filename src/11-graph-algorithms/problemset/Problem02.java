import java.util.Set;

/**
 * Tier 1 — Problem 02: Reachable Set Under Budget.
 *
 * <p>Given a source and a non-negative distance budget {@code B}, return every vertex whose
 * shortest-path distance from the source is at most {@code B}.
 */
public class Problem02 {

	/**
	 * Returns the vertices within shortest-path distance {@code budget} of {@code source}.
	 *
	 * @param graph the weighted graph with non-negative edge weights
	 * @param source the source vertex
	 * @param budget the maximum allowed shortest-path distance
	 * @return the set of vertices reachable within the budget
	 */
	public Set<Integer> reachableWithin(WeightedGraph graph, int source, double budget) {
		// TODO: run a shortest-path search and keep vertices whose distance is <= budget.
		throw new UnsupportedOperationException("TODO: implement reachableWithin");
	}
}
