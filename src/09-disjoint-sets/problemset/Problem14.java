/** Tier 3 — Problem 14: Union-find with rollback. */
public class Problem14 {

	/**
	 * Replays a mixed sequence of operations over {@code n} elements and returns the number of
	 * disjoint sets remaining at the end. Each operation is encoded as a two-element array: {@code
	 * [0, a, b]}-style entries union {@code a} and {@code b}, while an entry beginning with {@code 1}
	 * (an {@code Undo}) reverts the most recent union. Because undo must be supported, the underlying
	 * structure uses union by rank with <em>no</em> path compression so operations stay reversible.
	 *
	 * @param n the number of elements, n &ge; 0
	 * @param operations the encoded operations; a union is {@code [0, a, b]} and an undo is {@code
	 *		 [1]}
	 * @return the number of disjoint sets after the sequence
	 */
	public int setCountAfter(int n, int[][] operations) {
		// TODO: maintain an undo stack of (child, oldRank) records; undo pops and restores them.
		throw new UnsupportedOperationException("TODO: implement setCountAfter");
	}
}
