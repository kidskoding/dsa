/**
 * Problem 28 — Goblin treasure subtree sums.
 *
 * <p>Each chamber is a node of a binary tree holding gold (possibly negative). For every chamber the
 * subtree total is the sum of gold over its subtree. Return the maximum subtree total over all
 * chambers. An empty tree gives {@code 0}. The answer is accumulated as a {@code long}.
 */
class Problem28 {

	/**
	 * Returns the maximum subtree sum over all nodes of the tree rooted at {@code root}.
	 *
	 * @param root the root node, or null for an empty tree
	 * @return the maximum subtree sum ({@code 0} for an empty tree)
	 */
	long maxSubtreeSum(TreeNode<Integer> root) {
		// TODO: post-order returning each subtree's sum; track the maximum seen (start it at 0 for the
		//       empty-tree case).
		throw new UnsupportedOperationException("TODO: implement maxSubtreeSum");
	}
}
