/**
 * Problem 22 — The Skyline Problem (LeetCode 218). Compute the skyline key points by sweeping
 * building edges while tracking the maximum active height.
 */
class Problem22 {

	/**
	 * Computes the skyline of a set of buildings given as triples {@code {left, right, height}}.
	 * Returns the list of key points {@code [x, height]} where the visible outline changes, sorted by
	 * {@code x}, ending with a key point at the rightmost edge with height 0.
	 *
	 * @param buildings the buildings as {@code {left, right, height}} triples
	 * @return the skyline key points as {@code [x, height]} pairs
	 */
	int[][] skyline(int[][] buildings) {
		// TODO: sweep edges left-to-right, tracking max active height with lazy-deletion heap/multiset.
		throw new UnsupportedOperationException("TODO: implement skyline");
	}
}
