import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem6Test {

	private final Problem6 p = new Problem6();

	@Test
	void threeByThree() {
		assertEquals(13, p.minFallingPathSum(new int[][] {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}}));
	}

	@Test
	void negatives() {
		assertEquals(-59, p.minFallingPathSum(new int[][] {{-19, 57}, {-40, -5}}));
	}

	@Test
	void singleCell() {
		assertEquals(7, p.minFallingPathSum(new int[][] {{7}}));
	}
}
