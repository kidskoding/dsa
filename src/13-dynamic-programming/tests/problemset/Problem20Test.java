import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem20Test {

	private final Problem20 p = new Problem20();

	@Test
	void typical() {
		assertEquals(7, p.minPathSum(new int[][] {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
	}

	@Test
	void twoRows() {
		assertEquals(12, p.minPathSum(new int[][] {{1, 2, 3}, {4, 5, 6}}));
	}

	@Test
	void singleCell() {
		assertEquals(5, p.minPathSum(new int[][] {{5}}));
	}
}
