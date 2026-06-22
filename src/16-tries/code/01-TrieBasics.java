/**
 * A standard trie (prefix tree) supporting insertion and exact-key search.
 *
 * <p>Each operation runs in \( O(L) \) time for a key of length \( L \), independent of the number
 * of stored keys.
 */
class TrieBasics {

	private final TrieNode root = new TrieNode();

	/**
	 * Inserts {@code word} into the trie. Inserting a duplicate key is a no-op beyond ensuring the
	 * terminal mark is set.
	 *
	 * @param word the key to insert (may be empty)
	 */
	public void insert(String word) {
		// TODO: walk/create a path of TrieNodes for each character, then mark the
		// final node as the end of a word.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Returns whether {@code word} was inserted as a complete key.
	 *
	 * @param word the key to search for
	 * @return true only if {@code word} is a complete inserted key, not merely a prefix
	 */
	public boolean contains(String word) {
		// TODO: follow the path for word; return true only if it exists AND the
		// terminal node is marked as end-of-word.
		throw new UnsupportedOperationException("TODO: implement contains");
	}

	/**
	 * Returns whether any inserted key has {@code prefix} as a prefix.
	 *
	 * @param prefix the prefix to test
	 * @return true if at least one inserted key begins with {@code prefix}
	 */
	public boolean startsWith(String prefix) {
		// TODO: follow the path for prefix; return true if the path exists,
		// regardless of the terminal mark.
		throw new UnsupportedOperationException("TODO: implement startsWith");
	}
}
