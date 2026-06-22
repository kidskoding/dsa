import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void minRefuelStops_classicInstance_returnsTwo() {
		var sut = new Problem13();
		int[][] stations = {{10, 60}, {20, 30}, {30, 30}, {60, 40}};
		assertEquals(2, sut.minRefuelStops(100, 10, stations));
	}

	@Test
	void minRefuelStops_enoughStartFuel_returnsZero() {
		var sut = new Problem13();
		assertEquals(0, sut.minRefuelStops(50, 100, new int[][] {}));
	}

	@Test
	void minRefuelStops_unreachable_returnsMinusOne() {
		var sut = new Problem13();
		assertEquals(-1, sut.minRefuelStops(100, 1, new int[][] {{10, 100}}));
	}
}
