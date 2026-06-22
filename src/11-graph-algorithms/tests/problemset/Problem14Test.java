import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void exactlyTwoEdgeWalk() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 2.0);
		g.addDirectedEdge(1, 2, 3.0);
		g.addDirectedEdge(0, 2, 1.0);
		var result = new Problem14().shortestWalkWithKEdges(g, 0, 2, 2);
		assertTrue(result.isPresent());
		assertEquals(5.0, result.getAsDouble());
	}

	@Test
	void noWalkOfGivenLength() {
		WeightedGraph g = new WeightedGraph(2);
		g.addDirectedEdge(0, 1, 1.0);
		assertTrue(new Problem14().shortestWalkWithKEdges(g, 0, 1, 3).isEmpty());
	}
}
