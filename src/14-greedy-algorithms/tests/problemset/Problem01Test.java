import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem01Test {

	private final Problem01 sut = new Problem01();

	@Test
	void minCoins_makesSixtyThree() {
		assertEquals(6, sut.minCoins(new int[] {1, 5, 10, 25}, 63));
	}

	@Test
	void minCoins_zeroAmount() {
		assertEquals(0, sut.minCoins(new int[] {1, 5, 10, 25}, 0));
	}

	@Test
	void minCoins_singleCoinSystem() {
		assertEquals(7, sut.minCoins(new int[] {1}, 7));
	}
}
