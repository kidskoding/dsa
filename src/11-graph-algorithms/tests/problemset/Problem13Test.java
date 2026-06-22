import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem13Test {

	@Test
	void secondBestOfTriangle() {
		// MST = edges {1,2} = 1+2 = 3. Second-best swaps the weight-3 edge for the dropped
		// weight-2 edge on its cycle, giving 1+3 = 4.
		WeightedGraph g = new WeightedGraph(3);
		g.addUndirectedEdge(0, 1, 1.0);
		g.addUndirectedEdge(1, 2, 2.0);
		g.addUndirectedEdge(0, 2, 3.0);
		assertEquals(4.0, new Problem13().secondBestSpanningTreeWeight(g));
	}
}
