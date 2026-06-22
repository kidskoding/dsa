import java.util.List;

/**
 * An unbalanced binary search tree: for every node, all keys in the left subtree are smaller and
 * all keys in the right subtree are larger. Operations run in {@code O(h)} time where {@code h} is
 * the height, which degrades to {@code O(n)} on adversarial (sorted) input. See {@code
 * binary-search-trees.md}.
 *
 * @param <T> the comparable key type
 */
class BinarySearchTree<T extends Comparable<T>> {

	/** A node in a {@link BinarySearchTree}. */
	static final class BstNode<T> {
		T key;
		BstNode<T> left;
		BstNode<T> right;

		BstNode(T key) {
			this.key = key;
		}
	}

	private BstNode<T> root;

	/**
	 * Inserts {@code key} into the tree, preserving the search invariant. Duplicate keys are ignored.
	 *
	 * @param key the key to insert
	 */
	public void insert(T key) {
		// TODO: walk down comparing keys; attach a new leaf at the empty slot.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Returns whether {@code key} is present in the tree.
	 *
	 * @param key the key to look for
	 * @return true if found
	 */
	public boolean search(T key) {
		// TODO: descend left or right by comparison until found or null.
		throw new UnsupportedOperationException("TODO: implement search");
	}

	/**
	 * Removes {@code key} if present, restoring the invariant (handle the zero-, one-, and two-child
	 * cases; replace a two-child node with its inorder successor).
	 *
	 * @param key the key to remove
	 */
	public void delete(T key) {
		// TODO: locate the node, then splice it out per the child-count case.
		throw new UnsupportedOperationException("TODO: implement delete");
	}

	/**
	 * Returns the minimum key, or {@code null} when the tree is empty.
	 *
	 * @return the smallest key
	 */
	public T min() {
		// TODO: follow left children to the bottom.
		throw new UnsupportedOperationException("TODO: implement min");
	}

	/**
	 * Returns the maximum key, or {@code null} when the tree is empty.
	 *
	 * @return the largest key
	 */
	public T max() {
		// TODO: follow right children to the bottom.
		throw new UnsupportedOperationException("TODO: implement max");
	}

	/**
	 * Returns the height of the tree in edges; an empty tree has height {@code -1}.
	 *
	 * @return the height
	 */
	public int height() {
		// TODO: 1 + max of subtree heights, base case -1 for null.
		throw new UnsupportedOperationException("TODO: implement height");
	}

	/**
	 * Returns all keys in ascending (inorder) order.
	 *
	 * @return the sorted keys
	 */
	public List<T> inorder() {
		// TODO: inorder traversal yields keys in sorted order.
		throw new UnsupportedOperationException("TODO: implement inorder");
	}
}
