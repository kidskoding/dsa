import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem17Test {

	@Test
	void hasHamiltonianPath_path_isTrue() {
		var sut = new Problem17();
		assertTrue(sut.hasHamiltonianPath(3, new int[][] {{0, 1}, {1, 2}}));
	}

	@Test
	void hasHamiltonianPath_disconnected_isFalse() {
		var sut = new Problem17();
		assertFalse(sut.hasHamiltonianPath(3, new int[][] {{0, 1}}));
	}
}
