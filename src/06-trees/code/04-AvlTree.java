import java.util.List;

/**
 * An AVL tree: a self-balancing BST that keeps the balance factor (height of left subtree minus
 * height of right subtree) of every node in {@code {-1, 0, 1}} via rotations after each update.
 * This guarantees {@code O(log n)} search, insert, and delete. See {@code avl-trees.md}.
 *
 * @param <T> the comparable key type
 */
class AvlTree<T extends Comparable<T>> {

	/** A node in an {@link AvlTree}, caching its subtree height for balance-factor checks. */
	static final class AvlNode<T> {
		T key;
		int height;
		AvlNode<T> left;
		AvlNode<T> right;

		AvlNode(T key) {
			this.key = key;
		}
	}

	private AvlNode<T> root;

	/**
	 * Inserts {@code key}, then rebalances on the way back up using single or double rotations.
	 * Duplicate keys are ignored.
	 *
	 * @param key the key to insert
	 */
	public void insert(T key) {
		// TODO: BST insert, update heights, rebalance when |balanceFactor| > 1.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Removes {@code key} if present, then rebalances along the search path.
	 *
	 * @param key the key to remove
	 */
	public void delete(T key) {
		// TODO: BST delete, then rebalance each ancestor as needed.
		throw new UnsupportedOperationException("TODO: implement delete");
	}

	/**
	 * Returns whether {@code key} is present.
	 *
	 * @param key the key to look for
	 * @return true if found
	 */
	public boolean search(T key) {
		// TODO: ordinary BST search.
		throw new UnsupportedOperationException("TODO: implement search");
	}

	/**
	 * Returns the height of the tree in edges; an empty tree has height {@code -1}.
	 *
	 * @return the height
	 */
	public int height() {
		// TODO: derive from the cached root height (root null => -1).
		throw new UnsupportedOperationException("TODO: implement height");
	}

	/**
	 * Returns the balance factor at the root (left height minus right height), or {@code 0} for an
	 * empty tree. Useful for asserting the AVL invariant in tests.
	 *
	 * @return the root balance factor
	 */
	public int balanceFactor() {
		// TODO: compute leftHeight - rightHeight of the root.
		throw new UnsupportedOperationException("TODO: implement balanceFactor");
	}

	/**
	 * Returns all keys in ascending order.
	 *
	 * @return the sorted keys
	 */
	public List<T> inorder() {
		// TODO: inorder traversal.
		throw new UnsupportedOperationException("TODO: implement inorder");
	}
}
