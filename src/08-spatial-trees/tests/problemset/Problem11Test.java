import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	private final Problem11 sut = new Problem11();

	@Test
	void threePoints() {
		assertEquals(2L, sut.closestPair(new int[][] {{0, 0}, {3, 4}, {1, 1}}));
	}

	@Test
	void singlePair() {
		assertEquals(1L, sut.closestPair(new int[][] {{5, 5}, {5, 6}}));
	}

	@Test
	void coincident() {
		assertEquals(0L, sut.closestPair(new int[][] {{1, 1}, {1, 1}, {9, 9}}));
	}
}
