import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem16Test {

	@Test
	void longest_abc() {
		var sut = new Problem16();
		assertEquals(3, sut.lengthOfLongestSubstring("abcabcbb"));
	}

	@Test
	void longest_allSame() {
		var sut = new Problem16();
		assertEquals(1, sut.lengthOfLongestSubstring("bbbbb"));
	}

	@Test
	void longest_pwwkew() {
		var sut = new Problem16();
		assertEquals(3, sut.lengthOfLongestSubstring("pwwkew"));
	}
}
