import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem10Test {

	private final Problem10 sut = new Problem10();

	@Test
	void maximumUnits_basic() {
		assertEquals(8, sut.maximumUnits(new int[][] {{1, 3}, {2, 2}, {3, 1}}, 4));
	}

	@Test
	void maximumUnits_partialLastType() {
		assertEquals(91, sut.maximumUnits(new int[][] {{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10));
	}

	@Test
	void maximumUnits_roomForAll() {
		assertEquals(100, sut.maximumUnits(new int[][] {{1, 100}}, 10));
	}
}
