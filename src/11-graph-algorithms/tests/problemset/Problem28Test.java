import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem28Test {

	private final Problem28 sut = new Problem28();

	@Test
	void fourWays() {
		int[][] r = {{0, 6, 7}, {0, 1, 2}, {1, 2, 3}, {1, 3, 3}, {6, 3, 3}, {3, 5, 1}, {6, 5, 1}, {2, 5, 1}, {0, 4, 5}, {4, 6, 2}};
		assertEquals(4, sut.countPaths(7, r));
	}

	@Test
	void singleRoad() {
		int[][] r = {{0, 1, 1}};
		assertEquals(1, sut.countPaths(2, r));
	}

	@Test
	void twoShortestPaths() {
		int[][] r = {{0, 1, 1}, {1, 2, 1}, {0, 2, 2}};
		assertEquals(2, sut.countPaths(3, r));
	}
}
