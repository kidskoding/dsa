import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	private final Problem16 sut = new Problem16();

	@Test
	void findMinArrowShots_twoArrows() {
		assertEquals(2, sut.findMinArrowShots(new int[][] {{10, 16}, {2, 8}, {1, 6}, {7, 12}}));
	}

	@Test
	void findMinArrowShots_noneOverlap() {
		assertEquals(4, sut.findMinArrowShots(new int[][] {{1, 2}, {3, 4}, {5, 6}, {7, 8}}));
	}

	@Test
	void findMinArrowShots_touching() {
		assertEquals(2, sut.findMinArrowShots(new int[][] {{1, 2}, {2, 3}, {3, 4}, {4, 5}}));
	}
}
