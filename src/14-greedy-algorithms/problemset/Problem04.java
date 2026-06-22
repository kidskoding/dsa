/** Greedy Algorithms — Problem 4: Job Sequencing by Smith's Rule. */
class Problem04 {

	/**
	 * Returns the minimum total weighted completion time on a single machine. The optimal order is
	 * by ascending {@code duration / weight} (Smith's rule).
	 *
	 * @param weight the positive job weights
	 * @param duration the positive job durations, parallel to {@code weight}
	 * @return the minimum achievable sum of {@code weight_i * completionTime_i}
	 */
	long minWeightedCompletion(int[] weight, int[] duration) {
		// TODO: sort by duration/weight ratio; accumulate completion time and weighted sum.
		throw new UnsupportedOperationException("TODO: implement minWeightedCompletion");
	}
}
