/**
 * Problem 13 — Path sum.
 *
 * <p>Given the root of a binary tree and a target, return whether some root-to-leaf path's values
 * add up exactly to the target. A leaf is a node with no children. An empty tree has no such path.
 */
class Problem13 {

	/**
	 * Returns whether a root-to-leaf path in the tree rooted at {@code root} sums to {@code target}.
	 *
	 * @param root the root node, or null for an empty tree
	 * @param target the desired path sum
	 * @return true if such a root-to-leaf path exists
	 */
	boolean hasPathSum(TreeNode<Integer> root, int target) {
		// TODO: subtract the node value descending; at a leaf, succeed iff the remainder is zero.
		throw new UnsupportedOperationException("TODO: implement hasPathSum");
	}
}
