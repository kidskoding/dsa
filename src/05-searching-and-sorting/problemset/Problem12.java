/**
 * Problem 12 — Search a 2D Matrix. Each row is ascending and the first value of each row exceeds the
 * last value of the previous row. Return whether {@code target} occurs, in {@code O(log(m * n))} time
 * by binary-searching the flattened order.
 */
class Problem12 {

	/**
	 * Returns whether {@code target} appears in {@code matrix}, an {@code m x n} grid whose values are
	 * ascending when read row by row.
	 *
	 * @param matrix a row-major fully-sorted matrix
	 * @param target the value to search for
	 * @return {@code true} if {@code target} is present, otherwise {@code false}
	 */
	boolean searchMatrix(int[][] matrix, int target) {
		// TODO: binary-search the flattened index range, mapping back to (row, col).
		throw new UnsupportedOperationException("TODO: implement searchMatrix");
	}
}
