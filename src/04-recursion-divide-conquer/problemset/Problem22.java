import java.util.List;

/**
 * Problem 22 — Skyline Merge. Given buildings as {@code [left, right, height]}, return the skyline
 * as key points {@code [x, height]} sorted by {@code x} (last height 0), computed in {@code O(n log
 * n)} by recursively computing and merging the skylines of two building groups.
 */
class Problem22 {

	/**
	 * Returns the skyline of {@code buildings} as a list of {@code [x, height]} key points.
	 *
	 * @param buildings each entry is {@code [left, right, height]}
	 * @return the skyline key points sorted by ascending {@code x}
	 */
	List<int[]> getSkyline(int[][] buildings) {
		// TODO: split buildings, recurse on each half, then merge the two skylines.
		throw new UnsupportedOperationException("TODO: implement getSkyline");
	}
}
