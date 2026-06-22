import java.util.List;

/**
 * A B-tree of minimum degree {@code t}: a balanced multiway search tree in which every node (except
 * the root) holds between {@code t - 1} and {@code 2t - 1} keys, and all leaves sit at the same
 * depth. It is the disk-friendly generalization of a 2-3 tree (which is the case {@code t = 2}).
 * See {@code b-trees.md}.
 *
 * @param <T> the comparable key type
 */
class BTree<T extends Comparable<T>> {

	/** A node in a {@link BTree}, storing sorted keys and (for internal nodes) child links. */
	static final class BTreeNode<T> {
		final java.util.List<T> keys = new java.util.ArrayList<>();
		final java.util.List<BTreeNode<T>> children = new java.util.ArrayList<>();
		boolean leaf = true;
	}

	private final int minDegree;
	private BTreeNode<T> root;

	/**
	 * Creates an empty B-tree with the given minimum degree.
	 *
	 * @param minDegree the minimum degree {@code t}; must be at least 2
	 */
	public BTree(int minDegree) {
		if (minDegree < 2) {
			throw new IllegalArgumentException("minDegree must be >= 2");
		}
		this.minDegree = minDegree;
	}

	/**
	 * Inserts {@code key}, splitting full nodes ({@code 2t - 1} keys) on the way down so the root
	 * never overflows.
	 *
	 * @param key the key to insert
	 */
	public void insert(T key) {
		// TODO: split a full root if needed, then insert into the non-full subtree.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Returns whether {@code key} is present.
	 *
	 * @param key the key to look for
	 * @return true if found
	 */
	public boolean search(T key) {
		// TODO: binary/linear search within a node, then descend the right child.
		throw new UnsupportedOperationException("TODO: implement search");
	}

	/**
	 * Removes {@code key} if present, ensuring each visited node keeps at least {@code t} keys via
	 * borrow/merge before descending.
	 *
	 * @param key the key to remove
	 */
	public void delete(T key) {
		// TODO: handle the leaf/internal cases, refilling underfull children.
		throw new UnsupportedOperationException("TODO: implement delete");
	}

	/**
	 * Returns the height of the tree in edges; an empty tree has height {@code -1}. In a B-tree all
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
		// TODO: interleave child traversals with keys, left to right.
		throw new UnsupportedOperationException("TODO: implement inorder");
	}
}
