import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	@Test
	void vertexCapacityLimitsFlow() {
		WeightedGraph g = new WeightedGraph(3);
		g.addDirectedEdge(0, 1, 10.0);
		g.addDirectedEdge(1, 2, 10.0);
		// Middle vertex capped at 4 throttles the otherwise-10 flow.
		double[] vertexCaps = {10.0, 4.0, 10.0};
		assertEquals(4.0, new Problem16().maxFlow(g, vertexCaps, 0, 2));
	}
}
