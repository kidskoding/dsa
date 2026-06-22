import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	private final Problem16 sut = new Problem16();

	@Test
	void fourPoints() {
		assertEquals(2L, sut.closestPair(new int[][] {{0, 0}, {10, 10}, {11, 11}, {3, 4}}));
	}

	@Test
	void singlePair() {
		assertEquals(2L, sut.closestPair(new int[][] {{1, 1}, {2, 2}}));
	}

	@Test
	void coincident() {
		assertEquals(0L, sut.closestPair(new int[][] {{0, 0}, {0, 0}, {100, 100}}));
	}
}
