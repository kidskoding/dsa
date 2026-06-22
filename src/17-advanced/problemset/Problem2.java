/**
 * Problem 02 — Fenwick Tree Point Update, Prefix Sum. Support point-add updates and prefix-sum
 * queries over an array, each in \(O(\log n)\) using a binary indexed tree.
 */
class Problem2 {

	/**
	 * Replays an operation stream against a Fenwick tree built over an initial array. Each operation
	 * is a 3-element array {@code {type, a, b}}: type 0 adds {@code b} to index {@code a}; type 1
	 * asks for the prefix sum over {@code [0, a]}. Type-1 answers are returned in order.
	 *
	 * @param nums the initial array
	 * @param operations the encoded operation stream
	 * @return the prefix-sum (type-1) answers, in order
	 */
	long[] prefixSumsAfterOps(int[] nums, int[][] operations) {
		// TODO: back the array with a Fenwick tree; point-add and prefix-sum in O(log n).
		throw new UnsupportedOperationException("TODO: implement prefixSumsAfterOps");
	}
}
