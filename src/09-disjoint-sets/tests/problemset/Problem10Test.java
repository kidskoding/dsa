import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem10Test {

	private final Problem10 sut = new Problem10();

	@Test
	void numIslands_two() {
		char[][] grid = {
			{'1', '1', '0'},
			{'1', '0', '0'},
			{'0', '0', '1'}
		};
		assertEquals(2, sut.numIslands(grid));
	}

	@Test
	void numIslands_oneHShape() {
		char[][] grid = {
			{'1', '1', '1'},
			{'0', '1', '0'},
			{'1', '1', '1'}
		};
		assertEquals(1, sut.numIslands(grid));
	}

	@Test
	void numIslands_none() {
		char[][] grid = {
			{'0', '0'},
			{'0', '0'}
		};
		assertEquals(0, sut.numIslands(grid));
	}
}
