import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void minCoins_usCoins_returnsFewest() {
		var sut = new Problem01();
		assertEquals(6, sut.minCoins(new int[] {1, 5, 10, 25}, 63));
	}

	@Test
	void minCoins_zeroAmount_returnsZero() {
		var sut = new Problem01();
		assertEquals(0, sut.minCoins(new int[] {1, 5, 10, 25}, 0));
	}
}
