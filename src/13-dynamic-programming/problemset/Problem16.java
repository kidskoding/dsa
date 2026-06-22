
/**
 * Problem 16 — Maximum Weight Independent Set on a Tree.
 *
 * <p>Given a rooted tree with node weights, compute the maximum-weight set of nodes such that no
 * two chosen nodes are adjacent (parent/child). Reuses {@link TreeNode} from the {@code
 * dp-on-trees} topic.
 */
public class Problem16 {

	/**
	 * Returns the maximum-weight independent set in the tree rooted at {@code root}.
	 *
	 * @param root the root of the tree, or {@code null} for an empty tree
	 * @return the maximum independent-set weight (0 when {@code root} is {@code null})
	 */
	public int maxWeightIndependentSet(TreeNode root) {
		// TODO: post-order; combine each node's include/exclude optima from its children.
		throw new UnsupportedOperationException("TODO: implement maxWeightIndependentSet");
	}
}
