import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class ArticulationPointsBridgesTest {

	@Test
	void articulationPoints_path_middleIsCut() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}}, false);
		assertEquals(List.of(1), ArticulationPointsBridges.articulationPoints(g));
	}

	@Test
	void articulationPoints_triangle_none() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, false);
		assertTrue(ArticulationPointsBridges.articulationPoints(g).isEmpty());
	}

	@Test
	void articulationPoints_emptyGraph_none() {
		var g = new Graph(3, false);
		assertTrue(ArticulationPointsBridges.articulationPoints(g).isEmpty());
	}

	@Test
	void bridges_path_everyEdgeIsBridge() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}}, false);
		assertEquals(2, ArticulationPointsBridges.bridges(g).size());
	}

	@Test
	void bridges_cycle_none() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, false);
		assertTrue(ArticulationPointsBridges.bridges(g).isEmpty());
	}
}
