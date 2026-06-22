import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem26Test {

	private final Problem26 sut = new Problem26();

	@Test
	void flow_ridge() {
		int[][] heights = {
			{1, 2, 2, 3, 5},
			{3, 2, 3, 4, 4},
			{2, 4, 5, 3, 1},
			{6, 7, 1, 4, 5},
			{5, 1, 1, 2, 4}
		};
		int[][] expected = {
			{0, 4}, {1, 3}, {1, 4}, {2, 2}, {3, 0}, {3, 1}, {4, 0}
		};
		assertArrayEquals(expected, sut.pacificAtlantic(heights));
	}

	@Test
	void flow_singleCell() {
		assertArrayEquals(new int[][] {{0, 0}}, sut.pacificAtlantic(new int[][] {{1}}));
	}

	@Test
	void flow_allBorder() {
		int[][] heights = {{2, 1}, {1, 2}};
		int[][] expected = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};
		assertArrayEquals(expected, sut.pacificAtlantic(heights));
	}
}
