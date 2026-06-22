import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem03Test {

	private final Problem03 sut = new Problem03();

	@Test
	void maxNonOverlapping_keepsThree() {
		assertEquals(3, sut.maxNonOverlapping(new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
	}

	@Test
	void maxNonOverlapping_allCoincide() {
		assertEquals(1, sut.maxNonOverlapping(new int[][] {{1, 2}, {1, 2}, {1, 2}}));
	}

	@Test
	void maxNonOverlapping_touchingKept() {
		assertEquals(2, sut.maxNonOverlapping(new int[][] {{1, 2}, {2, 3}}));
	}
}
