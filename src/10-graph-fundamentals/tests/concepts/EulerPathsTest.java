import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class EulerPathsTest {

	@Test
	void hasEulerCircuit_triangle_isTrue() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, false);
		assertTrue(EulerPaths.hasEulerCircuit(g));
	}

	@Test
	void hasEulerCircuit_path_isFalse() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}}, false);
		assertFalse(EulerPaths.hasEulerCircuit(g));
	}

	@Test
	void hasEulerPath_twoOddVertices_isTrue() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}}, false);
		assertTrue(EulerPaths.hasEulerPath(g));
	}

	@Test
	void eulerCircuit_triangle_visitsAllEdges() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, false);
		// A circuit over 3 edges yields a sequence of 4 vertices (closed trail).
		assertEquals(4, EulerPaths.eulerCircuit(g).size());
	}

	@Test
	void eulerCircuit_noCircuit_isEmpty() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}}, false);
		assertTrue(EulerPaths.eulerCircuit(g).isEmpty());
	}
}
