import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem22Test {

	private final Problem22 p = new Problem22();

	@Test
	void typical() {
		assertEquals(3, p.maxProfit(new int[] {1, 2, 3, 0, 2}));
	}

	@Test
	void singleDay() {
		assertEquals(0, p.maxProfit(new int[] {1}));
	}

	@Test
	void buyLowSellHigh() {
		assertEquals(3, p.maxProfit(new int[] {2, 1, 4}));
	}
}
