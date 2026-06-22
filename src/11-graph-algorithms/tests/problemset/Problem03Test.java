import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import org.junit.jupiter.api.Test;

class Problem03Test {

	@Test
	void findsLightestCrossingEdge() {
		WeightedGraph g = new WeightedGraph(4);
		g.addUndirectedEdge(0, 1, 5.0);
		g.addUndirectedEdge(0, 2, 2.0);
		g.addUndirectedEdge(2, 3, 9.0);
		var edge = new Problem03().lightestCrossingEdge(g, Set.of(0, 1));
		assertTrue(edge.isPresent());
		assertEquals(2.0, edge.get().weight());
	}

	@Test
	void noCrossingEdgeReportsEmpty() {
		WeightedGraph g = new WeightedGraph(3);
		g.addUndirectedEdge(0, 1, 1.0);
		assertTrue(new Problem03().lightestCrossingEdge(g, Set.of(0, 1)).isEmpty());
	}
}
