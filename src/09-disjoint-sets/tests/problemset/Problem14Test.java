import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem14Test {

	private final Problem14 sut = new Problem14();

	@Test
	void earliest_connectsAt15() {
		assertEquals(15, sut.earliestAcq(4, new int[][] {{5, 0, 1}, {10, 1, 2}, {15, 2, 3}}));
	}

	@Test
	void earliest_neverConnects() {
		assertEquals(-1, sut.earliestAcq(4, new int[][] {{3, 0, 1}, {4, 2, 3}}));
	}

	@Test
	void earliest_unsortedLogs() {
		assertEquals(20, sut.earliestAcq(3, new int[][] {{20, 1, 2}, {5, 0, 1}}));
	}
}
