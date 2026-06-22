import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem3Test {

	private final Problem3 sut = new Problem3();

	@Test
	void threePoints() {
		assertArrayEquals(new int[] {1, 1, 3, 5}, sut.boundingBox(new int[][] {{1, 2}, {3, 1}, {2, 5}}));
	}

	@Test
	void singlePoint() {
		assertArrayEquals(new int[] {4, 4, 4, 4}, sut.boundingBox(new int[][] {{4, 4}}));
	}

	@Test
	void negatives() {
		assertArrayEquals(new int[] {-2, -1, 5, 3}, sut.boundingBox(new int[][] {{-2, 3}, {5, -1}, {0, 0}}));
	}
}
