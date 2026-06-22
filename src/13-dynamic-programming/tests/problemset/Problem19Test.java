import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem19Test {

	private final Problem19 p = new Problem19();

	@Test
	void obstacleInMiddle() {
		assertEquals(2, p.uniquePathsWithObstacles(new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
	}

	@Test
	void singlePath() {
		assertEquals(1, p.uniquePathsWithObstacles(new int[][] {{0, 1}, {0, 0}}));
	}

	@Test
	void blockedStart() {
		assertEquals(0, p.uniquePathsWithObstacles(new int[][] {{1}}));
	}
}
