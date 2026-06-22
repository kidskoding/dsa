/**
 * Problem 12 — Reconstruct a tree from traversals.
 *
 * <p>Given the preorder and inorder traversals of a binary tree with distinct values, reconstruct
 * and return the tree.
 */
public class Problem12 {

	/**
	 * Rebuilds the binary tree whose preorder and inorder sequences are given, returning its root.
	 *
	 * @param preorder the preorder traversal (node, left, right)
	 * @param inorder the inorder traversal (left, node, right)
	 * @return the reconstructed tree's root, or null when the input is empty
	 */
	public TreeNode<Integer> buildTree(int[] preorder, int[] inorder) {
		// TODO: preorder[0] is the root; split inorder at it to size the subtrees, recurse.
		throw new UnsupportedOperationException("TODO: implement buildTree");
	}
}
