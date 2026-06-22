import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem23Test {

	private final Problem23 sut = new Problem23();

	@Test
	void fallingSquares_basic() {
		int[][] squares = {{1, 2}, {2, 3}, {6, 1}};
		assertArrayEquals(new int[] {2, 5, 5}, sut.fallingSquares(squares));
	}

	@Test
	void fallingSquares_noOverlap() {
		int[][] squares = {{100, 100}, {200, 100}};
		assertArrayEquals(new int[] {100, 100}, sut.fallingSquares(squares));
	}
}
