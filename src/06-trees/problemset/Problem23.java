/**
 * Problem 23 — Construct tree from preorder and inorder.
 *
 * <p>Given the preorder and inorder traversals of a binary tree with distinct values, reconstruct
 * and return the tree. The first preorder element is the root; its index in inorder splits the left
 * and right subtrees.
 */
class Problem23 {

	/**
	 * Reconstructs the binary tree from its {@code preorder} and {@code inorder} traversals.
	 *
	 * @param preorder the preorder traversal
	 * @param inorder the inorder traversal of the same tree
	 * @return the root of the reconstructed tree
	 */
	TreeNode<Integer> buildTree(int[] preorder, int[] inorder) {
		// TODO: take preorder[0] as the root, locate it in inorder, recurse on the two halves.
		throw new UnsupportedOperationException("TODO: implement buildTree");
	}
}
