import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	private final Problem16 p = new Problem16();

	@Test
	void typical() {
		assertEquals(4, p.longestPalindromeSubseq("bbbab"));
	}

	@Test
	void innerPair() {
		assertEquals(2, p.longestPalindromeSubseq("cbbd"));
	}

	@Test
	void single() {
		assertEquals(1, p.longestPalindromeSubseq("a"));
	}
}
