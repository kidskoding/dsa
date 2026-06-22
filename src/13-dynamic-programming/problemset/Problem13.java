import java.util.List;

/**
 * Problem 13 — Word Break.
 *
 * <p>Given a string and a dictionary of words, decide whether the string can be segmented into a
 * sequence of one or more dictionary words.
 */
public class Problem13 {

	/**
	 * Returns whether {@code s} can be segmented into a sequence of words from {@code dictionary}.
	 *
	 * @param s the string to segment (non-null)
	 * @param dictionary the allowed words (non-null)
	 * @return true if a valid segmentation exists
	 */
	public boolean canSegment(String s, List<String> dictionary) {
		// TODO: dp[i] = some j < i where dp[j] and s[j..i) is in the dictionary; dp[0] = true.
		throw new UnsupportedOperationException("TODO: implement canSegment");
	}
}
