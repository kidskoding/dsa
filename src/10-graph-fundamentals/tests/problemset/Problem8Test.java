import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem8Test {

	private final Problem8 sut = new Problem8();

	@Test
	void islands_single() {
		char[][] grid = {{'1', '1', '0'}, {'1', '1', '0'}, {'0', '0', '0'}};
		assertEquals(1, sut.numIslands(grid));
	}

	@Test
	void islands_three() {
		char[][] grid = {{'1', '0', '1'}, {'0', '0', '0'}, {'1', '0', '0'}};
		assertEquals(3, sut.numIslands(grid));
	}

	@Test
	void islands_none() {
		char[][] grid = {{'0', '0'}, {'0', '0'}};
		assertEquals(0, sut.numIslands(grid));
	}
}
