/** Tier 3 — Problem 13: Persistent Segment Tree. */
public class Problem13 {

	/**
	 * Builds a fully persistent segment tree from {@code initial} (version 0), applies the point
	 * updates {@code updates[i] = {index, value}} to produce versions 1, 2, ..., then answers each
	 * historical query {@code queries[j] = {version, lo, hi}} as an inclusive range sum.
	 *
	 * @param initial the initial array (version 0)
	 * @param updates point updates {@code {index, value}} producing successive versions
	 * @param queries historical range-sum queries {@code {version, lo, hi}}
	 * @return the range sums against the requested versions, in order
	 */
	public long[] queryVersion(int[] initial, int[][] updates, int[][] queries) {
		// TODO: share unchanged subtrees across versions, O(log n) extra space per update.
		throw new UnsupportedOperationException("TODO: implement queryVersion");
	}
}
