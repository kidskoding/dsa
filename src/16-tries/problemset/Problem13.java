/**
 * Problem 13 — Top-K Autocomplete.
 *
 * <p>Element 0 is {@code k}, element 1 is the query prefix, and the rest are {@code "word freq"}
 * entries. Return the {@code k} most frequent completions of the prefix, ties broken lexically.
 */
class Problem13 {

	/**
	 * Returns up to {@code k} highest-frequency words beginning with the query prefix, ordered by
	 * descending frequency then lexicographically.
	 *
	 * @param input element 0 is {@code k}; element 1 is the prefix; elements 2.. are {@code "word freq"}
	 * @return the ranked completion words (frequencies omitted)
	 */
	String[] run(String[] input) {
		// TODO: insert words into a trie; collect completions of the prefix and rank them.
		throw new UnsupportedOperationException("TODO: implement run");
	}
}
