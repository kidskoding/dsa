/** Tier 1 — Problem 03: Rectangles intersect. */
public class Problem03 {

	/**
	 * Returns whether two inclusive axis-aligned rectangles overlap, sharing any area or boundary
	 * point. The first rectangle is {@code [ax1, ax2] x [ay1, ay2]} and the second is {@code [bx1,
	 * bx2] x [by1, by2]}.
	 *
	 * @param ax1 the first rectangle's lower x bound
	 * @param ay1 the first rectangle's lower y bound
	 * @param ax2 the first rectangle's upper x bound
	 * @param ay2 the first rectangle's upper y bound
	 * @param bx1 the second rectangle's lower x bound
	 * @param by1 the second rectangle's lower y bound
	 * @param bx2 the second rectangle's upper x bound
	 * @param by2 the second rectangle's upper y bound
	 * @return {@code true} if the rectangles overlap
	 */
	public boolean intersects(
			double ax1,
			double ay1,
			double ax2,
			double ay2,
			double bx1,
			double by1,
			double bx2,
			double by2) {
		// TODO: rectangles overlap iff they overlap on both the x and y projections.
		throw new UnsupportedOperationException("TODO: implement intersects");
	}
}
