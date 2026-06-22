import java.util.List;

/** Tier 1 — Problem 05: Brute-force range query. */
public class Problem05 {

	/**
	 * Returns every point in {@code points} that lies inside the inclusive axis-aligned rectangle
	 * {@code [xMin, xMax] x [yMin, yMax]}, found by scanning the list linearly.
	 *
	 * @param points the candidate points
	 * @param xMin the inclusive lower x bound
	 * @param yMin the inclusive lower y bound
	 * @param xMax the inclusive upper x bound
	 * @param yMax the inclusive upper y bound
	 * @return the points inside the rectangle, preserving input order
	 */
	public List<Point2D> pointsInRange(
			List<Point2D> points, double xMin, double yMin, double xMax, double yMax) {
		// TODO: scan every point and keep those inside the rectangle.
		throw new UnsupportedOperationException("TODO: implement pointsInRange");
	}
}
