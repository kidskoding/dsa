import java.util.List;

/**
 * Problem 25 — Path sum II.
 *
 * <p>Given the root of a binary tree and a target, return all root-to-leaf paths whose values sum to
 * the target, each as the list of values from root to leaf.
 */
class Problem25 {

	/**
	 * Returns all root-to-leaf paths in the tree rooted at {@code root} that sum to {@code target}.
	 *
	 * @param root the root node, or null for an empty tree
	 * @param target the desired path sum
	 * @return the list of matching paths
	 */
	List<List<Integer>> pathSum(TreeNode<Integer> root, int target) {
		// TODO: backtracking; append on the way down, remove on the way back up, record at leaves.
		throw new UnsupportedOperationException("TODO: implement pathSum");
	}
}
