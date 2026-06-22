/**
 * Problem 21 — Relay Station Spacing. Given the planar coordinates of relay stations, return the
 * smallest Euclidean distance between any two distinct stations, computed in {@code O(n log n)} with
 * the closest-pair divide-and-conquer algorithm. Reuses the module's {@link Point} record.
 */
class Problem21 {

	/**
	 * Returns the minimum Euclidean distance between any two distinct stations in {@code stations}.
	 * The input contains at least two points.
	 *
	 * @param stations the relay station coordinates
	 * @return the closest-pair distance
	 */
	double closestSpacing(Point[] stations) {
		// TODO: sort by x, split, recurse, then check the strip near the dividing line.
		throw new UnsupportedOperationException("TODO: implement closestSpacing");
	}
}
