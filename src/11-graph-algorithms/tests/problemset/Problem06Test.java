import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.List;

import org.junit.jupiter.api.Test;

class Problem06Test {

	private final Problem06 sut = new Problem06();

	@Test
	void minCapacityAlongPath() {
		WeightedGraph g = new WeightedGraph(4);
		g.addUndirectedEdge(0, 1, 5);
		g.addUndirectedEdge(1, 2, 3);
		g.addUndirectedEdge(2, 3, 8);
		assertEquals(3.0, sut.bottleneck(g, List.of(0, 1, 2, 3)).getAsDouble());
	}

	@Test
	void invalidPathIsEmpty() {
		WeightedGraph g = new WeightedGraph(3);
		g.addUndirectedEdge(0, 1, 5);
		assertFalse(sut.bottleneck(g, List.of(0, 2)).isPresent());
	}

	@Test
	void usesWidestParallelEdge() {
		WeightedGraph g = new WeightedGraph(2);
		g.addUndirectedEdge(0, 1, 5);
		g.addUndirectedEdge(0, 1, 9);
		assertEquals(9.0, sut.bottleneck(g, List.of(0, 1)).getAsDouble());
	}
}
