import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem05Test {

	@Test
	void allConnected_chainUnitesEveryone() {
		var sut = new Problem05();
		assertTrue(sut.allConnected(4, new int[][] {{0, 1}, {1, 2}, {2, 3}}));
	}

	@Test
	void allConnected_leftoverSingletonFails() {
		var sut = new Problem05();
		assertFalse(sut.allConnected(4, new int[][] {{0, 1}, {1, 2}}));
	}
}
