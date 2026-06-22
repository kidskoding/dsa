import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ShortestPathsDijkstraTest {

	@Test
	void linearChainDistances() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 2.0);
		g.addDirectedEdge(1, 2, 3.0);
		double[] dist = new ShortestPathsDijkstra().shortestPaths(g, 0);
		assertEquals(0.0, dist[0]);
		assertEquals(2.0, dist[1]);
		assertEquals(5.0, dist[2]);
	}

	@Test
	void prefersCheaperMultiHopPath() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 2, 10.0);
		g.addDirectedEdge(0, 1, 1.0);
		g.addDirectedEdge(1, 2, 1.0);
		double[] dist = new ShortestPathsDijkstra().shortestPaths(g, 0);
		assertEquals(2.0, dist[2]);
	}

	@Test
	void singleNodeGraph() {
		WeightedGraph g = new WeightedGraph(1);
		double[] dist = new ShortestPathsDijkstra().shortestPaths(g, 0);
		assertEquals(0.0, dist[0]);
	}

	@Test
	void disconnectedVertexIsUnreachable() {
		WeightedGraph g = new WeightedGraph(2);
		double[] dist = new ShortestPathsDijkstra().shortestPaths(g, 0);
		assertEquals(ShortestPathsDijkstra.UNREACHABLE, dist[1]);
	}
}
