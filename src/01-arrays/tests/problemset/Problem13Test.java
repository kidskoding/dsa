import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void rotate_threeByThree_rotatesClockwise() {
		var sut = new Problem13();
		int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		assertArrayEquals(expected, sut.rotate(m));
	}

	@Test
	void rotate_oneByOne_unchanged() {
		var sut = new Problem13();
		assertArrayEquals(new int[][] {{9}}, sut.rotate(new int[][] {{9}}));
	}
}
