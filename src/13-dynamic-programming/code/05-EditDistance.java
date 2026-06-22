/**
 * The Levenshtein edit distance between two strings: the minimum number of single-character
 * insertions, deletions, and substitutions to transform one string into the other. Solved with the
 * {@code O(mn)} grid DP. See {@code edit-distance.md}.
 */
class EditDistance {

	/**
	 * Returns the minimum number of insert/delete/substitute operations to transform {@code a} into
	 * {@code b}.
	 *
	 * @param a the source string (non-null)
	 * @param b the target string (non-null)
	 * @return the edit distance ({@code >= 0})
	 */
	public int distance(String a, String b) {
		// TODO: d[i][j] = match ? d[i-1][j-1] : 1 + min(insert, delete, substitute).
		throw new UnsupportedOperationException("TODO: implement distance");
	}
}
