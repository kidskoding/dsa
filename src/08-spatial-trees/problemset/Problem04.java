/** Tier 1 — Problem 04: Quadrant of a point. */
public class Problem04 {

	/** The four quadrants of a square region relative to its center. */
	public enum Quadrant {
		NW,
		NE,
		SW,
		SE
	}

	/**
	 * Returns which quadrant of the square centered at {@code (centerX, centerY)} contains {@code
	 * point}, which is known to lie inside the square. Points on a dividing line are resolved toward
	 * the north/east halves.
	 *
	 * @param centerX the x-coordinate of the square's center
	 * @param centerY the y-coordinate of the square's center
	 * @param point the point inside the square
	 * @return the quadrant containing {@code point}
	 */
	public Quadrant quadrantOf(double centerX, double centerY, Point2D point) {
		// TODO: compare the point's coordinates to the center to pick NW/NE/SW/SE.
		throw new UnsupportedOperationException("TODO: implement quadrantOf");
	}
}
