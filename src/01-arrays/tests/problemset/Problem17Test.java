import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem17Test {

	@Test
	void rotate_twoByTwo() {
		var sut = new Problem17();
		assertArrayEquals(
				new int[][] {{3, 1}, {4, 2}}, sut.rotate(new int[][] {{1, 2}, {3, 4}}));
	}

	@Test
	void rotate_threeByThree() {
		var sut = new Problem17();
		assertArrayEquals(
				new int[][] {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}},
				sut.rotate(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
	}

	@Test
	void rotate_single() {
		var sut = new Problem17();
		assertArrayEquals(new int[][] {{1}}, sut.rotate(new int[][] {{1}}));
	}
}
