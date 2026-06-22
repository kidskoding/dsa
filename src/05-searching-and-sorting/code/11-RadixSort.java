/**
 * LSD radix sort: stably sort non-negative integers digit by digit, least-significant first, using
 * a stable counting sort per digit. Runs in \(O(d(n + b))\) for {@code d} digits in base {@code b}.
 * Implement from scratch — see {@code radix-sort.md}.
 */
class RadixSort {

	/**
	 * Sorts {@code a} in place into non-decreasing order using LSD radix sort. Assumes all values are
	 * non-negative.
	 *
	 * @param a the array to sort (sorted in place; may be empty; values {@code >= 0})
	 */
	public void sort(int[] a) {
		// TODO: iterate digit positions, applying a stable counting sort on each digit.
		throw new UnsupportedOperationException("TODO: implement radix sort");
	}
}
