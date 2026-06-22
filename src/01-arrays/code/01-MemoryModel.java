/**
 * Explores the contiguous, fixed-size array memory model: index arithmetic over a flat block of
 * storage and the constant-time random access it enables. Implement each method from first
 * principles — see the workbook page {@code memory-model.md} for definitions and invariants.
 *
 * @param <T> the element type stored in the backing block
 */
class MemoryModel<T> {

	/**
	 * Allocates a fixed-size contiguous block capable of holding {@code capacity} elements.
	 *
	 * @param capacity the number of slots to reserve; must be non-negative
	 * @throws IllegalArgumentException if {@code capacity} is negative
	 */
	public MemoryModel(int capacity) {
		// TODO: allocate the backing storage of the given fixed capacity.
		throw new UnsupportedOperationException("TODO: implement MemoryModel(int)");
	}

	/**
	 * Returns the fixed number of slots in the block.
	 *
	 * @return the capacity supplied at construction
	 */
	public int capacity() {
		// TODO: return the fixed capacity of the backing block.
		throw new UnsupportedOperationException("TODO: implement capacity");
	}

	/**
	 * Reads the element at {@code index} in constant time via direct address arithmetic.
	 *
	 * @param index the slot to read; must satisfy {@code 0 <= index < capacity()}
	 * @return the element currently stored at {@code index}
	 * @throws IndexOutOfBoundsException if {@code index} is out of range
	 */
	public T get(int index) {
		// TODO: bounds-check, then return the slot at the computed address.
		throw new UnsupportedOperationException("TODO: implement get");
	}

	/**
	 * Writes {@code value} into the slot at {@code index} in constant time.
	 *
	 * @param index the slot to write; must satisfy {@code 0 <= index < capacity()}
	 * @param value the element to store
	 * @throws IndexOutOfBoundsException if {@code index} is out of range
	 */
	public void set(int index, T value) {
		// TODO: bounds-check, then store value at the computed address.
		throw new UnsupportedOperationException("TODO: implement set");
	}

	/**
	 * Computes the flat byte/word offset of {@code index} given a per-element stride, i.e. {@code
	 * base + index * elementSize}. This is the address formula that makes random access O(1).
	 *
	 * @param index the logical element index; must be non-negative
	 * @param elementSize the size (in words/bytes) of a single element; must be positive
	 * @return the offset of the element from the start of the block
	 * @throws IndexOutOfBoundsException if {@code index} is out of range
	 * @throws IllegalArgumentException if {@code elementSize} is not positive
	 */
	public long addressOf(int index, int elementSize) {
		// TODO: validate, then return index * elementSize.
		throw new UnsupportedOperationException("TODO: implement addressOf");
	}
}
