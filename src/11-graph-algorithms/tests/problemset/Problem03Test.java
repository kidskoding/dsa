import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.Test;

class Problem03Test {

	private final Problem03 sut = new Problem03();

	@Test
	void picksLightestCrossing() {
		WeightedGraph g = new WeightedGraph(3);
		g.addUndirectedEdge(0, 1, 5);
		g.addUndirectedEdge(1, 2, 2);
		g.addUndirectedEdge(0, 2, 9);
		Optional<WeightedGraph.Edge> e = sut.lightestCrossingEdge(g, Set.of(0, 1));
		assertTrue(e.isPresent());
		assertEquals(2.0, e.get().weight());
	}

	@Test
	void noCrossingEdgeIsEmpty() {
		WeightedGraph g = new WeightedGraph(2);
		g.addUndirectedEdge(0, 1, 5);
		assertFalse(sut.lightestCrossingEdge(g, Set.of(0, 1)).isPresent());
	}

	@Test
	void onlyCrossingEdgeChosen() {
		WeightedGraph g = new WeightedGraph(4);
		g.addUndirectedEdge(0, 1, 5);
		g.addUndirectedEdge(2, 3, 1);
		Optional<WeightedGraph.Edge> e = sut.lightestCrossingEdge(g, Set.of(0));
		assertTrue(e.isPresent());
		assertEquals(5.0, e.get().weight());
	}
}
