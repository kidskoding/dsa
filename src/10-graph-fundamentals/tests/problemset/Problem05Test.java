import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void topologicalOrder_chain_respectsEdges() {
		var sut = new Problem05();
		assertEquals(List.of(0, 1, 2), sut.topologicalOrder(3, new int[][] {{0, 1}, {1, 2}}));
	}

	@Test
	void topologicalOrder_cyclic_isEmpty() {
		var sut = new Problem05();
		assertTrue(sut.topologicalOrder(2, new int[][] {{0, 1}, {1, 0}}).isEmpty());
	}
}
