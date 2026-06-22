import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	private final Problem15 p = new Problem15();

	@Test
	void twoTransactions() {
		assertEquals(7, p.maxProfit(new int[] {3, 2, 6, 5, 0, 3}, 2));
	}

	@Test
	void singleTransaction() {
		assertEquals(4, p.maxProfit(new int[] {2, 4, 1}, 2));
	}

	@Test
	void zeroTransactions() {
		assertEquals(0, p.maxProfit(new int[] {1, 2, 3, 4}, 0));
	}

	@Test
	void decreasingPricesYieldNoProfit() {
		assertEquals(0, p.maxProfit(new int[] {5, 4, 3, 2, 1}, 3));
	}
}
