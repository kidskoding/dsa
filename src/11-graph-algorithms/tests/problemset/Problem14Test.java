import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	private final Problem14 sut = new Problem14();

	@Test
	void cheapRouteFits() {
		int[][] e = {{0, 1, 10}, {1, 2, 10}, {2, 5, 10}, {0, 3, 1}, {3, 4, 10}, {4, 5, 15}};
		int[] fees = {5, 1, 2, 20, 20, 3};
		assertEquals(11, sut.minCost(30, e, fees));
	}

	@Test
	void tighterBudgetCostsMore() {
		int[][] e = {{0, 1, 10}, {1, 2, 10}, {2, 5, 10}, {0, 3, 1}, {3, 4, 10}, {4, 5, 15}};
		int[] fees = {5, 1, 2, 20, 20, 3};
		assertEquals(48, sut.minCost(29, e, fees));
	}

	@Test
	void impossibleReturnsMinusOne() {
		int[][] e = {{0, 1, 10}, {1, 2, 10}, {2, 5, 10}, {0, 3, 1}, {3, 4, 10}, {4, 5, 15}};
		int[] fees = {5, 1, 2, 20, 20, 3};
		assertEquals(-1, sut.minCost(25, e, fees));
	}
}
