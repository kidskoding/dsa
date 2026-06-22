import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem30Test {

	private final Problem30 p = new Problem30();

	@Test
	void typical() {
		assertEquals(167, p.maxCoins(new int[] {3, 1, 5, 8}));
	}

	@Test
	void twoBalloons() {
		assertEquals(10, p.maxCoins(new int[] {1, 5}));
	}

	@Test
	void single() {
		assertEquals(7, p.maxCoins(new int[] {7}));
	}
}
