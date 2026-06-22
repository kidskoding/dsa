/**
 * Problem 06 — Sliding window maximum.
 *
 * <p>Given an array and a window size {@code k}, return the maximum of each contiguous window using
 * a monotonic deque in {@code O(n)} time.
 */
public final class Problem06 {

	private Problem06() {}

	/**
	 * Returns the maximum of each contiguous window of size {@code k}.
	 *
	 * @param nums the input array
	 * @param k the window size (assumed {@code 1 <= k <= nums.length})
	 * @return an array of length {@code nums.length - k + 1} of per-window maxima
	 */
	public static int[] maxSlidingWindow(int[] nums, int k) {
		// TODO: maintain indices in a deque whose values are decreasing; evict out-of-window
		//			 and dominated indices.
		throw new UnsupportedOperationException("TODO: implement maxSlidingWindow");
	}
}
