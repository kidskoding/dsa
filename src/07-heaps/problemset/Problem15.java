/**
 * Problem 15 — Sliding-window maximum.
 *
 * <p>Given an integer array and a window size {@code w}, return the maximum of each contiguous
 * window of size {@code w}.
 */
public final class Problem15 {

	private Problem15() {}

	/**
	 * Returns the maximum of each contiguous window of size {@code w}.
	 *
	 * @param array the input values
	 * @param w the window size ({@code 1 <= w <= array.length})
	 * @return an array of length {@code array.length - w + 1} of per-window maxima
	 * @throws IllegalArgumentException if {@code w} is out of range
	 */
	public static int[] maxSlidingWindow(int[] array, int w) {
		// TODO: maintain a heap (or monotonic deque) keyed by value to report each window's max.
		throw new UnsupportedOperationException("TODO: implement maxSlidingWindow");
	}
}
