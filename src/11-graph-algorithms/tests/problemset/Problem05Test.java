import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.List;

import org.junit.jupiter.api.Test;

class Problem05Test {

	private final Problem05 sut = new Problem05();

	@Test
	void validTreeReturnsWeight() {
		List<WeightedGraph.Edge> t = List.of(new WeightedGraph.Edge(0, 1, 4), new WeightedGraph.Edge(1, 2, 3));
		assertEquals(7.0, sut.spanningTreeWeight(3, t).getAsDouble());
	}

	@Test
	void cycleIsInvalid() {
		List<WeightedGraph.Edge> t = List.of(new WeightedGraph.Edge(0, 1, 4), new WeightedGraph.Edge(1, 2, 3), new WeightedGraph.Edge(0, 2, 1));
		assertFalse(sut.spanningTreeWeight(3, t).isPresent());
	}

	@Test
	void disconnectedIsInvalid() {
		List<WeightedGraph.Edge> t = List.of(new WeightedGraph.Edge(0, 1, 1), new WeightedGraph.Edge(2, 3, 1));
		assertFalse(sut.spanningTreeWeight(4, t).isPresent());
	}
}
