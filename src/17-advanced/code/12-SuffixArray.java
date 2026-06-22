/**
 * A suffix array: the sorted order of all suffixes of a string, supporting substring search and,
 * with a companion LCP array, many string queries. See the workbook page {@code suffix-arrays.md}.
 */
class SuffixArray {

	private final String text;

	/**
	 * Builds the suffix array of {@code text}.
	 *
	 * @param text the input string; may be empty
	 */
	public SuffixArray(String text) {
		this.text = text;
	}

	/**
	 * Returns the suffix array: starting indices of all suffixes sorted lexicographically.
	 *
	 * @return an array of length {@code text.length()} of sorted suffix start indices
	 */
	public int[] build() {
		// TODO: sort suffix start indices (e.g. prefix-doubling) into lexicographic order.
		throw new UnsupportedOperationException("TODO: implement build");
	}

	/**
	 * Returns the LCP array, where {@code lcp[i]} is the longest-common-prefix length of the suffixes
	 * at sorted ranks {@code i-1} and {@code i} (with {@code lcp[0] == 0}).
	 *
	 * @return the LCP array aligned with the suffix array
	 */
	public int[] longestCommonPrefixes() {
		// TODO: compute LCP from the suffix array (e.g. Kasai's algorithm).
		throw new UnsupportedOperationException("TODO: implement longestCommonPrefixes");
	}

	/**
	 * Returns whether {@code pattern} occurs as a substring of the text, via binary search over the
	 * suffix array.
	 *
	 * @param pattern the pattern to search for
	 * @return {@code true} if {@code pattern} is a substring
	 */
	public boolean contains(String pattern) {
		// TODO: binary search the suffix array for a suffix prefixed by pattern.
		throw new UnsupportedOperationException("TODO: implement contains");
	}
}
