/**
 * Conceptual harness for the exchange-argument proof technique. An exchange argument shows a greedy
 * solution is optimal by transforming any optimal solution into the greedy one — one swap at a time
 * — without making it worse. See the workbook page {@code exchange-argument.md}.
 */
class ExchangeArgument {

	/**
	 * Returns {@code true} if {@code order} is sorted so that scheduling unit jobs in this order
	 * minimizes total weighted completion time, i.e. the jobs are in non-increasing order of the
	 * Smith ratio {@code weight / duration}. This is the invariant an exchange argument establishes:
	 * any inversion of adjacent jobs can be swapped to reduce the objective.
	 *
	 * @param weights the job weights, indexed in scheduled order
	 * @param durations the job durations, indexed in scheduled order
	 * @return whether the schedule has no profitable adjacent swap (no Smith-ratio inversion)
	 */
	public boolean isExchangeOptimalOrder(double[] weights, double[] durations) {
		// TODO: confirm no adjacent pair violates the weight/duration ordering.
		throw new UnsupportedOperationException("TODO: implement isExchangeOptimalOrder");
	}

	/**
	 * Returns {@code true} if swapping the two adjacent jobs at indices {@code i} and {@code i + 1}
	 * would not increase total weighted completion time — i.e. the swap is a valid exchange step. Use
	 * this to reason about a single swap in isolation.
	 *
	 * @param weights the job weights in scheduled order
	 * @param durations the job durations in scheduled order
	 * @param i the index of the first job in the adjacent pair
	 * @return whether exchanging jobs {@code i} and {@code i + 1} does not worsen the objective
	 */
	public boolean swapDoesNotWorsen(double[] weights, double[] durations, int i) {
		// TODO: compare the weighted completion cost of the pair before and after the swap.
		throw new UnsupportedOperationException("TODO: implement swapDoesNotWorsen");
	}
}
