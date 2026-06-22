import java.util.List;

/** Tier 3 — Problem 13: Closest pair via spatial subdivision. */
public class Problem13 {

	/**
	 * Returns the pair of distinct points from {@code points} with the smallest Euclidean distance
	 * between them, faster than the \( O(n^2) \) brute force.
	 *
	 * @param points the input points; must contain at least two
	 * @return a two-element array holding the closest pair
	 * @throws IllegalArgumentException if fewer than two points are given
	 */
	public Point2D[] closestPair(List<Point2D> points) {
		// TODO: divide-and-conquer (or k-d tree) closest pair, with the strip-merge step.
		throw new UnsupportedOperationException("TODO: implement closestPair");
	}
}
