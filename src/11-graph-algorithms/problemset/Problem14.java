/**
 * Problem 14: Minimum Cost To Reach Destination In Time. Minimize total passing fees from city 0 to
 * city {@code n-1} within {@code maxTime} minutes, or {@code -1} if impossible.
 */
class Problem14 {

	/**
	 * Returns the minimum total passing fee to reach city {@code n-1} within {@code maxTime}.
	 *
	 * @param maxTime the time budget in minutes
	 * @param edges bidirectional roads {@code {u, v, time}}
	 * @param passingFees the per-city passing fee
	 * @return the minimum total fee, or {@code -1} if no route fits the budget
	 */
	int minCost(int maxTime, int[][] edges, int[] passingFees) {
		// TODO: Dijkstra over states (city, timeUsed) keyed on cost; prune states exceeding maxTime.
		throw new UnsupportedOperationException("TODO: implement");
	}
}
