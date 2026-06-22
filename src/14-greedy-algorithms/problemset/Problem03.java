/** Tier 1 — Problem 03: Maximum Non-Overlapping Intervals. */
public class Problem03 {

	/**
	 * Returns the maximum number of mutually non-overlapping intervals that can be kept from {@code
	 * intervals} (equivalently, total minus the fewest deletions to remove all overlaps). Intervals
	 * sharing only an endpoint are treated as non-overlapping.
	 *
	 * @param intervals the intervals, each as a two-element {@code [start, end]} array
	 * @return the size of a maximum non-overlapping subset
	 */
	public int maxNonOverlapping(int[][] intervals) {
		// TODO: sort by end and greedily keep each interval that starts at or after the last kept end.
		throw new UnsupportedOperationException("TODO: implement maxNonOverlapping");
	}
}
