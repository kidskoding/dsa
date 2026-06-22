import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem06Test {

	private final Problem06 p = new Problem06();

	@Test
	void classicInstance() {
		int[][] grid = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
		assertEquals(13, p.minFallingPathSum(grid));
	}

	@Test
	void singleCell() {
		assertEquals(7, p.minFallingPathSum(new int[][] {{7}}));
	}

	@Test
	void handlesNegatives() {
		int[][] grid = {{-19, 57}, {-40, -5}};
		assertEquals(-59, p.minFallingPathSum(grid));
	}
}
