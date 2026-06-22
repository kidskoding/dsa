import java.util.List;

/**
 * A splay tree: a self-adjusting BST that moves each accessed node to the root via splay rotations
 * (zig, zig-zig, zig-zag). It carries no balance metadata yet achieves {@code O(log n)} amortized
 * cost and excellent locality for skewed access patterns. See {@code splay-trees.md}.
 *
 * @param <T> the comparable key type
 */
class SplayTree<T extends Comparable<T>> {

	/** A node in a {@link SplayTree}. */
	static final class SplayNode<T> {
		T key;
		SplayNode<T> left;
		SplayNode<T> right;

		SplayNode(T key) {
			this.key = key;
		}
	}

	private SplayNode<T> root;

	/**
	 * Inserts {@code key} and splays it (or the last node on the search path) to the root. Duplicate
	 * keys are ignored.
	 *
	 * @param key the key to insert
	 */
	public void insert(T key) {
		// TODO: BST insert, then splay the new node to the root.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Returns whether {@code key} is present, splaying the last accessed node to the root as a side
	 * effect.
	 *
	 * @param key the key to look for
	 * @return true if found
	 */
	public boolean search(T key) {
		// TODO: descend by comparison, then splay the accessed node up.
		throw new UnsupportedOperationException("TODO: implement search");
	}

	/**
	 * Removes {@code key} if present by splaying it to the root and joining its two subtrees.
	 *
	 * @param key the key to remove
	 */
	public void delete(T key) {
		// TODO: splay key to root, then join left and right subtrees.
		throw new UnsupportedOperationException("TODO: implement delete");
	}

	/**
	 * Returns the key currently at the root, or {@code null} when the tree is empty. After any
	 * operation this reflects the most recently splayed key.
	 *
	 * @return the root key
	 */
	public T rootKey() {
		// TODO: return the root's key, or null.
		throw new UnsupportedOperationException("TODO: implement rootKey");
	}

	/**
	 * Returns the height of the tree in edges; an empty tree has height {@code -1}.
	 *
	 * @return the height
	 */
	public int height() {
		// TODO: recursive max-depth over children.
		throw new UnsupportedOperationException("TODO: implement height");
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
