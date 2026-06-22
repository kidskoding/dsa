/**
 * Cache-oblivious algorithms achieve optimal memory-transfer counts in the ideal-cache model
 * without knowing the block size {@code B} or cache size {@code M}, typically via recursive divide
 * and conquer. This conceptual page exposes verifiable building blocks. See the workbook page
 * {@code cache-oblivious-algorithms.md}.
 */
class CacheObliviousAlgorithms {

	/**
	 * Transposes the {@code rows x cols} matrix stored in row-major order using a recursive
	 * cache-oblivious split, returning the {@code cols x rows} result (also row-major).
	 *
	 * @param matrix the source matrix in row-major order
	 * @param rows the number of rows
	 * @param cols the number of columns
	 * @return the transposed matrix in row-major order
	 */
	public int[] recursiveTranspose(int[] matrix, int rows, int cols) {
		// TODO: split the longer dimension and recurse until base case, then transpose in place.
		throw new UnsupportedOperationException("TODO: implement recursiveTranspose");
	}

	/**
	 * Returns the asymptotic memory-transfer count {@code n / B} (rounded up) for a single linear
	 * scan of {@code n} elements with block size {@code B} in the ideal-cache model.
	 *
	 * @param n the number of elements scanned
	 * @param blockSize the cache block size {@code B}
	 * @return the number of block transfers
	 */
	public long scanTransfers(long n, long blockSize) {
		// TODO: return ceil(n / blockSize) (with 0 for n == 0).
		throw new UnsupportedOperationException("TODO: implement scanTransfers");
	}
}
