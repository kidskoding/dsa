/**
 * The external-memory (I/O) model counts block transfers between a fast memory of size {@code M}
 * and slow disk, both in blocks of {@code B} elements. This conceptual page exposes the model's
 * standard cost bounds as verifiable formulas. See the workbook page {@code
 * external-memory-model.md}.
 */
class ExternalMemoryModel {

	/**
	 * Returns the scan (streaming) cost {@code ceil(n / B)} block transfers.
	 *
	 * @param n the number of elements
	 * @param blockSize the block size {@code B}
	 * @return the number of block transfers for a single scan
	 */
	public long scanCost(long n, long blockSize) {
		// TODO: return ceil(n / blockSize), with 0 when n == 0.
		throw new UnsupportedOperationException("TODO: implement scanCost");
	}

	/**
	 * Returns the external-memory sorting cost {@code (n / B) * log_{M/B}(n / B)} rounded to a whole
	 * number of block transfers.
	 *
	 * @param n the number of elements
	 * @param blockSize the block size {@code B}
	 * @param memorySize the internal memory size {@code M}
	 * @return the asymptotic number of block transfers to sort
	 */
	public long sortCost(long n, long blockSize, long memorySize) {
		// TODO: evaluate (n/B) * log base (M/B) of (n/B), rounding to whole transfers.
		throw new UnsupportedOperationException("TODO: implement sortCost");
	}

	/**
	 * Returns the number of B-tree levels (height) for {@code n} keys with branching factor {@code
	 * B}, i.e. {@code ceil(log_B n)}.
	 *
	 * @param n the number of keys
	 * @param branching the branching factor {@code B}
	 * @return the number of levels searched per query
	 */
	public int searchCost(long n, int branching) {
		// TODO: return ceil(log base branching of n), with 0 when n <= 1.
		throw new UnsupportedOperationException("TODO: implement searchCost");
	}
}
