/**
 * Bottom-up heap construction utilities over primitive {@code int[]} arrays.
 *
 * <p>Implement these from scratch. The headline result is that turning an arbitrary array into a
 * heap by sifting every internal node down — starting at the last parent and walking toward the
 * root — runs in {@code O(n)} time, not {@code O(n log n)}. Use the standard 0-indexed layout:
 * parent {@code (i - 1) / 2}, children {@code 2 * i + 1} and {@code 2 * i + 2}.
 *
 * <p>This is a static utility class and is not meant to be instantiated.
 */
final class BuildHeap {

	private BuildHeap() {
		// Utility class; prevent instantiation.
	}

	/**
	 * Rearranges the array in place into a valid max-heap using the linear-time bottom-up procedure.
	 *
	 * @param array the array to heapify in place
	 */
	public static void buildMaxHeap(int[] array) {
		// TODO: for i from the last parent down to 0, sift array[i] down within [0, array.length).
		throw new UnsupportedOperationException("TODO: implement buildMaxHeap");
	}

	/**
	 * Sifts the element at {@code index} down within {@code [0, heapSize)} so that the subtree rooted
	 * at {@code index} satisfies the max-heap property, assuming both child subtrees already do.
	 *
	 * @param array the heap's backing array
	 * @param index the index of the element to sift down
	 * @param heapSize the number of array slots that participate in the heap
	 */
	public static void siftDown(int[] array, int index, int heapSize) {
		// TODO: repeatedly swap with the larger child while it exceeds the current element.
		throw new UnsupportedOperationException("TODO: implement siftDown");
	}

	/**
	 * Returns whether the given array satisfies the max-heap property over {@code [0, array.length)}.
	 *
	 * @param array the array to test
	 * @return {@code true} if every parent is {@code >=} each of its children
	 */
	public static boolean isMaxHeap(int[] array) {
		// TODO: verify array[parent] >= array[child] for every child index.
		throw new UnsupportedOperationException("TODO: implement isMaxHeap");
	}
}
