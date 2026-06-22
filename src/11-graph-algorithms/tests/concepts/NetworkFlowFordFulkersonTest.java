import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NetworkFlowFordFulkersonTest {

	@Test
	void diamondMaxFlow() {
		WeightedGraph g = new WeightedGraph(4);
		g.addDirectedEdge(0, 1, 3.0);
		g.addDirectedEdge(0, 2, 2.0);
		g.addDirectedEdge(1, 3, 2.0);
		g.addDirectedEdge(2, 3, 3.0);
		assertEquals(4.0, new NetworkFlowFordFulkerson().maxFlow(g, 0, 3));
	}

	@Test
	void singleEdgeBottleneck() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 5.0);
		g.addDirectedEdge(1, 2, 2.0);
		assertEquals(2.0, new NetworkFlowFordFulkerson().maxFlow(g, 0, 2));
	}

	@Test
	void noPathYieldsZeroFlow() {
		WeightedGraph g = new WeightedGraph(2);
		assertEquals(0.0, new NetworkFlowFordFulkerson().maxFlow(g, 0, 1));
	}
}
