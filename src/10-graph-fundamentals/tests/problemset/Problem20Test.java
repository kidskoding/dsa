import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem20Test {

	private final Problem20 sut = new Problem20();

	@Test
	void rot_spreads() {
		int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
		assertEquals(4, sut.orangesRotting(grid));
	}

	@Test
	void rot_unreachable() {
		int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
		assertEquals(-1, sut.orangesRotting(grid));
	}

	@Test
	void rot_noFresh() {
		int[][] grid = {{0, 2}};
		assertEquals(0, sut.orangesRotting(grid));
	}
}
