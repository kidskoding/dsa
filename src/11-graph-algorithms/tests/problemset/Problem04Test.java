import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void countsTwoComponents() {
		WeightedGraph g = new WeightedGraph(4);
		g.addUndirectedEdge(0, 1, 1.0);
		g.addUndirectedEdge(2, 3, 1.0);
		assertEquals(2, new Problem04().countComponents(g));
	}

	@Test
	void singleVertexIsOneComponent() {
		assertEquals(1, new Problem04().countComponents(new WeightedGraph(1)));
	}

	@Test
	void connectedGraphIsOneComponent() {
		WeightedGraph g = new WeightedGraph(3);
		g.addUndirectedEdge(0, 1, 1.0);
		g.addUndirectedEdge(1, 2, 1.0);
		assertEquals(1, new Problem04().countComponents(g));
	}
}
