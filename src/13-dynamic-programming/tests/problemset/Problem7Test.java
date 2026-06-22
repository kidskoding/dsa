import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem7Test {

	private final Problem7 p = new Problem7();

	@Test
	void threeStairs() {
		assertEquals(15, p.minCostClimbingStairs(new int[] {10, 15, 20}));
	}

	@Test
	void longStaircase() {
		assertEquals(6, p.minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
	}

	@Test
	void freeStairs() {
		assertEquals(0, p.minCostClimbingStairs(new int[] {0, 0}));
	}
}
