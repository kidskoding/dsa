import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem25Test {

	private final Problem25 sut = new Problem25();

	@Test
	void routesCheapestPaths() {
		int[][] e = {{0, 1, 3, 1}, {0, 2, 2, 2}, {1, 3, 2, 1}, {2, 3, 3, 1}, {1, 2, 1, 1}};
		assertEquals(9, sut.minCostMaxFlow(4, e, 0, 3));
	}

	@Test
	void singleRoute() {
		int[][] e = {{0, 1, 5, 2}, {1, 2, 5, 3}};
		assertEquals(25, sut.minCostMaxFlow(3, e, 0, 2));
	}

	@Test
	void avoidsCostlyDirectEdge() {
		int[][] e = {{0, 1, 4, 1}, {0, 2, 4, 5}, {1, 2, 4, 1}};
		assertEquals(8, sut.minCostMaxFlow(3, e, 0, 2));
	}
}
