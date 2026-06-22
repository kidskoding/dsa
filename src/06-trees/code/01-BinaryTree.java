import java.util.List;

/**
 * A plain binary tree: each node has up to two children, with no ordering invariant. Use this as a
 * scaffold for structural algorithms (height, traversals, node counts) before layering on a search
 * invariant. See the workbook page {@code binary-trees.md}.
 *
 * @param <T> the element type stored in the tree
 */
class BinaryTree<T> {

	/** A node in a {@link BinaryTree}, holding a value and left/right child links. */
	static final class BinaryTreeNode<T> {
		T value;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		BinaryTreeNode(T value) {
			this.value = value;
		}
	}

	private BinaryTreeNode<T> root;

	/** Returns the root node, or {@code null} when the tree is empty. */
	BinaryTreeNode<T> root() {
		return root;
	}

	/**
	 * Sets the root node directly. Provided so that tests and exercises can assemble a known shape.
	 *
	 * @param value the value to place at the root
	 */
	public void setRoot(T value) {
		// TODO: create a new node holding value and make it the root.
		throw new UnsupportedOperationException("TODO: implement setRoot");
	}

	/**
	 * Returns the height of the tree: the number of edges on the longest root-to-leaf path. An empty
	 * tree has height {@code -1} and a single node has height {@code 0}.
	 *
	 * @return the height in edges
	 */
	public int height() {
		// TODO: recurse over children, taking 1 + max(leftHeight, rightHeight).
		throw new UnsupportedOperationException("TODO: implement height");
	}

	/**
	 * Returns the total number of nodes in the tree.
	 *
	 * @return the node count
	 */
	public int size() {
		// TODO: count this node plus the sizes of both subtrees.
		throw new UnsupportedOperationException("TODO: implement size");
	}

	/**
	 * Returns the values in inorder (left, node, right) order.
	 *
	 * @return an inorder list of values
	 */
	public List<T> inorder() {
		// TODO: traverse left subtree, visit node, traverse right subtree.
		throw new UnsupportedOperationException("TODO: implement inorder");
	}

	/**
	 * Returns the values in preorder (node, left, right) order.
	 *
	 * @return a preorder list of values
	 */
	public List<T> preorder() {
		// TODO: visit node, traverse left subtree, traverse right subtree.
		throw new UnsupportedOperationException("TODO: implement preorder");
	}

	/**
	 * Returns the values in postorder (left, right, node) order.
	 *
	 * @return a postorder list of values
	 */
	public List<T> postorder() {
		// TODO: traverse left subtree, traverse right subtree, visit node.
		throw new UnsupportedOperationException("TODO: implement postorder");
	}

	/**
	 * Returns the values grouped level by level from the root downward (breadth-first).
	 *
	 * @return a list of levels, each a list of values
	 */
	public List<List<T>> levelOrder() {
		// TODO: BFS with a queue, collecting one list per level.
		throw new UnsupportedOperationException("TODO: implement levelOrder");
	}
}
