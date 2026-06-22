/**
 * Problem 13 — Heap-based meeting rooms.
 *
 * <p>Given a list of half-open meeting intervals {@code [start, end)}, return the minimum number of
 * rooms required so that no two overlapping meetings share a room, using a min-heap of end times.
 */
public final class Problem13 {

	private Problem13() {}

	/**
	 * Returns the minimum number of rooms needed to host all meetings without overlap conflicts.
	 *
	 * @param intervals an array of {@code [start, end)} pairs
	 * @return the minimum number of concurrent rooms required
	 */
	public static int minMeetingRooms(int[][] intervals) {
		// TODO: sort by start; use a min-heap of end times to free rooms as meetings finish.
		throw new UnsupportedOperationException("TODO: implement minMeetingRooms");
	}
}
