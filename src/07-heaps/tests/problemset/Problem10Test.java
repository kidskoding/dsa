import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem10Test {

	@Test
	void add_reportsKthLargestEachStep() {
		Problem10 tracker = new Problem10(3, new int[] {4, 5, 8, 2});
		assertEquals(4, tracker.add(3));
		assertEquals(5, tracker.add(5));
		assertEquals(5, tracker.add(10));
		assertEquals(8, tracker.add(9));
		assertEquals(8, tracker.add(4));
	}

	@Test
	void add_kOneIsRunningMax() {
		Problem10 tracker = new Problem10(1, new int[] {});
		assertEquals(-3, tracker.add(-3));
		assertEquals(-2, tracker.add(-2));
		assertEquals(-2, tracker.add(-4));
	}
}
