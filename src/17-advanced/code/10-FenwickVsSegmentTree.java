/**
 * A conceptual comparison of Fenwick trees and segment trees. A Fenwick tree handles invertible
 * aggregates (e.g. sum) compactly, while a segment tree handles any associative operation (monoid),
 * including non-invertible ones such as min/max. This page exposes verifiable predicates capturing
 * those trade-offs. See the workbook page {@code fenwick-vs-segment-tree.md}.
 */
class FenwickVsSegmentTree {

	/**
	 * Returns whether the given aggregate has an inverse, which is the precondition for a Fenwick
	 * tree to answer arbitrary range queries via prefix differences.
	 *
	 * @param aggregate the aggregate operation
	 * @return {@code true} if the operation is invertible (e.g. SUM, XOR)
	 */
	public boolean fenwickSupportsRangeQuery(Aggregate aggregate) {
		// TODO: SUM and XOR are invertible; MIN, MAX, GCD are not.
		throw new UnsupportedOperationException("TODO: implement fenwickSupportsRangeQuery");
	}

	/**
	 * Returns whether a segment tree can answer range queries for the aggregate, which holds for any
	 * associative operation.
	 *
	 * @param aggregate the aggregate operation
	 * @return {@code true} for every associative aggregate
	 */
	public boolean segmentTreeSupportsRangeQuery(Aggregate aggregate) {
		// TODO: a segment tree supports every associative monoid operation.
		throw new UnsupportedOperationException("TODO: implement segmentTreeSupportsRangeQuery");
	}
}
