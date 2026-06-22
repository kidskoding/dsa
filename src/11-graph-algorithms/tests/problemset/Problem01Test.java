import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem01Test {

	@Test
	void validWalkSumsWeights() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 2.0);
		g.addDirectedEdge(1, 2, 3.0);
		var result = new Problem01().pathWeight(g, List.of(0, 1, 2));
		assertTrue(result.isPresent());
		assertEquals(5.0, result.getAsDouble());
	}

	@Test
	void invalidWalkReportsEmpty() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 2.0);
		assertTrue(new Problem01().pathWeight(g, List.of(0, 1, 2)).isEmpty());
	}
}
