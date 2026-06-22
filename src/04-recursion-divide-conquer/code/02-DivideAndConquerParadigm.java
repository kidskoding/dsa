/**
 * The divide-and-conquer paradigm: divide the problem, conquer the pieces recursively, and combine.
 * Implement each method from scratch — see the workbook page {@code
 * divide-and-conquer-paradigm.md}.
 */
class DivideAndConquerParadigm {

	/**
	 * Returns the maximum element of {@code values} using a divide-and-conquer recursion that splits
	 * the range in half and combines the two sub-maxima.
	 *
	 * @param values a non-empty array
	 * @return the largest element
	 * @throws IllegalArgumentException if {@code values} is empty
	 */
	public int max(int[] values) {
		// TODO: split [lo, hi] at the midpoint, recurse, and combine with Math.max.
		throw new UnsupportedOperationException("TODO: implement max");
	}

	/**
	 * Returns a sorted copy of {@code values} using merge sort (divide into halves, sort each,
	 * merge).
	 *
	 * @param values the array to sort (not mutated)
	 * @return a new sorted array
	 */
	public int[] mergeSort(int[] values) {
		// TODO: base case of length <= 1, split, recurse on each half, then merge.
		throw new UnsupportedOperationException("TODO: implement mergeSort");
	}
}
