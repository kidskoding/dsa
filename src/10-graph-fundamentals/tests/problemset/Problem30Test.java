import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem30Test {

	private final Problem30 sut = new Problem30();

	@Test
	void mht_starCenter() {
		assertArrayEquals(
			new int[] {1}, sut.findMinHeightTrees(4, new int[][] {{1, 0}, {1, 2}, {1, 3}}));
	}

	@Test
	void mht_twoCentroids() {
		int[][] edges = {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};
		assertArrayEquals(new int[] {3, 4}, sut.findMinHeightTrees(6, edges));
	}

	@Test
	void mht_singleVertex() {
		assertArrayEquals(new int[] {0}, sut.findMinHeightTrees(1, new int[][] {}));
	}
}
