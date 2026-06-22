import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class BfsTest {

	private static Graph line() {
		return Representations.fromEdgeList(4, new int[][] {{0, 1}, {1, 2}, {2, 3}}, false);
	}

	@Test
	void distances_alongLine_increaseByOne() {
		assertArrayEquals(new int[] {0, 1, 2, 3}, Bfs.distances(line(), 0));
	}

	@Test
	void distances_singleVertex_isZero() {
		var g = new Graph(1, false);
		assertArrayEquals(new int[] {0}, Bfs.distances(g, 0));
	}

	@Test
	void distances_disconnected_markUnreachableAsMinusOne() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}}, false);
		assertArrayEquals(new int[] {0, 1, -1}, Bfs.distances(g, 0));
	}

	@Test
	void traversalOrder_startsAtSource() {
		List<Integer> order = Bfs.traversalOrder(line(), 0);
		assertEquals(0, order.get(0));
		assertEquals(4, order.size());
	}

	@Test
	void shortestPath_reachable_returnsEndpoints() {
		List<Integer> path = Bfs.shortestPath(line(), 0, 3);
		assertEquals(0, path.get(0));
		assertEquals(3, path.get(path.size() - 1));
	}

	@Test
	void shortestPath_unreachable_isEmpty() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}}, false);
		assertTrue(Bfs.shortestPath(g, 0, 2).isEmpty());
	}
}
