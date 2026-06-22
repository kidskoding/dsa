import java.util.List;

/**
 * Problem 17 — Smallest Range Covering Elements from K Lists.
 *
 * <p>Given {@code k} ascending-sorted lists, find the smallest range {@code [a, b]} including at
 * least one number from each list. A range is smaller if its width is smaller, or on ties if its
 * lower bound is smaller. Use a min-heap across the lists (a k-way merge tracking the running max).
 */
final class Problem17 {

	private Problem17() {}

	/**
	 * Returns the smallest covering range as a length-2 array {@code [a, b]}.
	 *
	 * @param lists the ascending-sorted input lists
	 * @return the smallest range covering at least one element from each list
	 */
	static int[] smallestRange(List<int[]> lists) {
		// TODO: advance a min-heap of one element per list, tracking the current max to size windows.
		throw new UnsupportedOperationException("TODO: implement smallestRange");
	}
}
