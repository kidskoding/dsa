/**
 * Problem 13 — Meeting Rooms II.
 *
 * <p>Given half-open meeting intervals {@code [start, end)}, return the minimum number of rooms so
 * no two overlapping meetings share a room. Sort by start and use a min-heap of end times.
 */
final class Problem13 {

	private Problem13() {}

	/**
	 * Returns the minimum number of rooms needed for all meetings.
	 *
	 * @param intervals the meeting intervals, each a length-2 array {@code [start, end)}
	 * @return the minimum number of concurrent rooms
	 */
	static int minMeetingRooms(int[][] intervals) {
		// TODO: sort by start, reuse the earliest-freeing room when possible, else open a new one.
		throw new UnsupportedOperationException("TODO: implement minMeetingRooms");
	}
}
