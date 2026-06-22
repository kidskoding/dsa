/**
 * Problem 23 — Running Median Checksum.
 *
 * <p>After each integer reading in {@code stream}, take the running lower median: the element at
 * index {@code (count - 1) / 2} of the readings so far in sorted order. Return the sum of all
 * running lower medians. Maintain the medians online with two heaps.
 */
final class Problem23 {

	private Problem23() {}

	/**
	 * Returns the sum of the running lower medians over the whole stream.
	 *
	 * @param stream the integer readings, in arrival order
	 * @return the sum of all running lower medians
	 */
	static long medianChecksum(int[] stream) {
		// TODO: maintain a max-heap (lower half) and min-heap (upper half); read the lower median.
		throw new UnsupportedOperationException("TODO: implement medianChecksum");
	}
}
