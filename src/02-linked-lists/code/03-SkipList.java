/**
 * A skip list: a probabilistic, multi-level linked structure that supports expected O(log n)
 * search, insertion, and deletion over a sorted set of elements. Implement every method from
 * scratch — see the workbook page {@code skip-lists.md}.
 *
 * @param <T> the element type, which must be {@link Comparable}
 */
class SkipList<T extends Comparable<T>> {

	/** A tower node in a {@link SkipList}; {@code forward[i]} is the successor at level {@code i}. */
	static final class SkipNode<T> {
		T value;
		SkipNode<T>[] forward;

		@SuppressWarnings("unchecked")
		SkipNode(T value, int level) {
			this.value = value;
			this.forward = (SkipNode<T>[]) new SkipNode<?>[level];
		}
	}

	/**
	 * Returns the number of distinct elements currently stored.
	 *
	 * @return the element count
	 */
	public int size() {
		// TODO: track the element count.
		throw new UnsupportedOperationException("TODO: implement size");
	}

	/**
	 * Returns whether the skip list contains no elements.
	 *
	 * @return {@code true} if empty
	 */
	public boolean isEmpty() {
		// TODO: report whether size is zero.
		throw new UnsupportedOperationException("TODO: implement isEmpty");
	}

	/**
	 * Inserts a value, choosing a random tower height. Duplicate values are ignored.
	 *
	 * @param value the value to insert
	 * @return {@code true} if the value was newly added
	 */
	public boolean insert(T value) {
		// TODO: find the update path, roll a level, splice in the new tower.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Returns whether {@code value} is present.
	 *
	 * @param value the value to search for
	 * @return {@code true} if found
	 */
	public boolean contains(T value) {
		// TODO: descend from the top level, advancing while forward < value.
		throw new UnsupportedOperationException("TODO: implement contains");
	}

	/**
	 * Removes {@code value} if present.
	 *
	 * @param value the value to remove
	 * @return {@code true} if a value was removed
	 */
	public boolean remove(T value) {
		// TODO: find the update path and unlink the tower at every level.
		throw new UnsupportedOperationException("TODO: implement remove");
	}
}
