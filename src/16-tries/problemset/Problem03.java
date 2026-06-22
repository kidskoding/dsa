/**
 * Problem 03 — Count words with prefix.
 *
 * <p>Return how many inserted keys begin with a given prefix. Aim for \( O(L) \) per query after
 * preprocessing (e.g. by maintaining a subtree count on each node).
 */
public class Problem03 {

	/**
	 * Inserts {@code word} into the trie.
	 *
	 * @param word the key to insert
	 */
	public void insert(String word) {
		// TODO: create the path; consider incrementing a per-node passthrough count
		// so prefix counts become O(L).
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Returns how many inserted keys begin with {@code prefix}.
	 *
	 * @param prefix the prefix to count under
	 * @return the number of inserted keys having the prefix
	 */
	public int countWordsWithPrefix(String prefix) {
		// TODO: descend to the prefix node and return its stored subtree count.
		throw new UnsupportedOperationException("TODO: implement countWordsWithPrefix");
	}
}
