import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem21Test {

	private final Problem21 sut = new Problem21();

	@Test
	void dist_centerOne() {
		int[][] mat = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
		int[][] expected = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
		assertArrayEquals(expected, sut.updateMatrix(mat));
	}

	@Test
	void dist_bottomRow() {
		int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
		int[][] expected = {{0, 0, 0}, {0, 1, 0}, {1, 2, 1}};
		assertArrayEquals(expected, sut.updateMatrix(mat));
	}

	@Test
	void dist_corner() {
		int[][] mat = {{0, 1}, {1, 1}};
		int[][] expected = {{0, 1}, {1, 2}};
		assertArrayEquals(expected, sut.updateMatrix(mat));
	}
}
