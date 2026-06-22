import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem18Test {

	private final Problem18 sut = new Problem18();

	@Test
	void budget_threeIslands() {
		assertEquals(3L, sut.bridgeBudget(3, new int[][] {{0, 1, 1}, {1, 2, 2}, {0, 2, 5}}));
	}

	@Test
	void budget_impossible_minusOne() {
		assertEquals(-1L, sut.bridgeBudget(4, new int[][] {{0, 1, 3}, {2, 3, 4}}));
	}

	@Test
	void budget_singleIsland_zero() {
		assertEquals(0L, sut.bridgeBudget(1, new int[][] {}));
	}
}
