import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem23Test {

	private final Problem23 sut = new Problem23();

	@Test
	void shipWithinDays_fiveDays() {
		assertEquals(15, sut.shipWithinDays(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
	}

	@Test
	void shipWithinDays_threeDays() {
		assertEquals(6, sut.shipWithinDays(new int[] {3, 2, 2, 4, 1, 4}, 3));
	}

	@Test
	void shipWithinDays_fourDays() {
		assertEquals(3, sut.shipWithinDays(new int[] {1, 2, 3, 1, 1}, 4));
	}
}
