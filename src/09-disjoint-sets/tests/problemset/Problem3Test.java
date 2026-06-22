import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem3Test {

	private final Problem3 sut = new Problem3();

	@Test
	void findRedundant_triangle() {
		assertArrayEquals(new int[] {2, 3}, sut.findRedundantConnection(new int[][] {{1, 2}, {1, 3}, {2, 3}}));
	}

	@Test
	void findRedundant_square() {
		assertArrayEquals(
			new int[] {1, 4},
			sut.findRedundantConnection(new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}}));
	}

	@Test
	void findRedundant_lastEdge() {
		assertArrayEquals(new int[] {1, 3}, sut.findRedundantConnection(new int[][] {{1, 2}, {2, 3}, {1, 3}}));
	}
}
