import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem16Test {

	private final Problem16 sut = new Problem16();

	@Test
	void finish_singlePrereq() {
		assertTrue(sut.canFinish(2, new int[][] {{1, 0}}));
	}

	@Test
	void finish_cycle() {
		assertFalse(sut.canFinish(2, new int[][] {{1, 0}, {0, 1}}));
	}

	@Test
	void finish_chain() {
		assertTrue(sut.canFinish(3, new int[][] {{1, 0}, {2, 1}}));
	}
}
