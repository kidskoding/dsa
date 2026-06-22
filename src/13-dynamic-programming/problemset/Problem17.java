/**
 * Problem 17 — Edit Distance.
 *
 * <p>Compute the minimum number of insertions, deletions, and substitutions to turn
 * {@code word1} into {@code word2} (Levenshtein distance).
 */
class Problem17 {

	/**
	 * Returns the Levenshtein edit distance between the two strings.
	 *
	 * @param word1 the source string
	 * @param word2 the target string
	 * @return the minimum number of edits
	 */
	int minDistance(String word1, String word2) {
		// TODO: dp[i][j] = match ? dp[i-1][j-1] : 1 + min(insert, delete, replace).
		throw new UnsupportedOperationException("TODO: implement minDistance");
	}
}
