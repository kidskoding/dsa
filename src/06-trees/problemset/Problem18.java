/**
 * Problem 18 — Lowest common ancestor of a BST.
 *
 * <p>Given the root of a binary search tree and two values {@code p} and {@code q} both present,
 * return the value of their lowest common ancestor, found in {@code O(h)} time using the ordering
 * property.
 */
class Problem18 {

	/**
	 * Returns the value of the lowest common ancestor of {@code p} and {@code q} in the BST.
	 *
	 * @param root the root of the BST (non-null)
	 * @param p a value present in the BST
	 * @param q a value present in the BST
	 * @return the LCA value
	 */
	int lowestCommonAncestor(TreeNode<Integer> root, int p, int q) {
		// TODO: descend left while both < node, right while both > node; the first split is the LCA.
		throw new UnsupportedOperationException("TODO: implement lowestCommonAncestor");
	}
}
