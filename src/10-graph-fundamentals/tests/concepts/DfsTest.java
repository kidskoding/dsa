import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class DfsTest {

	@Test
	void traversalOrder_startsAtSource() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}}, false);
		List<Integer> order = Dfs.traversalOrder(g, 0);
		assertEquals(0, order.get(0));
		assertEquals(3, order.size());
	}

	@Test
	void traversalOrder_singleVertex_returnsThatVertex() {
		var g = new Graph(1, true);
		assertEquals(List.of(0), Dfs.traversalOrder(g, 0));
	}

	@Test
	void isReachable_connectedPair_isTrue() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}}, true);
		assertTrue(Dfs.isReachable(g, 0, 2));
	}

	@Test
	void isReachable_disconnected_isFalse() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}}, true);
		assertFalse(Dfs.isReachable(g, 0, 2));
	}

	@Test
	void discoveryTimes_sourceDiscoveredFirst() {
		var g = Representations.fromEdgeList(2, new int[][] {{0, 1}}, false);
		int[] disc = Dfs.discoveryTimes(g);
		assertTrue(disc[0] < disc[1]);
	}

	@Test
	void hasCycleUndirected_triangle_isTrue() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, false);
		assertTrue(Dfs.hasCycleUndirected(g));
	}

	@Test
	void hasCycleUndirected_tree_isFalse() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}}, false);
		assertFalse(Dfs.hasCycleUndirected(g));
	}
}
