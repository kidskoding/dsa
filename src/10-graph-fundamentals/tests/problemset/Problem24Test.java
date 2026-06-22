import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem24Test {

	private final Problem24 sut = new Problem24();

	@Test
	void closed_one() {
		int[][] grid = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}};
		assertEquals(1, sut.closedIsland(grid));
	}

	@Test
	void closed_none() {
		int[][] grid = {{0, 0, 1, 1}, {0, 1, 0, 1}, {1, 1, 1, 0}};
		assertEquals(0, sut.closedIsland(grid));
	}

	@Test
	void closed_ring() {
		int[][] grid = {
			{1, 1, 1, 1, 1},
			{1, 0, 0, 0, 1},
			{1, 0, 1, 0, 1},
			{1, 0, 0, 0, 1},
			{1, 1, 1, 1, 1}
		};
		assertEquals(1, sut.closedIsland(grid));
	}
}
