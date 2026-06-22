/**
 * Problem 17 — Range sum of a BST.
 *
 * <p>Given the root of a binary search tree and an inclusive range {@code [lo, hi]}, return the sum
 * of values of all nodes whose value lies within the range. Prune subtrees that cannot contribute.
 */
class Problem17 {

	/**
	 * Returns the sum of all values in {@code [lo, hi]} within the BST rooted at {@code root}.
	 *
	 * @param root the root of the BST, or null for an empty tree
	 * @param lo the inclusive lower bound
	 * @param hi the inclusive upper bound
	 * @return the sum of in-range values
	 */
	int rangeSum(TreeNode<Integer> root, int lo, int hi) {
		// TODO: skip the left subtree when value < lo, the right when value > hi.
		throw new UnsupportedOperationException("TODO: implement rangeSum");
	}
}
