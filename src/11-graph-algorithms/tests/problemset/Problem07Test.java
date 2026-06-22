import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem07Test {

	private final Problem07 sut = new Problem07();

	@Test
	void reachesAllNodes() {
		int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
		assertEquals(2, sut.networkDelayTime(times, 4, 2));
	}

	@Test
	void singleEdge() {
		int[][] times = {{1, 2, 1}};
		assertEquals(1, sut.networkDelayTime(times, 2, 1));
	}

	@Test
	void unreachableReturnsMinusOne() {
		int[][] times = {{1, 2, 1}};
		assertEquals(-1, sut.networkDelayTime(times, 2, 2));
	}
}
