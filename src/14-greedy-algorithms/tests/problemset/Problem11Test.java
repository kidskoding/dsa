import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem11Test {

	@Test
	void minSpanningForestWeight_connectedGraph_returnsMstWeight() {
		var sut = new Problem11();
		int[][] edges = {{0, 1, 1}, {1, 2, 2}, {0, 2, 3}};
		assertEquals(3L, sut.minSpanningForestWeight(3, edges));
	}

	@Test
	void minSpanningForestWeight_disconnectedGraph_sumsComponents() {
		var sut = new Problem11();
		int[][] edges = {{0, 1, 4}, {2, 3, 5}};
		assertEquals(9L, sut.minSpanningForestWeight(4, edges));
	}
}
