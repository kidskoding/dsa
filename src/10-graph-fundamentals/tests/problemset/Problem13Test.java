import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem13Test {

	private final Problem13 sut = new Problem13();

	@Test
	void path_triangle() {
		assertTrue(sut.validPath(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, 0, 2));
	}

	@Test
	void path_separateComponents() {
		int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
		assertFalse(sut.validPath(6, edges, 0, 5));
	}

	@Test
	void path_selfReach() {
		assertTrue(sut.validPath(1, new int[][] {}, 0, 0));
	}
}
