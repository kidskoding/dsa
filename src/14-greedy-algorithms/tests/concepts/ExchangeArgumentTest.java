import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ExchangeArgumentTest {

	@Test
	void isExchangeOptimalOrder_sortedBySmithRatio_returnsTrue() {
		var sut = new ExchangeArgument();
		// ratios: 3/1=3, 4/2=2, 1/1=1 — strictly non-increasing.
		assertTrue(sut.isExchangeOptimalOrder(new double[] {3, 4, 1}, new double[] {1, 2, 1}));
	}

	@Test
	void isExchangeOptimalOrder_inversionPresent_returnsFalse() {
		var sut = new ExchangeArgument();
		// ratios: 1/1=1 then 3/1=3 — an inversion exists.
		assertFalse(sut.isExchangeOptimalOrder(new double[] {1, 3}, new double[] {1, 1}));
	}

	@Test
	void swapDoesNotWorsen_swappingTowardOptimalOrder_returnsTrue() {
		var sut = new ExchangeArgument();
		// Swapping the inverted adjacent pair (lower ratio first) should not worsen the objective.
		assertTrue(sut.swapDoesNotWorsen(new double[] {1, 3}, new double[] {1, 1}, 0));
	}

	@Test
	void swapDoesNotWorsen_breakingOptimalOrder_returnsFalse() {
		var sut = new ExchangeArgument();
		// Already optimal; swapping away from it worsens the objective.
		assertFalse(sut.swapDoesNotWorsen(new double[] {3, 1}, new double[] {1, 1}, 0));
	}
}
