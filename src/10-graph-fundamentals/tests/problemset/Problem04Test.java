import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem04Test {

	@Test
	void hasCycle_triangle_isTrue() {
		var sut = new Problem04();
		assertTrue(sut.hasCycle(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}));
	}

	@Test
	void hasCycle_tree_isFalse() {
		var sut = new Problem04();
		assertFalse(sut.hasCycle(3, new int[][] {{0, 1}, {1, 2}}));
	}
}
