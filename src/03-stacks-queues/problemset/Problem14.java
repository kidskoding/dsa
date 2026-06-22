/**
 * Problem 14 — Minimum in all subarrays via deque.
 *
 * <p>Given an array and a window size {@code k}, return the minimum of each window using a
 * monotonic deque, generalizing the sliding-window technique.
 */
public final class Problem14 {

	private Problem14() {}

	/**
	 * Returns the minimum of each contiguous window of size {@code k}.
	 *
	 * @param nums the input array
	 * @param k the window size (assumed {@code 1 <= k <= nums.length})
	 * @return an array of length {@code nums.length - k + 1} of per-window minima
	 */
	public static int[] minSlidingWindow(int[] nums, int k) {
		// TODO: maintain indices in a deque whose values are increasing; evict out-of-window
		//			 and dominated indices.
		throw new UnsupportedOperationException("TODO: implement minSlidingWindow");
	}
}
