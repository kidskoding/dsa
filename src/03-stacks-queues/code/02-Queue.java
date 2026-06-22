/**
 * A generic FIFO (first-in, first-out) queue implemented from scratch.
 *
 * <p>Implement this from the ground up — do not delegate to {@link java.util.LinkedList} or {@link
 * java.util.ArrayDeque}. Aim for {@code O(1)} {@code enqueue}/{@code dequeue} (e.g. a circular
 * buffer over a dynamic array, or head/tail node pointers in a linked chain).
 *
 * @param <T> the type of elements held in this queue
 */
class Queue<T> {

	// TODO: choose and declare your backing storage. For a circular buffer, track
	//			 head index, tail index, and size. For a linked chain, track head and
	//			 tail node references.

	/** Creates an empty queue. */
	public Queue() {
		// TODO: initialize backing storage.
		throw new UnsupportedOperationException("TODO: implement Queue constructor");
	}

	/**
	 * Adds an element to the back of the queue.
	 *
	 * @param value the element to enqueue
	 */
	public void enqueue(T value) {
		// TODO: append value at the tail; grow capacity if needed.
		throw new UnsupportedOperationException("TODO: implement enqueue");
	}

	/**
	 * Removes and returns the element at the front of the queue.
	 *
	 * @return the element that was at the front
	 * @throws java.util.NoSuchElementException if the queue is empty
	 */
	public T dequeue() {
		// TODO: remove and return the front element; throw if empty.
		throw new UnsupportedOperationException("TODO: implement dequeue");
	}

	/**
	 * Returns, without removing, the element at the front of the queue.
	 *
	 * @return the element at the front
	 * @throws java.util.NoSuchElementException if the queue is empty
	 */
	public T peek() {
		// TODO: return the front element without removing it; throw if empty.
		throw new UnsupportedOperationException("TODO: implement peek");
	}

	/**
	 * Returns {@code true} if the queue contains no elements.
	 *
	 * @return whether the queue is empty
	 */
	public boolean isEmpty() {
		// TODO: report whether size is zero.
		throw new UnsupportedOperationException("TODO: implement isEmpty");
	}

	/**
	 * Returns the number of elements in the queue.
	 *
	 * @return the current size
	 */
	public int size() {
		// TODO: return the number of stored elements.
		throw new UnsupportedOperationException("TODO: implement size");
	}
}
