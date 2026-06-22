/**
 * Problem 2 — Is It a Min-Heap?
 *
 * <p>Given an integer array using the standard array-as-complete-binary-tree layout, decide whether
 * it satisfies the min-heap property: every node is {@code <=} each of its children. An empty or
 * single-element array is trivially valid.
 */
final class Problem2 {

	private Problem2() {}

	/**
	 * Reports whether {@code array} is a valid min-heap.
	 *
	 * @param array the array to test
	 * @return {@code true} if every parent is {@code <=} its children
	 */
	static boolean isMinHeap(int[] array) {
		// TODO: for each child index, compare it against its parent (child - 1) / 2.
		throw new UnsupportedOperationException("TODO: implement isMinHeap");
	}
}
