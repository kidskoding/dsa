import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem2Test {

	private final Problem2 sut = new Problem2();

	@Test
	void hasCycle_triangle_true() {
		assertTrue(sut.hasCycle(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}));
	}

	@Test
	void hasCycle_path_false() {
		assertFalse(sut.hasCycle(4, new int[][] {{0, 1}, {1, 2}, {2, 3}}));
	}

	@Test
	void hasCycle_noEdges_false() {
		assertFalse(sut.hasCycle(2, new int[][] {}));
	}
}
