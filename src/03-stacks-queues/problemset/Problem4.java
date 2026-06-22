/**
 * Problem 4 — Implement Queue using Stacks.
 *
 * <p>Implement a FIFO queue using only two stacks, supporting {@code push}, {@code pop},
 * {@code peek}, and {@code empty} with amortized {@code O(1)} cost.
 */
final class Problem4 {

	// TODO: keep an inbound stack and an outbound stack.

	/** Creates an empty queue. */
	Problem4() {
		// TODO: initialize the two backing stacks.
		throw new UnsupportedOperationException("TODO: implement Problem4 constructor");
	}

	/**
	 * Pushes an element to the back of the queue.
	 *
	 * @param x the value to enqueue
	 */
	void push(int x) {
		// TODO: push onto the inbound stack.
		throw new UnsupportedOperationException("TODO: implement push");
	}

	/**
	 * Removes and returns the element at the front of the queue.
	 *
	 * @return the front value
	 */
	int pop() {
		// TODO: refill the outbound stack if needed, then pop it.
		throw new UnsupportedOperationException("TODO: implement pop");
	}

	/**
	 * Returns the element at the front of the queue without removing it.
	 *
	 * @return the front value
	 */
	int peek() {
		// TODO: refill the outbound stack if needed, then peek it.
		throw new UnsupportedOperationException("TODO: implement peek");
	}

	/**
	 * Returns whether the queue is empty.
	 *
	 * @return {@code true} if both stacks are empty
	 */
	boolean empty() {
		// TODO: report whether both stacks are empty.
		throw new UnsupportedOperationException("TODO: implement empty");
	}
}
