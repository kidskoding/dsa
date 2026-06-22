import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	private final Problem11 sut = new Problem11();

	@Test
	void oneStopLimit() {
		int[][] f = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
		assertEquals(700, sut.findCheapestPrice(4, f, 0, 3, 1));
	}

	@Test
	void cheaperWithStop() {
		int[][] f = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
		assertEquals(200, sut.findCheapestPrice(3, f, 0, 2, 1));
	}

	@Test
	void noStopsForcesDirect() {
		int[][] f = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
		assertEquals(500, sut.findCheapestPrice(3, f, 0, 2, 0));
	}
}
