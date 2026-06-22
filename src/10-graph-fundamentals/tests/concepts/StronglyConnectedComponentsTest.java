import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StronglyConnectedComponentsTest {

	@Test
	void count_singleCycle_isOne() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, true);
		assertEquals(1, StronglyConnectedComponents.count(g));
	}

	@Test
	void count_dag_eachVertexOwnComponent() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}}, true);
		assertEquals(3, StronglyConnectedComponents.count(g));
	}

	@Test
	void count_emptyGraph_equalsVertexCount() {
		var g = new Graph(4, true);
		assertEquals(4, StronglyConnectedComponents.count(g));
	}

	@Test
	void componentIds_cycleMembers_shareId() {
		var g = Representations.fromEdgeList(2, new int[][] {{0, 1}, {1, 0}}, true);
		int[] ids = StronglyConnectedComponents.componentIds(g);
		assertEquals(ids[0], ids[1]);
	}

	@Test
	void components_countMatchesGroups() {
		var g = Representations.fromEdgeList(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, true);
		assertEquals(1, StronglyConnectedComponents.components(g).size());
	}
}
