import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class HamiltonianPathsTest {

	@Test
	void hasHamiltonianPath_path_isTrue() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}}, false);
		assertTrue(HamiltonianPaths.hasHamiltonianPath(g));
	}

	@Test
	void hasHamiltonianPath_disconnected_isFalse() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}}, false);
		assertFalse(HamiltonianPaths.hasHamiltonianPath(g));
	}

	@Test
	void hasHamiltonianPath_singleVertex_isTrue() {
		var g = new Graph(1, false);
		assertTrue(HamiltonianPaths.hasHamiltonianPath(g));
	}

	@Test
	void hasHamiltonianCycle_triangle_isTrue() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, false);
		assertTrue(HamiltonianPaths.hasHamiltonianCycle(g));
	}

	@Test
	void findHamiltonianPath_path_visitsEveryVertex() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}}, false);
		assertEquals(3, HamiltonianPaths.findHamiltonianPath(g).size());
	}
}
