/**
 * A generic LIFO (last-in, first-out) stack implemented from scratch.
 *
 * <p>Implement this from the ground up — do not delegate to {@link java.util.Stack} or {@link
 * java.util.Deque}. Aim for amortized {@code O(1)} {@code push}/{@code pop} (e.g. a doubling
 * dynamic array or a singly linked chain of nodes).
 *
 * @param <T> the type of elements held in this stack
 */
class Stack<T> {

	// TODO: choose and declare your backing storage (dynamic array or linked nodes)
	//			 plus a size field.

	/** Creates an empty stack. */
	public Stack() {
		// TODO: initialize backing storage.
		throw new UnsupportedOperationException("TODO: implement Stack constructor");
	}

	/**
	 * Pushes an element onto the top of the stack.
	 *
	 * @param value the element to push
	 */
	public void push(T value) {
		// TODO: add value to the top; grow capacity if needed.
		throw new UnsupportedOperationException("TODO: implement push");
	}

	/**
	 * Removes and returns the element at the top of the stack.
	 *
	 * @return the element that was on top
	 * @throws java.util.NoSuchElementException if the stack is empty
	 */
	public T pop() {
		// TODO: remove and return the top element; throw if empty.
		throw new UnsupportedOperationException("TODO: implement pop");
	}

	/**
	 * Returns, without removing, the element at the top of the stack.
	 *
	 * @return the element on top
	 * @throws java.util.NoSuchElementException if the stack is empty
	 */
	public T peek() {
		// TODO: return the top element without removing it; throw if empty.
		throw new UnsupportedOperationException("TODO: implement peek");
	}

	/**
	 * Returns {@code true} if the stack contains no elements.
	 *
	 * @return whether the stack is empty
	 */
	public boolean isEmpty() {
		// TODO: report whether size is zero.
		throw new UnsupportedOperationException("TODO: implement isEmpty");
	}

	/**
	 * Returns the number of elements in the stack.
	 *
	 * @return the current size
	 */
	public int size() {
		// TODO: return the number of stored elements.
		throw new UnsupportedOperationException("TODO: implement size");
	}
}
