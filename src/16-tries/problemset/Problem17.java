/**
 * Problem 17 — Weighted Prefix Frequency on the Trade Ledger.
 *
 * <p>The input holds a {@code "name weight"} entry block, a {@code "---"} separator, then a query
 * block. A later entry overwrites an earlier same-named weight; each query sums weights by prefix.
 */
class Problem17 {

	/**
	 * Returns the weighted prefix sum for each query, as strings, in query order.
	 *
	 * @param lines the entry block ({@code "name weight"}), a single {@code "---"} separator, then prefixes
	 * @return the sum of weights over all stored names beginning with each query prefix
	 */
	String[] run(String[] lines) {
		// TODO: maintain per-node accumulated weights (handling overwrites); read each prefix node's sum.
		throw new UnsupportedOperationException("TODO: implement run");
	}
}
