import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KruskalsTest {

	@Test
	void mstWeightOfTriangle() {
		WeightedGraph g = new WeightedGraph(3);
		g.addUndirectedEdge(0, 1, 1.0);
		g.addUndirectedEdge(1, 2, 2.0);
		g.addUndirectedEdge(0, 2, 3.0);
		assertEquals(3.0, new Kruskals().minimumSpanningTreeWeight(g));
	}

	@Test
	void disconnectedGraphFormsForest() {
		WeightedGraph g = new WeightedGraph(4);
		g.addUndirectedEdge(0, 1, 1.0);
		g.addUndirectedEdge(2, 3, 2.0);
		// Forest has V - (#components) = 4 - 2 = 2 edges.
		assertEquals(2, new Kruskals().minimumSpanningTree(g).size());
	}

	@Test
	void singleNodeHasEmptyTree() {
		WeightedGraph g = new WeightedGraph(1);
		assertEquals(0, new Kruskals().minimumSpanningTree(g).size());
	}
}
