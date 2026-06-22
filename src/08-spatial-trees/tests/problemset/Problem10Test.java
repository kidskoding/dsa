import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem10Test {

	private final Problem10 sut = new Problem10();

	@Test
	void onePerQuadrant() {
		assertArrayEquals(new int[] {1, 1, 1, 1},
				sut.quadrantCounts(new int[][] {{1, 1}, {-1, 1}, {-1, -1}, {1, -1}}, new int[] {0, 0}));
	}

	@Test
	void allNortheast() {
		assertArrayEquals(new int[] {2, 0, 0, 0}, sut.quadrantCounts(new int[][] {{2, 3}, {4, 5}}, new int[] {0, 0}));
	}

	@Test
	void onCenterIsNortheast() {
		assertArrayEquals(new int[] {1, 0, 0, 0}, sut.quadrantCounts(new int[][] {{0, 0}}, new int[] {0, 0}));
	}
}
