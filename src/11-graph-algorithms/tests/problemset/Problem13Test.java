import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	private final Problem13 sut = new Problem13();

	@Test
	void smallGrid() {
		int[][] g = {{0, 2}, {1, 3}};
		assertEquals(3, sut.swimInWater(g));
	}

	@Test
	void spiralGrid() {
		int[][] g = {{0, 1, 2, 3, 4}, {24, 23, 22, 21, 5}, {12, 13, 14, 15, 16}, {11, 17, 18, 19, 20}, {10, 9, 8, 7, 6}};
		assertEquals(16, sut.swimInWater(g));
	}

	@Test
	void cornerElevation() {
		int[][] g = {{0, 1}, {2, 3}};
		assertEquals(3, sut.swimInWater(g));
	}
}
