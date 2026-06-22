/** Tier 3 — Problem 15: Offline Interval Scheduling via Order-Statistics Tree. */
public class Problem15 {

	/**
	 * Selects a maximum-weight subset of pairwise non-overlapping intervals from the given closed
	 * intervals and returns the total weight of that subset.
	 *
	 * @param starts the interval start points
	 * @param ends the interval end points, aligned with {@code starts}
	 * @param weights the interval weights, aligned with {@code starts}
	 * @return the maximum achievable total weight of non-overlapping intervals
	 */
	public long maxNonOverlapping(int[] starts, int[] ends, int[] weights) {
		// TODO: sort by end and use an order-statistics structure for the weighted DP.
		throw new UnsupportedOperationException("TODO: implement maxNonOverlapping");
	}
}
