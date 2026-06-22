import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem01Test {

	private final Problem01 p = new Problem01();

	@Test
	void mixedSigns() {
		assertEquals(6, p.maxSubarraySum(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
	}

	@Test
	void singleElement() {
		assertEquals(-3, p.maxSubarraySum(new int[] {-3}));
	}

	@Test
	void allNegativePicksLargest() {
		assertEquals(-1, p.maxSubarraySum(new int[] {-5, -1, -8}));
	}

	@Test
	void allPositiveTakesEverything() {
		assertEquals(10, p.maxSubarraySum(new int[] {1, 2, 3, 4}));
	}
}
