/**
 * Problem 19 — Sliding Window Median.
 *
 * <p>Given an integer array {@code nums} and a window size {@code k}, return the median of each
 * contiguous window of size {@code k} as the window slides. For even {@code k} the median is the
 * average of the two middle values. Maintain two balanced heaps with lazy deletion.
 */
final class Problem19 {

	private Problem19() {}

	/**
	 * Returns the median of each size-{@code k} window of {@code nums}.
	 *
	 * @param nums the input values
	 * @param k the window size
	 * @return the per-window medians as doubles
	 */
	static double[] medianSlidingWindow(int[] nums, int k) {
		// TODO: keep two balanced heaps over the window, removing the outgoing element each step.
		throw new UnsupportedOperationException("TODO: implement medianSlidingWindow");
	}
}
