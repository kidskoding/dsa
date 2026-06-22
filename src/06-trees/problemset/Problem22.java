/**
 * Problem 22 — Count complete tree nodes.
 *
 * <p>Given the root of a complete binary tree, return the number of nodes. Every level except
 * possibly the last is full, and the last is filled left to right. An empty tree has {@code 0}
 * nodes.
 */
class Problem22 {

	/**
	 * Returns the number of nodes in the complete binary tree rooted at {@code root}.
	 *
	 * @param root the root node, or null for an empty tree
	 * @return the node count
	 */
	int countNodes(TreeNode<Integer> root) {
		// TODO: compare left-spine and right-spine heights; a perfect subtree of height h has 2^h - 1
		//       nodes, otherwise recurse into the children.
		throw new UnsupportedOperationException("TODO: implement countNodes");
	}
}
