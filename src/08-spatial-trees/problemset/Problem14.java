import java.util.List;

/** Tier 3 — Problem 14: Count points in range. */
public class Problem14 {

	/**
	 * Preprocesses a static set of points so that {@link #countInRange(double, double, double,
	 * double)} can report how many lie inside an axis-aligned query rectangle.
	 *
	 * @param points the static point set to index
	 * @throws NullPointerException if {@code points} is {@code null}
	 */
	public Problem14(List<Point2D> points) {
		// TODO: build the supporting index (e.g. sorted arrays / k-d tree) for fast counting.
		throw new UnsupportedOperationException("TODO: implement Problem14(List)");
	}

	/**
	 * Returns how many indexed points fall inside the inclusive axis-aligned rectangle {@code [xMin,
	 * xMax] x [yMin, yMax]}.
	 *
	 * @param xMin the inclusive lower x bound
	 * @param yMin the inclusive lower y bound
	 * @param xMax the inclusive upper x bound
	 * @param yMax the inclusive upper y bound
	 * @return the number of indexed points inside the rectangle
	 * @throws IllegalArgumentException if {@code xMin > xMax} or {@code yMin > yMax}
	 */
	public int countInRange(double xMin, double yMin, double xMax, double yMax) {
		// TODO: query the preprocessed index to count points in the rectangle.
		throw new UnsupportedOperationException("TODO: implement countInRange");
	}
}
