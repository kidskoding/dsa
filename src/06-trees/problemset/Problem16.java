/**
 * Problem 16 — Search in a BST.
 *
 * <p>Given the root of a binary search tree and a target value, return the subtree rooted at the
 * node whose value equals the target, or {@code null} if it is absent. Exploit BST ordering for
 * {@code O(h)} search.
 */
class Problem16 {

	/**
	 * Returns the node whose value equals {@code target} in the BST rooted at {@code root}, or null.
	 *
	 * @param root the root of the BST, or null for an empty tree
	 * @param target the value to search for
	 * @return the matching subtree, or null if absent
	 */
	TreeNode<Integer> search(TreeNode<Integer> root, int target) {
		// TODO: go left when target is smaller, right when larger, stop on equality or null.
		throw new UnsupportedOperationException("TODO: implement search");
	}
}
