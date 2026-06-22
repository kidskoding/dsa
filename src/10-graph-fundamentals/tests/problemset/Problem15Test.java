import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem15Test {

	private final Problem15 sut = new Problem15();

	@Test
	void split_evenCycle() {
		assertTrue(sut.canSplit(4, new int[][] {{0, 1}, {1, 2}, {2, 3}, {3, 0}}));
	}

	@Test
	void split_triangle() {
		assertFalse(sut.canSplit(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}));
	}

	@Test
	void split_disconnected() {
		assertTrue(sut.canSplit(5, new int[][] {{0, 1}, {2, 3}}));
	}
}
