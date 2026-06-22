import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Problem18Test {

	private final Problem18 sut = new Problem18();

	private static void assertValidOrder(int numCourses, int[][] prereqs, int[] order) {
		assertEquals(numCourses, order.length);
		Map<Integer, Integer> pos = new HashMap<>();
		for (int i = 0; i < order.length; i++) {
			pos.put(order[i], i);
		}
		assertEquals(numCourses, pos.size());
		for (int[] p : prereqs) {
			assertTrue(pos.get(p[1]) < pos.get(p[0]), "prereq must come first");
		}
	}

	@Test
	void order_single() {
		int[][] prereqs = {{1, 0}};
		assertValidOrder(2, prereqs, sut.findOrder(2, prereqs));
	}

	@Test
	void order_diamond() {
		int[][] prereqs = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
		assertValidOrder(4, prereqs, sut.findOrder(4, prereqs));
	}

	@Test
	void order_cycleEmpty() {
		assertArrayEquals(new int[] {}, sut.findOrder(2, new int[][] {{0, 1}, {1, 0}}));
	}
}
