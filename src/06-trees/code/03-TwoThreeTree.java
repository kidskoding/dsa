import java.util.List;

/**
 * A 2-3 tree: a perfectly height-balanced search tree in which every internal node holds one or two
 * keys and has two or three children, and all leaves sit at the same depth. Balance is maintained
 * by splitting overfull nodes upward on insertion. See {@code 2-3-trees.md}.
 *
 * @param <T> the comparable key type
 */
class TwoThreeTree<T extends Comparable<T>> {

	/**
	 * A node in a {@link TwoThreeTree}. A 2-node holds one key and two children; a 3-node holds two
	 * keys and three children. {@code right} is unused in a 2-node.
	 */
	static final class TwoThreeNode<T> {
		T left;
		T right;
		boolean isThreeNode;
		TwoThreeNode<T> first;
		TwoThreeNode<T> middle;
		TwoThreeNode<T> last;

		TwoThreeNode(T key) {
			this.left = key;
		}
	}

	private TwoThreeNode<T> root;

	/**
	 * Inserts {@code key}, splitting and propagating overfull nodes so that all leaves remain at the
	 * same depth.
	 *
	 * @param key the key to insert
	 */
	public void insert(T key) {
		// TODO: descend to a leaf, add the key, and split upward on overflow.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Returns whether {@code key} is stored in the tree.
	 *
	 * @param key the key to look for
	 * @return true if found
	 */
	public boolean search(T key) {
		// TODO: at each node compare against its 1 or 2 keys and pick the child.
		throw new UnsupportedOperationException("TODO: implement search");
	}

	/**
	 * Removes {@code key} if present, merging or borrowing to keep every leaf at the same depth.
	 *
	 * @param key the key to remove
	 */
	public void delete(T key) {
		// TODO: delete from a leaf, fixing underflow via borrow/merge upward.
		throw new UnsupportedOperationException("TODO: implement delete");
	}

	/**
	 * Returns the height of the tree in edges; an empty tree has height {@code -1}. In a 2-3 tree all
	 * leaves share this depth.
	 *
	 * @return the height
	 */
	public int height() {
		// TODO: follow any path to a leaf counting edges.
		throw new UnsupportedOperationException("TODO: implement height");
	}

	/**
	 * Returns all keys in ascending order.
	 *
	 * @return the sorted keys
	 */
	public List<T> inorder() {
		// TODO: inorder over 2-/3-nodes: first, leftKey, middle, rightKey, last.
		throw new UnsupportedOperationException("TODO: implement inorder");
	}
}
