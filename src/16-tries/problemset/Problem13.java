import java.util.List;

/**
 * Problem 13 — Word break.
 *
 * <p>Given a dictionary stored in a trie and a string \( s \), return whether \( s \) can be
 * segmented into a sequence of dictionary words.
 */
public class Problem13 {

	/**
	 * Returns whether {@code s} can be segmented into a sequence of words drawn from {@code
	 * dictionary}.
	 *
	 * @param s the string to segment
	 * @param dictionary the available dictionary words
	 * @return true if {@code s} is a concatenation of dictionary words
	 */
	public boolean wordBreak(String s, List<String> dictionary) {
		// TODO: load the dictionary into a trie, then DP/memoised search over split
		// points using trie traversal to test each candidate word.
		throw new UnsupportedOperationException("TODO: implement wordBreak");
	}
}
