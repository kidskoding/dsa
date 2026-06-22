/**
 * A sparse table for {@code O(1)} idempotent range queries (e.g. range minimum) over a static
 * array, after {@code O(n log n)} preprocessing of overlapping power-of-two blocks. See the
 * workbook page {@code sparse-tables.md}.
 */
class SparseTable {

	private final long[][] table;
	private final int length;

	/**
	 * Preprocesses {@code values} for range-minimum queries.
	 *
	 * @param values the static input array; must be non-empty
	 */
	public SparseTable(int[] values) {
		// TODO: fill table[k][i] = min over the block of length 2^k starting at i.
		this.length = values.length;
		this.table = new long[1][1];
		throw new UnsupportedOperationException("TODO: implement preprocessing");
	}

	/**
	 * Returns the minimum of {@code values[lo..hi]} inclusive in {@code O(1)}.
	 *
	 * @param lo the inclusive left bound
	 * @param hi the inclusive right bound
	 * @return the range minimum
	 */
	public long rangeMin(int lo, int hi) {
		// TODO: cover [lo, hi] with two overlapping power-of-two blocks and take the min.
		throw new UnsupportedOperationException("TODO: implement rangeMin");
	}

	/**
	 * Returns the number of elements indexed by this table.
	 *
	 * @return the array length
	 */
	public int size() {
		return length;
	}
}
