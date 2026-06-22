import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void minMeetingRooms_twoRooms() {
		assertEquals(2, Problem13.minMeetingRooms(new int[][] {{0, 30}, {5, 10}, {15, 20}}));
	}

	@Test
	void minMeetingRooms_disjointReuseOne() {
		assertEquals(1, Problem13.minMeetingRooms(new int[][] {{7, 10}, {2, 4}}));
	}

	@Test
	void minMeetingRooms_allOverlap() {
		assertEquals(3, Problem13.minMeetingRooms(new int[][] {{1, 5}, {2, 6}, {3, 7}}));
	}
}
