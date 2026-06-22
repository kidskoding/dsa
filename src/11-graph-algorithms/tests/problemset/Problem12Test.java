import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	private final Problem12 sut = new Problem12();

	@Test
	void fourCities() {
		int[][] e = {{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}};
		assertEquals(3, sut.findTheCity(4, e, 4));
	}

	@Test
	void fiveCities() {
		int[][] e = {{0, 1, 2}, {0, 4, 8}, {1, 2, 3}, {1, 4, 2}, {2, 3, 1}, {3, 4, 1}};
		assertEquals(0, sut.findTheCity(5, e, 2));
	}

	@Test
	void tieBreaksToLargerLabel() {
		int[][] e = {{0, 1, 10}};
		assertEquals(1, sut.findTheCity(2, e, 5));
	}
}
