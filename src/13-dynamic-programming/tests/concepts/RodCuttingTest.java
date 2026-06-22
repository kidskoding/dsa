import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RodCuttingTest {

	private final RodCutting rc = new RodCutting();

	@Test
	void classicInstance() {
		// CLRS price table for lengths 1..8.
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};
		assertEquals(22, rc.maxRevenue(prices, 5));
	}

	@Test
	void fullLengthIsBest() {
		int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};
		assertEquals(25, rc.maxRevenue(prices, 8));
	}

	@Test
	void zeroLengthYieldsNothing() {
		int[] prices = {1, 5, 8};
		assertEquals(0, rc.maxRevenue(prices, 0));
	}

	@Test
	void lengthOne() {
		int[] prices = {3, 5, 8};
		assertEquals(3, rc.maxRevenue(prices, 1));
	}

	@Test
	void manySmallCutsBeatOneBigPiece() {
		int[] prices = {5, 1, 1};
		assertEquals(15, rc.maxRevenue(prices, 3));
	}
}
