import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void minMeetingRooms_overlapping() {
		int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
		assertEquals(2, Problem13.minMeetingRooms(intervals));
	}

	@Test
	void minMeetingRooms_nonOverlapping() {
		int[][] intervals = {{7, 10}, {2, 4}};
		assertEquals(1, Problem13.minMeetingRooms(intervals));
	}

	@Test
	void minMeetingRooms_empty() {
		assertEquals(0, Problem13.minMeetingRooms(new int[][] {}));
	}

	@Test
	void minMeetingRooms_touchingIntervalsShareRoom() {
		// Half-open [start, end): [0,5) and [5,10) do not overlap.
		int[][] intervals = {{0, 5}, {5, 10}};
		assertEquals(1, Problem13.minMeetingRooms(intervals));
	}
}
