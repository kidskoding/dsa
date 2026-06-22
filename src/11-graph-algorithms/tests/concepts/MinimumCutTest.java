import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import org.junit.jupiter.api.Test;

class MinimumCutTest {

	private static WeightedGraph diamond() {
		WeightedGraph g = new WeightedGraph(4);
		g.addDirectedEdge(0, 1, 3.0);
		g.addDirectedEdge(0, 2, 2.0);
		g.addDirectedEdge(1, 3, 2.0);
		g.addDirectedEdge(2, 3, 3.0);
		return g;
	}

	@Test
	void cutCapacityEqualsMaxFlow() {
		assertEquals(4.0, new MinimumCut().minCutCapacity(diamond(), 0, 3));
	}

	@Test
	void sourceSideContainsSourceNotSink() {
		Set<Integer> side = new MinimumCut().sourceSide(diamond(), 0, 3);
		assertTrue(side.contains(0));
		assertTrue(!side.contains(3));
	}

	@Test
	void noPathYieldsZeroCut() {
		WeightedGraph g = new WeightedGraph(2);
		assertEquals(0.0, new MinimumCut().minCutCapacity(g, 0, 1));
	}
}
