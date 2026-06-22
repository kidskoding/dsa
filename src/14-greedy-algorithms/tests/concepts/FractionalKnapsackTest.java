import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FractionalKnapsackTest {

	private static final double EPS = 1e-9;

	@Test
	void maxValue_classicInstance_splitsLastItem() {
		var sut = new FractionalKnapsack();
		double[] weights = {10, 20, 30};
		double[] values = {60, 100, 120};
		assertEquals(240.0, sut.maxValue(weights, values, 50), EPS);
	}

	@Test
	void maxValue_zeroCapacity_returnsZero() {
		var sut = new FractionalKnapsack();
		assertEquals(0.0, sut.maxValue(new double[] {10}, new double[] {60}, 0), EPS);
	}

	@Test
	void maxValue_capacityExceedsTotalWeight_takesEverything() {
		var sut = new FractionalKnapsack();
		assertEquals(160.0, sut.maxValue(new double[] {10, 20}, new double[] {60, 100}, 100), EPS);
	}

	@Test
	void selectionFractions_classicInstance_takesHalfOfLast() {
		var sut = new FractionalKnapsack();
		double[] weights = {10, 20, 30};
		double[] values = {60, 100, 120};
		assertArrayEquals(
				new double[] {1.0, 1.0, 2.0 / 3.0}, sut.selectionFractions(weights, values, 50), EPS);
	}
}
