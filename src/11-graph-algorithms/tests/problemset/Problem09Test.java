import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem09Test {

	private final Problem09 sut = new Problem09();

	@Test
	void effortTwo() {
		int[][] h = {{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
		assertEquals(2, sut.minimumEffortPath(h));
	}

	@Test
	void effortOne() {
		int[][] h = {{1, 2, 3}, {3, 8, 4}, {5, 3, 5}};
		assertEquals(1, sut.minimumEffortPath(h));
	}

	@Test
	void effortZero() {
		int[][] h = {{1, 1, 1}, {1, 1, 1}};
		assertEquals(0, sut.minimumEffortPath(h));
	}
}
