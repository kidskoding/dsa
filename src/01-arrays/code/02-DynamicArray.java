/**
 * A growable, array-backed list with amortized O(1) append via capacity doubling. Implement each
 * method from first principles — see the workbook page {@code dynamic-arrays.md} for the resizing
 * strategy and amortized analysis.
 *
 * @param <T> the element type
 */
class DynamicArray<T> {
	/** Constructs an empty dynamic array with a default starting capacity. */
	public DynamicArray() {
		// TODO: allocate a small initial backing array and set size to 0.
		throw new UnsupportedOperationException("TODO: implement DynamicArray()");
	}

	/**
	 * Constructs an empty dynamic array with the given initial capacity.
	 *
	 * @param initialCapacity the starting backing-array length; must be non-negative
	 * @throws IllegalArgumentException if {@code initialCapacity} is negative
	 */
	public DynamicArray(int initialCapacity) {
		// TODO: allocate a backing array of the requested capacity.
		throw new UnsupportedOperationException("TODO: implement DynamicArray(int)");
	}

	/**
	 * Returns the number of elements currently stored.
	 *
	 * @return the logical size
	 */
	public int size() {
		// TODO: return the number of stored elements.
		throw new UnsupportedOperationException("TODO: implement size");
	}

	/**
	 * Returns the current backing-array length.
	 *
	 * @return the physical capacity
	 */
	public int capacity() {
		// TODO: return the length of the backing array.
		throw new UnsupportedOperationException("TODO: implement capacity");
	}

	/**
	 * Returns whether the array holds no elements.
	 *
	 * @return {@code true} if {@code size() == 0}
	 */
	public boolean isEmpty() {
		// TODO: return whether size is zero.
		throw new UnsupportedOperationException("TODO: implement isEmpty");
	}

	/**
	 * Appends {@code value} to the end, growing the backing array if full. Amortized O(1).
	 *
	 * @param value the element to append
	 */
	public void add(T value) {
		// TODO: ensure capacity (doubling on overflow), then store at the tail.
		throw new UnsupportedOperationException("TODO: implement add");
	}

	/**
	 * Inserts {@code value} at {@code index}, shifting later elements right. O(n).
	 *
	 * @param index the position to insert at; must satisfy {@code 0 <= index <= size()}
	 * @param value the element to insert
	 * @throws IndexOutOfBoundsException if {@code index} is out of range
	 */
	public void insert(int index, T value) {
		// TODO: bounds-check, ensure capacity, shift right, then store.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Returns the element at {@code index} in constant time.
	 *
	 * @param index the position; must satisfy {@code 0 <= index < size()}
	 * @return the element at {@code index}
	 * @throws IndexOutOfBoundsException if {@code index} is out of range
	 */
	public T get(int index) {
		// TODO: bounds-check, then return the element.
		throw new UnsupportedOperationException("TODO: implement get");
	}

	/**
	 * Replaces the element at {@code index}, returning the previous value.
	 *
	 * @param index the position; must satisfy {@code 0 <= index < size()}
	 * @param value the new element
	 * @return the element previously stored at {@code index}
	 * @throws IndexOutOfBoundsException if {@code index} is out of range
	 */
	public T set(int index, T value) {
		// TODO: bounds-check, swap in the new value, return the old one.
		throw new UnsupportedOperationException("TODO: implement set");
	}

	/**
	 * Removes and returns the element at {@code index}, shifting later elements left. O(n).
	 *
	 * @param index the position; must satisfy {@code 0 <= index < size()}
	 * @return the removed element
	 * @throws IndexOutOfBoundsException if {@code index} is out of range
	 */
	public T remove(int index) {
		// TODO: bounds-check, capture the value, shift left, shrink size.
		throw new UnsupportedOperationException("TODO: implement remove");
	}
}
