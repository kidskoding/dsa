import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import java.util.OptionalDouble;

import org.junit.jupiter.api.Test;

class Problem01Test {

	private final Problem01 sut = new Problem01();

	@Test
	void sumsWalkWeight() {
		WeightedGraph g = new WeightedGraph(3);
		g.addUndirectedEdge(0, 1, 4);
		g.addUndirectedEdge(1, 2, 3);
		assertEquals(7.0, sut.pathWeight(g, List.of(0, 1, 2)).getAsDouble());
	}

	@Test
	void invalidWalkIsEmpty() {
		WeightedGraph g = new WeightedGraph(3);
		g.addUndirectedEdge(0, 1, 4);
		assertFalse(sut.pathWeight(g, List.of(0, 2)).isPresent());
	}

	@Test
	void singleVertexHasZeroWeight() {
		WeightedGraph g = new WeightedGraph(2);
		OptionalDouble r = sut.pathWeight(g, List.of(0));
		assertTrue(r.isPresent());
		assertEquals(0.0, r.getAsDouble());
	}
}
