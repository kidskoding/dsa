/**
 * Problem 1 — Sift Down.
 *
 * <p>Given an integer array viewed as a complete binary tree (index {@code i} has children
 * {@code 2i + 1} and {@code 2i + 2}), a heap size {@code n}, and an index {@code i} whose two child
 * subtrees already satisfy the max-heap property, sift the element at {@code i} downward in place
 * until the subtree rooted at {@code i} is a valid max-heap. Only indices in {@code [0, n)} are
 * considered.
 */
final class Problem1 {

	private Problem1() {}

	/**
	 * Sifts the element at index {@code i} down within the heap region {@code [0, n)}.
	 *
	 * @param heap the array-backed heap, modified in place
	 * @param n the active heap size
	 * @param i the index to sift down
	 */
	static void siftDown(int[] heap, int n, int i) {
		// TODO: repeatedly swap with the larger child while it exceeds the current element.
		throw new UnsupportedOperationException("TODO: implement siftDown");
	}
}
