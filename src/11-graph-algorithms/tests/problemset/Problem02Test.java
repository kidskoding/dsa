import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Set;

import org.junit.jupiter.api.Test;

class Problem02Test {

	private final Problem02 sut = new Problem02();

	@Test
	void honorsBudget() {
		WeightedGraph g = new WeightedGraph(4);
		g.addUndirectedEdge(0, 1, 2);
		g.addUndirectedEdge(1, 2, 2);
		g.addUndirectedEdge(2, 3, 2);
		assertEquals(Set.of(0, 1, 2), sut.reachableWithin(g, 0, 4));
	}

	@Test
	void zeroBudgetIsSourceOnly() {
		WeightedGraph g = new WeightedGraph(2);
		g.addUndirectedEdge(0, 1, 5);
		assertEquals(Set.of(0), sut.reachableWithin(g, 0, 0));
	}

	@Test
	void largeBudgetReachesAll() {
		WeightedGraph g = new WeightedGraph(3);
		g.addUndirectedEdge(0, 1, 1);
		g.addUndirectedEdge(0, 2, 1);
		assertEquals(Set.of(0, 1, 2), sut.reachableWithin(g, 0, 10));
	}
}
