/**
 * Problem 04 — Delete a key.
 *
 * <p>Implement {@link #delete(String)} that removes a key and prunes any nodes that become both
 * childless and non-terminal.
 */
public class Problem04 {

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
	 * Returns whether {@code word} is a complete inserted key.
	 *
	 * @param word the key to search for
	 * @return true only for complete keys
	 */
	public boolean search(String word) {
		// TODO: follow the path and check the end-of-word mark.
		throw new UnsupportedOperationException("TODO: implement search");
	}

	/**
	 * Removes {@code word} if present, pruning nodes that become childless and non-terminal.
	 *
	 * @param word the key to delete
	 * @return true if {@code word} was present and removed
	 */
	public boolean delete(String word) {
		// TODO: unset the terminal mark, then walk back up pruning dead nodes.
		throw new UnsupportedOperationException("TODO: implement delete");
	}
}
