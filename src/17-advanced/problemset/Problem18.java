/** Tier 3 — Problem 18: Dynamic Predecessor Under a Bounded Universe. */
public class Problem18 {

	/** Sentinel returned when a predecessor query has no answer. */
	public static final int NIL = -1;

	/**
	 * Applies a sequence of operations over the universe {@code {0, ..., universe - 1}} and returns
	 * the answers to the predecessor queries. Each operation is {@code {type, value}} where type 0
	 * inserts, type 1 deletes, and type 2 asks for the largest stored element strictly less than
	 * {@code value} (or {@link #NIL}).
	 *
	 * @param universe the universe size (a power of two)
	 * @param operations the encoded operation stream
	 * @return the predecessor-query answers, in order
	 */
	public int[] predecessorAfterOps(int universe, int[][] operations) {
		// TODO: back the operations with a van Emde Boas tree for O(log log u) per op.
		throw new UnsupportedOperationException("TODO: implement predecessorAfterOps");
	}
}
