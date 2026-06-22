import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	@Test
	void maxSubarraySum_mixedSigns_returnsBestRun() {
		assertEquals(6L, new Problem15().maxSubarraySum(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
	}

	@Test
	void maxSubarraySum_allNegative_returnsLargestElement() {
		assertEquals(-1L, new Problem15().maxSubarraySum(new int[] {-3, -1, -7}));
	}
}
