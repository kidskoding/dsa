/**
 * Problem 16 — Longest Palindromic Subsequence.
 *
 * <p>Compute the length of the longest palindromic subsequence of {@code s} (interval DP).
 */
class Problem16 {

	/**
	 * Returns the length of the longest palindromic subsequence of {@code s}.
	 *
	 * @param s the input string (non-empty)
	 * @return the longest palindromic subsequence length
	 */
	int longestPalindromeSubseq(String s) {
		// TODO: dp[i][j] = (s[i]==s[j]) ? dp[i+1][j-1]+2 : max(dp[i+1][j], dp[i][j-1]).
		throw new UnsupportedOperationException("TODO: implement longestPalindromeSubseq");
	}
}
