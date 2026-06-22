import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem14Test {

	private final Problem14 sut = new Problem14();

	@Test
	void bipartite_evenCycle() {
		assertTrue(sut.isBipartite(new int[][] {{1, 3}, {0, 2}, {1, 3}, {0, 2}}));
	}

	@Test
	void bipartite_triangle() {
		assertFalse(sut.isBipartite(new int[][] {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}}));
	}

	@Test
	void bipartite_loneEdge() {
		assertTrue(sut.isBipartite(new int[][] {{}, {3}, {}, {1}}));
	}
}
