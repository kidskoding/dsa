import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	private final Problem16 sut = new Problem16();

	@Test
	void smallest_twoGroups() {
		assertEquals("bacd", sut.smallestStringWithSwaps("dcab", new int[][] {{0, 3}, {1, 2}}));
	}

	@Test
	void smallest_allConnected() {
		assertEquals("abcd", sut.smallestStringWithSwaps("dcab", new int[][] {{0, 3}, {1, 2}, {0, 2}}));
	}

	@Test
	void smallest_chain() {
		assertEquals("abc", sut.smallestStringWithSwaps("cba", new int[][] {{0, 1}, {1, 2}}));
	}
}
