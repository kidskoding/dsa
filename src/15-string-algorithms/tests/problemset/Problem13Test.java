import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import org.junit.jupiter.api.Test;

class Problem13Test {

	private final Problem13 sut = new Problem13();

	@Test
	void palindrome_ties() {
		assertTrue(Set.of("bab", "aba").contains(sut.longestPalindrome("babad")));
	}

	@Test
	void palindrome_even() {
		assertTrue(Set.of("bb").contains(sut.longestPalindrome("cbbd")));
	}

	@Test
	void palindrome_single() {
		assertTrue(Set.of("a").contains(sut.longestPalindrome("a")));
	}
}
