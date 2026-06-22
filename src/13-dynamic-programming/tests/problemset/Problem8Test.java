import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem8Test {

	private final Problem8 p = new Problem8();

	@Test
	void typicalChange() {
		assertEquals(3, p.coinChange(new int[] {1, 2, 5}, 11));
	}

	@Test
	void impossibleAmountReturnsMinusOne() {
		assertEquals(-1, p.coinChange(new int[] {2}, 3));
	}

	@Test
	void zeroAmountNeedsNoCoins() {
		assertEquals(0, p.coinChange(new int[] {1, 5, 10}, 0));
	}
}
