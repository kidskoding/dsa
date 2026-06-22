import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem24Test {

	private final Problem24 sut = new Problem24();

	@Test
	void middleVertexThrottles() {
		int[][] e = {{0, 1, 10}, {1, 2, 10}};
		int[] cap = {99, 4, 99};
		assertEquals(4, sut.maxFlow(3, e, cap, 0, 2));
	}

	@Test
	void twoCappedPaths() {
		int[][] e = {{0, 1, 5}, {0, 2, 5}, {1, 3, 5}, {2, 3, 5}};
		int[] cap = {99, 3, 3, 99};
		assertEquals(6, sut.maxFlow(4, e, cap, 0, 3));
	}

	@Test
	void uncappedSingleEdge() {
		int[][] e = {{0, 1, 7}};
		int[] cap = {99, 99};
		assertEquals(7, sut.maxFlow(2, e, cap, 0, 1));
	}
}
