/**
 * A 2D array stored as a single contiguous block in row-major order, accessed through index
 * arithmetic ({@code row * cols + col}). Implement each method from first principles — see the
 * workbook page {@code multidimensional-arrays.md} for the address formula and layout discussion.
 *
 * @param <T> the element type
 */
class MultidimensionalArray<T> {

	/**
	 * Allocates an {@code rows x cols} grid backed by one flat block.
	 *
	 * @param rows the number of rows; must be non-negative
	 * @param cols the number of columns; must be non-negative
	 * @throws IllegalArgumentException if {@code rows} or {@code cols} is negative
	 */
	public MultidimensionalArray(int rows, int cols) {
		// TODO: allocate a flat backing block of size rows * cols.
		throw new UnsupportedOperationException("TODO: implement MultidimensionalArray(int, int)");
	}

	/**
	 * Returns the number of rows.
	 *
	 * @return the row extent
	 */
	public int rows() {
		// TODO: return the row count.
		throw new UnsupportedOperationException("TODO: implement rows");
	}

	/**
	 * Returns the number of columns.
	 *
	 * @return the column extent
	 */
	public int cols() {
		// TODO: return the column count.
		throw new UnsupportedOperationException("TODO: implement cols");
	}

	/**
	 * Maps a {@code (row, col)} pair to its flat row-major index, {@code row * cols + col}.
	 *
	 * @param row the row coordinate; must satisfy {@code 0 <= row < rows()}
	 * @param col the column coordinate; must satisfy {@code 0 <= col < cols()}
	 * @return the index into the flat backing block
	 * @throws IndexOutOfBoundsException if either coordinate is out of range
	 */
	public int flatIndex(int row, int col) {
		// TODO: bounds-check, then return row * cols + col.
		throw new UnsupportedOperationException("TODO: implement flatIndex");
	}

	/**
	 * Reads the element at {@code (row, col)}.
	 *
	 * @param row the row coordinate; must satisfy {@code 0 <= row < rows()}
	 * @param col the column coordinate; must satisfy {@code 0 <= col < cols()}
	 * @return the element stored at that cell
	 * @throws IndexOutOfBoundsException if either coordinate is out of range
	 */
	public T get(int row, int col) {
		// TODO: translate to a flat index and return the element.
		throw new UnsupportedOperationException("TODO: implement get");
	}

	/**
	 * Writes {@code value} into the cell at {@code (row, col)}.
	 *
	 * @param row the row coordinate; must satisfy {@code 0 <= row < rows()}
	 * @param col the column coordinate; must satisfy {@code 0 <= col < cols()}
	 * @param value the element to store
	 * @throws IndexOutOfBoundsException if either coordinate is out of range
	 */
	public void set(int row, int col, T value) {
		// TODO: translate to a flat index and store the element.
		throw new UnsupportedOperationException("TODO: implement set");
	}
}
