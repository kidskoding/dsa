/**
 * Problem 12 — Sort a Nearly Sorted Array.
 *
 * <p>Given an array in which every element is at most {@code k} positions from its sorted position,
 * sort it ascending in {@code O(n log k)} time using a bounded-size min-heap of capacity
 * {@code k + 1}.
 */
final class Problem12 {

	private Problem12() {}

	/**
	 * Sorts a nearly sorted {@code array} ascending using a bounded heap.
	 *
	 * @param array the input values, each within {@code k} of its sorted position
	 * @param k the displacement bound
	 * @return the values in ascending order
	 */
	static int[] sortNearlySorted(int[] array, int k) {
		// TODO: keep a min-heap of capacity k + 1, popping the minimum as you advance.
		throw new UnsupportedOperationException("TODO: implement sortNearlySorted");
	}
}
