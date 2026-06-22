/**
 * Problem 11 — Find Median from Data Stream.
 *
 * <p>Support adding integers from a stream and reporting the median of all values seen so far. Use a
 * max-heap for the lower half and a min-heap for the upper half, kept balanced so each operation is
 * {@code O(log n)}.
 */
final class Problem11 {

	/** Creates an empty median tracker. */
	Problem11() {
		// TODO: initialize the two half-heaps.
		throw new UnsupportedOperationException("TODO: implement constructor");
	}

	/**
	 * Adds {@code num} to the running collection.
	 *
	 * @param num the value to add
	 */
	void addNum(int num) {
		// TODO: push onto the correct half-heap, then rebalance the two heaps' sizes.
		throw new UnsupportedOperationException("TODO: implement addNum");
	}

	/**
	 * Returns the median of all values added so far.
	 *
	 * @return the median; for an even count, the average of the two middle values
	 */
	double findMedian() {
		// TODO: read the heap tops (and average them when the count is even).
		throw new UnsupportedOperationException("TODO: implement findMedian");
	}
}
