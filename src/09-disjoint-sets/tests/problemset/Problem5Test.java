import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem5Test {

	private final Problem5 sut = new Problem5();

	@Test
	void allConnected_chain_true() {
		assertTrue(sut.allConnected(3, new int[][] {{0, 1}, {1, 2}}));
	}

	@Test
	void allConnected_twoSets_false() {
		assertFalse(sut.allConnected(4, new int[][] {{0, 1}, {2, 3}}));
	}

	@Test
	void allConnected_singleton_true() {
		assertTrue(sut.allConnected(1, new int[][] {}));
	}
}
