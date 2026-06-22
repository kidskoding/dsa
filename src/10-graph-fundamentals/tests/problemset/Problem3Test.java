import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem3Test {

	private final Problem3 sut = new Problem3();

	@Test
	void within_chainDepthTwo() {
		assertArrayEquals(
			new int[] {0, 1, 2},
			sut.reachableWithin(5, new int[][] {{0, 1}, {1, 2}, {2, 3}, {3, 4}}, 0, 2));
	}

	@Test
	void within_starOneLevel() {
		assertArrayEquals(
			new int[] {0, 1, 2, 3},
			sut.reachableWithin(4, new int[][] {{0, 1}, {0, 2}, {0, 3}}, 0, 1));
	}

	@Test
	void within_isolatedSource() {
		assertArrayEquals(new int[] {1}, sut.reachableWithin(3, new int[][] {}, 1, 5));
	}
}
