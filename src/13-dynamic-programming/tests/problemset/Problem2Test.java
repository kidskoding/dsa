import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem2Test {

	private final Problem2 p = new Problem2();

	@Test
	void mixedSigns() {
		assertEquals(6, p.maxSubarraySum(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
	}

	@Test
	void singleElement() {
		assertEquals(1, p.maxSubarraySum(new int[] {1}));
	}

	@Test
	void allNegativePicksLargest() {
		assertEquals(-1, p.maxSubarraySum(new int[] {-5, -1, -8}));
	}
}
