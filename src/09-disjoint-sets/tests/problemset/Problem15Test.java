import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	private final Problem15 sut = new Problem15();

	@Test
	void removable_triangle() {
		assertArrayEquals(new int[] {3, 1}, sut.findRemovableLane(new int[][] {{1, 2}, {2, 3}, {3, 1}}));
	}

	@Test
	void removable_innerEdge() {
		assertArrayEquals(
			new int[] {2, 3}, sut.findRemovableLane(new int[][] {{1, 2}, {1, 3}, {2, 3}, {3, 4}}));
	}

	@Test
	void removable_lastClosingEdge() {
		assertArrayEquals(
			new int[] {1, 2}, sut.findRemovableLane(new int[][] {{1, 4}, {2, 4}, {3, 4}, {1, 2}}));
	}
}
