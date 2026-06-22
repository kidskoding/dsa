import java.util.List;

/**
 * An interval tree: a BST keyed on interval low endpoints, augmented with the maximum high endpoint
 * in each subtree to support stabbing and overlap queries in {@code O(log n)} per result. See the
 * workbook page {@code interval-trees.md}.
 */
class IntervalTree {

	/** A node storing one interval and the maximum high endpoint of its subtree. */
	static final class IntervalTreeNode {
		Interval interval;
		int max;
		IntervalTreeNode left;
		IntervalTreeNode right;

		IntervalTreeNode(Interval interval) {
			this.interval = interval;
			this.max = interval.high();
		}
	}

	private IntervalTreeNode root;

	/**
	 * Inserts a closed interval, maintaining the augmented {@code max} fields.
	 *
	 * @param interval the interval to insert
	 */
	public void insert(Interval interval) {
		// TODO: BST-insert keyed on low and update max on the search path.
		throw new UnsupportedOperationException("TODO: implement insert");
	}

	/**
	 * Returns any stored interval that overlaps {@code query}, or {@code null} if none does.
	 *
	 * @param query the interval to test for overlap
	 * @return an overlapping stored interval, or {@code null}
	 */
	public Interval searchOverlap(Interval query) {
		// TODO: use max augmentation to prune subtrees that cannot overlap.
		throw new UnsupportedOperationException("TODO: implement searchOverlap");
	}

	/**
	 * Returns whether any stored interval contains the point {@code q}.
	 *
	 * @param q the query point
	 * @return {@code true} if some interval contains {@code q}
	 */
	public boolean stab(int q) {
		// TODO: treat the point as the degenerate interval [q, q] and search for overlap.
		throw new UnsupportedOperationException("TODO: implement stab");
	}

	/**
	 * Reports every stored interval overlapping {@code query}.
	 *
	 * @param query the interval to test for overlap
	 * @return all overlapping stored intervals
	 */
	public List<Interval> reportOverlaps(Interval query) {
		// TODO: traverse, pruning with max, collecting every overlapping interval.
		throw new UnsupportedOperationException("TODO: implement reportOverlaps");
	}
}
