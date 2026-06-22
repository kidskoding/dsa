import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void returnsVerticesWithinBudget() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 2.0);
		g.addDirectedEdge(1, 2, 5.0);
		assertEquals(Set.of(0, 1), new Problem02().reachableWithin(g, 0, 3.0));
	}

	@Test
	void sourceAlwaysIncluded() {
		WeightedGraph g = new WeightedGraph(2);
		assertEquals(Set.of(0), new Problem02().reachableWithin(g, 0, 0.0));
	}
}
