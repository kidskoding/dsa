import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem15Test {

	private final Problem15 p = new Problem15();

	@Test
	void typical() {
		assertEquals(3, p.longestCommonSubsequence("abcde", "ace"));
	}

	@Test
	void identical() {
		assertEquals(3, p.longestCommonSubsequence("abc", "abc"));
	}

	@Test
	void disjoint() {
		assertEquals(0, p.longestCommonSubsequence("abc", "def"));
	}
}
