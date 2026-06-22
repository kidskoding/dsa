import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem22Test {

	private final Problem22 sut = new Problem22();

	@Test
	void classicMaxFlow() {
		int[][] p = {{0, 1, 3}, {0, 2, 2}, {1, 2, 1}, {1, 3, 2}, {2, 3, 3}};
		assertEquals(4, sut.maxThroughput(4, p, 0, 3));
	}

	@Test
	void seriesBottleneck() {
		int[][] p = {{0, 1, 7}, {1, 2, 4}};
		assertEquals(4, sut.maxThroughput(3, p, 0, 2));
	}

	@Test
	void parallelPipesAdd() {
		int[][] p = {{0, 1, 5}, {0, 1, 3}};
		assertEquals(8, sut.maxThroughput(2, p, 0, 1));
	}
}
