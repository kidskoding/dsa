/**
 * Problem 15 — Range count in a BST.
 *
 * <p>Given the root of a BST and an inclusive range {@code [lo, hi]}, count the number of stored
 * keys that fall within the range, pruning subtrees that cannot contribute.
 */
public class Problem15 {

	/**
	 * Counts the keys in the BST rooted at {@code root} that lie in {@code [lo, hi]} inclusive.
	 *
	 * @param root the root of the BST
	 * @param lo the inclusive lower bound
	 * @param hi the inclusive upper bound
	 * @return the number of stored keys within the range
	 */
	public int rangeCount(TreeNode<Integer> root, int lo, int hi) {
		// TODO: recurse, skipping the left subtree when value < lo and the right when value > hi.
		throw new UnsupportedOperationException("TODO: implement rangeCount");
	}
}
