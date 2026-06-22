/**
 * Problem 12 — Longest Palindromic Subsequence.
 *
 * <p>Given a string, compute the length of its longest palindromic subsequence.
 */
public class Problem12 {

	/**
	 * Returns the length of the longest palindromic subsequence of {@code s}.
	 *
	 * @param s the input string (non-null)
	 * @return the longest palindromic subsequence length (0 for the empty string)
	 */
	public int longestPalindromicSubsequence(String s) {
		// TODO: interval DP; dp[i][j] grows by 2 when s[i]==s[j], else max(dp[i+1][j], dp[i][j-1]).
		throw new UnsupportedOperationException("TODO: implement longestPalindromicSubsequence");
	}
}
