/**
 * A Fenwick tree (binary indexed tree) supporting point updates and prefix-sum queries in {@code
 * O(log n)} using a flat array indexed by the lowest-set-bit trick. See the workbook page {@code
 * fenwick-tree.md}.
 */
class FenwickTree {

	private final long[] tree;
	private final int size;

	/**
	 * Creates a Fenwick tree over {@code size} zero-initialized elements (1-indexed internally).
	 *
	 * @param size the number of elements, {@code size >= 0}
	 */
	public FenwickTree(int size) {
		this.size = size;
		this.tree = new long[size + 1];
	}

	/**
	 * Adds {@code delta} to the element at zero-based {@code index}.
	 *
	 * @param index the zero-based position to update
	 * @param delta the amount to add
	 */
	public void update(int index, long delta) {
		// TODO: walk upward by adding the lowest set bit, accumulating delta.
		throw new UnsupportedOperationException("TODO: implement update");
	}

	/**
	 * Returns the sum of elements at zero-based indices {@code [0, index]}.
	 *
	 * @param index the inclusive right bound (zero-based)
	 * @return the prefix sum
	 */
	public long prefixSum(int index) {
		// TODO: walk downward by removing the lowest set bit, accumulating sums.
		throw new UnsupportedOperationException("TODO: implement prefixSum");
	}

	/**
	 * Returns the sum of elements at zero-based indices {@code [lo, hi]} inclusive.
	 *
	 * @param lo the inclusive left bound (zero-based)
	 * @param hi the inclusive right bound (zero-based)
	 * @return the range sum
	 */
	public long rangeSum(int lo, int hi) {
		// TODO: express as prefixSum(hi) - prefixSum(lo - 1).
		throw new UnsupportedOperationException("TODO: implement rangeSum");
	}
}
