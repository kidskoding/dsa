import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem22Test {

	private final Problem22 sut = new Problem22();

	@Test
	void minRefuelStops_twoStops() {
		int[][] stations = {{10, 60}, {20, 30}, {30, 30}, {60, 40}};
		assertEquals(2, sut.minRefuelStops(100, 10, stations));
	}

	@Test
	void minRefuelStops_noStopsNeeded() {
		assertEquals(0, sut.minRefuelStops(1, 1, new int[][] {}));
	}

	@Test
	void minRefuelStops_impossible() {
		assertEquals(-1, sut.minRefuelStops(100, 1, new int[][] {{10, 100}}));
	}
}
