import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class Problem20Test {

	private final Problem20 sut = new Problem20();

	@Test
	void twoEdgeWalk() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 2);
		g.addDirectedEdge(1, 2, 3);
		g.addDirectedEdge(0, 2, 10);
		assertEquals(5.0, sut.shortestWalkWithKEdges(g, 0, 2, 2).getAsDouble());
	}

	@Test
	void oneEdgeForcesDirect() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 2);
		g.addDirectedEdge(1, 2, 3);
		g.addDirectedEdge(0, 2, 4);
		assertEquals(4.0, sut.shortestWalkWithKEdges(g, 0, 2, 1).getAsDouble());
	}

	@Test
	void noSuchWalkIsEmpty() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 2);
		assertFalse(sut.shortestWalkWithKEdges(g, 0, 2, 3).isPresent());
	}
}
