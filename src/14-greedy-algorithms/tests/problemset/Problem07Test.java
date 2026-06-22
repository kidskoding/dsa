import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem07Test {

	private final Problem07 sut = new Problem07();

	@Test
	void canJump_reachable() {
		assertTrue(sut.canJump(new int[] {2, 3, 1, 1, 4}));
	}

	@Test
	void canJump_stuckAtZero() {
		assertFalse(sut.canJump(new int[] {3, 2, 1, 0, 4}));
	}

	@Test
	void canJump_singleElement() {
		assertTrue(sut.canJump(new int[] {0}));
	}
}
