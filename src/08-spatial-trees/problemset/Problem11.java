import java.util.List;

/** Tier 3 — Problem 11: Balanced k-d tree from a point set. */
public class Problem11 {

	/** A node of the balanced k-d tree built by {@link #build(List)}. */
	public static final class BalancedKdNode {
		public final Point2D point;
		public BalancedKdNode left;
		public BalancedKdNode right;

		public BalancedKdNode(Point2D point) {
			this.point = point;
		}
	}

	/**
	 * Builds a balanced 2-D k-d tree by recursively selecting the median along the alternating split
	 * axis (x at even depth, y at odd depth) and returns its root.
	 *
	 * @param points the points to index; not modified by the caller's contract
	 * @return the root of the balanced tree, or {@code null} if {@code points} is empty
	 */
	public BalancedKdNode build(List<Point2D> points) {
		// TODO: at each depth sort/select by the current axis median, recurse on the halves.
		throw new UnsupportedOperationException("TODO: implement build");
	}

	/**
	 * Returns the height of the tree rooted at {@code node} (an empty tree has height -1, a single
	 * node has height 0).
	 *
	 * @param node the subtree root
	 * @return the height of the subtree
	 */
	public int height(BalancedKdNode node) {
		// TODO: return -1 for null, else 1 + max(height(left), height(right)).
		throw new UnsupportedOperationException("TODO: implement height");
	}
}
