import java.util.List;

/**
 * Knuth–Morris–Pratt string matching.
 *
 * <p>Uses the prefix (failure) function of the pattern to scan the text in linear time without ever
 * re-comparing a text character.
 */
class Kmp {

	/**
	 * Computes the prefix (failure) function of {@code pattern}. Entry {@code i} is the length of the
	 * longest proper prefix of {@code pattern[0..i]} that is also a suffix of it.
	 *
	 * @param pattern the pattern to analyze
	 * @return an array {@code pi} of the same length as {@code pattern}
	 * @throws NullPointerException if {@code pattern} is null
	 */
	public int[] prefixFunction(String pattern) {
		// TODO: build the failure function in O(m) using the standard two-pointer recurrence.
		throw new UnsupportedOperationException("TODO: implement prefixFunction");
	}

	/**
	 * Returns every start index in {@code text} where {@code pattern} occurs, in ascending order.
	 * Overlapping matches are reported. An empty pattern matches at every index {@code
	 * 0..text.length} inclusive.
	 *
	 * @param text the text to search
	 * @param pattern the pattern to find
	 * @return the list of 0-based match start indices
	 * @throws NullPointerException if {@code text} or {@code pattern} is null
	 */
	public List<Integer> search(String text, String pattern) {
		// TODO: scan the text with the prefix function, emitting a match whenever the full pattern
		// aligns.
		throw new UnsupportedOperationException("TODO: implement search");
	}
}
