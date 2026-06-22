import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12Test {

	private final Problem12 p = new Problem12();

	@Test
	void classicInstance() {
		assertEquals(4, p.longestPalindromicSubsequence("bbbab"));
	}

	@Test
	void noRepeats() {
		assertEquals(1, p.longestPalindromicSubsequence("abcde"));
	}

	@Test
	void fullPalindrome() {
		assertEquals(7, p.longestPalindromicSubsequence("racecar"));
	}

	@Test
	void emptyString() {
		assertEquals(0, p.longestPalindromicSubsequence(""));
	}
}
