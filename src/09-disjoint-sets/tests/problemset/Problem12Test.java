import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void numIslands_countsSeparateRegions() {
		var sut = new Problem12();
		char[][] grid = {
			{'1', '1', '0', '0'},
			{'1', '0', '0', '1'},
			{'0', '0', '1', '1'},
		};
		assertEquals(2, sut.numIslands(grid));
	}

	@Test
	void numIslands_allWaterIsZero() {
		var sut = new Problem12();
		char[][] grid = {{'0', '0'}, {'0', '0'}};
		assertEquals(0, sut.numIslands(grid));
	}
}
