/**
 * Problem 12 — Largest rectangle in histogram.
 *
 * <p>Given bar heights, return the area of the largest axis-aligned rectangle that fits under the
 * histogram. Use a monotonic stack in {@code O(n)} time.
 */
public final class Problem12 {

	private Problem12() {}

	/**
	 * Returns the area of the largest rectangle that fits under the histogram.
	 *
	 * @param heights the bar heights (non-negative)
	 * @return the maximal rectangle area
	 */
	public static int largestRectangleArea(int[] heights) {
		// TODO: keep a stack of increasing-height bar indices; when a shorter bar arrives,
		//			 pop and compute areas using the popped bar as the limiting height.
		throw new UnsupportedOperationException("TODO: implement largestRectangleArea");
	}
}
