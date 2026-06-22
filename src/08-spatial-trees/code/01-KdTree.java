import java.util.List;

/**
 * A 2-dimensional k-d tree over {@link Point2D} values. Levels alternate their splitting axis (x at
 * even depth, y at odd depth), giving expected logarithmic search on balanced data. Implement each
 * method from first principles — see the workbook page {@code kd-trees.md} for the invariants, the
 * range-query bound \( O(\sqrt n + k) \), and the branch-and-bound nearest-neighbor argument.
 */
class KdTree {

	/** A node of the k-d tree; uniquely named to avoid clashing with other structures. */
	private static final class KdNode {
		final Point2D point;
		KdNode left;
		KdNode right;

		KdNode(Point2D point) {
			this.point = point;
		}
	}

	private KdNode root;
	private int size;

	/** Constructs an empty k-d tree. */
	public KdTree() {
		// TODO: start with a null root and size 0.
		throw new UnsupportedOperationException("TODO: implement KdTree()");
	}

	/**
	 * Returns the number of points stored.
	 *
	 * @return the point count
	 */
	public int size() {
		// TODO: return the stored size.
		throw new UnsupportedOperationException("TODO: implement size");
	}

	/**
	 * Returns whether the tree holds no points.
	 *
	 * @return {@code true} if empty
	 */
	public boolean isEmpty() {
		// TODO: return whether size is zero.
		throw new UnsupportedOperationException("TODO: implement isEmpty");
	}

	/**
	 * Inserts {@code point}, alternating the comparison axis with depth. Duplicates of an existing
	 * point are ignored.
	 *
	 * @param point the point to insert; must not be {@code null}
	 * @throws NullPointerException if {@code point} is {@code null}
	 */
	public void insert(Point2D point) {
		// TODO: descend comparing x at even depth and y at odd depth, then attach a new leaf.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Returns whether {@code point} is present in the tree.
	 *
	 * @param point the point to look for
	 * @return {@code true} if an equal point is stored
	 */
	public boolean contains(Point2D point) {
		// TODO: descend by alternating axis until the point is found or a null child is reached.
		throw new UnsupportedOperationException("TODO: implement contains");
	}

	/**
	 * Returns every stored point inside the inclusive axis-aligned rectangle {@code [xMin, xMax] x
	 * [yMin, yMax]}, pruning subtrees that cannot intersect it.
	 *
	 * @param xMin the inclusive lower x bound
	 * @param yMin the inclusive lower y bound
	 * @param xMax the inclusive upper x bound
	 * @param yMax the inclusive upper y bound
	 * @return the points within the query rectangle, in any order
	 * @throws IllegalArgumentException if {@code xMin > xMax} or {@code yMin > yMax}
	 */
	public List<Point2D> rangeQuery(double xMin, double yMin, double xMax, double yMax) {
		// TODO: recurse, skipping a child whose halfspace lies entirely outside the rectangle.
		throw new UnsupportedOperationException("TODO: implement rangeQuery");
	}

	/**
	 * Returns the stored point closest (by Euclidean distance) to {@code query}, using branch-and-
	 * bound pruning on the splitting plane.
	 *
	 * @param query the query point; must not be {@code null}
	 * @return the nearest stored point, or {@code null} if the tree is empty
	 * @throws NullPointerException if {@code query} is {@code null}
	 */
	public Point2D nearestNeighbor(Point2D query) {
		// TODO: descend to the likely leaf, then unwind, only crossing the plane when it could hold a
		// closer point than the current best radius.
		throw new UnsupportedOperationException("TODO: implement nearestNeighbor");
	}
}
