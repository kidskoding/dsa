/**
 * A generic {@code d}-ary min-heap implemented from scratch.
 *
 * <p>Generalizes the binary heap so each node has up to {@code d} children. With a 0-indexed array
 * layout and branching factor {@code d}, the parent of node {@code i} is {@code (i - 1) / d} and
 * its {@code j}-th child ({@code 0 <= j < d}) is {@code d * i + j + 1}. Larger {@code d} shortens
 * the tree (cheaper inserts/decrease-key) at the cost of more comparisons per sift-down.
 *
 * @param <T> the type of elements held in this heap; must be {@link Comparable}
 */
class DAryHeap<T extends Comparable<T>> {

	// TODO: store the branching factor d, the backing array, and a size field.

	/**
	 * Creates an empty {@code d}-ary heap with the given branching factor.
	 *
	 * @param d the number of children per node; must be at least 2
	 * @throws IllegalArgumentException if {@code d < 2}
	 */
	public DAryHeap(int d) {
		// TODO: validate d >= 2 and initialize backing storage.
		throw new UnsupportedOperationException("TODO: implement DAryHeap constructor");
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
		// TODO: swap root with last, shrink size, sift the new root down over all d children.
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
	 * Returns the index of the parent of the node at {@code index}.
	 *
	 * @param index a 0-indexed node index
	 * @return the parent index, {@code (index - 1) / d}
	 */
	public int parent(int index) {
		// TODO: compute the parent index using the branching factor.
		throw new UnsupportedOperationException("TODO: implement parent");
	}

	/**
	 * Returns the index of the {@code j}-th child of the node at {@code index}.
	 *
	 * @param index a 0-indexed node index
	 * @param j the child ordinal, {@code 0 <= j < d}
	 * @return the child index, {@code d * index + j + 1}
	 */
	public int child(int index, int j) {
		// TODO: compute the j-th child index using the branching factor.
		throw new UnsupportedOperationException("TODO: implement child");
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
