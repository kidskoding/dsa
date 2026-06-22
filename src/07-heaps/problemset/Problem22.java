/**
 * Problem 22 — Cargo Merge Cost.
 *
 * <p>Combine {@code n} cargo piles into one. Merging two piles costs the sum of their weights and
 * yields a pile of that weight. Always merge the two lightest piles (Huffman-style). Return the
 * total merge cost, or {@code 0} if fewer than two piles. Use a min-heap.
 */
final class Problem22 {

	private Problem22() {}

	/**
	 * Returns the total cost of merging all piles into one.
	 *
	 * @param weights the pile weights
	 * @return the total merge cost, or {@code 0} for fewer than two piles
	 */
	static long mergeCost(int[] weights) {
		// TODO: repeatedly pop the two lightest piles, add their sum to the cost, push it back.
		throw new UnsupportedOperationException("TODO: implement mergeCost");
	}
}
