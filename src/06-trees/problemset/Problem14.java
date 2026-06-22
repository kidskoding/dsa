/**
 * Problem 14 — Serialize and deserialize a binary tree.
 *
 * <p>Implement a round-trip encoding of an arbitrary binary tree to a string and back, such that
 * {@code deserialize(serialize(root))} reproduces the original structure and values.
 */
public class Problem14 {

	/**
	 * Encodes the binary tree rooted at {@code root} as a string.
	 *
	 * @param root the root node, or null for an empty tree
	 * @return a string encoding of the tree
	 */
	public String serialize(TreeNode<Integer> root) {
		// TODO: preorder with an explicit marker for null children so structure is recoverable.
		throw new UnsupportedOperationException("TODO: implement serialize");
	}

	/**
	 * Decodes a string produced by {@link #serialize(TreeNode)} back into a tree.
	 *
	 * @param data the encoded string
	 * @return the reconstructed tree's root, or null for an empty tree
	 */
	public TreeNode<Integer> deserialize(String data) {
		// TODO: consume tokens in the same order serialize emitted them, rebuilding recursively.
		throw new UnsupportedOperationException("TODO: implement deserialize");
	}
}
