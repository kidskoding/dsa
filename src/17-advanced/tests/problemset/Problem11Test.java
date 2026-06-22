import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	private final Problem11 sut = new Problem11();

	@Test
	void countInRanges_basic() {
		int[] readings = {4, 1, 7, 3, 9, 3};
		int[][] q = {{3, 7}, {0, 1}, {5, 100}};
		assertArrayEquals(new int[] {4, 1, 2}, sut.countInRanges(readings, q));
	}

	@Test
	void countInRanges_duplicates() {
		int[] readings = {5, 5, 5};
		int[][] q = {{5, 5}, {6, 10}};
		assertArrayEquals(new int[] {3, 0}, sut.countInRanges(readings, q));
	}
}
