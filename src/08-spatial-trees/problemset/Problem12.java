import java.util.List;

/** Tier 3 — Problem 12: k nearest neighbors. */
public class Problem12 {

	/**
	 * Returns the {@code k} points from {@code points} closest to {@code query}, ordered from nearest
	 * to farthest. Conceptually this drives a bounded max-heap during a branch-and-bound k-d tree
	 * descent, but any correct method that returns the same set/order is acceptable.
	 *
	 * @param points the stored points
	 * @param query the query point
	 * @param k the number of neighbors to return; must be non-negative
	 * @return up to {@code k} nearest points, nearest first
	 * @throws IllegalArgumentException if {@code k} is negative
	 */
	public List<Point2D> kNearest(List<Point2D> points, Point2D query, int k) {
		// TODO: maintain a size-k max-heap keyed by squared distance, then drain it in sorted order.
		throw new UnsupportedOperationException("TODO: implement kNearest");
	}
}
