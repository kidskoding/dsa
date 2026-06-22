/**
 * An order-statistics tree: a balanced BST augmented with subtree sizes so that {@code select} (the
 * i-th smallest key) and {@code rank} (how many keys are smaller) run in {@code O(log n)}. See the
 * workbook page {@code order-statistics-trees.md}.
 *
 * @param <T> the element type, which must be {@link Comparable}
 */
class OrderStatisticsTree<T extends Comparable<T>> {

	/** A node augmented with the size of the subtree rooted at it. */
	static final class OrderStatisticsNode<T> {
		T key;
		int size;
		OrderStatisticsNode<T> left;
		OrderStatisticsNode<T> right;

		OrderStatisticsNode(T key) {
			this.key = key;
			this.size = 1;
		}
	}

	private OrderStatisticsNode<T> root;

	/**
	 * Inserts {@code key}, maintaining order and subtree sizes. Duplicates are permitted and counted.
	 *
	 * @param key the key to insert
	 */
	public void insert(T key) {
		// TODO: insert into the BST and update augmented subtree sizes on the path.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Removes one occurrence of {@code key} if present.
	 *
	 * @param key the key to remove
	 * @return {@code true} if a key was removed
	 */
	public boolean delete(T key) {
		// TODO: delete the key and repair subtree sizes (and balance) on the way up.
		throw new UnsupportedOperationException("TODO: implement delete");
	}

	/**
	 * Returns the {@code i}-th smallest key (1-indexed).
	 *
	 * @param i the 1-based order statistic, {@code 1 <= i <= size()}
	 * @return the i-th smallest key
	 */
	public T select(int i) {
		// TODO: descend using left-subtree sizes to find the i-th smallest.
		throw new UnsupportedOperationException("TODO: implement select");
	}

	/**
	 * Returns the number of stored keys strictly less than {@code key}.
	 *
	 * @param key the query key
	 * @return the rank of {@code key}
	 */
	public int rank(T key) {
		// TODO: accumulate left-subtree sizes while searching for the key.
		throw new UnsupportedOperationException("TODO: implement rank");
	}

	/**
	 * Returns the number of stored keys.
	 *
	 * @return the total element count
	 */
	public int size() {
		// TODO: return the size of the root subtree (0 when empty).
		throw new UnsupportedOperationException("TODO: implement size");
	}
}
