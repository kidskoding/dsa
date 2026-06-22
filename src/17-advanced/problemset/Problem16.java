/**
 * Problem 16 — Interval Stabbing Counts. For each query point, count how many closed intervals cover
 * it, answered offline in \(O((n + q) \log(n + q))\).
 */
class Problem16 {

	/**
	 * Counts, for each query point, how many closed intervals {@code [start, end]} cover it
	 * (inclusive of endpoints). Answers are returned in the order of {@code points}.
	 *
	 * @param intervals the closed intervals as {@code {start, end}} pairs
	 * @param points the query points
	 * @return the coverage counts, in point order
	 */
	int[] stabbingCounts(int[][] intervals, int[] points) {
		// TODO: offline sorted boundary sweep (or difference array over compressed coordinates).
		throw new UnsupportedOperationException("TODO: implement stabbingCounts");
	}
}
