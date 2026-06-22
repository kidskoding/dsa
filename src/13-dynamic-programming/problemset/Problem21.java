/**
 * Problem 21 — Word Break.
 *
 * <p>Decide whether {@code s} can be segmented into a sequence of one or more words from
 * {@code wordDict} (words reusable).
 */
import java.util.List;

class Problem21 {

	/**
	 * Returns whether {@code s} can be segmented into dictionary words.
	 *
	 * @param s the string to segment
	 * @param wordDict the dictionary of usable words
	 * @return {@code true} if a valid segmentation exists
	 */
	boolean wordBreak(String s, List<String> wordDict) {
		// TODO: dp[i] true if some word ends at i and dp[i - word.length()] is true; dp[0] = true.
		throw new UnsupportedOperationException("TODO: implement wordBreak");
	}
}
