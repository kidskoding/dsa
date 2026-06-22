/** Tier 1 — Problem 04: Fractional Job Scheduling Profit. */
public class Problem04 {

	/**
	 * Returns the minimum total weighted completion time achievable by ordering jobs on a single
	 * machine, where job {@code i} has weight {@code weights[i]} and duration {@code durations[i]}.
	 * The optimal order is by decreasing Smith ratio {@code weight / duration}; the completion time
	 * of a job is the sum of all durations up to and including it.
	 *
	 * @param weights the job weights, parallel to {@code durations}
	 * @param durations the job durations, parallel to {@code weights}
	 * @return the minimum total weighted completion time
	 */
	public long minWeightedCompletionTime(int[] weights, int[] durations) {
		// TODO: sort by the Smith ratio, accumulate completion times, sum weight * completion.
		throw new UnsupportedOperationException("TODO: implement minWeightedCompletionTime");
	}
}
