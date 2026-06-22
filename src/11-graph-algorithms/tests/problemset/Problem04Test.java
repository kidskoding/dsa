import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem04Test {

	private final Problem04 sut = new Problem04();

	@Test
	void twoComponents() {
		WeightedGraph g = new WeightedGraph(5);
		g.addUndirectedEdge(0, 1, 1);
		g.addUndirectedEdge(1, 2, 1);
		g.addUndirectedEdge(3, 4, 1);
		assertEquals(2, sut.countComponents(g));
	}

	@Test
	void noEdgesAllIsolated() {
		WeightedGraph g = new WeightedGraph(3);
		assertEquals(3, sut.countComponents(g));
	}

	@Test
	void singlePathOneComponent() {
		WeightedGraph g = new WeightedGraph(4);
		g.addUndirectedEdge(0, 1, 1);
		g.addUndirectedEdge(1, 2, 1);
		g.addUndirectedEdge(2, 3, 1);
		assertEquals(1, sut.countComponents(g));
	}
}
