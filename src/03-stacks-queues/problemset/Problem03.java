/**
 * Problem 03 — Queue from two stacks.
 *
 * <p>Implement a FIFO queue using only two stacks. Support {@code enqueue} and {@code dequeue} with
 * amortized {@code O(1)} cost.
 *
 * @param <T> the type of elements held in this queue
 */
public final class Problem03<T> {

	// TODO: declare two stacks — an "inbox" for enqueued items and an "outbox" for
	//			 dequeued items (lazily transfer when the outbox is empty).

	/** Creates an empty queue backed by two stacks. */
	public Problem03() {
		// TODO: initialize the two backing stacks.
		throw new UnsupportedOperationException("TODO: implement Problem03 constructor");
	}

	/**
	 * Adds an element to the back of the queue.
	 *
	 * @param value the element to enqueue
	 */
	public void enqueue(T value) {
		// TODO: push onto the inbox stack.
		throw new UnsupportedOperationException("TODO: implement enqueue");
	}

	/**
	 * Removes and returns the element at the front of the queue.
	 *
	 * @return the front element
	 * @throws java.util.NoSuchElementException if the queue is empty
	 */
	public T dequeue() {
		// TODO: if the outbox is empty, move everything from inbox to outbox; then pop.
		throw new UnsupportedOperationException("TODO: implement dequeue");
	}

	/**
	 * Returns {@code true} if the queue contains no elements.
	 *
	 * @return whether the queue is empty
	 */
	public boolean isEmpty() {
		// TODO: empty only when both stacks are empty.
		throw new UnsupportedOperationException("TODO: implement isEmpty");
	}
}
