/**
 * An immutable point in the plane, shared by every spatial structure in this module. Defined once
 * here and reused by {@link KdTree}, {@link QuadTree}, and the problem set.
 *
 * @param x the x-coordinate
 * @param y the y-coordinate
 */
public record Point2D(double x, double y) {

	/**
	 * Returns the squared Euclidean distance to {@code other}. The square root is intentionally
	 * omitted so comparisons stay exact for nearest-neighbor pruning.
	 *
	 * @param other the point to measure to
	 * @return the squared distance between this point and {@code other}
	 */
	public double squaredDistanceTo(Point2D other) {
		// TODO: return (dx*dx + dy*dy) without taking a square root.
		throw new UnsupportedOperationException("TODO: implement squaredDistanceTo");
	}
}
