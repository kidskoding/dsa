import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem5Test {

	@Test
	void maxSubarray_mixedSigns() {
		var sut = new Problem5();
		assertEquals(6, sut.maxSubarray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
	}

	@Test
	void maxSubarray_allNegative() {
		var sut = new Problem5();
		assertEquals(-1, sut.maxSubarray(new int[] {-3, -1, -2}));
	}

	@Test
	void maxSubarray_allPositive() {
		var sut = new Problem5();
		assertEquals(23, sut.maxSubarray(new int[] {5, 4, -1, 7, 8}));
	}
}
