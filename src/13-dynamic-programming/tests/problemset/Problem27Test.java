import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem27Test {

	private final Problem27 p = new Problem27();

	@Test
	void typical() {
		assertEquals(9, p.knapsack(new int[] {1, 3, 4, 5}, new int[] {1, 4, 5, 7}, 7));
	}

	@Test
	void fitsTwo() {
		assertEquals(9, p.knapsack(new int[] {2, 3, 4}, new int[] {4, 5, 6}, 5));
	}

	@Test
	void tooHeavy() {
		assertEquals(0, p.knapsack(new int[] {5}, new int[] {10}, 4));
	}
}
