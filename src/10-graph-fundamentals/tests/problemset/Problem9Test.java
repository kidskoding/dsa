import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem9Test {

	private final Problem9 sut = new Problem9();

	@Test
	void area_largestThree() {
		int[][] grid = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 0, 1, 1}};
		assertEquals(3, sut.maxAreaOfIsland(grid));
	}

	@Test
	void area_noLand() {
		int[][] grid = {{0, 0, 0}, {0, 0, 0}};
		assertEquals(0, sut.maxAreaOfIsland(grid));
	}

	@Test
	void area_wholeGrid() {
		int[][] grid = {{1, 1, 1}, {1, 1, 1}};
		assertEquals(6, sut.maxAreaOfIsland(grid));
	}
}
