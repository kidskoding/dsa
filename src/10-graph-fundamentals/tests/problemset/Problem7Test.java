import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem7Test {

	private final Problem7 sut = new Problem7();

	@Test
	void fill_centerSpread() {
		int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		int[][] expected = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
		assertArrayEquals(expected, sut.floodFill(image, 1, 1, 2));
	}

	@Test
	void fill_wholeImage() {
		int[][] image = {{0, 0, 0}, {0, 0, 0}};
		int[][] expected = {{5, 5, 5}, {5, 5, 5}};
		assertArrayEquals(expected, sut.floodFill(image, 0, 0, 5));
	}

	@Test
	void fill_noOpSameColor() {
		int[][] image = {{0, 0, 0}, {0, 1, 0}};
		int[][] expected = {{0, 0, 0}, {0, 1, 0}};
		assertArrayEquals(expected, sut.floodFill(image, 1, 1, 1));
	}
}
