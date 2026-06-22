/**
 * Problem 3 — Count Keys With a Prefix.
 *
 * <p>Process a stream of {@code "insert word"} / {@code "count p"} commands and report, for each
 * count query, how many inserted keys (counting duplicates) begin with {@code p}.
 */
class Problem3 {

	/**
	 * Runs the operation stream and collects one count per {@code count} query, as a string.
	 *
	 * @param operations each {@code "insert <word>"} or {@code "count <p>"}, lowercase letters
	 * @return the count answer for each {@code count} query, in order
	 */
	String[] run(String[] operations) {
		// TODO: maintain a passthrough count per node; a count query reads the prefix node's count.
		throw new UnsupportedOperationException("TODO: implement run");
	}
}
