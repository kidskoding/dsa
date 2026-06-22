/**
 * Problem 30 — Sliding Window Median. For a fixed window size {@code k}, return the median of each
 * contiguous window of {@code nums} as it slides one step at a time, as an array of {@code double}.
 * Maintain window order efficiently (e.g. two balanced heaps).
 */
class Problem30 {

	/**
	 * Returns the median of every contiguous window of size {@code k} in {@code nums}, in window
	 * order. For odd {@code k} the median is the middle value; for even {@code k} it is the average of
	 * the two middle values.
	 *
	 * @param nums the input array
	 * @param k the window size, with {@code 1 <= k <= nums.length}
	 * @return the per-window medians
	 */
	double[] medianSlidingWindow(int[] nums, int k) {
		// TODO: maintain the window with two heaps (or an ordered multiset) and read the median.
		throw new UnsupportedOperationException("TODO: implement medianSlidingWindow");
	}
}
