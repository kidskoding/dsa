import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	@Test
	void longestPaths_choosesLongerRoute() {
		var sut = new Problem15();
		// 0->1 (1), 1->2 (1), 0->2 (1): longest 0->2 goes through 1 for length 2.
		int[] d = sut.longestPaths(3, new int[][] {{0, 1, 1}, {1, 2, 1}, {0, 2, 1}}, 0);
		assertEquals(2, d[2]);
	}

	@Test
	void longestPaths_unreachable_isMinValue() {
		var sut = new Problem15();
		int[] d = sut.longestPaths(2, new int[][] {}, 0);
		assertEquals(Integer.MIN_VALUE, d[1]);
	}
}
