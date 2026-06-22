import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ShortestPathsBellmanFordTest {

	@Test
	void handlesNegativeEdges() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 4.0);
		g.addDirectedEdge(0, 2, 5.0);
		g.addDirectedEdge(1, 2, -3.0);
		double[] dist = new ShortestPathsBellmanFord().shortestPaths(g, 0);
		assertEquals(0.0, dist[0]);
		assertEquals(4.0, dist[1]);
		assertEquals(1.0, dist[2]);
	}

	@Test
	void singleNodeGraph() {
		WeightedGraph g = new WeightedGraph(1);
		double[] dist = new ShortestPathsBellmanFord().shortestPaths(g, 0);
		assertEquals(0.0, dist[0]);
	}

	@Test
	void disconnectedVertexIsUnreachable() {
		WeightedGraph g = new WeightedGraph(2);
		double[] dist = new ShortestPathsBellmanFord().shortestPaths(g, 0);
		assertEquals(ShortestPathsBellmanFord.UNREACHABLE, dist[1]);
	}

	@Test
	void detectsNegativeCycle() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 1.0);
		g.addDirectedEdge(1, 2, -3.0);
		g.addDirectedEdge(2, 0, 1.0);
		assertTrue(new ShortestPathsBellmanFord().hasNegativeCycle(g, 0));
	}
}
