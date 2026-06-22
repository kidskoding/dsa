/**
 * Monotonic-stack techniques: nearest greater/smaller neighbors and histogram rectangles, each in
 * amortized O(n). Implement from first principles — see the workbook page {@code monotonic-stack.md}.
 */
class MonotonicStack {
	/**
	 * For each index {@code i}, returns the value of the next strictly greater element to its right,
	 * or {@code -1} if none exists.
	 *
	 * @param a the input values
	 * @return an array {@code out} where {@code out[i]} is the next greater value, or {@code -1}
	 */
	public int[] nextGreaterToRight(int[] a) {
		// TODO: scan right-to-left keeping a decreasing stack; pop while top <= a[i].
		throw new UnsupportedOperationException("TODO: implement nextGreaterToRight");
	}

	/**
	 * For each index {@code i}, returns the index of the previous strictly smaller element to its
	 * left, or {@code -1} if none exists.
	 *
	 * @param a the input values
	 * @return an array {@code out} where {@code out[i]} is the index of the previous smaller element
	 */
	public int[] previousSmallerIndex(int[] a) {
		// TODO: scan left-to-right keeping an increasing stack of indices.
		throw new UnsupportedOperationException("TODO: implement previousSmallerIndex");
	}

	/**
	 * Returns the area of the largest axis-aligned rectangle that fits under the histogram whose bar
	 * heights are given.
	 *
	 * @param heights non-negative bar heights, left to right
	 * @return the maximum rectangle area
	 */
	public long largestRectangleArea(int[] heights) {
		// TODO: use an increasing stack of indices; when a bar is popped, it is the minimum of the
		// rectangle bounded by the new top (left) and the current index (right).
		throw new UnsupportedOperationException("TODO: implement largestRectangleArea");
	}
}
