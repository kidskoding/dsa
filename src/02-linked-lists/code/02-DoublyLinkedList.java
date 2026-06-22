/**
 * A doubly linked list: each node references both its predecessor and successor, enabling O(1)
 * insertion and removal at either end. Implement every method from scratch — see the workbook page
 * {@code doubly-linked-list.md}.
 *
 * @param <T> the element type
 */
class DoublyLinkedList<T> {

	/** A single node in a {@link DoublyLinkedList}. */
	static final class DoublyNode<T> {
		T value;
		DoublyNode<T> prev;
		DoublyNode<T> next;

		DoublyNode(T value) {
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
		// TODO: report whether head/tail are null.
		throw new UnsupportedOperationException("TODO: implement isEmpty");
	}

	/**
	 * Inserts a value at the front in O(1).
	 *
	 * @param value the value to insert
	 */
	public void addFirst(T value) {
		// TODO: relink head and the new node's prev/next.
		throw new UnsupportedOperationException("TODO: implement addFirst");
	}

	/**
	 * Inserts a value at the back in O(1).
	 *
	 * @param value the value to insert
	 */
	public void addLast(T value) {
		// TODO: relink tail and the new node's prev/next.
		throw new UnsupportedOperationException("TODO: implement addLast");
	}

	/**
	 * Returns the first element without removing it.
	 *
	 * @return the head value
	 */
	public T peekFirst() {
		// TODO: return head value, validating non-empty.
		throw new UnsupportedOperationException("TODO: implement peekFirst");
	}

	/**
	 * Returns the last element without removing it.
	 *
	 * @return the tail value
	 */
	public T peekLast() {
		// TODO: return tail value, validating non-empty.
		throw new UnsupportedOperationException("TODO: implement peekLast");
	}

	/**
	 * Removes and returns the first element in O(1).
	 *
	 * @return the removed head value
	 */
	public T removeFirst() {
		// TODO: unlink head, fix prev pointers, validate non-empty.
		throw new UnsupportedOperationException("TODO: implement removeFirst");
	}

	/**
	 * Removes and returns the last element in O(1).
	 *
	 * @return the removed tail value
	 */
	public T removeLast() {
		// TODO: unlink tail, fix next pointers, validate non-empty.
		throw new UnsupportedOperationException("TODO: implement removeLast");
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
}
