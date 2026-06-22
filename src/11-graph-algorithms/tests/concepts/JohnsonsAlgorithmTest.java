import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JohnsonsAlgorithmTest {

	@Test
	void allPairsWithNegativeEdges() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 4.0);
		g.addDirectedEdge(1, 2, -2.0);
		g.addDirectedEdge(0, 2, 5.0);
		double[][] dist = new JohnsonsAlgorithm().allPairsShortestPaths(g);
		assertEquals(0.0, dist[0][0]);
		assertEquals(2.0, dist[0][2]);
		assertEquals(-2.0, dist[1][2]);
	}

	@Test
	void unreachablePairs() {
		WeightedGraph g = new WeightedGraph(2);
		double[][] dist = new JohnsonsAlgorithm().allPairsShortestPaths(g);
		assertEquals(JohnsonsAlgorithm.UNREACHABLE, dist[0][1]);
	}

	@Test
	void singleNodeGraph() {
		WeightedGraph g = new WeightedGraph(1);
		double[][] dist = new JohnsonsAlgorithm().allPairsShortestPaths(g);
		assertEquals(0.0, dist[0][0]);
	}
}
