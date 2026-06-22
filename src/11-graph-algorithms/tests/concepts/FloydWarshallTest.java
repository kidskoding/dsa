import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FloydWarshallTest {

	@Test
	void allPairsOnSmallGraph() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 1.0);
		g.addDirectedEdge(1, 2, 2.0);
		g.addDirectedEdge(0, 2, 10.0);
		double[][] dist = new FloydWarshall().allPairsShortestPaths(g);
		assertEquals(0.0, dist[0][0]);
		assertEquals(3.0, dist[0][2]);
		assertEquals(2.0, dist[1][2]);
	}

	@Test
	void unreachablePairs() {
		WeightedGraph g = new WeightedGraph(2);
		double[][] dist = new FloydWarshall().allPairsShortestPaths(g);
		assertEquals(FloydWarshall.UNREACHABLE, dist[0][1]);
	}

	@Test
	void singleNodeGraph() {
		WeightedGraph g = new WeightedGraph(1);
		double[][] dist = new FloydWarshall().allPairsShortestPaths(g);
		assertEquals(0.0, dist[0][0]);
	}

	@Test
	void detectsNegativeCycle() {
		WeightedGraph g = new WeightedGraph(2);
		g.addDirectedEdge(0, 1, 1.0);
		g.addDirectedEdge(1, 0, -3.0);
		assertTrue(new FloydWarshall().hasNegativeCycle(g));
	}
}
