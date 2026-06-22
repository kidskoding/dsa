import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PrimsTest {

	private static WeightedGraph triangle() {
		WeightedGraph g = new WeightedGraph(3);
		g.addUndirectedEdge(0, 1, 1.0);
		g.addUndirectedEdge(1, 2, 2.0);
		g.addUndirectedEdge(0, 2, 3.0);
		return g;
	}

	@Test
	void mstWeightOfTriangle() {
		assertEquals(3.0, new Prims().minimumSpanningTreeWeight(triangle()));
	}

	@Test
	void mstHasVMinusOneEdges() {
		assertEquals(2, new Prims().minimumSpanningTree(triangle(), 0).size());
	}

	@Test
	void singleNodeHasEmptyTree() {
		WeightedGraph g = new WeightedGraph(1);
		assertEquals(0, new Prims().minimumSpanningTree(g, 0).size());
	}
}
