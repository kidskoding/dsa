/**
 * Problem 27 — Leaderboard Sort. Given parallel {@code scores} and {@code names}, rank entries by
 * score descending, breaking ties by name ascending, and return the names in ranked order. Use a
 * single stable sort driven by a custom comparator over indices.
 */
class Problem27 {

	/**
	 * Returns the names ordered by descending score, with ties broken by ascending (lexicographic)
	 * name.
	 *
	 * @param scores per-entry scores
	 * @param names per-entry names, parallel to {@code scores}
	 * @return the names in final ranked order
	 */
	String[] rankLeaderboard(int[] scores, String[] names) {
		// TODO: sort indices by (score desc, name asc), then read out the names.
		throw new UnsupportedOperationException("TODO: implement rankLeaderboard");
	}
}
