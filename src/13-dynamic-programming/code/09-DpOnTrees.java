/**
 * Dynamic programming on rooted trees: each node's optimum is combined from its children's optima
 * in a single post-order pass, running in {@code O(n)}. The flagship example here is the
 * maximum-weight independent set on a tree (no two chosen nodes may be parent and child). See
 * {@code dp-on-trees.md}. Nodes are represented by the top-level {@link TreeNode} type.
 */
class DpOnTrees {

	/**
	 * Returns the maximum total weight of an independent set in the tree rooted at {@code root}: a
	 * set of nodes no two of which are adjacent (parent/child).
	 *
	 * @param root the root of the tree, or {@code null} for an empty tree
	 * @return the maximum independent-set weight (0 when {@code root} is {@code null})
	 */
	public int maxWeightIndependentSet(TreeNode root) {
		// TODO: post-order; for each node track include/exclude optima and combine children.
		throw new UnsupportedOperationException("TODO: implement maxWeightIndependentSet");
	}
}
