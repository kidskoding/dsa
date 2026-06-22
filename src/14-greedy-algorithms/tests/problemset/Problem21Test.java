import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem21Test {

	private final Problem21 sut = new Problem21();

	@Test
	void reconstructQueue_basic() {
		int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
		int[][] expected = {{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};
		assertArrayEquals(expected, sut.reconstructQueue(people));
	}

	@Test
	void reconstructQueue_allZeroK() {
		int[][] expected = {{4, 0}, {5, 0}, {6, 0}};
		assertArrayEquals(expected, sut.reconstructQueue(new int[][] {{6, 0}, {5, 0}, {4, 0}}));
	}

	@Test
	void reconstructQueue_single() {
		assertArrayEquals(new int[][] {{1, 0}}, sut.reconstructQueue(new int[][] {{1, 0}}));
	}
}
