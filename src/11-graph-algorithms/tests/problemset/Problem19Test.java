import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem19Test {

	private final Problem19 sut = new Problem19();

	@Test
	void rebateShortcut() {
		int[][] r = {{0, 1, 4}, {1, 2, -2}, {0, 2, 5}};
		assertArrayEquals(new int[]{0, 4, 2}, sut.cheapestTolls(3, r));
	}

	@Test
	void unreachableStaysMax() {
		int[][] r = {{0, 1, 1}};
		assertArrayEquals(new int[]{0, 1, Integer.MAX_VALUE}, sut.cheapestTolls(3, r));
	}

	@Test
	void negativeEdge() {
		int[][] r = {{0, 1, -3}};
		assertArrayEquals(new int[]{0, -3}, sut.cheapestTolls(2, r));
	}
}
