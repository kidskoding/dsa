import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem06Test {

	@Test
	void bottleneckIsMinimumCapacity() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 5.0);
		g.addDirectedEdge(1, 2, 2.0);
		var result = new Problem06().bottleneck(g, List.of(0, 1, 2));
		assertTrue(result.isPresent());
		assertEquals(2.0, result.getAsDouble());
	}

	@Test
	void brokenPathReportsEmpty() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 5.0);
		assertTrue(new Problem06().bottleneck(g, List.of(0, 1, 2)).isEmpty());
	}
}
