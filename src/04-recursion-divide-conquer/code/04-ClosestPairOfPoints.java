/**
 * Closest pair of points in the plane in {@code O(n log n)} using divide and conquer (split by x,
 * recurse, then check the strip around the dividing line). Implement from scratch — see the
 * workbook page {@code closest-pair-of-points.md}.
 */
class ClosestPairOfPoints {

	/**
	 * Returns the smallest Euclidean distance between any two distinct points in {@code points}.
	 *
	 * @param points an array of at least two points
	 * @return the minimum pairwise distance
	 * @throws IllegalArgumentException if fewer than two points are given
	 */
	public double closestDistance(Point[] points) {
		// TODO: sort by x, recurse on the halves, then scan the strip around the split line.
		throw new UnsupportedOperationException("TODO: implement closestDistance");
	}

	/**
	 * Returns the Euclidean distance between two points.
	 *
	 * @param a the first point
	 * @param b the second point
	 * @return the straight-line distance between {@code a} and {@code b}
	 */
	public double distance(Point a, Point b) {
		// TODO: hypot of the coordinate differences.
		throw new UnsupportedOperationException("TODO: implement distance");
	}
}
