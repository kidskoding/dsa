import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem17Test {

	private final Problem17 sut = new Problem17();

	@Test
	void deadlock_cycle() {
		assertTrue(sut.hasDeadlock(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}));
	}

	@Test
	void deadlock_diamondAcyclic() {
		assertFalse(sut.hasDeadlock(4, new int[][] {{0, 1}, {0, 2}, {1, 3}, {2, 3}}));
	}

	@Test
	void deadlock_noDeps() {
		assertFalse(sut.hasDeadlock(2, new int[][] {}));
	}
}
