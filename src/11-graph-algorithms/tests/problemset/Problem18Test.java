import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem18Test {

	private final Problem18 sut = new Problem18();

	@Test
	void boostsOneLane() {
		int[][] l = {{0, 1, 10}, {1, 2, 10}};
		boolean[] b = {false, true};
		assertEquals(15L, sut.minFuel(3, l, b, 0, 2));
	}

	@Test
	void boostsDirectLane() {
		int[][] l = {{0, 1, 4}, {1, 2, 4}, {0, 2, 10}};
		boolean[] b = {false, false, true};
		assertEquals(5L, sut.minFuel(3, l, b, 0, 2));
	}

	@Test
	void unreachableReturnsMinusOne() {
		int[][] l = {};
		boolean[] b = {};
		assertEquals(-1L, sut.minFuel(2, l, b, 0, 1));
	}
}
