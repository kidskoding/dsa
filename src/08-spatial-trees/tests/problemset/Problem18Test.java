import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem18Test {

	private final Problem18 sut = new Problem18();

	@Test
	void twoClosePairs() {
		assertEquals(2L, sut.countPairsWithinDistance(new int[][] {{0, 0}, {1, 0}, {2, 0}}, 1));
	}

	@Test
	void exactDistance() {
		assertEquals(1L, sut.countPairsWithinDistance(new int[][] {{0, 0}, {3, 4}}, 5));
	}

	@Test
	void noneClose() {
		assertEquals(0L, sut.countPairsWithinDistance(new int[][] {{0, 0}, {10, 10}, {20, 20}}, 1));
	}
}
