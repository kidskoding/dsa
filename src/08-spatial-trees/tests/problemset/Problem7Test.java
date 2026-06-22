import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem7Test {

	private final Problem7 sut = new Problem7();

	@Test
	void threeInside() {
		assertEquals(3, sut.countInRectangle(new int[][] {{1, 1}, {5, 5}, {2, 3}, {3, 3}}, new int[] {0, 0, 3, 3}));
	}

	@Test
	void noneInside() {
		assertEquals(0, sut.countInRectangle(new int[][] {{0, 0}, {4, 4}}, new int[] {1, 1, 3, 3}));
	}

	@Test
	void duplicatesCounted() {
		assertEquals(2, sut.countInRectangle(new int[][] {{2, 2}, {2, 2}}, new int[] {2, 2, 2, 2}));
	}
}
