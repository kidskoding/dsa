import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem10Test {

	private final Problem10 sut = new Problem10();

	@Test
	void fivePoints() {
		int[][] p = {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
		assertEquals(20, sut.minCostConnectPoints(p));
	}

	@Test
	void threePoints() {
		int[][] p = {{3, 12}, {-2, 5}, {-4, 1}};
		assertEquals(18, sut.minCostConnectPoints(p));
	}

	@Test
	void singlePointZero() {
		int[][] p = {{0, 0}};
		assertEquals(0, sut.minCostConnectPoints(p));
	}
}
