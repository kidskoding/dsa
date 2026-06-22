/**
 * Problem 12 — Search in a rotated sorted array. A sorted array is rotated at an unknown pivot.
 * Find a target's index in \(O(\log n)\) without first finding the pivot separately.
 */
public class Problem12 {

	/**
	 * Returns the index of {@code target} in {@code a}, a distinct-valued ascending array that has
	 * been rotated at an unknown pivot, or {@code -1} if it is absent.
	 *
	 * @param a a rotated, ascending-then-wrapping array of distinct values
	 * @param target the value to locate
	 * @return the index of {@code target}, or {@code -1} if not found
	 */
	public int search(int[] a, int target) {
		// TODO: binary search, deciding each step which half is sorted and whether target lies in it.
		throw new UnsupportedOperationException("TODO: implement rotated search");
	}
}
