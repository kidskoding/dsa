import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem1Test {

	private final Problem1 sut = new Problem1();

	@Test
	void degrees_path() {
		assertArrayEquals(new int[] {1, 2, 1}, sut.degrees(3, new int[][] {{0, 1}, {1, 2}}));
	}

	@Test
	void degrees_noEdges() {
		assertArrayEquals(new int[] {0, 0}, sut.degrees(2, new int[][] {}));
	}

	@Test
	void degrees_star() {
		assertArrayEquals(
			new int[] {3, 1, 1, 1}, sut.degrees(4, new int[][] {{0, 1}, {0, 2}, {0, 3}}));
	}
}
