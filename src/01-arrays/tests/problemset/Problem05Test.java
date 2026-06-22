import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void maxSubarraySum_mixedSigns_returnsBestWindow() {
		var sut = new Problem05();
		assertEquals(6, sut.maxSubarraySum(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
	}

	@Test
	void maxSubarraySum_allNegative_returnsLargestElement() {
		var sut = new Problem05();
		assertEquals(-1, sut.maxSubarraySum(new int[] {-3, -1, -2}));
	}
}
