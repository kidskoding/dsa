import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem21Test {

	private final Problem21 sut = new Problem21();

	@Test
	void triangle() {
		WeightedGraph g = new WeightedGraph(3);
		g.addUndirectedEdge(0, 1, 1);
		g.addUndirectedEdge(1, 2, 2);
		g.addUndirectedEdge(0, 2, 3);
		assertEquals(4.0, sut.secondBestSpanningTreeWeight(g), 1e-9);
	}

	@Test
	void allEqualEdges() {
		WeightedGraph g = new WeightedGraph(3);
		g.addUndirectedEdge(0, 1, 1);
		g.addUndirectedEdge(1, 2, 1);
		g.addUndirectedEdge(0, 2, 1);
		assertEquals(2.0, sut.secondBestSpanningTreeWeight(g), 1e-9);
	}

	@Test
	void squareWithChord() {
		WeightedGraph g = new WeightedGraph(4);
		g.addUndirectedEdge(0, 1, 1);
		g.addUndirectedEdge(1, 2, 2);
		g.addUndirectedEdge(2, 3, 3);
		g.addUndirectedEdge(0, 3, 4);
		assertEquals(7.0, sut.secondBestSpanningTreeWeight(g), 1e-9);
	}
}
