import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BipartiteGraphsMatchingTest {

	@Test
	void isBipartite_evenCycle_isTrue() {
		var g = Representations.fromEdgeList(4, new int[][] {{0, 1}, {1, 2}, {2, 3}, {3, 0}}, false);
		assertTrue(BipartiteGraphsMatching.isBipartite(g));
	}

	@Test
	void isBipartite_oddCycle_isFalse() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, false);
		assertFalse(BipartiteGraphsMatching.isBipartite(g));
	}

	@Test
	void isBipartite_emptyGraph_isTrue() {
		var g = new Graph(3, false);
		assertTrue(BipartiteGraphsMatching.isBipartite(g));
	}

	@Test
	void twoColoring_oddCycle_isEmpty() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, false);
		assertEquals(0, BipartiteGraphsMatching.twoColoring(g).length);
	}

	@Test
	void maximumMatching_singleEdge_isOne() {
		var g = Representations.fromEdgeList(2, new int[][] {{0, 1}}, false);
		int matched = BipartiteGraphsMatching.maximumMatching(g, new boolean[] {true, false});
		assertEquals(1, matched);
	}

	@Test
	void partitionClasses_bipartite_hasTwoClasses() {
		var g = Representations.fromEdgeList(2, new int[][] {{0, 1}}, false);
		assertEquals(2, BipartiteGraphsMatching.partitionClasses(g).size());
	}
}
