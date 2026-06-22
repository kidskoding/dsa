import java.util.List;

/**
 * A trie specialised for prefix queries: testing prefix existence, counting keys under a prefix,
 * and enumerating the full set of keys sharing a prefix.
 */
class PrefixSearch {

	private final TrieNode root = new TrieNode();

	/**
	 * Inserts {@code word} into the trie.
	 *
	 * @param word the key to insert (may be empty)
	 */
	public void insert(String word) {
		// TODO: create the path of TrieNodes and mark the terminal node.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Returns whether {@code word} is a complete inserted key.
	 *
	 * @param word the key to search for
	 * @return true only for complete inserted keys
	 */
	public boolean contains(String word) {
		// TODO: follow the path and check the end-of-word mark.
		throw new UnsupportedOperationException("TODO: implement contains");
	}

	/**
	 * Returns whether any inserted key begins with {@code prefix}.
	 *
	 * @param prefix the prefix to test
	 * @return true if at least one inserted key has the prefix
	 */
	public boolean startsWith(String prefix) {
		// TODO: return whether the path for prefix exists.
		throw new UnsupportedOperationException("TODO: implement startsWith");
	}

	/**
	 * Counts how many inserted keys begin with {@code prefix}.
	 *
	 * @param prefix the prefix to count under
	 * @return the number of inserted keys having {@code prefix} as a prefix
	 */
	public int countWordsWithPrefix(String prefix) {
		// TODO: descend to the prefix node, then count the end-of-word marks in the
		// subtree rooted there.
		throw new UnsupportedOperationException("TODO: implement countWordsWithPrefix");
	}

	/**
	 * Returns every inserted key beginning with {@code prefix}, in unspecified order.
	 *
	 * @param prefix the prefix to enumerate under
	 * @return all inserted keys having {@code prefix} as a prefix
	 */
	public List<String> wordsWithPrefix(String prefix) {
		// TODO: descend to the prefix node, then DFS the subtree collecting every
		// path that ends on an end-of-word node.
		throw new UnsupportedOperationException("TODO: implement wordsWithPrefix");
	}
}
