import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem7Test {

	private final Problem7 sut = new Problem7();

	@Test
	void validPath_connected_true() {
		assertTrue(sut.validPath(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, 0, 2));
	}

	@Test
	void validPath_separateComponents_false() {
		assertFalse(
			sut.validPath(6, new int[][] {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5));
	}

	@Test
	void validPath_selfToSelf_true() {
		assertTrue(sut.validPath(1, new int[][] {}, 0, 0));
	}
}
