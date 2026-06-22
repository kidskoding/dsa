/**
 * Problem 12 — Add and Search Word (Wildcard {@code .}).
 *
 * <p>Process a stream of {@code "addWord word"} / {@code "search pattern"} commands, where a
 * {@code .} in a pattern matches any single letter, and report the result of every search.
 */
class Problem12 {

	/**
	 * Runs the operation stream and collects one {@code "true"}/{@code "false"} per {@code search}.
	 *
	 * @param operations each {@code "addWord <word>"} or {@code "search <pattern>"}; pattern may use {@code .}
	 * @return the result of each {@code search} command, in order
	 */
	String[] run(String[] operations) {
		// TODO: build a trie; on '.' recurse into every child, otherwise follow the exact edge.
		throw new UnsupportedOperationException("TODO: implement run");
	}
}
