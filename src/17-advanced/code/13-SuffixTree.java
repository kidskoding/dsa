import java.util.HashMap;
import java.util.Map;

/**
 * A suffix tree: a compressed trie of all suffixes of a string, supporting linear-time substring
 * search and many string queries after {@code O(n)} construction (e.g. Ukkonen's algorithm). See
 * the workbook page {@code suffix-trees.md}.
 */
class SuffixTree {

	/** An edge-compressed node; edges are keyed by their first character. */
	static final class SuffixTreeNode {
		final Map<Character, SuffixTreeNode> children = new HashMap<>();
		int start;
		int end;

		SuffixTreeNode(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}

	private final String text;
	private SuffixTreeNode root;

	/**
	 * Builds the suffix tree of {@code text}.
	 *
	 * @param text the input string; may be empty
	 */
	public SuffixTree(String text) {
		// TODO: construct the compressed suffix tree (e.g. Ukkonen's algorithm).
		this.text = text;
		throw new UnsupportedOperationException("TODO: implement construction");
	}

	/**
	 * Returns whether {@code pattern} occurs as a substring of the text.
	 *
	 * @param pattern the pattern to search for
	 * @return {@code true} if {@code pattern} is a substring
	 */
	public boolean contains(String pattern) {
		// TODO: walk edges from the root matching pattern characters.
		throw new UnsupportedOperationException("TODO: implement contains");
	}

	/**
	 * Returns the number of times {@code pattern} occurs in the text (counting leaves below the match
	 * point).
	 *
	 * @param pattern the pattern to count
	 * @return the number of occurrences
	 */
	public int countOccurrences(String pattern) {
		// TODO: locate the match point then count leaves in its subtree.
		throw new UnsupportedOperationException("TODO: implement countOccurrences");
	}
}
