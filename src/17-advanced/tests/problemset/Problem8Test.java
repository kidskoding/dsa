import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem8Test {

	private final Problem8 sut = new Problem8();

	@Test
	void sumRegions_basic() {
		int[][] matrix = {
			{3, 0, 1, 4, 2},
			{5, 6, 3, 2, 1},
			{1, 2, 0, 1, 5},
			{4, 1, 0, 1, 7},
			{1, 0, 3, 0, 5}
		};
		int[][] q = {{2, 1, 4, 3}, {1, 1, 2, 2}, {1, 2, 2, 4}};
		assertArrayEquals(new int[] {8, 11, 12}, sut.sumRegions(matrix, q));
	}

	@Test
	void sumRegions_wholeAndSingle() {
		int[][] matrix = {{1, 2}, {3, 4}};
		int[][] q = {{0, 0, 1, 1}};
		assertArrayEquals(new int[] {10}, sut.sumRegions(matrix, q));
	}
}
