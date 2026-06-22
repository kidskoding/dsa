import java.util.List;

/**
 * A red-black tree: a BST that maintains balance through node coloring rather than explicit
 * heights. The invariants (root is black, red nodes have black children, every root-to-leaf path
 * has the same number of black nodes) bound the height at {@code 2 lg(n + 1)}, giving {@code O(log
 * n)} operations. See {@code red-black-trees.md}.
 *
 * @param <T> the comparable key type
 */
class RedBlackTree<T extends Comparable<T>> {

	/** Node color in a {@link RedBlackTree}. */
	enum Color {
		RED,
		BLACK
	}

	/** A node in a {@link RedBlackTree}. */
	static final class RbNode<T> {
		T key;
		Color color;
		RbNode<T> left;
		RbNode<T> right;
		RbNode<T> parent;

		RbNode(T key, Color color) {
			this.key = key;
			this.color = color;
		}
	}

	private RbNode<T> root;

	/**
	 * Inserts {@code key} as a red node, then restores the red-black invariants by recoloring and
	 * rotating up to the root. Duplicate keys are ignored.
	 *
	 * @param key the key to insert
	 */
	public void insert(T key) {
		// TODO: BST insert as RED, then run the insert-fixup recolor/rotate cases.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Removes {@code key} if present, then runs delete-fixup to repair any black-height violation.
	 *
	 * @param key the key to remove
	 */
	public void delete(T key) {
		// TODO: BST delete tracking the replaced color, then delete-fixup.
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
		// TODO: recursive max-depth over children.
		throw new UnsupportedOperationException("TODO: implement height");
	}

	/**
	 * Returns the black-height of the tree: the number of black nodes on any path from the root down
	 * to a (nil) leaf, not counting the root. Useful for asserting the invariant in tests.
	 *
	 * @return the black-height
	 */
	public int blackHeight() {
		// TODO: count black nodes along a root-to-nil path.
		throw new UnsupportedOperationException("TODO: implement blackHeight");
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
