/**
 * Selection: find the k-th smallest element without fully sorting. Implement from first principles —
 * see the workbook page {@code quickselect.md}.
 */
class Quickselect {
	/**
	 * Returns the {@code k}-th smallest element (1-indexed) of {@code a} in expected O(n) time using
	 * randomized partitioning. May reorder {@code a} in place.
	 *
	 * @param a the input values
	 * @param k the rank to select, with {@code 1 <= k <= a.length}
	 * @return the {@code k}-th smallest value
	 * @throws IllegalArgumentException if {@code k} is out of range
	 */
	public int kthSmallest(int[] a, int k) {
		// TODO: partition around a (random) pivot; recurse only into the side containing rank k.
		throw new UnsupportedOperationException("TODO: implement kthSmallest");
	}

	/**
	 * Lomuto/Hoare-style partition of {@code a[lo..hi]} around a chosen pivot, returning the pivot's
	 * final index. Used by {@link #kthSmallest(int[], int)}.
	 *
	 * @param a the array
	 * @param lo inclusive left bound
	 * @param hi inclusive right bound
	 * @return the final index of the pivot after partitioning
	 */
	public int partition(int[] a, int lo, int hi) {
		// TODO: place the pivot, move smaller elements left and larger right, return pivot index.
		throw new UnsupportedOperationException("TODO: implement partition");
	}

	/**
	 * Returns the {@code k}-th smallest element (1-indexed) with a worst-case O(n) guarantee using the
	 * median-of-medians pivot rule.
	 *
	 * @param a the input values
	 * @param k the rank to select, with {@code 1 <= k <= a.length}
	 * @return the {@code k}-th smallest value
	 */
	public int kthSmallestWorstCaseLinear(int[] a, int k) {
		// TODO: pick the pivot as the median of group-of-5 medians, then partition and recurse.
		throw new UnsupportedOperationException("TODO: implement kthSmallestWorstCaseLinear");
	}
}
