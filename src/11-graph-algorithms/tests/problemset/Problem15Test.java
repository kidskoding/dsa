import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	@Test
	void minCostOfMaxFlow() {
		WeightedGraph cap = new WeightedGraph(3);
		cap.addDirectedEdge(0, 1, 2.0);
		cap.addDirectedEdge(1, 2, 2.0);
		WeightedGraph cost = new WeightedGraph(3);
		cost.addDirectedEdge(0, 1, 1.0);
		cost.addDirectedEdge(1, 2, 3.0);
		// Max flow = 2 units along 0->1->2; per-unit cost 1+3 = 4, total 8.
		assertEquals(8.0, new Problem15().minCostMaxFlow(cap, cost, 0, 2));
	}
}
