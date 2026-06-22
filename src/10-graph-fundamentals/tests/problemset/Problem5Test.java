import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Problem5Test {

	private final Problem5 sut = new Problem5();

	private static void assertValidOrder(int vertexCount, int[][] edges, int[] order) {
		assertEquals(vertexCount, order.length);
		Map<Integer, Integer> pos = new HashMap<>();
		for (int i = 0; i < order.length; i++) {
			pos.put(order[i], i);
		}
		assertEquals(vertexCount, pos.size());
		for (int[] e : edges) {
			assertTrue(pos.get(e[0]) < pos.get(e[1]), "edge must point forward");
		}
	}

	@Test
	void topo_chain() {
		int[][] edges = {{0, 1}, {1, 2}};
		assertValidOrder(3, edges, sut.topologicalOrder(3, edges));
	}

	@Test
	void topo_cycleEmpty() {
		assertArrayEquals(new int[] {}, sut.topologicalOrder(2, new int[][] {{0, 1}, {1, 0}}));
	}

	@Test
	void topo_branching() {
		int[][] edges = {{0, 1}, {0, 2}, {3, 0}};
		assertValidOrder(4, edges, sut.topologicalOrder(4, edges));
	}
}
