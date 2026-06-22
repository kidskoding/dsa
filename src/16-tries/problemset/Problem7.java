/**
 * Problem 7 — Search Suggestions System.
 *
 * <p>The first element is the search word; the rest are products. For each typed prefix of the
 * word, emit a comma-joined string of up to three lexicographically smallest matching products.
 */
class Problem7 {

	/**
	 * Returns one comma-joined suggestion string per typed prefix of the search word.
	 *
	 * @param input element 0 is the search word; elements 1.. are the products (lowercase letters)
	 * @return {@code word.length} entries; entry {@code i} joins up to three smallest completions of
	 *     the length-{@code (i+1)} prefix, or {@code ""} if none match
	 */
	String[] run(String[] input) {
		// TODO: insert products into a trie; for each prefix collect up to three smallest completions.
		throw new UnsupportedOperationException("TODO: implement run");
	}
}
