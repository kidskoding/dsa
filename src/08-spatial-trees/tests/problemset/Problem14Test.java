import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	private final Problem14 sut = new Problem14();

	@Test
	void medianOnX() {
		assertEquals(1, sut.medianIndex(new int[][] {{3, 1}, {1, 2}, {2, 9}}, 0));
	}

	@Test
	void medianOnY() {
		assertEquals(3, sut.medianIndex(new int[][] {{0, 5}, {0, 2}, {0, 8}, {0, 4}}, 1));
	}

	@Test
	void singlePoint() {
		assertEquals(0, sut.medianIndex(new int[][] {{7, 7}}, 0));
	}
}
