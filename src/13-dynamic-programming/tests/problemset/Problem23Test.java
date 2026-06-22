import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem23Test {

	private final Problem23 p = new Problem23();

	@Test
	void typical() {
		assertEquals(
				4,
				p.maximalSquare(
						new int[][] {
							{1, 0, 1, 0, 0}, {1, 0, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 0, 0, 1, 0}
						}));
	}

	@Test
	void noSquareBiggerThanOne() {
		assertEquals(1, p.maximalSquare(new int[][] {{0, 1}, {1, 0}}));
	}

	@Test
	void allZeros() {
		assertEquals(0, p.maximalSquare(new int[][] {{0}}));
	}
}
