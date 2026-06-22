/**
 * A segment tree supporting range-sum queries and point updates over a fixed-length integer array,
 * each in {@code O(log n)}. See the workbook page {@code segment-trees.md}.
 */
class SegmentTree {

	/** A segment-tree node covering {@code [lo, hi]} with an aggregated sum. */
	static final class SegmentTreeNode {
		int lo;
		int hi;
		long sum;
		SegmentTreeNode left;
		SegmentTreeNode right;

		SegmentTreeNode(int lo, int hi) {
			this.lo = lo;
			this.hi = hi;
		}
	}

	private SegmentTreeNode root;

	/**
	 * Builds the tree over a copy of {@code values}.
	 *
	 * @param values the initial array; must be non-empty
	 */
	public SegmentTree(int[] values) {
		// TODO: recursively build nodes covering each subrange and aggregate sums.
		throw new UnsupportedOperationException("TODO: implement constructor build");
	}

	/**
	 * Sets {@code values[index] = value} and repairs aggregates on the path to the root.
	 *
	 * @param index the position to update
	 * @param value the new value
	 */
	public void update(int index, int value) {
		// TODO: descend to the leaf, set it, then re-aggregate ancestors.
		throw new UnsupportedOperationException("TODO: implement update");
	}

	/**
	 * Returns the sum of {@code values[lo..hi]} inclusive.
	 *
	 * @param lo the inclusive left bound
	 * @param hi the inclusive right bound
	 * @return the range sum
	 */
	public long rangeSum(int lo, int hi) {
		// TODO: combine full-cover nodes and recurse into partial overlaps.
		throw new UnsupportedOperationException("TODO: implement rangeSum");
	}
}
