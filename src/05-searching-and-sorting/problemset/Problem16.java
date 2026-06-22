/**
 * Problem 16 — Wiggle sort. Reorder an array so that {@code a[0] < a[1] > a[2] < a[3] ...}. Aim for
 * O(n) average time using selection plus a three-way partition.
 */
public class Problem16 {

	/**
	 * Reorders {@code a} in place into a wiggle pattern where elements at odd indices are not smaller
	 * than their neighbours, i.e. {@code a[0] <= a[1] >= a[2] <= a[3] ...}.
	 *
	 * @param a the array to reorder (reordered in place)
	 */
	public void wiggleSort(int[] a) {
		// TODO: find the median (quickselect), then place values around it into wiggle positions.
		throw new UnsupportedOperationException("TODO: implement wiggleSort");
	}
}
