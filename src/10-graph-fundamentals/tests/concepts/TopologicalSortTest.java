import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class TopologicalSortTest {

	@Test
	void order_chain_respectsEdges() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}}, true);
		assertEquals(List.of(0, 1, 2), TopologicalSort.order(g));
	}

	@Test
	void order_cyclicGraph_isEmpty() {
		var g = Representations.fromEdgeList(2, new int[][] {{0, 1}, {1, 0}}, true);
		assertTrue(TopologicalSort.order(g).isEmpty());
	}

	@Test
	void order_emptyGraph_listsAllVertices() {
		var g = new Graph(3, true);
		assertEquals(3, TopologicalSort.order(g).size());
	}

	@Test
	void isDag_acyclic_isTrue() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {0, 2}}, true);
		assertTrue(TopologicalSort.isDag(g));
	}

	@Test
	void isDag_cyclic_isFalse() {
		var g = Representations.fromEdgeList(2, new int[][] {{0, 1}, {1, 0}}, true);
		assertFalse(TopologicalSort.isDag(g));
	}
}
