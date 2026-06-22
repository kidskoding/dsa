/**
 * Problem 01 — Heapify down.
 *
 * <p>Given an integer array, a heap size, and an index whose two child subtrees already satisfy the
 * max-heap property, sift the element at that index down so the whole subtree rooted there becomes
 * a valid max-heap.
 */
public final class Problem01 {

	private Problem01() {}

	/**
	 * Sifts the element at {@code index} down within {@code [0, heapSize)} to restore the max-heap
	 * property of the subtree rooted at {@code index}.
	 *
	 * @param heap the heap's backing array (0-indexed complete-tree layout)
	 * @param index the index of the element to sift down
	 * @param heapSize the number of leading slots that participate in the heap
	 */
	public static void heapifyDown(int[] heap, int index, int heapSize) {
		// TODO: repeatedly swap with the larger child while it exceeds the current element.
		throw new UnsupportedOperationException("TODO: implement heapifyDown");
	}
}
