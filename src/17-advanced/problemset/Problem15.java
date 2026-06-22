/**
 * Problem 15 — Range Frequency Queries (LeetCode 2080). Count occurrences of a value within an
 * inclusive index range via per-value sorted index lists and binary search.
 */
class Problem15 {

	/**
	 * Answers a batch of range-frequency queries over an immutable array. Each query is a 3-element
	 * array {@code {l, r, value}} asking how many times {@code value} appears among indices
	 * {@code [l, r]}. Answers are returned in query order.
	 *
	 * @param arr the immutable array
	 * @param queries the {@code {l, r, value}} queries
	 * @return the frequencies, in query order
	 */
	int[] rangeFrequencies(int[] arr, int[][] queries) {
		// TODO: bucket indices per value, then binary-search the [l, r] window per query.
		throw new UnsupportedOperationException("TODO: implement rangeFrequencies");
	}
}
