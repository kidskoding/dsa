/**
 * A treap: a randomized BST that is simultaneously a BST on keys and a heap on independent uniform
 * priorities, giving {@code O(log n)} expected operations without explicit balancing. See the
 * workbook page {@code treaps.md}.
 *
 * @param <T> the key type, which must be {@link Comparable}
 */
class Treap<T extends Comparable<T>> {

	/** A treap node carrying a key and a random heap priority. */
	static final class TreapNode<T> {
		T key;
		long priority;
		TreapNode<T> left;
		TreapNode<T> right;

		TreapNode(T key, long priority) {
			this.key = key;
			this.priority = priority;
		}
	}

	private TreapNode<T> root;

	/**
	 * Inserts {@code key} with a random priority, restoring the heap order via rotations.
	 *
	 * @param key the key to insert
	 */
	public void insert(T key) {
		// TODO: BST-insert then rotate up while the child's priority beats its parent.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Removes {@code key} if present by rotating it down to a leaf.
	 *
	 * @param key the key to remove
	 * @return {@code true} if a key was removed
	 */
	public boolean delete(T key) {
		// TODO: rotate the target toward the leaf following priorities, then unlink it.
		throw new UnsupportedOperationException("TODO: implement delete");
	}

	/**
	 * Returns whether {@code key} is stored.
	 *
	 * @param key the key to find
	 * @return {@code true} if present
	 */
	public boolean contains(T key) {
		// TODO: standard BST search on keys.
		throw new UnsupportedOperationException("TODO: implement contains");
	}

	/**
	 * Returns the height of the treap (an empty treap has height 0).
	 *
	 * @return the number of nodes on the longest root-to-leaf path
	 */
	public int height() {
		// TODO: compute the longest root-to-leaf path length.
		throw new UnsupportedOperationException("TODO: implement height");
	}
}
