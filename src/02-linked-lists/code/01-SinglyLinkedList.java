/**
 * A singly linked list: a chain of nodes, each holding a value and a reference to the next node.
 * Implement every method from scratch — see the workbook page {@code singly-linked-list.md}.
 *
 * @param <T> the element type
 */
class SinglyLinkedList<T> {

	/** A single node in a {@link SinglyLinkedList}. */
	static final class SinglyNode<T> {
		T value;
		SinglyNode<T> next;

		SinglyNode(T value) {
			this.value = value;
		}
	}

	/**
	 * Returns the number of elements currently stored.
	 *
	 * @return the element count
	 */
	public int size() {
		// TODO: track or count the nodes.
		throw new UnsupportedOperationException("TODO: implement size");
	}

	/**
	 * Returns whether the list contains no elements.
	 *
	 * @return {@code true} if empty
	 */
	public boolean isEmpty() {
		// TODO: report whether the head is null / size is zero.
		throw new UnsupportedOperationException("TODO: implement isEmpty");
	}

	/**
	 * Inserts a value at the front of the list in O(1).
	 *
	 * @param value the value to insert
	 */
	public void addFirst(T value) {
		// TODO: create a node and relink the head.
		throw new UnsupportedOperationException("TODO: implement addFirst");
	}

	/**
	 * Appends a value to the end of the list.
	 *
	 * @param value the value to append
	 */
	public void addLast(T value) {
		// TODO: walk to the tail (or keep a tail pointer) and link.
		throw new UnsupportedOperationException("TODO: implement addLast");
	}

	/**
	 * Returns the element at the given index.
	 *
	 * @param index zero-based position
	 * @return the element at {@code index}
	 */
	public T get(int index) {
		// TODO: walk forward index steps, validating bounds.
		throw new UnsupportedOperationException("TODO: implement get");
	}

	/**
	 * Removes and returns the first element.
	 *
	 * @return the removed head value
	 */
	public T removeFirst() {
		// TODO: unlink and return the head value, validating non-empty.
		throw new UnsupportedOperationException("TODO: implement removeFirst");
	}

	/**
	 * Removes the first node whose value equals {@code value}.
	 *
	 * @param value the value to remove
	 * @return {@code true} if a node was removed
	 */
	public boolean remove(T value) {
		// TODO: find the predecessor and splice the node out.
		throw new UnsupportedOperationException("TODO: implement remove");
	}

	/**
	 * Returns whether any node holds a value equal to {@code value}.
	 *
	 * @param value the value to search for
	 * @return {@code true} if found
	 */
	public boolean contains(T value) {
		// TODO: linear scan from the head.
		throw new UnsupportedOperationException("TODO: implement contains");
	}

	/** Reverses the list in place. */
	public void reverse() {
		// TODO: three-pointer iterative reversal in O(1) space.
		throw new UnsupportedOperationException("TODO: implement reverse");
	}
}
