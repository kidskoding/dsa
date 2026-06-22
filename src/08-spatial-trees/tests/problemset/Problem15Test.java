import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	private final Problem15 sut = new Problem15();

	@Test
	void twoOfThree() {
		assertEquals(2, sut.maxPointsInSquare(new int[][] {{0, 0}, {1, 1}, {2, 2}}, 1));
	}

	@Test
	void coincidentPair() {
		assertEquals(2, sut.maxPointsInSquare(new int[][] {{0, 0}, {0, 0}, {5, 5}}, 2));
	}

	@Test
	void spreadOut() {
		assertEquals(1, sut.maxPointsInSquare(new int[][] {{0, 0}, {3, 0}, {6, 0}}, 1));
	}
}
