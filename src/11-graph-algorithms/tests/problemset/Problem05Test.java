import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void validSpanningTreeWeight() {
		List<WeightedGraph.Edge> tree =
				List.of(new WeightedGraph.Edge(0, 1, 2.0), new WeightedGraph.Edge(1, 2, 3.0));
		var result = new Problem05().spanningTreeWeight(3, tree);
		assertTrue(result.isPresent());
		assertEquals(5.0, result.getAsDouble());
	}

	@Test
	void incompleteTreeIsInvalid() {
		List<WeightedGraph.Edge> tree = List.of(new WeightedGraph.Edge(0, 1, 2.0));
		assertTrue(new Problem05().spanningTreeWeight(3, tree).isEmpty());
	}
}
