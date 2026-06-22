/**
 * Problem 27 — Maximum path sum.
 *
 * <p>Given the root of a binary tree whose nodes carry values (possibly negative), return the
 * maximum sum over all paths. A path is any sequence of nodes connected by parent-child edges, need
 * not pass through the root, and must contain at least one node. The answer is accumulated as a
 * {@code long}.
 */
class Problem27 {

	/**
	 * Returns the maximum path sum in the tree rooted at {@code root}.
	 *
	 * @param root the root node (non-null)
	 * @return the maximum path sum
	 */
	long maxPathSum(TreeNode<Integer> root) {
		// TODO: at each node the best path is value + max(0, leftGain) + max(0, rightGain); track the
		//       global max while returning value + max(0, max(leftGain, rightGain)) upward.
		throw new UnsupportedOperationException("TODO: implement maxPathSum");
	}
}
