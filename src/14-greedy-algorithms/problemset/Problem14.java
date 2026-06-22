/** Tier 3 — Problem 14: Maximize Capital with k Projects. */
public class Problem14 {

	/**
	 * Selects at most {@code k} projects sequentially to maximize final capital, returning that
	 * maximum. Project {@code i} requires {@code capitalRequired[i]} capital to start and yields
	 * {@code profits[i]} added to capital on completion. At each step, among all affordable
	 * unselected projects, the greedy picks the most profitable. Profits accumulate, possibly
	 * unlocking further projects.
	 *
	 * @param k the maximum number of projects to undertake
	 * @param startCapital the initial capital
	 * @param capitalRequired the per-project capital thresholds, parallel to {@code profits}
	 * @param profits the per-project profits, parallel to {@code capitalRequired}
	 * @return the maximum capital achievable after at most {@code k} projects
	 */
	public long maximizeCapital(int k, long startCapital, int[] capitalRequired, int[] profits) {
		// TODO: order by required capital; repeatedly pick the max-profit affordable project from a
		// max-heap.
		throw new UnsupportedOperationException("TODO: implement maximizeCapital");
	}
}
