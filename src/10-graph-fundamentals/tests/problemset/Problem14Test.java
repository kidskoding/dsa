import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem14Test {

	@Test
	void condense_cycleMembers_shareComponentId() {
		var sut = new Problem14();
		var c = sut.condense(2, new int[][] {{0, 1}, {1, 0}});
		assertEquals(c.componentId[0], c.componentId[1]);
	}

	@Test
	void condense_singleScc_hasNoInterComponentEdges() {
		var sut = new Problem14();
		var c = sut.condense(3, new int[][] {{0, 1}, {1, 2}, {2, 0}});
		assertTrue(c.edges.isEmpty());
	}
}
