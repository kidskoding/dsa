import java.util.List;

/**
 * The Z-algorithm for linear-time string matching.
 *
 * <p>The Z-array of a string records, for each position, the length of the longest substring
 * starting there that matches a prefix of the string. Concatenating {@code pattern + separator +
 * text} turns matching into a Z-array scan.
 */
class ZAlgorithm {

	/**
	 * Computes the Z-array of {@code s} in O(n). Entry {@code i} is the length of the longest common
	 * prefix of {@code s} and the suffix of {@code s} starting at {@code i}. By convention entry
	 * {@code 0} is {@code 0}.
	 *
	 * @param s the string to analyze
	 * @return an array of the same length as {@code s}
	 * @throws NullPointerException if {@code s} is null
	 */
	public int[] zArray(String s) {
		// TODO: maintain the rightmost Z-box [l, r] and reuse previously computed values.
		throw new UnsupportedOperationException("TODO: implement zArray");
	}

	/**
	 * Returns every start index in {@code text} where {@code pattern} occurs, in ascending order, by
	 * running the Z-algorithm over a sentinel-joined concatenation. Overlapping matches are reported.
	 * An empty pattern matches at every index {@code 0..text.length} inclusive.
	 *
	 * @param text the text to search
	 * @param pattern the pattern to find
	 * @return the list of 0-based match start indices
	 * @throws NullPointerException if {@code text} or {@code pattern} is null
	 */
	public List<Integer> search(String text, String pattern) {
		// TODO: build the Z-array of pattern + sentinel + text and collect positions where Z >=
		// |pattern|.
		throw new UnsupportedOperationException("TODO: implement search");
	}
}
