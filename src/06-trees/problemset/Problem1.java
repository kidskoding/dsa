/**
 * Problem 1 — Height of a binary tree.
 *
 * <p>Given the root of a binary tree, compute its height: the number of edges on the longest
 * root-to-leaf path. An empty tree (null root) has height {@code -1}; a single node has height
 * {@code 0}.
 */
class Problem1 {

	/**
	 * Returns the height of the tree rooted at {@code root}, measured in edges.
	 *
	 * @param root the root node, or null for an empty tree
	 * @return the height in edges ({@code -1} for an empty tree)
	 */
	int height(TreeNode<Integer> root) {
		// TODO: post-order recursion: empty => -1, else 1 + max(height(left), height(right)).
		throw new UnsupportedOperationException("TODO: implement height");
	}
}
