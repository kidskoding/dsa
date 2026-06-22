/**
 * Problem 29 — Archivist's BST range tally.
 *
 * <p>Scroll IDs are stored in a binary search tree. Given the root and an inclusive window
 * {@code [lo, hi]}, return the sum of all stored IDs inside the window, pruning subtrees that cannot
 * contribute. An empty tree or empty window gives {@code 0}. The sum is accumulated as a
 * {@code long}.
 */
class Problem29 {

	/**
	 * Returns the sum of all IDs in {@code [lo, hi]} within the BST rooted at {@code root}.
	 *
	 * @param root the root of the BST, or null for an empty tree
	 * @param lo the inclusive lower bound
	 * @param hi the inclusive upper bound
	 * @return the sum of in-window IDs
	 */
	long rangeTally(TreeNode<Integer> root, int lo, int hi) {
		// TODO: skip the left subtree when value < lo, the right when value > hi; sum into a long.
		throw new UnsupportedOperationException("TODO: implement rangeTally");
	}
}
