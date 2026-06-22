import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem10Test {

	private final Problem10 sut = new Problem10();

	@Test
	void region_pair() {
		int[][] grid = {{1, 0, 1}, {1, 0, 0}, {0, 0, 1}};
		assertEquals(2, sut.largestRegion(grid));
	}

	@Test
	void region_noTreasure() {
		int[][] grid = {{0, 0}, {0, 0}};
		assertEquals(0, sut.largestRegion(grid));
	}

	@Test
	void region_largeConnected() {
		int[][] grid = {{1, 1, 1}, {0, 0, 1}, {1, 1, 1}};
		assertEquals(7, sut.largestRegion(grid));
	}
}
