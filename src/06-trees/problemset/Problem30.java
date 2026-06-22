import java.util.List;

/**
 * Problem 30 — Wizard tower boundary patrol.
 *
 * <p>Walk the boundary of a binary tree counterclockwise, reporting each floor once: the root, then
 * the left boundary top-down (excluding leaves), then all leaves left to right, then the right
 * boundary bottom-up (excluding leaves). No node appears twice. An empty tree gives an empty list; a
 * single node gives just that node.
 */
class Problem30 {

	/**
	 * Returns the counterclockwise boundary traversal of the tree rooted at {@code root}.
	 *
	 * @param root the root node, or null for an empty tree
	 * @return the boundary values in counterclockwise order
	 */
	List<Integer> boundary(TreeNode<Integer> root) {
		// TODO: root, then left boundary (top-down, no leaves), then leaves (left to right), then right
		//       boundary (bottom-up, no leaves), avoiding duplicates.
		throw new UnsupportedOperationException("TODO: implement boundary");
	}
}
