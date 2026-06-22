/**
 * Problem 12 — Running median.
 *
 * <p>Process a stream of integers and, after each value, report the median of all values seen so
 * far, using two heaps (a max-heap of the lower half and a min-heap of the upper half).
 */
public final class Problem12 {

	private Problem12() {}

	/**
	 * Returns, for each prefix of {@code stream}, the median of the values seen so far.
	 *
	 * <p>For a prefix of even length, the median is the average of the two middle values.
	 *
	 * @param stream the input values in arrival order
	 * @return an array of the same length whose {@code i}-th entry is the median of {@code
	 *		 stream[0..i]}
	 */
	public static double[] runningMedian(int[] stream) {
		// TODO: maintain balanced lower max-heap and upper min-heap; emit the median after each value.
		throw new UnsupportedOperationException("TODO: implement runningMedian");
	}
}
