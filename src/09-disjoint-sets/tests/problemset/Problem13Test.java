import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void mstWeight_picksCheapestSpanningTree() {
		var sut = new Problem13();
		int[][] edges = {{0, 1, 1}, {1, 2, 2}, {0, 2, 4}};
		assertEquals(3L, sut.mstWeight(3, edges));
	}

	@Test
	void mstWeight_singleEdge() {
		var sut = new Problem13();
		assertEquals(5L, sut.mstWeight(2, new int[][] {{0, 1, 5}}));
	}
}
