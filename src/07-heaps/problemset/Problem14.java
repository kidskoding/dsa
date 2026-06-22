/**
 * Problem 14 — Sort a nearly sorted array.
 *
 * <p>Given an array in which every element is at most {@code k} positions away from its sorted
 * position, sort it ascending in {@code O(n log k)} time using a bounded-size heap.
 */
public final class Problem14 {

	private Problem14() {}

	/**
	 * Sorts a {@code k}-sorted array ascending in place.
	 *
	 * @param array the nearly sorted array to sort in place
	 * @param k the maximum distance any element is from its sorted position
	 */
	public static void sortNearlySorted(int[] array, int k) {
		// TODO: keep a size-(k+1) min-heap window; pop the min into the output as the window slides.
		throw new UnsupportedOperationException("TODO: implement sortNearlySorted");
	}
}
