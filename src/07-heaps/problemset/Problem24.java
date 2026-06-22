import java.util.List;

/**
 * Problem 24 — Galactic Relay Merge.
 *
 * <p>Given {@code k} strictly-ascending id streams, consider their merged ascending sequence
 * (duplicates kept across streams). Return the id at 0-indexed position {@code target}, or
 * {@code -1} if fewer than {@code target + 1} elements exist. Advance a min-heap lazily.
 */
final class Problem24 {

	private Problem24() {}

	/**
	 * Returns the id at position {@code target} of the merged sequence, or {@code -1}.
	 *
	 * @param streams the strictly-ascending input streams
	 * @param target the 0-indexed position to retrieve
	 * @return the id at that merged position, or {@code -1} if out of range
	 */
	static int relayAt(List<int[]> streams, int target) {
		// TODO: seed a min-heap with each stream head; pop target + 1 times, advancing each stream.
		throw new UnsupportedOperationException("TODO: implement relayAt");
	}
}
