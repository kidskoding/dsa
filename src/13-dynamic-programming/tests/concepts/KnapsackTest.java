import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KnapsackTest {

	private final Knapsack knapsack = new Knapsack();

	@Test
	void classicInstance() {
		int[] weights = {1, 3, 4, 5};
		int[] values = {1, 4, 5, 7};
		assertEquals(9, knapsack.maxValue(weights, values, 7));
	}

	@Test
	void takesEverythingWhenCapacityAllows() {
		int[] weights = {2, 3};
		int[] values = {3, 4};
		assertEquals(7, knapsack.maxValue(weights, values, 10));
	}

	@Test
	void zeroCapacityYieldsNothing() {
		int[] weights = {1, 2, 3};
		int[] values = {6, 10, 12};
		assertEquals(0, knapsack.maxValue(weights, values, 0));
	}

	@Test
	void noItems() {
		assertEquals(0, knapsack.maxValue(new int[0], new int[0], 10));
	}

	@Test
	void singleItemThatFits() {
		assertEquals(5, knapsack.maxValue(new int[] {4}, new int[] {5}, 4));
	}

	@Test
	void singleItemTooHeavy() {
		assertEquals(0, knapsack.maxValue(new int[] {6}, new int[] {5}, 4));
	}
}
