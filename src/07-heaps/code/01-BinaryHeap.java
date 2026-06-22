/**
 * A generic binary min-heap implemented from scratch.
 *
 * <p>Implement this from the ground up — do not delegate to {@link java.util.PriorityQueue}. Use
 * the standard array-as-complete-binary-tree layout: for a 0-indexed node {@code i}, its parent is
 * {@code (i - 1) / 2} and its children are {@code 2 * i + 1} and {@code 2 * i + 2}. Maintain the
 * min-heap property (every parent {@code <=} its children) via sift-up and sift-down.
 *
 * @param <T> the type of elements held in this heap; must be {@link Comparable}
 */
class BinaryHeap<T extends Comparable<T>> {

	// TODO: choose and declare your backing storage (e.g. a doubling array) plus a size field.

	/** Creates an empty binary heap. */
	public BinaryHeap() {
		// TODO: initialize backing storage.
		throw new UnsupportedOperationException("TODO: implement BinaryHeap constructor");
	}

	/**
	 * Inserts a value into the heap, restoring the min-heap property.
	 *
	 * @param value the element to insert
	 */
	public void insert(T value) {
		// TODO: append at the end, then sift up; grow capacity if needed.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Removes and returns the minimum element.
	 *
	 * @return the smallest element in the heap
	 * @throws java.util.NoSuchElementException if the heap is empty
	 */
	public T extractMin() {
		// TODO: swap root with last, shrink size, sift the new root down; throw if empty.
		throw new UnsupportedOperationException("TODO: implement extractMin");
	}

	/**
	 * Returns, without removing, the minimum element.
	 *
	 * @return the smallest element in the heap
	 * @throws java.util.NoSuchElementException if the heap is empty
	 */
	public T peek() {
		// TODO: return the root without removing it; throw if empty.
		throw new UnsupportedOperationException("TODO: implement peek");
	}

	/**
	 * Decreases the key stored at the given node index to a smaller value, restoring the heap
	 * property.
	 *
	 * @param index the 0-indexed node whose key is being decreased
	 * @param newValue the new, smaller key
	 * @throws IllegalArgumentException if {@code newValue} is greater than the current key
	 * @throws IndexOutOfBoundsException if {@code index} is out of range
	 */
	public void decreaseKey(int index, T newValue) {
		// TODO: validate newValue <= current, overwrite, then sift up.
		throw new UnsupportedOperationException("TODO: implement decreaseKey");
	}

	/**
	 * Returns {@code true} if the heap contains no elements.
	 *
	 * @return whether the heap is empty
	 */
	public boolean isEmpty() {
		// TODO: report whether size is zero.
		throw new UnsupportedOperationException("TODO: implement isEmpty");
	}

	/**
	 * Returns the number of elements in the heap.
	 *
	 * @return the current size
	 */
	public int size() {
		// TODO: return the number of stored elements.
		throw new UnsupportedOperationException("TODO: implement size");
	}
}
