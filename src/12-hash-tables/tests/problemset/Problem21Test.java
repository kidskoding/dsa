import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem21Test {

	@Test
	void zeroSum_shortRange() {
		var sut = new Problem21();
		assertEquals(2, sut.longestZeroSum(new int[] {3, -3, 1, 1, -2}));
	}

	@Test
	void zeroSum_wholeArray() {
		var sut = new Problem21();
		assertEquals(5, sut.longestZeroSum(new int[] {1, 2, -3, 3, -3}));
	}

	@Test
	void zeroSum_none() {
		var sut = new Problem21();
		assertEquals(0, sut.longestZeroSum(new int[] {1, 2, 3}));
	}
}
