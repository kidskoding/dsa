import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	private final Problem15 sut = new Problem15();

	@Test
	void rangeFrequencies_basic() {
		int[] arr = {12, 33, 4, 56, 22, 2, 34, 33, 22, 12, 34, 56};
		int[][] q = {{1, 2, 4}, {0, 11, 33}, {0, 11, 22}};
		assertArrayEquals(new int[] {1, 2, 2}, sut.rangeFrequencies(arr, q));
	}

	@Test
	void rangeFrequencies_absentValue() {
		int[] arr = {7, 8, 9};
		int[][] q = {{0, 2, 5}};
		assertArrayEquals(new int[] {0}, sut.rangeFrequencies(arr, q));
	}
}
