import java.util.List;

/**
 * A compressed trie (radix tree) supporting insertion and prefix queries.
 *
 * <p>Chains of single-child nodes are merged into edges labelled by substrings, so a tree holding
 * \( n \) keys has at most \( 2n - 1 \) nodes. Inserting a key may require splitting an existing
 * edge at the first mismatching character.
 */
class CompressedTrie {

	private final CompressedTrieNode root = new CompressedTrieNode("");

	/**
	 * Inserts {@code word} into the trie, splitting edges as needed.
	 *
	 * @param word the key to insert (may be empty)
	 */
	public void insert(String word) {
		// TODO: walk edges matching word's characters; on a partial edge match,
		// split the edge node, then attach the remainder of word.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Returns whether {@code word} is a complete inserted key.
	 *
	 * @param word the key to search for
	 * @return true only for complete inserted keys
	 */
	public boolean contains(String word) {
		// TODO: match word against edge labels; succeed only when consumed exactly
		// at an end-of-word node.
		throw new UnsupportedOperationException("TODO: implement contains");
	}

	/**
	 * Returns whether any inserted key begins with {@code prefix}.
	 *
	 * @param prefix the prefix to test
	 * @return true if at least one inserted key has the prefix
	 */
	public boolean startsWith(String prefix) {
		// TODO: match prefix against edge labels, allowing it to end partway
		// through an edge.
		throw new UnsupportedOperationException("TODO: implement startsWith");
	}

	/**
	 * Returns every inserted key beginning with {@code prefix}, in unspecified order.
	 *
	 * @param prefix the prefix to enumerate under
	 * @return all inserted keys having {@code prefix} as a prefix
	 */
	public List<String> wordsWithPrefix(String prefix) {
		// TODO: locate the node/edge where prefix ends, then DFS-collect every
		// terminal key in that subtree by concatenating edge labels.
		throw new UnsupportedOperationException("TODO: implement wordsWithPrefix");
	}
}
