import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem9Test {

	private final Problem9 sut = new Problem9();

	@Test
	void twoWithin() {
		assertEquals(2, sut.countWithinRadius(new int[][] {{0, 0}, {3, 0}, {5, 0}}, new int[] {0, 0}, 3));
	}

	@Test
	void noneWithin() {
		assertEquals(0, sut.countWithinRadius(new int[][] {{1, 1}, {-1, -1}}, new int[] {0, 0}, 1));
	}

	@Test
	void onCircle() {
		assertEquals(1, sut.countWithinRadius(new int[][] {{2, 0}}, new int[] {0, 0}, 2));
	}
}
