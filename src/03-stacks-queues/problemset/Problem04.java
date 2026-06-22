/**
 * Problem 04 — Stack from two queues.
 *
 * <p>Implement a LIFO stack using only two queues. Support {@code push} and {@code pop}.
 *
 * @param <T> the type of elements held in this stack
 */
public final class Problem04<T> {

	// TODO: declare two queues and decide whether push or pop does the rotation work.

	/** Creates an empty stack backed by two queues. */
	public Problem04() {
		// TODO: initialize the two backing queues.
		throw new UnsupportedOperationException("TODO: implement Problem04 constructor");
	}

	/**
	 * Pushes an element onto the top of the stack.
	 *
	 * @param value the element to push
	 */
	public void push(T value) {
		// TODO: enqueue and rotate so the newest element is at the front for dequeue.
		throw new UnsupportedOperationException("TODO: implement push");
	}

	/**
	 * Removes and returns the element at the top of the stack.
	 *
	 * @return the top element
	 * @throws java.util.NoSuchElementException if the stack is empty
	 */
	public T pop() {
		// TODO: dequeue the front element (most recently pushed).
		throw new UnsupportedOperationException("TODO: implement pop");
	}

	/**
	 * Returns {@code true} if the stack contains no elements.
	 *
	 * @return whether the stack is empty
	 */
	public boolean isEmpty() {
		// TODO: report whether the stack holds no elements.
		throw new UnsupportedOperationException("TODO: implement isEmpty");
	}
}
