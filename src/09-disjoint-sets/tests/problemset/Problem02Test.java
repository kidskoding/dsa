import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Problem02Test {

	@Test
	void hasCycle_triangleIsCyclic() {
		var sut = new Problem02();
		assertTrue(sut.hasCycle(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}));
	}

	@Test
	void hasCycle_treeIsAcyclic() {
		var sut = new Problem02();
		assertFalse(sut.hasCycle(4, new int[][] {{0, 1}, {1, 2}, {2, 3}}));
	}
}
