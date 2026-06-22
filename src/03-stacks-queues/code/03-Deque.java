/**
 * A generic double-ended queue (deque) implemented from scratch.
 *
 * <p>Supports insertion and removal at both the front and the back in {@code O(1)} amortized time.
 * Implement this from the ground up — do not delegate to {@link java.util.ArrayDeque}. A doubly
 * linked chain or a circular dynamic array both work well.
 *
 * @param <T> the type of elements held in this deque
 */
class Deque<T> {

	// TODO: choose and declare your backing storage so that both ends support
	//			 O(1) insertion and removal.

	/** Creates an empty deque. */
	public Deque() {
		// TODO: initialize backing storage.
		throw new UnsupportedOperationException("TODO: implement Deque constructor");
	}

	/**
	 * Inserts an element at the front of the deque.
	 *
	 * @param value the element to insert
	 */
	public void addFirst(T value) {
		// TODO: insert value at the front.
		throw new UnsupportedOperationException("TODO: implement addFirst");
	}

	/**
	 * Inserts an element at the back of the deque.
	 *
	 * @param value the element to insert
	 */
	public void addLast(T value) {
		// TODO: insert value at the back.
		throw new UnsupportedOperationException("TODO: implement addLast");
	}

	/**
	 * Removes and returns the element at the front of the deque.
	 *
	 * @return the element that was at the front
	 * @throws java.util.NoSuchElementException if the deque is empty
	 */
	public T removeFirst() {
		// TODO: remove and return the front element; throw if empty.
		throw new UnsupportedOperationException("TODO: implement removeFirst");
	}

	/**
	 * Removes and returns the element at the back of the deque.
	 *
	 * @return the element that was at the back
	 * @throws java.util.NoSuchElementException if the deque is empty
	 */
	public T removeLast() {
		// TODO: remove and return the back element; throw if empty.
		throw new UnsupportedOperationException("TODO: implement removeLast");
	}

	/**
	 * Returns, without removing, the element at the front of the deque.
	 *
	 * @return the element at the front
	 * @throws java.util.NoSuchElementException if the deque is empty
	 */
	public T peekFirst() {
		// TODO: return the front element without removing it; throw if empty.
		throw new UnsupportedOperationException("TODO: implement peekFirst");
	}

	/**
	 * Returns, without removing, the element at the back of the deque.
	 *
	 * @return the element at the back
	 * @throws java.util.NoSuchElementException if the deque is empty
	 */
	public T peekLast() {
		// TODO: return the back element without removing it; throw if empty.
		throw new UnsupportedOperationException("TODO: implement peekLast");
	}

	/**
	 * Returns {@code true} if the deque contains no elements.
	 *
	 * @return whether the deque is empty
	 */
	public boolean isEmpty() {
		// TODO: report whether size is zero.
		throw new UnsupportedOperationException("TODO: implement isEmpty");
	}

	/**
	 * Returns the number of elements in the deque.
	 *
	 * @return the current size
	 */
	public int size() {
		// TODO: return the number of stored elements.
		throw new UnsupportedOperationException("TODO: implement size");
	}
}
