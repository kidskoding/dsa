/**
 * A segment tree with lazy propagation supporting range-add updates and range-sum queries, each in
 * {@code O(log n)}, by deferring pending updates at internal nodes. See the workbook page {@code
 * lazy-propagation.md}.
 */
class LazyPropagation {

	/** A node covering {@code [lo, hi]} with an aggregated sum and a pending lazy add. */
	static final class LazyNode {
		int lo;
		int hi;
		long sum;
		long pending;
		LazyNode left;
		LazyNode right;

		LazyNode(int lo, int hi) {
			this.lo = lo;
			this.hi = hi;
		}
	}

	private LazyNode root;

	/**
	 * Builds the tree over a copy of {@code values}.
	 *
	 * @param values the initial array; must be non-empty
	 */
	public LazyPropagation(int[] values) {
		// TODO: recursively build covering nodes with zero pending updates.
		throw new UnsupportedOperationException("TODO: implement constructor build");
	}

	/**
	 * Adds {@code delta} to every element in {@code values[lo..hi]} inclusive.
	 *
	 * @param lo the inclusive left bound
	 * @param hi the inclusive right bound
	 * @param delta the amount to add
	 */
	public void rangeAdd(int lo, int hi, long delta) {
		// TODO: push down pending updates and stamp lazy add on fully covered nodes.
		throw new UnsupportedOperationException("TODO: implement rangeAdd");
	}

	/**
	 * Returns the sum of {@code values[lo..hi]} inclusive, applying any pending updates lazily.
	 *
	 * @param lo the inclusive left bound
	 * @param hi the inclusive right bound
	 * @return the range sum
	 */
	public long rangeSum(int lo, int hi) {
		// TODO: push down pending updates while descending, then combine covered sums.
		throw new UnsupportedOperationException("TODO: implement rangeSum");
	}
}
