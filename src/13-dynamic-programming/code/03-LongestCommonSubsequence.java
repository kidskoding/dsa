/**
 * The longest common subsequence (LCS) of two strings: the longest sequence of characters appearing
 * left-to-right (not necessarily contiguously) in both inputs. Solved with the {@code O(mn)} grid
 * DP. See {@code longest-common-subsequence.md}.
 */
class LongestCommonSubsequence {

	/**
	 * Returns the length of a longest common subsequence of {@code a} and {@code b}.
	 *
	 * @param a the first string (non-null)
	 * @param b the second string (non-null)
	 * @return the LCS length (0 when either input is empty)
	 */
	public int length(String a, String b) {
		// TODO: c[i][j] = matching -> c[i-1][j-1]+1, else max(c[i-1][j], c[i][j-1]).
		throw new UnsupportedOperationException("TODO: implement length");
	}

	/**
	 * Returns an actual longest common subsequence of {@code a} and {@code b}, reconstructed from the
	 * DP table; ties may be broken arbitrarily.
	 *
	 * @param a the first string (non-null)
	 * @param b the second string (non-null)
	 * @return a longest common subsequence ({@code ""} when none)
	 */
	public String reconstruct(String a, String b) {
		// TODO: fill the table, then walk back from c[m][n] collecting matched characters.
		throw new UnsupportedOperationException("TODO: implement reconstruct");
	}
}
