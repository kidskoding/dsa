/**
 * Problem 16 — Trapping rain water.
 *
 * <p>Given an elevation map, compute how much water it can trap after raining. Solve it with a
 * monotonic stack in {@code O(n)} time and {@code O(n)} extra space.
 */
public final class Problem16 {

	private Problem16() {}

	/**
	 * Returns the total units of water trapped by the elevation map.
	 *
	 * @param height the elevation heights (non-negative)
	 * @return the total trapped water
	 */
	public static int trap(int[] height) {
		// TODO: keep a stack of decreasing-height indices; on a taller bar, pop and add the
		//			 bounded water between the new bar and the next remaining bar.
		throw new UnsupportedOperationException("TODO: implement trap");
	}
}
