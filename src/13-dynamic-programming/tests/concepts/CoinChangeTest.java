import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CoinChangeTest {

	private final CoinChange cc = new CoinChange();

	@Test
	void minCoinsClassic() {
		assertEquals(3, cc.minCoins(new int[] {1, 2, 5}, 11));
	}

	@Test
	void minCoinsImpossible() {
		assertEquals(-1, cc.minCoins(new int[] {2}, 3));
	}

	@Test
	void minCoinsZeroAmount() {
		assertEquals(0, cc.minCoins(new int[] {1, 2, 5}, 0));
	}

	@Test
	void countCombinationsClassic() {
		assertEquals(4, cc.countCombinations(new int[] {1, 2, 3}, 4));
	}

	@Test
	void countCombinationsZeroAmountHasEmptyChoice() {
		assertEquals(1, cc.countCombinations(new int[] {1, 2, 5}, 0));
	}

	@Test
	void countCombinationsImpossible() {
		assertEquals(0, cc.countCombinations(new int[] {2}, 3));
	}
}
