import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem4Test {

	private final Problem4 sut = new Problem4();

	@Test
	void cycle_triangle() {
		assertTrue(sut.hasCycle(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}));
	}

	@Test
	void cycle_path() {
		assertFalse(sut.hasCycle(4, new int[][] {{0, 1}, {1, 2}, {2, 3}}));
	}

	@Test
	void cycle_inOneComponent() {
		assertTrue(sut.hasCycle(5, new int[][] {{0, 1}, {2, 3}, {3, 4}, {4, 2}}));
	}
}
