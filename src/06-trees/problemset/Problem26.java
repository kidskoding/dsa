/**
 * Problem 26 — Lowest common ancestor of a binary tree.
 *
 * <p>Given the root of a binary tree (not a BST) and two values {@code p} and {@code q} both
 * present, return the value of their lowest common ancestor — the deepest node having both as
 * descendants (a node is a descendant of itself).
 */
class Problem26 {

	/**
	 * Returns the value of the lowest common ancestor of {@code p} and {@code q}.
	 *
	 * @param root the root of the tree (non-null)
	 * @param p a value present in the tree
	 * @param q a value present in the tree
	 * @return the LCA value
	 */
	int lowestCommonAncestor(TreeNode<Integer> root, int p, int q) {
		// TODO: recurse; a node whose two subtrees each surface one target (or which is a target with
		//       the other below) is the LCA.
		throw new UnsupportedOperationException("TODO: implement lowestCommonAncestor");
	}
}
