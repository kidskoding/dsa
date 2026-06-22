/**
 * Problem 10 — Wildcard search.
 *
 * <p>Support {@link #search(String)} where {@code '.'} matches any single character. Bound the
 * worst-case cost of a query (it can branch across all children at a wildcard).
 */
public class Problem10 {

	/**
	 * Inserts {@code word} into the trie.
	 *
	 * @param word the key to insert
	 */
	public void insert(String word) {
		// TODO: create the path of trie nodes and mark the terminal node.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Returns whether {@code pattern} matches a complete inserted key, with {@code '.'} matching any
	 * single character.
	 *
	 * @param pattern the search pattern, possibly containing {@code '.'} wildcards
	 * @return true if some inserted key matches the pattern
	 */
	public boolean search(String pattern) {
		// TODO: DFS; on '.' recurse into every child, otherwise into the matching
		// child. Succeed at an end-of-word node when the pattern is consumed.
		throw new UnsupportedOperationException("TODO: implement search");
	}
}
