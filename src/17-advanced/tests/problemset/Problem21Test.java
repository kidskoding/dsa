import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem21Test {

	private final Problem21 sut = new Problem21();

	@Test
	void maxOverlaps_basic() {
		int[][] bookings = {{10, 20}, {50, 60}, {10, 40}, {5, 15}, {5, 10}, {25, 55}};
		assertArrayEquals(new int[] {1, 1, 2, 3, 3, 3}, sut.maxOverlaps(bookings));
	}

	@Test
	void maxOverlaps_halfOpenNoTouch() {
		int[][] bookings = {{0, 10}, {10, 20}};
		assertArrayEquals(new int[] {1, 1}, sut.maxOverlaps(bookings));
	}
}
