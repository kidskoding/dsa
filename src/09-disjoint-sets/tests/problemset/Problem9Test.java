import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem9Test {

	private final Problem9 sut = new Problem9();

	@Test
	void makeConnected_oneRedundant_movesOne() {
		assertEquals(1, sut.makeConnected(4, new int[][] {{0, 1}, {0, 2}, {1, 2}}));
	}

	@Test
	void makeConnected_twoRedundant_movesTwo() {
		assertEquals(
			2, sut.makeConnected(6, new int[][] {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}}));
	}

	@Test
	void makeConnected_tooFewCables_minusOne() {
		assertEquals(-1, sut.makeConnected(6, new int[][] {{0, 1}, {0, 2}, {0, 3}, {1, 2}}));
	}
}
