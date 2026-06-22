import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	private final Problem11 sut = new Problem11();

	@Test
	void provinces_two() {
		int[][] m = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		assertEquals(2, sut.findCircleNum(m));
	}

	@Test
	void provinces_threeIsolated() {
		int[][] m = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
		assertEquals(3, sut.findCircleNum(m));
	}

	@Test
	void provinces_oneChained() {
		int[][] m = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
		assertEquals(1, sut.findCircleNum(m));
	}
}
