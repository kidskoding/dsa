/**
 * Problem 20 — Range Distinct Values (Offline). Count distinct codes in each inclusive span by
 * sweeping queries sorted by right endpoint over a last-occurrence Fenwick tree.
 */
class Problem20 {

	/**
	 * Answers a batch of range-distinct-count queries over a fixed array. Each query is a 2-element
	 * array {@code {l, r}} asking how many distinct codes appear in {@code codes[l..r]}. Answers are
	 * returned in input order.
	 *
	 * @param codes the fixed array of artifact codes
	 * @param queries the inclusive {@code {l, r}} span queries
	 * @return the distinct counts, in input order
	 */
	int[] rangeDistinct(int[] codes, int[][] queries) {
		// TODO: sort queries by right endpoint; sweep a Fenwick keeping each value's last index alive.
		throw new UnsupportedOperationException("TODO: implement rangeDistinct");
	}
}
