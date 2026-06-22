/**
 * Problem 20 — IPO.
 *
 * <p>You can complete at most {@code k} projects. Project {@code i} needs {@code capital[i]} and
 * pays {@code profits[i]} on completion. Starting with capital {@code w}, repeatedly take the most
 * profitable affordable project. Return the maximum final capital. Use a max-heap of affordable
 * profits.
 */
final class Problem20 {

	private Problem20() {}

	/**
	 * Returns the maximum capital after completing at most {@code k} projects.
	 *
	 * @param k the maximum number of projects
	 * @param w the starting capital
	 * @param profits the per-project profits
	 * @param capital the per-project capital requirements
	 * @return the maximum achievable final capital
	 */
	static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
		// TODO: sort by capital; greedily take the most profitable affordable project k times.
		throw new UnsupportedOperationException("TODO: implement findMaximizedCapital");
	}
}
