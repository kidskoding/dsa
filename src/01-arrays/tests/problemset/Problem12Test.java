import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	@Test
	void maxProfit_basic() {
		var sut = new Problem12();
		assertEquals(5, sut.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
	}

	@Test
	void maxProfit_decreasing() {
		var sut = new Problem12();
		assertEquals(0, sut.maxProfit(new int[] {7, 6, 4, 3, 1}));
	}

	@Test
	void maxProfit_short() {
		var sut = new Problem12();
		assertEquals(2, sut.maxProfit(new int[] {2, 4, 1}));
	}
}
