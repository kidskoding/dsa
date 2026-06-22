import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	private final Problem11 p = new Problem11();

	@Test
	void positivePrefix() {
		assertEquals(6, p.maxProduct(new int[] {2, 3, -2, 4}));
	}

	@Test
	void zeroResets() {
		assertEquals(0, p.maxProduct(new int[] {-2, 0, -1}));
	}

	@Test
	void doubleNegativeFlips() {
		assertEquals(24, p.maxProduct(new int[] {-2, 3, -4}));
	}
}
