import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	private final Problem15 sut = new Problem15();

	@Test
	void reachableDestination() {
		int[][] m = {{0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 1, 0}, {1, 1, 0, 1, 1}, {0, 0, 0, 0, 0}};
		assertEquals(12, sut.shortestDistance(m, new int[]{0, 4}, new int[]{4, 4}));
	}

	@Test
	void cannotStopThere() {
		int[][] m = {{0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 1, 0}, {1, 1, 0, 1, 1}, {0, 0, 0, 0, 0}};
		assertEquals(-1, sut.shortestDistance(m, new int[]{0, 4}, new int[]{3, 2}));
	}

	@Test
	void tinyCorner() {
		int[][] m = {{0, 0}, {0, 0}};
		assertEquals(2, sut.shortestDistance(m, new int[]{0, 0}, new int[]{1, 1}));
	}
}
