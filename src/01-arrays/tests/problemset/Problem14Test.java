import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void rangeSums_basic() {
		var sut = new Problem14();
		assertArrayEquals(
				new long[] {-1, 5, 6},
				sut.rangeSums(new int[] {1, -2, 3, 4}, new int[][] {{0, 1}, {1, 3}, {0, 3}}));
	}

	@Test
	void rangeSums_singleDay() {
		var sut = new Problem14();
		assertArrayEquals(new long[] {5}, sut.rangeSums(new int[] {5}, new int[][] {{0, 0}}));
	}

	@Test
	void rangeSums_multiple() {
		var sut = new Problem14();
		assertArrayEquals(
				new long[] {6, 2}, sut.rangeSums(new int[] {2, 2, 2}, new int[][] {{0, 2}, {1, 1}}));
	}
}
