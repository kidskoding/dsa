/** Tier 3 — Problem 17: Distinct Values in a Range (Offline). */
public class Problem17 {

	/**
	 * Answers, for each inclusive query {@code queries[i] = {lo, hi}}, the number of distinct values
	 * in {@code values[lo..hi]}, processing the queries offline.
	 *
	 * @param values the input array
	 * @param queries inclusive range queries, each {@code {lo, hi}}
	 * @return the distinct-value counts, one per query, in original order
	 */
	public int[] distinctInRanges(int[] values, int[][] queries) {
		// TODO: sort queries by right endpoint and sweep with a Fenwick tree of last occurrences.
		throw new UnsupportedOperationException("TODO: implement distinctInRanges");
	}
}
