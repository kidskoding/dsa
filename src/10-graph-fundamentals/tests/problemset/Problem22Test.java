import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem22Test {

	private final Problem22 sut = new Problem22();

	@Test
	void path_diagonal() {
		int[][] grid = {{0, 1}, {1, 0}};
		assertEquals(2, sut.shortestPathBinaryMatrix(grid));
	}

	@Test
	void path_fourCells() {
		int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
		assertEquals(4, sut.shortestPathBinaryMatrix(grid));
	}

	@Test
	void path_blockedStart() {
		int[][] grid = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}};
		assertEquals(-1, sut.shortestPathBinaryMatrix(grid));
	}
}
